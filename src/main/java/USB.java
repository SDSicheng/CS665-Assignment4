/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: USB.java
 * Description: This is the class handle different customer type when creating instance. My choice is using switch
 * statement.
 * This interface defines methods related to customer data retrieval and printing via USB.
 */
public interface USB {
    /***Print customer details identified by customerId.*/
    void printCustomer(int customerId);
    /***Retrieve customer data via USB for further processing.*/
    void getCustomer_USB(int customerId);
}
