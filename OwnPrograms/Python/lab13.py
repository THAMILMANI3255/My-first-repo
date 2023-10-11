# -*- coding: utf-8 -*-
"""
Created on Tue Aug  8 10:29:43 2023

@author: MCA-10
"""


import matplotlib.pyplot as plt
import numpy as np
x=np.arange(5)
print(x)
y=x*x
print(y)
plt.title('square value')
plt.plot(x,y,'^')