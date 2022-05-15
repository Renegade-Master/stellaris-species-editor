import dao.empire.UserEmpire
import mapper.UserEmpireMapper
import mu.KotlinLogging
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import kotlin.reflect.full.memberProperties
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

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

        val empires: ArrayList<UserEmpire> = UserEmpireMapper.parseEmpire(resource.readText())
        assertTrue("There are no entries in the User Empire list.") { empires.size > 0 }

        logger.info { "Test Step $currentStep: End" }

        logger.info { "Test Step ${++currentStep}: Validate first entry" }

        UserEmpire::class.memberProperties.forEach {
            logger.info { "Property: ${it.name} = ${it.get(empires[0])}" }
//            assertTrue("Empire field is not present: ${it.name}") { it.get(empires[0]).toString().isNotBlank() }
        }

        logger.info { "Test Step $currentStep: End" }
    }
}
