package ko.test.domain

class Audience(
    private var bag: Bag,
) {
    fun buy(ticket: Ticket): Long {
        if (this.bag.hasInvitation()) {
            this.bag.setTicket(ticket)
            return 0L
        } else {
            this.bag.setTicket(ticket)
            this.bag.minusAmount(ticket.fee)
            return ticket.fee
        }
    }
}

data class Bag(
    private var amount: Long,
    private var invitation: Invitation?,
    private var ticket: Ticket?
) {
    fun hasInvitation(): Boolean {
        return this.invitation != null
    }

    fun setTicket(ticket: Ticket) {
        this.ticket = ticket
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }
}
