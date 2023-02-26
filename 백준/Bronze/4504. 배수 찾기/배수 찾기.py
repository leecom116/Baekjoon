n = int(input())

while True:

    a = int(input())

    if a == 0:
        break

    if a % n == 0:
        print("%d is a multiple of %d." %(a, n))
    else:
        print("%d is NOT a multiple of %d." %(a, n))