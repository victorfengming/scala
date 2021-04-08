# 046_While循环

![image-20210324095416328](046_While%E5%BE%AA%E7%8E%AF/image-20210324095416328.png)

> scala的设计者他推荐使用for循环

```scala
package com.atguigu.chapter04.mywhile

object WhileDemo01 {
  def main(args: Array[String]): Unit = {
    //输出10句 hello,尚硅谷
    //1. 定义循环变量
    var i = 0
    //2. i < 10 条件
    while (i < 10) {
      println("hello,尚硅谷" + i) //循环体
      //循环变量迭代
      i += 1
    }
  }
}
```

![image-20210324100210788](046_While%E5%BE%AA%E7%8E%AF/image-20210324100210788.png)

> 在for循环中,这个i是val类型的



> scala的设计的理念是:
>
> 我们用的循环,函数,什么之类的也好
>
> 尽量的不要使用到**外部的变量**

> 那怎么实现不用到外部 的变量的,其实他是使用递归来进行变化的
>
> 

