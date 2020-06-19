Algoritmo sumar_numerosloop
    
    Definir num1, num2, resultado Como entero;
	Definir respuesta Como Caracter;
	Definir continuar como logico;
	
	continuar= Verdadero;
	
    Mientras (continuar==verdadero) hacer
		Escribir "Ingrese el primer número";
		Leer num1;
		Escribir "Ingrese el segundo número";
		Leer num2;
		
		resultado=(num1+num2);
		Escribir "La suma de los números ingresados es: " , resultado;	
		
		Escribir "Querés seguir realizando operaciones?";
		Escribir "Ingrese SI o NO";
		Leer respuesta;
		respuesta <- minusculas (respuesta);
		
			si (respuesta="no") entonces
				Escribir "Gracias por realizar esta operación";
				continuar=Falso;
				FinSi
	FinMientras
	
FinAlgoritmo
