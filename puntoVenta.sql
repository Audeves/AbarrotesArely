-- MySQL Script generated by MySQL Workbench
-- Fri Mar 10 13:14:43 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema sistemapuntoventa
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema sistemapuntoventa
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sistemapuntoventa` DEFAULT CHARACTER SET utf8mb3 ;
USE `sistemapuntoventa` ;

-- -----------------------------------------------------
-- Table `sistemapuntoventa`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemapuntoventa`.`persona` (
  `idPersona` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `ciudad` VARCHAR(45) NOT NULL,
  `curp` VARCHAR(18) NOT NULL,
  `calle` VARCHAR(45) NOT NULL,
  `colonia` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idPersona`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `sistemapuntoventa`.`proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemapuntoventa`.`proveedor` (
  `idproveedor` INT NOT NULL AUTO_INCREMENT,
  `rfcprovedor` VARCHAR(45) NOT NULL,
  `nombreprovedor` VARCHAR(45) NOT NULL,
  `persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idproveedor`),
  INDEX `fk_proveedor_persona1_idx` (`persona_idPersona` ASC) VISIBLE,
  INDEX `idx_proveedor_id_persona` (`idproveedor` ASC, `persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_proveedor_persona1`
    FOREIGN KEY (`persona_idPersona`)
    REFERENCES `sistemapuntoventa`.`persona` (`idPersona`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `sistemapuntoventa`.`compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemapuntoventa`.`compra` (
  `idcompra` INT NOT NULL AUTO_INCREMENT,
  `fechacompra` DATE NOT NULL,
  `proveedor_idproveedor` INT NOT NULL,
  `proveedor_persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idcompra`),
  INDEX `fk_compra_proveedor1_idx` (`proveedor_idproveedor` ASC, `proveedor_persona_idPersona` ASC) VISIBLE,
  INDEX `idx_compra_proveedor` (`idcompra` ASC, `proveedor_idproveedor` ASC, `proveedor_persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_compra_proveedor1`
    FOREIGN KEY (`proveedor_idproveedor` , `proveedor_persona_idPersona`)
    REFERENCES `sistemapuntoventa`.`proveedor` (`idproveedor` , `persona_idPersona`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `sistemapuntoventa`.`encargado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemapuntoventa`.`encargado` (
  `idencargado` INT NOT NULL AUTO_INCREMENT,
  `rfc` VARCHAR(45) NOT NULL,
  `persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idencargado`),
  INDEX `fk_encargado_persona1_idx` (`persona_idPersona` ASC) VISIBLE,
  INDEX `idx_encargado_idPersona_idencargado` (`idencargado` ASC, `persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_encargado_persona1`
    FOREIGN KEY (`persona_idPersona`)
    REFERENCES `sistemapuntoventa`.`persona` (`idPersona`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `sistemapuntoventa`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemapuntoventa`.`producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `nombreProducto` VARCHAR(45) NOT NULL,
  `precio_actual` FLOAT NOT NULL,
  `stock` INT NOT NULL,
  `categoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idproducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `sistemapuntoventa`.`rel_productos_compras`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemapuntoventa`.`rel_productos_compras` (
  `rel_productos_compras` INT NOT NULL AUTO_INCREMENT,
  `precio_com` FLOAT NOT NULL,
  `cantidad` INT NOT NULL,
  `monto_final` FLOAT NOT NULL,
  `producto_idproducto` INT NOT NULL,
  `compra_idcompra` INT NOT NULL,
  `compra_proveedor_idproveedor` INT NOT NULL,
  `compra_proveedor_persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`rel_productos_compras`),
  INDEX `fk_producto_has_compra_compra1_idx` (`compra_idcompra` ASC, `compra_proveedor_idproveedor` ASC, `compra_proveedor_persona_idPersona` ASC) VISIBLE,
  INDEX `fk_producto_has_compra_producto1_idx` (`producto_idproducto` ASC) VISIBLE,
  CONSTRAINT `fk_producto_has_compra_compra1`
    FOREIGN KEY (`compra_idcompra` , `compra_proveedor_idproveedor` , `compra_proveedor_persona_idPersona`)
    REFERENCES `sistemapuntoventa`.`compra` (`idcompra` , `proveedor_idproveedor` , `proveedor_persona_idPersona`),
  CONSTRAINT `fk_producto_has_compra_producto1`
    FOREIGN KEY (`producto_idproducto`)
    REFERENCES `sistemapuntoventa`.`producto` (`idproducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `sistemapuntoventa`.`venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemapuntoventa`.`venta` (
  `idventa` INT NOT NULL AUTO_INCREMENT,
  `total` FLOAT NOT NULL,
  `fecha` DATE NOT NULL,
  `encargado_idencargado` INT NOT NULL,
  `encargado_persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idventa`),
  INDEX `fk_venta_encargado1_idx` (`encargado_idencargado` ASC, `encargado_persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_venta_encargado1`
    FOREIGN KEY (`encargado_idencargado` , `encargado_persona_idPersona`)
    REFERENCES `sistemapuntoventa`.`encargado` (`idencargado` , `persona_idPersona`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `sistemapuntoventa`.`rel_productos_ventas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemapuntoventa`.`rel_productos_ventas` (
  `idrel_productos_ventas` INT NOT NULL AUTO_INCREMENT,
  `cantidad_vendida` INT NOT NULL,
  `precio_venta` FLOAT NOT NULL,
  `subtotal` FLOAT NOT NULL,
  `venta_idventa` INT NOT NULL,
  `producto_idproducto` INT NOT NULL,
  `importe` FLOAT NOT NULL,
  PRIMARY KEY (`idrel_productos_ventas`),
  INDEX `fk_venta_has_producto_producto1_idx` (`producto_idproducto` ASC) VISIBLE,
  INDEX `fk_venta_has_producto_venta1_idx` (`venta_idventa` ASC) VISIBLE,
  CONSTRAINT `fk_venta_has_producto_producto1`
    FOREIGN KEY (`producto_idproducto`)
    REFERENCES `sistemapuntoventa`.`producto` (`idproducto`),
  CONSTRAINT `fk_venta_has_producto_venta1`
    FOREIGN KEY (`venta_idventa`)
    REFERENCES `sistemapuntoventa`.`venta` (`idventa`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;