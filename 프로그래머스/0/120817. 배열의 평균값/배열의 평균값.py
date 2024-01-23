import numpy as np

def solution(numbers):
    # mean()도 똑같이 작동
    answer = np.average(numbers)
    
    # 2번
    # answer = sum(numbers) / len(numbers)
    
    # 1번
    # for n in numbers :
        # answer += n
    # answer = answer / len(numbers)
    return answer
