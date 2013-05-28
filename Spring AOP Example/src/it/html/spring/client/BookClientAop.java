package it.html.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import it.html.spring.book.Book;
import it.html.spring.book.BookDao;

public class BookClientAop {
	public static void main(String[] args) {

			
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		BookDao bookDao = (BookDao) ctx.getBean("bookDaoProxy");

		// Delete
		bookDao.delete("1234567890123");
		bookDao.delete("1234567890321");

		// Insert Promessi Sposi
		Book book = new Book();
		book.setIsbn("1234567890123");
		book.setAuthor("Manzoni");
		book.setTitle("I Promessi Sposi");
		bookDao.insert(book);

		// Insert Il Barone Rampante
		book = new Book();
		book.setIsbn("1234567890321");
		book.setAuthor("Italo Calvino");
		book.setTitle("Il Barone Rampante");
		bookDao.insert(book);

		// Find Promessi Sposi
		book = bookDao.findByISBN("1234567890123");

		// Update Promessi Sposi
		book.setAuthor("Alessandro Manzoni");
		bookDao.update(book);

		// Book Count
		bookDao.bookCount();

		// Find all books
		bookDao.findAllBooks();
			
	}
}
