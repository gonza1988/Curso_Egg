Algoritmo ej2guia2
	
	//Un hombre desea saber si su sueldo es mayor al sueldo m�nimo, el programa le pedir�
	//al usuario su sueldo actual y el sueldo m�nimo. Si el sueldo es mayor al m�nimo se debe
	//	mostrar un mensaje por pantalla indic�ndolo.
	
	Definir sueldo, sueldominimo Como Real
	Escribir "Por favor ingrese el sueldo minimo y a continuacion su sueldo actual: "
	Leer sueldominimo,sueldo
	
	Si sueldo > sueldominimo Entonces
		Escribir "Su sueldo es mayor al sueldo minimo establecido �FELICITACIONES!"
	FinSi
FinAlgoritmo
