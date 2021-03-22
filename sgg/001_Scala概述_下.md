# 001_Scala概述_下.

![image-20210322104214781](001_Scala%E6%A6%82%E8%BF%B0_%E4%B8%8B/image-20210322104214781.png)

这个老哥是个很完美的人,他觉得jvm这种跨平台的特性好,但是又有一些不好的地方,比如这个语法就有些复杂

## .scala源码

// 1. 能够继续使用java的语法(部分)

`System.out.Println("hello")` 这个可以用

`HashMap<String,String>hm = new HashMap()` 这个就不能用了

// 2. scala特有的语法

var tuple = (1,20,"hello", 23.9)	// 元组 

这个在java里面是么有的,这个叫`元组`,python中的`元组`

var map = Map(("no",10),("no2",40))	// map

// 3. 增强 ,函数式编程
    1. 支持偏函数
        2. 支持函数的柯里化问题
        3. 支持高阶函数
        4. 将函数作为参数传递

// 4. 对于原来Java的代码做的包装
>看似是自己的其实,底层还是调用的Java的,说白了就是
> 从形式上看,是scala的类,但是这个类是对Java的类进行的包装



![image-20210322111040788](001_Scala%E6%A6%82%E8%BF%B0_%E4%B8%8B/image-20210322111040788.png)



