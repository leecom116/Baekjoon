s = 0
while True:
    try:
        _ = input()
        s += 1
    except EOFError:
        break
print(s)
