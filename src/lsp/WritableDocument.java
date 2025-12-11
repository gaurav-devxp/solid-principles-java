package lsp;

/**
 * Represents a document that can be written to.
 * It extends ReadableDocument, meaning all WritableDocuments are also
 * ReadableDocuments.
 * This ensures substitution holds true where a ReadableDocument is expected.
 */
public interface WritableDocument extends ReadableDocument {
    void save(String newContent);
}
