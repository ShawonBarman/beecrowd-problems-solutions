num = int(input())

count = 0

for i in range(1, (num * 4) + 1):
    if (count == 3):
        print("PUM")
        count = 0
        continue
    print(i, end=" ")
    count += 1