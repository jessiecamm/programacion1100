Algoritmo sumar_numerosloop
    
    Definir num1, num2, resultado Como entero;
	Definir respuesta Como Caracter;
	Definir continuar como logico;
	
	continuar= Verdadero;
	
    Mientras (continuar==verdadero) hacer
		Escribir "Ingrese el primer n�mero";
		Leer num1;
		Escribir "Ingrese el segundo n�mero";
		Leer num2;
		
		resultado=(num1+num2);
		Escribir "La suma de los n�meros ingresados es: " , resultado;	
		
		Escribir "Quer�s seguir realizando operaciones?";
		Escribir "Ingrese SI o NO";
		Leer respuesta;
		respuesta <- minusculas (respuesta);
		
			si (respuesta="no") entonces
				Escribir "Gracias por realizar esta operaci�n";
				continuar=Falso;
				FinSi
	FinMientras
	
FinAlgoritmo
