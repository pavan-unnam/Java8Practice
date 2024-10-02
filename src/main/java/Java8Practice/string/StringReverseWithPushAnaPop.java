package Java8Practice.string;

public class StringReverseWithPushAnaPop {
	static int top;
	static int size;
	static char[] strAsCHarArray;
	static String ch="";
	
	StringReverseWithPushAnaPop(int n)
	    {
	        top = -1;
	        size = n;
	        strAsCHarArray = new char[size];
	    }
	
	static void toReverseString(String name) {
		System.out.println("reverse String push and pop");
		for(int i = 0; i<name.length(); i++) {
			push(name.charAt(i));
		}
		
		for (int i = 0; i < name.length(); i++)
        {
             ch = (String) (ch+pop());
            
        }
		 System.out.println(ch);
	}

	private static char pop() {
		if (top < 0)
        {
        System.out.println("Stack Underflow");
        return 0;
        }
        else
        {
            char x = strAsCHarArray[top--];
            return x;
        }
	}

	private static void push(char charAt) {
		if (top >= size)
        {
        System.out.println("Stack Overflow");
        }
        else
        {
        	strAsCHarArray[++top] = charAt;
        }
	}

}
