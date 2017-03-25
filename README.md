### springboot-demo
springboot快速学习框架
master初始是springboot的空架子，之后dao、service、controller、redis等整合将分别创建分支，方便自己使用


### linkedinCrawler
一个采集领英个人信息的程序

#### 打包
```bash
mvn install -Dmaven.test.skip=true
```
在项目目录`target`目录下找对应`jar`包

#### 运行
```bash
java -jar linkedin-1.0.jar param1 param2 param3
```
*注意*：
- param1 用户名
- param2 密码
- param3 爬取点

这三个参数必填