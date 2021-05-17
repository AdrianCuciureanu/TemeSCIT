package Library;

public class ArtBook extends Book {
    private String paperQuality;

    public ArtBook(String name, int numberOfPages, String paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public String toString() {
        return super.getName() + ": numar de pagini - " + super.getNumberOfPages() + ", calitatea hartiei - " + this.paperQuality;
    }


}
