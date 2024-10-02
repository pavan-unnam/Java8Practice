package Java8Practice.features.lamda.real.world;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> togetBooks() {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book(1, "pavan", 20));
		bookList.add(new Book(2, "kumar", 30));
		bookList.add(new Book(3, "unnam", 40));
		bookList.add(new Book(4, "lucky", 50));
		return bookList;
		
	}

}
