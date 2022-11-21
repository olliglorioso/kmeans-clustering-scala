import helpers.*
import org.nspl._ 
import org.nspl.awtrenderer._ 
import scala.util.Random.nextDouble

class KMeans(var n_clusters: Int, var n_init: Int):
  def print_n_clusters() = println("moi" + this.n_clusters)
end KMeans



@main def runKMeans() =
  var meanssi = KMeans(1, 2)
  meanssi.print_n_clusters()
  var helpperi = helpers.CreateData(3.0, 4, 10, 20)
  println("helpperin tulos = " + helpperi.generate_data()(0))
  val someData = 0 until 100 map (_ => nextDouble() -> nextDouble())

  val plot = xyplot(someData)(
              par(
                main="Main label", 
                xlab="x axis label",
                ylab="y axis label"
              )
            )

  println(renderToFile(plot.build, width=2000))
    
  
