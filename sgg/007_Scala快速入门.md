# 007_Scala快速入门.

## Scala helloworld

需求说明:

​	要求开发一个Hello.scala程序,可以输出"hello,世界!"



### window 下开发步骤

1. 可以直接使用文本开发工具[editplus]
2. 将Scala代码编写到扩展名为Hello.scala的文件中[说明: Scala代码编写到扩展名为Hello.scala的文件中]
3. 通过scalac 命令对该 scala文件进行编译,生成.class文件.[和Javac类似]
4. 命令行下面 执行 scala Hello 就可以看到运行效果
5. 注意: scala Hello.scala命令可以直接运行 Hello.scala程序[内部也会有编译和运行过程]

我们可以先不用idea开发,这样可以看到底层的结构



> 先创建一个文件,命名为HelloJava.java

内容如下

```java
public class HelloJava
{
    public static void main(String[] args) {
        System.out.println("hello,java!!!");
    }
}
```

在终端运行

```cmd
D:\IdeaProjects\scala\code\HelloDemo>javac HelloJava.java

D:\IdeaProjects\scala\code\HelloDemo>java HelloJava
hello,java!!!

D:\IdeaProjects\scala\code\HelloDemo>

```

---

然后,在对比的创建一个`HelloScala.scala`文件,内容如下

```scala
object HelloScala{
  def main(args: Array[String]): Unit = {
    println("hello,scala!!!")
  }
}

```


在终端编译运行







```shell script
D:\IdeaProjects\scala\code\HelloDemo>D:\env\scala\bin\scalac HelloScala.scala

D:\IdeaProjects\scala\code\HelloDemo>D:\env\scala\bin\scala HelloScala
hello,scala!!!

D:\IdeaProjects\scala\code\HelloDemo>
```


---

```scala
// 说明
/*
* 1. object 表示一个伴生对象,这里我们可以简单的理解就是一个对象
* 2. HelloScala就是对象的名字,他底层真正的对应的类名是`HelloScala$`,类型的一个静态对象MODULE$
* . 使用jd-gui.exe 能够反编译 对应的 文件(但是我可以用idea的插件里面看)
* 3. 当我们编写一个object HelloScala 底层会生成2个.class文件,分别是HelloScala和HelloScala$
* 4. scala在运行时,的流程如下
*   4.1 先从HelloScala的main开始执行
*   4.2 然后调用
* */

object HelloScala{
  /*
  * 说明
  * 1. def 表示是一个方法,这是一个关键字
  * 2. main表示方法名字,表示程序入口
  * 3. args:Array[String]表示形参,scala的特点是将参数名在前,类型标识在后
  * 4. Array[String]表示类型数组
  * 5. :Unit = 表示该函数的返回值为空(void)
  * 6. println("hello,scala!!!") 输出一句话
  * */
  def main(args: Array[String]): Unit = {
    println("hello,scala!!!")
  }
}

```
>2个编译出来的class文件,为什么要这么做呢? 
>
>音为Scala的设计者把静态和非静态的代码分开了
>
>他认为静态不是属于面向对象的范畴
>
>然后他怎么去表示呢
>
>他把一个类天然的分成了2部分

---

互相执行测试



```shell script
D:\IdeaProjects\scala\code\HelloDemo>dir
 驱动器 D 中的卷是 新加卷
 卷的序列号是 A4B3-9429

 D:\IdeaProjects\scala\code\HelloDemo 的目录

2021/03/22  14:40    <DIR>          .
2021/03/22  14:40    <DIR>          ..
2021/03/22  14:35               425 HelloJava.class
2021/03/22  14:35               127 HelloJava.java
2021/03/22  14:40               684 HelloScala$.class
2021/03/22  14:40               645 HelloScala.class
2021/03/22  15:10             1,027 HelloScala.scala
               5 个文件          2,908 字节
               2 个目录 185,545,084,928 可用字节

D:\IdeaProjects\scala\code\HelloDemo>java HelloJava
hello,java!!!

D:\IdeaProjects\scala\code\HelloDemo>java HelloScala
Exception in thread "main" java.lang.NoClassDefFoundError: scala/Predef$
        at HelloScala$.main(HelloScala.scala:3)
        at HelloScala.main(HelloScala.scala)
Caused by: java.lang.ClassNotFoundException: scala.Predef$
        at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:338)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
        ... 2 more

D:\IdeaProjects\scala\code\HelloDemo>java HelloScala$.class
错误: 找不到或无法加载主类 HelloScala$.class

D:\IdeaProjects\scala\code\HelloDemo>D:\env\scala\bin\scala HelloJava.class
No such file or class on classpath: HelloJava.class

D:\IdeaProjects\scala\code\HelloDemo>D:\env\scala\bin\scala HelloJava
hello,java!!!

D:\IdeaProjects\scala\code\HelloDemo>

```