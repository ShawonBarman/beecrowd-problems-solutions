count = 0
for i in range(5):
    num = int(input())
    if (num % 2 == 0):
        count += 1
print(f"{count} valores pares")