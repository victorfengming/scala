package com.atguigu.chapter03.arithoper

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-23 15:19 <br/>
 * <br/>
 *
 * @author yufengming
 * @email yufengming@travelsky.com
 * @project scala
 * @package com.atguigu.chapter03.arithoper
 *          <p>
 *          修改记录
 *
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    var r1: Int = 10 / 3
    println("r1=" + r1)
    var r2: Double = 10 / 3
    println("r2=" + r2)
    var r3: Double = 10.0 / 3
    println("r3=" + r3)
    println("r3=" + r3.formatted("%.2f"))
    // %的使用
    // 1. % 的运算的原则 : a%b =a-a/b*b
    println(10 % 3) // 1
    println(-10 % 3) // -1
    println(-10 % -3) // -1
    println(10 % -3) // 1

    // ++ 和 --
    // 说明: 在 scala中没有 ++ 和 --,而使用 +=1 和 -=1
    var num1 = 10
    // num1 ++ 错误
    num1 +=1 // 代替num1++
    // --同理
    num1 -=1

  }
}
