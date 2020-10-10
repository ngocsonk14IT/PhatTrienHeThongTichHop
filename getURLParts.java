package lab2;

import java.net.MalformedURLException;
import java.net.URL;
public class getURLParts {
public static void main(String[] args)
{
try
{
URL u = new URL("https://www.google.com/search?q=url&oq=url&aqs=chrome..69i57j69i60l3j0l3.29222j0j4&sourceid=chrome&ie=UTF-8");
System.out.println("URL is "+u);
System.out.println("The protocol part is "+u.getProtocol());
System.out.println("The host part is "+u.getHost());
System.out.println("The file part is "+u.getFile());
System.out.println("The reference part is "+u.getRef());
}
catch(MalformedURLException e)
{
System.err.println(e);
}
}
}
