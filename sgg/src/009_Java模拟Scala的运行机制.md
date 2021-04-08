# 009_Java模拟Scala的运行机制

只要以后看到Object TestScala,你应该有这样一个认识

// 1. object TestScala 对应的是一个 TestScala$的一个静态对象 MODULE$

2. 在我们的程序中,它是一个单例的

![image-20210322163557665](009_Java%E6%A8%A1%E6%8B%9FScala%E7%9A%84%E8%BF%90%E8%A1%8C%E6%9C%BA%E5%88%B6/image-20210322163557665.png)

![image-20210322163545870](009_Java%E6%A8%A1%E6%8B%9FScala%E7%9A%84%E8%BF%90%E8%A1%8C%E6%9C%BA%E5%88%B6/image-20210322163545870.png)