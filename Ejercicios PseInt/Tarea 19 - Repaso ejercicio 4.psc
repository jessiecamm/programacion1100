Algoritmo sin_titulo
	// Ejercicio 24
	// El siguiente es el menú de un restaurante de bocadillos. 
	// Diseñar un algoritmo capaz de leer el número de unidades consumidas de cada alimento ordenado y calcular la cuenta total. 
	// Vamos a suponer que estos precios son fijos, es decir, que son constantes.
	
	Definir jamon, refresco, cerveza Como real;
	Definir cantJamon, cantRefresco, cantCerveza como entero;
	Definir total como real;
	
	jamon=1.5;
	cerveza=0.75;
	refresco=1.05;
	total=0;
	
	Escribir "Introduce la cantidad de bocadillos de jamon vendidos";
	Leer cantJamon;
	
	Escribir "Introduce la cantidad de refrescos vendidos";
	Leer cantRefresco;
	
	Escribir "Introduce la cantidad de cervezas vendidas";
	Leer cantCerveza;
	
	total=(cantCerveza*cerveza)+ (cantJamon*jamon) + (cantRefresco*refresco);
	Escribir "La ganancia total del día asciende a: $" , total , ".";	
	
FinAlgoritmo
