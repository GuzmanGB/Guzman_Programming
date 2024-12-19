print("Teclee un números: ")

A = int(input())
raiz = A**0.5
potencia = A**2

if A<=0:
    print("Error. Saliendo del programa.")
else:
    print("Del número " , A , "su potencia es ", potencia , "y su raíz " , raiz)