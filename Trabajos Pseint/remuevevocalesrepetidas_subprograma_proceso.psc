Algoritmo ej5extra3
	
	//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las
	//vocales repetidas. Al final el procedimiento mostrará la frase final
	
	Definir fraseentrada Como Caracter
	
	Escribir "Ingrese la frase de entrada "
	Leer fraseentrada
	
	removervocalesrepetidas(fraseentrada)
	
FinAlgoritmo

SubProceso removervocalesrepetidas(fraseentrada Por Referencia)
	Definir j,contadorA,contadorE,contadorI,contadorO,contadorU Como Entero
	Definir caracteractual,nuevafrase Como Caracter
	
	nuevafrase=""
	contadorA=0
	contadorE=0
	contadorI=0
	contadorO=0
	contadorU=0
	
	Para j = 0 Hasta (Longitud(fraseentrada)-1) Con Paso 1 Hacer
		caracteractual = Mayusculas(Subcadena(fraseentrada,j,j))
		Segun caracteractual Hacer
			"A":
				contadorA = contadorA + 1
			"E":
				contadorE = contadorE + 1
			"I":
				contadorI = contadorI + 1
			"O":
				contadorO = contadorO + 1
			"U":
				contadorU = contadorU + 1
		Fin Segun
		si (caracteractual = "A" y contadorA > 0) o (caracteractual = "E" y contadorE > 0) o (caracteractual = "I" y contadorI > 0) o (caracteractual = "O" y contadorO > 0) o (caracteractual = "U" y contadorU > 0) Entonces
			nuevafrase = Concatenar(nuevafrase,"")
		SiNo
			nuevafrase = Concatenar(nuevafrase,Subcadena(fraseentrada,j,j))
		FinSi
		
		
	FinPara
	
	Escribir nuevafrase
FinSubProceso
	