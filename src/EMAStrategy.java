import java.util.LinkedList;

/**
 * The class that handles calculation of Exponential Moving Average
 * @author vj
 *
 */
public class EMAStrategy implements IMovingAverageStrategy {
	private int smoothing;
	private String name;
	
	public EMAStrategy() {
		name = "EMA";
	}
	
	public void setSmoothing(int smoothing) {
		this.smoothing = smoothing;
	}
	@Override
	public Double calcMovingAverage(LinkedList<Double> values, Double value, Double currAverage) {
		int n = values.size() + 1;
		Double smoothingOverN = smoothing / (1.0 + n);
		Double avg = (value * smoothingOverN) + (currAverage * (1 - smoothingOverN));
		return avg;
	}
	
	public String getName() {
		return name;
	}
}
