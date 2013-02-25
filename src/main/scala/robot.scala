package pro.savant.circa
package blank

class Robot(val name: String) {

  def prefix = "[" + name + "]: "

  protected def say(text: String) {
    println(prefix + text)
  }

  def introduce() {
    say("Hi, my name is " + name)
  }

  def greet(another: Robot) {
    say("Hi, " + another.name + ", how are you?")
    another.reply(this)
  }

  protected def reply(another: Robot) {
    say("Hello, " + another.name + "! I'm fine, thank you.")
  }

}