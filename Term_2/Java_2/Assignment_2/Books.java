public class Books {
    public void readBook(String title, String author, int year) {
        System.out.println("author = " + author);
        System.out.println("title = " + title);
        System.out.println("year = " + year);
    }

    public void composeBookList() {
        readBook("All the King's Men", "Robert Penn Warren", 1946);
        readBook("1984", "George Orwell", 1949);
        readBook("Atlas Shrugged", "Ayn Rand", 1957);
        readBook("Cat's Cradle", "Kurt Vonnegut", 1963);
    }
}