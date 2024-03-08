package ko.test.adapter.`in`

import ko.test.application.port.`in`.BorrowBookUseCase
import ko.test.domain.Book
import ko.test.domain.Person

class SampleAdaptor(private val borrowBookUseCase: BorrowBookUseCase) {
    fun borrowBook(person: Person, book: Book) {
        borrowBookUseCase.borrowBook(person, book)
    }
}