package ru.AndrewLevchenko;

/*Problem:
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

Note: run as "java -cp ./..package folder../ru.AndrewLevchenko.problem_1 1000 3 5"
*/


import java.util.stream.Stream;

public class problem_1 {
    public static void main(String[] args) {
        long limit = Long.parseLong(args[0]);
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        //Stream API implementation O(n)
        System.out.println(
                Stream.iterate(1,(i)->i+1).
                limit(limit).filter((i)->((i%a)==0 || (i%b)==0)).
                reduce(0,(i,j)->i+j)
        );
        //O(1) implementation
        System.out.println(a*(limit/a)*(limit/a+1)/2+b*(limit/b)*(limit/b+1)/2-a*b*(limit/(a*b))*(limit/(a*b)+1)/2);
    }
}
