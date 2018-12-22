需求:
    光标失去判断用户名是否已经存在.

实现:
    1.准备:  jar 包: mysql  c3p0  dbutil
    2.配置文件  c3p0.xml
    3.js 的类库 : juquery.js
    4.工具类:JDBCUtil工具类
    5.包结构
    6.数据库
    create database day17_project01;
    use day17_project01;
    create table users(
        id int primary key auto_increment,
        name varchar(20),
        password varchar(20)
    );
    insert into users values(null, 'zhangsan','123');
    insert into users values(null, 'lisi','123');

    7.编写前台reg.html


    8.编写后台
    web
        接受参数用户名name---传给service
    service
        调用dao--- name传给dao
    dao
        编写jdbc的代码根据name去数据库中查询,如果查到了返回1 ,如果没查到返回0

