package ko.test.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class BagTest : FunSpec({
    test("BagTest") {
        val bag = Bag(10000, Invitation("2021-07-01"), Ticket(1000))
        bag.hold(Ticket(1000)) shouldBe 0
    }
})
