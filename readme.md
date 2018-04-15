创建项目的记录
============================

1. 先创建常规的三个层， 分别是 持久层(repository), 业务层(services)， 控制层(controller)


2. 既然项目是高 CURD的， 那么一般首先建立好的层分别是 repository,  model 两个层， 这样后面写逻辑才方便点， 先想好数据源， 这样也是一个好方法


3. 一般建立 model的时候， 都有一些通用的方法， 这些方法可以封装在 model下面的 BaseEntity 下面去


4. java bean 是做什么的呢？？？ 也就是这个项目方在 bean 目录下面的class是干什么用的呢？？  跟model 目录有什么区别呢？？ 
  
  model 目录是具体 持久化 到数据库的某个表的， 你可以看到有@Table 这些注解，  而javabean呢， 是从 model 里面抽取数据出来的逻辑， 也是就  可以理解为 操作 model 的逻辑代码就是封装在 javabean 里面的， 而真正映射 数据库 的代码，是在 model 里面的。。。 会不会觉得过于封装呢？？？？ 这个见仁见智吧
  其实这个 javabean 就等于使用 hibernate 的时候 那个所谓的 services 层， 就是操作数据库， 但是没有跟数据库一一对应做持久化的这么一个层,  而model层的话就相当于 DAO 层
   
   
5. manager 目录其实也算是属于 controller 作用的范畴， 只是自己把一些逻辑代码封装一下， 起的 package 的名字




