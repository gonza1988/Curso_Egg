Algoritmo ejextra5
	
	//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio
	//del a�o, y el precio del mismo producto al finalizar el a�o. El programa debe calcular cu�l
	//fue el porcentaje de aumento que tuvo ese producto en el a�o y mostrarlo por pantalla.
	
	Definir producto Como Caracter
	Definir productoenero, productodiciembre, aumento Como Real
	
	Escribir "Por favor ingresar el nombre del producto: "
	Leer producto
	Escribir "Ahora ingresar el precio de enero: "
	Leer productoenero
	Escribir "Finalmente ingrese el precio de diciembre: "
	Leer productodiciembre
	
	aumento = ((productodiciembre-productoenero) / productoenero) * 100
	
	Escribir "El producto " producto " ha aumentado un " aumento "%"
FinAlgoritmo
