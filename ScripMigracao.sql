-- ----------------------------------------------------------------------------
-- MySQL Workbench Migration
-- Migrated Schemata: PedidosEx
-- Source Schemata: Pedidos
-- Created: Wed Feb 15 20:28:48 2017
-- Workbench Version: 6.3.4
-- ----------------------------------------------------------------------------

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------------------------------------------------------
-- Schema PedidosEx
-- ----------------------------------------------------------------------------
DROP SCHEMA IF EXISTS `PedidosEx` ;
CREATE SCHEMA IF NOT EXISTS `PedidosEx` ;

-- ----------------------------------------------------------------------------
-- Table PedidosEx.ITEM
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `PedidosEx`.`ITEM` (
  `PEDIDO_ID` INT(11) NOT NULL COMMENT '',
  `VALOR` DECIMAL(10,0) NULL DEFAULT NULL COMMENT '',
  `QUANTIDADE` INT(11) NULL DEFAULT NULL COMMENT '',
  `DESCRICAO` VARCHAR(45) NULL DEFAULT NULL COMMENT '',
  PRIMARY KEY (`PEDIDO_ID`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table PedidosEx.PEDIDO
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `PedidosEx`.`PEDIDO` (
  `ID` INT(11) NOT NULL COMMENT '',
  `DESCRICAO` VARCHAR(45) NULL DEFAULT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
SET FOREIGN_KEY_CHECKS = 1;
