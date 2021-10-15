Algoritmo ej3
	//Escribir un programa que calcule el precio promedio de un producto. El precio promedio
	//se debe calcular a partir del precio del mismo producto en tres establecimientos
	//distintos.
	
	Definir producto Como Caracter
	Definir precio1, precio2, precio3, promedio Como Real
	
	Escribir "Mencione el producto a promediar"
	Leer producto
	
	Escribir "Por favor detalle el precio de los 3 productos "
	Leer precio1, precio2, precio3
	
	promedio= (precio1+precio2+precio3) / 3
	
	Escribir "El promedio del producto " producto " es: " promedio
	
	
	
FinAlgoritmo
