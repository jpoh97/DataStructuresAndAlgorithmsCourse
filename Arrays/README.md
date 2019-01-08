# Arrays
 
Arrays are not a dynamic data structure, I mean that once you've created an array instance you cannot change its size. We can't increase its size and we can't decrease that size.

## In memory

* Contigouos block in memory.
* Every element in the array occupies the same amount of space.
* If an array starts at memory address X and the size of each element in the array is Y then we can calculate the memory address of the ith element by using the following expression X + i * Y.
* if we know the index of an element, the time to retrieve that element will be the same no matter where it is in the array. 


## Big O values of array operations

An easy way for arrays to remember the time complexity is if if the code requires a loop it's going to be linear time. If the code does not require a loop then it's constant time.

![](BigO.png)
