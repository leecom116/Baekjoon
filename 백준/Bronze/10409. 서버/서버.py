N, T = map(int, input().split())

li = list(map(int, input().split()))
sum = 0
count = 0

for i in range(N):
    sum += li[i]
    if sum <= T:
        count += 1
    else:
        sum -= li[i]
        break
print(count)