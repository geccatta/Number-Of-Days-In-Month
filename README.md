# NumberOFDaysInMonth

This Java program calculates the number of days in a given month of a specified year. It takes into account leap years to ensure accurate results for the month of February.

## Usage

To use the `NumberOFDaysInMonth` program, you can compile and run the Java code. The main method includes examples that demonstrate how the program works.

## Functions

### `public static boolean isLeapYear(int year)`

Determines whether a given year is a leap year.

- **Parameters:**
  - `year`: An integer representing the year (1 <= year <= 9999).
- **Returns:**
  - `true` if the year is a leap year.
  - `false` otherwise.

### `public static int getDaysInMonth(int month, int year)`

Calculates the number of days in a given month of a specified year.

- **Parameters:**
  - `month`: An integer representing the month (1 <= month <= 12).
  - `year`: An integer representing the year (1 <= year <= 9999).
- **Returns:**
  - The number of days in the month.
  - `-1` if the input is invalid (month not in range 1-12 or year not in range 1-9999).

## Examples

The `main` method provides several examples to demonstrate the usage:

```java
public static void main(String[] args) {
    int result;
    result = getDaysInMonth(1, 2020);
    System.out.println(result); // Output: 31

    result = getDaysInMonth(2, 2020);
    System.out.println(result); // Output: 29

    result = getDaysInMonth(2, 2018);
    System.out.println(result); // Output: 28

    result = getDaysInMonth(-1, 2020);
    System.out.println(result); // Output: -1

    result = getDaysInMonth(12, 10000);
    System.out.println(result); // Output: -1
}
