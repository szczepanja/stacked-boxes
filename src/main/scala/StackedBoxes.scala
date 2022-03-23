object StackedBoxes extends App {
  val ls = args.sortBy(_.length)
  val maxL = ls(ls.length - 1).length

  def boxWord(): Unit = {
    ls.foreach(l => {
      var spaceN = (maxL - l.length) / 2

      if (ls.indexOf(l) == ls.length - 1) {
        println("+" + "-" * (l.length) + "+")
        println(" " * spaceN + "|" + l + "|")
        println("+" + "-" * (l.length) + "+")
      } else {
        println(" " * spaceN + "+" + "-" * (l.length) + "+")
        println(" " * spaceN + "|" + l + "|")
      }
    })
  }

  boxWord()

}

