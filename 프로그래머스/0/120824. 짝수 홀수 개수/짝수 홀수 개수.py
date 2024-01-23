def solution(num_list):
    answer = [sum(1 for n in num_list if n % 2 == 0), sum(1 for n in num_list if n % 2 != 0)]
    
    # for n in num_list:
    #     if n % 2 == 0:
    #         answer[0] += 1
    #     else:
    #         answer[1] += 1
    return answer