def solution(n, t):
    answer = n
    
    for _ in range(0, t):
        answer *= 2
    return answer