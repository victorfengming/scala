package com.atguigu.chapter03.arithoper

/**
 * ClassName: ${CLASS_NAME} <br/>
 * Description: ${CLASS_NAME} <br/>
 * Date: 2021-03-23 16:01 <br/>
 * <br/>
 *
 * @author yufengming
 * @email yufengming@travelsky.com
 * @project scala
 * @package com.atguigu.chapter03.arithoper
 *          <p>
 *          修改记录
 *
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    /**
     * 假如还有 97 天 放假 ,问: xx个星期 零xx天
     * 1. 搞清楚需求(读题)
     * 2. 思路分析
     *    2.1 变量保存 天数
     *    2.2.  使用/ 7 得到几个星期
     *    2.3 xx天使用%
     * 3. 代码实现
     */
    val days = 97
    printf("统计结果 %d个星期 零%d天",days/7,days%7)

    /**
    * 定义一个变量保存花式温度,花式温度转换摄氏温度的公式为: 5/9 * (花式温度 - 100)
     * 请求出华氏温度对应的奢侈温度 [ 测试: 232.5]
     * 分析
     *  1. 变量保存华氏温度,变量保存摄氏温度
     *  2. 公式有,直接就套用
     *
    * */
    val sheshi = 232.5
//    val huashi = 5 / 9 * (sheshi - 100)
    val huashi = 5.0 / 9 * (sheshi - 100)
    println(s"对应的摄氏温度是$huashi")

  }

}
