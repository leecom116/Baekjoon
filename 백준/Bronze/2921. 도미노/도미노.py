n = int(input())

sum = 0

# (0,0),(0,1),(0,2),(1,1),(1,2),(2,2)
for i in range(0, n+1):
    for j in range(i, n+1):
        sum += i + j

print(sum)