n, m, k = map(int, input().split())

sum = 0
while n >= 2 and m >= 1 and n + m >= k + 3:
    n -= 2
    m -= 1
    sum += 1

print(sum)