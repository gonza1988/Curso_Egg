Algoritmo ej7extra42
	
	//Una empresa de venta de productos por correo desea realizar una estadística de las
	//ventas realizadas de cada uno de sus productos a lo largo de una semana. Distribuya
    //luego 5 productos en los 5 días hábiles de la semana. Se desea conocer:
	   //a. Total de ventas por cada día de la semana.
	   //b. Total de ventas de cada producto a lo largo de la semana.
	  //c. El producto más vendido en cada semana.
	  //d. El nombre, el día de la semana y la cantidad del producto más vendido.
	//El informe final tendrá un formato como el que se muestra a continuación:
	
				    // lunes     martes   miercoles   jueves  viernes  total semana
	
	//producto1
	//producto2
	//producto3
	//producto4
	//producto5
	//total producto
	//producto mas 
	//   vendido
	
	Definir matrizA Como Entero
	
	Dimension matrizA(6,6)
	
	llenadomatriz(matrizA)
	muestramatriz(matrizA)
	masvendido(matriza)
	
	
FinAlgoritmo

SubProceso llenadomatriz(matrizA)
	//y total producto y total ventas semana
	Definir i,j, num Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta 5 Hacer
		Para j = 0 Hasta 5 Hacer
			si j = 5 Entonces
				matriza(i,j) = matriza(i,j-1) + matriza(i,j-2) + matriza(i,j-3) + matriza(i,j-4) + matriza(i,j-5)
			SiNo
				si i = 5 Entonces
					matriza(i,j) = matriza(i-1,j) + matriza(i-2,j) + matriza(i-3,j) + matriza(i-4,j) + matriza(i-5,j) 
				SiNo
					matriza(i,j) = Aleatorio(0,200)
				FinSi
			FinSi
			
		FinPara
	FinPara
FinSubProceso

SubProceso muestramatriz(matrizA)
	Definir i, j Como Entero
	
	Escribir "Subproceso muestra matriz: "
	Escribir "                 Lunes" "   Martes"  " Miercoles"  " Jueves"  "  Viernes"  " Ventaxproducto"
	
	Para i=0 Hasta 5 Hacer
		si i < 5 Entonces
			Escribir "   Producto   " i+1 Sin Saltar
		SiNo
			Escribir "Total ventxdia: " Sin Saltar
		FinSi
		Para j=0 Hasta 5 Hacer
			Escribir Sin Saltar " I " matrizA(i,j) " I "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

SubProceso masvendido(matriza)
	Definir i,j, mayor, producto Como Entero
	
	mayor = 0
	Escribir ""
	Escribir "Producto mas vendido al dia : "
	
	Para i=0 Hasta 4 Hacer
		mayor = 0
		Para j=0 Hasta 4 Hacer
			si matriza(j,i) >= mayor Entonces
				mayor = matriza(j,i)
				producto = j
			FinSi
			//Escribir i, " " mayor
		Fin Para
		Escribir "Dia " i+1, " " "Producto " producto+1 " ",mayor
	Fin Para
FinSubProceso



