def solution(num_list):
    answer = [num_list[i] for i in range(len(num_list) - 1, -1, -1)]
    return answer


# 다른 사람 풀이
# def solution(num_list):
#     return num_list[::-1]
