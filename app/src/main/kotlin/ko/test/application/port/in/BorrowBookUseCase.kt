package ko.test.application.port.`in`

import ko.test.domain.Book
import ko.test.domain.Person

interface BorrowBookUseCase {
    fun borrowBook(person: Person, book: Book)
}
