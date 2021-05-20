object ExamenBigData {
  def main(args:Array[String]): Unit = {
    /*def renvoi():List[String]= {}*/

    val maliste : List[String] = List("Nulien","Naomie","aristote","Nupil", "Richard")
    val renvoi : List[String] = maliste.filter(_.reverse.take(1) == "n" )
    renvoi.foreach(println)
  }

}
