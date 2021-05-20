object ExamenBigData {
  def main(args:Array[String]): Unit = {


  def renvoi(maliste : List[String]):List[String]= {
    val maliste : List[String] = List("julien","Paul","Jean","rac", "trec","joel","ed","chris")
    val renvoi : List[String] = maliste.filter(_.reverse.take(1) == "n" )
    return renvoi
    }
    def tableau() : Unit = {

      val listetableau = List(("ecommercemag.fr"," "),
        ("https://www.journalducm.com/contact/","Payant"),
        ("https://www.zatsaz.com/"," "),
        ("https://www.lerevenu.com/"," "),
        ("https://www.cadre-dirigfdeant-magazine.com/","Payant"),
        ("https://www.silicon.fr/services/contact#annoner","Payant"),
        ("https://www.channelbiz.fr/nous-contacter/"," "),
        ("https://www.itespresso.fr/"," "),
        ("https://www.industrie-mag.com/article4.html","invite"),
        ("https://www.jesuisundev.com/article-invite/","invite"),
        ("https://www.numerama.com/"," ")
        )
      val listefin = (Map(listetableau:_*).keys.toList.map(l => l.replace("https://www.","").split("/")(0) ) zip Map(listetableau:_*).values).toList
    }
  }

}

