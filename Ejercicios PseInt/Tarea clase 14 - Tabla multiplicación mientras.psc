Algoritmo tablaMultiplicacion
	
	Definir numBase, numMultiplicador, numHasta, resultado Como entero;
	
	numMultiplicador=1;
	
	Escribir "Ingrese el número del que desee conocer la tabla de multiplicación: ";
	Leer numBase;
	
	Escribir "Ingrese el número hasta el que desea conocer la tabla: ";
	Leer numHasta;
	
	Mientras (numMultiplicador <= numHasta) hacer
		resultado = numBase * numMultiplicador;
		Escribir numBase , " x " , numMultiplicador , " = " , resultado;
		numMultiplicador = numMultiplicador+1;
	FinMientras
	
FinAlgoritmo
