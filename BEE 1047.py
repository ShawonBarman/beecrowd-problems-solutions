h1, m1, h2, m2 = map(int, input().split(" "))

total_hour = 0
total_minute = 0

if ((h1 == h2) and (m1 == m2)):
    total_hour = (24 - h1) + h2
    total_minute = m2 - m1

elif ((h1 == h2) and (m1 < m2)):
    total_hour = h2 - h1
    total_minute = m2 - m1

elif ((h1 == h2) and (m1 > m2)):
    total_hour = (24 - h1) + h2 - 1
    total_minute = (60 - m1) + m2

elif ((h1 < h2) and (m1 == m2)):
    total_hour = h2 - h1
    total_minute = m2 - m1

elif ((h1 > h2) and (m1 == m2)):
    total_hour = (24 - h1) + h2
    total_minute = m2 - m1

elif ((h1 < h2) and (m1 < m2)):
    total_hour = h2 - h1
    total_minute = m2 - m1

elif ((h1 < h2) and (m1 > m2)):
    total_hour = h2 - h1 - 1
    total_minute = (60 - m1) + m2

elif ((h1 > h2) and (m1 < m2)):
    total_hour = (24 - h1) + h2 - 1
    total_minute = m2 - m1
else:
    total_hour = (24 - h1) + h2 - 1
    total_minute = (60 - m1) + m2

print(f"O JOGO DUROU {total_hour} HORA(S) E {total_minute} MINUTO(S)")