# -*- coding: utf-8 -*-
"""
Created on Thu Nov  3 16:59:56 2022

@author: sethy
"""

import time
s=time.time()
def Fibbo(n):
    if n<=1:
        return n
    return Fibbo(n-1)+Fibbo(n-2)

n=int(input('Enter Nth term: '))
for t in range(n):
    print(Fibbo(t))
e = time.time()

print("exe time = ",e-s,'s',end = ' ')
    