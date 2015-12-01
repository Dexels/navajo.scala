package com.dexels.navajo.scala.test

import scala.concurrent.duration._
import com.dexels.navajo.scala.document.NavajoFactory
import com.dexels.navajo.scala.StreamingScalaScript
import com.dexels.navajo.script.api.Access
import com.dexels.navajo.scala.document.NavajoMessage
import akka.pattern.{ ask, pipe }
import akka.util.Timeout
import com.dexels.navajo.scala.document.streaming.Event
import com.dexels.navajo.scala.document.streaming.Stop
import scala.concurrent._
import ExecutionContext.Implicits.global
import com.dexels.navajo.scala.document.streaming.SubmitMessage

class Stream extends StreamingScalaScript {

    def updateTest1(message: NavajoMessage) : NavajoMessage = {
        println("updating property")
        message.addProperty("TestProp2").value("DEF");
        message
    }

    override def run() {

        val scriptCallIn = createChannel("scriptCall1")
        val scriptCallOut = createChannel("scriptCall2")

        callScript("vla/include/ClubMessageInclude", scriptCallIn, scriptCallOut)
        //val x = input.ask(RequestMessage("test2"))

        forwardMessage("test1", from=input, to=scriptCallIn, updateTest1)
        // forwardMessage("test2", from=input, to=scriptCallIn, updateTest1)
        //forwardMessage("test1", from=input, to=scriptCallIn)

    }
}

object Stream {
    def main(args: Array[String]) {
        val f = new Stream
        val a = new Access;
        f.execute(a)

        Future {
            val m1 = NavajoFactory.create().addMessage("test1")
            m1.addProperty("TestProp1").value("ABC")
            Thread.sleep(2000)
            f.input ! SubmitMessage(m1);
            f.input ! Stop()
        }

    }

}

