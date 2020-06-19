Algoritmo descuentoOctubre
	
	// Ejercicio 8
	// Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes de octubre. 
	// Dado un mes y un importe, calcular cuál es la cantidad que se debe cobrar al cliente.
	
	Definir descuento Como Real;
	Definir compra, totalCompra como Real;
	Definir mes, octubre Como Caracter;
	
	Escribir "Ingrese el total de su compra";
	Leer compra;
	
	Escribir "Ingrese el mes de la compra";
	Leer mes;
	
	descuento=0.15;
	totalCompra= compra-(compra*descuento);
	
	Si mes=="octubre" entonces
		Escribir "Recibirá un descuento del 15% por su compra";
		Escribir "El total de su compra será de: $ " , totalCompra , ".";
		
	SiNo
		Escribir "Lo sentimos, no contamos con descuentos disponibles para este mes";
		Escribir "El total de su compra es: $ " , compra , ".";
	FinSi

FinAlgoritmo
