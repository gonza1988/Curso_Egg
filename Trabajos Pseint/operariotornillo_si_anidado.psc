Algoritmo ej13guia2
	
	//Escriba un programa para obtener el grado de eficiencia de un operario de una fábrica
	//de tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un
	//período de prueba:
	//	? Producir menos de 200 tornillos defectuosos.
	//	? Producir más de 10000 tornillos sin defectos.
	//El grado de eficiencia se determina de la siguiente manera:
	//	     ? Si no cumple ninguna de las condiciones, grado 5.
	//		? Si sólo cumple la primera condición, grado 6.
	//		? Si sólo cumple la segunda condición, grado 7.
	//		? Si cumple las dos condiciones, grado 8
	//Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el
	//ejercicio. No hacer todos al mismo tiempo y después probar.
	
	Definir tor_def,tor_bue Como Entero
	
	Escribir "Por favor ingresar la cantidad de tornillos defectuosos: "
	Leer tor_def
	Escribir "Y ahora los tornillos sin defectos "
	Leer tor_bue
	
	si tor_def < 200 y tor_bue > 10000 Entonces
		Escribir "Grado de operario nivel 8 "
	SiNo
		si tor_def < 200 y tor_bue <= 10000 Entonces
			Escribir " Grado de operario nivel 6 "
		SiNo
			si tor_def >= 200 y tor_bue > 10000 Entonces
				Escribir "Gradio de operario nivel 7 "
			SiNo
				Escribir "Grado de operario nivel 5 "
			FinSi
			
		FinSi
	FinSi
	
FinAlgoritmo
