package it.html.spring.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookDaoFake implements BookDao{
	Map<String,Book> books = new HashMap<String, Book>();
	
	@Override
	public int bookCount() {		
		return books.size();
	}

	@Override
	public void delete(String isbn) {
		books.remove(isbn);		
	}

	@Override
	public List<Book> findAllBooks() {		
		return new ArrayList<Book>(books.values());
	}

	@Override
	public Book findByISBN(String isbn) {
		return books.get(isbn);								
	}

	@Override
	public void insert(Book book) {
		books.put(book.getIsbn(), book);		
	}

	@Override
	public void update(Book book) {
		books.put(book.getIsbn(), book);						
	}
}
