Algoritmo apocalipsis_zombieeee
	
	Definir matriz Como Caracter
	Definir muestra como cadena
	Definir orden,i,j Como Entero
	
	Hacer
		Ingresar_muestra(muestra)
	Hasta Que validar_longitud(muestra, orden) = Verdadero y caracteres_validos(muestra) =  Verdadero
	
	Dimension matriz(orden,orden)
	
	cargar_matriz(matriz, orden, muestra)
	
	Para i <- 0 hasta orden-1
		Para j <-0 hasta orden-1
			Escribir "[ " matriz(i,j) " ]" " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
	detectar_genZ(matriz, orden)
	
FinAlgoritmo

SubProceso Ingresar_muestra(muestra Por Referencia)
	Escribir "Ingrese la muestra para analizar"
	leer muestra
	muestra = Mayusculas(muestra)
FinSubProceso

Funcion retorno_longitud <- validar_longitud(muestra Por Valor,orden Por Referencia)
	Definir retorno_longitud Como logico
	Definir long_muestra Como Entero
	long_muestra = Longitud(muestra)
	
	Si long_muestra = 9
		orden = 3
		retorno_longitud = Verdadero
	SiNo
		Si long_muestra = 16
			orden = 4
			retorno_longitud = Verdadero
		SiNo
			si long_muestra = 1369
				orden = 37
				retorno_longitud = Verdadero
			SiNo
				retorno_longitud = Falso
			FinSi
		FinSi
	FinSi
	
FinFuncion

Funcion validar_caracteres <- caracteres_validos(muestra Por Valor)
	Definir validar_caracteres Como Logico
	Definir i Como Entero
	
	Para i <- 0 hasta Longitud(muestra)-1
		Si Subcadena(muestra,i,i) = "A" o Subcadena(muestra,i,i) = "B" o Subcadena(muestra,i,i) = "C" o Subcadena(muestra,i,i) = "D"
			validar_caracteres = Verdadero
		SiNo
			validar_caracteres = Falso
		FinSi
	FinPara
	
	Si validar_caracteres = Falso
		Escribir "Bases erroneas o desconocidas, el Dr. Galard solo analiza las bases A,B,C y D..."
	FinSi
	
FinFuncion

SubProceso cargar_matriz(matriz Por Referencia, orden Por Valor, muestra Por Valor)
	Definir i, j, contador Como Entero
	contador = 0
	Para i <- 0 hasta orden-1
		Para j <- 0 hasta orden-1
			matriz(i,j) = Subcadena(muestra,contador,contador)
			contador = contador + 1
		FinPara
	FinPara
FinSubProceso

SubProceso detectar_genZ(matriz Por Referencia, orden por valor)
	Definir contador, contador1, contador2, i, j Como Entero
	
	contador = orden
	contador1 = 0
	contador2 = 0
	
	Para i <- 0 hasta orden-1
		Para j <- 0 hasta orden-1
			Si i = j
				Si matriz(i,j) = matriz(0,0)
					contador1 = contador1 + 1
				FinSi
			FinSi
			si j+i = orden-1
				si matriz(i,j) = matriz(0,orden-1)
					contador2 = contador2 + 1
				FinSi				
			FinSi
		FinPara
	FinPara
	
	Si contador1 = orden y contador2 = orden
		Escribir "Se ha detectado el gen Z! Ahora se podra generar un antígeno adecuado."
	SiNo
		Escribir "No se detecto el gen Z en la muestra ingresada, hay que seguir analizando!"
	FinSi
	
FinSubProceso
