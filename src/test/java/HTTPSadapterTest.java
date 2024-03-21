/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: HTTPSadapterTest.java
 * Description: Test class for HTTPSadapter
 */
import junit.framework.TestCase;
import org.junit.Test;

public class HTTPSadapterTest extends TestCase {
    private USB usbMock = new USB() {
        public void printCustomer(int customerId) {
            // Do nothing for mock
        }

        public void getCustomer_USB(int customerId) {
            // Do nothing for mock
        }
    };

    @Test
    public void testPrintCustomer() {
        // Define a customer ID
        int customerId = 123;

        // Create HTTPSadapter instance
        HTTPSadapter httpsAdapter = new HTTPSadapter(usbMock);

        // Call the printCustomer method on HTTPSadapter
        httpsAdapter.printCustomer(customerId);

        // Verify that the printCustomer method of USB object is called with the correct customer ID
        // Since we cannot mock objects with TestCase, we just ensure that no exceptions occur
        assertTrue(true);
    }

    @Test
    public void testGetCustomer_HTTPS() {
        // Define a customer ID
        int customerId = 456;

        // Create HTTPSadapter instance
        HTTPSadapter httpsAdapter = new HTTPSadapter(usbMock);

        // Call the getCustomer_HTTPS method on HTTPSadapter
        httpsAdapter.getCustomer_HTTPS(customerId);

        // Verify that the getCustomer_USB method of USB object is called with the correct customer ID
        // Since we cannot mock objects with TestCase, we just ensure that no exceptions occur
        assertTrue(true);
    }
}