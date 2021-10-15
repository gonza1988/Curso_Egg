Algoritmo ej4extra32
	
	//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea
    //calcular el jornal diario de acuerdo con las siguientes reglas:
	//a) La tarifa de las horas diurnas es de $ 90
	//b) La tarifa de las horas nocturnas es de $ 125
	//c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y
	//	en un 15% si el turno es nocturno.
	//	El programa debe solicitar la siguiente información al usuario: el nombre del
	//		trabajador, el día de la semana, el turno (diurno o nocturno) y la cantidad de horas
	//		trabajadas. Además, debemos preguntarle al usuario si el día de la semana (lunes,
	//			martes, miércoles, etc.) era festivo o no, para poder calcular el jornal diario. Utilice
	//				una función para realizar el cálculo.
	
	Definir nombre, dia, turno, feriado Como caracter
	Definir horastrab Como Entero
	
	Escribir "Ingrese su nombre "
	Leer nombre
	Escribir "Ingrese dia trabajado "
	Leer dia
	Escribir "Ingrese el turno en que se desempeño: DIA/NOCHE "
	Leer turno
	Escribir "Indique si el dia es feriado = si. "
	Escribir "O si es dia comun = no "
	Leer feriado
	Escribir "Finalmente indique las horas trabajadas "
	Leer horastrab
	
	Escribir nombre
	Escribir dia
	Escribir turno
	Escribir "Feriado? " feriado
	Escribir "Horas trabajadas " horastrab
	
	Escribir " El sueldo total es " sueldodiario(nombre,dia,turno,feriado,horastrab)
FinAlgoritmo

Funcion calculo <- sueldodiario( nombre,dia,turno,feriado,horastrab )
	Definir calculo, aux Como Real
	
	turno = Mayusculas(turno)
	feriado = Mayusculas(feriado)
	
	Segun turno Hacer
		"DIA":
			si feriado = "SI" Entonces
				aux = 90* horastrab
				calculo = aux + (aux *10 / 100)
			SiNo
				calculo = 90 * horastrab 
			FinSi
		"NOCHE":
			si feriado = "SI" Entonces
				aux = 125 * horastrab
				calculo = aux + (aux *15 / 100)
			SiNo
				calculo = calculo + (calculo*15)/100
			FinSi
			
	Fin Segun
	
Fin Funcion

