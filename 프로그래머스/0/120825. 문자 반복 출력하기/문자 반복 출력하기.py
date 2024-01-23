def solution(my_string, n):
    answer = "".join(str(s * n) for s in my_string)
    return answer