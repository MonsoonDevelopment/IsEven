package wtf.monsoon.util;

public class IsEven {
    public static boolean isEven(int number) {
          return (number % 2 == 0); //Or: (number & 1) == 0
    }
}
