create table products (productId INT unsigned NOT NULL AUTO_INCREMENT,
productName VARCHAR(150) NOT NULL,
productDescription text,
quantityInStock int NOT NULL,
price decimal(10,2) NOT NULL,
productImage BLOB,
PRIMARY KEY (productId));

insert into 