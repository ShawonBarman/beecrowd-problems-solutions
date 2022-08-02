n = int(input())

cnt = 0;

for i in range(n):
    num = int(input())
    if (num >= 10 and num <= 20):
        cnt += 1

print(f"{cnt} in")
print(f"{n - cnt} out")