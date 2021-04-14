import java.util.Arrays;

public class ArrayAndDoWhile {

    // Q 1 To establish if two arrays are equal or not
    public void arrayEquality() //instance method without parameters
    {
        int arr1[] = {2, 5, 7, 9, 10}; // two arrays are initialized with different values
        int arr2[] = {2, 5, 7, 10};

        for (int i = 0; i < arr1.length; i++) // loop will check the elements in 1st array
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) // loop will check the elements in 2nd array
        {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        if (Arrays.equals(arr1, arr2)) // condition to check if both arrays have same number of elements and same
        // values at same index position
        {
            System.out.println("Both arrays are equal");
        } else {
            System.out.println("Both arrays are not equal");
        }
    }

    // Q 2 Arrange the array in ascending order
    public void arrayAscend()
    {
        int arr[] = {3, 9, 5, 0}; // array is initialized with values
        int temp; // will hold temporary value of elements

        System.out.println("Elements of original array");
        for (int i = 0; i < arr.length; i++) // loop to print the elements of array 1
        {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) // loop will initialize with 0th index and run until the length of array
        {
            for (int j = i + 1; j < arr.length; j++) // loop with compare value in each index position and will bring
            // forward the smallest value at 0th index position and so on for array
            {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array in ascending order");
        for (int i = 0; i < arr.length; i++) // loop to print array in ascending order
        {
            System.out.print(arr[i] + " ");
        }
    }

    // Q 3 Count occurrence of "a" in a string
    public void charCount()
    {
        String s = "Santa Claus live in lalaland";
        char inputChar = 'a'; // character to be counted
        int count = 0; // will hold the count of a in the string
        int i = s.length() -1; // variable initialized as last character index of the string

        // loop will compare all characters from end to start
        while(i>=0)
        {
            if(s.charAt(i) == inputChar)
            {
                count++;
            }
            i--;
        }
        System.out.println("Total occurrence of a in the string - "  + s + " is:- " + count);

    }

    //Q 4 Multiplication table using do while loop
    public void multiplication()
    {
        int i = 1;
        // loop will first print the initialized value and will run until value of i and j meet condition of <=
        do {
            int j = 1;
            do
            {
                System.out.print(i * j + "\t" ); // value of i and j will be multiplied
                j++;
            }
            while (j <= 3);
            i++;
            System.out.println();
        } while (i <= 3);
    }

    // Q 5 Common elements in array
    public void commonElements()
    {
        // string arrays are initialized
        String [] arr1 = {"Manual", "Testing", "Automation"};
        String [] arr2 = {"Automatic","Manual", "Java" };

        // loop will check the index of each array and will print only common elements
        for (int i = 0; i <arr1.length ; i++)
        {
            for (int j = 0; j < arr2.length ; j++)
            {
                if (arr1[i] == (arr2[j]))
                {
                    System.out.println("Common elements in both arrays are - " + (arr1[i]));
                }
            }
        }

    }


    public static void main(String[] args)
    {
        // Q 1 Equality of Arrays
        System.out.println("Ans 1 - Equality of Arrays");
        ArrayAndDoWhile arrayandDoWhile = new ArrayAndDoWhile();
        arrayandDoWhile.arrayEquality();
        System.out.println();

        // Q 2 Ascending order of Array
        System.out.println("Ans 2 - Ascending order of Array");
        ArrayAndDoWhile arrayAscend = new ArrayAndDoWhile();
        arrayAscend.arrayAscend();
        System.out.println();

        // Q 3 Counting 'a' in the string
        System.out.println();
        System.out.println("Ans 3 - Count of a in the string");
        ArrayAndDoWhile charCount = new ArrayAndDoWhile();
        charCount.charCount();
        System.out.println();

        // Q 4 Multiplication table using do while loop
        System.out.println("Ans 4 - Multiplication table of 1,2,& 3 up to times 3 only");
        ArrayAndDoWhile multiplication = new ArrayAndDoWhile();
        multiplication.multiplication();
        System.out.println();

        // Q 5 Common Elements in String Array
        System.out.println("Ans 5 - Common elements in string array");
        ArrayAndDoWhile commonElements = new ArrayAndDoWhile();
        commonElements.commonElements();



    }



}
