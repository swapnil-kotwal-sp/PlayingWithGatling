package twitter

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import twitter.config._
import twitter.lib._

class TwitterLogin extends Simulation {

  /** Setup Users and ramp time **/
  val perfTestUsers = Config.totalUsers
  val perfTestSeconds = Config.rampOverSeconds
  val perfTestRepeat = Config.repeatCount
  val perfMeanResponseTime = Config.meanResponseTime
  val perfMaxResponseTime = Config.maxResponseTime
  val perfSuccessfulRequestsPercent = Config.successfulRequestsPercent
  val perfLeastResponseTime = Config.leastResponseTime

    /** Login in Delphi Scenario **/
    val loginScn = Login.loginScn

    setUp(
      loginScn.inject(rampUsers(perfTestUsers) over(perfTestSeconds seconds))
      ).protocols(Config.httpProtocol)
    .assertions(
      global.failedRequests.count.is(0),
      global.responseTime.mean.lessThan(perfMeanResponseTime),
      global.responseTime.max.between(perfLeastResponseTime, perfMaxResponseTime),
      global.successfulRequests.percent.greaterThan(perfSuccessfulRequestsPercent))
  }
