Algoritmo ejextra4
	
	//A partir de una conocida cantidad de días que el usuario ingresa a través del teclado,
	//escriba un programa para convertir los días en horas, en minutos y en segundos. Por
	//	ejemplo
	//	1 día = 24 horas = 1440 minutos = 86400 segundos
	
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
