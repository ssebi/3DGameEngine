package base.engine;

/**
 * @author Sebastian
 *	This class is used to keep track of time(nano).
 */
public class Time {

	public static final long SECOND = 1000000000L;
	private static double delta;

	/**
	 * @return Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.
	 */
	public static long getTime() {
		return System.nanoTime();
	}

	/**
	 * @return Returns the difference of time between frames.
	 */
	public static double getDelta() {
		return delta;
	}

	public static void setDelta(double delta) {
		Time.delta = delta;
	}
}
