# -*- coding: utf-8 -*-
"""
Created on Wed Dec 14 16:39:40 2022

@author: sethy
"""
import time
def countingSort(arr):
    size = len(arr)
    output = [0] * size

    # count array initialization
    count = [0] * 10

    # storing the count of each element
    for m in range(0, size):
        count[arr[m]] += 1

    # storing the cumulative count
    for m in range(1, 10):
        count[m] += count[m - 1]

    # place the elements in output array after finding the index of each element of original array in count array
    m = size - 1
    while m >= 0:
        output[count[arr[m]] - 1] = arr[m]
        count[arr[m]] -= 1
        m -= 1

    for m in range(0, size):
        arr[m] = output[m]
s = time.time()
data=list(map(int, input("elements of array:-").strip().split())) 
countingSort(data)
e= time.time()
print("Sorted  Array: ")
print(data)
print('exe time :',e-s,"s")