print("Teclee tres números: ")
A = int(input())
B = int(input())
C = int(input())

if A == B == C:
    print("Los tres números son iguales")
else:
    if A > B > C:
        print(A , " es el número mayor")
    elif B > A > C:
        print(B , " es el número mayor")
    else:
        print(C , " es el número mayor")