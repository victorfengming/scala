package com.atguigu.chapter02.datatype

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-23 9:14 <br/>
 * <br/>
 * @author yufengming
 * @email yufengming@travelsky.com
 *          <p>
 *          修改记录
 *
 */
object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    //
    var num1:Int = 10
    // 因为Int 是一个类,因此他的一个实例,就可以使用很多方法
    /// 在Scala中,如果一个方法,没有形参,则可以省略()
    println(num1.toDouble + "\t"+num1.toString)
    sayHi
    sayHi()
    /*
    * 10.0	10
    say hi
    say hi

    Process finished with exit code 0
    * */
  }
  def sayHi():Unit = {
    println("say hi")
  }

}
