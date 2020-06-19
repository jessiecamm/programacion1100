Algoritmo Menu_Restaurante
	
	Definir platos, platosVendidos Como Entero;
	Definir total Como Real;
	Definir jamon, refresco, cerveza, tarta, sopa, bife como entero;
	Definir continuar Como Caracter;
	Definir i Como Entero;
	
	jamon=0;
	cerveza=0;
	refresco=0;
	tarta=0;
	sopa=0;
	bife=0;
	platosVendidos=0;
	total=0;
	continuar="si";
	
	
	Escribir "Cargar venta del día";
	
	Mientras (continuar=="si") Hacer
		
		Para i=1 hasta 10 Hacer
		Escribir "Ingrese la venta n°" , i ;
		Escribir "1. Sandwich de jamón: u$s1,50";
		Escribir "2. Refresco: s$s2,5";
		Escribir "3. Cerveza: s$s0,75";
		Escribir "4. Tarta de atún: u$s1,25";
		Escribir "5. Sopa de vegetales: u$s2,15";
		Escribir "6. Bife con guarnición: u$s5";
		Leer platos;
		
			Segun platos hacer
				1: escribir "Ha vendido un Sandwich de jamón";
					jamon=jamon+1;
					
				2: escribir "Ha vendido una lata de gaseosa";
					refresco=refresco+1;
					
				3: escribir "Ha vendido una lata de cerveza";
					cerveza=cerveza+1;
					
				4: escribir "Ha vendido una porción de tarta de atún";
					tarta=tarta+1;
					
				5: escribir "Ha vendido un plato de sopa de vegetales";
					sopa=sopa+1;
					
				6: escribir "Ha vendido un plato de bife con guarnición";
					bife=bife+1;
					
				De Otro Modo:
					Escribir "No tenemos disponible ese plato en el día de la fecha, por favor elija una opción válida";
			FinSegun
			
		FinPara
				
				Escribir "Necesitas seguir cargando platos del día de la fecha? (si/no)";
				Leer continuar;
				continuar <- Minusculas(continuar);
				Limpiar Pantalla;
				
					Si (continuar=="no") entonces
						platosVendidos=jamon+refresco+cerveza+sopa+tarta+bife;
						
						Escribir "Hoy se han vendido: " , platosVendidos , " platos.";
						Escribir "De los cuales: " , jamon , " fueron sandwiches de jamón.";
						Escribir refresco , " fueron latas de gaseosas. Y " , cerveza , " de cerveza.";
						Escribir "Se consumieron " , tarta , " porciones de tarta de atún, " ;
						Escribir sopa , " platos de sopa y " , bife , " platos de bife con guarnición";
						
						total=((jamon*1.5) + (refresco*2.5) + (cerveza*0.75) + (tarta*1.25) + (sopa*2.15) + (bife*5));
						Escribir "";
						Escribir "La venta del día asciende a: u$s" , total , ".";
						continuar="no";
					FinSi
			
	FinMientras

FinAlgoritmo
