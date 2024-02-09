def partition(arr, start, end):
    pivot = arr[end]
    left = start
    right = end - 1

    while True:
        while left <= right and arr[left] < pivot:
            left += 1
        while left <= right and arr[right] > pivot:
            right -= 1
        if left < right:
            arr[left], arr[right] = arr[right], arr[left]
        else:
            break
    arr[end], arr[left] = arr[left], arr[end]
    return left


def quick_sort(arr, start, end):
    if start < end and not is_sorted(arr, start, end):
        pivot = partition(arr, start, end)
        quick_sort(arr, start, pivot - 1)
        quick_sort(arr, pivot + 1, end)


def is_sorted(arr, start, end):
    for i in range(start, end):
        if arr[i] > arr[i + 1]:
            return False
    return True
