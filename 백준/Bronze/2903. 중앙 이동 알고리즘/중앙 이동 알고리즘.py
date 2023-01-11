n = int(input())
a = [4]
f = 2
b = 1
sum = 0

for i in range(1, 16):
    f += b
    sum = f ** 2
    a.append(sum)
    b = b * 2
print(a[n])
