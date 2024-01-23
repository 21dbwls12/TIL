def solution(str1, str2):
    answer = 2
    temp = ""
    i = 0

    for s1 in str1:
        if s1 == str2[i]:
            temp += s1
            i += 1
        else:
            temp = ""
            i = 0
        if temp == str2:
            answer = 1
            break
    return answer