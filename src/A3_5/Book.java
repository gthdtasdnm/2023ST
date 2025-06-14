package A3_5;

public class Book implements Component{
    private String author;
    private String title;

    public Book(String author, String title){
        if(author == "" || title == ""){
            throw new IllegalArgumentException("");
        }
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return author + ": " + "\"" + title + "\"";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
