Algoritmo ej5extra2
	
	//Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por
	//pantalla un mensaje que indique a qué día de la semana corresponde. Considere que el
	//número 1 corresponde al día "Lunes", y así sucesivamente.
	
	Definir valr Como Entero
	
	Escribir "Ingrese un numero del 1 al 7 "
	Leer valr
	
	Segun valr Hacer
		1:
			Escribir "Su dia es LUNES "
		2:
			Escribir "Su dia es MARTES "
		3:
			Escribir "Su dia es MIERCOLES "
		4:
			Escribir "Su dia es JUEVES "
		5:
			Escribir "Su dia es VIERNES"
		6:
			Escribir "Su dia es SABADO "
		7:
			Escribir "Su dia es DOMINGO"
		De Otro Modo:
			Escribir "NUMERO INCORRECTO "
	Fin Segun
FinAlgoritmo
