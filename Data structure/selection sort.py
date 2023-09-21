# -*- coding: utf-8 -*-
"""
Created on Thu Nov  3 15:38:43 2022

@author: sethy
"""

import time as ty
def selection_sort(array):  
    length = len(array)
    for i in range(length-1):  
        minIndex = i  
        for j in range(i+1, length):  
            if array[j]<array[minIndex]:  
                minIndex = j  
        array[i], array[minIndex] = array[minIndex], array[i]  
    return array
start_time=ty.time()
# a=int(input("Number of elements in the array:-"))
array=list(map(int, input("elements of array:-").strip().split())) 
print("The sorted array is: ", selection_sort(array)) 
end_time=ty.time()
print('Total Execution time: ',end_time-start_time)