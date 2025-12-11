package isp;

/**
 * A smart machine implements multiple interfaces because it supports multiple
 * features.
 */
public class SmartOfficeMachine implements Printer, Scanner, Fax {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }

    @Override
    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }
}
