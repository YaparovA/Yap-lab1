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

    private static int CycleInputInt(String text)
    {
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();

        while (!InputCheck.isNumber(inputLine)) {
            System.out.println("\nYou can only enter numbers");
            System.out.print(text);
            inputLine = in.nextLine();
        }
        return Integer.parseInt(inputLine);
    }

    private static double CycleInputDouble(String text)
    {
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();

        while (!InputCheck.isDouble(inputLine)) {
            System.out.println("\nYou can only enter numbers");
            System.out.print(text);
            inputLine = in.nextLine();
        }
        return Double.parseDouble(inputLine);
    }

    private static char GetFirstSymbol(String text)
    {
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();

        while (!InputCheck.isCharNumber(inputLine.charAt(0))) {
            System.out.println("\nYou can only enter char");
            System.out.print(text);
            inputLine = in.nextLine();
        }
        return inputLine.charAt(0);
    }
    public static void main(String[] args) {

        Main mainClass = new Main();



        boolean workCondition = true;
        int[] arrayForInput, arrayTesting;
        while (workCondition) {
            System.out.println("\nExercise numbers:" +
                    "\n1.First exercise" +
                    "\n2.Second exercise" +
                    "\n3.Third exercise" +
                    "\n4.Fourth exercise" +
                    "\n0.Exit" +
                    "\nAny other number to run the auto test");
            System.out.print("Enter the exercise number:");

            int exerciseNum = CycleInputInt("Enter the exercise number:");
            switch (exerciseNum) {
                case 1:
                    System.out.print("\nEnter value for Fraction method: ");
                    double valueForFraction = CycleInputDouble("Enter the value for Fraction method:");
                    System.out.printf("Fraction method result: %.10f\n", mainClass.fraction(valueForFraction));

                    System.out.print("\nEnter value for CharToNum method: ");
                    char valueForCharToNum = GetFirstSymbol("Only numbers between 1 and 9." +
                            "Enter the value for CharToNum method:");
                    System.out.printf("CharToNum method result: %d\n", mainClass.charToNum(valueForCharToNum));

                    System.out.print("\nEnter value for is2Digits method: ");
                    int valueForIs2Digits = CycleInputInt("Enter the value for is2Digits method:");
                    System.out.printf("Is2Digits method result: %b\n", mainClass.is2Digits(valueForIs2Digits));

                    System.out.print("\nEnter values for IsInRange method: ");
                    arrayForInput = new int[3];
                    for (int i = 0; i < arrayForInput.length; i++) {
                        System.out.printf("\nEnter the value №%d for IsInRange method: ", i + 1);
                        arrayForInput[i] = CycleInputInt(String.format("Enter the value №%d for IsInRange method:", i + 1));
                    }
                    System.out.printf("IsInRange method result: %b\n", mainClass.isInRange(arrayForInput[0], arrayForInput[1], arrayForInput[2]));

                    System.out.print("\nEnter values for IsEqual method: ");
                    arrayForInput = new int[3];
                    for (int i = 0; i < arrayForInput.length; i++) {
                        System.out.printf("\nEnter the value №%d for IsEqual method: ", i + 1);
                        arrayForInput[i] = CycleInputInt(String.format("Enter the value №%d for IsEqual method:", i + 1));
                    }
                    System.out.printf("IsEqual method result: %b\n", mainClass.isEqual(arrayForInput[0], arrayForInput[1], arrayForInput[2]));

                    break;
                case 2:
                    System.out.print("\nEnter value for Abs method: ");
                    int valueForAbs = CycleInputInt("Enter the value for Abs method:");
                    System.out.printf("Abs method result: %d\n", mainClass.abs(valueForAbs));

                    System.out.print("\nEnter value for Is35 method: ");
                    int valueForIs35 = CycleInputInt("Enter the value for Is35 method:");
                    System.out.printf("Is35 method result: %b\n", mainClass.is35(valueForIs35));

                    System.out.print("\nEnter values for Max3 method: ");
                    arrayForInput = new int[3];
                    for (int i = 0; i < arrayForInput.length; i++) {
                        System.out.printf("\nEnter the value №%d for Max3 method: ", i + 1);
                        arrayForInput[i] = CycleInputInt(String.format("Enter the value №%d for Max3 method:", i + 1));
                    }
                    System.out.printf("Max3 method result: %d\n", mainClass.max3(arrayForInput[0], arrayForInput[1], arrayForInput[2]));

                    System.out.print("\nEnter values for Sum2 method: ");
                    arrayForInput = new int[2];
                    for (int i = 0; i < arrayForInput.length; i++) {
                        System.out.printf("\nEnter the value №%d for Sum2 method: ", i + 1);
                        arrayForInput[i] = CycleInputInt(String.format("Enter the value №%d for Sum2 method:", i + 1));
                    }
                    System.out.printf("Sum2 method result: %d\n", mainClass.sum2(arrayForInput[0], arrayForInput[1]));

                    System.out.print("\nEnter value for Day method: ");
                    int valueForDay = CycleInputInt("Enter the value for Day method:");
                    System.out.printf("Is35 method result: %s\n", mainClass.day(valueForDay));

                    break;
                case 3:
                    System.out.print("\nEnter value for ListNums method: ");
                    int valueForListNums = CycleInputInt("Enter the value for ListNums method:");
                    System.out.printf("ListNums method result: %s\n", mainClass.listNums(valueForListNums));

                    System.out.print("\nEnter value for Chet method: ");
                    int valueForChet = CycleInputInt("Enter the value for Chet method:");
                    System.out.printf("Chet method result: %s\n", mainClass.chet(valueForChet));

                    System.out.print("\nEnter value for NumLen method: ");
                    int valueForNumLen = CycleInputInt("Enter the value for NumLen method:");
                    System.out.printf("NumLen method result: %s\n", mainClass.numLen(valueForNumLen));

                    System.out.print("\nEnter value for Square method: ");
                    int valueForSquare = CycleInputInt("Enter the value for Square method:");
                    System.out.print("Square method result: \n");
                    mainClass.square(4);

                    System.out.print("\nEnter value for RightTriangle method: ");
                    int valueForRightTriangle = CycleInputInt("Enter the value for RightTriangle method:");
                    System.out.print("RightTriangle method result: \n");
                    mainClass.rightTriangle(4);
                    break;
                case 4:
                    System.out.print("\nEnter array size for FindFirst method: ");
                    int size = CycleInputInt("Enter the array size for FindFirst method:");
                    arrayForInput = new int[size];
                    for (int i = 0; i < arrayForInput.length; i++) {
                        System.out.printf("Enter the value №%d for FindFirst method: ", i + 1);
                        arrayForInput[i] = CycleInputInt(String.format("Enter the value №%d for FindFirst method:", i + 1));
                    }
                    System.out.print("\nEnter the number for searching for FindFirst method: ");
                    int num = CycleInputInt("Enter the number for searching for FindFirst method:");
                    System.out.printf("\nFindFirst method result: %d", mainClass.findFirst(arrayForInput, num));

                    System.out.print("\nEnter array size for MaxAbs method: ");
                    size = CycleInputInt("Enter the array size for MaxAbs method:");
                    arrayForInput = new int[size];
                    for (int i = 0; i < arrayForInput.length; i++) {
                        System.out.printf("Enter the value №%d for MaxAbs method: ", i + 1);
                        arrayForInput[i] = CycleInputInt(String.format("Enter the value №%d for MaxAbs method:", i + 1));
                    }
                    System.out.printf("\nFindFirst method result: %d", mainClass.maxAbs(arrayForInput));

                    System.out.print("\nEnter first array size for Add method: ");
                    size = CycleInputInt("Enter the first array size for Add method:");
                    arrayForInput = new int[size];
                    for (int i = 0; i < arrayForInput.length; i++) {
                        System.out.printf("Enter the value №%d for array №1 for Add method: ", i + 1);
                        arrayForInput[i] = CycleInputInt(String.format("Enter the value №%d for array №1 for Add method:", i + 1));
                    }
                    System.out.print("\nEnter second array size for Add method: ");
                    size = CycleInputInt("Enter the second array size for Add method:");
                    int[]arrayForInput2 = new int[size];
                    for (int i = 0; i < arrayForInput.length; i++) {
                        System.out.printf("Enter the value №%d for array №2 for Add method: ", i + 1);
                        arrayForInput2[i] = CycleInputInt(String.format("Enter the value №%d for array №2 for Add method:", i + 1));
                    }
                    System.out.print("\nEnter the number for gluing arrays: ");
                    num = CycleInputInt("Enter the number for gluing arrays:");
                    System.out.print("Add method result: ");
                    arrayTesting = mainClass.add(arrayForInput, arrayForInput2, num);
                    for (int i = 0; i < arrayTesting.length; i++)
                        System.out.print(arrayTesting[i] + " ");

                    System.out.print("\nEnter first array size for ReverseBack method: ");
                    size = CycleInputInt("Enter the array size for ReverseBack method:");
                    arrayForInput = new int[size];
                    for (int i = 0; i < arrayForInput.length; i++) {
                        System.out.printf("Enter the value №%d for ReverseBack method: ", i + 1);
                        arrayForInput[i] = CycleInputInt(String.format("Enter the value №%d for ReverseBack method:", i + 1));
                    }
                    System.out.print("\nReverseBack method result: ");
                    arrayTesting = mainClass.reverseBack(arrayForInput);
                    for (int i = 0; i < arrayTesting.length; i++)
                        System.out.print(arrayTesting[i] + " ");

                    System.out.print("\nEnter first array size for FindAll method: ");
                    size = CycleInputInt("Enter the array size for FindAll method:");
                    arrayForInput = new int[size];
                    for (int i = 0; i < arrayForInput.length; i++) {
                        System.out.printf("Enter the value №%d for FindAll method: ", i + 1);
                        arrayForInput[i] = CycleInputInt(String.format("Enter the value №%d for FindAll method:", i + 1));
                    }
                    System.out.print("\n\"Enter the number for searching for FindAll method:");
                    num = CycleInputInt("Enter the number for searching for FindAll method:");
                    System.out.print("\nFindAll method result: ");
                    arrayTesting = mainClass.findAll(arrayForInput, num);
                    for (int i = 0; i < arrayTesting.length; i++)
                        System.out.print(arrayTesting[i] + " ");
                    break;
                case 0:
                    System.out.print("End of work");
                    workCondition = false;
                    break;
                default:
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

                    System.out.printf("\nFindFirst method result: %d\n", mainClass.findFirst(new int[]{1, 2, 3, 4, 2, 2, 5}, 2));
                    System.out.printf("MaxAbs method result: %s\n", mainClass.maxAbs(new int[]{1, -2, -7, 4, 2, 2, 5}));
                    System.out.print("Add method result: ");
                    arrayTesting = mainClass.add(new int[]{1, 2, 3, 4, 5}, new int[]{7, 8, 9}, 3);
                    for (int i = 0; i < arrayTesting.length; i++)
                        System.out.print(arrayTesting[i] + " ");
                    System.out.print("\nReverseBack method result: ");
                    arrayTesting = mainClass.reverseBack(new int[]{1, 2, 3, 4, 5});
                    for (int i = 0; i < arrayTesting.length; i++)
                        System.out.print(arrayTesting[i] + " ");
                    System.out.print("\nFindAll  method result: ");
                    arrayTesting = mainClass.findAll(new int[]{1, 2, 3, 8, 2, 2, 9}, 2);
                    for (int i = 0; i < arrayTesting.length; i++)
                        System.out.print(arrayTesting[i] + " ");
                    break;
            }
        }
    }
}