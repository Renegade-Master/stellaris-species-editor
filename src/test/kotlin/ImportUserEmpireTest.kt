
import dao.empire.UserEmpire
import mapper.UserEmpireMapper
import mu.KotlinLogging
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import kotlin.test.assertNotNull

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class ImportUserEmpireTest {
    private val logger = KotlinLogging.logger {}

    @Test
    @Order(0)
    fun `Hello World Test`() {
        logger.info { "Hello, World!" }
        assertEquals(true, true)
    }

    @Test
    fun `Import User Empire Test`() {
        var currentStep: Int = 0

        logger.info { "Test Step ${++currentStep}: Read in resource file" }

        val resource = this::class.java.getResource("userEmpireDesigns/single_species.txt")
        assertNotNull(resource, "Resource file not found")

        logger.info { "Test Step $currentStep: End" }

        logger.info { "Test Step ${++currentStep}: Import User Empire" }
//        val empire: UserEmpire = UserEmpireMapper.map(resource.readText())
    }
}
