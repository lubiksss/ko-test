package ko.test.domain

class Audience(
    private var bag: Bag,
) {
    fun buy(ticket: Ticket): Long {
        return this.bag.hold(ticket)
    }
}

data class Bag(
    private var amount: Long,
    private var invitation: Invitation?,
    private var ticket: Ticket?
) {
    private fun hasInvitation(): Boolean {
        return this.invitation != null
    }

    private fun setTicket(ticket: Ticket) {
        this.ticket = ticket
    }

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun hold(ticket: Ticket): Long {
        if (this.hasInvitation()) {
            this.setTicket(ticket)
            return 0L
        } else {
            this.setTicket(ticket)
            this.minusAmount(ticket.fee)
            return ticket.fee
        }
    }
}
