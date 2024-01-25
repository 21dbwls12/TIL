def solution(numer1, denom1, numer2, denom2):
    number = (numer1 * denom2) + (numer2 * denom1)
    denom = denom1 * denom2
    element = 2

    # math.gcd -> 최대공약수 내장함수
    # 최대공약수 함수
    # def gcd(a, b):
    # if a % b == 0:
    #     return b
    # return gcd(b, a % b)
    while max(number, denom) >= element:
        if number % element == 0 and denom % element == 0:
            number = number // element
            denom = denom // element
            element = 2
        else:
            element += 1
    return [number, denom]