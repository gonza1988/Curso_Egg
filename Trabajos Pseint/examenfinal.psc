Algoritmo examen2
	
	Definir matriz,muestra Como Caracter
	Definir orden Como Entero
	Definir muestralogica Como Logico
	
	aseguratamano(muestra,muestralogica)
	aseguracaracter(muestra,muestralogica)
FinAlgoritmo

SubProceso aseguratamano(muestra Por Referencia,muestralogica Por Referencia)
	Definir tamano Como Entero
	//Definir muestralogica Como Logico
	
	Escribir "Ingrese la muestra que sea de 9,16 o 1369 caracteres "
	Leer muestra
	Mientras (Longitud(muestra) <> 9) y (Longitud(muestra) <> 16) y (Longitud(muestra) <> 1369) Hacer
		Escribir "Tamaño incorrecto de la muestra, REINTENTE "
		Leer muestra
	FinMientras
	
	muestralogica = Verdadero
	tamano = Longitud(muestra)
	cuadrada = rc(tamano)
	
FinSubProceso

SubProceso aseguracaracter(muestra,muestralogica)
	
	
	
FinSubProceso
	