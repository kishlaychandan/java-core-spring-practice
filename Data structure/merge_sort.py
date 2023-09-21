# -*- coding: utf-8 -*-
"""
Created on Thu Nov 24 16:05:18 2022

@author: sethy
"""
import time
def merge(arr, l, m, r):
	n1 = m - l + 1
	n2 = r - m

	L = [0] * (n1)
	R = [0] * (n2)

	for i in range(0, n1):
		L[i] = arr[l + i]

	for j in range(0, n2):
		R[j] = arr[m + 1 + j]

	i = 0	 
	j = 0
	k = l	

	while i < n1 and j < n2:
		if L[i] <= R[j]:
			arr[k] = L[i]
			i += 1
		else:
			arr[k] = R[j]
			j += 1
		k += 1

	while i < n1:
		arr[k] = L[i]
		i += 1
		k += 1

	while j < n2:
		arr[k] = R[j]
		j += 1
		k += 1

def mergeSort(arr, l, r):
	if l < r:

		m = l+(r-l)//2
		mergeSort(arr, l, m)
		mergeSort(arr, m+1, r)
		merge(arr, l, m, r)


s = time.time()
n=int(input("Enter the size of an array:"))
x=[]
print("Enter the elements:")
for i in range(0,n):
    val=int(input())
    x.append(val)
print("array",x)
n = len(x)
print("Given array is")
for i in range(n):
	print("%d" % x[i],end=" ")

mergeSort(x, 0, n-1)
print("\n\nSorted array is")  
for i in range(n):
	print("%d" % x[i],end=" ")
e = time.time()
print("")
print('exe time:', e-s,'s')
 


