def fn(k):
    s = 0
    for i in range(1, k):
        s += i
    return s



a = int(input())

for i in range(a):
    sum = 0
    j = int(input())
    for k in range(1, j+2):
        sum += fn(k) * (k + 1)
    print(sum)

