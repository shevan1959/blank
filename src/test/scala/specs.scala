package pro.savant.circa
package blank

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FreeSpec
import org.scalatest.matchers.MustMatchers
import java.io.ByteArrayOutputStream

@RunWith(classOf[JUnitRunner])
class RobotTest
    extends FreeSpec
    with MustMatchers {

  val gizmo = new Robot("Gizmo")

  "Each robot" - {
    "has name" in {
      gizmo.name must equal ("Gizmo")
      gizmo.name must not equal ("Colibri")
    }
    "can introduce himself" in {
      val out = new ByteArrayOutputStream()
      try {
        scala.Console.withOut(out) {
          gizmo.introduce()
        }
        val greeting = new String(out.toByteArray, "UTF-8").trim
        greeting must equal ("[Gizmo]: Hi, my name is Gizmo")
      } finally {
        out.close()
      }
    }
  }

}