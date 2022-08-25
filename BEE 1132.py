x = int(input())
y = int(input())

if (x > y):
    temp = x
    x = y
    y = temp

sum = 0

for i in range(x, y+1):
    if (i % 13 != 0):
        sum += i

print(sum)