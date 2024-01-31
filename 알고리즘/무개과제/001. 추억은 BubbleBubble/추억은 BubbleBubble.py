def bubble_sort(arr):
    for r in range(len(arr)):
        changed = False
        for i in range(0, len(arr) - r - 1):
            if arr[i] > arr[i + 1]:
                arr[i], arr[i + 1] = arr[i + 1], arr[i]
                changed = True
        if not changed:
            break
    return arr
