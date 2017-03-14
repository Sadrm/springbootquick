## springboot-demo
springboot快速学习框架

### 框架初始化
master
初始是springboot的空架子，之后dao、service、controller、redis等整合将分别创建分支，方便自己使用

### 数据持久层

branch_1.1
整合mysql数据持久层
添加依赖

```xml
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>1.1.1</version>
</dependency>

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>5.1.21</version>
</dependency>
```

这里使用springboot默认的配置，创建`application.properties`文件，注意名字一定不能错！一定不能错！一定不能错！
在文件中配置数据库的一些参数
```xml
spring.datasource.url=jdbc:mysql://localhost:3306/sakila?characterEncoding=UTF-8
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```
建议不要手写，推荐“复制-粘贴”

接下来的mapper使用mybatis最新注解写法
创建对应数据表对应实体，创建对应Mapper接口,使用`@Mapper`注解，在对应的方法生命上使用以下注解

- @Insert
- @Update
- @Delete
- @Select

相关文档参见[MyBatis3](http://www.mybatis.org/mybatis-3/java-api.html#directoryStructure)

在test目录下编写测试方法
