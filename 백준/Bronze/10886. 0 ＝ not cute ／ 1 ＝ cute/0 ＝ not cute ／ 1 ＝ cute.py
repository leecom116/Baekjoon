N = int(input())

score = 0

for _ in range(N):
    i = int(input())

    if i == 1:
        score += 1
    else:
        score -= 1

if score < 0:
    print("Junhee is not cute!")
else:
    print("Junhee is cute!")