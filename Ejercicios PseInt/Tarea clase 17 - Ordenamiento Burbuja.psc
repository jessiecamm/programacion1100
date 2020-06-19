Algoritmo Burbuja
	
	Definir lista, lon, aux, i, j, n como entero;
	
	Dimension lista[6];
	lista[1]=35;
	lista[2]=21;
	lista[3]=14;
	lista[4]=12;
	lista[5]=53;

	lon=5;
	j=lon;
	
	Hacer
		n=0;
		Para i=2 Hasta j Hacer
			Si lista[i-1]>lista[i]
				aux=lista[i-1];
				lista[i-1]=lista[i];
				lista[i]=aux;
				n=i;
			FinSi
		FinPara
		j=n;
	Hasta Que n=0;

	Para i=1 Hasta lon Hacer
		Escribir lista[i] " ";
	FinPara
	Escribir "";

FinAlgoritmo
