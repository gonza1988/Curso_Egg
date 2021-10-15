Algoritmo ej8extra2
	
	//Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
	//entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000. Obtener
	//	la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que
	//	compra, y el monto total que tiene que pagar por el total de la compra.
	
	Definir llantas, total Como Entero
	
	Escribir "Ingrese la cantidad de llantas que desea comprar "
	Leer llantas
	
	si llantas < 5 Entonces
		total = llantas * 3000
		Escribir "El precio unitario de cada llanta es de $3000 "
		Escribir "Por lo tanto el monto total por la compra de " llantas " es de : $" total
	SiNo
		si llantas >=5 y llantas <= 10 Entonces
			total = llantas * 2500
			Escribir "El precio unitario de cada llanta es de $2500 "
			Escribir "Por lo tanto el monto total por la compra de " llantas " es de : $" total
		SiNo
			total = llantas * 2000
			Escribir "El precio unitario de cada llanta es de $2000 "
			Escribir "Por lo tanto el monto total por la compra de " llantas " es de : $" total
		FinSi
	FinSi
FinAlgoritmo
