# How Stuff Works - Java

Java 版本的十万个为什么，记录了我平时在使用 Java 过程中遇到的问题及找到的答案

## Q1 初识 Interface

基本用法

    interface 中的 field 或者 method 只支持 default 或者 public 的修饰符，其他的都不支持，但是 interface class 本身倒是支持 default 的修饰，在测试的时候限制他的生效范围。  
    interface 中的 field 是 static 和 final 的。

java 8 支持的 default + 实现 的接口方法

    在 java 7 及以前，这种带默认方法实现的 method 是不支持的。但是这种实现方式会导致一个问题。比如本地项目实现了第三方包的接口，如果第三方包在接口中新添加了方法，那么我本地的项目也必须添加对应的新方法实现才能保证项目能正确编译。  
    java 8 中我们可以通过在 interface 中使用 default 关键字修饰的带实现的方法来避免这种情况。

interface 中通过 default 和 static 修饰的方法都需要提供具体实现，那两者在使用时有什么区别呢

    static 修饰的方法时 interface 自己的方法，在实现了这个接口的 class 是不能调用的，也不能重载，只有通过 interface 才能调用。而 default 是可以在实现方法的 class 中重载的。

为什么 interface 的默认修饰符是 public 而其他 class 是 package level 的

    这个问题有点本末倒置了，应该从 interface 的定义来说明为什么它里面的所有的变量，方法都是 public 的才对。从 thinking in java 上的阐述来看，interface 可以看作是一个协议。告诉 class 要实现什么，而不是怎么实现。
    上面这个解释有点牵强，或者没到点上。我对这个问题的疑惑可能更多的是把他和 protect/private 搞混了。想想 protect/private 是继承的范畴内的，和 interface 的 '实现' 的这个概念应该是八杆子打不着的才对，只不过很相似。

如果 class 实现的两个 interface 有同名，同参数列表的方法，需要怎么处理

    这种情况下，都需要在 class 提供方法实现，不然会编译错误

一个很 impressive 的 interface + generic 的例子

    例01 中没有使用范型，那么每次调用 produce 方法后都需要对结果进行强转  
    例02 中使用范型指定返回值类型，避免重复的类型转化，但是会引申出新的问题，如果传入的范型不是 car 类型，就会跑出类型转化异常  
    例03 中使用范型 + 返回值强制指定的方式达到简化代码的目的，6到飞起  

那么问题又来了，Java 是怎么实现 interface 和 class 的 default modifier 的

    TBD 我猜这个和 JVM 的实现又关系，等我查查资料再说。可能需用通过 JVM 中 interface 的规范，类似这种 concept 去搜索结果

### Refers

[Interface Tutorials](http://tutorials.jenkov.com/java/interfaces.html)
[Diff of static & default in Interface](https://www.quora.com/Why-are-static-and-default-interface-methods-added-in-Java-1-8)

## Q2 范型的基本用法

范型的基本格式为 `MyProducer<String> myStringProducer = new CarProducer<String>();` 一直不是很清楚规范是什么

    TBD

## Q3 Class.getResource() 和 ClassLoader.getResource() 的基本用法以及区别

基本用法

    `Class.getResource()` 和 `ClassLoader.getResource()` 都会在 resource 文件夹下寻早指定的文件  
    他们并不会在 class 文件所在的路径下寻找，在公司的项目中能找到应该是那个项目有什么特殊的路径设置

Class.getResource 使用注意点，他和 ClassLoader.getResource 的区别

    不以 `\` 为开头，取相对路径，append 文件名，调用 class loader 的 getResource 查找文件  
    以 `\` 为开头，去掉最开始的斜杠，以修改后的路径为索引，调用 class loader 的 getResource 查找文件
    
    和 ClassLoader.getResource 之间与其说区别，还不如说一开始理解就有问题，他们两个出了名字很像，其他根本没什么关系。。。 
    loader 在找 resource 的时候会先调用父 loader 去寻找，早不到再调用自己，和 class 的双亲委派一个样。
    如果在 ClassLoader.getResource 时路径前加了 `\` 那么你基本方法调用会失败。


