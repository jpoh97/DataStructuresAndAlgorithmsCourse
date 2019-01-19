# Quick Sort

* Divide and conquer algorithm
* Recursive algorithm
* Use a pivot element to partition the array int two parts
* Elements < pivot to its left, elements > pivot to its right
* Pivot will then be in its correct sorted position
* Process is now repeated for the left array and right array
* Eventually, every element has been the pivot, so every element will be in its correct sorted position
* As with merge sort, we'll end up partitioning the array into a series of 1 element arrays
* Does this in-place (unlike merge sort)
* Unstable algorithm
* O(nlogn) - base 2. We're repeatedly dividing the array into 2 halves
* In worst case it's actually a quadratic algorithm O(n**2) but in the average case it performs with a time complexity of 0 to the analog end and most of the time that it performs better than merge sort
* It's important to note that the choice of pivot can have an effect on the time complexity depending on the data that's being sorted


* Quicksort chooses a pivot element and then it divides the array into two halves. This division is a logical division. On the left half it puts elements that are less than the pivot element and in the right half or the right subarray it puts elements that are greater than the pivot element.
* The pivot element will be in the middle between the two arrays. Everything less than the pivot element will be to the left and everything greater than the pivot element will be to the right. This is called the partitioning step.


![](Quicksort.gif)