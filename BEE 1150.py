x = int(input())
z = int(input())
while(z <= x):
    z = int(input())
sum = 0
cnt = 1
for i in range(x, z):
    sum += i
    if (sum < z):
        cnt += 1

print(cnt)