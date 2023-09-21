# -*- coding: utf-8 -*-
"""
Created on Wed Dec 21 16:33:35 2022

@author: sethy
"""

def conains(text , pattern):
    t = len(text)
    p = len(pattern)
    if p>t:
        print("pattern is longer")
    else:
        found = False
        for i in range (0,t):
            j = 0
            while j<p and t[i]==p[i]:
                i = i+1
                j = j+1
            if j == p:
                found = True
                return found
        if not found:
            return False
            
text = str(input("enter the string : "))
pattern = str(input("enter the string to be searched :"))
conains(text, pattern)
