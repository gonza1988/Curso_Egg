Algoritmo ej2extra2
	
	//. Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
	//10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
	//mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
	//debe cobrar al cliente e imprimirlo por pantalla. 
	
	Definir mes Como Caracter
	Definir compra, descuento, total Como Real
	
	Escribir "Ingrese el monto de su compra :"
	Leer compra
	Escribir "Y ahora el mes de su compra "
	Leer mes
	
	si mes == "septiembre" o mes == "octubre" o mes == "noviembre"
		descuento = (compra * 10) / 100
		total = compra - descuento
		Escribir "El descuento de su compra es :" descuento ", dando un total de :" total
	SiNo
		Escribir "El total de su compra sin descuento es: " compra
	FinSi
FinAlgoritmo
