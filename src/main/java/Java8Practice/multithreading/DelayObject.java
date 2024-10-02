package Java8Practice.multithreading;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

import com.google.common.primitives.Ints;

public class DelayObject implements Delayed {
    private String data;
    private long startTime;

    public DelayObject(String data, long delayInMilliseconds) {
        this.data = data;
        this.startTime = System.currentTimeMillis() + delayInMilliseconds;
    }

	@Override
	public int compareTo(Delayed o) {
		return Ints.saturatedCast(
			      this.startTime - ((DelayObject) o).startTime);
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long diff = startTime - System.currentTimeMillis();
	    return unit.convert(diff, TimeUnit.MILLISECONDS);
	}
}
