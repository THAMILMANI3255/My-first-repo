# -*- coding: utf-8 -*-
"""
Created on Mon Jul 31 09:46:37 2023

@author: MCA-10
"""


import sqlite3
conn=sqlite3.connect('students.db')
print("Students DataBase Is Opened Successfully")
conn.execute('''create table bca(rollno text primary key not null,std_name text not null,mark int not null );''')
conn.execute("insert into bca (rollno,std_name,mark) values ('21UCA001','Abinesh',78)")
conn.execute("insert into bca (rollno,std_name,mark) values ('21UCA002','Ameeth',89)")
conn.execute("insert into bca (rollno,std_name,mark) values ('21UCA008','Dhamo',90)")
conn.execute("insert into bca (rollno,std_name,mark) values ('21UCA009','Divakaran',90)")
conn.execute("insert into bca (rollno,std_name,mark) values ('21UCA049','ThamilMani',92)")
conn.commit()
print("Records Inserted Successfully")