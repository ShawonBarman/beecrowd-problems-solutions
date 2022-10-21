x, y = map(int, input().split(" "))

cnt = 0

for i in range(1, y+1):
    cnt += 1
    if (cnt == x):
        print(i)
        cnt = 0
    else:
        print(i, end=" ")