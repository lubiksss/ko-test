package ko.test.application

import ko.test.application.port.`in`.BorrowBookUseCase
import ko.test.application.port.out.LibraryPort
import ko.test.domain.Book
import ko.test.domain.Person


class BorrowBookService(private val library: LibraryPort) : BorrowBookUseCase {
    override fun borrowBook(person: Person, book: Book) {
        if (!library.hasBook(book)) {
            println("Book not found")
        }
        library.removeBook(book)
        person.borrowBook(book)
    }
}