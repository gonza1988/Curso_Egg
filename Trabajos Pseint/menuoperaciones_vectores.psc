Algoritmo ej5guia4
	
	//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer
    //hasta que ingrese la opción Salir:
   //a. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera
       //aleatoria usando la función Aleatorio(valorMin, valorMax) de PseInt.
   //b. Llenar Vector B. Este vector también es de tamaño N y se llena de manera
	  //aleatoria.
   //c. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar
       //elemento a elemento. Ejemplo: C = A + B
   //d. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar
       //elemento a elemento. Ejemplo: C = B - A
   //e. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar:
	   //Vector A, B, o C.
   //f. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La
     //longitud para todos los vectores debe ser la misma, por lo tanto, esa información sólo se
	//solicitará una vez.
	
	Definir tamano, vectorA,vectorB, vectorC, opc2, j Como Entero
	Definir opc Como Caracter
	
	Escribir "Ingrese la Longitud de los vectores"
	Leer tamano
	
	Dimension vectorA(tamano)
	Dimension vectorB(tamano)
	Dimension vectorC(tamano)
	
	Escribir "Por favor ingrese la opcion a realizar: "
	Escribir "A. Rellenar el vector A "
	Escribir "B. Rellenar el vector B "
	Escribir "C. Rellenar vector C con la suma de los vectores A y B "
	Escribir "D. Rellenar vector C con la resta de los vectores A y B "
	Escribir "E. Mostrar alguno de los vectores: A, B o C "
	Escribir "F. Salir "
	Leer opc
	
	//falta operar como logico la opcion de llenado y asegurar vectores llenos
	
	Mientras opc <> "F" y opc <> "f"
		
	Segun opc Hacer
		"A"o "a":
			Escribir llenado(vectorA, tamano)
			Escribir "Elija otra opcion: "
			Leer opc
		"B" o "b":
			Escribir llenado(vectorB, tamano)
			Escribir "Elija otra opcion: "
			Leer opc
		"C" o "c":
			//si vector a y b llenos entonces hacer
			Escribir "La suma de los vectores es "
			Escribir "" llenadoC(vectorC, tamano,vectorA,vectorB)
			Escribir "Elija otra opcion: "
		     Leer opc
		 "D" o "d":
			 //si vector a y b llenos entonces hacer
			 Escribir "La resta de los vectores es "
			 Escribir "" llenadoD(vectorC, tamano,vectorA,vectorB)
			Escribir "Elija otra opcion: "
		     Leer opc
		 "E" o "e":
			 //si vector a y b  y c llenos entonces hacer
			 Escribir "Elija que vector quiere mostrar: "
			 Escribir "1. Mostrar vector A "
			 Escribir "2. Mostrar vector B "
			 Escribir "3. Mostrar vector C "
			 Escribir "4. Salir del submenu "
			 Leer opc2
			 
			 Mientras opc2 <> 4
			 Segun opc2 Hacer
				 1:
					 Escribir "Vector A "
					 Para j = 0 Hasta (tamano -1) Hacer
						 
						 Escribir " [ " vectorA(j) " ] " Sin Saltar
					 FinPara
					 
					 Escribir ""
					 Escribir "Ingrese opcion submenu"
					 Leer opc2
				 2:
					 Escribir "Vector B "
					 Para j = 0 Hasta (tamano -1) Hacer
						 
						 Escribir " [ " vectorB(j) " ] " Sin Saltar
					 FinPara
					 
					 Escribir ""
					 Escribir "Ingrese opcion submenu "
					 Leer opc2
				 3:
					 Escribir "Vector C "
					 Para j = 0 Hasta (tamano -1) Hacer
						 
						 Escribir " [ " vectorC(j) " ] " Sin Saltar
					 FinPara
					 
					 Escribir ""
					 Escribir "Ingrese opcion submenu "
					 Leer opc2
			     4:
					 Escribir "Saliendo "
					 
				 De Otro Modo:
					 
					 Escribir "Mal ingresado, Reintente  submenu "
					 Leer opc2
					 
			 Fin Segun
			 
		 FinMientras
		 
			Escribir "Elija otra opcion: "
		     Leer opc
		 "F" o "f":
			 
			 Escribir "Saliendo ! "
		De Otro Modo:
			Escribir "Opcion incorrecta, Reintente: "
			Leer opc
	Fin Segun
	
Fin Mientras

	
FinAlgoritmo

Funcion rellenar <- llenado (vector,tamano)
	Definir i Como Entero
	
	Para i = 0 Hasta (tamano -1) Hacer
		vector(i) = Aleatorio(-100,100)
		Escribir " [ " vector(i) " ] " Sin Saltar
	FinPara
Fin Funcion



Funcion rellenar <- llenadoC (vectorC,tamano,vectorA,vectorB)
	Definir i Como Entero
	
	Para i = 0 Hasta (tamano -1) Hacer
		vectorC(i) = vectorA(i) + vectorB(i) 
		Escribir " [ " vectorC(i) " ] " Sin Saltar
	FinPara
Fin Funcion


Funcion rellenar <- llenadoD (vectorC,tamano,vectorA,vectorB)
	Definir i Como Entero
	
	Para i = 0 Hasta (tamano -1) Hacer
		vectorC(i) = vectorA(i) - vectorB(i) 
		Escribir " [ " vectorC(i) " ] " Sin Saltar
	FinPara
Fin Funcion



