total_positive = 0
total_negative = 0
total_even = 0
total_odd = 0
for i in range(5):
    num = int(input())
    if (num > 0):
        total_positive += 1
    if (num < 0):
        total_negative += 1
    if (num % 2 == 0):
        total_even += 1
    if (num % 2 == 1):
        total_odd += 1
print(f"{total_even} valor(es) par(es)")
print(f"{total_odd} valor(es) impar(es)")
print(f"{total_positive} valor(es) positivo(s)")
print(f"{total_negative} valor(es) negativo(s)")