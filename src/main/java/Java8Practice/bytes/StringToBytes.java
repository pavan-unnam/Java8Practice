package Java8Practice.bytes;

import java.io.UnsupportedEncodingException;

public class StringToBytes {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String data = "{\"requestID\":\"df_creator_user\",\"user\":\"df_test_user\",\"timeStamp\":234678,\"actionType\":\"deletion\",\"results\":[{\"recordUUID\":\"dft_test\",\"status\":\"10/30/2021\",\"additionalInfo\":{\"deletion_file\":\"test.csv\",\"deleted_date\":\"10/30/2021\"}}]}";
		data.indexOf("{");
		String json = data.substring(data.indexOf("{"), data.length());
		String s = "true";
		Boolean.valueOf(s);
	}

}
