/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: HTTPS.java
 * Description: This interface defines methods related to customer data retrieval and printing via HTTPS.
 * The methods included are for printing customer details identified by customerId and retrieving
 * customer data via HTTPS for further processing.
 */
public interface HTTPS {
    /***Print customer details identified by customerId.*/
    void printCustomer(int customerId);
    /***Retrieve customer data via HTTPS for further processing.*/
    void getCustomer_HTTPS(int customerId);
}
