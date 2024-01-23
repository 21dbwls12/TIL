import math

def solution(num1, num2):
    # 반올림 == round()
    # 올림 == math.ceil()
    # 내림 == math.floor()
    answer = math.floor((num1 / num2) * 1000)
    return answer