C, K, P = map(int, input().split())

sum = 0
for i in range(1, C+1):
    sum += K*i + P*i**2

print(sum)