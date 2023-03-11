// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaDeltagramaParser}.
 */
public interface GramaticaDeltagramaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaDeltagramaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaDeltagramaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaDeltagramaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaDeltagramaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaDeltagramaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(GramaticaDeltagramaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaDeltagramaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(GramaticaDeltagramaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaDeltagramaParser#exp_sa}.
	 * @param ctx the parse tree
	 */
	void enterExp_sa(GramaticaDeltagramaParser.Exp_saContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaDeltagramaParser#exp_sa}.
	 * @param ctx the parse tree
	 */
	void exitExp_sa(GramaticaDeltagramaParser.Exp_saContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaDeltagramaParser#exp_se}.
	 * @param ctx the parse tree
	 */
	void enterExp_se(GramaticaDeltagramaParser.Exp_seContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaDeltagramaParser#exp_se}.
	 * @param ctx the parse tree
	 */
	void exitExp_se(GramaticaDeltagramaParser.Exp_seContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaDeltagramaParser#exp_senao}.
	 * @param ctx the parse tree
	 */
	void enterExp_senao(GramaticaDeltagramaParser.Exp_senaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaDeltagramaParser#exp_senao}.
	 * @param ctx the parse tree
	 */
	void exitExp_senao(GramaticaDeltagramaParser.Exp_senaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaDeltagramaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(GramaticaDeltagramaParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaDeltagramaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(GramaticaDeltagramaParser.InicioContext ctx);
}