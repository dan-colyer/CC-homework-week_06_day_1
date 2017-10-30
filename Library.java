class Library {
  private String name;
  private Book[] stock;

  public Library(String name, int num) {
    this.name = name;
    this.stock = new Book[num];
  }

  public String getName() {
    return this.name;
  }

  public int getMaxStock() {
    return this.stock.length;
  }

  public int stockCount() {
    int count = 0;
    for(Book book : stock) {
      if (book != null) {
        count++;
      }
    }
    return count;
  }

  public void addBook(Book book) {
    if(isStockFull()) {
      return;
    }
    int stockCount = stockCount();
    stock[stockCount] = book;
  }

  public boolean isStockFull() {
    return stockCount() == this.stock.length;
  }

}


// public void eat(Salmon salmon) {
//   if(isBellyFull()) {
//     return;
//   }
//   int foodCount = foodCount();
//   belly[foodCount] = salmon;
// }
