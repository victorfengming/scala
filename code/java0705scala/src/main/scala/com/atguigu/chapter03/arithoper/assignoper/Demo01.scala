package com.atguigu.chapter03.arithoper.assignoper


object Demo01 {
  def main(args: Array[String]): Unit = {
    var num = 2
    num <<= 2 // 8
    num >>= 3 // 1
    println("num=" + num)

    // zai scala 中支持代码块 ,返回值
    // 而且返回的值的类型也可以变
    // 很灵活的
    val res = {
      if (num > 3) "hello,ok" else 100
    }
    println("res="+res)

    /**
     * num=1
     * res=100
     *
     * Process finished with exit code 0
     */
  }

}
