n = int(input())

for i in range(n):
    num1, num2, num3 = map(float, input().split())
    avg = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / (2 + 3 + 5)
    print("{:.1f}".format(avg))