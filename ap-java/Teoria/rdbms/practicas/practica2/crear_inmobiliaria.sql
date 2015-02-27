--
-- Creacion de la Base de Datos 'inmobiliaria'
--
--


-- ATENCION: Debemos ejecutar este script desde 
-- MySQL Query Browse habiendo entrado como root


-- Crea la BD si no existe
CREATE DATABASE IF NOT EXISTS inmobiliaria;

-- La activa
use inmobiliaria;

-- Crea el usuario 'usuario1'
-- Este usuario se podr connectar desde cualquier host.
-- Esto se consiguie mediante el smbolo '%'
-- Si quisiramos que slo pudiera conectarse en local
-- sustituiramos '%' por 'localhost'
-- create user 'usuario1'@'%' identified by 'usuario1';


-- Conceder al usuario slo permisos especficos sobre la BD
--GRANT SELECT,INSERT,UPDATE,DELETE,CREATE,DROP ON inmobiliaria.* TO 'usuario1'@'%';

-- Si quisieramos conceder al usuario permisos totales sobre la BD:
-- GRANT ALL ON inmobiliaria.* TO 'usuario1'@'%';

--
-- Si la BD ya exista debemos eliminar las tablas
-- Hay que eliminar antes las tablas hijas que las padres
--
drop table if exists CAJA;
drop table if exists PEDIDO;
drop table if exists PISO;
drop table if exists PROP;
drop table if exists CLI;


--
-- Creacin de las tablas
--


--
-- Creacin de la tabla de pisos
--

create table PISO(
	N_PISO serial primary key,
	DIR varchar(50) not null,
	LOC varchar(50) not null,
	PISCINA boolean not null,
	NIF_PROP varchar(10) not null,
	PRECIO decimal(6,2) not null,
	COMISION decimal(5,2) not null
);

-- Carga de los datos
LOAD DATA INFILE 'D:\\Curso-Septiembre 2009\\AP-Java\\BD-SQL\\Practicas\\Practica2\\cargasSQL\\PISO.txt' INTO TABLE PISO LINES TERMINATED BY '\r\n';



--
-- Creacin de la tabla de propietarios
--

create table PROP(
	NIF_PROP varchar(10) primary key not null,
	NOMBRE varchar(50) not null,
	APEL varchar(100) not null,
	DIR varchar(50) not null,
	LOC varchar(50) not null
);

-- Carga de los datos
LOAD DATA INFILE 'D:\\Curso-Septiembre 2009\\AP-Java\\BD-SQL\\Practicas\\Practica2\\cargasSQL\\PROP.txt' INTO TABLE PROP LINES TERMINATED BY '\r\n';


--
-- Creacin de la tabla clientes
--

create table CLI(
	NIF_CLI varchar(10) primary key not null,
	NOMBRE varchar(50) not null,
	APEL varchar(100) not null
);

-- Carga de los datos
LOAD DATA INFILE 'D:\\Curso-Septiembre 2009\\AP-Java\\BD-SQL\\Practicas\\Practica2\\cargasSQL\\CLI.txt' INTO TABLE CLI LINES TERMINATED BY '\r\n';


--
-- Creacin de la tabla de pedidos
--

create table PEDIDO(
	N_PEDIDO serial primary key,
	NIF_CLI varchar(10) not null,
	N_PISO bigint unsigned not null,
	LLEGADA date not null,
	PARTIDA date not null,
	PAGADO boolean not null,
	CANCELADO boolean not null
);

-- Carga de los datos
LOAD DATA INFILE 'D:\\Curso-Septiembre 2009\\AP-Java\\BD-SQL\\Practicas\\Practica2\\cargasSQL\\PEDIDO.txt' INTO TABLE PEDIDO LINES TERMINATED BY '\r\n';


--
-- Creacin de la tabla caja
--

create table CAJA(
	N_FACTURA serial primary key,
	OPERACION char(1) not null,
	N_PEDIDO bigint unsigned null,
	IMPORTE decimal(10,2) not null,
	PAGADO boolean null,
	DIA date not null
);

-- Carga de los datos
LOAD DATA INFILE 'D:\\Curso-Septiembre 2009\\AP-Java\\BD-SQL\\Practicas\\Practica2\\cargasSQL\\CAJA.txt' INTO TABLE CAJA LINES TERMINATED BY '\r\n';

--
-- Definicion de claves externas
--

-- Si se modifica la clave primaria de la tabla padre 
-- se actualiza el valor de la clave externa.
--
-- El intento de eliminar un registro de la clave primaria 
-- de la tabla padre ser prohibido si existen registros 
-- para esa clave en la tabla hija.

ALTER TABLE PISO ADD FOREIGN KEY fk_nif_prop(NIF_PROP) REFERENCES PROP(NIF_PROP) ON UPDATE CASCADE ON DELETE RESTRICT;
ALTER TABLE PEDIDO ADD FOREIGN KEY fk_nif_cli(NIF_CLI) REFERENCES CLI(NIF_CLI) ON UPDATE CASCADE ON DELETE RESTRICT;
ALTER TABLE PEDIDO ADD FOREIGN KEY fk_n_piso(N_PISO) REFERENCES PISO(N_PISO) ON UPDATE CASCADE ON DELETE RESTRICT;
ALTER TABLE CAJA ADD FOREIGN KEY fk_n_pedido(N_PEDIDO) REFERENCES PEDIDO(N_PEDIDO) ON UPDATE CASCADE ON DELETE RESTRICT;


-- Creamos otro usuario que solo puede hacer operaciones simples sobre la BD.
-- Este usuario es el que podriamos utilizar desde un programa Java
-- create user 'usuario2'@'%' identified by 'usuario2';
--GRANT SELECT,INSERT,UPDATE,DELETE ON inmobiliaria.* TO 'usuario2'@'%';