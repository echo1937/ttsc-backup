# ttsc-backup
重构, 备份, 测试


####08. 运行Maven的聚合工程(测试maven工程)
注意点:
+ 使用maven的tomcat插件, 以代替繁琐的部署工作
  + 在taotao-manager-web的webapp下建立一个index欢迎页
  + 在taotao-manager下执行, 因为没有经过聚合web工程taotao-manager-web是无法工作的
+ 在taotao-manager的pom.xml文件中配置tomcat7-maven-plugin插件
  + 需要配置插件的path和port参数, 具体的配置请查阅第一天笔记


启动工程:
+ 运行Maven base目录: taotao-manager的目录
+ 使用的maven命令: clean tomcat7:run
  + clean表示先执行clean操作, 清除之前编译的内容
  + tomcat7指定使用的tomcat7插件
  + 直接点击IDE中相关模块下的plugins的动作也是可以的, 就是麻烦一些

注意：
+ 需要把taotao-parent工程安装到本地仓库。
+ 需要把taotao-common工程安装到本地仓库。
  + 安装操作的执行方法为Lifecycle下的install动作
  + 为什么首次运行要install这2个工作, 因为taotao-manager是依赖于common和parent工程.
