line1 = input().split(" ")
p1 = int(line1[0])
u1 = int(line1[1])
price1 = float(line1[2])

line2 = input().split(" ")
p2 = int(line2[0])
u2 = int(line2[1])
price2 = float(line2[2])

print("VALOR A PAGAR: R$ {:.2f}".format((u1*price1)+(u2*price2)))