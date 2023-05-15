N = int(input())

li = [2**i for i in range(31)]

if N in li:
    print(1)
else:
    print(0)