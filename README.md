# My-Leet-Code-Solutions
A collection of solutions for LeetCode problems that I solved by myself.

### Coding Information
* Used programming language is Java 16.
* Code only includes the solution of the task, **not** the task itself.
* IntelliJ Idea's default coding style is used.
* The solutions were accepted by the LeetCode tests.
* No tests were written.

### Example: Solution for "FizzBuzz"
```ChucK
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
```

~ author Deyi Rao
