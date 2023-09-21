# -*- coding: utf-8 -*-
"""
Created on Thu Nov  3 15:24:33 2022

@author: sethy
"""

import time

def linear_search(n, key):
    for i in range(len(n)):
        if n[i] == key:
            return i
    return -1
 
 
start=time.time()
n = input('Enter all the element of list: ')
n = n.split()
n = [int(x) for x in n]
key = int(input('The number to search for: '))
 

index = linear_search(n, key)
if index < 0:
    print('{} was not found.'.format(key))
else:
    print('{} was found at index {}.'.format(key, index))
end=time.time()
print("exceuation time:",(end-start),"ms")