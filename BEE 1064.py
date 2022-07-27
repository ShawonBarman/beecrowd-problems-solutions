sum = 0
count = 0
for i in range(6):
    num = float(input())
    if (num >= 0):
        sum += num
        count += 1
print(f"{count} valores positivos")
print("{:.1f}".format(sum / count))