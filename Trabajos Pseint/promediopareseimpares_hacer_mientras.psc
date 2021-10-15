Algoritmo ej8extra22
	
	//Hacer un algoritmo para calcular la media de los números pares e impares, sólo se
	//ingresará diez números.
	
	Definir num, suma_par, suma_impar, contador_par, contador_impar Como Real
	
	suma_par = 0
	suma_impar = 0
	contador_par = 0
	contador_impar = 0
	
	Hacer
		Escribir "Ingresar numero "
		Leer num
		
		si num mod 2 = 0 Entonces
			contador_par = contador_par + 1
			suma_par = suma_par + num
			
		SiNo
			contador_impar = contador_impar + 1
			suma_impar = suma_impar + num
		FinSi
	Mientras Que contador_par + contador_impar <> 10
	
	Escribir "El promedio de numeros pares es " suma_par/contador_par
	Escribir "EL promedio de numeros impares es " suma_impar / contador_impar
	
FinAlgoritmo
