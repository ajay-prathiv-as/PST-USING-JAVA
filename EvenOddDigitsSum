import java.io.*;
import java.util.*;
class UserMainCode
{
    public int EvenOddDigitsSum(int input1, String input2)
    {
        // Read only region end
        int sum = 0;

        while (input1 > 0) {
            int digit = input1 % 10;

            if (input2.equalsIgnoreCase("odd") && digit % 2 != 0) {
                sum += digit;
            } 
            else if (input2.equalsIgnoreCase("even") && digit % 2 == 0) {
                sum += digit;
            }

            input1 = input1 / 10;
        }

        return sum;
    }
}
