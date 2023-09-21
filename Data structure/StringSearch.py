import time
def StringMatch(s,t):
    for i in range(0,len(s)-len(t)+1):
        j=0
        while(j<len(t) and t[j]==s[i+j]):
            j+=1
        if(j==len(t)):
            return i
    return -1

s= input("Enter string: ")
t= input("Enter string for pattern matching: ")
start=time.perf_counter()
if(StringMatch(s,t))>=0:
    print("Match found at index: ",StringMatch(s,t))
else:
    print("Match not found")
end=time.perf_counter()
print('Execution time:',(end-start)*1000,"ms")