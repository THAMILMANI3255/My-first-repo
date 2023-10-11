# -*- coding: utf-8 -*-
"""
Created on Tue Aug  8 10:20:50 2023

@author: MCA-10
"""


import pandas as pd
sdata=pd.read_csv('stddata.csv')
print(sdata)
print(sdata.loc[2,:])
