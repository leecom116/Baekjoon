count = 0

while True:
    try:
        a = input()
        count += 1
    # End Of File
    # 파이썬 입력이 끝날때까지 받는 경우
    except EOFError:
        break

print(count)