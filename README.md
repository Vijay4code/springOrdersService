# springOrdersService
a sample orders service with spring

Create package with maven
> ./mvnw clean package


Run the jar 
> java -jar target/springOrdersService-0.0.1-SNAPSHOT.jar


Run from code
> mvn spring-boot:run


Run tests
> mvn test


Dependencies :-
1. Maria DB (https://mariadb.com/)


Steup :-
1. Create DB and user
   > create database orders;
                         
   > create user 'springuser'@'%' identified by 'springpwd';
                                                                                
   > grant all on orders.* to 'springuser'@'%';                 
2. Update DB config in application.properties


Notes:-
1. Uses Mysql DB
