package Java8Practice.string;

import java.sql.Timestamp;

public class StringReverseMain {

	public static void main(String[] args) {
		//string reverse chartAt
		System.out.println("starttime"+ new Timestamp(System.currentTimeMillis()));
		System.out.println(StringReverseWithCharAt.toReverseString("pavan"));
		System.out.println("endtime"+ new Timestamp(System.currentTimeMillis()));
		
		//string reverse with STringBuffer
		System.out.println("starttime"+ new Timestamp(System.currentTimeMillis()));
		System.out.println(StringReversWithStringBuffer.toReverseString("pavan"));
		System.out.println("endtime"+ new Timestamp(System.currentTimeMillis()));
		
		//String reverse with STringBuilder
		
		System.out.println("starttime"+ new Timestamp(System.currentTimeMillis()));
		System.out.println(ReverseStringWIthStringBuilder.toReverseString("pavan"));
		System.out.println("endtime"+ new Timestamp(System.currentTimeMillis()));
		
		//String reverse with Stack dataStructure
		
		System.out.println("starttime"+ new Timestamp(System.currentTimeMillis()));
		System.out.println(ReverseStringWithStack.toReverseString("pavan"));
		System.out.println("endtime"+ new Timestamp(System.currentTimeMillis()));
		
		// String reverse with byteArray

		System.out.println("starttime" + new Timestamp(System.currentTimeMillis()));
		System.out.println(ReverseStringWithBytes.toReverseString("pavan"));
		System.out.println("endtime" + new Timestamp(System.currentTimeMillis()));

		// String reverse with char array

		System.out.println("starttime" + new Timestamp(System.currentTimeMillis()));
		ReverseStringWithCharArray.toReverseString("pavan");
		System.out.println("endtime" + new Timestamp(System.currentTimeMillis()));
		
		// String reverse with left index and right index

		System.out.println("starttime" + new Timestamp(System.currentTimeMillis()));
		StringReverseWithSwapinLeftIndexAndRightIndex.toReverseString("pavan");
		System.out.println("endtime" + new Timestamp(System.currentTimeMillis()));
		
		// String reverse with left index and right index
		System.out.println("starttime" + new Timestamp(System.currentTimeMillis()));
		ReversStringWithArrayList.toReverseString("pavan");
		System.out.println("endtime" + new Timestamp(System.currentTimeMillis()));
		
		// String reverse with left index and right index
		String name = "pavan";
		StringReverseWithPushAnaPop pp = new StringReverseWithPushAnaPop(name.length());
		StringReverseWithPushAnaPop.toReverseString(name);

	}

}
