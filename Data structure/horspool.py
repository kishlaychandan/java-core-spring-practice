# -*- coding: utf-8 -*-
"""
Created on Wed Jan 02 08:30:07 2023

@author: sethy
"""
import time as t
def BoyerMooreHorspool(pattern, text):
    m = len(pattern)
    n = len(text)
    if m > n: return -1
    skip = []
    for k in range(256): skip.append(m)
    for k in range(m - 1): skip[ord(pattern[k])] = m - k - 1
    skip = tuple(skip)
    k = m - 1
    while k < n:
        j = m - 1; i = k
        while j >= 0 and text[i] == pattern[j]:
            j -= 1; i -= 1
        if j == -1: return i + 1
        k += skip[ord(text[k])]
    return -1
s= t.perf_counter()
text = str(input("enter the string : "))
pattern = str(input("enter the string to be searched :"))
search = BoyerMooreHorspool(pattern, text)
e=t.perf_counter()
if search > -1:
    print ('Pattern \"' + pattern + '\" found at position',search)
print("exe time:",e-s,'ms')