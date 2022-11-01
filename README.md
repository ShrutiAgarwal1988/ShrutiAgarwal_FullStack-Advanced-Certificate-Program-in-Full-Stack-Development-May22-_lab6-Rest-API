# ShrutiAgarwal_FullStack-Advanced-Certificate-Program-in-Full-Stack-Development-May22-_lab6-Rest-API
lab 6 rest api
create database spring_db;
use spring_db;
select * from users;
drop table users;
insert into users values(1,'$2a$12$WTqvN6Jm5ysK/E1whfn.ceXoNlt8edAAi.mfzhxO9.3y25IACiaGW','shruti');
insert into users values(2,'user123','user1');
update  users set password='$2a$12$FyUeB.60V5neun/KY6NkHurdfHlKiKpZdlXXevEcFkLq4AtUwSHTW' where user_id=1; 

select * from student;
insert into users values(3,'$2a$12$AdVLlyc5/34qbkg0H3aV3.zwfpxFxZMkeIVNM12p2k8zr8yLx9V1G','ravi');


insert into roles values(1,'ADMIN');
insert into roles values(2,'USER');

insert into users_roles values(1,1);
insert into users_roles values(2,2);
select * from users;
select * from roles;
delete from users_roles;
select * from users_roles; 
==================================================================================
server.port=8224
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/spring_db
spring.datasource.username=root
spring.datasource.password=root

server.servlet.context-path=/StudentManagement2


spring.mvc.view.prefix: /WEB-INF/views/
spring.mvc.view.suffix: .jsp
