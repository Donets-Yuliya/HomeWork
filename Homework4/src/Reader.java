import java.text.SimpleDateFormat;
import java.util.Date;

public class Reader {
    private String surname;
    private String name;
    private String patronymic;
    private int cardNumber;
    private String faculty;
    private Date birthDate = new Date();
    private int phoneNumber;
    private Book[] books = new Book[10];
    private int booksCount;

    public Reader(String surname, String name, int cardNumber) {
        this.setSurname(surname);
        this.setName(name);
        this.setCardNumber(cardNumber);
        booksCount = 0;
    }

    public Reader(String surname, String name, String patronymic, int cardNumber) {
        this (surname, name, cardNumber);
        this.patronymic = patronymic;
    }

    public Reader(String surname, String name, String patronymic, int cardNumber, String faculty, int phoneNumber, int birthDay, int birthMonth, int birthYear) {
        this (surname, name, patronymic, cardNumber);
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
        this.setBirthDate(birthDay, birthMonth, birthYear);
    }

    public void PrintFullName() {
        if (this.patronymic == null || this.patronymic.isEmpty()) {
            System.out.print(this.surname + " " + this.name.substring(0, 1) + ".");
        } else {
            System.out.print(this.surname + " " + this.name.substring(0, 1) + ". " + this.patronymic.substring(0, 1) + ".");
        }
    }

    public static void PrintStatus(Reader reader) {
        reader.PrintFullName();
        System.out.print(" взял(а) " + reader.booksCount + " книг(у/и): ");
        for (int i = 0; i < reader.books.length; i++) {
            if (reader.books[i] == null) {
                continue;
            } else {
                System.out.print(reader.books[i].getName() + ", ");
            }
        }
        System.out.println();
    }

    public void PrintStatus() {
        PrintStatus(this);
    }

    public static void takeBook(Reader reader, Book book) {
        if (book.getName().isEmpty()) {
            System.out.println("Не введено название книги");
        } else if (reader.booksCount == 10) {
            System.out.println("Читатель не может взять больше книг");
        } else {
            for (int i = 0; i < reader.books.length; i++) {
                if (reader.books[i] == null) {
                    reader.books[i] = book;
                    reader.booksCount++;
                    reader.PrintFullName();
                    System.out.println(" взял(а) книгу " + reader.books[i].getName());
                    break;
                }
            }
        }
    }

    public void takeBook(Book book) {
        takeBook(this, book);
    }

    public static void returnBook(Reader reader, String bookName) {
        boolean isExists = false;
        if (bookName.isEmpty()) {
            System.out.println("Не введено название книги");
        } else {
            for (int i = 0; i < reader.books.length; i++) {
                if (reader.books[i] != null && reader.books[i].getName().equals(bookName)) {
                    reader.books[i] = null;
                    reader.booksCount--;
                    isExists = true;
                    reader.PrintFullName();
                    System.out.println(" вернул(а) книгу " + bookName);
                }
            }

            if (!isExists) {
                reader.PrintFullName();
                System.out.println(" не хранит книгу " + bookName);
            }
        }
    }

    public void returnBook(String bookName) {
        returnBook(this, bookName);
    }

    public void printBirthDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(dateFormat.format(this.birthDate));
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.isEmpty()) {
            this.surname = "Без фамилии";
        } else {
            this.surname = surname;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            this.name = "Без имени";
        } else {
            this.name = name;
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        if (cardNumber <= 0) {
            System.out.println("Неверно введен номер читательского билета");
        } else {
            this.cardNumber = cardNumber;
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setBirthDate(int day, int month, int year) {
        birthDate.setDate(day);
        birthDate.setMonth(month - 1);
        birthDate.setYear(year - 1900);
    }
}
