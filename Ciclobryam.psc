Algoritmo Ciclobryam
	Definir n,i,cont, num Como Entero
	cont<-0
	Escribir "Ingresar el limite del vector:"
	Leer n
	Escribir "Ingrese un número:"
	Leer num
	Dimension A[n]
	Para i<-1 Hasta n Con Paso 1
		Escribir "A [",+i,+"]= "
		Leer A[i]
	FinPara
	Para i<-1 Hasta n Con Paso 1
		Escribir Sin Saltar A[i],+ "   "
	FinPara
	Para i<-1 Hasta n Con Paso 1
		Si (A[i] mod 10) == num Entonces
			cont<- cont + 1
		FinSi
	FinPara
	Escribir "Hay ",+ cont ,+ " cantidad de números dentro del vector que terminen  en: " ,+ num
	
FinAlgoritmo
