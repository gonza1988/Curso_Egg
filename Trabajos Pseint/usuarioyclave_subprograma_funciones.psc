Algoritmo ej3extra32
	
	//Crear una funci�n llamada "Login", que recibe un nombre de usuario y una contrase�a
	//y que devuelve Verdadero si el nombre de usuario es "usuario1" y si la contrase�a es
	//		"asdasd". Adem�s la funci�n calculara el n�mero de intentos que se ha usado para
	//			loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la funci�n devolver�
    //Falso
	
	Definir usuario, contrasena Como Caracter
	
	Escribir "Ingrese Su nombre de usuario"
	Leer usuario
	Escribir "Ingrese su contrase�a: "
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
