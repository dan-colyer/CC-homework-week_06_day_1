import org.junit.*;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

  Library library;
  Book book;

  @Before
  public void before() {
    this.library = new Library("Ed Lib", 10);
    this.book = new Book();
  }

// Test 1
  @Test
  public void hasName() {
    String name = this.library.getName();
    assertEquals("Ed Lib", name);
  }

// Test 2
  @Test
  public void hasMaxStock() {
    int num = this.library.getMaxStock();
    assertEquals(10, num);
  }

// Test 3
  @Test
  public void stockStartsEmpty() {
    assertEquals(0, library.stockCount());
  }

// Test 4
  @Test
  public void canAddBook() {
    library.addBook(book);
    assertEquals(1, library.stockCount());
  }

// Test 5
  @Test
  public void stockIsFull() {
    for(int i = 0; i < 10; i++) {
      library.addBook(book);
    }
    assertEquals(true, library.isStockFull());
  }

// Test 6
  @Test
  public void cannotAddBookWhenStockFull() {
    for (int i = 0; i < 20 ; i++ ) {
      library.addBook(book);
    }
  assertEquals(10, library.stockCount());
  }
}

// Create your own class with an internal collection of a different class. It should have methods for count, add, isFull etc. Remember to write tests for your classes!
//
// Some examples:
// A Library class with an array, stock, of Books.
//
// Extensions:
//
// Add a third class which interacts with the other two. E.g. you could add a BusStop with a method that takes a Bus and moves Persons from the BusStop to the Bus.
