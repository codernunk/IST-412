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
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class ATMClient {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String selection = "";
        String result = "";

        // Login first
        System.out.println("Enter PIN number: ");
        selection = input.next();
        System.out.println(communicate("l"+selection));

        while (!selection.toLowerCase().equals("q")) {
            System.out.println("Welcome to the ATM!  Please select an option: ");
            //System.out.println("l - Login");
            System.out.println("d - Deposit");
            System.out.println("w - Withdraw");
            System.out.println("i - Inqury");
            System.out.println("t - Transfer");
            System.out.println("q - Quit");

            selection = input.next();
            switch (selection.charAt(0)) {
                // Login
                /*case 'l':
                    System.out.println("Enter PIN number: ");
                    selection += input.next();

                    result = communicate(selection);
                    break;*/
                // Deposit
                case 'd':
                    selection += selectAccount(input);

                    System.out.println("Enter the amount to deposit: ");
                    selection += input.nextInt();

                    result = communicate(selection);
                    break;
                // Withdraw
                case 'w':
                    selection += selectAccount(input);

                    System.out.println("Enter the amount to withdraw: ");
                    selection += input.nextInt();

                    result = communicate(selection);
                    break;
                // Inquiry
                case 'i':
                    selection += selectAccount(input);

                    result = communicate(selection);
                    break;
                // Transfer
                case 't':
                    System.out.println("Select the account to transfer FROM: ");
                    selection += selectAccount(input);

                    System.out.println("Enter the amount to transfer: ");
                    selection += input.nextInt();

                    result = communicate(selection);
                    break;
                case 'q':
                    result = "Thank you for using the ATM!";
                    break;
                default:
                    result = "Invalid";
                    break;
            }

            System.out.println(result);
        }
    }

    public static String communicate(String msg) {
        Socket mainSocket;
        InputStream in;
        OutputStream out;
        try {
            // We have to instantiate the socket here because this server will
            // try to accept a new socket per transaction.
            mainSocket = new Socket("localhost", 1024);
            in = mainSocket.getInputStream();
            out = mainSocket.getOutputStream();

            // Create the PrintWriter that will send the user's input over to the server.
            PrintWriter pw = new PrintWriter(out, true);

            // Write the message
            pw.println(msg);
            pw.flush();

            // Get the response
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));

            // Show the result to the user.
            String result = bf.readLine();

            if (result.equals("*")) {
                result = "Error.";
            }

            // Finally, close the socket
            mainSocket.close();

            return result;
        } catch (Exception e) {
            return "ERROR";
        }
    }

    private static String selectAccount(Scanner in) {
        String result = "";

        while (!result.toLowerCase().equals("c") && !result.toLowerCase().equals("s")) {
            System.out.println("Select account:");
            System.out.println("c - Checking");
            System.out.println("s - Savings");

            result = in.next();
        }

        return result;
    }
}
