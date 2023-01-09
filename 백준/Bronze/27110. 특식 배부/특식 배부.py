n = int(input())

list = map(int, input().split())
sum = 0

for item in list:
    if item <= n:
        sum += item
    else:
        sum += n

print(sum)