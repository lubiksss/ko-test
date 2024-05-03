package ko.test.adapter.`in`

import ko.test.application.port.`in`.BorrowBookUseCase
import ko.test.domain.Book
import ko.test.domain.Person

class ConsoleAdapter(private val borrowBookUseCase: BorrowBookUseCase) {
    fun borrowBook(people: List<Person>, books: List<Book>) {
        print("Enter person's name: ")
        val personName = readlnOrNull() ?: ""
        val person = people.find { it.name == personName } ?: throw IllegalArgumentException("Person not found")

        print("Enter book's id: ")
        val bookId = readlnOrNull() ?: ""
        val book = books.find { it.id == bookId } ?: throw IllegalArgumentException("Book not found")

        borrowBookUseCase.borrowBook(person, book)
    }
}
