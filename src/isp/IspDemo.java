package isp;

public class IspDemo {
    public static void main(String[] args) {
        System.out.println("--- Interface Segregation Principle Demo ---");

        Printer basic = new BasicPrinter();
        SmartOfficeMachine smart = new SmartOfficeMachine();

        // Client asking for printing capability works with both
        basic.print("Document A");
        smart.print("Document B");

        // Client asking for scanning capability only works with Scan-capable device
        // Scanner scanner = basic; // Compile Error: BasicPrinter is not a Scanner
        Scanner scanner = smart;
        scanner.scan("Document C");

        System.out.println("ISP demonstrated: Classes are not forced to implement interfaces they don't use.");
    }
}
