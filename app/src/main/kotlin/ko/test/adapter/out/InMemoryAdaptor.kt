package ko.test.adapter.out

import ko.test.application.port.out.LibraryPort
import ko.test.domain.Book

class InMemoryAdaptor() : LibraryPort {
    private val books = mutableListOf<Book>()

    override fun addBook(book: Book) {
        this.books.add(book)
    }

    override fun removeBook(book: Book) {
        this.books.remove(book)
    }

    override fun listBooks(): List<Book> {
        return this.books
    }

    override fun hasBook(book: Book): Boolean {
        return this.books.contains(book)
    }
}