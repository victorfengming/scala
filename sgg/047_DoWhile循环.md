# 047_DoWhile循环

![image-20210324100708108](047_DoWhile%E5%BE%AA%E7%8E%AF/image-20210324100708108.png)

```scala
package com.atguigu.chapter04.mydowhile

/*
* While 是 问你还不还钱,要是还了就没事儿了
* 
* Do While 是先打你一顿,在问你还不还钱
* 
* */
object Demo01 {
  def main(args: Array[String]): Unit = {
    var i = 0 // for
    do {
      printf(i + "hello,尚硅谷\n")
      i += 1
    } while (i < 10)
  }
}

```

![image-20210324100901705](047_DoWhile%E5%BE%AA%E7%8E%AF/image-20210324100901705.png)