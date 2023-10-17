/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;

public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        TestCases tests = new TestCases(); // Initialize your test class

        try {
            // TODO: call your test case functions one after the other here
            tests.testCase01();
        } catch (Exception e) {
            e.printStackTrace(); // Handle any exceptions specific to your test cases
        } finally {
            tests.endTest(); // End your test by clearing connections and closing the browser
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            new App().getGreeting();
        } catch (InterruptedException | MalformedURLException e) {
            e.printStackTrace(); // Handle exceptions for getGreeting
        }

        try {
            AutomateCountHyperLinks.CountHyperLinks();
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions specific to AutomateCountHyperLinks
        }

        try {
            AutomatePostLinkedIn.automatePost();
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions specific to LinkedInAutomation
        }

        
        
        try {
            BookMyShowAutomation.selectImageURL();
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions specific to LinkedInAutomation
        }
    }
}