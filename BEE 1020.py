num = int(input())

year = int(num / 365)
month = int((num % 365) / 30)
day = (num % 365) % 30

print(f"{year} ano(s)")
print(f"{month} mes(es)")
print(f"{day} dia(s)")