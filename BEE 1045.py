a, b, c = map(float, input().split(" "))
list_sorted = [a,b,c]
list_sorted.sort(reverse=True)
A = list_sorted[0]
B = list_sorted[1]
C = list_sorted[2]
if A>=(B+C):
    print("NAO FORMA TRIANGULO")
elif (A*A)==(B*B+C*C):
    print("TRIANGULO RETANGULO")
elif (A*A)>(B*B+C*C):
    print("TRIANGULO OBTUSANGULO")
elif (A*A)<(B*B+C*C):
    print("TRIANGULO ACUTANGULO")
if A==B and A==C:
    print("TRIANGULO EQUILATERO")
if (A==B and A!=C) or (A==C and A!=B) or (B==C and B!=A):
    print("TRIANGULO ISOSCELES")