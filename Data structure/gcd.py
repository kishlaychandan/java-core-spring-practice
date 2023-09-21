# -*- coding: utf-8 -*-
"""
Created on Thu Oct 27 16:29:34 2022

@author: sethy
"""
import time as t
def HCF(a,b):
    while b>0:
        temp=b
        b=a%b
        a=temp
    return a    

t1=t.time()
print("Enter two Numbers: ")
a=int(input())
b=int(input())
tt=HCF(a,b)
print("Hcf: ",tt)
t2=t.time()
print('Total Execution time: ',t2-t1)