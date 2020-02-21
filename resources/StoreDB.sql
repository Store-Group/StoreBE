create database store;
 
create table products (productId INT unsigned NOT NULL AUTO_INCREMENT,
productName VARCHAR(150) NOT NULL,
productDescription text,
quantityInStock int NOT NULL,
price decimal(10,2) NOT NULL,
productImage BLOB,
PRIMARY KEY (productId));

insert into products (productName, productDescription,quantityInStock,price,productImage) values ('testProduct','First product for testing',1000,100.50,LOAD_FILE('C:/Users/Moham/Downloads/food-samples.jpg'));