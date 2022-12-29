list = []

for i in range(1, 6):
    a = input()

    if 'FBI' in a:
        list.append(i)

if not list:
    print('HE GOT AWAY!')
else:
    for i in list:
        print(i, end=" ")
