/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: Main.java
 * Description: This class contains the main method to demonstrate the usage of the HTTPSadapter class
 * for adapting an existing USB system to handle customer data retrieval and printing via HTTPS.
 */
public class Main {

    public static void main(String[] args){
        /**Create an instance of the MockUSB class to simulate an existing USB system*/
        USB oldSystem = new MockUSB();
        /**Create an instance of the HTTPSadapter class to adapt the existing USB system for HTTPS*/
        HTTPS adapter = new HTTPSadapter(oldSystem);
        /**Demonstrate printing customer details using the HTTPS adapter*/
        adapter.printCustomer(100);
        /**Demonstrate retrieving customer data via HTTPS using the adapter*/
        adapter.getCustomer_HTTPS(100);
    }
}
