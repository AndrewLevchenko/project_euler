package ru.AndrewLevchenko;

public class Prime_generator {
	int prime_counter;
	int limits;
	int pointer;
	long[] primes;

	Prime_generator() {
		pointer = 0;
		limits = 2000000;
		primes = find_primes(limits);
	}

	long[] give_array(int start, int end) {

		if (end > prime_counter) {
			do {
				System.out.println("RESIZING");
				limits *= 2;
				primes = find_primes(limits);
			} while (prime_counter < end);
		}

		var answer = new long[end - start + 1];
		for (int i = start; i <= end; i++) {
			answer[i - start] = primes[i];
		}
		return answer;

	}

	long give_next() {

		if (pointer >= (prime_counter - 1)) {
			System.out.println("RESIZING");
			limits *= 2;
			primes = find_primes(limits);
		}

		return (primes[pointer++]);

	}

	long[] give_next(int v) {
		long[] answer = new long[v];
		for (int i = 0; i < v; i++) {
			answer[i] = give_next();
		}
		return answer;
	}

	void reboot() {
		pointer = 0;
	}

	private long[] find_primes(int limit) {

		prime_counter = 1;
		var not_a_prime = new boolean[limit + 1];

		for (int i = 4; i < limit; i += 2)
			not_a_prime[i] = true;

		for (int i = 3; i < limit; i += 2)
			if (not_a_prime[i] == false) {
				prime_counter++;
				for (int j = 2 * i; j < limit; j += i)
					not_a_prime[j] = true;
			}

		var primes = new long[prime_counter];

		int cur_prime_counter = 0;
		for (int i = 2; cur_prime_counter < prime_counter; i++)
			if (not_a_prime[i] == false) {
				primes[cur_prime_counter] = i;
				cur_prime_counter++;
			}

		return primes;
	}

}
