package bookpack;
/*
class Book {
	private String title;
	private String author;
	private int pubDate;

	public Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate  = d;
	}

	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}
*/

class pr010 {
	public static void main(String[] args) {
		Book[] books = new Book[5];
		books[0] = new Book("Иллиада", "Гомер", 1980);
		books[1] = new Book("Унесенные ветром", "митчел", 2000);
		books[2] = new Book("Наедине с собой", "Аврелий", 1950);
		books[3] = new Book("Собор Парижской Богоматери", "Гюго", 1970);
		books[4] = new Book("Преступление и наказание", "Достоевский", 1950);
		for(int i=0; i < books.length; i++)
			books[i].show();

	}
}
