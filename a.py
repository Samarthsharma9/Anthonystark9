import time
def factorial(n):
    res=1
    for i in range(1,n+1):
        res=res*i
    return res  


a= int(input())

for i in range(1,a+1):
    start = time.time_ns()
    b=factorial(i)
    print(time.time_ns()-start)