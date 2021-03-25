package com.atguigu.chapter05

/**
 *
 * *
 *
 * @author victor
 *         *
 * @site https://victorfengming.gitee.io/
 *       *
 * @project scala
 *          *
 * @package com.atguigu.chapter05
 *          *
 * @created 2021-03-25 21:54
 */
object DiguiTest01 {
  def main(args: Array[String]): Unit = {
    test(4)
    println("---------")
    test2(4)
  }

  def test(n: Int): Unit = {
    if (n > 2) {
      test(n - 1)
    }
    print(n)
  }

  def test2(n: Int): Unit = {
    if (n > 2) {
      test2(n - 1)
    } else {
      print(n)
    }
  }
  /**
   * 234---------
   * 2
   * Process finished with exit code 0
   * */
}
