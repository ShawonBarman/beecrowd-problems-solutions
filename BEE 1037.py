num = float(input())

if num>75.00001 and num<=100:
    print("Intervalo (75,100]")
elif num>50.00001 and num<=75:
    print("Intervalo (50,75]")
elif num>25.00001 and num<=50:
    print("Intervalo (25,50]")
elif num>=0 and num<=25:
    print("Intervalo [0,25]")
else:
    print("Fora de intervalo")