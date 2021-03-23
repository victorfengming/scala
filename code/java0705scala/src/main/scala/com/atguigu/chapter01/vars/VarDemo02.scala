package com.atguigu.chapter01.vars

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-23 8:43 <br/>
 * <p>
 * 修改记录
 *
 */
object VarDemo02 {
  def main(args: Array[String]): Unit = {
    // 类型推导
    var num = 10 // 这个时候num就是int类型
    // 如何证明
    // 方式1,可以利用 idea的提示
    // 方式2,isInstanceOf
    println(num.isInstanceOf[Int])

    // 3.
    var age = 10 // age 是可以改变的.
    age = 30 // ok

    val num2 = 30
    // num2 = 40 ///报错
    // val 修饰的变量是不可以改变的
    /*
    *
    * 1. 在实际编程中,我么更多的需求是获取/创建一个对象后,读取该对象的属性,或者是修改对象的属性值
    2. 但是我们很少去改变这个对象本身
    3. 这时我们就可以使用它了,
    4. 因为 val 没有线程安全问题,因此效率高,scala的设计者推荐我们使用val
    5. 如果对象需要变化,则使用var
    * */

    val dog = new Dog
    //    dog = new Dog   // 报错 不能覆盖新对象
    // 但是属性可以改
    dog.age = 90
    dog.name = "小花"
    // 这样我即可也改变你的属性,又不可以改变整体对象
    // 这样就可以做底层的优化
    /// Java里面么有这个
    // 有个大神这么说的: 如果我早知道要是有这个Scala ,我都不新发明语言了
  }

}

class Dog {
  // 声明一个age属性,给了一个默认值
  var age: Int = 0 // 默认值0
  // 声明名字
  var name: String = "" //
}





























