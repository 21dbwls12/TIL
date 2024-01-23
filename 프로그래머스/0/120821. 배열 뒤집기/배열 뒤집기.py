def solution(num_list):
    answer = [num_list[i] for i in range(len(num_list) - 1, -1, -1)]
    return answer