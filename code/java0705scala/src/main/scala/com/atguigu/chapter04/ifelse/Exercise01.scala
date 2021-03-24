package com.atguigu.chapter04.ifelse

import scala.io.StdIn

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-24 8:49 <br/>
 * <br/>
 *
 * @author yufengming
 * @email yufengming@travelsky.com
 * @project scala
 * @package com.atguigu.chapter04.ifelse
 *          <p>
 *          修改记录
 *
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    /*
    * 月小鹏参见scala考试 ,他和父亲玉不群达成成阔以
    * 如果
    * 成绩100 BMW
    * (80,90] iphone10
    *
    * */
    println("请输入成绩:")
    val score = StdIn.readDouble()
    if (score == 100) {
      println("成绩100,奖励BMW")

    }else if(score>80&&score<=90){
      println("成绩80多,奖励iphoneX")
    }else if(score>60&&score<=80){
      println("成绩60多,奖励ipad")
    }else{
      println("毛豆没有")
    }
  /*
  *
  * 请输入成绩:
  83
  成绩80多,奖励iphoneX

  Process finished with exit code 0
  */
  }

}
