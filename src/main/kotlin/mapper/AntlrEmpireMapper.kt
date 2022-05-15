package mapper

import antlr.generated.StellarisLexer
import antlr.generated.StellarisParser
import dao.empire.UserEmpire
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CodePointCharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import util.EmpireParser

class AntlrEmpireMapper : EmpireParser {
    override fun parseEmpire(userEmpireString: String): ArrayList<UserEmpire> {
        val input: CodePointCharStream = CharStreams.fromString(userEmpireString)

        val parser: StellarisParser = StellarisParser(CommonTokenStream(StellarisLexer(input)))
        val config: StellarisParser.ConfigContext = parser.config()
        val tree: ParseTree = parser

        val stellarisVisitor = StellarisVisitorImpl()

        return stellarisVisitor.visit(tree);
    }
}
