package funsets

object Main extends App {
  import FunSets._
  //println(contains(union(singletonSet(1), singletonSet(3)), 4))

  val s1: Set = singletonSet(-1)
  val s2: Set = singletonSet(-2)

  val u = union(s1, s2)

  val mu = map(u, (x:Int) => x+1)
  printSet(mu)


}
