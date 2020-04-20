import java.util.LinkedList;

/**
 * The interface to implement strategy pattern for EMA and SMA and provides further scalability
 * @author vj
 *
 */
public interface IMovingAverageStrategy {
	public Double calcMovingAverage(LinkedList<Double> values, Double value, Double currAverage);
	public String getName();
}
