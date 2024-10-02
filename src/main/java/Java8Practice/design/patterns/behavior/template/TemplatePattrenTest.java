package Java8Practice.design.patterns.behavior.template;

public class TemplatePattrenTest {

	public static void main(String[] args) {
		DataProcessor obj = new TextFile();
		obj.readAndProcessAndSave();
		
		obj = new ExcelFile();
		obj.readAndProcessAndSave();
	}

}
