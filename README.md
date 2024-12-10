# HW3-Testing-NoelChacko

## a)Functional Description
The 'average' function of the first 'k' elements of the array 'list'. If the value of k is greater than the length of 'list' the function considers all values. However, if the value is less k elements will be considered. If 'List' is empty or k = 0, the function returns 0.

## b)Functional Test Cases
| Test Case |	Description |	Input (k, list) |	Expected Output |
| -- | -- | -- | -- |
| TC1 | list is empty | 4,[] | 0 | 
| TC2 | k is 0 | 0,[1,2,3,4,5] | 0 | 
| TC3 | k is less than list size | 3,[1,2,3,4,5] | 2 |
| TC4 | k is equal to list size | 5 ,[1,2,3,4,5] | 3 |
| TC5 | k is greater than list size | 10,[1,2,3,4,5] | 3 |

## c)Partitions Test Cases
#### Partition:
1. k = O
2. k > length of list
3. k < length of list
4. length of list = 0

<BR>

#### Test Cases:
| Test Case |	Partition |	Input (k, list) |	Expected Output |
| -- | -- | -- | -- |
| TC6 | k is 0 | 0,[10,20,30,40,50] | 0 | 
| TC7 | k > length of list | 8,[10,20,30,40,50] | 30 | 
| TC8 | k < length of list | 3,[10,20,30,40,50] | 20 |
| TC9 | length of list = 0 | 5,[] | 0 |

## d)Boundary Value Test Cases
#### Bonudaries:
1. Minimum k (0)
2. Maximum k (length of list)
3. k above length of list

#### Test Cases:
| Test Case |	Description |	Input (k, list) |	Expected Output |
| -- | -- | -- | -- |
|TC10|	Minimum k (0) |	0, [10, 20] |	0
|TC11|	Maximum k (length of list) |	3, [10, 20, 30] |	20
|TC12|	k above length of list |	4, [10, 20, 30] |	20

## e)Implementation

[Link to Average.java](https://www.google.com/)
<BR>[Link to AverageTest.java](https://www.google.com/)

## f)Compile and run the test cases

## g)Code Coverage

