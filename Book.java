import java.util.Scanner;

class Book {
    private String title;
    private int numberOfPages;
    private boolean isFictional;

    // Constructor
    public Book(String title, int numberOfPages, boolean isFictional) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.isFictional = isFictional;
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isFictional() {
        return isFictional;
    }

    public void setFictional(boolean fictional) {
        isFictional = fictional;
    }
}

