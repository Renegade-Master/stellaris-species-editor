package mapper

import antlr.generated.StellarisBaseVisitor
import antlr.generated.StellarisParser
import antlr.generated.StellarisVisitor
import dao.empire.UserEmpire
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode

class StellarisVisitorImpl : StellarisBaseVisitor<ArrayList<UserEmpire>>() {

}
