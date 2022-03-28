package easyproblems;

public class RomanToInteger {

    public int romanToInt(String s) {
        char[] letters = s.toCharArray();
        int index = 0;
        int result = 0;
        int n = letters.length;

        while (index < n) {
            if (index > n - 1) break;
            if (index == n - 1) {
                if (letters[index] == 'M') result += 1000;
                if (letters[index] == 'D') result += 500;
                if (letters[index] == 'C') result += 100;
                if (letters[index] == 'L') result += 50;
                if (letters[index] == 'X') result += 10;
                if (letters[index] == 'V') result += 5;
                if (letters[index] == 'I') result += 1;
                index++;
            } else {
                if (letters[index] == 'M') {
                    result += 1000;
                    index++;
                } else if (letters[index] == 'D') {
                    result += 500;
                    index++;
                } else if (letters[index] == 'C') {
                    if (letters[index + 1] == 'M') {
                        result += 900;
                        index += 2;
                    } else if (letters[index + 1] == 'D') {
                        result += 400;
                        index += 2;
                    } else {
                        result += 100;
                        index++;
                    }
                } else if (letters[index] == 'L') {
                    result += 50;
                    index++;
                } else if (letters[index] == 'X') {
                    if (letters[index + 1] == 'L') {
                        result += 40;
                        index += 2;
                    } else if (letters[index + 1] == 'C') {
                        result += 90;
                        index += 2;
                    } else {
                        result += 10;
                        index++;
                    }
                } else if (letters[index] == 'V') {
                    result += 5;
                    index++;
                } else if (letters[index] == 'I') {
                    if (letters[index + 1] == 'V') {
                        result += 4;
                        index += 2;
                    } else if (letters[index + 1] == 'X') {
                        result += 9;
                        index += 2;
                    } else {
                        result += 1;
                        index++;
                    }
                }
            }
        }

        return result;
    }
}
