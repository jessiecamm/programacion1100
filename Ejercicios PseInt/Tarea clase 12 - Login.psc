Algoritmo LogIn_userypass
    
    Definir username, username1 Como Caracter;
    Definir pass, pass1 Como caracter;
    
    username="camm";
    pass= "cursoprogramacion";
	
	Escribir "Ingrese su nombre de usuario";
	Leer username1;

	Escribir "Ingrese su contrase�a";
	Leer pass1;
	
		Si ((username==username1) Y (pass==pass1)) entonces escribir "Bienvenido al sistema!";
		SiNo Escribir "Uno o m�s datos son incorrectos";
		FinSi
	
FinAlgoritmo
