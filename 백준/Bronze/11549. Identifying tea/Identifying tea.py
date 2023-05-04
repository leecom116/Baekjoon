T = int(input())

li = list(map(int, input().split()))

count = 0

for i in li:
    if i == T:
        count += 1

print(count)