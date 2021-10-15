Algoritmo ejextra1
	
	//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el
	//curso actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el
	//			porcentaje puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que
	//			ingrese la cantidad total de niños, y la cantidad total de niñas que hay en el curso.
	
	
	Definir cantninos, cantninas, curso Como Entero
	Definir porcentninos, porcentninas Como Real
	
	Escribir "Ingrese la cantidad de niños en el curso: "
	Leer cantninos
	Escribir "ahora ingrese la cantidad de niñas: "
	Leer cantninas
	
	curso = cantninos + cantninas
	porcentninos = (cantninos / curso) *100
	porcentninas = 100 - porcentninos
	
	Escribir "El porcentaje de niños en el curso es :" porcentninos "%"
	Escribir "Y el porcentaje de niñas en el curso es: " porcentninas "%"
FinAlgoritmo
