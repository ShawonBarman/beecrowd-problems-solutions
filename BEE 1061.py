str1, day1 = input().split(" ")
hour1, str2, minute1, str3, second1 = input().split(" ")

str4, day2 = input().split(" ")
hour2, str5, minute2, str6, second2 = input().split(" ")

total_first_day = (int(day1) * 24 * 3600) + (int(hour1) * 3600) + (int(minute1) * 60) + int(second1)
total_second_day = (int(day2) * 24 * 3600) + (int(hour2) * 3600) + (int(minute2) * 60) + int(second2)
diff = total_second_day - total_first_day
d = int(diff / (24 * 3600))
h = int((diff % (24 * 3600)) / 3600)
m = int(((diff % (24 * 3600)) % 3600) / 60)
s = int(((diff % (24 * 3600)) % 3600) % 60)

print(f"{d} dia(s)")
print(f"{h} hora(s)")
print(f"{m} minuto(s)")
print(f"{s} segundo(s)")