Algoritmo Matriz_revertida
	Definir j,i,n,m Como Entero
	Escribir "Ingrese el número de filas: "
	Leer n
	Escribir "Ingrese el número de columnas: "
	Leer m
	Dimension A[n,m]
	Para i<-1 hasta n con paso 1 hacer
		Para j<-1 hasta m con paso 1 hacer
			Escribir  "Ingrese los datos de la posición A[",+i,+"][",+j,+"]= "
			Leer A[i,j]
		FinPara
	FinPara
	Escribir "Matriz normal"
	Para i<-1 hasta n con paso 1 hacer
		Para j<-1 hasta m con paso 1 hacer
			Escribir Sin Saltar  A[i,j] ,+ "    "
		FinPara
		Escribir "     "
	FinPara
	Escribir "Matriz invertida"
	Para i<-n hasta 1 con paso -1 hacer
		Para j<-1 hasta m con paso 1 hacer
			Escribir Sin Saltar  A[i,j] ,+ "    "
		FinPara
		Escribir "     "
	FinPara
	
FinAlgoritmo
