import math

R = int(input())

U = round(pow(R, 2) * math.pi, 6)
print(f"{U:.6f}")

T = round(2 * R**2, 6)
print(f'{T:.6f}')