package Java8Practice.features.lamda.real.world;

public class LamdaComparatorTest {

	public static void main(String[] args) {
		
		//With comapartor sorting
		System.out.println(new BookService().toGetBooksSort());
		System.out.println(new BookService().toGetBooksSorting());
		System.out.println(new BookService().toGetBooksSortWithLamda());

	}

}
