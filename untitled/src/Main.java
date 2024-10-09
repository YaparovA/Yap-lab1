import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public double fraction(double x)  {return x - (int)x;}

    public int charToNum(char x) {return x - '0';}

    public boolean is2Digits (int x) {return x > 9 && x < 100;}

    public boolean isInRange (int a, int b, int num) {return (num >= a && num <= b) || (num >= b && num <= a);}

    public boolean isEqual(int a, int b, int c){return a==b && b==c;}

    public int abs (int x) { return Math.abs(x);}

    public boolean is35 (int x) {return (x % 3 == 0) ^ (x % 5 == 0);}

    public int max3 (int x, int y, int z)
    {
        int maxValue;
        if (x > y)
            maxValue = x;
        else
            maxValue = y;

        if (maxValue > z)
            return maxValue;
        else
            return z;
    }

    public int sum2 (int x, int y)
    {
        if (x + y > 9 && x + y < 21)
            return 20;
        else
            return x + y;
    }

    public String day (int x)
    {
        switch (x)
        {
            case 1: return "Понедельник";
            case 2: return "Вторник";
            case 3: return "Среда";
            case 4: return "Четверг";
            case 5: return "Пятница";
            case 6: return "Суббота";
            case 7: return "Воскресенье";
            default: return "Это не день недели";
        }
    }

    public String listNums (int x)
    {
        String result = "";
        for(int i = 0; i <= x; i++)
            result += i + " ";

        return result.trim();
    }

    public String chet (int x)
    {
        String result = "";
        for (int i = 0; i <= x; i+=2)
            result += i + " ";

        return result.trim();
    }

    public int numLen (long x)
    {
        int count = 0;
        while (x > 0)
        {
            x /= 10;
            count++;
        }

        return count;
    }

    public void square (int x)
    {
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < x; j++)
                System.out.print("*");
            System.out.print('\n');
        }
    }

    public void rightTriangle (int x)
    {
        int count = x;
        for (int i = 0; i < x; i++)
        {
            count--;
            for (int j = 0; j < x; j++)
                if (count > j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            System.out.print('\n');
        }
    }

    public int findFirst (int[] arr, int x)
    {
        for (int i = 0; i < arr.length; i++)
            if (x == arr[i])
                return i;
        return -1;
    }

    public int maxAbs (int[] arr)
    {
        int maxAbsValue = 0;
        for (int i = 0; i < arr.length; i++)
            if (Math.abs(arr[i]) > Math.abs(maxAbsValue))
                maxAbsValue = arr[i];
        return maxAbsValue;
    }

    public int[] add (int[] arr, int[] ins, int pos)
    {
        int[] newArr = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++)
            newArr[i] = arr[i];

        for (int i = 0; i < ins.length; i++)
            newArr[pos + i] = ins[i];

        for (int i = pos; i < arr.length; i++)
            newArr[ins.length + i] = arr[i];

        return newArr;
    }

    public int[] reverseBack (int[] arr)
    {
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--)
            newArr[arr.length - i - 1] = arr[i];

        return newArr;
    }

    public int[] findAll (int[] arr, int x)
    {
        int[] newArr = new int[0];
        for (int i = 0; i < arr.length; i++)
            if (x == arr[i])
            {
                newArr = Arrays.copyOf(newArr, newArr.length + 1);
                newArr[newArr.length - 1] = i;
            }

        return newArr;
    }

    public static void main(String[] args) {

        Main mainClass = new Main();
        System.out.printf("\nFraction method result: %.10f\n", mainClass.fraction(5.25));
        System.out.printf("CharToNum method result: %d\n", mainClass.charToNum('3'));
        System.out.printf("Is2Digits method result: %b\n", mainClass.is2Digits(32));
        System.out.printf("IsInRange method result: %b\n", mainClass.isInRange(5, 1, 3));
        System.out.printf("IsEqual method result: %b\n", mainClass.isEqual(2, 15, 2));

        System.out.printf("\nAbs method result: %d\n", mainClass.abs(-5));
        System.out.printf("Is35 method result: %b\n", mainClass.is35(8));
        System.out.printf("Max3 method result: %d\n", mainClass.max3(8, -1, 4));
        System.out.printf("Sum2 method result: %d\n", mainClass.sum2(5, 7));
        System.out.printf("Day method result: %s\n", mainClass.day(5));

        System.out.printf("\nListNums method result: %s\n", mainClass.listNums(5));
        System.out.printf("Chet method result: %s\n", mainClass.chet(9));
        System.out.printf("NumLen method result: %d\n", mainClass.numLen(12567));
        System.out.print("Square method result: \n");
        mainClass.square(4);
        System.out.print("RightTriangle method result: \n");
        mainClass.rightTriangle(4);

        System.out.printf("\nFindFirst method result: %d\n", mainClass.findFirst(new int[]{1,2,3,4,2,2,5}, 2));
        System.out.printf("MaxAbs method result: %s\n", mainClass.maxAbs(new int[]{1,-2,-7,4,2,2,5}));
        System.out.print("Add method result: ");
        int[] arrTesting = mainClass.add(new int[]{1,2,3,4,5}, new int[]{7,8,9}, 3);
        for(int i = 0; i < arrTesting.length; i++)
            System.out.print(arrTesting[i] + " ");
        System.out.print("\nReverseBack method result: ");
        arrTesting = mainClass.reverseBack(new int[]{1,2,3,4,5});
        for(int i = 0; i < arrTesting.length; i++)
            System.out.print(arrTesting[i] + " ");
        System.out.print("\nFindAll  method result: ");
        arrTesting = mainClass.findAll(new int[]{1,2,3,8,2,2,9}, 2);
        for(int i = 0; i < arrTesting.length; i++)
            System.out.print(arrTesting[i] + " ");

    }
}