-- MySQL dump 10.13  Distrib 5.7.23, for Linux (x86_64)
--
-- Host: localhost    Database: avishkar
-- ------------------------------------------------------
-- Server version	5.7.23-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `rank`
--

DROP TABLE IF EXISTS `rank`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rank` (
  `username` varchar(50) DEFAULT NULL,
  `srank` int(11) DEFAULT NULL,
  `ccrank` int(11) DEFAULT NULL,
  `cfrank` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rank`
--

LOCK TABLES `rank` WRITE;
/*!40000 ALTER TABLE `rank` DISABLE KEYS */;
INSERT INTO `rank` VALUES ('jthpopodrh',32377,32377,32377),('nn   k l',32376,3509,32376),('hlknlkbnl',32375,3509,67942),('kunal@gmail.com',32375,3509,67942);
/*!40000 ALTER TABLE `rank` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ranks`
--

DROP TABLE IF EXISTS `ranks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ranks` (
  `userid` varchar(50) DEFAULT NULL,
  `spoj` int(11) DEFAULT NULL,
  `cc` int(11) DEFAULT NULL,
  `cf` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ranks`
--

LOCK TABLES `ranks` WRITE;
/*!40000 ALTER TABLE `ranks` DISABLE KEYS */;
/*!40000 ALTER TABLE `ranks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tcodechef`
--

DROP TABLE IF EXISTS `tcodechef`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tcodechef` (
  `question` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tcodechef`
--

LOCK TABLES `tcodechef` WRITE;
/*!40000 ALTER TABLE `tcodechef` DISABLE KEYS */;
INSERT INTO `tcodechef` VALUES ('CodeChef API Hackathon powered by Alibaba Cloud'),('INOI Practice Contest'),('ZCO Practice Contest'),('CodeChef API Hackathon powered by Alibaba Cloud'),('INOI Practice Contest'),('ZCO Practice Contest'),('CodeChef API Hackathon powered by Alibaba Cloud'),('INOI Practice Contest'),('ZCO Practice Contest'),('CodeChef API Hackathon powered by Alibaba Cloud'),('INOI Practice Contest'),('ZCO Practice Contest'),('CodeChef API Hackathon powered by Alibaba Cloud'),('INOI Practice Contest'),('ZCO Practice Contest'),('CodeChef API Hackathon powered by Alibaba Cloud'),('INOI Practice Contest'),('ZCO Practice Contest'),('CodeChef API Hackathon powered by Alibaba Cloud'),('INOI Practice Contest'),('ZCO Practice Contest'),('CodeChef API Hackathon powered by Alibaba Cloud'),('INOI Practice Contest'),('ZCO Practice Contest'),('CodeChef API Hackathon powered by Alibaba Cloud'),('INOI Practice Contest'),('ZCO Practice Contest');
/*!40000 ALTER TABLE `tcodechef` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tcodeforce`
--

DROP TABLE IF EXISTS `tcodeforce`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tcodeforce` (
  `question` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tcodeforce`
--

LOCK TABLES `tcodeforce` WRITE;
/*!40000 ALTER TABLE `tcodeforce` DISABLE KEYS */;
/*!40000 ALTER TABLE `tcodeforce` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thackerrank`
--

DROP TABLE IF EXISTS `thackerrank`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `thackerrank` (
  `question` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thackerrank`
--

LOCK TABLES `thackerrank` WRITE;
/*!40000 ALTER TABLE `thackerrank` DISABLE KEYS */;
/*!40000 ALTER TABLE `thackerrank` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tspoj`
--

DROP TABLE IF EXISTS `tspoj`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tspoj` (
  `question` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tspoj`
--

LOCK TABLES `tspoj` WRITE;
/*!40000 ALTER TABLE `tspoj` DISABLE KEYS */;
INSERT INTO `tspoj` VALUES ('SOCS FALL 2017'),('Programming Assignment'),('UPGRADE'),('DUTUYEN'),('BETACONTEST_1');
/*!40000 ALTER TABLE `tspoj` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('kunal','12345');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `codeforces` varchar(50) DEFAULT NULL,
  `codechef` varchar(50) DEFAULT NULL,
  `hackerrank` varchar(50) DEFAULT NULL,
  `hackerearth` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('kunal','agarwal.kunal.111@gmail.com','123456','kunal@123','kunal@123','kunal@123','kunal@123'),('rohit ','rohitkumarsaw21@gmail.com','123456789','rohit100','kfjdsfk','dhfkhsdfh','djfdhsfh'),('kunal','123','123','','','',''),('vhkvjhvj',' hmvh',' gv  ','vhjv','','',''),('gh jh jh ','kjbjkbkj','uibjbuik','','','',''),('kun','dgdhfhf','hkb ','bkjb','','',''),('mujnm i',',okm,ok','','','','',''),('jn lkn l','nnim','','','','',''),(' kllkn lk','bbj','cfchg','bhhj','  j h ','gbbikb','nkjnkj'),(' jh jbhjb','bhibn','bibnik','vuvu','vtvu','vuyuv','bbb'),('jhnkj','bmpop','nbinno','nnn','jijionoi','hnnuioni','jhonoi'),('kbkbk','hghoihb','hbhikhnk','vikbkb','vvbkbik','ghuihuioh','gfuigigb'),('vyhbbk','nblknlkn','bnolnlnio','npnpnp','jnhnolno','nnn','bbnkibno'),('huiou','ghbi','fcc','hno','jhiojho','jhoioin','hoinon'),('bb ik','bgvhjvjh','bunn','hkkj','bkbh','bbkjj','kbkb'),('bbk','bjbj','hkbkb','vvjk','bbkub','gbkbk','hbhb'),('jbhj','bubub','bbujbu','houhiuhni','vbubb','biiubgiuiu','bhbib'),('gvhvk','vbkbk','bjkbkjb','gkbgkb','gbbhklb k','gigbkugbku','gbkbkbk'),('nbk.n.kn','nm,. n,. n,.','b ,m , ,','b ,m n, ','b,,b k,','b,b,b ,','b,b,b ,k'),('vkbkj','ghlbnlkjbk','hglhlhl','hhbklbkuj','hhblbk','hhklhbkhbk','h;lnlknl'),('bkdfbk','jthpopodrh','nrk;nhl;','hhnrylihwoi','ht4rohtoi','ghthw4yoihyo','tg4ohgt4o'),('nnmnkmn','nn   k l','hnlnlknlk','tourist','vbjb,bnj','hnlknlk','hlkhnlknl'),('hhlihl','hlknlkbnl','hklknlkn','tourist','rohitmnnit','jnkip','jpokpiomo'),('kunal','kunal@gmail.com','123456','tourist','rohitmnnit','kunal@123','kunal@123');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-27 22:33:49
