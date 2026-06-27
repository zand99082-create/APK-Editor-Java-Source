package jadx.core.utils;

import jadx.core.dex.attributes.AFlag;
import jadx.core.dex.attributes.IAttributeNode;
import jadx.core.dex.attributes.nodes.JadxErrorAttr;
import jadx.core.dex.nodes.ClassNode;
import jadx.core.dex.nodes.MethodNode;
import jadx.core.utils.exceptions.JadxOverflowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import org.p117d.C1799c;
import org.p117d.InterfaceC1790b;

/* JADX INFO: loaded from: classes.dex */
public class ErrorsCounter {
    private static final InterfaceC1790b LOG = C1799c.m4223a(ErrorsCounter.class);
    private final Set errorNodes = new HashSet();
    private int errorsCount;

    private void addError(IAttributeNode iAttributeNode, String str, Throwable th) {
        this.errorNodes.add(iAttributeNode);
        this.errorsCount++;
        if (th == null) {
            iAttributeNode.add(AFlag.INCONSISTENT_CODE);
            LOG.mo4202c(str);
            return;
        }
        if (th.getClass() == JadxOverflowException.class) {
            JadxOverflowException jadxOverflowException = new JadxOverflowException(th.getMessage());
            LOG.mo4204c("{}, message: {}", str, jadxOverflowException.getMessage());
            th = jadxOverflowException;
        } else {
            LOG.mo4200b(str, th);
        }
        iAttributeNode.addAttr(new JadxErrorAttr(th));
    }

    public static String classError(ClassNode classNode, String str) {
        return classError(classNode, str, null);
    }

    public static String classError(ClassNode classNode, String str, Throwable th) {
        String errorMsg = formatErrorMsg(classNode, str);
        classNode.dex().root().getErrorsCounter().addError(classNode, errorMsg, th);
        return errorMsg;
    }

    public static String formatErrorMsg(ClassNode classNode, String str) {
        return str + " in class: " + classNode;
    }

    public static String formatErrorMsg(MethodNode methodNode, String str) {
        return str + " in method: " + methodNode;
    }

    private String formatException(Throwable th) {
        return (th == null || th.getMessage() == null) ? "" : "\n error: " + th.getMessage();
    }

    public static String methodError(MethodNode methodNode, String str) {
        return methodError(methodNode, str, null);
    }

    public static String methodError(MethodNode methodNode, String str, Throwable th) {
        String errorMsg = formatErrorMsg(methodNode, str);
        methodNode.dex().root().getErrorsCounter().addError(methodNode, errorMsg, th);
        return errorMsg;
    }

    public String formatErrorMsg(ClassNode classNode, String str, Throwable th) {
        return formatErrorMsg(classNode, str) + formatException(th);
    }

    public String formatErrorMsg(MethodNode methodNode, String str, Throwable th) {
        return formatErrorMsg(methodNode, str) + formatException(th);
    }

    public int getErrorCount() {
        return this.errorsCount;
    }

    public void printReport() {
        if (getErrorCount() > 0) {
            LOG.mo4205d("{} errors occurred in following nodes:", Integer.valueOf(getErrorCount()));
            ArrayList arrayList = new ArrayList(this.errorNodes);
            Collections.sort(arrayList, new Comparator() { // from class: jadx.core.utils.ErrorsCounter.1
                @Override // java.util.Comparator
                public int compare(Object obj, Object obj2) {
                    return String.valueOf(obj).compareTo(String.valueOf(obj2));
                }
            });
            for (Object obj : arrayList) {
                LOG.mo4204c("  {}: {}", obj.getClass().getSimpleName().replace("Node", ""), obj);
            }
        }
    }

    public void reset() {
        this.errorNodes.clear();
        this.errorsCount = 0;
    }
}
