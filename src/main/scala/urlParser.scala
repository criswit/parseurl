import java.net.URI

class urlParser
(val url: String,
 var scheme: String,
 var port: Double,
 var host: String,
 var suffix: String,
 var tld: String)
{
  val uri = URI.create(url)
  def get_scheme(uri: String): Unit = {
    val scheme = this.uri.getScheme()
  }
  def get_host(url: String): Unit = {
    val host = this.uri.getHost()
  }
}
