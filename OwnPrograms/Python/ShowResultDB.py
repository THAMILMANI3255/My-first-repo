# -*- coding: utf-8 -*-
"""
Created on Mon Jul 31 09:56:43 2023

@author: MCA-10
"""


import sqlite3
conn=sqlite3.connect('students.db')
print("DataBase Is Opened ...")
rs=conn.cursor()
rs.execute("select rollno,std_name,mark from bca")
record=rs.fetchall()
print("Total nu of Records In : ",len(record))
for row in record:
    print("rollno",row[0])
    print("std_name",row[1])
    print("mark",row[2])
rs.close()
print("Records Are Prints Successfully")