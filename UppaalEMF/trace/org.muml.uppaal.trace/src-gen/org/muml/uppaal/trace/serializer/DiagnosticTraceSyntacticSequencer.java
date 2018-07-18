/*
 * generated by Xtext
 */
package org.muml.uppaal.trace.serializer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.muml.uppaal.trace.services.DiagnosticTraceGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class DiagnosticTraceSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DiagnosticTraceGrammarAccess grammarAccess;
	protected AbstractElementAlias match_State_ColonKeyword_1_q;
	protected AbstractElementAlias match_State_CommaKeyword_5_1_0_q;
	protected AbstractElementAlias match_TraceRepository_CannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0_q;
	protected AbstractElementAlias match_Trace_FormulaKeyword_1_1_or_PropertyKeyword_1_0;
	protected AbstractElementAlias match_Trace_ShowingCounterExampleKeyword_6_0_0_or_ShowingExampleTraceKeyword_6_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DiagnosticTraceGrammarAccess) access;
		match_State_ColonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getStateAccess().getColonKeyword_1());
		match_State_CommaKeyword_5_1_0_q = new TokenAlias(false, true, grammarAccess.getStateAccess().getCommaKeyword_5_1_0());
		match_TraceRepository_CannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0_q = new TokenAlias(false, true, grammarAccess.getTraceRepositoryAccess().getCannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0());
		match_Trace_FormulaKeyword_1_1_or_PropertyKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTraceAccess().getFormulaKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getTraceAccess().getPropertyKeyword_1_0()));
		match_Trace_ShowingCounterExampleKeyword_6_0_0_or_ShowingExampleTraceKeyword_6_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTraceAccess().getShowingCounterExampleKeyword_6_0_0()), new TokenAlias(false, false, grammarAccess.getTraceAccess().getShowingExampleTraceKeyword_6_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getTauSynchronizationRule())
			return getTauSynchronizationToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * TauSynchronization:
	 * 	'tau'
	 * ;
	 */
	protected String getTauSynchronizationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "tau";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_State_ColonKeyword_1_q.equals(syntax))
				emit_State_ColonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_State_CommaKeyword_5_1_0_q.equals(syntax))
				emit_State_CommaKeyword_5_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TraceRepository_CannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0_q.equals(syntax))
				emit_TraceRepository_CannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Trace_FormulaKeyword_1_1_or_PropertyKeyword_1_0.equals(syntax))
				emit_Trace_FormulaKeyword_1_1_or_PropertyKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Trace_ShowingCounterExampleKeyword_6_0_0_or_ShowingExampleTraceKeyword_6_0_1.equals(syntax))
				emit_Trace_ShowingCounterExampleKeyword_6_0_0_or_ShowingExampleTraceKeyword_6_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'State' (ambiguity) '(' locationActivities+=LocationActivity
	 */
	protected void emit_State_ColonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     variableValues+=VariableValue (ambiguity) variableValues+=VariableValue
	 */
	protected void emit_State_CommaKeyword_5_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Cannot reuse state space when trace length optimisation is used.'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) traces+=Trace
	 */
	protected void emit_TraceRepository_CannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'property' | 'formula'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Verifying' (ambiguity) property=INT
	 */
	protected void emit_Trace_FormulaKeyword_1_1_or_PropertyKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Showing counter example.' | 'Showing example trace.'
	 *
	 * This ambiguous syntax occurs at:
	 *     result=Result (ambiguity) traceItems+=TraceItem
	 */
	protected void emit_Trace_ShowingCounterExampleKeyword_6_0_0_or_ShowingExampleTraceKeyword_6_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}