public class Book { //Klasse Book

    private String title; //Sichtbarkeitsmodifizierer (public/private)
    
    public boolean state;

    public Book(String title) { //Book() ist Konstruktor der Klasse! 
        this.title = title;
    }

    public String toString() { // toString() ist Operation
        return title;
    }

}
