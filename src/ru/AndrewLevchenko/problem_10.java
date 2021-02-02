package ru.AndrewLevchenko;

/*Problem:
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.

Note: run as "java -cp ./..../ru.AndrewLevchenko.problem_10"
*/





public class problem_10 {

	public static void main(String[] args) {
		int limit = 2000000;
		boolean[] not_a_prime = new boolean[limit + 1];
		long sum = 0;

		for (int i = 4; i < limit; i += 2)
			not_a_prime[i] = true;

		for (int i = 3; i < limit; i += 2)
			if (not_a_prime[i] == false)
				for (int j = 2 * i; j < limit; j += i)
					not_a_prime[j] = true;

		for (int i = 2; i < limit; i++)
			if (not_a_prime[i] == false) {
				// System.out.println("Prime:" + i);
				sum += i;
			}

//		primes.add(2L);фыа
//		int sizeoflist = 1;
//		Long i = 3L;
//		long sum = 2;
//		boolean prime_flag;
//
//		while (primes.get(sizeoflist - 1) < 2000000) {
//
//			prime_flag = true;
//			for (Long curr_prime : primes) {
//				if ((i % curr_prime) != 0) {
//					continue;
//				} else {
//					prime_flag = false;
//					break;
//				}
//
//			}
//
//			if (prime_flag) {
//				primes.add(i);
//
//				// System.out.println("Current prime is " + primes.lastElement() + "\n");
//				sum += primes.get(sizeoflist - 1);
//				sizeoflist++;
//			}
//
//			i += 2;
//
//		}
//
//		sum = sum - primes.get(sizeoflist - 1);
//
		System.out.println("Sum of primes less than 2000000 is " + sum + "\n");
	}
}
