Algoritmo ej4extra2
	
	//La empresa "Te llevo a todos lados" está destinada al alquiler de autos y tiene un sistema
	//de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro
	//	de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de
	//	regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la
	//	cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra
	//	40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total
	//	de $5,20 el minuto de uso. Realice un programa que permita registrar esa información y
	//	el total a pagar por el cliente.
	
	Definir horas, litros, calcu_horas, calcu_final Como Real
	
	Escribir "Ingrese la cantidad de horas transcurridas "
	Leer horas
	
	si horas <= 2 Entonces
		Escribir "Su tarifa a pagar es de $400 "
	SiNo
		Escribir "Ahora ingrese la cantidad de litros de nafta utilizados "
		Leer litros
		calcu_horas = horas * 312
		calcu_final = (litros * 40) + calcu_horas
		Escribir "Su tarifa a pagar es " calcu_final
	FinSi
FinAlgoritmo
