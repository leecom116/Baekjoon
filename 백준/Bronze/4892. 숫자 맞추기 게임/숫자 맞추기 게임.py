i = 0

while True:
    n = int(input())
    i += 1

    if n == 0:
        break

    if n % 2 == 1:
        print('%d. odd' %i, n//2)
    else:
        print('%d. even' %i, n//2)