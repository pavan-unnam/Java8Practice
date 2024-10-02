package Java8Practice.features.lamda;
//public class CalculatorImpl implements Calculator { tradition format
public class CalculatorImpl {

	
	// trditionaly override the abstart method into class
	/*
	 * @Override public void switchOn() { 
	 * 
	 * }
	 */
	//'()'- parameters '->' lamda symbol { 'body' }
	//zero pararemeters lamda
	public void calculate () {
		Calculator cal = ()->System.out.println("lamda expression  implementation");
		cal.switchOn();
	}
	
	// with single parameters
	public void perform() {
		Perform per = (input)->{System.out.println("Sum : " + input);};
		per.sum(10);
	}
	
	public void performWithReturnType() {
		ReturnTypeMultiArg rtmg = (i1, i2)->{return i1+i2;};
		rtmg.sum(10, 11);
	
	}
	
	public void performWithReturnTypeMultiArg() {
		ReturnTypeMultiArg rtmg = (i1, i2)->i1+i2;
		rtmg.sum(10, 11);
		
		ReturnTypeMultiArg rt = (i1, i2)->{
			if(i2>i1) {
				return i2-i1;
			} else {
				return i2+i1;
			}
		};
		rtmg.sum(10, 11);
	
	}
	
	

}
