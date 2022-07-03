num = int(input())

print(num)

print(f"{int(num/100)} nota(s) de R$ 100,00")
num = num % 100
print(f"{int(num/50)} nota(s) de R$ 50,00")
num = num % 50
print(f"{int(num/20)} nota(s) de R$ 20,00")
num = num % 20
print(f"{int(num/10)} nota(s) de R$ 10,00")
num = num % 10
print(f"{int(num/5)} nota(s) de R$ 5,00")
num = num % 5
print(f"{int(num/2)} nota(s) de R$ 2,00")
num = num % 2
print(f"{num} nota(s) de R$ 1,00")