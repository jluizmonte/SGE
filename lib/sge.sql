-- MySQL dump 10.13  Distrib 8.0.17, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: sge
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_cliente`
--

DROP TABLE IF EXISTS `tbl_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cliente` (
  `pk_id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `cli_nome` varchar(45) DEFAULT NULL,
  `cli_endereco` varchar(100) DEFAULT NULL,
  `cli_numero` varchar(20) DEFAULT NULL,
  `cli_bairro` varchar(50) DEFAULT NULL,
  `cli_cidade` varchar(50) DEFAULT NULL,
  `cli_uf` varchar(20) DEFAULT NULL,
  `cli_cep` varchar(15) DEFAULT NULL,
  `cli_telefone` varchar(45) DEFAULT NULL,
  `cli_email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`pk_id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cliente`
--

LOCK TABLES `tbl_cliente` WRITE;
/*!40000 ALTER TABLE `tbl_cliente` DISABLE KEYS */;
INSERT INTO `tbl_cliente` VALUES (1,'CLIENTE XX','RUA OITO DE OUTUBRO','008','REBOUÇAS','SÃO PAULO','SP','52828-060','(11) 8 2580-8890','teste@mail.com');
/*!40000 ALTER TABLE `tbl_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_forma_pagamento`
--

DROP TABLE IF EXISTS `tbl_forma_pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_forma_pagamento` (
  `pk_id_for_pag` int(11) NOT NULL AUTO_INCREMENT,
  `descricao_for_pag` varchar(100) DEFAULT NULL,
  `desconto_for_pag` double(5,2) DEFAULT NULL,
  `parcelas_for_pag` int(11) DEFAULT NULL,
  `situacao_for_pag` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk_id_for_pag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_forma_pagamento`
--

LOCK TABLES `tbl_forma_pagamento` WRITE;
/*!40000 ALTER TABLE `tbl_forma_pagamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_forma_pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_fornecedor`
--

DROP TABLE IF EXISTS `tbl_fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_fornecedor` (
  `pk_id_fornecedor` int(11) NOT NULL AUTO_INCREMENT,
  `nome_fornecedor` varchar(45) DEFAULT NULL,
  `rua_fornecedor` varchar(45) DEFAULT NULL,
  `bairro_fornecedor` varchar(45) DEFAULT NULL,
  `cidade_fornecedor` varchar(45) DEFAULT NULL,
  `uf_fornecedor` varchar(45) DEFAULT NULL,
  `cep_fornecedor` varchar(15) DEFAULT NULL,
  `telefone_fornecedor` varchar(45) DEFAULT NULL,
  `celular_fornecedor` varchar(45) DEFAULT NULL,
  `email_fornecedor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`pk_id_fornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_fornecedor`
--

LOCK TABLES `tbl_fornecedor` WRITE;
/*!40000 ALTER TABLE `tbl_fornecedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_produto`
--

DROP TABLE IF EXISTS `tbl_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_produto` (
  `pk_id_produto` int(11) NOT NULL AUTO_INCREMENT,
  `pro_descricao` varchar(100) NOT NULL,
  `pro_categoria` varchar(45) DEFAULT NULL,
  `pro_observacao` text NOT NULL,
  `pro_quantidade_estoque` int(10) NOT NULL,
  `pro_valor_total` decimal(10,2) NOT NULL,
  `pro_valor_unitario` decimal(10,2) NOT NULL,
  `pro_codigo_barra` varchar(20) NOT NULL,
  `pro_data_entrada` varchar(10) NOT NULL,
  PRIMARY KEY (`pk_id_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_produto`
--

LOCK TABLES `tbl_produto` WRITE;
/*!40000 ALTER TABLE `tbl_produto` DISABLE KEYS */;
INSERT INTO `tbl_produto` VALUES (1,'teste','biscoito','pacote 130g',8,1.00,1.00,'1020520505','25/08/2019'),(2,'biscoito treloso','biscoitos e bolachas','pacote 130g sabor chocolate',5,2.00,2.00,'22505858820','22/08/2019'),(3,'caderno 150folhas','papelaria','papel offset tilibra',10,25.50,2.55,'552828528028','22/29/2019');
/*!40000 ALTER TABLE `tbl_produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_usuario`
--

DROP TABLE IF EXISTS `tbl_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_usuario` (
  `pk_id_usuario` bigint(20) NOT NULL AUTO_INCREMENT,
  `usu_nome` varchar(45) DEFAULT NULL,
  `usu_login` varchar(45) DEFAULT NULL,
  `usu_senha` varchar(45) DEFAULT NULL,
  `usu_tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`pk_id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_usuario`
--

LOCK TABLES `tbl_usuario` WRITE;
/*!40000 ALTER TABLE `tbl_usuario` DISABLE KEYS */;
INSERT INTO `tbl_usuario` VALUES (1,'JOSÉ LUIZ','admin','admin','ADMINISTRADOR'),(2,'CONVIDADO','guest','guest','CONVIDADO'),(3,'LOCADOR','locador','locador','LOCADOR'),(4,'LUCAS','lucas','1234','ADMINISTRADOR');
/*!40000 ALTER TABLE `tbl_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_vendas`
--

DROP TABLE IF EXISTS `tbl_vendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_vendas` (
  `pk_id_vendas` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `fk_cliente` bigint(20) NOT NULL DEFAULT '0',
  `ven_data_venda` varchar(10) NOT NULL,
  `ven_valor_liquido` double(6,2) NOT NULL DEFAULT '0.00',
  `ven_valor_bruto` double(6,2) NOT NULL DEFAULT '0.00',
  `ven_desconto` double(6,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`pk_id_vendas`) USING BTREE,
  KEY `fkcliente` (`fk_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_vendas`
--

LOCK TABLES `tbl_vendas` WRITE;
/*!40000 ALTER TABLE `tbl_vendas` DISABLE KEYS */;
INSERT INTO `tbl_vendas` VALUES (1,1,'25/08/2019',25.00,50.00,10.00);
/*!40000 ALTER TABLE `tbl_vendas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_vendas_produto`
--

DROP TABLE IF EXISTS `tbl_vendas_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_vendas_produto` (
  `pk_id_venda_produto` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `fk_produto` bigint(20) unsigned NOT NULL DEFAULT '0',
  `fk_vendas` bigint(20) unsigned NOT NULL DEFAULT '0',
  `ven_produto_valor` double(6,2) NOT NULL DEFAULT '0.00',
  `ven_produto_quantidade` int(11) NOT NULL,
  PRIMARY KEY (`pk_id_venda_produto`) USING BTREE,
  KEY `fk_produto` (`fk_produto`),
  KEY `fkvendas` (`fk_vendas`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_vendas_produto`
--

LOCK TABLES `tbl_vendas_produto` WRITE;
/*!40000 ALTER TABLE `tbl_vendas_produto` DISABLE KEYS */;
INSERT INTO `tbl_vendas_produto` VALUES (1,1,1,25.00,1);
/*!40000 ALTER TABLE `tbl_vendas_produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-15 15:09:52
