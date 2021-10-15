Algoritmo ej4extra4
	
	//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre
	//0 y 20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de
	//PseInt. Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos
//estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20
	
	Definir vector, i, deficiente, regular, bueno, excelente Como Entero
	
	Dimension vector(100)
	
	deficiente = 0
	regular = 0
	bueno = 0
	excelente = 0
	
	Para i = 0 Hasta 99 Hacer
		vector(i) = Aleatorio(0,20)
		si vector(i) >= 0 y vector(i) <= 5 Entonces
			deficiente = deficiente + 1
		SiNo
			si vector(i) >= 6 y vector(i) <= 10 Entonces
			regular = regular + 1
		SiNo
			si vector(i) >= 11 y vector(i) <= 15 Entonces
			bueno = bueno + 1
		SiNo
			si vector(i) >= 16 y vector(i) <= 20 Entonces
				excelente = excelente + 1
			
			FinSi
		FinSi
	FinSi
FinSi

	FinPara
	
	Para i = 0 Hasta 99 Hacer
		Escribir " [ " vector(i) " ] " Sin Saltar
	FinPara
	
	Escribir ""
	Escribir "Alumnos Deficientes: " deficiente
	Escribir "Alumnos Regulares: " regular
	Escribir "Alumnos Buenos: " bueno
	Escribir "Alumnos Excelentes: " excelente
	
FinAlgoritmo
