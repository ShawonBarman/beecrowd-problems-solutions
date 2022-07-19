num = float(input())

earned = 0.0

if (num >= 0 and num <= 400):
    earned = num * (15.0/100)
    print("Novo salario: {:.2f}".format((earned + num)))
    print("Reajuste ganho: {:.2f}".format(earned))
    print("Em percentual: 15 %")

elif (num > 400 and num <= 800):
    earned = num * (12.0/100)
    print("Novo salario: {:.2f}".format((earned + num)))
    print("Reajuste ganho: {:.2f}".format(earned))
    print("Em percentual: 12 %")

elif (num > 800 and num <= 1200):
    earned = num * (10.0/100)
    print("Novo salario: {:.2f}".format((earned + num)))
    print("Reajuste ganho: {:.2f}".format(earned))
    print("Em percentual: 10 %")

elif (num > 1200 and num <= 2000):
    earned = num * (7.0/100)
    print("Novo salario: {:.2f}".format((earned + num)))
    print("Reajuste ganho: {:.2f}".format(earned))
    print("Em percentual: 7 %")
    
else:
    earned = num * (4.0/100)
    print("Novo salario: {:.2f}".format((earned + num)))
    print("Reajuste ganho: {:.2f}".format(earned))
    print("Em percentual: 4 %")