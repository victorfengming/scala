
import util.control.Breaks._

object Homework01 {
  def main(args: Array[String]): Unit = {
    /*
    100以内的数求和，求出当和 第一次大于20的当前数
     */
    var sum = 0
    breakable {
      for (i <- 1 to 100) {
        sum += i
        if (sum > 20) {
          println("第一次大于20的当前数=" + i)
          break()
        }
      }
    }

    //除了上面的break机制来中断，我们也可以使用循环守卫实现中断
    println("===========================")
    // 你要见多识广
    // 你见的多了,自然就有判断力了
    var loop = true
    var sum2 = 0
    for (i <- 1 to 100 if loop == true) {
      sum2 += i
      if (sum2 > 20) {
        println("循环守卫实现中断 第一次大于20的当前数=" + i)
        loop = false
        // 编译器又不是傻子
        // 他知道你不能够置为true了
        // 他就真的跳出来了
      }
      println("i=" + i)
    }

    /*
    * 第一次大于20的当前数=6
    ===========================
    i=1
    i=2
    i=3
    i=4
    i=5
    循环守卫实现中断 第一次大于20的当前数=6
    i=6

    Process finished with exit code 0
    * */
  }
}
