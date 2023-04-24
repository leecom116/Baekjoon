while True:
    a, b = map(int, input().split())

    if a == 0 and b == 0:
        break

    print("%d %d / %d" %(a//b, a%b, b))