package com.epam.langSyntax;

public class NumberReverter {

    int reverse = 0;
    public void revert(int number) {
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
    }

}

