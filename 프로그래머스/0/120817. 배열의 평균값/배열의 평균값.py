import numpy as np

def solution(numbers):
    answer = np.average(numbers)
    
    # 2번
    # answer = sum(numbers) / len(numbers)
    
    # 1번
    # for n in numbers :
        # answer += n
    # answer = answer / len(numbers)
    return answer