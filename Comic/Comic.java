package ssesson2.jv2;

public class Comic {
    private String Comic,Author;

    public Comic(String comic, String author) {
        Comic = comic;
        Author = author;
    }
    public static Comic createComic(String Comic, String Author){
        return new Comic( Comic,Author );
    }
    public String getComic() {
        return Comic;
    }

    public void setComic(String comic) {
        Comic = comic;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
