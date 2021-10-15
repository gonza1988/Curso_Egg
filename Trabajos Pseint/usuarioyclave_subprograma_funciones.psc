Algoritmo ej3extra32
	
	//Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña
	//y que devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es
	//		"asdasd". Además la función calculara el número de intentos que se ha usado para
	//			loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la función devolverá
    //Falso
	
	Definir usuario, contrasena Como Caracter
	
	Escribir "Ingrese Su nombre de usuario"
	Leer usuario
	Escribir "Ingrese su contraseña: "
	Leer contrasena
	
	Escribir Login(usuario,contrasena)	
	
FinAlgoritmo

Funcion evalua <- Login(usuario,contrasena)
	Definir evalua Como Logico
	Definir contador, i Como Entero
	
	contador = 1
	
	Para i = 1 Hasta 2 Hacer
		si usuario = "usuario1" y contrasena = "asdasd" Entonces
			evalua = Verdadero
		SiNo
			evalua = Falso
			Escribir "Error de datos, REINGRESE "
			Leer usuario,contrasena
			
		FinSi
	FinPara
	
	//Hacer
		
	//	Escribir "Error de escritura, REINTENTE "
	//	Leer usuario,contrasena
	//	contador = contador + 1

	//	si contador < 3 Entonces
	//		evalua = Verdadero
	//	SiNo
	//		evalua = Falso
	//	FinSi
	//Mientras que contador < 3  y usuario <> "usuario1" y contrasena <> "asdasd"  

Fin Funcion
