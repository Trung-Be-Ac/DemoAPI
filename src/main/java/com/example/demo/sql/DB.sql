# DemoAPI
# Database
create database demo;
use demo;
CREATE TABLE User (
    ID_User INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255),
    Email VARCHAR(255) UNIQUE,
    Phone VARCHAR(20),
    Address TEXT,
    Role VARCHAR(50),
    UserName VARCHAR(100) UNIQUE,
    Password VARCHAR(255)
);

INSERT INTO User (Name, Email, Phone, Address, Role, UserName, Password) VALUES
('Nguyen Van A', 'a@gmail.com', '0123456789', 'Hanoi', 'Customer', 'user_a', 'pass123'),
('Tran Thi B', 'b@gmail.com', '0987654321', 'Ho Chi Minh', 'Seller', 'user_b', 'pass456'),
('Le Van C', 'c@gmail.com', '0345678901', 'Da Nang', 'Seller', 'user_c', 'pass789'),
('Pham D', 'd@gmail.com', '0567890123', 'Can Tho', 'Admin', 'user_d', 'pass111'),
('Hoang E', 'e@gmail.com', '0678901234', 'Hai Phong', 'Customer', 'user_e', 'pass222');
#