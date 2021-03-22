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

