import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class googlevisionapi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 final String TARGET_URL = "https://vision.googleapis.com/v1/images:annotate?";
		 
		 final String API_KEY =   "key=/Users/kavyanshbansal/Desktop/json file/my-project-2869-356315-7da1a95a2759.json";
		
		 URL serverUrl = new URL(TARGET_URL + API_KEY);
	
		 HttpURLConnection httpConnection = (HttpURLConnection)serverUrl.openConnection(); 
		
	
		 httpConnection.setRequestMethod("POST");
		 httpConnection.setRequestProperty("Content-Type", "application/json");
		 httpConnection.setDoOutput(true);
	
	 
		 BufferedWriter httpRequestBodyWriter = new BufferedWriter(new
          
	     OutputStreamWriter(httpConnection.getOutputStream()));

//	    httpRequestBodyWriter.write("{\"requests\":  [{ \"features\":  [ {\"type\": \"LABEL_DETECTION\""
//            +"}], \"image\": {\"source\": { \"gcsImageUri\":"
//            +" \"gs://vision-sample-images/4_Kittens.jpg\"}}}]}");

		 
		 httpRequestBodyWriter.write("{\"requests\":  [{ \"features\":  [ {\"type\": \"LABEL_DETECTION\""
	             +"}], \"image\": {\"source\": { \"gcsImageUri\":"
	             +" \"gs://vision-sample-images/4_Kittens.jpg\"}}}]}");
		 
		 
		 
	   httpRequestBodyWriter.close();
	 
	 
	   String response = httpConnection.getResponseMessage();
	 
	
	
	
	if (httpConnection.getInputStream() == null) {
	    System.out.println("No stream");
	    return;
	}

	Scanner httpResponseScanner = new Scanner (httpConnection.getInputStream());
	
	String resp = "";
	
	while (httpResponseScanner.hasNext()) {
	    String line = httpResponseScanner.nextLine();
	    resp += line;
	    System.out.println(line);  //  alternatively, print the line of response
	}
	
	httpResponseScanner.close();
	}

}
