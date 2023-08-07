package RestAPI.RestAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Httpurlconnection {

	/*

	Steps to GET request:
	 1. Create Object for URL class
	 2. Open the URL connection and store it in its parent class
	 3. Set the Request Type
	 4. Connect
	 5. Get status code from the connection object and print
	 6. Get the response message and print
	 7. read the response using getInputStream
	 8. Create an input stream reader for reading the response body
	 9. Create a buffered reader and pass the input stream reader
	 10. read the lines using readline ()
	 11. So how long do we have to read the lines?
	     As long as teh lines are available in the response.
	So loop the read line action
	12. Create a String buffer and store the lines read inside the loop
	13. Finally print the buffer.

	*/


		
		public void getmenthod() throws IOException {
			
			URL url=new URL("https://reqres.in/api/users/2");
			HttpURLConnection connection=(HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			
			int statuscode=connection.getResponseCode();
			
			System.out.println("get a status code "+statuscode);
			
			String message=connection.getResponseMessage();
			System.out.println("GET A MESSAGE " + message);
			
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
		  
		  
// post request
		  
		  public void POSTREQUEST() throws IOException {

				URL url=new URL("https:/dummy.restapiexample.com/api/v1/create");
				HttpURLConnection connection=(HttpURLConnection)url.openConnection();
				connection.setRequestMethod("POST");
				

				connection.setRequestProperty("Content-Type", "application/json");
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
		  
		  
// put request 
		  
		  
		  public void PUTrequest() throws IOException {

				URL url=new URL("https://dummy.restapiexample.com/api/v1/update/26081");
				HttpURLConnection connection=(HttpURLConnection) url.openConnection();
				connection.setRequestMethod("PUT");


				connection.setRequestProperty("Content-Type", "application/json");
				connection.setDoInput(true);

				String   jsonbody="{\"name\":\"Agni3\", \"salary\": \"100000000\", \"age\": \"1\"}";

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
		  
		  
		  
		  
		  
		public static void main (String[]args)throws IOException
		{
			Httpurlconnection connectionexample=new Httpurlconnection();
	//		connectionexample.getmenthod();
			connectionexample.POSTREQUEST();
	//		connectionexample.PUTrequest();
		
		}
		}
		
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

