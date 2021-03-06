package efficiency;

import java.time.Duration;
import java.time.Instant;

/**
 * SimpleTimeMeasurement class uses various approaches to measure the running
 * times
 * 
 * java.lang.System class currentTimeMillis() We get a timestamp at the start
 * and we get another timestamp when the code finished. Time elapsed is the
 * difference between these two values. However, the result may and will be
 * inaccurate as System.currentTimeMillis() measures wall-clock time. Wall-clock
 * time may change for many reasons, e.g. changing the system time can affect
 * the results or a leap second will disrupt the result.
 *
 * java.lang.System class nanoTime() nanoTime(), obviously, returns time in
 * nanoseconds. To convert to milliseconds we must divide the result in
 * nanoseconds by 1.000.000. However, it does guarantee that the resolution will
 * be at least as good as that of currentTimeMillis().
 *
 * If we're using Java 8 ? we can try the new java.time.Instant and
 * java.time.Duration classes. The Instant class represents an instant on the
 * timeline. Basically, it is a numeric timestamp since the standard Java epoch
 * of 1970-01-01T00:00:00Z.
 * 
 * currentTimeMillis() should be used to measure wall-clock time, and 
 * nanoTime() should measure the program?s elapsed time. 
 * If the elapsed time is measured with System.currentTimeMillis(), 
 * the results might not be accurate.
 * Instant.now() internally use System.currentTimeMillis() and 
 * might not be the best solution to measure elapsed time.
 **/

/**
 * @author Zeynep Orhan
 *
 */
public class SimpleTimeMeasurementLong {
	public static final int O1 = 0;
	public static final int ON = 1;
	public static final int ON2 = 2;
	public static final int funcs[] = { O1, ON, ON2 };
	public static final String funcNames[] = { "O(1)", "O(N)", "O(N2)" };
	public static final long N_MAX = 100000;
	public static final long N_MULT = 3;
	public static final long N_START = 10;

	/**
	 * @param N    size
	 * @param func function to be applied
	 * @return the result of the func
	 */
	public static long selectFunc(long N, int func) {
		long res;
		switch (func) {
		case O1:
			res = funcOh1(N);
			break;
		case ON:
			res = funcOhN(N);
			break;
		case ON2:
			res = funcOhN2(N);
			break;
		default:
			res = 0;
		}
		return res;
	}

	/**
	 * @param N    size
	 * @param func function to be applied
	 */
	public static void measureCTM(long N, int func) {
		long start = System.currentTimeMillis();
		selectFunc(N, func);
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.print(String.format("%15d ", (1000000 * timeElapsed)));
	}

	/**
	 * @param N    size
	 * @param func function to be applied
	 */
	public static void measureNanoT(long N, int func) {
		long start = System.nanoTime();
		selectFunc(N, func);
		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		System.out.print(String.format("%15d ", timeElapsed));

	}

	/**
	 * @param N    size
	 * @param func function to be applied
	 * 
	 */
	public static void measureInstant(long N, int func) {
		Instant start = Instant.now();
		selectFunc(N, func);
		Instant finish = Instant.now();
		Duration duration = Duration.between(start, finish);
		long timeElapsed = duration.toNanos();
		System.out.print(String.format("%15d ", timeElapsed));

	}

	/**
	 * @param N
	 * @return sum of the numbers up to N by formulae
	 */
	public static long funcOh1(long N) {
		return (N * (N + 1) / 2);
	}

	/**
	 * @param N
	 * @return sum of the numbers up to N by single for loop
	 */
	public static long funcOhN(long N) {
		long res = 0;
		for (long i = 1; i <= N; i++)
			res += i;
		return res;
	}

	/**
	 * @param N
	 * @return sum of the numbers up to N by nested for loop
	 */
	public static long funcOhN2(long N) {
		long res = 0;
		for (long i = 1; i <= N; i++)
			for (long j = 1; j <= i; j++)
				res += 1;
		return res;
	}

	public static void main(String[] args) {
		long N = 1;

		System.out.println("\n===========================================\n");
		System.out.println("\nMeasurement used:System.currentTimeMillis()\n");
		System.out.println(String.format("%15s %15s %15s %15s", "N", "O(1)", "O(N)", "O(N2)"));
		for (N = N_START; N <= N_MAX; N *= N_MULT) {
			System.out.print(String.format("%15d ", N));
			for (int i = 0; i < funcs.length; i++) {
				measureCTM(N, i);
			}
			System.out.println();
		}

		System.out.println("\n===========================================\n");
		System.out.println("\nMeasurement used:System.nanoTime()\n");
		System.out.println(String.format("%15s %15s %15s %15s", "N", "O(1)", "O(N)", "O(N2)"));
		for (N = N_START; N <= N_MAX; N *= N_MULT) {
			System.out.print(String.format("%15d ", N));
			for (int i = 0; i < funcs.length; i++) {
				measureNanoT(N, i);
			}
			System.out.println();
		}

		System.out.println("\n===========================================\n");
		System.out.println("\nMeasurement used:Instant.now()\n");
		System.out.println(String.format("%15s %15s %15s %15s", "N", "O(1)", "O(N)", "O(N2)"));
		for (N = N_START; N <= N_MAX; N *= N_MULT) {
			System.out.print(String.format("%15d ", N));
			for (int i = 0; i < funcs.length; i++) {
				measureInstant(N, i);
			}
			System.out.println();
		}

	}
}