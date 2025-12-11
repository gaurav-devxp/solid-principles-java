package lsp;

/**
 * Represents a document that can be read.
 * This is the base capability.
 */
public interface ReadableDocument {
    String getContent();

    String getFilename();
}
