
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Code given to us for the assignment to handle the server.  
 * This server will respond to the clients to give them
 * domain name information.
 * @author Jesse
 * @date October 6, 2014
 */
public class NameServer {
    
    public static void main(String[] args)
    {
        
        int count;
        Hashtable nameStore = new Hashtable();
        String messageRead = "";
        String hostName = "";
        // Set up name database, normally this ould be done in a much
        // more sophisticated way.
        nameStore.put("OU","www.open.ac.uk");
        nameStore.put("Which","www.which.co.uk");
        nameStore.put("Driver","driver.co.uk");
        nameStore.put("Sears stores", "Sears.co");
        nameStore.put("MarksandSpencers","MandS.co.uk");
        System.out.println("Starting the name server...");
        try
        {
            ServerSocket ss = new ServerSocket(1024);
            count=1;
            // Set upt the streams which the clients will access
            Socket sock = ss.accept();
            InputStream is  = sock.getInputStream();
            BufferedReader bf = new BufferedReader(new InputStreamReader(is));
            OutputStream os = sock.getOutputStream();
            PrintWriter pw = new PrintWriter(os,true);
            while(true)
            {
                System.out.println("Serviced connection "+count);
                //Read name request
                messageRead = bf.readLine();
                hostName = (String)nameStore.get(messageRead);
                if(hostName == null)
                {
                    //Invalid name provided
                    hostName = "Host not found";
                }
                //send back host name or error messgae to client
                pw.println(hostName);
                count++;
            }
        }catch
                (Exception e){System.out.println("problem setting up connection"+e);}
    }
    
}
