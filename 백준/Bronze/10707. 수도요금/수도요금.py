A = int(input())
B = int(input())
C = int(input())
D = int(input())
P = int(input())

X_PAY = A * P
Y_PAY = 0

if P <= C:
    Y_PAY = B
else:
    Y_PAY = B + (P-C) * D

if X_PAY < Y_PAY:
    print(X_PAY)
else:
    print(Y_PAY)