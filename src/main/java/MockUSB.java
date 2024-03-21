/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: MockUSB.java
 * Description: This class implements the USB interface to provide mock functionality for handling
 * customer data retrieval and printing.
 */

public class MockUSB implements USB{
    /**Prints a mock message indicating that customer data for the specified customerId is being read.*/
    @Override
    public void printCustomer(int customerId) {
        System.out.println("CustomerId"+customerId+" reading data...");
    }

    /**Prints a mock message confirming that customer data for the specified customerId has been confirmed.*/
    @Override
    public void getCustomer_USB(int customerId) {
        System.out.println("CustomerId"+customerId+"data confirmed!");
    }
}
