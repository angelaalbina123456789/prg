package bookpackext;
class pr011 {
        public static void main(String[] args) {
                bookpack.Book[] books = new bookpack.Book[5];
                books[0] = new bookpack.Book("Иллиада", "Гомер", 1980);
                books[1] = new bookpack.Book("Унесенные ветром", "митчел", 2000);
                books[2] = new bookpack.Book("Наедине с собой", "Аврелий", 1950);
                books[3] = new bookpack.Book("Собор Парижской Богоматери", "Гюго", 1970);
                books[4] = new bookpack.Book("Преступление и наказание", "Достоевский", 1950);
                for(int i=0; i < books.length; i++)
                        books[i].show();
        }
}

