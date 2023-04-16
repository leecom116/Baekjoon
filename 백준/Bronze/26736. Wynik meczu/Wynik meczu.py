A = B = 0

S = list(input())

for item in S:
    if item == 'A':
        A += 1
    else:
        B += 1
print("%d : %d" %(A, B))
