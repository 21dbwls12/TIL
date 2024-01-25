def solution(array, height):
    answer = len([a for a in array if a > height])
    return answer