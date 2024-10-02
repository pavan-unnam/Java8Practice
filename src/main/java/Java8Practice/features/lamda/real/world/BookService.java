package Java8Practice.features.lamda.real.world;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	//approach 1 extra class required
	public List<Book> toGetBooksSort() {
		List<Book> books = new BookDao().togetBooks();
		Collections.sort(books, new Mycomparator());
		return books;
	}
	
	//aproch 2 with annoumus methods
	public List<Book> toGetBooksSorting() {
		List<Book> books = new BookDao().togetBooks();
		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		return books;
	}
	
	// approach3 with lamda
	public List<Book> toGetBooksSortWithLamda() {
		List<Book> books = new BookDao().togetBooks();
		Collections.sort(books, (b1,b2)->b1.getName().compareTo(b2.getName()));
		return books;
	}

}


 class Mycomparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}
	 
 }