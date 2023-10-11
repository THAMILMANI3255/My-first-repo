# -*- coding: utf-8 -*-
"""
Created on Mon Jul 31 09:00:29 2023

@author: MCA-10
"""


import sqlite3
con=sqlite3.connect('test2.db')
print("DataBase Is Connected")
con.execute('''create table company(id int primary key not null,name text not null,age int not null);''')
con.execute("insert into company (id,name,age) values(12,'thamil mani',19)")
con.execute("insert into company (id,name,age) values(22,'kishore',17)")
con.execute("insert into company (id,name,age) values(32,'anbu',40)")
con.execute("insert into company (id,name,age) values(42,'varatha',45)")
con.commit()
print("Records Are Create Successfully")