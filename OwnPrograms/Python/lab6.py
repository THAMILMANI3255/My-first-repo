# -*- coding: utf-8 -*-
"""
Created on Mon Jul 10 12:52:45 2023

@author: MCA-10
"""
def swap(n1,n2):
    temp=n1;
    n1=n2;
    n2=temp;
    print("After Swapping The Value For A And B : ",n1,n2)
    return 

n1=int(input("Enter The Value For A : "))
n2=int(input("Enter The Value For B : "))
print("Before Swapping The Value For A And B : ",n1,n2)
swap(n1,n2)
