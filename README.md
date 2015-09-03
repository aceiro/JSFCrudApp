lägg till projektet i eclipse.

h2 jar behöer vara i projektet, ska följa med.
h2 kan köras från bat fil om man tar ner det från weben. webappen skriver mot fil på c:\ 
användare med rollerna user och admin behöver skapas i user tabellen i databasen.

e-mail är inloggnings uppgiften i webappen.

http://localhost:8080/JSFCrudApp/

----------------------------------
http://uaihebert.com/?p=1440
Full Web Application with Tomcat JSF Primefaces JPA Hibernate


--------------------

You need to create a user with the role ADMIN (I named this user Real Madrid) and another user with the USER role (I named it Barcelona). 
The ADMIN user will have access to all system under all folders but the user with the USER role will have access to the pages under the folder defaultUser.

--------------------
Aplicação Web Completa com Tomcat JSF Primefaces JPA e Hibernate

Será necessário criar ao menos um usuário ADMIN (originalmente com o logo do Real Madrid) e o outro uruário USER (como sendo Barcelona).

Segue um exemplo de insert:

insert into `jsfcruddb`.users (email,name,password,role) values ('teste@email.com','erik','123mudar','ADMIN');

insert into `jsfcruddb`.users (email,name,password,role) values ('teste@email.com','antonio','123mudar','USER');
