public abstract class Art {
    private String title;
    private String author;
    private String description;

    public Art(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public abstract void viewArt();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }
}