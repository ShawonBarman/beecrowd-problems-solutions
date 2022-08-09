while(True):
    m, n = map(int, input().split(" "))
    if (m == 0 or m < 0 or n == 0 or n < 0):
            break
    
    if (m < n):
        temp = m
        m = n
        n = temp

    sum = 0
    for i in range(n, m+1):
        sum += i
        print(i, end=" ")
    
    print(f"Sum={sum}")