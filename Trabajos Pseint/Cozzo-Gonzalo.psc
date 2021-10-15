Algoritmo integrador
	
	//Gonzalo Cozzo
	
	//Variables de entrada: valor de M (tamaño de la matriz 3,4,37). muestra de gen(valores de la matriz). 
	//Variables de salida: matriz. msj si se ha detectado o no el gen Z
	
	Definir tamano Como Entero
	Definir matriz Como Caracter
	Definir mensaje Como Logico
	
	aseguratamano(tamano)
	
	Dimension matriz(tamano,tamano)
	
	llenadomatriz(matriz,tamano)
	
	//muestramatriz(matriz,tamano)
	
	
	mensaje = muestravalida( matriz,tamano )
	
	si mensaje = Verdadero
		Entonces
		Escribir "SE HA DETECTADO EL GEN Z "
		muestramatriz(matriz,tamano)
	SiNo
		Escribir "NO SE HA DETECTADO EL GEN Z "
	FinSi
	
FinAlgoritmo


SubProceso aseguratamano(tamano Por Referencia)

	Escribir "Ingrese tamaño de la matriz "
	Leer tamano
	
	Mientras (tamano <> 3) y (tamano <> 4) y (tamano <> 37) Hacer
		Escribir "Tamaño incorrecto de la matriz, REINTENTE "
		Leer tamano
	FinMientras
	
FinSubProceso

SubProceso llenadomatriz(matriz,tamano)
	Definir i,j Como Entero
	Definir muestra Como Caracter
	
	muestra = ""
	
	Para i = 0 Hasta tamano-1 Hacer
		Para j = 0 Hasta tamano-1 Hacer
			Escribir "Ingrese muestra a la matriz ( A,B,C o D ) " i, "," j
			Leer muestra
			muestra = Mayusculas(muestra)
			Mientras (muestra <> "A") y (muestra <> "B") y (muestra <> "C") y (muestra <> "D") Hacer
				Escribir "Muestra incorrecta, REINTENTE "
				Leer muestra
				muestra = Mayusculas(muestra)
			FinMientras
			matriz(i,j) = muestra
			
		Fin Para
	FinPara
	
FinSubProceso

SubProceso muestramatriz(matriz,tamano)
	Definir i, j Como Entero
	
	Escribir "Subproceso muestra matriz: "
	
	Para i=0 Hasta tamano-1 Hacer
		Para j=0 Hasta tamano-1 Hacer
			Escribir Sin Saltar " [ " matriz(i,j) " ] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

Funcion evaluamuestra <- muestravalida ( matriz,tamano )
	Definir evaluamuestra Como Logico
	Definir i,j, contador, contador1 Como Entero
	
	contador = 0
	contador1 = 0
	
	Para i=0 Hasta tamano-1 Hacer
		Para j=0 Hasta tamano-1 Hacer
			si i = j  Entonces
				si matriz(i,j) = matriz(0,0)
					contador = contador +1
				FinSi
			FinSi
			si i+j = tamano-1 Entonces
				si matriz(i,j) = matriz(0,tamano-1) Entonces
					contador1 = contador1 + 1
				FinSi
			FinSi
		Fin Para
	FinPara
	
	si contador = tamano y contador1 = tamano
		evaluamuestra = Verdadero
	sino 
		evaluamuestra = Falso
	FinSi
	
Fin Funcion
