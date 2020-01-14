package example.micronaut

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

class WebServiceCallSimulation extends Simulation {

    val rampUpTimeSecs = 1
    val testTimeSecs = 1
    val noOfUsers = 100
    val minWaitMs = 1000 milliseconds
    val maxWaitMs = 3000 milliseconds

    val baseURL = "http://localhost:8080"
    val baseName = "hello"
    val requestName = baseName + "-request"
    val requestNameSlow = baseName + "-request-slow"
    val scenarioName = baseName + "-scenario"
    val scenarioNameSlow = baseName + "-scenario-slow"
    val URI = "/hello"
    val URIDos = "/helloslow"

    val httpProtocol = http
            .baseUrl(baseURL)
            .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // 6
            .doNotTrackHeader("1")
            .acceptLanguageHeader("en-US,en;q=0.5")
            .acceptEncodingHeader("gzip, deflate")
            .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")

    val scn = scenario(scenarioName)
      .during(testTimeSecs) {
          exec(
              http(requestName)
                .get(URI)
                //.body(RawFileBody("protobuf-for-gatling"))
                .header("Content-Type", "application/json")
                .check(status.is(200))
          ).pause(minWaitMs, maxWaitMs)
      }
    setUp(scn.inject(atOnceUsers(noOfUsers))).protocols(httpProtocol)
//
//    val scnDos = scenario(scenarioNameSlow)
//      .during(testTimeSecs) {
//          exec(
//                http(requestNameSlow)
//                .get(URIDos)
//                //                        .body(RawFileBody("protobuf-for-gatling"))
//                .header("Content-Type", "application/json")
//                .check(status.is(200))
//          ).pause(minWaitMs, maxWaitMs)
//      }
//
//    setUp(scnDos.inject(atOnceUsers(noOfUsers)), scn.inject(atOnceUsers(noOfUsers))).protocols(httpProtocol)

}
