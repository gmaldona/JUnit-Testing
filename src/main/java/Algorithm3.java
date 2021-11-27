package main.java;

/**
 * A single LOC implementation of the Josephus-Problem.
 * @author  B. Tenbergen [bastian.tenbergen@oswego.edu]
 * @version 2018-11-18
 * @since   2010-05-26
 * @see     JosephusCircle
 */
public class Algorithm3 extends JosephusCircle {

	/**
	 * @see JosephusCircle 
	 */
	public Algorithm3(int p, int c, int i) {
		super(p, c, i);
	}

	/**
	 * @see JosephusCircle
	 */
	@Override
	public int algorithm() {
		this.lastManStanding = 1 + ((soldiers - 1) * count) % soldiers;
		return this.lastManStanding; 
	}

}
