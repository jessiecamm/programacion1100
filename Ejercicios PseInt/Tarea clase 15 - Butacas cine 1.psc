Algoritmo butacasCine
	
	Definir butacaOcupada Como Entero;
	Definir lista como entero;
	Definir butacaActual como logico;
	Definir i Como entero;
	
	butacaOcupada=0;
	butacaActual=Verdadero;
	
	Dimension lista[240];
	Escribir "Escanear una por una las filas de la 1 a la 15 y las butacas de la 1 a la 14 por fila para determinar cuáles están ocupadas.";
	
	Para i=0 Hasta 241 Hacer	
		Si (butacaActual == Verdadero) entonces 
			butacaOcupada = butacaOcupada+1;
		FinSi
	FinPara		
	
	Escribir "";
	Escribir "Hay: " , butacaOcupada , " butacas ocupadas en esta sala del cine, de las 240 disponibles.";
	
FinAlgoritmo
