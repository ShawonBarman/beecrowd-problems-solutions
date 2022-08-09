n = int(input())
for i in range(n):
    x, y = map(int, input().split(" "))
    if (x > y):
        temp = x
        x = y
        y = temp
    sum = 0
    for j in range(x+1, y):
        if (j % 2 != 0):
            sum += j
    print(sum)