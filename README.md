# Aplicação Web Completa com Tomcat JSF Primefaces JPA e Hibernate

Este projeto foi desenvolvido a partir da `master` disponível em [JSFCrudApp] (https://github.com/tuxied/JSFCrudApp), originalmente
desenvolvido por [Tuxied] (https://github.com/tuxied).

Para maiores informações acessar o material com tutorial sobre a aplicação desenvolvida:
 - [Português] (http://uaihebert.com/aplicacao-web-completa-tomcat-jsf-primefaces-jpa-hibernate/)
 - [Inglês] (http://uaihebert.com/full-web-application-with-tomcat-jsf-primefaces-jpa-hibernate/)

### Requisitos Mínimos
 - Eclipse Luna Version: Luna Service Release 1a (4.4.1) - Build id: 20150109-0600
 - Tomcat 7.0 
 - MySQL Server

### Configuração Básica
 - Criar um banco local em mysql

 `create database jsfcruddb`
 
- Adicionar ao menos um usuário ADMIN (originalmente com o logo do Real Madrid) e o outro uruário USER (como sendo Barcelona).
 
 `insert into jsfcruddb.users (email,name,password,role) values ('teste1@email.com','erik','123mudar','ADMIN');`

 `insert into jsfcruddb.users (email,name,password,role) values ('teste2@email.com','antonio','123mudar','USER');`
 
 ### Screenshot

<p align="center">
  <img src="https://github.com/aceiro/JSFCrudApp/blob/master/screenshot/login.png" alt="Screenshot"/>
</p>


### Desenvolvimento
 Essa versão do JSFCrudApp foi desenvolvida por Erik Aceiro Antonio para um breve curso de JSF/Hibernate e Padrões de Projeto.
