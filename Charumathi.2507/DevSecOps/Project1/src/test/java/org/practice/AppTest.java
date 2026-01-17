package org.practice;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testApp() {
        // Create an instance of App to test the constructor
        App app = new App();
        assertNotNull(app); // Simple assertion to ensure object is created
    }

    public void testMain() {
        // Call main method just to execute it
        String[] args = {};
        App.main(args);
        assertTrue(true); // No exception thrown means test passes
    }
}
