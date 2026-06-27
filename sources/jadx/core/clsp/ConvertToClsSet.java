package jadx.core.clsp;

import jadx.api.JadxArgs;
import jadx.core.dex.nodes.RootNode;
import jadx.core.utils.files.InputFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.p117d.C1799c;
import org.p117d.InterfaceC1790b;

/* JADX INFO: loaded from: classes.dex */
public class ConvertToClsSet {
    private static final InterfaceC1790b LOG = C1799c.m4223a(ConvertToClsSet.class);

    private static void addFilesFromDirectory(File file, List list) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                addFilesFromDirectory(file2, list);
            }
            String name = file2.getName();
            if (name.endsWith(".dex") || name.endsWith(".jar") || name.endsWith(".apk")) {
                InputFile inputFile = new InputFile(file2);
                list.add(inputFile);
                while (inputFile.nextDexIndex != -1) {
                    InputFile inputFile2 = new InputFile(file2, inputFile.nextDexIndex);
                    list.add(inputFile2);
                    inputFile = inputFile2;
                }
            }
        }
    }

    public static void main(String[] strArr) {
        if (strArr.length < 2) {
            usage();
            System.exit(1);
        }
        File file = new File(strArr[0]);
        ArrayList arrayList = new ArrayList(strArr.length - 1);
        for (int i = 1; i < strArr.length; i++) {
            File file2 = new File(strArr[i]);
            if (file2.isDirectory()) {
                addFilesFromDirectory(file2, arrayList);
            } else {
                InputFile inputFile = new InputFile(file2);
                arrayList.add(inputFile);
                while (inputFile.nextDexIndex != -1) {
                    InputFile inputFile2 = new InputFile(file2, inputFile.nextDexIndex);
                    arrayList.add(inputFile2);
                    inputFile = inputFile2;
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LOG.mo4198b("Loaded: {}", ((InputFile) it.next()).getFile());
        }
        RootNode rootNode = new RootNode(new JadxArgs());
        rootNode.load(arrayList);
        ClsSet clsSet = new ClsSet();
        clsSet.load(rootNode);
        clsSet.save(file);
        LOG.mo4198b("Output: {}", file);
        LOG.mo4192a("done");
    }

    public static void usage() {
        LOG.mo4192a("<output .jcst or .jar file> <several input dex or jar files> ");
    }
}
