T = int(input())

for _ in range(T):
    price = float(input())
    price *= 0.8

    print("$%.2f" %price)