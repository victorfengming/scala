# 003_Scala语言特点

![image-20210322111841853](003_Scala%E8%AF%AD%E8%A8%80%E7%89%B9%E7%82%B9/image-20210322111841853.png)

> 在Scala里面,java的三元运算被拿掉了

```scala
// 在scala里面这么写
val res = if(条件表达书)值 else 值
```

```java
int i = 10;
i++;
```

上述代码在scala里面写就报错了

```scala
var i:int = 10
i++// 错误
i+=1	// ok ,这种 就看清晰
// 你写++ ,-- 就得看晕了
```

> 如何规范的使用scala

真正coder的行为:你不要问我为什么?我舅会用!!!

