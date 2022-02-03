Algoritmo Funcion_Mayor
	Definir i,j,may,contador Como Entero
	may <- 0; cont <- 0
	Dimension A[3,4]
	Para i<-1 Hasta 3 Hacer
		Para j<-1 Hasta 4 Hacer
			Escribir 'Ingrese los datos de la posición A[',+i,+'][',+j,+']= '
			Leer A[i,j]
		FinPara
	FinPara
	may <- A[1,1]
	cont <- mayorRep(A,may)
	Para i<-1 hasta n con paso 1 hacer
		Para j<-1 hasta m con paso 1 hacer
			Escribir Sin Saltar  A[i,j] ,+ "    "
		FinPara
		Escribir "     "
	FinPara
	Escribir 'Se repitió ',+cont,+' cantidad de veces.'
FinAlgoritmo

Funcion cont <- mayorRep(B,may)
	Definir i,j,cont Como Entero
	cont <- 0
	Para i<-1 Hasta 3 Hacer
		Para j<-1 Hasta 4 Hacer
			Si (may<B[i,j]) Entonces
				may <- B[i,j]
			FinSi
		FinPara
	FinPara
	Para i<-1 Hasta 3 Hacer
		Para j<-1 Hasta 4 Hacer
			Si (may==B[i,j]) Entonces
				cont <- cont+1
			FinSi
		FinPara
	FinPara
FinFuncion
