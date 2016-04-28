package action

import org.scalatest.{Matchers, WordSpec}

class HelloSpec extends WordSpec with Matchers {
    "The Hello companon object can have greeting called" should {
        "return 'Hello user' when greeting is called" in {
            val hello = new Hello()
            Hello.greeting("Bob") shouldEqual "Hello Bob"
        }
    }

    "Another Hello object can have greeting called" should {
        "return 'Hello user' when greeting is called" in {
            val h = new Hello()
            h.greet("Bob") shouldEqual "Hello Bob"
        }
    }
}
