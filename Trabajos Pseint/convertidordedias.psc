Algoritmo ejextra4
	
	//A partir de una conocida cantidad de d�as que el usuario ingresa a trav�s del teclado,
	//escriba un programa para convertir los d�as en horas, en minutos y en segundos. Por
	//	ejemplo
	//	1 d�a = 24 horas = 1440 minutos = 86400 segundos
	
	Definir dias, horas, minutos,segundis Como Real
	Escribir "Por favor ingrese los dias a convertir "
	Leer dias
	
	horas = dias *24
	minutos = dias * 1440
	segundis = dias * 86400
	
	Escribir "Sus dias tienen :" horas " horas"
	Escribir minutos " minutos y "
	Escribir segundis " segundos"
	
FinAlgoritmo
