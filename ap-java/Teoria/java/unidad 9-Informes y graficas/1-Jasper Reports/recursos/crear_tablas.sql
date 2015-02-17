CREATE DATABASE Formacion;
USE Formacion;

--
-- Tabla Cursos
--

CREATE TABLE Cursos (
  id_curso int(10) NOT NULL,
  nombre_curso varchar(75) NOT NULL,
  PRIMARY KEY (id_curso)
);

INSERT INTO Cursos VALUES (1, 'Analista-Programador Java');
INSERT INTO Cursos VALUES (2, 'Analista-Programador .NET');
INSERT INTO Cursos VALUES (3, 'Administrador SGBD');
INSERT INTO Cursos VALUES (4, 'Administrador sistemas Windows');

-- 
-- Tabla Alumnos
--

CREATE TABLE Alumnos (
  id_alumno int(10) NOT NULL,
  nombre_alumno varchar(100) NOT NULL,
  PRIMARY KEY  (id_alumno)
);

INSERT INTO Alumnos VALUES (10001, 'Pedro Morales');
INSERT INTO Alumnos VALUES (10002, 'Juan Garcia');
INSERT INTO Alumnos VALUES (10003, 'Ramon Sanchez');
INSERT INTO Alumnos VALUES (10004, 'Fernando Martinez');
INSERT INTO Alumnos VALUES (10005, 'Santiago Perez');
INSERT INTO Alumnos VALUES (10006, 'Luis Roman');
INSERT INTO Alumnos VALUES (10007, 'Jose Gomez');

-- 
-- Tabla Matriculas
--

CREATE TABLE Matriculas (
  id_matricula SERIAL,
  id_curso int(10) NOT NULL,
  id_alumno int(10) NOT NULL,
  fecha_inicio Date NOT NULL,
  PRIMARY KEY  (id_curso, id_alumno)
) AUTO_INCREMENT=300000;

INSERT INTO Matriculas VALUES (NULL, 1, 10001, '2009-03-15');
INSERT INTO Matriculas VALUES (NULL, 1, 10002, '2009-03-15');
INSERT INTO Matriculas VALUES (NULL, 1, 10003, '2009-03-15');
INSERT INTO Matriculas VALUES (NULL, 1, 10004, '2009-03-15');
INSERT INTO Matriculas VALUES (NULL, 2, 10005, '2009-03-15');
INSERT INTO Matriculas VALUES (NULL, 2, 10006, '2009-03-15');
INSERT INTO Matriculas VALUES (NULL, 2, 10007, '2009-03-15');


 ALTER TABLE Matriculas ADD CONSTRAINT matr_curso_fk FOREIGN KEY (id_curso) REFERENCES Cursos (id_curso) ON DELETE CASCADE ON UPDATE CASCADE;
 ALTER TABLE Matriculas ADD CONSTRAINT matr_alumno_fk FOREIGN KEY (id_alumno) REFERENCES Alumnos (id_alumno) ON DELETE CASCADE ON UPDATE CASCADE;