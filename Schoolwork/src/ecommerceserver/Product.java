package ecommerceserver;

import java.util.Properties;
import java .io.*;


public class Product
{
    // This class is associated with a Properties database which contains
    // entries of the form
    //
    // Product Id = Product details
    //
    // The product details consist of the name of the product terminated by an asterisk
    // followed by the quantity in stock terminated by another asterisk. A typical
    // entry might be
    //
    // Scsy=Yellow+Socks*200*
    //
    // Remember that spaces are represented by the + sign in a Properties file

    private String productID;
    private String name;
    private String quantityInStock;
    static Properties database;

    public Product(String productID)
    {
        // Extract out the entry in the database corresponding to productId
        // if the product is not found then both the instance variables are
        // set to "Error"
        this.productID = productID;
        String prodAndQuantity = database.getProperty(productID);
        if(prodAndQuantity==null)
        {
            // Product not found in database
            name ="Error";
            quantityInStock = "Error";
        }
        else
        {
           // Product in database
           int asteriskPos = prodAndQuantity.indexOf("*");
           quantityInStock = prodAndQuantity.
                                substring(asteriskPos+1, prodAndQuantity.length()-1);
           name = prodAndQuantity.substring(0,asteriskPos);
        }
    }

    public String getName()
    {
        // return name of product
        return name;
    }

    public String getquantityInStock()
    {
        // return quantity in stock of product
        return quantityInStock;
    }

    public static void initProductDatabase()
    {
     // Initialise Properties database, needs to be called before
     // database is accessed
     try
     {
        database = new Properties();
        database.load(new FileInputStream(new File("Products.txt")));
     }catch(Exception e)
     {System.out.println("Problem accessing product database "+e);}
    }
}