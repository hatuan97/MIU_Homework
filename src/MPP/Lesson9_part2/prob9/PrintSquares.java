package MPP.Lesson9_part2.prob9;

import java.util.stream.IntStream;

public class PrintSquares {
    public static void printSquares(int num) {
        IntStream.iterate(1, i -> i + 1)  // Start from 1 and increment by 1
                .map(i -> i * i)          // Compute the square of each number
                .limit(num)               // Limit the stream to 'num' elements
                .forEach(System.out::print);  // Print each square
    }

    public static void main(String[] args) {
        int num = 4;
        printSquares(num);
    }
}
