Algoritmo ej10extra2
	
	//. Una verdulería ofrece las manzanas con descuento según la siguiente tabla:
	//Nº DE KILOS	COMPRADOS   % DESCUENTO0 ? 
	//  0 - 2                      %0
	// 2.01 -5                     %10
	//5.01 - 10                    %15
	//10.01 en adelante            %20
	
	//Determinar cuánto pagará una persona que compre manzanas en esa verdulería
	
	///Definir kilos Como Entero
	Definir kilos, total, descuento, compra Como Real

	Escribir "Por favor ingrese de cuantos kilos es la compra: "
	Leer kilos
	
	si (kilos >= 0) y (kilos <= 2) Entonces
		compra = kilos * 50
		Escribir "Usted no tiene descuentos, su total por la cantidad de " kilos " kilos, es: " compra
	SiNo
		si (kilos > 2) y (kilos <= 5) Entonces
			total = kilos * 50
			descuento = (total * 10) /100 
			Escribir "Usted tiene %10 de descuento, su total por la cantidad de " kilos " kilos, es: $" total - descuento
			Escribir "Su descuento fue de :$" descuento
	SiNo
		si (kilos > 5) y (kilos <= 10) Entonces
			total = kilos * 50
			descuento = (total * 15) /100 
			Escribir "Usted tiene %15 de descuento, su total por la cantidad de " kilos " kilos, es: $" total - descuento
			Escribir "Su descuento fue de :$" descuento
		SiNo
			si (kilos > 10) Entonces
				total = kilos * 50
				descuento = (total * 20) /100 
				Escribir "Usted tiene %20 de descuento, su total por la cantidad de " kilos " kilos, es: $" total - descuento
				Escribir "Su descuento fue de :$" descuento
			SiNo
				Escribir "Cantidad de kilos invalida, reingresar "
			FinSi
		FinSi
	FinSi
	
		
	FinSi
FinAlgoritmo
