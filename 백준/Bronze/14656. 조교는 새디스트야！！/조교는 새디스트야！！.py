N = int(input())

li = list(map(int, input().split()))

li_sort = sorted(li)
count = 0

for i in range(len(li_sort)):
    if li[i] != li_sort[i]:
        count += 1

print(count)

