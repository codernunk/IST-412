package ecommerceserver;

import java.io.*;
import java.net.*;


public class ECommerceServer
{

    public static void main(String[] args)
    {

        int count = 0; //Counts succesful connections
        PrintWriter pw = null;
        BufferedReader bf = null;
        Socket s = null;
        ServerSocket ss = null;
        String clientLine= ""; //Used for reading lines from client
        String productId = "";
        Product productRequested = null;
        // Set up database
        Product.initProductDatabase();
        System.out.println("...Database set up");
        try
        {
            // Using port 1200 for communication
            System.out.println("...Setting up server socket");
            ss = new ServerSocket(1200);
            //Loop around waiting for client requests
            while(true)
            {
               count++;
               System.out.println("...Waiting for connection "+count);
               s = ss.accept();
               // Connection accepted
               pw = new PrintWriter(s.getOutputStream(), true);
               bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
               // Read command from client
               clientLine = bf.readLine();
               switch (clientLine.charAt(0)){
               case'I':
                  {
                    // Name of product required
                    productId = clientLine.substring(1, clientLine.length());
                    productRequested = new Product(productId);
                    if(productRequested.getName().equals("Error"))
                       //Product not found in database
                       pw.println("*");
                       else
                       //Product found in database
                       //Send back the name of the product
                       pw.println(productRequested.getName());
                    break;
                  }
               case'Q':
                  {
                    // Quantity of product required
                    productId = clientLine.substring(1, clientLine.length());
                    productRequested = new Product(productId);
                    if(productRequested.getName().equals("Error"))
                       //Product not found in database
                       pw.println("*");
                     else
                       //Product found in database
                       //Send back the quantity of the product
                       pw.println(productRequested.getquantityInStock());
                    break;
                  }
               }
               pw.close();
               bf.close();
               s.close();
            }

        }catch (Exception e)
        {
            System.out.println("Problem establishing a connection"+e);
        }
    }
}