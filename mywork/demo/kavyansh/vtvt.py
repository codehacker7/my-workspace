'''
Created on Nov. 22, 2021

@author: kavyanshbansal
'''
d = [0]*4

for i in range(0,len(d)):
    d[i]=(int)(input("Enter the integer"))

for i in range(0,len(d)):
    if(d[i]>0):
        print("Atitude above the sea level are: ",d[i])

for i in range(0,len(d)):
    if(d[i]<0):
        print("Atitude below the sea level are: ",d[i])

print(min(d))