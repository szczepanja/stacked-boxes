object StackedBoxes extends App {
  val ls = args.sortBy(_.length)
  val maxL = ls(ls.length - 1).length
  println(" " * ((maxL / 2) - 1) + "*" * 3)
  println(" " * ((maxL / 2) - 1) + "|" * 3)

  def boxWord(): Unit = {
    ls.foreach(l => {
      var spaceN = (maxL - l.length) / 2

      if (l == ls.last) {
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

