public class Operators {
    public static void main(String[] args) {
        //Arithmetic operator
        double a = 12, b = 7, c = 24;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println(10*40/5+7-3*8/2);
        System.out.println("c++ = " + (c++));
        System.out.println("++c = " + (++c));

        //Assignment operator(unary)
        int d = 4, var;
        var = d;
        System.out.println("var using =: " + var);

        var += d;
        System.out.println("var using +=: " + var);

        var -= d;
        System.out.println("var using -=: " + var);

        var *= d;
        System.out.println("var using *=: " + var);

        var /= d;
        System.out.println("var using /=: " + var);

        var %= d;
        System.out.println("var using %=: " + var);

        //Relational operator
        int var1 = 5, var2 = 9;
        System.out.println("var1 = " + var1 + ", var2 = " + var2);

        System.out.println("var1 == var2: " + (var1 == var2));  // false
        System.out.println("var1 != var2: " + (var1 != var2));  // true
        System.out.println("var1 > var2: " + (var1 > var2));  // false
        System.out.println("var1 < var2: " + (var1 < var2));  // true
        System.out.println("var1 >= var2: " + (var1 >= var2));  // false
        System.out.println("var1 <= var2: " + (var1 <= var2));  // true

        //Logical operator
        System.out.println((7 > 5) && (8 > 5));  // true
        System.out.println((5 > 4) && (6 < 5));  // false

        System.out.println((9 < 8) || (7 > 6));  // true
        System.out.println((9 > 8) || (7 < 6));  // true
        System.out.println((9 < 8) || (7 < 6));  // false

        System.out.println(!(6 == 5));  // true
        System.out.println(!(6 > 5));  // false

        //Increment/Decrement operator (unary)
        int x = 12, y = 17;
        boolean z = true;

        System.out.println(x++);   //12
        System.out.println(++x);   //14
        System.out.println(x++ + ++x);   //30

        System.out.println(y++);   //17
        System.out.println(++y);   //19
        System.out.println(y++ + ++y);  //40

        System.out.println(!z);   //false

        //Bitwise operator
        int num1 = 12, num2 = 25;

        System.out.println(num1 | num2);   //OR 00001100 | 00011001 = 00011101 (29)
        System.out.println(num1 & num2);   //AND 00001100 & 00011001 = 00001000 (8)
        System.out.println(num1 ^ num2);   //XOR 00001100 | 00011001 = 00010101 (21)
        System.out.println(~num2);   //bitwise complement (-26)

        //Ternary operator
        int days = 29;
        String result;
        result = (days == 28) ? "It is not a leap year" : "It is a leap year";
        System.out.println(result);

        //Shift operator
        int number1 = 12, number2 = 25;
        System.out.println("number1 << 2: " +(number1 << 2));   //2 bit signed left shift (48)
        System.out.println("number2 << 2: " +(number2 << 2));   //100

        System.out.println("number1 >> 2: " +(number1 >> 2));   //2 bit signed right shift 3
        System.out.println("number2 >> 2: " +(number2 >> 2));   //6

        System.out.println("number1 >>> 2: " +(number1 >>> 2));   //unsigned right shift (3)
        System.out.println("number2 >>> 2: " +(number2 >>> 2));   //6
        int number3 = -8;
        System.out.println("number3 << 2: " +(number3 << 2));   //-32
        System.out.println("number3 >> 2: " +(number3 >> 2));   //-2
        System.out.println("number3 >>> 2: " +(number3 >>> 2));   //1073741823

        System.out.println("number1 <<= 2: " +(number1 <<= 2));
        System.out.println("number1 >>= 2: " +(number1 >>= 2));
        System.out.println("number1 &= 2: " +(number1 &= 2));
        System.out.println("number1 ^= 2: " +(number1 ^= 2));
        System.out.println("number1 |= 2: " +(number1 |= 2));

    }
}
