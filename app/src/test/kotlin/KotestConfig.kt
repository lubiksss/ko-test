import io.kotest.core.config.AbstractProjectConfig
import io.kotest.property.PropertyTesting

object KotestProjectConfig : AbstractProjectConfig() {
    override val globalAssertSoftly = true

    override suspend fun beforeProject() {
        PropertyTesting.defaultIterationCount = 100
    }
}