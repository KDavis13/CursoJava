create table Autores (
	CodigoAutor int(5) unsigned NOT NULL,
	Nombre varchar(80) NOT NULL,
	Direccion varchar(80) NOT NULL,
	Telefono varchar(80) NOT NULL,
	PRIMARY KEY (CodigoAutor)
);

create table Libros (
	CodigoLibro int(5) unsigned NOT NULL,
	ISBN varchar(20) NOT NULL,
	Titulo varchar(80) NOT NULL,
	Editorial varchar(20) NOT NULL,
	Fecha date NOT NULL,
	PRIMARY KEY (CodigoLibro)
);

create table AutorLibro (
	CodAutor int(5) unsigned NOT NULL,
	CodLibro int(5) unsigned NOT NULL,
	PRIMARY KEY (CodAutor, CodLibro),
-- En MySQL los índices se llaman indistintamente KEY o INDEX
	KEY c_a (CodAutor),
	KEY c_l (CodLibro),
	FOREIGN KEY (CodAutor) REFERENCES Autores (CodigoAutor) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (CodLibro) REFERENCES Libros (CodigoLibro) ON UPDATE CASCADE ON DELETE CASCADE
);