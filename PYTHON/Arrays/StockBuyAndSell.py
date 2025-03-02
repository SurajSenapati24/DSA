def brute(prices):
    profit = 0
    n = len(prices)
    for i in range(n - 1):
        for j in range(i, n):
            profit = max(profit, prices[j] - prices[i])
    return profit  # T.C = O(N^2)
def optimal(prices):
    n = len(prices)
    min_price = prices[0]
    profit = 0
    for i in range(1, n):
        cur = prices[i]
        if min_price < cur:
            profit = max(profit, cur - min_price)
        else:
            min_price = cur
    return profit  # T.C = O(N)
if __name__ == "__main__":
    prices = [17, 20, 11, 9, 12, 6]
    print(brute(prices))  # Testing the brute force approach
    print(optimal(prices))  # Testing the optimal approach
