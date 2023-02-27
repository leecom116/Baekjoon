while True:
    B, N = map(int, input().split())

    if B == 0 and N == 0:
        break

    A = 0
    while A**N < B:
        A += 1
    print(A if A**N-B < B-(A-1)**N else A-1)
