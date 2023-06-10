// Generated from java-escape by ANTLR 4.7.1
package eopseox.parser;
import com.strumenta.kotlinmultiplatform.asCharArray
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import kotlin.reflect.KClass

class EopseoParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(EopseoParser.FileContext::class,
                                                              EopseoParser.FileCompoContext::class,
                                                              EopseoParser.Package_Context::class,
                                                              EopseoParser.Namespace_Context::class,
                                                              EopseoParser.Import_Context::class,
                                                              EopseoParser.ImportExContext::class,
                                                              EopseoParser.DefaultTypeContext::class,
                                                              EopseoParser.TypeExContext::class,
                                                              EopseoParser.RBooleanContext::class,
                                                              EopseoParser.PrimitiveTypeContext::class,
                                                              EopseoParser.TupleTypeContext::class,
                                                              EopseoParser.TheoryContext::class,
                                                              EopseoParser.CompiledIdContext::class,
                                                              EopseoParser.ForAllContext::class,
                                                              EopseoParser.ForAllCompoContext::class,
                                                              EopseoParser.ReferenceContext::class,
                                                              EopseoParser.NewTypeContext::class,
                                                              EopseoParser.CommonIdContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "Eopseo.g4"

    override val tokenNames: Array<String?>?
        get() = EopseoParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = EopseoParser.Companion.ruleNames
    override val atn: ATN
        get() = EopseoParser.Companion.ATN
    override val vocabulary: Vocabulary
        get() = EopseoParser.Companion.VOCABULARY

    enum class Tokens(val id: Int) {
        EOF(-1),
        WS(1),
        COMMENT(2),
        LINE_COMMENT(3),
        PACKAGE(4),
        IMPORT(5),
        NEW(6),
        RTRUE(7),
        RFALSE(8),
        RINT(9),
        RDOUBLE(10),
        RSTRING(11),
        RBOOLEAN(12),
        RARROW(13),
        LARROW(14),
        SHARP(15),
        LPAREN(16),
        RPAREN(17),
        LSQUARE(18),
        RSQUARE(19),
        LBRACE(20),
        RBRACE(21),
        DOT(22),
        ID(23),
        OPID(24),
        Integer(25),
        Double(26),
        String(27)
    }

    enum class Rules(val id: Int) {
        RULE_file(0),
        RULE_fileCompo(1),
        RULE_package_(2),
        RULE_namespace_(3),
        RULE_import_(4),
        RULE_importEx(5),
        RULE_defaultType(6),
        RULE_typeEx(7),
        RULE_rBoolean(8),
        RULE_primitiveType(9),
        RULE_tupleType(10),
        RULE_theory(11),
        RULE_compiledId(12),
        RULE_forAll(13),
        RULE_forAllCompo(14),
        RULE_reference(15),
        RULE_newType(16),
        RULE_commonId(17)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "fileCompo", "package_", "namespace_", 
                                "import_", "importEx", "defaultType", "typeEx", 
                                "rBoolean", "primitiveType", "tupleType", 
                                "theory", "compiledId", "forAll", "forAllCompo", 
                                "reference", "newType", "commonId")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
                                                          null, "'package'", 
                                                          "'import'", "'new'", 
                                                          "'rTrue'", "'rFalse'", 
                                                          "'RInt'", "'RDouble'", 
                                                          "'RString'", "'RBoolean'", 
                                                          "'->'", "'<-'", 
                                                          "'#'", "'('", 
                                                          "')'", "'['", 
                                                          "']'", "'{'", 
                                                          "'}'", "'.'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "WS", "COMMENT", 
                                                           "LINE_COMMENT", 
                                                           "PACKAGE", "IMPORT", 
                                                           "NEW", "RTRUE", 
                                                           "RFALSE", "RINT", 
                                                           "RDOUBLE", "RSTRING", 
                                                           "RBOOLEAN", "RARROW", 
                                                           "LARROW", "SHARP", 
                                                           "LPAREN", "RPAREN", 
                                                           "LSQUARE", "RSQUARE", 
                                                           "LBRACE", "RBRACE", 
                                                           "DOT", "ID", 
                                                           "OPID", "Integer", 
                                                           "Double", "String")

        val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u001d\u0094\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u002a\u000a\u0002\u000c\u0002\u000e\u0002\u002d\u000b\u0002\u0003\u0003\u0003\u0003\u0005\u0003\u0031\u000a\u0003\u0003\u0004\u0003\u0004\u0005\u0004\u0035\u000a\u0004\u0003\u0005\u0003\u0005\u0007\u0005\u0039\u000a\u0005\u000c\u0005\u000e\u0005\u003c\u000b\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0007\u0006\u0041\u000a\u0006\u000c\u0006\u000e\u0006\u0044\u000b\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u004d\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u0053\u000a\u0009\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0007\u000c\u005b\u000a\u000c\u000c\u000c\u000e\u000c\u005e\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0005\u000d\u0063\u000a\u000d\u0003\u000d\u0005\u000d\u0066\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u006d\u000a\u000d\u0003\u000d\u0005\u000d\u0070\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u0076\u000a\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0006\u000f\u007d\u000a\u000f\u000d\u000f\u000e\u000f\u007e\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u0086\u000a\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u008b\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0002\u0002\u0014\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0002\u0005\u0003\u0002\u0009\u000a\u0003\u0002\u000b\u000e\u0003\u0002\u0019\u001a\u0002\u0095\u0002\u0026\u0003\u0002\u0002\u0002\u0004\u0030\u0003\u0002\u0002\u0002\u0006\u0034\u0003\u0002\u0002\u0002\u0008\u003a\u0003\u0002\u0002\u0002\u000a\u0042\u0003\u0002\u0002\u0002\u000c\u0045\u0003\u0002\u0002\u0002\u000e\u004c\u0003\u0002\u0002\u0002\u0010\u0052\u0003\u0002\u0002\u0002\u0012\u0054\u0003\u0002\u0002\u0002\u0014\u0056\u0003\u0002\u0002\u0002\u0016\u0058\u0003\u0002\u0002\u0002\u0018\u0075\u0003\u0002\u0002\u0002\u001a\u0077\u0003\u0002\u0002\u0002\u001c\u007a\u0003\u0002\u0002\u0002\u001e\u0082\u0003\u0002\u0002\u0002\u0020\u008a\u0003\u0002\u0002\u0002\u0022\u008e\u0003\u0002\u0002\u0002\u0024\u0091\u0003\u0002\u0002\u0002\u0026\u0027\u0005\u0006\u0004\u0002\u0027\u002b\u0005\u000a\u0006\u0002\u0028\u002a\u0005\u0004\u0003\u0002\u0029\u0028\u0003\u0002\u0002\u0002\u002a\u002d\u0003\u0002\u0002\u0002\u002b\u0029\u0003\u0002\u0002\u0002\u002b\u002c\u0003\u0002\u0002\u0002\u002c\u0003\u0003\u0002\u0002\u0002\u002d\u002b\u0003\u0002\u0002\u0002\u002e\u0031\u0005\u0022\u0012\u0002\u002f\u0031\u0005\u0018\u000d\u0002\u0030\u002e\u0003\u0002\u0002\u0002\u0030\u002f\u0003\u0002\u0002\u0002\u0031\u0005\u0003\u0002\u0002\u0002\u0032\u0033\u0007\u0006\u0002\u0002\u0033\u0035\u0005\u0008\u0005\u0002\u0034\u0032\u0003\u0002\u0002\u0002\u0034\u0035\u0003\u0002\u0002\u0002\u0035\u0007\u0003\u0002\u0002\u0002\u0036\u0037\u0007\u0019\u0002\u0002\u0037\u0039\u0007\u0018\u0002\u0002\u0038\u0036\u0003\u0002\u0002\u0002\u0039\u003c\u0003\u0002\u0002\u0002\u003a\u0038\u0003\u0002\u0002\u0002\u003a\u003b\u0003\u0002\u0002\u0002\u003b\u003d\u0003\u0002\u0002\u0002\u003c\u003a\u0003\u0002\u0002\u0002\u003d\u003e\u0007\u0019\u0002\u0002\u003e\u0009\u0003\u0002\u0002\u0002\u003f\u0041\u0005\u000c\u0007\u0002\u0040\u003f\u0003\u0002\u0002\u0002\u0041\u0044\u0003\u0002\u0002\u0002\u0042\u0040\u0003\u0002\u0002\u0002\u0042\u0043\u0003\u0002\u0002\u0002\u0043\u000b\u0003\u0002\u0002\u0002\u0044\u0042\u0003\u0002\u0002\u0002\u0045\u0046\u0007\u0007\u0002\u0002\u0046\u0047\u0005\u0008\u0005\u0002\u0047\u000d\u0003\u0002\u0002\u0002\u0048\u004d\u0007\u001b\u0002\u0002\u0049\u004d\u0007\u001c\u0002\u0002\u004a\u004d\u0007\u001d\u0002\u0002\u004b\u004d\u0005\u0012\u000a\u0002\u004c\u0048\u0003\u0002\u0002\u0002\u004c\u0049\u0003\u0002\u0002\u0002\u004c\u004a\u0003\u0002\u0002\u0002\u004c\u004b\u0003\u0002\u0002\u0002\u004d\u000f\u0003\u0002\u0002\u0002\u004e\u0053\u0005\u000e\u0008\u0002\u004f\u0053\u0005\u0014\u000b\u0002\u0050\u0053\u0005\u0020\u0011\u0002\u0051\u0053\u0005\u0016\u000c\u0002\u0052\u004e\u0003\u0002\u0002\u0002\u0052\u004f\u0003\u0002\u0002\u0002\u0052\u0050\u0003\u0002\u0002\u0002\u0052\u0051\u0003\u0002\u0002\u0002\u0053\u0011\u0003\u0002\u0002\u0002\u0054\u0055\u0009\u0002\u0002\u0002\u0055\u0013\u0003\u0002\u0002\u0002\u0056\u0057\u0009\u0003\u0002\u0002\u0057\u0015\u0003\u0002\u0002\u0002\u0058\u005c\u0007\u0012\u0002\u0002\u0059\u005b\u0005\u0010\u0009\u0002\u005a\u0059\u0003\u0002\u0002\u0002\u005b\u005e\u0003\u0002\u0002\u0002\u005c\u005a\u0003\u0002\u0002\u0002\u005c\u005d\u0003\u0002\u0002\u0002\u005d\u005f\u0003\u0002\u0002\u0002\u005e\u005c\u0003\u0002\u0002\u0002\u005f\u0060\u0007\u0013\u0002\u0002\u0060\u0017\u0003\u0002\u0002\u0002\u0061\u0063\u0005\u001a\u000e\u0002\u0062\u0061\u0003\u0002\u0002\u0002\u0062\u0063\u0003\u0002\u0002\u0002\u0063\u0065\u0003\u0002\u0002\u0002\u0064\u0066\u0005\u001c\u000f\u0002\u0065\u0064\u0003\u0002\u0002\u0002\u0065\u0066\u0003\u0002\u0002\u0002\u0066\u0067\u0003\u0002\u0002\u0002\u0067\u0068\u0005\u0010\u0009\u0002\u0068\u0069\u0007\u000f\u0002\u0002\u0069\u006a\u0005\u0010\u0009\u0002\u006a\u0076\u0003\u0002\u0002\u0002\u006b\u006d\u0005\u001a\u000e\u0002\u006c\u006b\u0003\u0002\u0002\u0002\u006c\u006d\u0003\u0002\u0002\u0002\u006d\u006f\u0003\u0002\u0002\u0002\u006e\u0070\u0005\u001c\u000f\u0002\u006f\u006e\u0003\u0002\u0002\u0002\u006f\u0070\u0003\u0002\u0002\u0002\u0070\u0071\u0003\u0002\u0002\u0002\u0071\u0072\u0005\u0010\u0009\u0002\u0072\u0073\u0007\u0010\u0002\u0002\u0073\u0074\u0005\u0010\u0009\u0002\u0074\u0076\u0003\u0002\u0002\u0002\u0075\u0062\u0003\u0002\u0002\u0002\u0075\u006c\u0003\u0002\u0002\u0002\u0076\u0019\u0003\u0002\u0002\u0002\u0077\u0078\u0007\u0011\u0002\u0002\u0078\u0079\u0007\u0019\u0002\u0002\u0079\u001b\u0003\u0002\u0002\u0002\u007a\u007c\u0007\u0014\u0002\u0002\u007b\u007d\u0005\u001e\u0010\u0002\u007c\u007b\u0003\u0002\u0002\u0002\u007d\u007e\u0003\u0002\u0002\u0002\u007e\u007c\u0003\u0002\u0002\u0002\u007e\u007f\u0003\u0002\u0002\u0002\u007f\u0080\u0003\u0002\u0002\u0002\u0080\u0081\u0007\u0015\u0002\u0002\u0081\u001d\u0003\u0002\u0002\u0002\u0082\u0085\u0005\u0024\u0013\u0002\u0083\u0084\u0007\u000f\u0002\u0002\u0084\u0086\u0005\u0010\u0009\u0002\u0085\u0083\u0003\u0002\u0002\u0002\u0085\u0086\u0003\u0002\u0002\u0002\u0086\u001f\u0003\u0002\u0002\u0002\u0087\u0088\u0005\u0008\u0005\u0002\u0088\u0089\u0007\u0018\u0002\u0002\u0089\u008b\u0003\u0002\u0002\u0002\u008a\u0087\u0003\u0002\u0002\u0002\u008a\u008b\u0003\u0002\u0002\u0002\u008b\u008c\u0003\u0002\u0002\u0002\u008c\u008d\u0005\u0024\u0013\u0002\u008d\u0021\u0003\u0002\u0002\u0002\u008e\u008f\u0007\u0008\u0002\u0002\u008f\u0090\u0005\u0024\u0013\u0002\u0090\u0023\u0003\u0002\u0002\u0002\u0091\u0092\u0009\u0004\u0002\u0002\u0092\u0025\u0003\u0002\u0002\u0002\u0012\u002b\u0030\u0034\u003a\u0042\u004c\u0052\u005c\u0062\u0065\u006c\u006f\u0075\u007e\u0085\u008a"

        val ATN = ATNDeserializer().deserialize(serializedATN.asCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val WS = Tokens.WS.id
    private val COMMENT = Tokens.COMMENT.id
    private val LINE_COMMENT = Tokens.LINE_COMMENT.id
    private val PACKAGE = Tokens.PACKAGE.id
    private val IMPORT = Tokens.IMPORT.id
    private val NEW = Tokens.NEW.id
    private val RTRUE = Tokens.RTRUE.id
    private val RFALSE = Tokens.RFALSE.id
    private val RINT = Tokens.RINT.id
    private val RDOUBLE = Tokens.RDOUBLE.id
    private val RSTRING = Tokens.RSTRING.id
    private val RBOOLEAN = Tokens.RBOOLEAN.id
    private val RARROW = Tokens.RARROW.id
    private val LARROW = Tokens.LARROW.id
    private val SHARP = Tokens.SHARP.id
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val LSQUARE = Tokens.LSQUARE.id
    private val RSQUARE = Tokens.RSQUARE.id
    private val LBRACE = Tokens.LBRACE.id
    private val RBRACE = Tokens.RBRACE.id
    private val DOT = Tokens.DOT.id
    private val ID = Tokens.ID.id
    private val OPID = Tokens.OPID.id
    private val Integer = Tokens.Integer.id
    private val Double = Tokens.Double.id
    private val String = Tokens.String.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class FileContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_file.id
	        set(value) { throw RuntimeException() }
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun findImport_() : Import_Context? = getRuleContext(solver.getType("Import_Context"),0)
		fun findFileCompo() : List<FileCompoContext> = getRuleContexts(solver.getType("FileCompoContext"))
		fun findFileCompo(i: Int) : FileCompoContext? = getRuleContext(solver.getType("FileCompoContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterFile(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitFile(this)
		}
	}

	fun  file() : FileContext {
		var _localctx : FileContext = FileContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_file.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 36
			package_()
			this.state = 37
			import_()
			this.state = 41
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl NEW) or (1L shl RTRUE) or (1L shl RFALSE) or (1L shl RINT) or (1L shl RDOUBLE) or (1L shl RSTRING) or (1L shl RBOOLEAN) or (1L shl SHARP) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 38
				fileCompo()
				}
				}
				this.state = 43
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FileCompoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fileCompo.id
	        set(value) { throw RuntimeException() }
		fun findNewType() : NewTypeContext? = getRuleContext(solver.getType("NewTypeContext"),0)
		fun findTheory() : TheoryContext? = getRuleContext(solver.getType("TheoryContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterFileCompo(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitFileCompo(this)
		}
	}

	fun  fileCompo() : FileCompoContext {
		var _localctx : FileCompoContext = FileCompoContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_fileCompo.id)
		try {
			this.state = 46
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			NEW  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 44
			newType()
			}}
			RTRUE , RFALSE , RINT , RDOUBLE , RSTRING , RBOOLEAN , SHARP , LPAREN , LSQUARE , ID , OPID , Integer , Double , String  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 45
			theory()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Package_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_package_.id
	        set(value) { throw RuntimeException() }
		fun PACKAGE() : TerminalNode? = getToken(EopseoParser.Tokens.PACKAGE.id, 0)
		fun findNamespace_() : Namespace_Context? = getRuleContext(solver.getType("Namespace_Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterPackage_(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitPackage_(this)
		}
	}

	fun  package_() : Package_Context {
		var _localctx : Package_Context = Package_Context(context, state)
		enterRule(_localctx, 4, Rules.RULE_package_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 50
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==PACKAGE) {
				if (true){
				this.state = 48
				match(PACKAGE) as Token
				this.state = 49
				namespace_()
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Namespace_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namespace_.id
	        set(value) { throw RuntimeException() }
		fun ID() : List<TerminalNode> = getTokens(EopseoParser.Tokens.ID.id)
		fun ID(i: Int) : TerminalNode = getToken(EopseoParser.Tokens.ID.id, i) as TerminalNode
		fun DOT() : List<TerminalNode> = getTokens(EopseoParser.Tokens.DOT.id)
		fun DOT(i: Int) : TerminalNode = getToken(EopseoParser.Tokens.DOT.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterNamespace_(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitNamespace_(this)
		}
	}

	fun  namespace_() : Namespace_Context {
		var _localctx : Namespace_Context = Namespace_Context(context, state)
		enterRule(_localctx, 6, Rules.RULE_namespace_.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 56
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,3,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 52
					match(ID) as Token
					this.state = 53
					match(DOT) as Token
					}
					} 
				}
				this.state = 58
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,3,context)
			}
			this.state = 59
			match(ID) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Import_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_import_.id
	        set(value) { throw RuntimeException() }
		fun findImportEx() : List<ImportExContext> = getRuleContexts(solver.getType("ImportExContext"))
		fun findImportEx(i: Int) : ImportExContext? = getRuleContext(solver.getType("ImportExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterImport_(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitImport_(this)
		}
	}

	fun  import_() : Import_Context {
		var _localctx : Import_Context = Import_Context(context, state)
		enterRule(_localctx, 8, Rules.RULE_import_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 64
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPORT) {
				if (true){
				if (true){
				this.state = 61
				importEx()
				}
				}
				this.state = 66
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ImportExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importEx.id
	        set(value) { throw RuntimeException() }
		fun IMPORT() : TerminalNode? = getToken(EopseoParser.Tokens.IMPORT.id, 0)
		fun findNamespace_() : Namespace_Context? = getRuleContext(solver.getType("Namespace_Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterImportEx(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitImportEx(this)
		}
	}

	fun  importEx() : ImportExContext {
		var _localctx : ImportExContext = ImportExContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_importEx.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 67
			match(IMPORT) as Token
			this.state = 68
			namespace_()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DefaultTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_defaultType.id
	        set(value) { throw RuntimeException() }
		fun Integer() : TerminalNode? = getToken(EopseoParser.Tokens.Integer.id, 0)
		fun Double() : TerminalNode? = getToken(EopseoParser.Tokens.Double.id, 0)
		fun String() : TerminalNode? = getToken(EopseoParser.Tokens.String.id, 0)
		fun findRBoolean() : RBooleanContext? = getRuleContext(solver.getType("RBooleanContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterDefaultType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitDefaultType(this)
		}
	}

	fun  defaultType() : DefaultTypeContext {
		var _localctx : DefaultTypeContext = DefaultTypeContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_defaultType.id)
		try {
			this.state = 74
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Integer  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 70
			match(Integer) as Token
			}}
			Double  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 71
			match(Double) as Token
			}}
			String  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 72
			match(String) as Token
			}}
			RTRUE , RFALSE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 73
			rBoolean()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypeExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeEx.id
	        set(value) { throw RuntimeException() }
		fun findDefaultType() : DefaultTypeContext? = getRuleContext(solver.getType("DefaultTypeContext"),0)
		fun findPrimitiveType() : PrimitiveTypeContext? = getRuleContext(solver.getType("PrimitiveTypeContext"),0)
		fun findReference() : ReferenceContext? = getRuleContext(solver.getType("ReferenceContext"),0)
		fun findTupleType() : TupleTypeContext? = getRuleContext(solver.getType("TupleTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterTypeEx(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitTypeEx(this)
		}
	}

	fun  typeEx() : TypeExContext {
		var _localctx : TypeExContext = TypeExContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_typeEx.id)
		try {
			this.state = 80
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			RTRUE , RFALSE , Integer , Double , String  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 76
			defaultType()
			}}
			RINT , RDOUBLE , RSTRING , RBOOLEAN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 77
			primitiveType()
			}}
			ID , OPID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 78
			reference()
			}}
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 79
			tupleType()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RBooleanContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rBoolean.id
	        set(value) { throw RuntimeException() }
		fun RTRUE() : TerminalNode? = getToken(EopseoParser.Tokens.RTRUE.id, 0)
		fun RFALSE() : TerminalNode? = getToken(EopseoParser.Tokens.RFALSE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterRBoolean(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitRBoolean(this)
		}
	}

	fun  rBoolean() : RBooleanContext {
		var _localctx : RBooleanContext = RBooleanContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_rBoolean.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 82
			_la = _input!!.LA(1)
			if ( !(_la==RTRUE || _la==RFALSE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PrimitiveTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_primitiveType.id
	        set(value) { throw RuntimeException() }
		fun RINT() : TerminalNode? = getToken(EopseoParser.Tokens.RINT.id, 0)
		fun RDOUBLE() : TerminalNode? = getToken(EopseoParser.Tokens.RDOUBLE.id, 0)
		fun RSTRING() : TerminalNode? = getToken(EopseoParser.Tokens.RSTRING.id, 0)
		fun RBOOLEAN() : TerminalNode? = getToken(EopseoParser.Tokens.RBOOLEAN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterPrimitiveType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitPrimitiveType(this)
		}
	}

	fun  primitiveType() : PrimitiveTypeContext {
		var _localctx : PrimitiveTypeContext = PrimitiveTypeContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_primitiveType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 84
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RINT) or (1L shl RDOUBLE) or (1L shl RSTRING) or (1L shl RBOOLEAN))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TupleTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tupleType.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(EopseoParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(EopseoParser.Tokens.RPAREN.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterTupleType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitTupleType(this)
		}
	}

	fun  tupleType() : TupleTypeContext {
		var _localctx : TupleTypeContext = TupleTypeContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_tupleType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 86
			match(LPAREN) as Token
			this.state = 90
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RTRUE) or (1L shl RFALSE) or (1L shl RINT) or (1L shl RDOUBLE) or (1L shl RSTRING) or (1L shl RBOOLEAN) or (1L shl LPAREN) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 87
				typeEx()
				}
				}
				this.state = 92
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 93
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TheoryContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_theory.id
	        set(value) { throw RuntimeException() }
		var inside: TypeExContext? = null
		var outside: TypeExContext? = null
		fun RARROW() : TerminalNode? = getToken(EopseoParser.Tokens.RARROW.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findForAll() : ForAllContext? = getRuleContext(solver.getType("ForAllContext"),0)
		fun LARROW() : TerminalNode? = getToken(EopseoParser.Tokens.LARROW.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterTheory(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitTheory(this)
		}
	}

	fun  theory() : TheoryContext {
		var _localctx : TheoryContext = TheoryContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_theory.id)
		var _la: Int
		try {
			this.state = 115
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,12,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 96
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 95
				compiledId()
				}
			}

			this.state = 99
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 98
				forAll()
				}
			}

			this.state = 101
			(_localctx as TheoryContext).inside = typeEx()
			this.state = 102
			match(RARROW) as Token
			this.state = 103
			(_localctx as TheoryContext).outside = typeEx()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 106
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 105
				compiledId()
				}
			}

			this.state = 109
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 108
				forAll()
				}
			}

			this.state = 111
			(_localctx as TheoryContext).outside = typeEx()
			this.state = 112
			match(LARROW) as Token
			this.state = 113
			(_localctx as TheoryContext).inside = typeEx()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CompiledIdContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_compiledId.id
	        set(value) { throw RuntimeException() }
		fun SHARP() : TerminalNode? = getToken(EopseoParser.Tokens.SHARP.id, 0)
		fun ID() : TerminalNode? = getToken(EopseoParser.Tokens.ID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterCompiledId(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitCompiledId(this)
		}
	}

	fun  compiledId() : CompiledIdContext {
		var _localctx : CompiledIdContext = CompiledIdContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_compiledId.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 117
			match(SHARP) as Token
			this.state = 118
			match(ID) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ForAllContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_forAll.id
	        set(value) { throw RuntimeException() }
		fun LSQUARE() : TerminalNode? = getToken(EopseoParser.Tokens.LSQUARE.id, 0)
		fun RSQUARE() : TerminalNode? = getToken(EopseoParser.Tokens.RSQUARE.id, 0)
		fun findForAllCompo() : List<ForAllCompoContext> = getRuleContexts(solver.getType("ForAllCompoContext"))
		fun findForAllCompo(i: Int) : ForAllCompoContext? = getRuleContext(solver.getType("ForAllCompoContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterForAll(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitForAll(this)
		}
	}

	fun  forAll() : ForAllContext {
		var _localctx : ForAllContext = ForAllContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_forAll.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 120
			match(LSQUARE) as Token
			this.state = 122 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 121
				forAllCompo()
				}
				}
				this.state = 124 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==ID || _la==OPID )
			this.state = 126
			match(RSQUARE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ForAllCompoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_forAllCompo.id
	        set(value) { throw RuntimeException() }
		fun findCommonId() : CommonIdContext? = getRuleContext(solver.getType("CommonIdContext"),0)
		fun RARROW() : TerminalNode? = getToken(EopseoParser.Tokens.RARROW.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterForAllCompo(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitForAllCompo(this)
		}
	}

	fun  forAllCompo() : ForAllCompoContext {
		var _localctx : ForAllCompoContext = ForAllCompoContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_forAllCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 128
			commonId()
			this.state = 131
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==RARROW) {
				if (true){
				this.state = 129
				match(RARROW) as Token
				this.state = 130
				typeEx()
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ReferenceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_reference.id
	        set(value) { throw RuntimeException() }
		fun findCommonId() : CommonIdContext? = getRuleContext(solver.getType("CommonIdContext"),0)
		fun findNamespace_() : Namespace_Context? = getRuleContext(solver.getType("Namespace_Context"),0)
		fun DOT() : TerminalNode? = getToken(EopseoParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterReference(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitReference(this)
		}
	}

	fun  reference() : ReferenceContext {
		var _localctx : ReferenceContext = ReferenceContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_reference.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 136
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,15,context) ) {
			1   -> if (true){
			this.state = 133
			namespace_()
			this.state = 134
			match(DOT) as Token
			}
			}
			this.state = 138
			commonId()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NewTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_newType.id
	        set(value) { throw RuntimeException() }
		fun NEW() : TerminalNode? = getToken(EopseoParser.Tokens.NEW.id, 0)
		fun findCommonId() : CommonIdContext? = getRuleContext(solver.getType("CommonIdContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterNewType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitNewType(this)
		}
	}

	fun  newType() : NewTypeContext {
		var _localctx : NewTypeContext = NewTypeContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_newType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 140
			match(NEW) as Token
			this.state = 141
			commonId()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CommonIdContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_commonId.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(EopseoParser.Tokens.ID.id, 0)
		fun OPID() : TerminalNode? = getToken(EopseoParser.Tokens.OPID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).enterCommonId(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is EopseoListener ) (listener as EopseoListener).exitCommonId(this)
		}
	}

	fun  commonId() : CommonIdContext {
		var _localctx : CommonIdContext = CommonIdContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_commonId.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 143
			_la = _input!!.LA(1)
			if ( !(_la==ID || _la==OPID) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

}