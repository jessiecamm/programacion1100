Algoritmo LogIn_userypass_intentos
    
    Definir username, username1 Como Caracter;
    Definir pass, pass1 Como caracter;
	Definir i como entero;
    
    username="camm";
    pass= "cursoprogramacion";
	i=3;
	
	Para i=3 hasta 1 hacer
		Escribir "Ingrese su nombre de usuario";
		Leer username1;
		
		Escribir "Ingrese su contrase�a";
		Leer pass1;
		
			Si ((username != username1) o (pass != pass1)) Entonces
				Escribir "Uno o m�s datos son incorrectos, le quedan ", i-1 , " intentos";
					Si i=1 entonces
						Escribir "Su usuario ha sido bloquedo, intentelo nuevamente m�s tarde";
					FinSi
			FinSi
		FinPara
		
		Si ((username==username1) y (pass==pass1)) Entonces
			Escribir "Bienvenido al sistema!";
		FinSi
	
FinAlgoritmo
