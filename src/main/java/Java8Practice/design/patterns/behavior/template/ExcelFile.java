package Java8Practice.design.patterns.behavior.template;

public class ExcelFile extends DataProcessor {
	
	@Override
	public void read() {
		System.out.println("read data");
		
	}

	@Override
	public void process() {
	System.out.println("ProcessData");
	}
	
	public void perform() {
		System.out.println("preform");
	}

}
