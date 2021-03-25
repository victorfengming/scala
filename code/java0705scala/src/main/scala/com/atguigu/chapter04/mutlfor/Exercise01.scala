package com.atguigu.chapter04.mutlfor

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-24 10:14 <br/>
 * <br/>
 *
 * @author yufengming
 * @email yufengming@travelsky.com
 * @project scala
 * @package com.atguigu.chapter04.mutlfor
 *          <p>
 *          修改记录
 *
 */

import scala.io.StdIn

object Exercise01 {

  /*
  应用实例：

  1.统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
    分析思路
    (1) classNum 表示 班级个数 , stuNum 表示学生个数
    (2) classScore 表示各个班级总分 totalScore 表示所有班级总分
    (3) score 表示各个学生成绩
    (4) 使用循环的方式输入成绩
  2.统计三个班及格人数，每个班有5名同学。
  3.打印出九九乘法表

   */

  def main(args: Array[String]): Unit = {
    val classNum = 3
    val stuNum = 5
    var score = 0.0 //分数
    var classScore = 0.0 //班级的总分
    var totalScore = 0.0 //所有班级总分
    for (i <- 1 to classNum) {
      //先将 classScore 清0
      classScore = 0.0
      for (j <- 1 to stuNum) {
        printf("请输入第%d班级的第%d个学生的成绩\n", i, j)
        score = StdIn.readDouble()
        classScore += score
      }
      //累计 totalScore
      totalScore += classScore
      printf("第%d班级的平均分为%.2f\n", i, classScore / stuNum)
    }
    printf("所有班级的平均分为%.2f", totalScore / (stuNum * classNum))
  }

  /*
  * D:\jdk1.8.0_162\bin\java.exe -javaagent:D:\JetBrains\IntelliJ_IDEA_2020.2.1\lib\idea_rt
  请输入第1班级的第1个学生的成绩
  98
  请输入第1班级的第2个学生的成绩
  78
  请输入第1班级的第3个学生的成绩
  59
  请输入第1班级的第4个学生的成绩
  96
  请输入第1班级的第5个学生的成绩
  94
  第1班级的平均分为85.00
  请输入第2班级的第1个学生的成绩
  * */

}
