public class Books {
    public void readBook(String title, String author) {
        System.out.println("author = " + author);
        System.out.println("title = " + title);

    }

    public void composeBookList() {
        readBook("All the King's Men", "Robert Penn Warren");
        readBook("1984", "George Orwell");
        readBook("Atlas Shrugged", "Ayn Rand");
        readBook("Cat's Cradle", "Kurt Vonnegut");
    }
}