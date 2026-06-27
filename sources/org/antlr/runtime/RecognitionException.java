package org.antlr.runtime;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.PositionTrackingStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.TreeNodeStream;

/* JADX INFO: loaded from: classes.dex */
public class RecognitionException extends Exception {

    /* JADX INFO: renamed from: c */
    public int f5182c;
    public int charPositionInLine;
    public transient IntStream input;
    public int line;
    public Object node;
    public Token token;

    public RecognitionException() {
    }

    public RecognitionException(IntStream intStream) {
        this.input = intStream;
        intStream.index();
        if (intStream instanceof TokenStream) {
            Token tokenMo4166LT = ((TokenStream) intStream).mo4166LT(1);
            this.token = tokenMo4166LT;
            this.line = tokenMo4166LT.getLine();
            this.charPositionInLine = this.token.getCharPositionInLine();
        }
        if (intStream instanceof TreeNodeStream) {
            extractInformationFromTreeNodeStream(intStream);
            return;
        }
        if (!(intStream instanceof CharStream)) {
            this.f5182c = intStream.mo4165LA(1);
            return;
        }
        this.f5182c = intStream.mo4165LA(1);
        CharStream charStream = (CharStream) intStream;
        this.line = charStream.getLine();
        this.charPositionInLine = charStream.getCharPositionInLine();
    }

    public void extractInformationFromTreeNodeStream(IntStream intStream) {
        Object knownPositionElement;
        TreeNodeStream treeNodeStream = (TreeNodeStream) intStream;
        this.node = treeNodeStream.m4170LT(1);
        if (treeNodeStream instanceof PositionTrackingStream) {
            PositionTrackingStream positionTrackingStream = (PositionTrackingStream) treeNodeStream;
            knownPositionElement = positionTrackingStream.getKnownPositionElement(false);
            if (knownPositionElement == null) {
                knownPositionElement = positionTrackingStream.getKnownPositionElement(true);
            }
        } else {
            knownPositionElement = null;
        }
        TreeAdaptor treeAdaptor = treeNodeStream.getTreeAdaptor();
        if (knownPositionElement == null) {
            knownPositionElement = this.node;
        }
        Token token = treeAdaptor.getToken(knownPositionElement);
        if (token == null) {
            Object obj = this.node;
            if (!(obj instanceof Tree)) {
                this.token = new CommonToken(treeAdaptor.getType(obj), treeAdaptor.getText(this.node));
                return;
            }
            this.line = ((Tree) obj).getLine();
            this.charPositionInLine = ((Tree) this.node).getCharPositionInLine();
            Object obj2 = this.node;
            if (obj2 instanceof CommonTree) {
                this.token = ((CommonTree) obj2).token;
                return;
            }
            return;
        }
        this.token = token;
        if (token.getLine() > 0) {
            this.line = token.getLine();
            this.charPositionInLine = token.getCharPositionInLine();
            return;
        }
        Object objM4170LT = treeNodeStream.m4170LT(-1);
        int i = -1;
        while (objM4170LT != null) {
            Token token2 = treeAdaptor.getToken(objM4170LT);
            if (token2 != null && token2.getLine() > 0) {
                this.line = token2.getLine();
                this.charPositionInLine = token2.getCharPositionInLine();
                return;
            } else {
                i--;
                try {
                    objM4170LT = treeNodeStream.m4170LT(i);
                } catch (UnsupportedOperationException unused) {
                    objM4170LT = null;
                }
            }
        }
    }

    public int getUnexpectedType() {
        IntStream intStream = this.input;
        return intStream instanceof TokenStream ? this.token.getType() : intStream instanceof TreeNodeStream ? ((TreeNodeStream) intStream).getTreeAdaptor().getType(this.node) : this.f5182c;
    }
}
