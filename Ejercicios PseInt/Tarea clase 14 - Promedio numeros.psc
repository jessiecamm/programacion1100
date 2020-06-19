Algoritmo promNumeros
	
	Definir num1, num2, num3, num4 Como Real;
	Definir promedio Como Real;
	Definir total Como Real;
	Definir i Como Entero;	
	
	i=1;
	total=0;
	promedio=0;
	
	Para i=1 hasta 4 Hacer
		Escribir "Ingrese el n°" , i , " que desea promediar";
			Segun i
				1: Leer num1;
				2: Leer num2;
				3: Leer num3;
				4: Leer num4;
				De Otro Modo:
					Escribir "Error, sólo necesitamos cuatro números para promediar";
			FinSegun
	FinPara
	
	total= num1 + num2 + num3 + num4;
	promedio= (total/4);
	
	Escribir "El promedio de los números ingresados es: " , promedio, ".";
	
FinAlgoritmo
