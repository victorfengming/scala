package com.atguigu.chapter02.dataconvert

object String2Basic {
  def main(args: Array[String]): Unit = {
    val d1 = 1.2
    val s1 = d1+""//
    print(s1)

    // String 类型转换基本数据类型
    val s2 = "12"
    val num1 = s2.toInt
    val num2 = s2.toByte
    val num3 = s2.toDouble
    val num4 = s2.toLong

    print("ok~")
    //在将String类型转换成基本数据类型时,**要确保String类型能够转成有效的数据**,
    // 比如我们可以把"123",转成一个整数,但是不能吧"hello"转成一个整数
    val s3 = "hello"
    println(s3.toInt) // 执行会抛出异常
    // 你也可以通过这个异常来进行业务逻辑的处理
    // 这里先不讲了,在后续篇章中有专门的讲异常

    // 思考,我现在就是要把"12.5" 转成 Int
    // 在Scala中,不是将小数点后的数据记性截取,而是会抛出异常
    val s4 = "12.5"
    println(s4.toInt) // 报错
    println(s4.toDouble) // 这个就行

  }

}
