
import java.util.*;

public class Segmented_Sieve {

	static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sieve();
		int T = sc.nextInt();
		while (T-- > 0) {
			long L = sc.nextLong(), R = sc.nextLong();
			if (L == 1)
				L++;

			int primeArr[] = new int[(int) (R - L + 1)];

			for (int p : primes) {
				if (p * p <= R) {
					long i = (L / p) * p;
					if (i < L) {
						i += p;
					}
					for (; i <= R; i += p) {
						if (i != p)
							primeArr[(int) (i - L)] = 1;
					}
				}
			}
			for (int i = 0; i < (int) (R - L + 1); i++) {
				if (primeArr[i] == 0)
					System.out.println((i + L) + " ");
			}

			System.out.println();
		}

	}

	private static void sieve() {
		// TODO Auto-generated method stub
		int max = 100001;
		int arr[] = new int[max];
		arr[1] = 1;
		for (int i = 2; i * i < max; i++) {
			if (arr[i] == 0) {
				for (int j = i * i; j < max; j += i) {
					arr[j] = 1;
				}
			}
		}

		for (int i = 1; i < max; i++) {
			if (arr[i] == 0) {
				primes.add(i);
			}
		}

	}

}
