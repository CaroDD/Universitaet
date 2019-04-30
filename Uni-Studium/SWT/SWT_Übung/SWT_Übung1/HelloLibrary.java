/*
 * Lehrstuhl Softwaretechnologie, TU Dresden, Datei HelloLibrary.java
 *
 * HelloLibrary-Klasse implementiert eine Anwendung,
 * die die Aufnahme von Buechern simuliert
 */
// Kommentare

public class HelloLibrary {

  // Simulation durch main()
  public static void main(String[] args) {   //static = man kann sie so aufrufen ohne Instanziierung vorher

//Library und Book sind Konstruktoren!

  // Erzeugung eines Library-Objektes
	Library library = new Library();
	
  // Erzeugung von zwei Book-Objekten
	Book book1 = new Book("Harry Potter");
	Book book2 = new Book("Herr der Ringe");

  // Nachricht an die Library, dass die Books aufgenommen werden sollen
	library.register(book1);
	library.register(book2);
	// geht nicht in einer Zeile!!!


  }

}
