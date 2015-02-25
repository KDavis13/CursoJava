-- Creacion de la Base de Datos 'video'
--
--

-- ATENCION: Debemos ejecutar este script desde 
-- MySQL Query Browse habiendo entrado como root


-- Crea la BD si no existe
CREATE DATABASE IF NOT EXISTS video;

-- La activa
USE video;

-- Crea el usuario 'usuario1'
-- Este usuario se podr connectar desde cualquier host.
-- Esto se consiguie mediante el smbolo '%'
-- Si quisiramos que slo pudiera conectarse en local
-- sustituiramos '%' por 'localhost'
-- create user 'usuario1'@'%' identified by 'usuario1';


-- Conceder al usuario slo permisos especficos sobre la BD
GRANT SELECT,INSERT,UPDATE,DELETE,CREATE,DROP ON video.* TO 'usuario1'@'%';

-- Si quisieramos conceder al usuario permisos totales sobre la BD:
-- GRANT ALL ON video.* TO 'usuario1'@'%';

--
-- Si la BD ya exista debemos eliminar las tablas
-- Hay que eliminar antes las tablas hijas que las padres
--
drop table if exists F_P;
drop table if exists FAC;
drop table if exists PEL;
drop table if exists CLI;


--
-- Creacion de las tablas
--


--
-- Creacion de la tabla de pelculas
--

create table PEL(
P_NUM mediumint unsigned not null,
TITULO varchar(100) not null,
TIPO varchar(50) not null,
CLASIF varchar(3) not null,
ARTISTA varchar(50) null,
COPIAS smallint unsigned not null,
PRECIO decimal(5,2) not null,
primary key(P_NUM)
);

-- Carga de los datos
LOAD DATA INFILE 'E:\\AP-JAVA\\teoria\\rdbms\\practicas\\practica1\\cargasSQL\\pel.txt' INTO TABLE pel LINES TERMINATED BY '\r\n';


--
-- Creacion de la tabla de clientes
--

create table CLI(
CLIID varchar(5) not null,
APEL varchar(100) not null,
NOMBRE varchar(50) not null,
CIUD varchar(50) not null,
PROV varchar(50) null,
primary key(CLIID)
);

-- Carga de los datos
LOAD DATA INFILE 'E:\\AP-JAVA\\teoria\\rdbms\\practicas\\practica1\\cargasSQL\\cli.txt' INTO TABLE cli LINES TERMINATED BY '\r\n';


--
-- Creacion de la tabla de cabecera de facturas
--

create table FAC(
F_NUM int unsigned not null,
CLIID varchar(5) not null,
TOTAL decimal(8,2) not null,
ALQ date not null,
DEV date null,
primary key(F_NUM)
);

-- Carga de los datos
LOAD DATA INFILE 'E:\\AP-JAVA\\teoria\\rdbms\\practicas\\practica1\\cargasSQL\\fac.txt' INTO TABLE fac LINES TERMINATED BY '\r\n';


--
-- Creacion de la tabla de lneas de factura
--

create table F_P(
F_NUM int unsigned not null,
P_NUM mediumint unsigned not null,
primary key(F_NUM,P_NUM)
);

-- Carga de los datos
LOAD DATA INFILE 'E:\\AP-JAVA\\teoria\\rdbms\\practicas\\practica1\\cargasSQL\\f_p.txt' INTO TABLE f_p LINES TERMINATED BY '\r\n';


--
-- Definicion de claves externas
--

-- Si se modifica la clave primaria de la tabla padre 
-- se actualiza el valor de la clave externa.
--
-- El intento de eliminar un registro de la clave primaria 
-- de la tabla padre ser prohibido si existen registros 
-- para esa clave en la tabla hija.

ALTER TABLE FAC ADD FOREIGN KEY fk_cliid(CLIID) 
REFERENCES CLI(CLIID) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE F_P ADD FOREIGN KEY fk_f_num(F_NUM) 
REFERENCES FAC(F_NUM) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE F_P ADD FOREIGN KEY fk_p_num(P_NUM) REFERENCES 
PEL(P_NUM) ON DELETE RESTRICT ON UPDATE CASCADE;


-- Creamos otro usuario que solo puede hacer operaciones simples sobre la BD.
-- Este usuario es el que podriamos utilizar desde un programa Java
create user 'usuario2'@'%' identified by 'usuario2';
GRANT SELECT,INSERT,UPDATE,DELETE ON video.* TO 'usuario2'@'%';