Algoritmo ej5
	//Escribir un programa que calcule cu�ntos litros de combustible consumi� un autom�vil.
	//El usuario ingresase una cantidad de litros de combustible cargados en la estaci�n y
	//una cantidad de kil�metros recorridos, despu�s, el programa calcular� el consumo
	//(km/lt) y se lo mostrar� al usuario.
	
	Definir kilometros, litros, calculador Como Real
	Escribir "Para conocer cuantos litros por kilometro consume su auto, por favor ingrese los litros cargados :"
	Leer litros
	Escribir "Ahora ingrese la cantidad de kilometros recorridos :"
	Leer kilometros
	
	calculador = kilometros / litros
	
	Escribir "Su auto recorre " calculador " kilometros por litro "
	
FinAlgoritmo
