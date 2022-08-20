import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter1 {

    /**
     * 1.16 Write a program to generate
     * addition and multiplication tables
     * for single-digit numbers.
     */

    public static void additionTable()
    {
        int sum;
        for (int i = 1; i < 10; i++){
            System.out.print("Addition table for " + i + " : ");
            for (int j = 1; j < 10; j++) {
                sum = i + j;
                if (sum < 10)
                    System.out.print(i + " + " + j + " = " + sum + "  ||| ");
                else
                    System.out.print(i + " + " + j + " = " + sum + " ||| ");
            }
            System.out.println("\n");
        }
    }

    public static void multiplicationTable()
    {
        int product;
        for (int i = 1; i < 10; i++){
            System.out.print("Multiplication table for " + i + " : ");
            for (int j = 1; j < 10; j++) {
                product = i * j;
                if (product < 10)
                    System.out.print(i + " * " + j + " = " + product + "  ||| ");
                else
                    System.out.print(i + " * " + j + " = " + product + " ||| ");
            }
            System.out.println("\n");
        }
    }

    /**
     * 1.17 Write two static methods.
     * The first should return the maximum
     * of three integers, and the second
     * should return the maximum of four
     * integers.
     * @params a, b, c, d
     * @return max
     */

    public static int maximumOfThree(int a, int b, int c)
    {
        if ( a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        return c;
    }

    public static int maximumOfFour(int a, int b, int c, int d)
    {
        int max = 0;
        int[] vector = new int[4];
        vector[0] = a;
        vector[1] = b;
        vector[2] = c;
        vector[3] = d;
        for (int i = 0; i < vector.length; i++)
            if (vector[i] > max)
                max = vector[i];
        return max;
    }

    /**
     * 1.18 Write a static method that
     * takes a year as a parameter and
     * returns true if the leap year,
     * and false otherwise.
     * @params year
     * @return boolean
     */

    public static boolean leapYear(int year)
    {
        if (year % 4 != 0)
            return false;
        else if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else return true;
    }

    /**
     * 1.19 Write a program to determine
     * all pairs of positive integers,
     * (a,b), such that a < b < 1000
     * and (a^2 + b^2 + 1) / (a*b)
     * is an integer.
     *
     * @params a, b
     * @return map
     */

    public static Map<Integer, Integer> pairOfNumbers(int a, int b)
    {
        Map<Integer, Integer> map = new HashMap<>();
        float relationship;
        for (int i = 1; i < a; i++)
            for (int j = 2; j < b; j++)
            {
                relationship = (float)(i * i + j * j + 1)/(i * j);
                if (relationship - (int)relationship == 0 && i < j) {
                    map.put(i, j);
                }
            }
        return map;
    }

    /**
     * 1.20 Write a method that prints the representation
     * of its integer parameter as a Roman numeral.
     * Thus, if the parameter is 1998, the output is
     * MCMXCVIII.
     *
     * @params number
     * @return string
     */

    public static String romanNumeral(int number)
    {
        int clone;
        String string ="";
        while (number != 0)
        {
            if (number / 1000 != 0)
            {
                for (int i = 0; i < number / 1000; i++)
                    string += "M";
                number %= 1000;
            }
            clone = number / 100;
            number %= 100;
            switch(clone)
            {
                case 1:
                {
                    string += "C";
                    break;
                }
                case 2:
                {
                    string += "CC";
                    break;
                }
                case 3:
                {
                    string += "CCC";
                    break;
                }
                case 4:
                {
                    string += "CD";
                    break;
                }
                case 5:
                {
                    string += "D";
                    break;
                }
                case 6:
                {
                    string += "DC";
                    break;
                }
                case 7:
                {
                    string += "DCC";
                    break;
                }
                case 8:
                {
                    string += "DCCC";
                    break;
                }
                case 9:
                {
                    string += "CM";
                    break;
                }
            }
            clone = number / 10;
            number %= 10;
            switch(clone)
            {
                case 1:
                {
                    string += "X";
                    break;
                }
                case 2:
                {
                    string += "XX";
                    break;
                }
                case 3:
                {
                    string += "XXX";
                    break;
                }
                case 4:
                {
                    string += "XL";
                    break;
                }
                case 5:
                {
                    string += "L";
                    break;
                }
                case 6:
                {
                    string += "LX";
                    break;
                }
                case 7:
                {
                    string += "LXX";
                    break;
                }
                case 8:
                {
                    string += "LXXX";
                    break;
                }
                case 9:
                {
                    string += "XC";
                    break;
                }
            }
            switch(number)
            {
                case 1:
                {
                    string += "I";
                    break;
                }
                case 2:
                {
                    string += "II";
                    break;
                }
                case 3:
                {
                    string += "III";
                    break;
                }
                case 4:
                {
                    string += "IV";
                    break;
                }
                case 5:
                {
                    string += "V";
                    break;
                }
                case 6:
                {
                    string += "VI";
                    break;
                }
                case 7:
                {
                    string += "VII";
                    break;
                }
                case 8:
                {
                    string += "VIII";
                    break;
                }
                case 9:
                {
                    string += "IX";
                    break;
                }
            }
            number /= 10;
        }
        return string;
    }

    /**
     * 1.21 Print numbers in brackets as follows[1][2][3]
     * Write a method that takes two parameters
     * howMany and lineLength. The method should print
     * out line numbers from 1 to howMany in the previous
     * format, but it should not output more than lineLength
     * characters on any one line. Should not start with [
     * if it cannot fit ]
     *
     * @param howMany, lineLength
     * @return line
     */

    public static String printLine(int howMany, int lineLength)
    {
        String string = "", word;
            for (int j = 1; j <= howMany; j++)
            {
                word = "[" + j +"]";
                if (string.length() + word.length() <= lineLength)
                {
                    string += word;
                }
                else return string;
            }
        return string;
    }

    /**
     * 1.22 In the following decimal arithmetic puzzle, each
     * of the ten different letters is assigned a digit.
     * Write a program that finds all possible solutions
     * (one of which is shown)
     *   MARK   A=1 W=2 N=3 R=4 E=5      9147
     * +ALLEN   L=6 K=7 I=8 M=9 S=0    +16632
     *  -----                           -----
     *  WEISS                           25800
     *
     * @return finalName
     */

    public static List<String> arithmeticPuzzle()
    {
        List<String> arrayList = new ArrayList<>();
        int firstNumber, secondNumber, finalNumber;

        for (firstNumber = 10; firstNumber < 100000; firstNumber++)
            for (secondNumber = 11; firstNumber + secondNumber < 100000; secondNumber++)
            {
                finalNumber = firstNumber + secondNumber;
                if (frequencyChecker(firstNumber, secondNumber, finalNumber) != null)
                    arrayList.add(frequencyChecker(firstNumber, secondNumber, finalNumber));
            }
        return arrayList;
    }

    /**
     * Function that checks if all digits are used in operations
     * and creates a favorable case.
     *
     * @params first, second, finalN
     * @return stringLast
     */

    public static String frequencyChecker(int first, int second, int finalN)
    {
        boolean flag = true;
        String string = "";
        String stringLast = "";
        int digit;
        Map<Integer, String> map = Stream.of(new Object[][] {
                { 1 , "A"},
                { 2 , "W"},
                { 3 , "N"},
                { 4 , "R"},
                { 5 , "E"},
                { 6 , "L"},
                { 7 , "K"},
                { 8 , "I"},
                { 9 , "M"},
                { 0 , "S"},
        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));
        int [] frequency = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while(finalN != 0)
        {
            digit = finalN % 10;
            frequency[digit]++;
            finalN /= 10;
            string += map.get(digit);
        }
        string += " = ";
        while(second != 0)
        {
            digit = second % 10;
            frequency[digit]++;
            second /= 10;
            string += map.get(digit);
        }
        string += " + ";
        while(first != 0)
        {
            digit = first % 10;
            frequency[digit]++;
            first /= 10;
            string += map.get(digit);
        }
        char character;
        for (int i = string.length()-1; i >= 0; i--)
        {
            character = string.charAt(i);
            stringLast = stringLast + character;
        }
        for (int counter = 0; counter < 10; counter++)
        {
            if (frequency[counter] == 0)
                return null;
        }
        if (flag == true)
        {
            return stringLast;
        }
        return null;
    }

    public static void main(String[] args) {
        additionTable();
        multiplicationTable();
        System.out.println(frequencyChecker(9147, 16653, 25800));
        List<String> arrayList = arithmeticPuzzle();
        System.out.println(arrayList);
        Scanner myObj = new Scanner(System.in);
        System.out.println(" Introduce numbers : ");
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();
        int d = myObj.nextInt();
        System.out.println(" Introduce year : ");
        int year = myObj.nextInt();
        System.out.println(" Introduce pair of numbers : ");
        int n1 = myObj.nextInt();
        int n2 = myObj.nextInt();
        System.out.println(" Introduce number for Romans : ");
        int number = myObj.nextInt();
        System.out.println(" Introduce how many numbers to print : ");
        int howMany = myObj.nextInt();
        System.out.println(" Introduce length of the line : ");
        int lineLength = myObj.nextInt();
        Map<Integer, Integer> map = pairOfNumbers(n1, n2);
        System.out.println(" Maximum of " + a + ", " + b + ", " + c +" : " + maximumOfThree(a, b, c));
        System.out.println(" Maximum of " + a + ", " + b + ", " + c + ", " + d + " : " + maximumOfFour(a, b, c, d));
        System.out.println(" Is " + year + " a leap year? " + leapYear(year));
        if (n1 > 999)
            System.out.println(" First number bigger than 999");
        else if (n2 > 1000)
            System.out.println(" Second number bigger than 1000");
        else if (n1 > n2)
            System.out.println(" First number bigger than the second");
        else
            System.out.println(" Print pairs : " + map);
        System.out.println("Number " + number + " is = " + romanNumeral(number));
        System.out.println("With length " + lineLength + " these numbers fit in one line " + printLine(howMany, lineLength));
    }
}