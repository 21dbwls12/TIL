def solution(array, n):
    answer = len([num for num in array if num == n])
    
    # for num in array:
    #     if num == n:
    #         answer += 1
    return answer