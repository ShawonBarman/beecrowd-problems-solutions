import  math
A, B, C = input().split()
A = float(A)
B = float(B)
C = float(C)
if A==0 or ((B*B)-(4*A*C)) < 0:
    print("Impossivel calcular")
else:
    x1 = (-B + (math.sqrt((B * B) - (4 * A * C))))/(2*A)
    x2 = (-B - (math.sqrt((B * B) - (4 * A * C))))/(2*A)
    print("R1 = {0:.5f}".format(x1))
    print("R2 = {0:.5f}".format(x2))