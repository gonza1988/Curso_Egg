Algoritmo ej10guia22
	
	//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
	//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
	//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
	//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
	//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
	//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
	//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
    //cada venta
	
	Definir i, j, num_empleados Como Entero
	Definir sueldo, cant_ventas, ventas, comision Como Real
	
	Escribir "Ingrese la cantidad de empleados a liquidar "
	Leer num_empleados
	comision = 0
	
	Para i= 1 Hasta num_empleados Hacer
		Escribir "Empleado nro " i " ingrese salario "
		Leer sueldo
		Escribir "Cantidad de ventas "
		Leer cant_ventas
		Para j = 1 Hasta cant_ventas Hacer
			Escribir "Monto venta " j " : "
			Leer ventas
			comision = comision + (ventas * 10) / 100
		FinPara
		Escribir "Empleado " i " tiene " comision " $ en sus " cant_ventas " comisiones, dando total de su sueldo: " sueldo + comision
		
	FinPara
	
FinAlgoritmo
