Algoritmo INSERCION
	
	Definir valor_actual, mi_vector Como Entero;
	Definir i,j Como Entero;
	Dimension mi_vector[5];
	
	//cargo el vector con valores aleatorios
	Para i=0 hasta 4;
		mi_vector[i]=Azar(100);
		Escribir "Vector en la posicion ",i," tiene el numero: ",mi_vector[i];
	FinPara
	
	//algoritmo de ordenamiento por insercion
	Para i=1 hasta 4
		valor_actual=mi_vector[i];
		j=i-1;
		Mientras (j>=0 Y mi_vector[j]>valor_actual) Hacer
			mi_vector[j+1]=mi_vector[j];
			j=j-1;
		FinMientras
		mi_vector[j+1]=valor_actual;
	FinPara
	
	//verificacion
	Para i=0 hasta 4
		Escribir "Vector en la posicion ",i," tiene el numero: ",mi_vector[i];
	FinPara
	
FinAlgoritmo
