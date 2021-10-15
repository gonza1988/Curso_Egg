Algoritmo ej2guia2
	
	//Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá
	//al usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
	//	mostrar un mensaje por pantalla indicándolo.
	
	Definir sueldo, sueldominimo Como Real
	Escribir "Por favor ingrese el sueldo minimo y a continuacion su sueldo actual: "
	Leer sueldominimo,sueldo
	
	Si sueldo > sueldominimo Entonces
		Escribir "Su sueldo es mayor al sueldo minimo establecido ¡FELICITACIONES!"
	FinSi
FinAlgoritmo
