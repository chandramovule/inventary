/*
SQLyog - Free MySQL GUI v5.13
Host - 5.0.22-community-nt : Database - system1
*********************************************************************
Server version : 5.0.22-community-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `system1`;

USE `system1`;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `bill` */

DROP TABLE IF EXISTS `bill`;

CREATE TABLE `bill` (
  `Cus_id` int(10) NOT NULL,
  `Date` varchar(12) default NULL,
  `Cus_Name` varchar(20) default NULL,
  `Amount` int(15) default NULL,
  PRIMARY KEY  (`Cus_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bill` */

insert into `bill` (`Cus_id`,`Date`,`Cus_Name`,`Amount`) values (1,'25/feb/2013','meenakshi',3500);
insert into `bill` (`Cus_id`,`Date`,`Cus_Name`,`Amount`) values (2,'26/feb/2013','lakshmi',3500);
insert into `bill` (`Cus_id`,`Date`,`Cus_Name`,`Amount`) values (3,'1/mar/2013','saraswathi',4500);
insert into `bill` (`Cus_id`,`Date`,`Cus_Name`,`Amount`) values (4,'2/mar/2013','shree',1000);
insert into `bill` (`Cus_id`,`Date`,`Cus_Name`,`Amount`) values (5,'3/mar/2013','akila',1500);
insert into `bill` (`Cus_id`,`Date`,`Cus_Name`,`Amount`) values (6,'7/mar/2013','sandhya',350);
insert into `bill` (`Cus_id`,`Date`,`Cus_Name`,`Amount`) values (7,'7/mar/2013','rrr',5400);
insert into `bill` (`Cus_id`,`Date`,`Cus_Name`,`Amount`) values (8,'12/mar/2013','anuja',5400);
insert into `bill` (`Cus_id`,`Date`,`Cus_Name`,`Amount`) values (9,'12/feb/2013','sharmila',20000);
insert into `bill` (`Cus_id`,`Date`,`Cus_Name`,`Amount`) values (10,'12/mar/2013','harini',20000);
insert into `bill` (`Cus_id`,`Date`,`Cus_Name`,`Amount`) values (11,'13/mar/2013','sowmiya',36000);

/*Table structure for table `emplogin` */

DROP TABLE IF EXISTS `emplogin`;

CREATE TABLE `emplogin` (
  `UserName` varchar(20) default NULL,
  `Password` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `emplogin` */

insert into `emplogin` (`UserName`,`Password`) values ('employee','peripherals');
insert into `emplogin` (`UserName`,`Password`) values ('emplo','peri');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `ID` varchar(10) NOT NULL,
  `NAME` varchar(20) default NULL,
  `AGE` varchar(10) default NULL,
  `SEX` varchar(10) default NULL,
  `ADDRESS` varchar(100) default NULL,
  `CELL_NO` varchar(20) default NULL,
  `EMAIL_ID` varchar(20) default NULL,
  `QUALIFICATION` varchar(10) default NULL,
  `EXPERIENCE` varchar(10) default NULL,
  `SALARY` varchar(10) default NULL,
  `JOINDATE` varchar(20) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

insert into `employee` (`ID`,`NAME`,`AGE`,`SEX`,`ADDRESS`,`CELL_NO`,`EMAIL_ID`,`QUALIFICATION`,`EXPERIENCE`,`SALARY`,`JOINDATE`) values ('1','anitha','24','female','k.k.nagar','9976956789','ani@gmail.com','BCA','2 years','10000','10/10/2010');
insert into `employee` (`ID`,`NAME`,`AGE`,`SEX`,`ADDRESS`,`CELL_NO`,`EMAIL_ID`,`QUALIFICATION`,`EXPERIENCE`,`SALARY`,`JOINDATE`) values ('2','sakthi','24','female','anna nagar','9597473877','sakthi@gmail.com','BBA','2 years','12000','4/12/2011');

/*Table structure for table `hard1` */

DROP TABLE IF EXISTS `hard1`;

CREATE TABLE `hard1` (
  `Purchase_ID` int(10) NOT NULL,
  `Supplier_ID` int(10) default NULL,
  `Type` varchar(20) default NULL,
  `Description` varchar(50) default NULL,
  `Quantity` int(10) default NULL,
  `Price` int(10) default NULL,
  PRIMARY KEY  (`Purchase_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hard1` */

insert into `hard1` (`Purchase_ID`,`Supplier_ID`,`Type`,`Description`,`Quantity`,`Price`) values (1,3,'pendrive','8gb transcend pendrive',9,350);
insert into `hard1` (`Purchase_ID`,`Supplier_ID`,`Type`,`Description`,`Quantity`,`Price`) values (2,3,'pendrive','2gb transcend pendrive',10,250);
insert into `hard1` (`Purchase_ID`,`Supplier_ID`,`Type`,`Description`,`Quantity`,`Price`) values (3,3,'processor','Intel Core i3-530',3,5400);
insert into `hard1` (`Purchase_ID`,`Supplier_ID`,`Type`,`Description`,`Quantity`,`Price`) values (4,3,'processor','Intel Quad Core Q8200 2.33GHz',5,8100);
insert into `hard1` (`Purchase_ID`,`Supplier_ID`,`Type`,`Description`,`Quantity`,`Price`) values (5,5,'pendrive','2gb sandisk',10,250);

/*Table structure for table `lap` */

DROP TABLE IF EXISTS `lap`;

CREATE TABLE `lap` (
  `Purchase_ID` int(10) default NULL,
  `Supplier_ID` int(10) default NULL,
  `Configure_ID` varchar(10) NOT NULL,
  `Company_Name` varchar(20) default NULL,
  `Processor` varchar(50) default NULL,
  `Memory` varchar(50) default NULL,
  `Display_Size` varchar(20) default NULL,
  `Hard_Disk_Drive` varchar(50) default NULL,
  `Graphics_Memory` varchar(20) default NULL,
  `Ports_and_others` varchar(100) default NULL,
  `Connectivity` varchar(20) default NULL,
  `Keyboard` varchar(50) default NULL,
  `AC_power_adapter` varchar(50) default NULL,
  `Battery_type` varchar(50) default NULL,
  `OS` varchar(50) default NULL,
  `Quantity` int(10) default NULL,
  `Price` int(10) default NULL,
  PRIMARY KEY  (`Configure_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `lap` */

insert into `lap` (`Purchase_ID`,`Supplier_ID`,`Configure_ID`,`Company_Name`,`Processor`,`Memory`,`Display_Size`,`Hard_Disk_Drive`,`Graphics_Memory`,`Ports_and_others`,`Connectivity`,`Keyboard`,`AC_power_adapter`,`Battery_type`,`OS`,`Quantity`,`Price`) values (1,5,'1','HCL','Intel pentium processor','2gb ddr3 sdram','14 inch display','160gb sata with 5400 rpm or higher','128 mb or highe','3 usb and built in speaker','10/100 LAN or higher','standard keyboard with touch pad','Input 100-240V, 50/60 Hz Ac power adapter','Rechargeable battery','windows 7',11,20000);
insert into `lap` (`Purchase_ID`,`Supplier_ID`,`Configure_ID`,`Company_Name`,`Processor`,`Memory`,`Display_Size`,`Hard_Disk_Drive`,`Graphics_Memory`,`Ports_and_others`,`Connectivity`,`Keyboard`,`AC_power_adapter`,`Battery_type`,`OS`,`Quantity`,`Price`) values (2,3,'2','Lenevo','intel','2gb ram','14 inch ','170gb sata','128mb','jjjkkkklllll','aaabbbccc','standard keyboard','jjjjjjjj','rechargeble','windows 8',5,22000);
insert into `lap` (`Purchase_ID`,`Supplier_ID`,`Configure_ID`,`Company_Name`,`Processor`,`Memory`,`Display_Size`,`Hard_Disk_Drive`,`Graphics_Memory`,`Ports_and_others`,`Connectivity`,`Keyboard`,`AC_power_adapter`,`Battery_type`,`OS`,`Quantity`,`Price`) values (3,5,'3','LG','hhh','aaa','ccc','vvv','bbb','nnn','mmm','kkk','www','qqq','ttt',5,18000);

/*Table structure for table `ownerlogin` */

DROP TABLE IF EXISTS `ownerlogin`;

CREATE TABLE `ownerlogin` (
  `UserName` varchar(20) default NULL,
  `Password` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ownerlogin` */

insert into `ownerlogin` (`UserName`,`Password`) values ('owner','peripherals');
insert into `ownerlogin` (`UserName`,`Password`) values ('stock','peri');

/*Table structure for table `soft` */

DROP TABLE IF EXISTS `soft`;

CREATE TABLE `soft` (
  `Purchase_ID` int(10) NOT NULL,
  `Supplier_ID` int(10) default NULL,
  `Description` varchar(25) default NULL,
  `Quantity` int(10) default NULL,
  `Price` int(10) default NULL,
  PRIMARY KEY  (`Purchase_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `soft` */

insert into `soft` (`Purchase_ID`,`Supplier_ID`,`Description`,`Quantity`,`Price`) values (1,1,'windows 7',8,1000);
insert into `soft` (`Purchase_ID`,`Supplier_ID`,`Description`,`Quantity`,`Price`) values (2,1,'windows 8',10,1500);
insert into `soft` (`Purchase_ID`,`Supplier_ID`,`Description`,`Quantity`,`Price`) values (3,2,'windows xp',10,900);
insert into `soft` (`Purchase_ID`,`Supplier_ID`,`Description`,`Quantity`,`Price`) values (4,4,'Mac os',12,3500);

/*Table structure for table `supplier` */

DROP TABLE IF EXISTS `supplier`;

CREATE TABLE `supplier` (
  `Supplier_ID` int(10) NOT NULL,
  `Supplier_Name` varchar(20) default NULL,
  `Supplier_Address` varchar(100) default NULL,
  `Supplier_Phno` varchar(12) default NULL,
  `Supplier_EmailID` varchar(20) default NULL,
  `Supplies` varchar(10) default NULL,
  PRIMARY KEY  (`Supplier_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `supplier` */

insert into `supplier` (`Supplier_ID`,`Supplier_Name`,`Supplier_Address`,`Supplier_Phno`,`Supplier_EmailID`,`Supplies`) values (1,'roni entrprise','aaa','1234567890','aaa@gmail.com','Software');
insert into `supplier` (`Supplier_ID`,`Supplier_Name`,`Supplier_Address`,`Supplier_Phno`,`Supplier_EmailID`,`Supplies`) values (2,'sifco','aaaaaa','1234566554','sss@gmail.com','Software');
insert into `supplier` (`Supplier_ID`,`Supplier_Name`,`Supplier_Address`,`Supplier_Phno`,`Supplier_EmailID`,`Supplies`) values (3,'reshmi enterprise','wwww','1234554321','ss@gmail.com','Hardware');
insert into `supplier` (`Supplier_ID`,`Supplier_Name`,`Supplier_Address`,`Supplier_Phno`,`Supplier_EmailID`,`Supplies`) values (4,'sakthi pvt ltd','anna nagar','1234567890','sakti@yahoo.com','Software');
insert into `supplier` (`Supplier_ID`,`Supplier_Name`,`Supplier_Address`,`Supplier_Phno`,`Supplier_EmailID`,`Supplies`) values (5,'modern enterprise','aaaaaaaaaaaaaaaaaa','1234567765','modern@hotmail.com','Hardware');
insert into `supplier` (`Supplier_ID`,`Supplier_Name`,`Supplier_Address`,`Supplier_Phno`,`Supplier_EmailID`,`Supplies`) values (6,'global computers','hhhhh','1243568709','hhhh','Hardware');

/*Table structure for table `sys` */

DROP TABLE IF EXISTS `sys`;

CREATE TABLE `sys` (
  `Purchase_ID` int(10) default NULL,
  `Supplier_ID` int(10) default NULL,
  `Configure_ID` varchar(10) NOT NULL,
  `Company` varchar(20) default NULL,
  `Monitor` varchar(50) default NULL,
  `Processor` varchar(50) default NULL,
  `Memory` varchar(50) default NULL,
  `HDD` varchar(50) default NULL,
  `Ports` varchar(100) default NULL,
  `Keyboard` varchar(50) default NULL,
  `Mouse` varchar(50) default NULL,
  `OS` varchar(50) default NULL,
  `Quantity` int(10) default NULL,
  `Price` int(10) default NULL,
  PRIMARY KEY  (`Configure_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sys` */

insert into `sys` (`Purchase_ID`,`Supplier_ID`,`Configure_ID`,`Company`,`Monitor`,`Processor`,`Memory`,`HDD`,`Ports`,`Keyboard`,`Mouse`,`OS`,`Quantity`,`Price`) values (1,3,'1','LG','LCD, 14 inch display','Inel pentium','2gb','160 gb sata','3 usb','standard keyboard','optical mouse','windows 8',5,18000);
insert into `sys` (`Purchase_ID`,`Supplier_ID`,`Configure_ID`,`Company`,`Monitor`,`Processor`,`Memory`,`HDD`,`Ports`,`Keyboard`,`Mouse`,`OS`,`Quantity`,`Price`) values (2,3,'2','HCL','ddd','eee','fff','ggg','hhh','iii','jjj','kkk',5,18000);

SET SQL_MODE=@OLD_SQL_MODE;