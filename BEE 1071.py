x = int(input())
y = int(input())

if (x > y):
    temp = x
    x = y
    y = temp

sum = 0
for i in range(x+1, y):
    if (i % 2 != 0):
        sum += i

print(sum)