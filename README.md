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

[Link to Average.java](https://github.com/UTDClassroomOrg/HW3-Testing-NoelChacko/blob/main/Average.java)
<BR>[Link to AverageTest.java](https://github.com/UTDClassroomOrg/HW3-Testing-NoelChacko/blob/main/AverageTest.java)

## f)Compile and run the test cases

### Intital Results
The Original Code was able to run the test case with no issues 
- Errors: 0
- Failures: 0


### Fault Injection
In order to complete section F and accurately examine the test cases, the following fault: i = 0 to i = 1 was add. The new code is given below.

```java

public class Average {
    public int average(int k, int[] list) {
        int average = 0;
        int n = Math.min(k, list.length);
        if (n > 0) {
            for (int i = 1; i < n; i++) {
                average += list[i];
            }
            average = average / n;
        }
        return average;
    }
}

```

| Test Case |	Pass/Fail |
| -- | -- |
| TC1 | Pass |
| TC2 | Pass |
| TC3 | Fail |
| TC4 | Pass |
| TC5 | Pass |

#### Analysis
By editing our function the fault results in the function skipping the first element of List, which results in incorrect averages. This resulted in test case 3 failing because it was expecting the result 2 but actually got 1.

#### Fix
By swapping i = 1 for i = 0 the function will iterate over the entire array instead of skipping the first test case. 

```java

public class Average {
    public int average(int k, int[] list) {
        int average = 0;
        int n = Math.min(k, list.length);
        if (n > 0) {
            for (int i = 0; i < n; i++) { //swapped i = 1 to i = 0
                average += list[i];
            }
            average = average / n;
        }
        return average;
    }
}

```

## g)Code Coverage
My test case were able to recieve 100% coverage: <img width="1180" alt="Screenshot 2024-12-09 at 11 50 08 PM" src="https://github.com/user-attachments/assets/c6edb6c5-1fad-45bf-8a12-2c8f88ac0b93">


