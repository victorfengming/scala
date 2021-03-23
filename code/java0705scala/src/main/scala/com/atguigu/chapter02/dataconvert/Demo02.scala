package com.atguigu.chapter02.dataconvert

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-23 13:40 <br/>
 * <br/>
 *
 * @author yufengming
 * @email yufengming@travelsky.com
 * @project scala
 * @package com.atguigu.chapter02.dataconvert
 *          <p>
 *          修改记录
 *
 */
object Demo02 {

  def main(args: Array[String]): Unit = {
    val num1: Int = 10 * 3.5.toInt + 6 * 1.5.toInt // 36
    val num2: Int = (10 * 3.5 + 6 * 1.5).toInt // 44
    println(num1 + " " + num2)

    val char1:Char = 1
    val num3 = 1
//    val char2:Char = num3// 报错
    // 常量可 可以赋值,变量不中
  }

}
