object ExamenBigData {
  def main(args:Array[String]): Unit = {
    def renvoi():List[String]= {
      val maliste : List[String] = List("julien","Paul","Jean","rac", "trec","joel","ed","chris")
      val renvoi : List[String] = maliste.filter(_.reverse.take(1) == "n" )
      renvoi.foreach(println)
    }
    def liste_double() : Unit = {

    }
    val maliste2 : List[String] =  Array(Array("ecommercemag.fr"),
      Array("https://www.journalducm.com/contact/", "payant"),
      Array("https://www.zatsaz.com/"),
      Array("https://www.lerevenu.com/"),
      Array("https://www.cadre-dirigfdeant-magazine.com/", "payant"));

    val listerecup :List[String] = maliste2.filter(maliste2.substring(0, maliste2.length - 1))
    listerecup.foreach(println)




  }

}
