n = int(input())
while(n != 0):
    x, y = map(int, input().split(" "))
    ans = 0
    while(y != 0):
        if (x % 2 != 0):
            ans += x
            y -= 1
        x += 1
    print(ans)
    n -= 1