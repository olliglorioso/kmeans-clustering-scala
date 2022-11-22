import helpers.*

class KMeans(var n_clusters: Int, var n_init: Int):
  def print_n_clusters() = println("moi" + this.n_clusters)
end KMeans


@main def runKMeans() =
  var meanssi = KMeans(1, 2)
  meanssi.print_n_clusters()
  var helpperi = helpers.CreateData(20.0, 10, 10, 500)
  var generated_data = helpperi.generate_data()
  println("helpperin tulos = " + helpperi.generate_data()(0).length)
  helpers.DrawChart(generated_data, 500)
  

