# -*- coding: utf-8 -*-
"""
Created on Tue Sep 19 12:32:05 2023

@author: MCA-10
"""


n=int(input("Enter The Upper Limit : "))
print("Prime Number's Are ...")
for num in range(0, n+1):
    if(num > 1):
        for i in range(2, num):
            if(num % i) == 0:
                print(num,i)
        else:
            print("prime no",num)
