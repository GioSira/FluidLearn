package it.html.spring.book;

import java.util.List;

public interface BookDao {
	public void insert(Book book);

	public void update(Book book);

	public void delete(String isbn);

	public Book findByISBN(String isbn);

	public List<Book> findAllBooks();

	public int bookCount();
}
