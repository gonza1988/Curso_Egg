Algoritmo ejextra1
	
	//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el
	//curso actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el
	//			porcentaje puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que
	//			ingrese la cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.
	
	
	Definir cantninos, cantninas, curso Como Entero
	Definir porcentninos, porcentninas Como Real
	
	Escribir "Ingrese la cantidad de ni�os en el curso: "
	Leer cantninos
	Escribir "ahora ingrese la cantidad de ni�as: "
	Leer cantninas
	
	curso = cantninos + cantninas
	porcentninos = (cantninos / curso) *100
	porcentninas = 100 - porcentninos
	
	Escribir "El porcentaje de ni�os en el curso es :" porcentninos "%"
	Escribir "Y el porcentaje de ni�as en el curso es: " porcentninas "%"
FinAlgoritmo
