/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: HTTPSadapter.java
 * Description: This class implements the HTTPS interface to adapt an existing USB system for handling
 * customer data retrieval and printing via HTTPS.
 */
public class HTTPSadapter implements HTTPS{
    private USB oldSystem;

    /**Constructs a new HTTPS adapter with the given USB system.*/
    public HTTPSadapter(USB oldSystem){
        this.oldSystem = oldSystem;
    }

    /**Prints customer details identified by customerId using the old USB system.*/
    @Override
    public void printCustomer(int customerId) {
        oldSystem.printCustomer(customerId);
    }

    /**Retrieves customer data via HTTPS for further processing by utilizing the old USB system.*/
    @Override
    public void getCustomer_HTTPS(int customerId) {
        oldSystem.getCustomer_USB(customerId);
    }
}
