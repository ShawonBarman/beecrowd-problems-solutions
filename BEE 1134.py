a = 0
g = 0
d = 0
while(True):
    num = int(input())
    if (num == 4):
        break
    elif (num == 1):
        a += 1
    elif (num == 2):
        g += 1
    elif (num == 3):
        d += 1
    else:
        continue

print("MUITO OBRIGADO")
print("Alcool: %d"% a)
print("Gasolina: %d"% g)
print("Diesel: %d"% d)