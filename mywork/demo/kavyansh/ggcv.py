'''
Created on Nov. 20, 2021

@author: kavyanshbansal
'''

nums = [0] * 4                  # store user input here

    # Write your code here

nums[0]=(int)(input("Enter the first integer: "))
nums[1]=(int)(input("Enter the second integer: "))
nums[2]=(int)(input("Enter the third integer: "))
nums[3]=(int)(input("Enter the fourth integer: "))

for i in range(nums[0],nums[3]+1):
    for j in range(i+1,nums[3]+1):
        print(i,"*",j)
print("Correct Answers: ")
for i in range(nums[0],nums[3]+1):
    for j in range(i+1,nums[3]+1):
        print(i,"*",j,"=",(i*j))

