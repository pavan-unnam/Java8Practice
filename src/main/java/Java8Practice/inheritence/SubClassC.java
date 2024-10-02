package Java8Practice.inheritence;

public class SubClassC extends SuperCLassC {
	
public static final String ACCESS = "ACCESS";
	
	public String name = "pavan";
	
	public static String number = "num";
	
	public final String naumber1 = "num1";
	
	private static final String ACCESS1 = "ACCESS";
	
	private String nam1 = "nam1";
	
	private static String name2 = "name2";
	
	private final String surName = "unnam";
	
	String lastName = "kumar";
	
	static String name3 = "name3";
	
	static final String name4 ="name4";
	
	final String name5 = "name5";
	
	protected static final String name6 = "name6";
	
	protected static  String name7 = "name7";
	
	protected final String name8 = "name8";
	
	protected  String name9 = "name9";
	
	
	@Override
	public void toPrintName()   {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c public void method");
		
	}
	
	@Override
	private void toGetName() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c private void method");
		
	}
	
	@Override
	void toFetchName() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c default void method");
	}
	
	@Override
	protected void showName() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c protected void method");
		
	}
	
	@Override
	public static void toGetData() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c public static void method");
		
	}
	
	@Override
	private static void toGetCall() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c priavte static void method");
		
	}
	
	@Override
	protected static void toGetDetails() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c protected static void method");
		
	}
	
	@Override
	static void toGet() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c default static void method");
		
	}
	
	@Override
	public static final void toGetNa() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c public static final void method");
		
	}
	
	@Override
	private static final void toGetPa() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c private static final void method");
		
	}
	
	@Override
	protected static final void toGetMa() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c protected static final void method");
		
	}
	
	@Override
	static final void toGetLa() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c default static final void method");
	}
	
	@Override
	public final void data() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c public  final void method");
		
	}
	
	@Override
	private final void dum() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c private  final void method");
		
	}
	
	@Override
	protected final void nut() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c protected  final void method");
	}
	
	@Override
	final void toRamt() {
		System.out.println(ACCESS);
		System.out.println(name);
		System.out.println(number);
		System.out.println(naumber1);
		System.out.println(ACCESS1);
		System.out.println(nam1);
		System.out.println(name2);
		System.out.println(surName);
		System.out.println(lastName);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println("default class c default  final void method");
	}
	
	
}

