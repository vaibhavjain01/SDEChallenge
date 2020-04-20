/**
 * Application class to run sample executions
 * @author vj
 *
 */
public class Main {

	public static void main(String[] args) {
		IMovingAverageStrategy SMA = new SMAStrategy();
		IMovingAverageStrategy EMA = new EMAStrategy();
		
		MovingAverageDS obj = new MovingAverageDS(SMA);
		obj.addValue(1.2640);
		obj.addValue(1.2641);
		obj.addValue(1.2642);
		obj.addValue(1.2641);
		obj.displayMovingAverage();
		System.out.println();
		MovingAverageDS obj2 = new MovingAverageDS(EMA, 2);
		obj2.addValue(1.5554);
		obj2.addValue(1.5555);
		obj2.addValue(1.5558);
		obj2.addValue(1.5560);
		obj2.displayMovingAverage();
	}

}
