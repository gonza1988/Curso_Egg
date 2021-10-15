Algoritmo ej10guia22
	
	//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
	//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
	//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
	//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
	//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
	//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
	//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
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
