import time as ty
def bubble_sort(list1):  
    for i in range(0,len(list1)-1):  
        for j in range(len(list1)-1):  
            if(list1[j]>list1[j+1]):  
                list1[j],list1[j+1]=list1[j+1],list1[j]
    return list1
start_time=ty.time()
n = input('Enter all the element of list').split()
n = [int(x) for x in n]
print("The sorted list is: ", bubble_sort(n))
end_time=ty.time()
print('Total Execution time: ',end_time-start_time,"ms")