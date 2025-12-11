package lsp;

public class FileManager {

    /**
     * This method works with ANY ReadableDocument.
     * Both ReadOnlyReport and SourceCodeFile can be passed here (Substitution).
     */
    public void openDocument(ReadableDocument doc) {
        System.out.println("Opening: " + doc.getFilename());
        System.out.println("Content: " + doc.getContent());
    }

    /**
     * This method specifically requires WritableDocument.
     * Passing a ReadOnlyReport here would be a compile-time error,
     * thus preventing runtime errors (LSP safety).
     */
    public void saveDocument(WritableDocument doc, String newContent) {
        doc.save(newContent);
    }
}
