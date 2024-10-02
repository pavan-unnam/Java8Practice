package Java8Practice.design.patterns.behavior.template;

public class TextFile extends DataProcessor {

	@Override
	public void read() {
		System.out.println("read data");
		
	}

	@Override
	public void process() {
	System.out.println("ProcessData");
	}

}
