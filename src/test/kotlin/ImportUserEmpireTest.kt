import dao.empire.UserEmpire
import mapper.AntlrEmpireMapper
import mapper.UserEmpireMapper
import mu.KotlinLogging
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertNotNull
import util.EmpireParser
import kotlin.reflect.full.memberProperties

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

        val mapper: EmpireParser = AntlrEmpireMapper()
        val empires: ArrayList<UserEmpire> = mapper.parseEmpire(resource.readText())
        assertTrue(empires.size > 0, "There are no entries in the User Empire list.")

        logger.info { "Test Step $currentStep: End" }

        logger.info { "Test Step ${++currentStep}: Validate Empire properties" }

        var currentSubStep: Int = 0
        UserEmpire::class.memberProperties.forEach {
            logger.info { "Test Step ${currentStep}.${++currentSubStep}: Property [${it.name}] = [${it.get(empires[0])}]" }
//            assertTrue(it.get(empires[0]).toString().isNotBlank(), "Empire field is not present: ${it.name}")
        }

        logger.info { "Test Step $currentStep: End" }
    }
}
