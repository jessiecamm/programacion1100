Algoritmo descuentoContado
	
	Definir totalCompra como real;
	Definir metPago Como entero;
	
	Escribir "Ingrese el total de su compra";
	Leer totalCompra;
	
	Escribir "Seleccione el m�todo de pago: ";
	Escribir "1: Tarjeta de cr�dito/d�bito";
	Escribir "2: Efectivo";
	Escribir "3: App de Mercado Pago";
	Leer metPago;
	
		Segun metPago 
		1: Escribir "No hay promociones disponibles para el pago con tarjeta de cr�dito/d�bito.";
		2: Escribir "Usted ha elegido pagar al contado por lo que recibir� un 10% de descuento en el total de su compra.";
			Escribir "El total actualizado es de: " , (totalCompra-(totalCompra*10)/100) , " pesos.";
		3: Escribir "No contamos actualmente con promociones aplicables al total de su compra abonando con la App Mercado Pago.";
		De Otro Modo:
			Escribir "No disponemos de otros m�todos de pago, por favor seleccione uno v�lido.";
	FinSegun
	
FinAlgoritmo
