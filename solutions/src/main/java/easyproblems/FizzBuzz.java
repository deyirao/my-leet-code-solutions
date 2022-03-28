package easyproblems;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int number = i + 1;

            if (number % 3 == 0 && number % 5 == 0) answer[i] = "FizzBuzz";
            else if (number % 5 == 0)               answer[i] = "Buzz";
            else if (number % 3 == 0)               answer[i] = "Fizz";
            else                                    answer[i] = String.valueOf(number);
        }

        return Arrays.asList(answer);
    }
}
