package ko.test.domain

data class Office(
    var amount: Long,
    var tickets: MutableList<Ticket>
) {
    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun getTicket(): Ticket {
        return tickets.removeAt(0)
    }
}

data class TicketSeller(
    var ticketOffice: Office
)

data class Theater(
    var ticketSeller: TicketSeller
) {
    fun enter(audience: Audience) {
        if (audience.bag.hasInvitation()) {
            val ticket = ticketSeller.ticketOffice.getTicket()
            audience.bag.ticket = ticket
        } else {
            val ticket = ticketSeller.ticketOffice.getTicket()
            audience.bag.minusAmount(ticket.fee)
            ticketSeller.ticketOffice.plusAmount(ticket.fee)
            audience.bag.ticket = ticket
        }
    }
}
