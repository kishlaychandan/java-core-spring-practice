# -*- coding: utf-8 -*-
"""
Created on Thu Nov  3 16:01:01 2022

@author: sethy
"""

import time as ty
def factorial(x):
    if x == 1:
        return 1
    else:
        return (x * factorial(x-1))
start_time=ty.time() 
a = int(input('Enter the number: '))
result = factorial(a)
print("The factorial of", a, "is", result)
end_time=ty.time()
print('Total Execution time: ',end_time-start_time,"ms")