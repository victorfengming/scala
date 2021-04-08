# 016_Scala数据类型的一览图

### Scala数据类型介绍

- Scala与Java有着相同的数据类型,**在Scala中数据类型都是对象**,也就是手Scala没有java中的原生类型

- Scala数据乐行分为两大类 AnyVal(值类型) 和 AnyRef(引用类型),注意:**不管是AnyVal还是AnyRef都是对象**

- 相对于Java的类型系统,Scala要复杂些!也正是这复杂多变的类型系统才让面向对象编程和函数式编程完美的融合在了一起.



> 变量声明的时候,要进行初始化
>
> 不像Java

```scala
package com.atguigu.chapter02.datatype

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-23 9:14 <br/>
 * <br/>
 * @author yufengming
 * @email yufengming@travelsky.com
 *          <p>
 *          修改记录
 *
 */
object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    //
    var num1:Int = 10
    // 因为Int 是一个类,因此他的一个实例,就可以使用很多方法
    /// 在Scala中,如果一个方法,没有形参,则可以省略()
    println(num1.toDouble + "\t"+num1.toString)
    sayHi
    sayHi()
    /*
    * 10.0	10
    say hi
    say hi
    
    Process finished with exit code 0
    * */
  }
  def sayHi():Unit = {
    println("say hi")
  }

}

```



![image-20210323091605417](016_Scala%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%E7%9A%84%E4%B8%80%E8%A7%88%E5%9B%BE/image-20210323091605417.png)

> 没有形参,可以不写括号
>
> 我认为这种方式不好,这样不能够体现出方法的执行
>
> 如果是把方法本身赋值到变量中,这个时候也执行么???
>
> 显然不执行,而这个时候也是么有括号的方法名>>>
>
> 就离谱!!!

## 数据类型

![image-20210323092927121](016_Scala%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%E7%9A%84%E4%B8%80%E8%A7%88%E5%9B%BE/image-20210323092927121.png)

![image-20210323092908049](016_Scala%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%E7%9A%84%E4%B8%80%E8%A7%88%E5%9B%BE/image-20210323092908049.png)

小结

1. 在Scala里面,有一个根类型 Any,它是所有类的父类.

2. Scala中一切皆为对象,分为2大类AnyVal(值类型),AnyRef(引用类型),他们都是Any子类,

3. Null类型是scala的特别类型,他只有一个值null,它是bottom class,是所有AnyRef类型的子类

4. Nothing类型也是bottom class ,它是所有类的子类,在开发中通常可以将Nothing类型的值,返回任意变量或者函数,这里抛出异常使用的多.

5. 在Scala中仍然遵守,低精度的值,向高精度的值自动转换.

   

```scala
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

```



终端中



```cmd
D:\jdk1.8.0_162\bin\java.exe -javaagent:D:\JetBrains\IntelliJ_IDEA_2020.2.1\lib\idea_rt.jar=57017:D:\JetBrains\IntelliJ_IDEA_2020.2.1\bin -Dfile.encoding=UTF-8 -classpath D:\jdk1.8.0_162\jre\lib\charsets.jar;D:\jdk1.8.0_162\jre\lib\deploy.jar;D:\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;D:\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;D:\jdk1.8.0_162\jre\lib\ext\dnsns.jar;D:\jdk1.8.0_162\jre\lib\ext\jaccess.jar;D:\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;D:\jdk1.8.0_162\jre\lib\ext\localedata.jar;D:\jdk1.8.0_162\jre\lib\ext\nashorn.jar;D:\jdk1.8.0_162\jre\lib\ext\sunec.jar;D:\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;D:\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;D:\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;D:\jdk1.8.0_162\jre\lib\ext\zipfs.jar;D:\jdk1.8.0_162\jre\lib\javaws.jar;D:\jdk1.8.0_162\jre\lib\jce.jar;D:\jdk1.8.0_162\jre\lib\jfr.jar;D:\jdk1.8.0_162\jre\lib\jfxswt.jar;D:\jdk1.8.0_162\jre\lib\jsse.jar;D:\jdk1.8.0_162\jre\lib\management-agent.jar;D:\jdk1.8.0_162\jre\lib\plugin.jar;D:\jdk1.8.0_162\jre\lib\resources.jar;D:\jdk1.8.0_162\jre\lib\rt.jar;D:\IdeaProjects\scala\code\java0705scala\target\classes;D:\env\scala\lib\scala-library.jar;D:\env\scala\lib\scala-reflect.jar com.atguigu.chapter02.datatype.TypeDemo02
Exception in thread "main" java.lang.Exception: 抛出异常
	at com.atguigu.chapter02.datatype.TypeDemo02$.sayHello(TypeDemo02.scala:22)
	at com.atguigu.chapter02.datatype.TypeDemo02$.main(TypeDemo02.scala:14)
	at com.atguigu.chapter02.datatype.TypeDemo02.main(TypeDemo02.scala)

Process finished with exit code 1
```

