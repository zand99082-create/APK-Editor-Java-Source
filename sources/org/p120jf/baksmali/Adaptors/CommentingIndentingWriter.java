package org.p120jf.baksmali.Adaptors;

import java.io.IOException;
import java.io.Writer;
import org.p120jf.util.IndentingWriter;

/* JADX INFO: loaded from: classes.dex */
public class CommentingIndentingWriter extends IndentingWriter {
    public CommentingIndentingWriter(Writer writer) {
        super(writer);
    }

    @Override // org.p120jf.util.IndentingWriter
    public void writeIndent() throws IOException {
        this.writer.write("# ");
        super.writeIndent();
    }
}
