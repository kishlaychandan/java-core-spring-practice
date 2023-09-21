# -*- coding: utf-8 -*-
"""
Created on Wed Dec  7 16:39:27 2022

@author: sethy
"""
import time as t
def compute_gcd(x, y):

   while(y):
       x, y = y, x % y
   return x

def compute_lcm(x, y):
   lcm = (x*y)/compute_gcd(x,y)
   return lcm
s = t.perf_counter()
num1 = int(input("enter the number 1:"))
num2 = int(input("enter the number 2:"))
print("The GCD is", compute_gcd(num1, num2))
print("The L.C.M. is", compute_lcm(num1, num2))
e = t.perf_counter()
ex =(e-s)
print("execution time is ",ex , "s" )