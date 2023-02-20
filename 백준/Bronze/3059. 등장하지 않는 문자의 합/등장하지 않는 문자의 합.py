T = int(input())

arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
       'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}

for _ in range(T):
    S = set(input())

    s = arr - S
    sum = 0
    for i in s:
        sum += ord(i)

    print(sum)

