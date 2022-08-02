nums=[0,0,0,0]
nums[0]=input("Enter the first number")
nums[1]=input("Enter the second number")
nums[2]=input("Enter the third number")
nums[3]=input("Enter the fourth number")


sum1 =0
for i in range(0,4):
    sum1=sum1+nums[i]
average = sum1/4
count=0
for i in range(0,4):
    if(nums[i]>average):
        print(nums[i])
        count=count+1
print(count)