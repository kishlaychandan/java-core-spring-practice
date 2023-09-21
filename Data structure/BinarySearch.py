# -*- coding: utf-8 -*-
"""
Created on Thu Nov 10 15:25:24 2022

@author: sethy
"""
#Program for binary search
import time
def BinaryS(lst,key):
    low=0
    high=len(lst)
    while(low<=high):
        mid=(low+high)//2
        if(lst[mid]==key):
            return mid
        elif(lst[mid]<key):
            low=mid+1
        else:
            high=mid-1
    return -1
lst=input('Enter number to the list:').split()
lst=[int(x) for x in lst]
n=int(input('Enter number to search'))
s=time.perf_counter_ns()
res=BinaryS(lst,n)
if res==-1:
    print('not found')
else:
    print('found at ',res,' index')
e=time.perf_counter_ns()
tdif=(e-s)
print('Execution time: ',tdif,'nanoSec')
