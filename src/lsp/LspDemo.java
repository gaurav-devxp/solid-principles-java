package lsp;

public class LspDemo {
    public static void main(String[] args) {
        System.out.println("--- Liskov Substitution Principle Demo ---");

        ReadableDocument report = new ReadOnlyReport("Q1-Report.pdf", "Financial Data...");
        WritableDocument code = new SourceCodeFile("Main.java", "public class Main...");

        FileManager manager = new FileManager();

        // LSP in action: Both types substitute for ReadableDocument
        manager.openDocument(report);
        manager.openDocument(code);

        // Correct usage: Only WritableDocument passed to save
        manager.saveDocument(code, "public class Main { }");

        // manager.saveDocument(report, "..."); // Compile error - prevented LSP
        // violation
    }
}
