sum = 0
cnt = 0

while(True):
    n = int(input())
    if (n < 0):
        break
    sum += n
    cnt += 1

print("{:.2f}".format(sum / cnt))