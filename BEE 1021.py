num = float(input())
arr = [10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1]
title = "nota(s) de R$"
n = int(num * 100)
print("NOTAS:")
for i in range(0, len(arr)):
    temp = int(n / arr[i])
    n = n % arr[i]
    if i == 6:
        title = "moeda(s) de R$"
        print("MOEDAS:")
    print(str(temp) + " " + title, end=" ")
    print("{:.2f}".format(arr[i]/100.00))