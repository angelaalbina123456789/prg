package bookpackext;
class pr012 {
        public static void main(String[] args) {
                ExtBook[] books = new ExtBook[5];
                books[0] = new ExtBook("Иллиада", "Гомер", 1980, "Просвещение");
                books[1] = new ExtBook("Унесенные ветром", "митчел", 2000, "Эксмо");
                books[2] = new ExtBook("Наедине с собой", "Аврелий", 1950, "Питер");
                books[3] = new ExtBook("Собор Парижской Богоматери", "Гюго", 1970, "Лабиринт");
                books[4] = new ExtBook("Преступление и наказание", "Достоевский", 1950, "Просвещение");
                for(int i=0; i < books.length; i++)
                        books[i].show();

        }
}

