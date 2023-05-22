
REST API демо

-----------------
ТЕХСТЕК

Spring Boot
https://spring.io/projects/spring-boot

H2 Database
https://www.h2database.com/html/main.html

Lombok
https://projectlombok.org/

--------------------------------

1) Переходимо до Spring Initializr
 https://start.spring.io/

2) Конфігурація проекту
(цифрові позначення версій можуть
змінюватись з розвитком фреймворку):
  a) Project: Maven
  b) Spring Boot: 3.0.6
  c) Project Metadata:
    Group: com.example.app
    Artifact: C
    Name: RestDemo
    Description: залишаємо так
    Packaging name: залишаємо так
    Packaging: Jar
    Java: 17
  d) Dependencies:
    Spring Boot DevTools
	Lombok
    Spring Web
    Spring Data JPA
    H2 Database
	
* Spring Boot за замовчуванням включає spring-boot-starter-logging
у якості транзитивної залежності для модулю     spring-boot-starter.
Це SLF4J разом з реалізацією Logback.
SLF4J  https://www.slf4j.org/
Logback Project  https://logback.qos.ch/


3) Перевіряємо. Клікаємо GENERATE.

4) Зформований zip-файл розпакуємо,
переміщуємо в папку проектів.

5) Відкриваємо проект в IDE. Досліджуємо
    src/main/
    pom.xml

6) Додаємо контент до
	application.properties

7) Модифікуємо
    RestDemoApplication

8) В com.example.app.SpringBootRestH2Client
формуємо необхідний контент.

9) Стартуємо програму. Дивимося логи.
В консолі IDE має бути доступність H2 DB
H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:demo_db'

10) Для отримання інтерфейсу H2, в браузере вводимо
localhost:8080/h2-console

11) Входимо в БД за відповідними налаштуваннями
проекту (JDBC URL, User Name, Password), які
зазначаються в application.properties.

12) В інтерфейсі H2 робимо SQL-запит(и)
SELECT * FROM employees



Тест REST API
----------------------

Повідомлення логування будуть 
в консолі IDE після REST-запиту.

Postman для тесту REST API
https://www.postman.com/

Стартуємо додаток в IDE.

1) REST-запит на отримання даних

GET http://localhost:8080/api/employees


2) REST-запит на створення даних

POST http://localhost:8080/api/employees

Налаштування в Postman: Body, raw, JSON.
Прописуємо при кожному запиті окремо.


{
	"firstName": "Alice",
	"lastName": "Cooper",
	"phone": "555 123-4587"

}


{
	"firstName": "Lucy",
	"lastName": "Wills",
	"phone": "555 111-9944"

}

{
	"firstName": "Jessica",
	"lastName": "Owen",
	"phone": "555 777-1234"

}

{
	"firstName": "Robert",
	"lastName": "Mercury",
	"phone": "555 012-7833"

}



3) REST-запит на отримання даних за id

GET http://localhost:8080/api/employees/2


4) REST-запит на оновлення даних за id.
Налаштування в Postman: Body, raw, JSON.

PUT http://localhost:8080/api/employees

{
	"id": 5,
	"name": "John",
	"position": "manager",
	"phone": "555 999-3333",
	"salary": 2000.00
}



5) REST-запит на видалення даних за id

DELETE http://localhost:8080/api/employees/4

