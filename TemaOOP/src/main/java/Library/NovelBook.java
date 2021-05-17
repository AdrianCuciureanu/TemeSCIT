package Library;

public class NovelBook extends Book {
    private String type;

    public NovelBook(String name, int numberOfPages, String type) {
        super(name, numberOfPages);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return super.getName() + ": nuamar de pagini - " + super.getNumberOfPages() + ", genul - " + this.type;
    }
}
