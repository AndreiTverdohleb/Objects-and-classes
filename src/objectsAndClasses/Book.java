package objectsAndClasses;

public class Book {
    String bookName;
    Author authorName;
    int age;

    public Book(String bookName, Author author, int age){
        this.bookName = bookName;
        this.authorName = author;
        this.age = age;
    }
    public String getBookName(){
        return this.bookName;
    }
    public Author getAuthorName(){
        return this.authorName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
