list_num = list(map(int, input().split(" ")))
a = list_num[0]
n = 0
for i in range(1, len(list_num)):
    k = list_num[i]
    if (k > 0):
        n = k
        break

sum = 0
for i in range(n):
    sum += i + a

print(sum)    