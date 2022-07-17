x, y = map(int, input().split(" "))

ans = 0

if (x < y):
    ans = y - x
else:
    ans = (24 - x) + y

print(f"O JOGO DUROU {ans} HORA(S)")