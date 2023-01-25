list = list(map(int, input().split()))

list.sort()

if list[1] - list[0] == list[2] - list[1]:
    print(list[2] * 2 - list[1]) 
elif list[1] - list[0] > list[2] - list[1]:
    print(list[1] * 2 - list[2])
else:
    print(list[1] * 2 - list[0])