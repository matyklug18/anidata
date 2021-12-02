CREATE TABLE users (id INTEGER PRIMARY KEY AUTO_INCREMENT, username VARCHAR(255) NOT NULL UNIQUE, password VARCHAR(255) NOT NULL);

INSERT INTO users(username,password) VALUES ("admin", "$2a$12$gEt5qPemJHG.a6Qb4sjKJeFofTj43GQ9czkKGWivy/IFs5U3a/cBe");

INSERT INTO users(username,password) VALUES ("user", "$2a$12$Vd8XYRoak2YaN0pQGsCqT.45JiyHoVFWC5w6RX/yDd/FC5LGGoayi");