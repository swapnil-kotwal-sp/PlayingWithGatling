package twitter

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class TwitterLogin extends Simulation {

  val httpProtocol = http
    .baseURL("https://twitter.com")
    .inferHtmlResources()
    .acceptHeader("""*/*""")
    .acceptEncodingHeader("""gzip,deflate,sdch""")
    .acceptLanguageHeader("""en-US,en;q=0.8""")
    .connection("""keep-alive""")
    .contentTypeHeader("""application/x-www-form-urlencoded; charset=UTF-8""")
    .userAgentHeader("""Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36""")

    val headers_1 = Map(
        """Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8""",
        """Cache-Control""" -> """max-age=0""",
        """If-Modified-Since""" -> """Mon, 30 Jun 2014 17:54:01 GMT""",
        """If-None-Match""" -> """88b976754695c7998e0dd86e39039696""")
    val scn = scenario("Twitter login")
    .exec(http("Login")
        .get("/login"))
    .pause(1)
    .exec(http("authorization")
        .post("/sessions")
        .headers(headers_1)
        .formParam("""session[username_or_email]""", """xxxxxxx@gmail.com""")
        .formParam("""session[password]""", """xxxxx""")
        .check(status.is(200)))
    .pause(1)

   setUp(scn.inject(atOnceUsers(10))).protocols(httpProtocol)
}
