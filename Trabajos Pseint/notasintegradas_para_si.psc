Algoritmo ej8guia22
	
	//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de
	//sus N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
	//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
	//de sus estudiantes:
	//? Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
	//reprueba el curso si tiene una nota final inferior a 6.5
	//	? Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
	//	? La mayor nota obtenida en las exposiciones.
	//	? Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
	//	El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno
	//pedirá las 3 notas y calculará todos informes claves que requiere el docente. Nota: para
	//		trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el ejercicio.
	//		No hacer todos al mismo tiempo y después probar.
	
	Definir alumnos, reprobados, integradormassiete, i Como Entero
	Definir integrador, exposicion, parcial,MayorExpocicion, ParcialCosa Como Real
	
	Escribir "ingrese numero de alumnos"
	leer alumnos
	reprobados <- 0
	integradormassiete <- 0
	MayorExpocicion <- 0
	ParcialCosa <- 0
	
	para i <- 1 Hasta alumnos Hacer
		// notocar
		Escribir "Alumno " i " ingrese sus tres notas en orden"
		Escribir " Ingresar integrador "
		leer integrador
		Escribir " Ingresar exposicion "
		leer exposicion 
		Escribir " Ingresar parcial "
		leer parcial
		
		//datos que pide
		
		//reprobados
		si ((integrador/100)*35) + ((exposicion/100)*25) + ((parcial/100)*40) < 6.5 Entonces
			reprobados <- reprobados +1
		FinSi
		
		//integrador mas de 7.5
		si integrador > 7.5
			integradormassiete <- integradormassiete +1
		FinSi
		
		
		//mayor nota
		si exposicion > MayorExpocicion Entonces
			MayorExpocicion <- exposicion
		FinSi
		
		//total de alumnos con nota entre 4 y 7.5
		si parcial <= 7.5 o parcial >= 4 Entonces
			ParcialCosa <- ParcialCosa +1
		FinSi
		
	FinPara
	
	Escribir "El numero de reprobados es " reprobados
	Escribir "el porcentaje de aprobados con mas de 7.5 es " (100/alumnos)*integradormassiete " porciento"
	Escribir "la mayor nota de expocicion es " MayorExpocicion
	Escribir "Parciales entre 4 y 7.5 " ParcialCosa
	
FinAlgoritmo
