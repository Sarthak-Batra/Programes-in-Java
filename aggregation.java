class Author
{
 private String authorName;
 private int age;
 private String place;
 Author(String authorName, int age, String place)
 {
  this.authorName=authorName;
  this.age=age;
  this.place=place;
 }
 public String getAuthorName()
 {
  return authorName;
 }
 public int getAge()
 {
  return age;
 }
 public String getPlace()
 {
  return place;
 }
}

class Book
{
 String name;
 int price;
 Author auth;
 Book(String name, int price, Author auth)
 {
  this.name=name;
  this.price=price;
  this.auth=auth;
 }
 public void showDetail()
 {
  System.out.println("Book is "+name);
  System.out.println("price "+price);
  System.out.println("Author is "+auth.getAuthorName());
 System.out.println("Author place "+auth.getPlace());
 }
}

class Test
{
 public static void main(String args[])
 {
   Author ath=new Author("Me", 22, "India");
   Book b=new Book("Java" , 550 ,ath);
  b.showDetail();
 }
}