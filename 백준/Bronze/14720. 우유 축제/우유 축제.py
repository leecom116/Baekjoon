# 딸 초 바

N = int(input())

li = list(map(int, input().split()))

count = 0

for i in range(N):
    if li[i] == count % 3:
        count += 1
print(count)