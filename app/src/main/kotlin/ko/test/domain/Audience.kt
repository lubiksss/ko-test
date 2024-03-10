package ko.test.domain

class Audience(
    var bag: Bag,
)

data class Bag(
    var amount: Long,
    var invitation: Invitation?,
    var ticket: Ticket?
) {
    fun hasInvitation(): Boolean {
        return this.invitation != null
    }

    fun hasTicket(): Boolean {
        return this.ticket != null
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }
}
