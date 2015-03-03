create user usuario1 password 'usuario1';
grant all privileges on database video to usuario1;
create table PEL(
P_NUM int not null,
TITULO varchar(100) not null,
TIPO varchar(50) not null,
CLASIF varchar(3) not null,
ARTISTA varchar(50) null,
COPIAS smallint not null,
PRECIO decimal(5,2) not null,
primary key(P_NUM)
);

COPY PEL FROM 'F:\\rdbms\\practicas\\practica1\\cargasSQL\\pel.txt'