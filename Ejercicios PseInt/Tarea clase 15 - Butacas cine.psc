Algoritmo butacasCineLleno
	
	Definir butacaOcupada, butacaLibre Como Entero;
	Definir lista como entero;
	Definir fila, butaca como logico;
	Definir i, j Como entero;
	
	butacaLibre=0;
	butacaOcupada=0;
	fila=Verdadero;
	butaca=Verdadero;
	
	Dimension lista[16,15];
	Escribir "Escanear una por una las filas de la 1 a la 15 y las butacas de la 1 a la 14 por fila para determinar cuáles están ocupadas.";
	
	Para i=0 Hasta 15 Hacer
		Para j=0 hasta 14 hacer
			lista[i,j] = azar (240)+1;
				Si (fila == Verdadero) y (butaca ==Verdadero) entonces 
					butacaOcupada=butacaOcupada+1;
				SiNo
					butacaLibre=butacaLibre+1;
				FinSi
		FinPara
	FinPara		
	
	Escribir "";
	Escribir "Hay: " , butacaOcupada , " butacas ocupadas en esta sala del cine, de las 240 disponibles.";
	
FinAlgoritmo
