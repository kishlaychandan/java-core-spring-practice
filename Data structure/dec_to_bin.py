# -*- coding: utf-8 -*-
"""
Created on Wed Dec  7 16:22:03 2022

@author: sethy
"""
import time 
def convertToBinary(n):
   if n > 1:
       convertToBinary(n//2)
   print(n % 2,end = '')

s=time.perf_counter_ns()
dec = int(input("enter no"))
convertToBinary(dec)
print()
e=time.perf_counter_ns()
exe=(e-s)
print('Execution time: ',exe,'nanoSec')