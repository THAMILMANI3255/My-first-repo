# -*- coding: utf-8 -*-
"""
Created on Tue Jul 18 12:55:49 2023

@author: MCA-10
"""


file1=open("myfile.txt","w")
l=["Kottai MarriAmman Temple Is Very Famous Temple In Dindigul..."]
file1.write("Hello World\n")
file1.writelines(l)
file1.close()
file1=open("myfile.txt","r")
file1.seek(0)
print("Output Of Reading Function is : ")
print(file1.read())
print()
file1.seek(0)
print("Output Of Reading Function is : ")
print(file1.read())
print()
file1.close()

f=open("mybinary.bin","wb")
num=[1,2,3,4,5]
arr=bytearray(num)
f.write(arr)
f.close()

f=open("mybinary.bin","rb")
print("Print The Convertion Of Binary File Into The List TYpe ")
num=list(f.read())
print(num)
f.close()
