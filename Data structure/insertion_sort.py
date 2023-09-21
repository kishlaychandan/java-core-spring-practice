# -*- coding: utf-8 -*-
"""
Created on Thu Dec  1 16:45:39 2022

@author: sethy
"""

def insertionSort(A):
    for i in range(1,len(A)):
        temp,k=A[i],i
        while k>0 and temp<A[k-1]:
            A[k]=A[k-1]
            k-=1
        A[k]=temp
n = input('Enter all the element of list').split()
n = [int(x) for x in n]
print("len",len(n))
insertionSort(n)
print(n)
