/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

/**
 * This class represents the server activity that should be done for the ATM.
 *
 * @author Jesse
 * @date November 3, 2014
 */
public class ATMServer {

    private static Account checking;
    private static Account savings;
    
    public static void main(String[] args) {
        int count;
        String message = "";
        String result = "";
        
        checking = new Account("",200,Account.ACCOUNT_CHECKING);
        savings = new Account("",1000,Account.ACCOUNT_SAVINGS);
        // Set up name database, normally this ould be done in a much
        // more sophisticated way.
        System.out.println("Starting the ATM server...");
        try {
            ServerSocket ss = new ServerSocket(1024);
            count = 1;
            while (true) {
                // Set upt the streams which the clients will access
                Socket sock = ss.accept();
                InputStream is = sock.getInputStream();
                BufferedReader bf = new BufferedReader(new InputStreamReader(is));
                OutputStream os = sock.getOutputStream();
                PrintWriter pw = new PrintWriter(os, true);
                System.out.println("Serviced connection " + count);
                //Read name request
                message = bf.readLine();
                
                // The message should be composed as follows:
                // first character - operation
                // second character - account type (for deposit, withdraw, inquiry)
                // the rest - the amount (0 if inquiry)
                switch (message.charAt(0))
                {
                    // Login
                    case 'l':
                        result = login(message);
                        break;
                    // Deposit
                    case 'd':
                        result = deposit(message);
                        break;
                    // Withdraw
                    case 'w':
                        result = withdraw(message);
                        break;
                    // Inquiry
                    case 'i':
                        result = inquiry(message);
                        break;
                    // Transfer
                    case 't':
                        result = transfer(message);
                        break;
                }
                pw.println(result);
                count++;
            }
        } catch (Exception e) {
            System.out.println("Problem setting up connection" + e);
        }
    }
    
    /**
     * Performs a login operation.
     * Later on, this will query the database to get the 
     * proper account information.
     * @param code
     * @return 
     */
    private static String login(String code)
    {
        String loginCode = code.substring(1);
        checking = new Account(loginCode, 200,Account.ACCOUNT_CHECKING);
        savings = new Account(loginCode, 1000,Account.ACCOUNT_SAVINGS);  
        
        return "Logged in as "+loginCode+".";
    }
    private static String deposit(String code)
    {
        char acct = code.charAt(1);
        double amnt = Double.parseDouble(code.substring(2));
        switch (acct)
        {
            case 'c':
                checking.deposit(amnt);
                return checking.toString();
            case 's':
                savings.deposit(amnt);
                return savings.toString();
        }
        return "*";
    }
    private static String withdraw(String code)
    {
        try{
            char acct = code.charAt(1);
            double amnt = Double.parseDouble(code.substring(2));
            switch (acct)
            {
                case 'c':
                    checking.withdraw(amnt);
                    return checking.toString();
                case 's':
                    savings.withdraw(amnt);
                    return savings.toString();
            }
            return "*";
        }catch (Exception e)
        {
            return "*";
        }
    }
    private static String inquiry(String code)
    {
        char acct = code.charAt(1);
        switch (acct)
        {
            case 'c':
                return checking.toString();
            case 's':
                return savings.toString();
        }
        return "*";        
    }
    private static String transfer(String code)
    {
        try{
            char acct = code.charAt(1);
            double amnt = Double.parseDouble(code.substring(2));
            switch (acct)
            {
                case 'c':
                    checking.transfer(savings,amnt);
                    return checking.toString() + "\n" + savings.toString();
                case 's':
                    savings.transfer(checking,amnt);
                    return checking.toString() + "\n" + savings.toString();
            }
            return "*";
        }catch (Exception e)
        {
            return "*";
        }        
    }
}
