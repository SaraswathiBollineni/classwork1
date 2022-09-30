def binary_search(arr,x):
    low=0
    high=len(arr)-1
    mid=0
    while low<high:
        mid=(high+low)//2
        if arr[mid]<x:
            low=mid+1
        elif arr[mid]>x:
            high=mid-1
        else:
            return mid
        return -1
arr=[10,20,21,22,24]
x=21
r=binary_search(arr,x)
if r!=-1:
    print("Element is found at index",str(r))
else:
    print("not present")
          
                