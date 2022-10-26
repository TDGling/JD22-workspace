CREATE DATABASE `디비명` 
DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE `Friends`
    `fnum` int NOT null AUTO_INCREMENT,
    `fnum` varchar(20),
    `ftel` char(11),
    `faddr` varchar(200),
    `fmsh` text(1000),
    `fdate` timestamp,
    PRIMARY KEY(fnum)