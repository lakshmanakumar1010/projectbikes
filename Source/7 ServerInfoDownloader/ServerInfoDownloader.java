import java.io.*;
import java.net.*;
import java.util.*;

public class ServerInfoDownloader
{
public static void main(String[] args) 
{
try
{
            // Set the URL of another server
URL url = new URL("https://www.w3schools.com/java/");

            // Download the homepage of the server
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setRequestMethod("GET");

            // Display the contents of homepage with date, content type, and expiration date
System.out.println("Date: " + new Date(connection.getDate()));
System.out.println("Content Type: " + connection.getContentType());
System.out.println("Expiration Date: " + new Date(connection.getExpiration()));
System.out.println("Last Modified: " + new Date(connection.getLastModified()));
System.out.println("Content Length: " + connection.getContentLength());

            // Read and display the content of the homepage
BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
while ((line = reader.readLine()) != null) 
            {
System.out.println(line);
            }
reader.close();
connection.disconnect();
} 
catch (MalformedURLException e) 
{
e.printStackTrace();
} 
catch (IOException e) 
{
e.printStackTrace();
}
}
}
