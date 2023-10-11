# -*- coding: utf-8 -*-
"""
Created on Mon Jul 31 09:26:34 2023

@author: MCA-10
"""

import sqlite3
conn=sqlite3.connect('test2.db')
print("Opened The DataBase ...")
rs=conn.cursor()
rs.execute("select id,name,age from company")
record=rs.fetchall()
print("Total Records Are : ",len(record))
for row in record:
    print("ID : ",row[0])
    print("Name : ",row[1])
    print("Age : ",row[2])
rs.close()
print("data Viewed Successfully")