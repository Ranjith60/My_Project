package RestAPI.RestAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class POSTrequest {


	public void POSTREQUEST() throws IOException {

		URL url=new URL("https://reqres.in/api/users/2");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");


		connection.setRequestProperty("content-type", "application/json");
		connection.setDoInput(true);

		String   jsonbody="{\"name\": \"Agniprasath123\", \"salary\": \"100000000\", \"age\": \"1\"}";

		byte[]inputjson=  jsonbody.getBytes();


		OutputStream outstream= connection.getOutputStream();

		outstream.write(inputjson);

		System.out.println("response code :" + connection.getResponseCode());
		System.out.println("response message : " + connection.getResponseMessage());

		InputStream instInputStream=connection.getInputStream();
		InputStreamReader inputStreamReader=new InputStreamReader(instInputStream);

		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedReader.readLine())!= null)
		{

			buffer.append(line) ;

		}
		System.out.println(buffer);	


	}

          public static void main(String[]args) throws IOException {
        	  Httpurlconnection connection=new Httpurlconnection();  
        	  connection.POSTREQUEST();
          }
          
	
}


