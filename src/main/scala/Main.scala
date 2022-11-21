import helpers.*

class KMeans(var n_clusters: Int, var n_init: Int):
  def print_n_clusters() = println("moi" + this.n_clusters)
end KMeans



@main def runKMeans() =
  var meanssi = KMeans(1, 2)
  meanssi.print_n_clusters()
  var helpperi = helpers.CreateData(3, 2)
  println("helpperin tulos = " + helpperi.rndm_p_from_p(Array(1.0, 2.0)).mkString(", "))
  