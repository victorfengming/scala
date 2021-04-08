# 015_Scala变量的注意事项.

### 变量声明基本语法

var|val 变量名[:变量类型] = 变量值

### 注意事项

1. 声明变量时,类型可以省略(编译器自动推导,即类型推导)
2. 类型确定后,就不能修改了,说明Scala是强数据类型语言.
3. 在声明/定义一个变量时,可以使用var或者val来修饰,var修饰的变量可变,val修饰的变量不可改
4. val修饰的变量在编译后,等同于加上final,通过反编译看下底层代码.





```scala
package com.atguigu.chapter01.vars

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-23 8:43 <br/>
 * @project scala
 * @package com.atguigu.chapter01.vars
 * @version 产品版本信息 2021年03月23日8:43分 yufengming(yufengming@travelsky.com) 新建<br/>
 *          <p>
 *          修改记录
 *
 */
object VarDemo02 {
  def main(args: Array[String]): Unit = {
    // 类型推导
    var num = 10// 这个时候num就是int类型
    // 如何证明
    // 方式1,可以利用 idea的提示
    // 方式2,isInstanceOf
    println(num.isInstanceOf[Int])
    //3
    val num2 = 30
    // num2 = 40 ///报错
    // val 修饰的变量是不可以改变的
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



```

![image-20210323084542313](015_Scala%E5%8F%98%E9%87%8F%E7%9A%84%E6%B3%A8%E6%84%8F%E4%BA%8B%E9%A1%B9/image-20210323084542313.png)

> Scala的设计者,为什么设计了 2 种不同的  var 和 val

1. 在实际编程中,我么更多的需求是获取/创建一个对象后,读取该对象的属性,或者是修改对象的属性值
2. 但是我们很少去改变这个对象本身
3. 这时我们就可以使用它了,
4. 因为 val 没有线程安全问题,因此效率高,scala的设计者推荐我们使用val
5. 如果对象需要变化,则使用var

> 如果你使用val修饰的变量,等同于加上final了

```scala
package com.atguigu.chapter01.vars

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-23 9:06 <br/>
 *          <p>
 *          修改记录
 *
 */
object VarDemo03 {
  var name = "hello"
  val age = 100

  def main(args: Array[String]): Unit = {
    println("ok")
  }

}
```

这样在反编译的时候就可以看到

val 的有final

