package twitter.lib

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import twitter.config._

object Login {

  val httpProtocol = Config.httpProtocol
  val headers = Config.headers
    val feeder = csv("creadentials.csv").circular//queue :- will move step by step
    //circular :- it iterate over whatever number of rows available.

    val loginScn = scenario("Twitter login")
    .exec(http("Login")
      .get("/login"))
    .feed(feeder)
    .pause(1)
    .exec(http("authorization")
      .post("/sessions")
      .headers(headers)
      .formParam("""session[username_or_email]""", "${email}")
      .formParam("""session[password]""", "${password}")
      .check(status.is(200))
      .check(
        regex("""${email}""")
        .saveAs("username_or_email")))
    .exec(session => {
      // print the Session for debugging, don't do that on real Simulations
      println(" Delphi Session is >>> " + session)
      // print the Session values
      println(" Session email is >>> " + session("email").as[String])
      session})
    .pause(1)
  }