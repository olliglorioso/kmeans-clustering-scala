import math.random


package helpers:
    class CreateData (var range: Double, var points_per_cluster: Int, var n_clusters: Int, var plane_size: Int):
        def rndm_p_from_p(point: Array[Double]): Array[Double] = {
            var random1 = if random() > 0.5 then random() * (-1) * range else random() * range * 1
            var random2 = if random() > 0.5 then random() * (-1) * range else random() * range * 1
            return Array(point(0) + random1, point(1) + random2)
        }

        def generate_clusters(): Array[Array[Double]] = {
            var clusters: Array[Array[Double]] = Array()
            for (i <- 0 until this.n_clusters) {
                var random1 = this.plane_size * random()
                var random2 = this.plane_size * random()
                clusters = clusters :+ Array(random1, random2)
            }
            return clusters
        }

        def rndm_points_from_points(original_points: Array[Array[Double]]): Array[Array[Double]] = {
            var data_points: Array[Array[Double]] = Array()
            for (i <- 0 until original_points.length) {
                for (k <- 0 until this.points_per_cluster) {
                    data_points = data_points :+ this.rndm_p_from_p(original_points(i))
                }
            }
            return data_points
        }

        def generate_data(): Array[Array[Double]] = {
            var clusters = this.generate_clusters()
            var data_points = this.rndm_points_from_points(clusters)
            return data_points
        }

    end CreateData