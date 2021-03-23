package com.atguigu.chapter02.iden

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-23 14:38 <br/>
 * <br/>
 * @author yufengming
 * @email yufengming@travelsky.com
 * @project scala
 * @package com.atguigu.chapter02.iden

 *
 */
object IdenDemo01 {
  def main(args: Array[String]): Unit = {
    // 首字符为操作符(比如 +-*/),后续字符也需要跟操作符,至少一个
    val ++ = "hello,world"
    println(++)

    val -+ = 90
    println("res="+ -+)

    val +-+ = "绝了"
    println(+-+)

    val ^-^ = "这变量名,真是卧槽"
    println(^-^)

    val name = 386
    println(s"$name wonderful")
    // 实际项目中这么用,会被打死的

    // 这个只能出在面试题中

    val +-*/ = 90 // ok

    // 看看编译器怎么处理的
    // ++ => $plus$plus
    // val +q = "abc" //error
    // 用反引号 `...` 包含的任意字符串,即时是关键字(39个)也可以
    var `true` = "helloworld"
    println(`true`)

    // mysql 里面的sql语句不也是这样么
    // 比如我就要求 int 作为表的名字

    val Int = 90.45
    println("int="+Int)
    // 不能使用_ 作为标识符
    var _ = "jack"  // 报错missing parameter type for expanded function ((<x$2: error>) => println(x$2))
    println(_)
  }
}
