N = int(input())
count = 0

for i in range(1, N+1):
    for char in str(i):
        if char == '3' or char == '6' or char == '9':
            count += 1

print(count)