package com.atguigu.chapter05

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-24 13:54 <br/>
 * <br/>
 *
 * @author yufengming
 * @email yufengming@travelsky.com
 * @project scala
 * @package com.atguigu.chapter05
 *          <p>
 *          修改记录
 *
 */
object Method2Function {
  def main(args: Array[String]): Unit = {
    // 使用方法
    // 先创建一个对象
    val dog = new Dog
    println(dog.sum(10,20))

    //方法 如何转换成函数
    // 他们可以做到无缝的转换
    //
    var f1 = dog.sum _
    println("f1="+f1)

    // 使用方法
    //
    println("f1"+f1(50,60))
    /*
    * 30
    f1=com.atguigu.chapter05.Method2Function$$$Lambda$3/466002798@387c703b
    f1110
    * */

    // 函数, 求两个数的和
    val f2 = (n1:Int,n2:Int) => {
      n1+n2// 函数体
    }
    println("f2=",f2)
    println("f2=",f2(3,8))

    /**
     * (f2=,com.atguigu.chapter05.Method2Function$$$Lambda$4/205125520@71e7a66b)
     * (f2=,11)
     */
  }

}


class Dog{
  // 方法
  def sum(n1:Int,n2:Int):Int = {
    n1+n2
  }
}