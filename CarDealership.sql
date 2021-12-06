Drop database IF EXISTS carDealership;
CREATE DATABASE carDealership;
use carDealership;

CREATE TABLE make(
	makeId INT PRIMARY KEY auto_increment NOT NULL,
	makeName VARCHAR(15) NOT NULL,
	dateAdded DATETIME NOT NULL,
	addedBy VARCHAR(256)
);

CREATE TABLE model(
	modelId INT PRIMARY KEY auto_increment NOT NULL,
	modelName VARCHAR(30) NOT NULL,
    makeId INT NOT NULL,
	FOREIGN KEY fk_makeId (makeId) references make(makeId),
	dateAdded DATETIME NOT NULL,
	addedBy VARCHAR(256)
);

CREATE TABLE cars(
	carId INT PRIMARY KEY auto_increment NOT NULL,
	isNew boolean NOT NULL,
	isFeatured boolean NOT NUll,
	isSold boolean NOT NULL,
	mileage int NOT NULL,
	modelYear int NOT NULL,
	VIN VARCHAR(30) NOT NULL,
    makeId INT NOT NULL,
    modelID Int Not Null,
    transmissionType VARCHAR(10),
    bodyStyleType VARCHAR(25),
    bodyColorName VARCHAR(15),
    intColorName VARCHAR(15),
	FOREIGN KEY FK_makeId (makeId) REFERENCES make(makeId),
	FOREIGN KEY FK_modelId (modelId)  REFERENCES model(modelId),
	salePrice DECIMAL(7,2) NOT NULL,
	MSRP DECIMAL(7,2) NOT NULL,
	vehicleDetails VARCHAR(400) NOT NULL
);

CREATE TABLE specials(
	specialsId INT PRIMARY KEY auto_increment NOT NULL,
	specialDetails VARCHAR(400) NOT NULL,
	title VARCHAR(100) NOT NULL
);

CREATE TABLE sales(
	purchaseLogId INT PRIMARY KEY auto_increment NOT NULL,
	purchaseType VARCHAR(16) NOT NULL,
	purchaserName VARCHAR(40) NOT NULL,
    carId int Not Null,
	FOREIGN KEY FK_purchasedCarId(carId) REFERENCES cars(carId),
	addressOne VARCHAR(50)NOT NULL,
	addressTwo VARCHAR(50) NULL,
	city VARCHAR(30) NOT NULL,
	email VARCHAR(50) NULL,
	phone VARCHAR(15) NULL,
	zipCode VARCHAR(5) NOT NULL,
	purchasePrice DECIMAL(10,2) NOT NULL,
	dateSold DATETIME NOT NULL
);

CREATE TABLE customerContact(
	contactId INT PRIMARY KEY auto_increment NOT NULL,
	contactName VARCHAR(40) NOT NULL,
	messageBody VARCHAR(400) NOT NULL,
	email VARCHAR(50) NULL,
	phone VARCHAR(15) NULL
);

create table users(
	userId INT PRIMARY KEY auto_increment NOT NULL,
    username VARCHAR(40) NOT NULL,
    userPassword VARCHAR(40) NOT NULL,
    isAdmin BOOLEAN DEFAULT false
);