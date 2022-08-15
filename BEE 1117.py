sum = 0
cnt = 0

while(cnt != 2):
    num = float(input())
    if (num >= 0 and num <= 10):
        sum += num
        cnt += 1
    else:
        print("nota invalida")

print("media = {:.2f}".format(sum / cnt))