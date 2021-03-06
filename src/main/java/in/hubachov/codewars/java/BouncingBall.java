package in.hubachov.codewars.java;

/**
 * A child plays with a ball on the nth floor of a big building. The height of this floor is known:

 (float parameter "h" in meters, h > 0) .

 He lets out the ball. The ball rebounds for example to two-thirds:

 (float parameter "bounce", 0 < bounce < 1)

 of its height.

 His mother looks out of a window that is 1.5 meters from the ground:

 (float parameters window < h).

 How many times will the mother see the ball either falling or bouncing in front of the window

 (return a positive integer unless conditions are not fulfilled in which case return -1) ?

 Note

 You will admit that the ball can only be seen if the height of the rebouncing ball is stricty greater than the window
 parameter.

 Example:

 h = 3, bounce = 0.66, window = 1.5, result is 3

 h = 3, bounce = 1, window = 1.5, result is -1

 * Created by Sashko on 6/15/17.
 */
public class BouncingBall {
/*
	public static int bouncingBall(double h, double bounce, double window) {
		if (h > 0 && 0 < bounce && bounce < 1 && window < h)
			return 1 + 2 * (int) Math.floor(Math.log(window / h) / Math.log(bounce));
		else
			return -1;
	}
*/
	public static int bouncingBall(double h, double bounce, double window) {
		if (bounce >= 1.0 || window == h || h < 0.0 || bounce < 0.0) {
			return -1;
		}
		int result = -1;
		do {
			result+=2;
			h *= bounce;
		}while (h > window);
		return result;
	}

}
