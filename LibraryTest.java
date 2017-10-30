import org.junit.*;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

  Library library;
  Book book;

  @Before
  public void before() {
    this.library = new Library("Ed Lib");
    this.book = new Book();
  }

  

}


// @Before
// public void before() {
//   this.bear = new Bear("Baloo", 25, 95.50);
//   this.salmon = new Salmon();
// }
//
// @Test
// public void hasName() {
//   String name = this.bear.getName();
//   assertEquals("Baloo", name);
// }

// Create your own class with an internal collection of a different class. It should have methods for count, add, isFull etc. Remember to write tests for your classes!
//
// Some examples:
// A Library class with an array, stock, of Books.
//
// Extensions:
//
// Add a third class which interacts with the other two. E.g. you could add a BusStop with a method that takes a Bus and moves Persons from the BusStop to the Bus.
