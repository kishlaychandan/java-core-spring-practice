import numpy as np
import time

def Tower(n , source, destination, auxiliary):
    if n==1:
        print ("Move disk 1 from source",source,"to destination",destination)
        return
    Tower(n-1, source, auxiliary, destination)
    print ("Move disk",n,"from source",source,"to destination",destination)
    Tower(n-1, auxiliary, destination, source)
n = int(input("Enter the no.of disks:"))
s = time.perf_counter_ns()
Tower(n,'A','B','C')
nm=pow(2,n)-1
print("Total disk movements are:",nm)
e= time.perf_counter_ns()
exe = e-s
print("Execution time:",exe,"ms")