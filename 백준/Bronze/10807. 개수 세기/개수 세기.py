n = int(input())
arr = list(map(int, input().split()))
find = int(input())
ans = 0

for i in range(n):
    if arr[i]==find:
        ans+=1
print(ans)