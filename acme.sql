CREATE DATABASE acme;

CREATE TABLE empleados(
	legajo INT AUTO_INCREMENT PRIMARY KEY ,
	nombre VARCHAR( 100 ),
    domicilio VARCHAR( 100 ),
    departamento VARCHAR( 100 )
)

CREATE TABLE productos(
	codigo INT AUTO_INCREMENT PRIMARY KEY ,
	nombre VARCHAR( 100 ),
    precio NUMERIC,
    descripcion VARCHAR( 100 )
)


INSERT INTO empleados(nombre, departamento)
VALUES( 'Jose', 'IT');

INSERT INTO empleados(nombre, departamento)
VALUES( 'Homero', 'Monitoreo de Planta');

INSERT INTO empleados(nombre, departamento)
VALUES( 'Smither', 'Gerencia');

INSERT INTO productos(nombre,precio,descripcion)
VALUES( 'prod1','10','desc1');

INSERT INTO productos(nombre,precio,descripcion)
VALUES( 'prod2','11','desc2');

INSERT INTO productos(nombre,precio,descripcion)
VALUES( 'prod3','13','desc3');

SELECT legajo, nombre, departamento FROM empleados

SELECT * FROM empleados ORDER BY nombre;

SELECT * FROM empleados WHERE legajo = '1';

SELECT * FROM empleados WHERE nombre LIKE 'j%';

DELETE FROM empleados WHERE legajo = 1;

DELETE FROM empleados;

UPDATE SET departamento = 'IT' WHERE legajo = 2;

UPDATE SET departamento = 'IT' WHERE departamento = 'ventas';