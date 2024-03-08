package ko.test.domain

data class Person(
    val name: String,
    val bag: List<Book>
) {
    fun borrowBook(book: Book): Person {
        return Person(name, bag + book)
    }

    fun listBooks(): List<Book> {
        return bag
    }
}
