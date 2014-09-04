package twitter.config
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.collection.mutable.{ HashMap, MultiMap, Set }

object Config {
  var baseURL:String = "https://twitter.com"
  var totalUsers:Int = 1
  var rampOverSeconds:Int = 1
  var repeatCount:Int = 0
  var meanResponseTime:Int = 2000
  var leastResponseTime:Int = 0
  var maxResponseTime:Int = 2000
  var successfulRequestsPercent:Int = 95
  val start_date:String = "2014-08-01"
  val end_date:String = "2014-08-15"
  val http_status_ok:Int = 200


  val headers = Map("Content-Type" -> """application/x-www-form-urlencoded""")

  val httpProtocol = http
  .baseURL(baseURL)
  .inferHtmlResources()
  .acceptHeader("""*/*""")
  .acceptEncodingHeader("""gzip,deflate,sdch""")
  .acceptLanguageHeader("""en-US,en;q=0.8""")
  .connection("""keep-alive""")
  .contentTypeHeader("""application/x-www-form-urlencoded; charset=UTF-8""")
  .userAgentHeader("""Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36""")
}
