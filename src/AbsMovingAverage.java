import java.util.LinkedList;

/**
 * The abstract class to provide default functionality of handling new elements and calculation of 
 * averages based on provided strategy.
 * The main purpose is to hide the implementation from application class, by making this class as
 * package private and making only concrete class available.
 * @author vj
 *
 */
public abstract class AbsMovingAverage implements IMovingAverageDS {
	private LinkedList<Double> values;
	private IMovingAverageStrategy strategy;
	private Double currAverage;
	
	/**
	 * Constructor for Simple Moving Average
	 * @param strategy
	 */
	public AbsMovingAverage(IMovingAverageStrategy strategy) {
		values = new LinkedList<Double>();
		this.strategy = strategy;
		currAverage = 0.0;
	}
	
	/**
	 * Constructor for Exponential Moving Average
	 * @param strategy
	 * @param smoothing
	 */
	public AbsMovingAverage(IMovingAverageStrategy strategy, int smoothing) {
		values = new LinkedList<Double>();
		currAverage = 0.0;
		this.strategy = strategy;
		((EMAStrategy)(this.strategy)).setSmoothing(smoothing);
	}
	
	public void addValue(Double value) {
		this.currAverage = this.strategy.calcMovingAverage(values, value, currAverage);
		this.values.add(value);
	}
	
	public Double getMovingAverage() {
		return currAverage;
	}
	
	/**
	 * Abstract function to handle display in concrete class
	 */
	public abstract void displayMovingAverage();
	
	public IMovingAverageStrategy getStrategy() {
		return strategy;
	}
	
	/**
	 * Default implementation of display of all values
	 */
	public void dispValues() {
		for(int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i) + ", ");
		}
	}
}
