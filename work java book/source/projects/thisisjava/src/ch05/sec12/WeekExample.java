import matplotlib.pyplot as plt 
import numpy as np
import pandas as pd

plt.figure(dpi = 300, figsize = (8,5))

df = pd.read_excel(r'C:\Users\tkdir\Desktop\인천과학고\고등학교 2학년\수행평가 모음\지구과학\grade.xlsx')

er=([2,5,4,3,1,6,2],
    [12,15,14,13,11,16,12])

plt.bar(df['student'],df['grade'],
        color= ['red','orange','green','magenta','tomato',
                'violet','blue'],
        width = 0.7,
        edgecolor = 'k',
        linewidth = 2,
        yerr = er,
        capsize = 3)

plt.xticks(family = 'serif',
           size = 11)
plt.yticks(family = 'serif',
           size = 11)

plt.title('ojunseo',
          family = 'serif',
          size = 25,
          weight = 'bold')

plt.grid(axis ='y')