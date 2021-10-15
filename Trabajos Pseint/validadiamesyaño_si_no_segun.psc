Algoritmo ej6extra2
	
	//Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una fecha
	//válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha es
    //válida se debe imprimir la fecha cambiando el número que representa el mes por su
	//nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006". 
	
	Definir dia, mes, anio Como Entero
	
	Escribir "Ingrese dia, mes y año "
	Leer dia, mes, anio
	
	si mes = 1 o mes = 3 o mes = 5 o mes = 7 o mes = 8 o mes = 10 o mes = 12 Entonces
		si dia >= 1 y dia <= 31 Entonces
			Segun mes Hacer
				1:
					Escribir dia,"/Enero/", anio
				3:
					Escribir dia,"/Marzo/" , anio
				5:
					Escribir dia,"/Mayo/",anio
				7:
					Escribir dia,"/Julio/" , anio
				8:
					Escribir dia,"/Agosto/", anio
				10:
					Escribir dia,"/Octubre/" , anio
				12:
					Escribir dia,"/Diciembre/" , anio
					
			Fin Segun
		SiNo
			Escribir "Fecha no valida "
		FinSi
	SiNo
		si mes = 4 o mes = 6 o mes = 9 o mes = 11 Entonces
			si dia >= 1 y dia <= 30 Entonces
				Segun mes Hacer
					4:
						Escribir dia,"/Abril/", anio
					6:
						Escribir dia,"/Junio/" , anio
					9:
						Escribir dia,"/Septiembre/",anio
					11:
						Escribir dia,"/Noviembre/" , anio					
				Fin Segun
			SiNo
				Escribir "Fecha no valida "
			FinSi
		SiNo
			si mes = 2 Entonces
				si dia >= 1 y dia <= 28 Entonces
					Escribir dia,"/Febrero/",anio
				SiNo
					Escribir "Fecha no valida"
				FinSi
		FinSi
	FinSi
FinSi

FinAlgoritmo
