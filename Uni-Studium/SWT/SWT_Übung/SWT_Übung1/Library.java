public class Library {

   private Book [] myBooks;

   private int number;

   public Library() {
        myBooks = new Book[10];
       	number = 0;
       	System.out.println("Hello, I am a small library for at most 10 books."); //Ausgabe auf die Konsole
       	}

   public void register(Book book) {
       	myBooks[number] = book;
       	number += 1;
       	System.out.println("A new book is registered: " + book); //Ausgabe auf die Konsole
    	}

   public boolean search(String title) { //Checkt, ob Buch vorhanden
	for (int i=0; i < number; i++) {
		if (myBooks[i].toString().equals(title)) {
			return true;
		}
		else return false;
	}
}
   //public loan() { //Rückgabetyp ergänzen!
	//if (this.search(title) == true) {
		
	 //Buch ausleihen

