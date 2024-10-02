package Java8Practice.features.lamda.real.world;

public class PreDefinedFunctionalInterfaceMain {

	public static void main(String[] args) {
		
		//consumer ineterface
		ConsumerDemo cd = new ConsumerDemo();
		//cd.accept(10);
		cd.GetAccept();
		cd.GetAcceptWithList();
		
		//predicate interface
		PredicateDemo pd = new PredicateDemo();
		//System.out.println(pd.test(10));
		pd.checkCOndition();
		pd.checkConditionList();
		
		//supplier interface
		SupplerDemo sd = new SupplerDemo();
		//System.out.println(sd.get());
		sd.getData();
		sd.getListData();
		
		TaxService ts = new TaxService();
		ts.toGetEmployees();

	}

}
