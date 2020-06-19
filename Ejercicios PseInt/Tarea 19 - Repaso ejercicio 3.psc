Algoritmo relojDigital
	
	// Ejercicio 28
	// Realiza un reloj digital que nunca pare. 
	// También debes hacer que espere un segundo real para darle mas realismo.
	
	Definir hs, min , seg Como Entero;
	
	hs=0;
	min=0;
	seg=0;
	
	Mientras Verdadero Hacer
		
		Si hs<10 entonces
			Escribir "0" Sin Saltar;
			si min<10 Entonces
				Escribir "0" Sin Saltar;
				si seg<10 entonces
					Escribir "0" Sin Saltar;
				FinSi
			FinSi
		FinSi
		
		Si seg=60 entonces
			seg=0;
			min=min+1;
			si min=60 Entonces
				min=0;
				hs=hs+1;
				si hs=24 entonces
					hs=0;
				FinSi
			FinSi
		FinSi
		
		Esperar 1 Segundos;
		
	FinMientras

FinAlgoritmo
