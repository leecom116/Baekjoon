n = int(input())

a, b, c = map(int, input().split())
sum = 0

if a <= n:
    sum += a
else:
    sum += n

if b <= n:
    sum += b
else:
    sum += n

if c <= n:
    sum += c
else:
    sum += n

print(sum)