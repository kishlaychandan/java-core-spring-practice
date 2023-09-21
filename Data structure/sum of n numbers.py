# -*- coding: utf-8 -*-
"""
Created on Thu Nov  3 15:32:18 2022

@author: sethy
"""

import time
def sumN(n):
    s=0
    for i in range(len(n)):
        s=s+n[i]
    return s
 
start=time.time()
arr = input('Enter all the element of list: ').split()
arr = [int(x) for x in arr]
total=sumN(arr)
end=time.time()
print(f'Sum of {len(arr)} numbers={total}')
print('Total Execution time: ',end-start)