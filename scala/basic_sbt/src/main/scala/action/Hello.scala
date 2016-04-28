package action

class Hello{
  import Hello._
  def greet(name: String) = greeting(name)
}

object Hello {
    def greeting(name: String) = {
        s"Hello $name"
    }
}
