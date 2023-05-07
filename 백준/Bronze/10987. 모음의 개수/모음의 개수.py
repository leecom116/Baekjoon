s = input()
count = 0

for item in s:

    if item == 'a' or item == 'e' or item == 'i' or item == 'o' or item == 'u':
        count += 1

print(count)