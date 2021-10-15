Algoritmo ej12extra2
	
	//Una empresa tiene personal de distintas áreas con distintas condiciones de
	//contratación y formas de pago. El departamento de contabilidad necesita calcular los
    //sueldos semanales (lunes a viernes) en base a las 3 modalidades de sueldo:
	
	//a) comisión
	
	//b) salario fijo + comisión, y
	
	//c) salario fijo.
	
	//a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
	//	realizadas en la semana, y el 40% de ese monto total corresponde al salario del
	//	empleado.
	//b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
	//hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
	//esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
	//como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
	//del valor de venta total.
	//c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
	//hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
	//horas semanales, las horas extras se deben pagar con un extra del 50% del valor de
	//la hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene
	//un empleado. 
	
	Definir operacion Como Caracter
	Definir ventas, sueldo, sueldo_hora Como Real
	Definir horas_trabajadas Como Entero
	
	Escribir "********************************************************************"
	Escribir "**      Bienvenido, Ingrese el tipo de salario del empleado       **"
	Escribir "** A = Comision, B = Salario fijo + comision , C = Salario fijo   **"
	Escribir "**********************************************************"
	leer operacion

	
	Segun operacion Hacer
		"A" o "a":
			Escribir "Ingresar el monto de las ventas de la semana: "
			Leer ventas
			sueldo = (ventas *40) / 100
			Escribir "El sueldo a comision a percibir es " sueldo " pesos"
			
		"B" o "b":
			Escribir "Ingresar el monto de las ventas de la semana: "
			Leer ventas
			Escribir "Ahora ingresar la cantidad de horas trabajadas: "
			Leer horas_trabajadas
			Escribir "Finalmente ingresar el salario percibido por hora: "
			Leer sueldo_hora
			
			si horas_trabajadas <= 40 Entonces
				sueldo = (sueldo_hora * horas_trabajadas) + (ventas * 25) / 100
				Escribir "El sueldo fijo mas la comision a percibir es " sueldo " pesos"
			SiNo
				sueldo = (sueldo_hora * 40) + (ventas * 25) / 100
				Escribir "El sueldo fijo mas la comision a percibir es " sueldo " pesos"
			FinSi
			
		"C" o "c":
			Escribir "Ingresar la cantidad de horas trabajadas: "
			Leer horas_trabajadas
			Escribir "Ahora ingresar el salario percibido por hora: "
			Leer sueldo_hora
			
			si horas_trabajadas <= 40 Entonces
				sueldo = (sueldo_hora * horas_trabajadas) 
				Escribir "El sueldo fijo percibir es " sueldo " pesos"
			SiNo
				sueldo = (sueldo_hora * 40) + (((horas_trabajadas - 40)*sueldo_hora) * 50) / 100
				Escribir "El sueldo fijo percibir es " sueldo " pesos"
			FinSi
			
		De Otro Modo:
			Escribir "Operacion incorrecta, vuelva a ingresar su letra "
	Fin Segun
FinAlgoritmo
