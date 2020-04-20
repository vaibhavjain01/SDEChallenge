
/**
 * The concrete class that extends the abstract data structure class.
 * It overwrites the display to be handled according to client requirements.
 * @author vj
 *
 */
public class MovingAverageDS extends AbsMovingAverage {
	
	public MovingAverageDS(IMovingAverageStrategy strategy) {
		super(strategy);
	}
	
	public MovingAverageDS(IMovingAverageStrategy strategy, int smoothing) {
		super(strategy, smoothing);
	}
	
	public void displayMovingAverage() {
		System.out.println("Moving Average = " + getMovingAverage());
		System.out.println("Strategy Used = " + getStrategy().getName());
		System.out.println("Values used for calculation: ");
		dispValues();
	}
}
