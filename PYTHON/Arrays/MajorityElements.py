from collections import Counter
def better(arr,n):
    map=Counter(arr)
    for i,j in map.items():
        if j>n//2:
            return i
    return -1
def optimal(v: [int]) -> int:
    count=0
    el=-1
    for i in range(0,len(v)):
        if count==0:
            count=1
            el=v[i]
        elif el==v[i]:
            count+=1
        else:
            count-=1
    c=0
    for i in range(0,len(v)):
        if v[i]==el:
            c+=1
    if c>len(v)//2:
        return el
    return -1
arr=[2,2,3,3,1,2,2]
print(optimal(arr))