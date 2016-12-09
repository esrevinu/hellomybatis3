# SpringMVC+MyBatis 初始框架配置
## 数据库配置
Ubuntu安装MySQL
```
sudo apt get install mysql-server(安装过程中会输入密码)
vim /etc/mysql/my.cnf
//注释掉bind-address= 127.0.0.1，这样其他host就可以访问mysql了，否则只能自己访问
sudo service mysql restart

mysql -u root -p
create database hellomybatis;

insert into mysql.user(Host,User,Password) values("localhost","test",password("1234"));
如果想让用户在其他host上也可以登录到mysql则将localhost换成%

grant all privileges on hellomybatis.* to test@"%" identified by 'test';
授予test用户hellomybatis数据库的所有权限，并且可以于localhost以外的server访问

```
