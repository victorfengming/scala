# 019_Scala字符类型

![image-20210323103607551](019_Scala%E5%AD%97%E7%AC%A6%E7%B1%BB%E5%9E%8B/image-20210323103607551.png)

![image-20210323103616460](019_Scala%E5%AD%97%E7%AC%A6%E7%B1%BB%E5%9E%8B/image-20210323103616460.png)

```scala
package com.atguigu.chapter02.datatype

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-23 10:36 <br/>
 * <br/>
 *
 * @author yufengming
 * @email yufengming@travelsky.com
 * @project scala
 * @package com.atguigu.chapter02.datatype
 *          <p>
 *          修改记录
 *
 */
object CharDemo {
  def main(args: Array[String]): Unit = {
    var char1: Char = 97
    // 当我们输出一个char类型是,他会输出该数字对应的字符
    // 码值表unicode// unicode 码值表包括ascii
    // Unicode 字符编码 包含了 ANSI码
    println("char1=" + char1)

    // char 可以当做数字记性运算
    var char2: Char = 'a'
    var num = 10 + char2
    println("num=" + num)

    // 原因分析
    // 1. 当吧一个计算的结果赋值给一个变量,则编译器会进行类型转换以判断
    //    (即会看范围+类型)
    // 2. 当我们把一个字面量赋值到一个变量,则编译器会进行范围的判断
    var c2: Char = 'a' + 1
    var c3: Char = 97 + 1
    var c4: Char = 98
    var c5: Char = 298
    var c6: Char = 999
    var c7: Char = 99999// 这个就不成了
    /*
    * type mismatch;
 found   : Int(99999)
 required: Char
    var c7: Char = 99999// 这个就不成了
    * */
  }

}
```

```cmd
char1=a
num=107

Process finished with exit code 0
```

![image-20210323104454885](019_Scala%E5%AD%97%E7%AC%A6%E7%B1%BB%E5%9E%8B/image-20210323104454885.png)