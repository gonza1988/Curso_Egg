Algoritmo ej5
	//Escribir un programa que calcule cuántos litros de combustible consumió un automóvil.
	//El usuario ingresase una cantidad de litros de combustible cargados en la estación y
	//una cantidad de kilómetros recorridos, después, el programa calculará el consumo
	//(km/lt) y se lo mostrará al usuario.
	
	Definir kilometros, litros, calculador Como Real
	Escribir "Para conocer cuantos litros por kilometro consume su auto, por favor ingrese los litros cargados :"
	Leer litros
	Escribir "Ahora ingrese la cantidad de kilometros recorridos :"
	Leer kilometros
	
	calculador = kilometros / litros
	
	Escribir "Su auto recorre " calculador " kilometros por litro "
	
FinAlgoritmo
