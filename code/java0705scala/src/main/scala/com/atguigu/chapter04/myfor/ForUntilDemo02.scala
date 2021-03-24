package com.atguigu.chapter04.myfor
/**
 *
 * *
 *
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project scala
 * @package com.atguigu.chapter04.ifelse
 * @created 2021-03-24 18:59
 */
object ForUntilDemo02 {
  def main(args: Array[String]): Unit = {
    //输出10句 "hello,尚硅谷!"
    val start = 1
    val end = 11
    //循环的范围是  start --- (end-1)
    for (i <- start until end) {
      println("hello, 尚硅谷" + i)
    }
  }
}
