// Generated from java-escape by ANTLR 4.7.1
package eopseox.parser

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EopseoParser}.
 */
interface EopseoListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EopseoParser#file}.
	 * @param ctx the parse tree
	 */
	fun enterFile(ctx: EopseoParser.FileContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#file}.
	 * @param ctx the parse tree
	 */
	fun exitFile(ctx: EopseoParser.FileContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#fileCompo}.
	 * @param ctx the parse tree
	 */
	fun enterFileCompo(ctx: EopseoParser.FileCompoContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#fileCompo}.
	 * @param ctx the parse tree
	 */
	fun exitFileCompo(ctx: EopseoParser.FileCompoContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#package_}.
	 * @param ctx the parse tree
	 */
	fun enterPackage_(ctx: EopseoParser.Package_Context)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#package_}.
	 * @param ctx the parse tree
	 */
	fun exitPackage_(ctx: EopseoParser.Package_Context)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#namespace_}.
	 * @param ctx the parse tree
	 */
	fun enterNamespace_(ctx: EopseoParser.Namespace_Context)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#namespace_}.
	 * @param ctx the parse tree
	 */
	fun exitNamespace_(ctx: EopseoParser.Namespace_Context)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#import_}.
	 * @param ctx the parse tree
	 */
	fun enterImport_(ctx: EopseoParser.Import_Context)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#import_}.
	 * @param ctx the parse tree
	 */
	fun exitImport_(ctx: EopseoParser.Import_Context)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#importEx}.
	 * @param ctx the parse tree
	 */
	fun enterImportEx(ctx: EopseoParser.ImportExContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#importEx}.
	 * @param ctx the parse tree
	 */
	fun exitImportEx(ctx: EopseoParser.ImportExContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#defaultType}.
	 * @param ctx the parse tree
	 */
	fun enterDefaultType(ctx: EopseoParser.DefaultTypeContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#defaultType}.
	 * @param ctx the parse tree
	 */
	fun exitDefaultType(ctx: EopseoParser.DefaultTypeContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#typeEx}.
	 * @param ctx the parse tree
	 */
	fun enterTypeEx(ctx: EopseoParser.TypeExContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#typeEx}.
	 * @param ctx the parse tree
	 */
	fun exitTypeEx(ctx: EopseoParser.TypeExContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#rBoolean}.
	 * @param ctx the parse tree
	 */
	fun enterRBoolean(ctx: EopseoParser.RBooleanContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#rBoolean}.
	 * @param ctx the parse tree
	 */
	fun exitRBoolean(ctx: EopseoParser.RBooleanContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	fun enterPrimitiveType(ctx: EopseoParser.PrimitiveTypeContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	fun exitPrimitiveType(ctx: EopseoParser.PrimitiveTypeContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#tupleType}.
	 * @param ctx the parse tree
	 */
	fun enterTupleType(ctx: EopseoParser.TupleTypeContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#tupleType}.
	 * @param ctx the parse tree
	 */
	fun exitTupleType(ctx: EopseoParser.TupleTypeContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#theory}.
	 * @param ctx the parse tree
	 */
	fun enterTheory(ctx: EopseoParser.TheoryContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#theory}.
	 * @param ctx the parse tree
	 */
	fun exitTheory(ctx: EopseoParser.TheoryContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#compiledId}.
	 * @param ctx the parse tree
	 */
	fun enterCompiledId(ctx: EopseoParser.CompiledIdContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#compiledId}.
	 * @param ctx the parse tree
	 */
	fun exitCompiledId(ctx: EopseoParser.CompiledIdContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#forAll}.
	 * @param ctx the parse tree
	 */
	fun enterForAll(ctx: EopseoParser.ForAllContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#forAll}.
	 * @param ctx the parse tree
	 */
	fun exitForAll(ctx: EopseoParser.ForAllContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#forAllCompo}.
	 * @param ctx the parse tree
	 */
	fun enterForAllCompo(ctx: EopseoParser.ForAllCompoContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#forAllCompo}.
	 * @param ctx the parse tree
	 */
	fun exitForAllCompo(ctx: EopseoParser.ForAllCompoContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#reference}.
	 * @param ctx the parse tree
	 */
	fun enterReference(ctx: EopseoParser.ReferenceContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#reference}.
	 * @param ctx the parse tree
	 */
	fun exitReference(ctx: EopseoParser.ReferenceContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#newType}.
	 * @param ctx the parse tree
	 */
	fun enterNewType(ctx: EopseoParser.NewTypeContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#newType}.
	 * @param ctx the parse tree
	 */
	fun exitNewType(ctx: EopseoParser.NewTypeContext)
	/**
	 * Enter a parse tree produced by {@link EopseoParser#commonId}.
	 * @param ctx the parse tree
	 */
	fun enterCommonId(ctx: EopseoParser.CommonIdContext)
	/**
	 * Exit a parse tree produced by {@link EopseoParser#commonId}.
	 * @param ctx the parse tree
	 */
	fun exitCommonId(ctx: EopseoParser.CommonIdContext)
}