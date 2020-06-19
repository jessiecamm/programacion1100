Algoritmo busquedaCliente
	
	Definir clienteBuscado, listaCliente Como Caracter;
	Definir ayelenLamas, alexiaDechecchi, florenciaUrchipia, naylaStoessel, victoriaBiancotti como caracter;
	Definir encontrado como logico;
	Definir i, long como entero;
	Definir pos como real;
		
	Dimension listaCliente[5];
	listaCliente[0]=ayelenLamas;
	listaCliente[1]=alexiaDechecchi;
	listaCliente[2]=florenciaUrchipia;
	listaCliente[3]=naylaStoessel;
	listaCliente[4]=victoriaBiancotti;
	
	long=4;
	encontrado=falso;
	pos=-1;
	
	Escribir "Ingrese el nombre del cliente qué está buscando:";
	Leer clienteBuscado;
	
	Para i=0 hasta long Hacer
		Si listaCliente[i] == clienteBuscado
			pos=[i];
			encontrado=Verdadero;
				Escribir "El cliente buscado se encuentra en la posición: " , i;
			SiNo
				Escribir "No se encuentra dicho cliente en nuestra base de datos,";
			FinSi
	FinPara
	
FinAlgoritmo
