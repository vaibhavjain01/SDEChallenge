import java.util.LinkedList;

/**
 * The class that handles calculation of Simple Moving Average
 * @author vj
 *
 */
public class SMAStrategy implements IMovingAverageStrategy {
	private String name;
	
	public SMAStrategy() {
		name = "SMA";
	}
	
	@Override
	public Double calcMovingAverage(LinkedList<Double> values, Double value, Double currAverage) {
		Double avg = (currAverage * values.size() + value) / (values.size() + 1);
		return avg;
	}
	
	public String getName() {
		return name;
	}
}
