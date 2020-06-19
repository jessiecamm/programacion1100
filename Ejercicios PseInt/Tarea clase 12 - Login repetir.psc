Algoritmo LogIn_userypass_intentos
    
    Definir username, username1 Como Caracter;
    Definir pass, pass1 Como caracter;
    
    username="camm";
    pass= "cursoprogramacion";
	
	Repetir
		Escribir "Ingrese su nombre de usuario";
		Leer username1;
		
		Escribir "Ingrese su contraseña";
		Leer pass1;
		
			Si ((username==username1) Y (pass==pass1)) entonces escribir "Bienvenido al sistema!";
			SiNo Escribir "Uno o más datos son incorrectos, intentelo nuevamente";
			FinSi
		
	Hasta Que (pass==pass1);
	
FinAlgoritmo
