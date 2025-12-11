package lsp;

/**
 * A document that can be read AND written.
 */
public class SourceCodeFile implements WritableDocument {
    private String content;
    private final String filename;

    public SourceCodeFile(String filename, String content) {
        this.filename = filename;
        this.content = content;
    }

    @Override
    public void save(String newContent) {
        this.content = newContent;
        System.out.println("Saved " + filename);
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
