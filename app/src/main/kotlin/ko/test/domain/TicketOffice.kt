package ko.test.domain

data class TicketOffice(
    private var amount: Long,
    private var tickets: MutableList<Ticket>
) {
    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun getTicket(): Ticket {
        return tickets.removeAt(0)
    }
}

data class TicketSeller(
    private var ticketOffice: TicketOffice
) {
    fun sellTo(audience: Audience) {
        val ticket = this.ticketOffice.getTicket()
        this.ticketOffice.plusAmount(audience.buy(ticket))
    }
}

data class Theater(
    private var ticketSeller: TicketSeller
) {
    fun enter(audience: Audience) {
        this.ticketSeller.sellTo(audience)
    }
}
