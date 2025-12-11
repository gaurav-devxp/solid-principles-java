package isp;

/**
 * A basic printer only needs to implement Printer.
 * It is not forced to implement scan() or fax() which it cannot do.
 */
public class BasicPrinter implements Printer {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}
