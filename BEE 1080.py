maxi = -99999999
position = 0

for i in range(1, 101):
    num = int(input())
    if (num > maxi):
        maxi = num
        position = i

print(maxi)
print(position)