def brute(arr, n):
    for i in range(1, n + 1):
        if i not in arr:
            return i
    return -1  # Should never reach here
def better(arr, n):
    hash_set = set(arr)
    for i in range(1, n + 1):
        if i not in hash_set:
            return i
    return n + 1
def optimal_1(arr, n):
    total_sum = (n * (n + 1)) // 2
    return total_sum - sum(arr)
def optimal_2(arr, n):
    xor1, xor2 = 0, 0
    for i in range(n - 1):
        xor2 ^= arr[i]
        xor1 ^= i + 1
    xor1 ^= n
    return xor1 ^ xor2
if __name__ == "__main__":
    arr = [2, 19, 10, 1, 5, 3, 13, 18, 24, 23, 9, 22, 28, 25, 6, 27, 4, 20, 21, 26, 11, 8, 17, 15, 16, 12, 7, 14]
    n = 29
    print("The missing number in the array is:", optimal_2(arr, n))
