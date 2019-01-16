# Merge Sort

* Divide and conquer algorithm
* Recursive algorithm
* Two phases: Splitting and Merging
* Splitting phase leads to faster sorting during the Merging phase
* Splitting is logical. We don't create new arrays

## Merge Sort - Splitting Phase

* Start with an unsorted array
* Divide the array into 2 arrays, which are unsorted. the first array is the left array, and the second array is the right array
* Split the left and right arrays int 2 arrays each
* Keep splitting until all the arrays have only one element each - these arrays are sorted

## Merge Sort - Merging Phase

* Merge every left/right pair of sibling arrays into a sorted array
* After the first merge, we'll have a bunch of 2-element sorted arrays
* Then merge those sorted arrays (left/right siblings) to end up with a bunch of 4-element sorted arrays
* Repeat until you have a single sorted array
* Not in-place. Uses temporary arrays

### Merging process

* We merge sibling left and right arrays
* We create a temporary array large enough to hold al the elements in the arrays we're merging
* We set i to the first index of the left array, and j to the first index od the right array
* We compare left[i] to right[j]. if left is smaller, we copy it to the temp array and increment i by 1. If right is smaller, we copy it to the temp array and increment j by 1

![](Merge-sort.gif)