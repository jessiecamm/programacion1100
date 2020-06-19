Algoritmo LogIn_clavenumerica
    
    Definir pass, pass1 Como caracter;
    
    pass= "1234";
	
    Escribir "Bienvenido nuevamente Camm";
	Escribir "Ingrese tu contraseña para acceder al sistema";
    Leer pass1;
	
		Si (pass==pass1) entonces escribir "Bienvenido al sistema!";
		SiNo Escribir "La contraseña ingresada es incorrecta";
		FinSi
    
FinAlgoritmo
