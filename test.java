package javademo;

 


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

 

 

public class restapi {
    
    public static void main(String[] args) throws IOException {
        
        URL obj = new URL ("http://23.251.159.27:8080/job/demo/build");
        String user = "anil"; 
        String pass = "115d72c061245c77642a9a0eb23f5bf2f5"; 
        String authStr = user + ":" + pass;
        String encoding = Base64.getEncoder().encodeToString(authStr.getBytes("utf-8"));
           
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        con.setRequestProperty("Authorization", "Basic " + encoding);
        System.out.println("Done :: "+con.getResponseCode());
        con.disconnect();
        
    }
    
    

 

}
