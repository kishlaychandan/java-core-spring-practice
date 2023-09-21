#Program to find an array is unique or not

import time
import numpy as np
n=int(input("Enter the size of an array:"))
x=[]
print("Enter elements:")
for i in range(0,n):
    val=int(input())
    x.append(val)
f=0
print("Array:",x)
for i in range(0,n-1):
    for j in range(i+1,n):
         if x[i]==x[j]:
           f=1
if f==0:
       print("Unique")
else:
    print("Not unique")
    print("Execution time:",time.time())

