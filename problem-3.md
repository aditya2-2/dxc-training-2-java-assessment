# Java Assessment Question 3

## Task 1

Create a class named `ArrayTest` and write a method named `isUnique` that takes an array of integers as a parameter and that returns a boolean value indicating whether or not the values in the array are unique (true for yes, false for no). The values in the list are considered unique if there is no pair of values that are equal. For example, if a variable called list stores the following values:

```java
/**
 * Example 1:
 * Then the call of isUnique(list) should return true because there are no duplicated values in this list. 
 */
int [] list = {3, 6, 12, 4, 5, 7, 8, 9, 10, 11};


/**
 * Example 2:
 * Then the call of isUnique(list) should return false because there are two values that are equal. 
 * The value 3 appears twice in this list. 
 */
int [] list = {3, 6, 12, 4, 5, 7, 8, 9, 10, 11, 3};

public class ArrayTest{
    //Task 1
    public static boolean isUnique(int[] list) {
        for(int i=0;i<list.length;i++)
        {
            int min = list[i];
            for(int j=1;j<list.length;j++)
            {
                if(min > list[j])
                {
                    list[i] = list[j];
                    list[j] = min;
                    min = list[i];
                }
            }
        }
        for(int i=0;i<list.length;i++)
        {
            if(list[i] == list[i+1]){
                return false;
            }
        }
        return true;
    }
    //Task2 
    public static boolean isSorted(double[] list) {
    double pre = list[0];
    
            for (int i = 1; i < list.length; i++) {
            double current = list[i];
            if (pre >= current) {
                return false;
            }
            pre = current;
        }
    
        return true;
    }
    
    //Task 3
    if(list.get(index)== null)
    {
        throw new NoElementsInArrayException("Elements of Array are Zero!");
    }

}
```

## Task 2

Write a static method named `isSorted` that accepts an array of doubles as a parameter and returns true if the list is in sorted (nondecreasing) order and false otherwise. For example, if arrays named `list1` and `list2` store `{16.1, 12.3, 22.2, 14.4}` and `{1.5, 4.3, 7.0, 19.5, 25.1, 46.2}` respectively, the calls `isSorted(list1)` and `isSorted(list2)` should return `false` and `true` respectively. Assume the array has at least one element. A one-element array is considered to be sorted. 

## Task 3

In both these methods if the array has zero elements then `NoElementsInArrayException` should be thrown.