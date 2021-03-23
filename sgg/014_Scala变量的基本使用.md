# 014_Scala变量的基本使用

> 变量是程序的基本组成单位

> 在Scala中,使用var 来进行修饰

比如

```scala
object VarDemo01 {
    def main(args: Array[String]): Unit = {
        var age: Int = 10
        var sal: Double = 10.9
        var name:String = "tom" var isPass:Boolean = true
        //在 scala 中，小数默认为 Double ,整数默认为 Int
        var score:Float = 70.9f
        println(s"${age} ${isPass}")
    }
}
```

其实语言语法都不难

> 咱们编程最难的是什么,有2点

1. 业务逻辑(复杂的业务逻辑)你都不知道你要写什么
2. 对性能的优化难,你要实现这个功能很简单,再有就是(安全性)怎么保证

## 概念

变量相当于内存中的一个数据存储空间的表示,你可以吧变量看做是一个房间的门牌号,通过门牌号我们可以找到房间,而通过变量我们可以访问到变量(值)

## 变量使用的基本步骤
1. 声明/定义 变量(Scala要求变量声明时初始化)
2. 使用

> 在你学Java的时候,老师会说,对象一般要存在堆里面的
>
> 基本数据类型一般是放在栈里面的

> 编译器: 动态的 ( 逃逸分析)

生命周期比较长,然后他经常被引用到,这样的变量一般放在堆空间里面

