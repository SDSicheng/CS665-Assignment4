/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: MockUSBTest.java
 * Description: Test class for MockUSB
 */
import junit.framework.TestCase;
import org.junit.Test;

public class MockUSBTest extends TestCase {
    @Test
    public void testPrintCustomer() {

        MockUSB mockUSB = new MockUSB();
        int customerId = 123;

        mockUSB.printCustomer(customerId);

        assertTrue(true); // No exception occurred, test passes
    }

    @Test
    public void testGetCustomer_USB() {

        MockUSB mockUSB = new MockUSB();
        int customerId = 456;

        mockUSB.getCustomer_USB(customerId);

        assertTrue(true); // No exception occurred, test passes
    }

}