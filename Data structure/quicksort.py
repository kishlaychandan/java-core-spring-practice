#Program to perform quick sort.

import numpy as np
import time
st=time.time()
n=int(input("Enter the size of an array:"))
x=[]
print("Enter the elements:")
for i in range(0,n):
    val=int(input())
    x.append(val)
print("array",x)

def partition(array, low, high):

  pivot = array[high]
  i = low - 1
  for j in range(low, high):
    if array[j] <= pivot:
      i = i + 1
      (array[i], array[j]) = (array[j], array[i])
  (array[i + 1], array[high]) = (array[high], array[i + 1])
  return i+1

def quickSort(array, low, high):
  if low < high:
    pi = partition(array, low, high)
    quickSort(array, low, pi - 1)
    quickSort(array, pi + 1, high)
size = len(x)

quickSort(x, 0, size - 1)

print('Sorted Array in Ascending Order:')
print(x)
et=time.time()
elapsed_time = et - st
print('Execution time:',elapsed_time,'seconds')