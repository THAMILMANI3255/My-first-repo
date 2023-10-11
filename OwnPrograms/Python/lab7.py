# -*- coding: utf-8 -*-
"""
Created on Thu Jul 13 10:18:27 2023

@author: MCA-10
"""


def recursive(k):
    if(k>0):
        result=k+recursive(k-1)
        print(result)
    else:
        result=0
    return result
print("Result Of Recursive Is : ")
recursive(6)        