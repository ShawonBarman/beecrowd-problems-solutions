x = int(input())
y = int(input())

if (x > y):
    temp = x
    x = y
    y = temp

for i in range(x+1, y):
    if ((i % 5 == 2) or (i % 5 == 3)):
        print(i)