Algoritmo tablaMultiplicacion
	
	Definir numBase, numMultiplicador, numHasta, resultado Como entero;
	
	numMultiplicador=1;
	
	Escribir "Ingrese el número del que desee conocer la tabla de multiplicación: ";
	Leer numBase;
	
	Escribir "Ingrese el número hasta el que desea conocer la tabla: ";
	Leer numHasta;
	
	//NO ME ESTÁ TOMANDO EL <= (menor o igual) NO SÉ POR QUÉ, ME MULTIPLICA SOLO POR 1, POR ESO PUSE NUMHASTA+1
	//NO ENTIENDO QUE PASA PORQUE CON EL OTRO EJERCICIO LO HACE BIEN Y ES LO MISMO, SOLO CAMBIE LA ESTRUCTURA
	//A MENOS QUE ESTA ESTRUCTURA NO TOME EL MENOR O IGUAL (no sé)
	
	Hacer
		
		resultado = numBase * numMultiplicador;
		Escribir numBase , " x " , numMultiplicador , " = " , resultado;
		numMultiplicador = numMultiplicador+1;
		
	Hasta Que (numMultiplicador = numHasta+1);
	
FinAlgoritmo
