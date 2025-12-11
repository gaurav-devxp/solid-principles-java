package lsp;

/**
 * A document that can ONLY be read.
 * It implements ReadableDocument, NOT WritableDocument.
 * This prevents the LSP violation of having a 'save' method that throws an
 * exception.
 */
public class ReadOnlyReport implements ReadableDocument {
    private final String content;
    private final String filename;

    public ReadOnlyReport(String filename, String content) {
        this.filename = filename;
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getFilename() {
        return filename;
    }
}
