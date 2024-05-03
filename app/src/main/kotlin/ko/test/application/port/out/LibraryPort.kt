package ko.test.application.port.out

import ko.test.domain.Book

interface LibraryPort {
    fun addBook(book: Book)
    fun removeBook(book: Book)
    fun listBooks(): List<Book>
    fun hasBook(book: Book): Boolean
}
