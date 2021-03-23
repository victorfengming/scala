package com.atguigu.chapter03.inputcon

import scala.io.StdIn


object Demo01 {
  def main(args: Array[String]): Unit = {
    /*
    * 要求: 可以从控制台接收用户信息
    *   [姓名 ,年龄, 薪水]
    * */
    println("请输入姓名")
    val name = StdIn.readLine()
    println("你输入的名字是:"+name)

    Cat.sayHi()
    Cat.sayHello()
  }

}

// 声明了一个对象(伴生对象)
object Cat extends AAA{
  //方法
  def sayHi():Unit = {
    println("小狗汪汪叫!!! ")
  }
}

trait AAA{
  /// AAA是特质,等价于java中的interface+abstract class
  def sayHello():Unit = {
    println("AAA sayHello")
  }

}