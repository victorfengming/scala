package com.atguigu.chapter02.datatype

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-23 9:33 <br/>
 * <br/>
 * <p>
 * 修改记录
 *
 */
object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    print(sayHello)

    var num = 1.2 // 默认为double
    var num2 = 1.7f   // 这是float
//    num2 = num // Error ,修改num2
    num2 = num.toFloat  //  ,修改num2
  }


  // 比如开发中,我们有一个方法,就会异常中断,这个时候,就可以返回Nothing
  // 即当我们Nothing做返回值,就是明确该方法没有没有正常返回值
  // 有些时候抛异常,也可以作为业务逻辑
  def sayHello: Nothing = {
    throw new Exception("抛出异常")
  }

}
