# 049_实现Break和Continue

![image-20210324103513768](049_%E5%AE%9E%E7%8E%B0Break%E5%92%8CContinue/image-20210324103513768.png)

> scala的设计者, 认为 break和continue不是oop的风格

```scala
package com.atguigu.chapter04.mybreak

import util.control.Breaks._

object WhileBreak {
  def main(args: Array[String]): Unit = {

    var n = 1
    //breakable()函数
    //说明
    //1. breakable() 是一个高阶函数：
      	// 可以接收函数的函数就是高阶函数（后面详解）

    //2. def breakable(op: => Unit) {
    //    try {
    //      op
    //    } catch {
    //      case ex: BreakControl =>
    //        if (ex ne breakException) throw ex
    //    }
    //  }
    // (1) op: => Unit 表示接收的参数是一个没有输入，也没有返回值的函数
    // (2) 即可以简单理解成:可以接收一段代码块
      	// 把输入的地方拿掉,把返回地地方拿掉,不就是
    // 3. breakable 对break()抛出的异常做了处理,代码就继续执行
    // 4. 当我们传入的是代码块的时候，scala程序员会将() 改成{}
      // 以为代码比较多(用小括号就比较怪
    breakable {
      while (n <= 20) {
        n += 1
        println("n=" + n)
        if (n == 18) {
          //中断while
          //说明
          //1. 在scala中使用函数式的break函数中断循环
          //2. def break(): Nothing = { throw breakException }
          break()
        }
      }
    }

    println("ok~~")

    //注意break函数，可以使用在for或者do..while
    breakable {
      for (i <- 1 to 100) {
        println("i=" + i)
        if (i == 20) {
          break()
        }
      }
    }

    println("ok2~~~~")

  }
}

```

进入break

```scala
package scala.util.control
class Breaks() extends scala.AnyRef {
  def breakable(op : => scala.Unit) : scala.Unit = { /* compiled code */ }
  sealed trait TryBlock[T] extends scala.AnyRef {
    def catchBreak(onBreak : => T) : T
    
  }
  def tryBreakable[T](op : => T) : Breaks.this.TryBlock[T] = { /* compiled code */ }
  def break() : scala.Nothing = { /* compiled code */ }
}
object Breaks extends scala.util.control.Breaks {
}

```

> break是抛出异常的

![image-20210324105714874](049_%E5%AE%9E%E7%8E%B0Break%E5%92%8CContinue/image-20210324105714874.png)

```scala
package com.atguigu.chapter04.mycontinue

object ContinueDemo {
  def main(args: Array[String]): Unit = {
    //说明
    //1. 1 to 10
    //2. 循环守卫 if (i != 2 && i != 3) 这个条件为ture,才执行循环体
    //   即当i ==2 或者 i == 3时，就跳过
    for (i <- 1 to 10 if (i != 2 && i != 3)) {
      println("i=" + i)
    }

    //也可以写成如下的形式
    println("============================")
    for (i <- 1 to 10) {

      if (i != 2 && i != 3) {
        println("i=" + i)
      }

    }

  }
}
```

> 那么问题来了??? 以前的continue是可以在循环体中的任意位置进行结束本次循环的
>
>这个可以么???