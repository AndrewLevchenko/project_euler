package ru.AndrewLevchenko;

public class problem_12 {

	private static long Triangle_number(long k) {
		return (k * (k + 1) / 2);
	}

	public static void main(String[] args) {

		var prime_gen = new Prime_generator();

		long left_limit = 2 * 2 * 2 * 2 * 2 * 2 * 2 * 3 * 3 * 3 * 5 * 7 * 11 * 13L;

		for (long i = Math.round(Math.sqrt(2 * left_limit));; i++) {
			prime_gen.reboot();
			var triangle = Triangle_number(i);
			var tria = triangle;
			int multiplier = 1;
			int counter = 0;

			var the_prime = prime_gen.give_next();
			for (; tria > 1; the_prime = prime_gen.give_next()) {

				while (tria % the_prime == 0) {
					counter++;
					tria = tria / the_prime;
				}
				multiplier = multiplier * (counter + 1);
				counter = 0;
			}

			if (multiplier >= 500) {
				System.out.println(triangle + " is a winner with " + multiplier + " multipliers\n");
				break;
			}
			;

		}

	}

}
