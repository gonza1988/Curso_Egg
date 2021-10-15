Algoritmo ej11extra2
	
	//El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de
	//las cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
	//programa que determine cuál es la nota eliminada y el promedio de los trabajos
	//prácticos de un estudiante
	
	Definir nota1, nota2, nota3, nota4, promedio Como Real
	
	Escribir "Por favor ingrese las 4 notas: "
	Leer nota1, nota2, nota3, nota4
	
	si (nota1 <= nota2) y (nota1 <= nota3) y (nota1 <= nota4) Entonces
		promedio = (nota2 + nota3 + nota4) / 3
		Escribir "El promedio de las 3 notas mas altas es : " promedio
	SiNo
		si(nota2 <= nota1) y (nota2 <= nota3) y (nota2 <= nota4) Entonces
			promedio = (nota1 + nota3 + nota4) / 3
			Escribir "El promedio de las 3 notas mas altas es : " promedio
		SiNo
			
		si(nota3 <= nota1) y (nota3 <= nota2) y (nota3 <= nota4) Entonces
			promedio = (nota1 + nota2 + nota4) / 3
			Escribir "El promedio de las 3 notas mas altas es : " promedio
		SiNo
			si(nota4 <= nota1) y (nota4 <= nota2) y (nota4 <= nota3) Entonces
				promedio = (nota1 + nota2 + nota3) / 3
				Escribir "El promedio de las 3 notas mas altas es : " promedio
			SiNo
				Escribir "Error de lectura "
		FinSi
	FinSi
FinSi
FinSi

FinAlgoritmo
