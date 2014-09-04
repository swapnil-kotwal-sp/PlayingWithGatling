package twitter

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class TwitterSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("https://twitter.com")
		.inferHtmlResources()
		.acceptHeader("""image/webp,*/*;q=0.8""")
		.acceptEncodingHeader("""gzip,deflate""")
		.acceptLanguageHeader("""en-US,en;q=0.8""")
		.connection("""keep-alive""")
		.contentTypeHeader("""application/x-www-form-urlencoded; charset=UTF-8""")
		.userAgentHeader("""Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_0 = Map(
		"""accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """max-age=0""",
		"""cookie""" -> """pid="v3:1409647925169848379401026"; guest_id=v1%3A140964792488868323; goth=1; _twitter_sess=BAh7CSIKZmxhc2hJQzonQWN0aW9uQ29udHJvbGxlcjo6Rmxhc2g6OkZsYXNo%250ASGFzaHsABjoKQHVzZWR7ADoPY3JlYXRlZF9hdGwrCKe%252FkzVIAToMY3NyZl9p%250AZCIlNTIxYzlkZGEzMmVkN2JkYjQ5ZTFjZGEzZDhkY2I5Y2Y6B2lkIiU5Nzdj%250AYWE1MmFhZmYyOGNhYTE4ZTViZWNlMjNiOThmMg%253D%253D--caeae7e9e2027063cbe077647994e8769aba83de; _ga=GA1.2.763156425.1409648156; _gat=1""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_1 = Map(
		"""accept""" -> """application/json, text/javascript, */*; q=0.01""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""content-length""" -> """1687""",
		"""content-type""" -> """application/x-www-form-urlencoded; charset=UTF-8""",
		"""cookie""" -> """pid="v3:1409647925169848379401026"; guest_id=v1%3A140964792488868323; goth=1; _ga=GA1.2.763156425.1409648156; _gat=1; _twitter_sess=BAh7CSIKZmxhc2hJQzonQWN0aW9uQ29udHJvbGxlcjo6Rmxhc2g6OkZsYXNo%250ASGFzaHsABjoKQHVzZWR7ADoPY3JlYXRlZF9hdGwrCKe%252FkzVIAToMY3NyZl9p%250AZCIlNTIxYzlkZGEzMmVkN2JkYjQ5ZTFjZGEzZDhkY2I5Y2Y6B2lkIiU5Nzdj%250AYWE1MmFhZmYyOGNhYTE4ZTViZWNlMjNiOThmMg%253D%253D--caeae7e9e2027063cbe077647994e8769aba83de""",
		"""origin""" -> """https://twitter.com""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""",
		"""x-requested-with""" -> """XMLHttpRequest""",
		"""x-twitter-polling""" -> """true""")

	val headers_2 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Thu, 28 Aug 2014 19:10:47 GMT""",
		"""If-None-Match""" -> """5YiWTPiWPOXWzsNaH3748g==""")

	val headers_3 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Thu, 28 Aug 2014 19:10:47 GMT""",
		"""If-None-Match""" -> """J4rMQPP6uFY/QxJexHQmhg==""")

	val headers_4 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Thu, 28 Aug 2014 19:10:47 GMT""",
		"""If-None-Match""" -> """ezd6FMFDWNpwVlJH2yF8JA==""")

	val headers_5 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Thu, 28 Aug 2014 19:10:47 GMT""",
		"""If-None-Match""" -> """bi36hBP2e03gkhIZeLTnTg==""")

	val headers_6 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Thu, 17 Apr 2014 17:16:08 GMT""",
		"""If-None-Match""" -> """UPfTi6/sFEEKa2qxPtv8VQ==""")

	val headers_7 = Map(
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Thu, 28 Aug 2014 19:10:48 GMT""",
		"""If-None-Match""" -> """Y4cYiF6yDXU1XdAUNZ9zoA==+gzip""")

	val headers_8 = Map(
		"""Accept""" -> """*/*""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Thu, 28 Aug 2014 19:11:13 GMT""",
		"""If-None-Match""" -> """nsTAjglc3pCEJlEYDgZ+CA==""")

	val headers_9 = Map(
		"""Accept""" -> """*/*""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Thu, 28 Aug 2014 19:10:46 GMT""",
		"""If-None-Match""" -> """cS77WdNEhCUNtIz/bifg6A==""",
		"""Origin""" -> """https://twitter.com""")

	val headers_10 = Map(
		"""Accept""" -> """*/*""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Wed, 27 Aug 2014 19:02:07 GMT""",
		"""If-None-Match""" -> """zY6nmmG1tyxbqmEullp0yw==""")

	val headers_11 = Map(
		"""accept""" -> """*/*""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """max-age=0""",
		"""if-modified-since""" -> """Wed, 20 Aug 2014 18:58:27 GMT""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_12 = Map(
		"""accept""" -> """image/webp,*/*;q=0.8""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """max-age=0""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_13 = Map("""X-DevTools-Emulate-Network-Conditions-Client-Id""" -> """8AB2AB63-A348-4825-B837-11767F86EC0E""")

	val headers_25 = Map(
		"""accept""" -> """image/webp,*/*;q=0.8""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_26 = Map(
		"""Content-Type""" -> """application/x-www-form-urlencoded""",
		"""accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """max-age=0""",
		"""content-length""" -> """204""",
		"""content-type""" -> """application/x-www-form-urlencoded""",
		"""cookie""" -> """pid="v3:1409647925169848379401026"; guest_id=v1%3A140964792488868323; goth=1; _gat=1; _twitter_sess=BAh7CSIKZmxhc2hJQzonQWN0aW9uQ29udHJvbGxlcjo6Rmxhc2g6OkZsYXNo%250ASGFzaHsABjoKQHVzZWR7ADoPY3JlYXRlZF9hdGwrCKe%252FkzVIAToMY3NyZl9p%250AZCIlNTIxYzlkZGEzMmVkN2JkYjQ5ZTFjZGEzZDhkY2I5Y2Y6B2lkIiU5Nzdj%250AYWE1MmFhZmYyOGNhYTE4ZTViZWNlMjNiOThmMg%253D%253D--caeae7e9e2027063cbe077647994e8769aba83de; _ga=GA1.2.763156425.1409648156""",
		"""origin""" -> """https://twitter.com""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_29 = Map(
		"""Cache-Control""" -> """no-cache""",
		"""Pragma""" -> """no-cache""")

	val headers_42 = Map(
		"""Accept""" -> """*/*""",
		"""Cache-Control""" -> """no-cache""",
		"""Pragma""" -> """no-cache""")

	val headers_47 = Map(
		"""accept""" -> """application/json, text/javascript, */*; q=0.01""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """no-cache""",
		"""cookie""" -> """pid="v3:1409647925169848379401026"; guest_id=v1%3A140964792488868323; goth=1; _gat=1; _ga=GA1.2.763156425.1409648156; twid="u=101982780"; remember_checked_on=1; auth_token=48687fd8029e2a4670e5297d2d85348efcf5ec37; _twitter_sess=BAh7CiIKZmxhc2hJQzonQWN0aW9uQ29udHJvbGxlcjo6Rmxhc2g6OkZsYXNo%250ASGFzaHsABjoKQHVzZWR7ADoPY3JlYXRlZF9hdGwrCKe%252FkzVIAToMY3NyZl9p%250AZCIlNTIxYzlkZGEzMmVkN2JkYjQ5ZTFjZGEzZDhkY2I5Y2Y6B2lkIiU5Nzdj%250AYWE1MmFhZmYyOGNhYTE4ZTViZWNlMjNiOThmMjoJdXNlcmkEPCIUBg%253D%253D--bab09ce963f69ab20a220a8ad814992ba3d0b1a5; lang=en; webn=101982780""",
		"""pragma""" -> """no-cache""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""",
		"""x-phx""" -> """true""",
		"""x-requested-with""" -> """XMLHttpRequest""")

	val headers_49 = Map(
		"""accept""" -> """application/json, text/javascript, */*; q=0.01""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """no-cache""",
		"""cookie""" -> """pid="v3:1409647925169848379401026"; guest_id=v1%3A140964792488868323; goth=1; _gat=1; _ga=GA1.2.763156425.1409648156; twid="u=101982780"; remember_checked_on=1; auth_token=48687fd8029e2a4670e5297d2d85348efcf5ec37; _twitter_sess=BAh7CiIKZmxhc2hJQzonQWN0aW9uQ29udHJvbGxlcjo6Rmxhc2g6OkZsYXNo%250ASGFzaHsABjoKQHVzZWR7ADoPY3JlYXRlZF9hdGwrCKe%252FkzVIAToMY3NyZl9p%250AZCIlNTIxYzlkZGEzMmVkN2JkYjQ5ZTFjZGEzZDhkY2I5Y2Y6B2lkIiU5Nzdj%250AYWE1MmFhZmYyOGNhYTE4ZTViZWNlMjNiOThmMjoJdXNlcmkEPCIUBg%253D%253D--bab09ce963f69ab20a220a8ad814992ba3d0b1a5; lang=en; webn=101982780""",
		"""pragma""" -> """no-cache""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""",
		"""x-requested-with""" -> """XMLHttpRequest""")

	val headers_50 = Map(
		"""accept""" -> """*/*""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """no-cache""",
		"""pragma""" -> """no-cache""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_56 = Map(
		"""accept""" -> """image/webp,*/*;q=0.8""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """no-cache""",
		"""pragma""" -> """no-cache""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_60 = Map(
		"""accept""" -> """application/json, text/javascript, */*; q=0.01""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cookie""" -> """pid="v3:1409647925169848379401026"; guest_id=v1%3A140964792488868323; goth=1; _gat=1; twid="u=101982780"; remember_checked_on=1; auth_token=48687fd8029e2a4670e5297d2d85348efcf5ec37; lang=en; webn=101982780; _ga=GA1.2.763156425.1409648156; _twitter_sess=BAh7CiIKZmxhc2hJQzonQWN0aW9uQ29udHJvbGxlcjo6Rmxhc2g6OkZsYXNo%250ASGFzaHsABjoKQHVzZWR7ADoPY3JlYXRlZF9hdGwrCKe%252FkzVIAToMY3NyZl9p%250AZCIlNTIxYzlkZGEzMmVkN2JkYjQ5ZTFjZGEzZDhkY2I5Y2Y6B2lkIiU5Nzdj%250AYWE1MmFhZmYyOGNhYTE4ZTViZWNlMjNiOThmMjoJdXNlcmkEPCIUBg%253D%253D--bab09ce963f69ab20a220a8ad814992ba3d0b1a5""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""",
		"""x-phx""" -> """true""",
		"""x-requested-with""" -> """XMLHttpRequest""")

	val headers_61 = Map(
		"""accept""" -> """application/json, text/javascript, */*; q=0.01""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cookie""" -> """pid="v3:1409647925169848379401026"; guest_id=v1%3A140964792488868323; goth=1; _gat=1; twid="u=101982780"; remember_checked_on=1; auth_token=48687fd8029e2a4670e5297d2d85348efcf5ec37; lang=en; webn=101982780; _ga=GA1.2.763156425.1409648156; _twitter_sess=BAh7CiIKZmxhc2hJQzonQWN0aW9uQ29udHJvbGxlcjo6Rmxhc2g6OkZsYXNo%250ASGFzaHsABjoKQHVzZWR7ADoPY3JlYXRlZF9hdGwrCKe%252FkzVIAToMY3NyZl9p%250AZCIlNTIxYzlkZGEzMmVkN2JkYjQ5ZTFjZGEzZDhkY2I5Y2Y6B2lkIiU5Nzdj%250AYWE1MmFhZmYyOGNhYTE4ZTViZWNlMjNiOThmMjoJdXNlcmkEPCIUBg%253D%253D--bab09ce963f69ab20a220a8ad814992ba3d0b1a5""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""",
		"""x-requested-with""" -> """XMLHttpRequest""",
		"""x-twitter-polling""" -> """true""")

	val headers_63 = Map(
		"""accept""" -> """application/json, text/javascript, */*; q=0.01""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cookie""" -> """pid="v3:1409647925169848379401026"; guest_id=v1%3A140964792488868323; goth=1; _gat=1; twid="u=101982780"; remember_checked_on=1; auth_token=48687fd8029e2a4670e5297d2d85348efcf5ec37; lang=en; webn=101982780; _ga=GA1.2.763156425.1409648156; _twitter_sess=BAh7CiIKZmxhc2hJQzonQWN0aW9uQ29udHJvbGxlcjo6Rmxhc2g6OkZsYXNo%250ASGFzaHsABjoKQHVzZWR7ADoPY3JlYXRlZF9hdGwrCKe%252FkzVIAToMY3NyZl9p%250AZCIlNTIxYzlkZGEzMmVkN2JkYjQ5ZTFjZGEzZDhkY2I5Y2Y6B2lkIiU5Nzdj%250AYWE1MmFhZmYyOGNhYTE4ZTViZWNlMjNiOThmMjoJdXNlcmkEPCIUBg%253D%253D--bab09ce963f69ab20a220a8ad814992ba3d0b1a5""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""",
		"""x-requested-with""" -> """XMLHttpRequest""")

	val headers_100 = Map(
		"""accept""" -> """application/json, text/javascript, */*; q=0.01""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cookie""" -> """pid="v3:1409647925169848379401026"; guest_id=v1%3A140964792488868323; goth=1; _gat=1; twid="u=101982780"; remember_checked_on=1; auth_token=48687fd8029e2a4670e5297d2d85348efcf5ec37; lang=en; webn=101982780; _ga=GA1.2.763156425.1409648156; _twitter_sess=BAh7CiIKZmxhc2hJQzonQWN0aW9uQ29udHJvbGxlcjo6Rmxhc2g6OkZsYXNo%250ASGFzaHsABjoKQHVzZWR7ADoPY3JlYXRlZF9hdGwrCKe%252FkzVIAToMY3NyZl9p%250AZCIlNTIxYzlkZGEzMmVkN2JkYjQ5ZTFjZGEzZDhkY2I5Y2Y6B2lkIiU5Nzdj%250AYWE1MmFhZmYyOGNhYTE4ZTViZWNlMjNiOThmMjoJdXNlcmkEPCIUBg%253D%253D--bab09ce963f69ab20a220a8ad814992ba3d0b1a5""",
		"""if-modified-since""" -> """Tue, 02 Sep 2014 08:53:30 GMT""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""",
		"""x-requested-with""" -> """XMLHttpRequest""")

	val headers_119 = Map(
		"""accept""" -> """application/json, text/javascript, */*; q=0.01""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""content-length""" -> """9871""",
		"""content-type""" -> """application/x-www-form-urlencoded; charset=UTF-8""",
		"""cookie""" -> """pid="v3:1409647925169848379401026"; guest_id=v1%3A140964792488868323; goth=1; _gat=1; twid="u=101982780"; remember_checked_on=1; auth_token=48687fd8029e2a4670e5297d2d85348efcf5ec37; lang=en; webn=101982780; _ga=GA1.2.763156425.1409648156; _twitter_sess=BAh7CiIKZmxhc2hJQzonQWN0aW9uQ29udHJvbGxlcjo6Rmxhc2g6OkZsYXNo%250ASGFzaHsABjoKQHVzZWR7ADoPY3JlYXRlZF9hdGwrCKe%252FkzVIAToMY3NyZl9p%250AZCIlNTIxYzlkZGEzMmVkN2JkYjQ5ZTFjZGEzZDhkY2I5Y2Y6B2lkIiU5Nzdj%250AYWE1MmFhZmYyOGNhYTE4ZTViZWNlMjNiOThmMjoJdXNlcmkEPCIUBg%253D%253D--bab09ce963f69ab20a220a8ad814992ba3d0b1a5""",
		"""origin""" -> """https://twitter.com""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""",
		"""x-requested-with""" -> """XMLHttpRequest""",
		"""x-twitter-polling""" -> """true""")

	val headers_120 = Map(
		"""Content-Type""" -> """application/x-www-form-urlencoded""",
		"""accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """max-age=0""",
		"""content-length""" -> """90""",
		"""content-type""" -> """application/x-www-form-urlencoded""",
		"""cookie""" -> """pid="v3:1409647925169848379401026"; guest_id=v1%3A140964792488868323; goth=1; _gat=1; twid="u=101982780"; remember_checked_on=1; auth_token=48687fd8029e2a4670e5297d2d85348efcf5ec37; lang=en; webn=101982780; _ga=GA1.2.763156425.1409648156; _twitter_sess=BAh7CiIKZmxhc2hJQzonQWN0aW9uQ29udHJvbGxlcjo6Rmxhc2g6OkZsYXNo%250ASGFzaHsABjoKQHVzZWR7ADoPY3JlYXRlZF9hdGwrCKe%252FkzVIAToMY3NyZl9p%250AZCIlNTIxYzlkZGEzMmVkN2JkYjQ5ZTFjZGEzZDhkY2I5Y2Y6B2lkIiU5Nzdj%250AYWE1MmFhZmYyOGNhYTE4ZTViZWNlMjNiOThmMjoJdXNlcmkEPCIUBg%253D%253D--bab09ce963f69ab20a220a8ad814992ba3d0b1a5""",
		"""origin""" -> """https://twitter.com""",
		"""referer""" -> """https://twitter.com/""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_121 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""Cache-Control""" -> """no-cache""",
		"""Pragma""" -> """no-cache""")

	val headers_135 = Map(
		"""accept""" -> """*/*""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """no-cache""",
		"""cookie""" -> """guest_id=v1%3A140964792488868323; _gat=1; remember_checked_on=1; _ga=GA1.2.763156425.1409648156; dnt=1""",
		"""pragma""" -> """no-cache""",
		"""referer""" -> """https://about.twitter.com/download?logged_out=1&lang=en""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_140 = Map(
		"""Accept""" -> """*/*""",
		"""Cache-Control""" -> """no-cache""",
		"""Origin""" -> """https://about.twitter.com""",
		"""Pragma""" -> """no-cache""")

	val headers_142 = Map(
		"""accept""" -> """application/json, text/javascript, */*; q=0.01""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """no-cache""",
		"""cookie""" -> """guest_id=v1%3A140964792488868323; _gat=1; remember_checked_on=1; _ga=GA1.2.763156425.1409648156; dnt=1; has_js=1""",
		"""pragma""" -> """no-cache""",
		"""referer""" -> """https://about.twitter.com/download?logged_out=1&lang=en""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""",
		"""x-requested-with""" -> """XMLHttpRequest""")

	val headers_143 = Map(
		"""accept""" -> """image/webp,*/*;q=0.8""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """no-cache""",
		"""cookie""" -> """guest_id=v1%3A140964792488868323; goth=1; _gat=1; remember_checked_on=1; lang=en; webn=101982780; _ga=GA1.2.763156425.1409648156; dnt=1""",
		"""pragma""" -> """no-cache""",
		"""referer""" -> """https://about.twitter.com/download?logged_out=1&lang=en""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_144 = Map("""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8""")

	val headers_145 = Map(
		"""accept""" -> """image/webp,*/*;q=0.8""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """no-cache""",
		"""pragma""" -> """no-cache""",
		"""referer""" -> """https://about.twitter.com/download?logged_out=1&lang=en""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_146 = Map(
		"""accept""" -> """image/webp,*/*;q=0.8""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cache-control""" -> """no-cache""",
		"""cookie""" -> """id=22105b1f330300a3||t=1409647925|et=730|cs=002213fd48875cd43ae6571564; _drt_=OPT_OUT""",
		"""pragma""" -> """no-cache""",
		"""referer""" -> """https://about.twitter.com/download?logged_out=1&lang=en""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""",
		"""x-client-data""" -> """CI62yQEIorbJAQiptskBCMS2yQEInobKAQi4iMoBCPCIygEIxZTKAQ==""")

	val headers_149 = Map(
		"""accept""" -> """image/webp,*/*;q=0.8""",
		"""accept-encoding""" -> """gzip,deflate""",
		"""accept-language""" -> """en-US,en;q=0.8""",
		"""cookie""" -> """guest_id=v1%3A140964792488868323; _gat=1; remember_checked_on=1; dnt=1; _ga=GA1.2.763156425.1409648156; _gat_a=1; _gat_b=1; pid="v3:1409648751305594386375635"; eu_cn=1""",
		"""referer""" -> """https://platform.twitter.com/widgets/tweet_button.1409007440.html""",
		"""user-agent""" -> """Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 Safari/537.36""")

	val headers_150 = Map("""Accept""" -> """*/*""")

    val uri1 = """https://g.twimg.com"""
    val uri10 = """https://stats.g.doubleclick.net/collect"""
    val uri2 = """https://platform.twitter.com"""
    val uri3 = """https://twitter.com"""
    val uri4 = """https://pbs.twimg.com"""
    val uri5 = """https://www.google-analytics.com"""
    val uri6 = """syndication.twitter.com"""
    val uri7 = """https://abs.twimg.com"""
    val uri8 = """https://about.twitter.com"""
    val uri9 = """cdn.api.twitter.com"""

	val chain_0 = exec(http("request_0")
			.get("""/""")
			.headers(headers_0)
			.resources(http("request_1")
			.post(uri3 + """/i/jot""")
			.headers(headers_1)
			.formParam("""log""", """%5B%7B%22internal_referer%22%3Anull%2C%22client_version%22%3A%22macaw-swift%22%2C%22user_id%22%3A0%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22front%22%2C%22section%22%3A%22front%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22captured%22%7D%2C%22triggered_on%22%3A1409648154380%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3Anull%2C%22client_version%22%3A%22macaw-swift%22%2C%22user_id%22%3A0%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22front%22%2C%22section%22%3A%22front%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22ignored%22%7D%2C%22triggered_on%22%3A1409648154381%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3Anull%2C%22client_version%22%3A%22macaw-swift%22%2C%22user_id%22%3A0%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22front%22%2C%22section%22%3A%22front%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22direct%22%7D%2C%22triggered_on%22%3A1409648154381%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3Anull%2C%22client_version%22%3A%22macaw-swift%22%2C%22user_id%22%3A0%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22front%22%2C%22section%22%3A%22front%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22all%22%7D%2C%22triggered_on%22%3A1409648154381%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%5D"""),
            http("request_2")
			.get(uri7 + """/a/1409252720/css/t1/twitter_gotham_core.bundle.css""")
			.headers(headers_2)
			.check(status.is(200)),
            http("request_3")
			.get(uri7 + """/a/1409252720/css/t1/twitter_logged_out.bundle.css""")
			.headers(headers_3)
			.check(status.is(200)),
            http("request_4")
			.get(uri7 + """/a/1409252720/css/t1/twitter_more_1.bundle.css""")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_5")
			.get(uri7 + """/a/1409252720/css/t1/twitter_more_2.bundle.css""")
			.headers(headers_5)
			.check(status.is(200)),
            http("request_6")
			.get(uri7 + """/font/gotham-narrow-v3.css""")
			.headers(headers_6)
			.check(status.is(200)),
            http("request_7")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_wc2014_gen_laurenlemon.jpg""")
			.headers(headers_7)
			.check(status.is(200)),
            http("request_8")
			.get(uri7 + """/c/swift/en/init.1035c4be65cb423c194fb0ebf658e28169bb4ae8.js""")
			.headers(headers_8)
			.check(status.is(200)),
            http("request_9")
			.get(uri7 + """/a/1409252720/font/rosetta-icons-Regular.woff""")
			.headers(headers_9)
			.check(status.is(200)),
            http("request_10")
			.get(uri7 + """/c/swift/en/bundle/frontpage.afb2227ca859321084de73e69793b1d580c65567.js""")
			.headers(headers_10)
			.check(status.is(200)),
            http("request_11")
			.get(uri5 + """/analytics.js""")
			.headers(headers_11)
			.check(status.is(200)),
            http("request_12")
			.get(uri5 + """/collect?v=1&_v=j25&a=1999786345&t=pageview&_s=1&dl=https%3A%2F%2Ftwitter.com%2F&dp=%2Fanon%2Ffront%2Ffront&ul=en-us&de=UTF-8&dt=Twitter&sd=24-bit&sr=1280x1024&vp=1263x555&je=1&fl=14.0%20r0&_u=MCCAgAQ~&jid=&cid=763156425.1409648156&tid=UA-30775-6&z=1377942240""")
			.headers(headers_12)))
		.pause(7)
		.exec(http("request_13")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_photo_set_astro_reid.jpg""")
			.headers(headers_13))
		.pause(7)
		.exec(http("request_14")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_wc2014_gen_timtrueman.jpg"""))
		.pause(7)
		.exec(http("request_15")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_photo_set_gopro.jpg"""))
		.pause(7)
		.exec(http("request_16")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_wc2014_gen_couch.jpg"""))
		.pause(7)
		.exec(http("request_17")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_photo_set_redbull.jpg"""))
		.pause(7)
		.exec(http("request_18")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_wc2014_gen_laurenlemon.jpg""")
			.headers(headers_13))
		.pause(7)
		.exec(http("request_19")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_photo_set_astro_reid.jpg""")
			.headers(headers_13))
		.pause(13)
		.exec(http("request_20")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_photo_set_gopro.jpg""")
			.headers(headers_13))
		.pause(14)
		.exec(http("request_21")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_photo_set_redbull.jpg""")
			.headers(headers_13))
		.pause(7)
		.exec(http("request_22")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_wc2014_gen_laurenlemon.jpg""")
			.headers(headers_13))
		.pause(7)
		.exec(http("request_23")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_photo_set_astro_reid.jpg""")
			.headers(headers_13))
		.pause(14)
		.exec(http("request_24")
			.get(uri7 + """/a/1409252720/img/t1/front_page/exp_photo_set_gopro.jpg""")
			.headers(headers_13))
		.pause(8)
		.exec(http("request_25")
			.get(uri5 + """/collect?v=1&_v=j25&a=1999786345&t=event&_s=2&dl=https%3A%2F%2Ftwitter.com%2F&ul=en-us&de=UTF-8&dt=Twitter&sd=24-bit&sr=1280x1024&vp=1263x555&je=1&fl=14.0%20r0&ec=button&ea=existing-user-signin&el=nav-buttons&_u=OCCAgAQE~&jid=&cid=763156425.1409648156&tid=UA-30775-6&z=2021017376""")
			.headers(headers_25)
			.resources(http("request_26")
			.post(uri3 + """/sessions""")
			.headers(headers_26)
			.formParam("""session%5Busername_or_email%5D""", """xxxxxx""")
			.formParam("""session%5Bpassword%5D""", """xxxxxx""")
			.formParam("""remember_me""", """1""")
			.formParam("""return_to_ssl""", """true""")
			.formParam("""scribe_log""", """""")
			.formParam("""redirect_after_login""", """%2F""")
			.formParam("""authenticity_token""", """be0ba0e521d173c9f362624692079d03b7e061d4"""),
            http("request_27")
			.get(uri7 + """/a/1409252720/css/t1/twitter_gotham_core.bundle.css""")
			.headers(headers_13),
            http("request_28")
			.get(uri7 + """/font/gotham-narrow-v3.css""")
			.headers(headers_13),
            http("request_29")
			.get(uri4 + """/profile_images/490373627737419777/tCei4gvW_normal.jpeg""")
			.headers(headers_29),
            http("request_30")
			.get(uri4 + """/profile_images/490373627737419777/tCei4gvW_bigger.jpeg""")
			.headers(headers_29),
            http("request_31")
			.get(uri7 + """/a/1409252720/font/rosetta-icons-Regular.woff""")
			.headers(headers_13),
            http("request_32")
			.get(uri7 + """/images/themes/theme1/bg.png""")
			.headers(headers_29),
            http("request_33")
			.get(uri7 + """/a/1409252720/img/t1/twitter_web_sprite_icons.png""")
			.headers(headers_29),
            http("request_34")
			.get(uri4 + """/profile_images/442922138631032833/gcQ3HGk3_bigger.jpeg""")
			.headers(headers_29),
            http("request_35")
			.get(uri4 + """/profile_images/418640298235797504/LRoqzBwR_bigger.jpeg""")
			.headers(headers_29),
            http("request_36")
			.get(uri4 + """/profile_images/460668359772631041/GEd9T2vn_bigger.jpeg""")
			.headers(headers_29),
            http("request_37")
			.get(uri4 + """/profile_images/2736284761/ff3d568e5a8a76fe84e46d47153cd1d6_bigger.png""")
			.headers(headers_29),
            http("request_38")
			.get(uri4 + """/profile_images/501228706686185473/MhcdgtGu_bigger.jpeg""")
			.headers(headers_29),
            http("request_39")
			.get(uri4 + """/profile_images/485849417879015424/CTQYQQVb_bigger.jpeg""")
			.headers(headers_29),
            http("request_40")
			.get(uri7 + """/sticky/default_profile_images/default_profile_6_mini.png""")
			.headers(headers_29),
            http("request_41")
			.get(uri7 + """/a/1409252720/img/t1/spinner-rosetta-gray-32x32.gif""")
			.headers(headers_29),
            http("request_42")
			.get(uri7 + """/c/swift/en/init.1035c4be65cb423c194fb0ebf658e28169bb4ae8.js""")
			.headers(headers_42)))
		.pause(3)
		.exec(http("request_43")
			.get(uri7 + """/c/swift/en/bundle/timeline.34677c138f4086e60215b2080d899e28a561b9a4.js""")
			.headers(headers_42))
		.pause(5)
		.exec(http("request_44")
			.get(uri7 + """/c/swift/en/bundle/boot.ce5fa40cf86703b80466492ca105fdafa49f04bf.js""")
			.headers(headers_42))
		.pause(7)
		.exec(http("request_45")
			.get(uri7 + """/a/1409252720/css/t1/twitter_more_1.bundle.css""")
			.headers(headers_13)
			.resources(http("request_46")
			.get(uri7 + """/a/1409252720/css/t1/twitter_more_2.bundle.css""")
			.headers(headers_13),
            http("request_47")
			.get(uri3 + """/i/search/typeahead.json?count=1200&experiments=&media_tagging_in_prefetch=true&prefetch=true&result_type=users&users_cache_age=-1""")
			.headers(headers_47),
            http("request_48")
			.get(uri3 + """/i/search/typeahead.json?count=1200&experiments=&media_tagging_in_prefetch=true&prefetch=true&result_type=users&users_cache_age=-1""")
			.headers(headers_47),
            http("request_49")
			.get(uri3 + """/trends?k=945744c93d&pc=true&show_context=true&src=module""")
			.headers(headers_49),
            http("request_50")
			.get(uri5 + """/analytics.js""")
			.headers(headers_50),
            http("request_51")
			.get(uri3 + """/i/users/recommendations?connections=true&disabled=false&dismissable=true&display_location=wtf-component&excluded=&initialResults=true&last_note_ts=0&limit=3&oldest_unread_id=0&pc=true&scribeContext%5Bcomponent%5D=user_recommendations""")
			.headers(headers_49),
            http("request_52")
			.get(uri4 + """/media/Bwgz-w3CQAAMi5A.jpg""")
			.headers(headers_29),
            http("request_53")
			.get(uri4 + """/media/Bwgyr2xCEAAE9qs.jpg""")
			.headers(headers_29),
            http("request_54")
			.get(uri4 + """/media/BwgrTWTCUAAmuON.jpg""")
			.headers(headers_29),
            http("request_55")
			.get(uri4 + """/media/Bwgpu1OCAAA1vfu.jpg""")
			.headers(headers_29),
            http("request_56")
			.get(uri5 + """/collect?v=1&_v=j25&a=390912516&t=pageview&_s=1&dl=https%3A%2F%2Ftwitter.com%2F&dp=%2Fuser%2Fhome%2Fhome&ul=en-us&de=UTF-8&dt=Twitter&sd=24-bit&sr=1280x1024&vp=1263x555&je=1&fl=14.0%20r0&_u=MCCAgAQ~&jid=&cid=763156425.1409648156&tid=UA-30775-6&z=1606956029""")
			.headers(headers_56)))
		.pause(5)
		.exec(http("request_57")
			.get(uri4 + """/profile_images/433299107537371136/eYrtkmWB_normal.png""")
			.resources(http("request_58")
			.get(uri7 + """/sticky/default_profile_images/default_profile_5_normal.png"""),
            http("request_59")
			.get(uri4 + """/profile_images/485151785959448576/e8D30sHa_normal.jpeg"""),
            http("request_60")
			.get(uri3 + """/i/promoted_content/log.json?event=impression&impression_id=1acb1c3ea1e18471""")
			.headers(headers_60)))
		.pause(4)
		.exec(http("request_61")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=1&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(9)
		.exec(http("request_62")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=2&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_63")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_64")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=3&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61)))
		.pause(9)
		.exec(http("request_65")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=4&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_66")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=5&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_67")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_68")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=6&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61)))
		.pause(10)
		.exec(http("request_69")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=7&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_70")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=8&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_71")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_72")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=9&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61)))
		.pause(9)
		.exec(http("request_73")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=10&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_74")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=11&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_75")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_76")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=12&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61)))
		.pause(9)
		.exec(http("request_77")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=13&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_78")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=14&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_79")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_80")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=15&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61)))
		.pause(9)
		.exec(http("request_81")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=16&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_82")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=17&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_83")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_84")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=18&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61)))
		.pause(10)
		.exec(http("request_85")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=19&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_86")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=20&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_87")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_88")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=21&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61)))
		.pause(9)
		.exec(http("request_89")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=22&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_90")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=23&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_91")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_92")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=24&latent_count=0&min_position=506727300419706881""")
			.headers(headers_61)))
		.pause(10)
		.exec(http("request_93")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=25&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_94")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=26&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_95")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_96")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=27&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61)))
		.pause(9)
		.exec(http("request_97")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=28&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_98")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=29&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_99")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_100")
			.get(uri3 + """/trends?k=945744c93d&pc=true&show_context=true&src=module""")
			.headers(headers_100),
            http("request_101")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=30&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61)))
		.pause(10)
		.exec(http("request_102")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=31&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_103")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=32&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)

val chain_1 = exec(http("request_104")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_105")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=33&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61)))
		.pause(10)
		.exec(http("request_106")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=34&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_107")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=35&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_108")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_109")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=36&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61)))
		.pause(9)
		.exec(http("request_110")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=37&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_111")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=38&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_112")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_113")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=39&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61)))
		.pause(9)
		.exec(http("request_114")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=40&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_115")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=41&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(10)
		.exec(http("request_116")
			.get("""/i/toast_poll?oldest_unread_id=0""")
			.headers(headers_63)
			.resources(http("request_117")
			.get(uri3 + """/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=42&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61)))
		.pause(10)
		.exec(http("request_118")
			.get("""/i/timeline?composed_count=0&include_available_features=1&include_entities=1&include_new_items_bar=true&interval=10000&last_note_ts=43&latent_count=1&min_position=506728833483960320""")
			.headers(headers_61))
		.pause(4)
		.exec(http("request_119")
			.post("""/i/jot""")
			.headers(headers_119)
			.formParam("""log""", """%5B%7B%22internal_referer%22%3Anull%2C%22client_version%22%3A%22macaw-swift%22%2C%22user_id%22%3A0%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22front%22%2C%22section%22%3A%22front%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22captured%22%7D%2C%22triggered_on%22%3A1409648169405%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3Anull%2C%22client_version%22%3A%22macaw-swift%22%2C%22user_id%22%3A0%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22front%22%2C%22section%22%3A%22front%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22ignored%22%7D%2C%22triggered_on%22%3A1409648169405%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3Anull%2C%22client_version%22%3A%22macaw-swift%22%2C%22user_id%22%3A0%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22front%22%2C%22section%22%3A%22front%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22direct%22%7D%2C%22triggered_on%22%3A1409648169406%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3Anull%2C%22client_version%22%3A%22macaw-swift%22%2C%22user_id%22%3A0%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22front%22%2C%22section%22%3A%22front%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22all%22%7D%2C%22triggered_on%22%3A1409648169406%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3Anull%2C%22client_version%22%3A%22macaw-swift%22%2C%22user_id%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22front%22%2C%22section%22%3A%22front%22%2C%22component%22%3A%22login_callout%22%2C%22element%22%3A%22form%22%2C%22action%22%3A%22login_click%22%7D%2C%22triggered_on%22%3A1409648283855%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22user_recommendations%22%2C%22element%22%3A%22wtf_import_prompt%22%2C%22action%22%3A%22impression%22%7D%2C%22triggered_on%22%3A1409648305405%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22captured%22%7D%2C%22triggered_on%22%3A1409648305465%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22ignored%22%7D%2C%22triggered_on%22%3A1409648305466%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22direct%22%7D%2C%22triggered_on%22%3A1409648305466%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22event_value%22%3A0%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22reduced_action_queue%22%2C%22action%22%3A%22all%22%7D%2C%22triggered_on%22%3A1409648305466%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22woeid%22%3A23424848%2C%22referring_event%22%3A%22initial%22%2C%22items%22%3A%5B%7B%22name%22%3A%22Welbeck%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Welbeck%22%2C%22position%22%3A0%7D%2C%7B%22name%22%3A%22%23Pune%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22%23Pune%22%2C%22position%22%3A1%7D%2C%7B%22name%22%3A%22%23EVECHE%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22%23EVECHE%22%2C%22position%22%3A2%7D%2C%7B%22name%22%3A%22United%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22United%22%2C%22position%22%3A3%7D%2C%7B%22name%22%3A%22Wenger%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Wenger%22%2C%22position%22%3A4%7D%2C%7B%22name%22%3A%22Happy+Ganesh+Chaturthi%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Happy+Ganesh+Chaturthi%22%2C%22position%22%3A5%7D%2C%7B%22name%22%3A%22Mumbai%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Mumbai%22%2C%22position%22%3A6%7D%2C%7B%22name%22%3A%22Modi%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Modi%22%2C%22position%22%3A7%7D%2C%7B%22name%22%3A%22Rooney%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Rooney%22%2C%22position%22%3A8%7D%2C%7B%22name%22%3A%22Remy%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Remy%22%2C%22position%22%3A9%7D%5D%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22trends%22%2C%22element%22%3A%22initial%22%2C%22action%22%3A%22results%22%7D%2C%22triggered_on%22%3A1409648305962%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22woeid%22%3A23424848%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22trends%22%2C%22action%22%3A%22impression%22%7D%2C%22triggered_on%22%3A1409648305963%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22items%22%3A%5B%7B%22position%22%3A0%2C%22promoted_id%22%3A%221acb1c3ea1e18471%22%2C%22id%22%3A%2222164685%22%2C%22item_type%22%3A3%2C%22token%22%3A%2238%22%7D%2C%7B%22position%22%3A1%2C%22id%22%3A%2268497896%22%2C%22item_type%22%3A3%2C%22token%22%3A%22117%22%7D%2C%7B%22position%22%3A2%2C%22id%22%3A%222177710981%22%2C%22item_type%22%3A3%2C%22token%22%3A%22117%22%7D%5D%2C%22promoted%22%3Atrue%2C%22referring_event%22%3A%22initial%22%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22user_recommendations%22%2C%22element%22%3A%22initial%22%2C%22action%22%3A%22results%22%7D%2C%22triggered_on%22%3A1409648311031%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22user_recommendations%22%2C%22action%22%3A%22impression%22%7D%2C%22triggered_on%22%3A1409648311031%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22tweet%22%2C%22element%22%3A%22new_tweets_bar%22%2C%22action%22%3A%22show%22%7D%2C%22triggered_on%22%3A1409648545784%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22woeid%22%3A23424848%2C%22referring_event%22%3A%22newer%22%2C%22items%22%3A%5B%7B%22name%22%3A%22Welbeck%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Welbeck%22%2C%22position%22%3A0%7D%2C%7B%22name%22%3A%22%23pune%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22%23pune%22%2C%22position%22%3A1%7D%2C%7B%22name%22%3A%22%23EVECHE%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22%23EVECHE%22%2C%22position%22%3A2%7D%2C%7B%22name%22%3A%22United%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22United%22%2C%22position%22%3A3%7D%2C%7B%22name%22%3A%22Wenger%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Wenger%22%2C%22position%22%3A4%7D%2C%7B%22name%22%3A%22Happy+Ganesh+Chaturthi%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Happy+Ganesh+Chaturthi%22%2C%22position%22%3A5%7D%2C%7B%22name%22%3A%22Mumbai%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Mumbai%22%2C%22position%22%3A6%7D%2C%7B%22name%22%3A%22Modi%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Modi%22%2C%22position%22%3A7%7D%2C%7B%22name%22%3A%22Rooney%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Rooney%22%2C%22position%22%3A8%7D%2C%7B%22name%22%3A%22Remy%22%2C%22item_type%22%3A8%2C%22item_query%22%3A%22Remy%22%2C%22position%22%3A9%7D%5D%2C%22event_initiator%22%3A2%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22trends%22%2C%22element%22%3A%22newer%22%2C%22action%22%3A%22results%22%7D%2C%22triggered_on%22%3A1409648605744%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%2C%7B%22internal_referer%22%3A%22%2F%22%2C%22client_version%22%3A%22macaw-swift%22%2C%22event_namespace%22%3A%7B%22client%22%3A%22web%22%2C%22page%22%3A%22home%22%2C%22section%22%3A%22home%22%2C%22component%22%3A%22tweet%22%2C%22element%22%3A%22tweet_actions_dropdown%22%2C%22action%22%3A%22open%22%7D%2C%22triggered_on%22%3A1409648739919%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%5D""")
			.formParam("""lang""", """en"""))
		.pause(1)
		.exec(http("request_120")
			.post("""/logout""")
			.headers(headers_120)
			.formParam("""authenticity_token""", """be0ba0e521d173c9f362624692079d03b7e061d4""")
			.formParam("""reliability_event""", """""")
			.formParam("""scribe_log""", """"""))
		.pause(1)
		.exec(http("request_121")
			.get(uri1 + """/css/b37ee66/css_hLk48FSKIj9kCPZW5CI4KAfytFja68umEouUHEDXHeM.css""")
			.headers(headers_121)
			.resources(http("request_122")
			.get(uri1 + """/css/b37ee66/css_sIhfd1AIaScyZ0Ro3yeD8e_lv9OHNmlgCWidBHRlOEc.css""")
			.headers(headers_121),
            http("request_123")
			.get(uri1 + """/css/b37ee66/css_XbyOi5uUwahbNafjFmeHRthvMkjb8OYVttQ7eFNsM4c.css""")
			.headers(headers_121),
            http("request_124")
			.get(uri1 + """/css/b37ee66/css_BOFlu83HTwTaMfXXaKBm_44oHrjgW-SZfj05ZhJhRwc.css""")
			.headers(headers_121),
            http("request_125")
			.get(uri1 + """/js/b37ee66/js_W-3JiEXgmlSQzVBibh_ovjFZTHhCkJxcoM-mis3koNQ.js""")
			.headers(headers_42),
            http("request_126")
			.get(uri1 + """/js/b37ee66/js_mUBiIRxLMgvsnQR9YF3jx4vzA2u8LRLwjemT-cmLzFo.js""")
			.headers(headers_42),
            http("request_127")
			.get(uri1 + """/js/b37ee66/js_GOJCj1TKwKvfgETup7jUb_NmIZyn_mgk_Qv_m__9XTw.js""")
			.headers(headers_42),
            http("request_128")
			.get(uri1 + """/js/b37ee66/js_00TO1yhlCuMQDZgl5lqjhFuuOC7Pb0kGRPaZ-OzZArY.js""")
			.headers(headers_42),
            http("request_129")
			.get(uri1 + """/js/b37ee66/js_gWzLjJQwd6btPYevFzS6tn23govMOUXPbvEpq2Lq7no.js""")
			.headers(headers_42),
            http("request_130")
			.get(uri1 + """/js/b37ee66/js_h6WegCLyKENcrQdM1B4yrxkbnsQFsQy94F80tpEeq8Q.js""")
			.headers(headers_42),
            http("request_131")
			.get(uri1 + """/js/b37ee66/js_Rk5YIkK6m2gKTGH-GrMu0pM_PlMKXnI0ktQUgXw1XgA.js""")
			.headers(headers_42),
            http("request_132")
			.get(uri2 + """/widgets.js""")
			.headers(headers_42),
            http("request_133")
			.get(uri1 + """/js/b37ee66/js_1r-FjgbxCHgZM0j8xS6_j1MMM8i7J5YviNFn_icL1j8.js""")
			.headers(headers_42),
            http("request_134")
			.get(uri2 + """/oct.js""")
			.headers(headers_42),
            http("request_135")
			.get(uri8 + """/built/single_files/sites/about/modules/internal/features/feature_mobile_product/js/feature_mobile_product.js?nazpow""")
			.headers(headers_135)))
		.pause(2)
		.exec(http("request_136")
			.get(uri1 + """/sites/about/products/landing/phone-lockup-2.png""")
			.headers(headers_29)
			.resources(http("request_137")
			.get(uri1 + """/sites/all/themes/gazebo/img/sprite.png""")
			.headers(headers_29),
            http("request_138")
			.get(uri1 + """/about/css_resources/CyTAYwl_szmfgWqluHc4AcrBMU-baDMhHqP-3tgpwlA.png""")
			.headers(headers_29),
            http("request_139")
			.get(uri1 + """/about/hero-tile.jpg""")
			.headers(headers_29),
            http("request_140")
			.get(uri1 + """/about/css_resources/h9NNF8CXd3Tk5iLzIvL1-_vbVch4AyVZVvqW5UsG9Ao.woff""")
			.headers(headers_140),
            http("request_141")
			.get(uri1 + """/googleanalytics/analytics.js""")
			.headers(headers_42),
            http("request_142")
			.get(uri8 + """/ajax/notice/cookies?_=1409648746300""")
			.headers(headers_142),
            http("request_143")
			.get(uri3 + """/i/jot?q=6297&log=%5B%7B%22event_namespace%22%3A%7B%22client%22%3A%22gazebo%22%2C%22page%22%3A%22about_download%22%2C%22section%22%3A%22%22%2C%22action%22%3A%22impression%22%7D%2C%22triggered_on%22%3A1409648746297%2C%22format_version%22%3A2%2C%22_category_%22%3A%22client_event%22%7D%5D""")
			.headers(headers_143),
            http("request_144")
			.get(uri2 + """/widgets/tweet_button.1409007440.html""")
			.headers(headers_144),
            http("request_145")
			.get(uri5 + """/collect?v=1&_v=j25&a=1980606526&t=pageview&_s=1&dl=https%3A%2F%2Fabout.twitter.com%2Fdownload%3Flogged_out%3D1%26lang%3Den&dr=https%3A%2F%2Ftwitter.com%2F&ul=en-us&de=UTF-8&dt=Download%20the%20free%20Twitter%20app&sd=24-bit&sr=1280x1024&vp=1263x555&je=1&fl=14.0%20r0&_u=cCCAgEQ~&jid=2053996406&cid=763156425.1409648156&tid=UA-30775-44&cd2=1&z=1034254479""")
			.headers(headers_145),
            http("request_146")
			.get(uri10 + """?t=dc&aip=1&v=1&_v=j25&tid=UA-30775-44&cid=763156425.1409648156&jid=2053996406&_u=cCCAgEQ~&z=1060589186""")
			.headers(headers_146),
            http("request_147")
			.get(uri5 + """/collect?v=1&_v=j25&a=1980606526&t=pageview&_s=1&dl=https%3A%2F%2Fabout.twitter.com%2Fdownload%3Flogged_out%3D1%26lang%3Den&dr=https%3A%2F%2Ftwitter.com%2F&ul=en-us&de=UTF-8&dt=Download%20the%20free%20Twitter%20app&sd=24-bit&sr=1280x1024&vp=1263x555&je=1&fl=14.0%20r0&_u=cCCAgEQE~&jid=1459217261&cid=763156425.1409648156&tid=UA-30775-46&cd2=1&z=1230185509""")
			.headers(headers_145),
            http("request_148")
			.get(uri10 + """?t=dc&aip=1&v=1&_v=j25&tid=UA-30775-46&cid=763156425.1409648156&jid=1459217261&_u=cCCAgEQE~&z=950635571""")
			.headers(headers_146),
            http("request_149")
			.get("https://" + uri6 + """/i/jot/syndication?l=%7B%22_category_%22%3A%22tfw_client_event%22%2C%22language%22%3A%22en%22%2C%22client_version%22%3A%221.1%3Al%3Awithcount%3A%22%2C%22widget_origin%22%3A%22https%3A%2F%2Fabout.twitter.com%2Fdownload%3Flogged_out%3D1%26lang%3Den%22%2C%22format_version%22%3A1%2C%22triggered_on%22%3A1409648746962%2C%22event_namespace%22%3A%7B%22client%22%3A%22tfw%22%2C%22page%22%3A%22button%22%2C%22section%22%3A%22share%22%2C%22action%22%3A%22impression%22%7D%7D""")
			.headers(headers_149),
            http("request_150")
			.get("https://" + uri9 + """/1/urls/count.json?url=https%3A%2F%2Fabout.twitter.com%2Fdownload&callback=twttr.receiveCount""")
			.headers(headers_150)))

	val scn = scenario("TwitterSimulation").exec(
		chain_0, chain_1)

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}