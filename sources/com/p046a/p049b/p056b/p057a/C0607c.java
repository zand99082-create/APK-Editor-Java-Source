package com.p046a.p049b.p056b.p057a;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p056b.C0604a;
import com.p046a.p049b.p056b.C0614b;
import com.p046a.p049b.p058c.C0615a;
import com.p046a.p049b.p058c.p059a.C0616a;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: com.a.b.b.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0607c {
    private static final String INCREMENTAL_OPTION = "--incremental";
    private static final String INPUT_LIST_OPTION = "--input-list";
    private static final String MAIN_DEX_LIST_OPTION = "--main-dex-list";
    private static final String MINIMAL_MAIN_DEX_OPTION = "--minimal-main-dex";
    private static final String MULTI_DEX_OPTION = "--multi-dex";
    private static final String NUM_THREADS_OPTION = "--num-threads";
    public C0616a cfOptions$4cfd32cd;
    public C0615a dexOptions;
    public String[] fileNames;
    public boolean statistics;
    public boolean debug = false;
    public boolean verbose = false;
    public boolean verboseDump = false;
    public boolean coreLibrary = false;
    public String methodToDump = null;
    public int dumpWidth = 0;
    public String outName = null;
    public String humanOutName = null;
    public boolean strictNameCheck = true;
    public boolean emptyOk = false;
    public boolean jarOutput = false;
    public boolean keepClassesInJar = false;
    public int positionInfo = 2;
    public boolean localInfo = true;
    public boolean incremental = false;
    public boolean forceJumbo = false;
    public boolean optimize = true;
    public String optimizeListFile = null;
    public String dontOptimizeListFile = null;
    public int numThreads = 1;
    public boolean multiDex = false;
    public String mainDexListFile = null;
    public boolean minimalMainDex = false;
    private Set inputList = null;
    private int maxNumberOfIdxPerDex = 65536;

    /* JADX INFO: Access modifiers changed from: private */
    public void makeOptionsObjects() {
        this.cfOptions$4cfd32cd = new C0616a();
        this.cfOptions$4cfd32cd.f1015a = this.positionInfo;
        this.cfOptions$4cfd32cd.f1016b = this.localInfo;
        this.cfOptions$4cfd32cd.f1017c = this.strictNameCheck;
        this.cfOptions$4cfd32cd.f1018d = this.optimize;
        this.cfOptions$4cfd32cd.f1019e = this.optimizeListFile;
        this.cfOptions$4cfd32cd.f1020f = this.dontOptimizeListFile;
        this.cfOptions$4cfd32cd.f1021g = this.statistics;
        this.cfOptions$4cfd32cd.f1022h = C0604a.f989b;
        this.dexOptions = new C0615a();
        this.dexOptions.f1014c = this.forceJumbo;
    }

    public void parse(String[] strArr) {
        C0608d c0608d = new C0608d(strArr);
        boolean z = false;
        boolean z2 = false;
        while (c0608d.m1087c()) {
            if (c0608d.m1085a("--debug")) {
                this.debug = true;
            } else if (c0608d.m1085a("--verbose")) {
                this.verbose = true;
            } else if (c0608d.m1085a("--verbose-dump")) {
                this.verboseDump = true;
            } else if (c0608d.m1085a("--no-files")) {
                this.emptyOk = true;
            } else if (c0608d.m1085a("--no-optimize")) {
                this.optimize = false;
            } else if (c0608d.m1085a("--no-strict")) {
                this.strictNameCheck = false;
            } else if (c0608d.m1085a("--core-library")) {
                this.coreLibrary = true;
            } else if (c0608d.m1085a("--statistics")) {
                this.statistics = true;
            } else if (c0608d.m1085a("--optimize-list=")) {
                if (this.dontOptimizeListFile != null) {
                    System.err.println("--optimize-list and --no-optimize-list are incompatible.");
                    throw new C0614b();
                }
                this.optimize = true;
                this.optimizeListFile = c0608d.m1086b();
            } else if (c0608d.m1085a("--no-optimize-list=")) {
                if (this.dontOptimizeListFile != null) {
                    System.err.println("--optimize-list and --no-optimize-list are incompatible.");
                    throw new C0614b();
                }
                this.optimize = true;
                this.dontOptimizeListFile = c0608d.m1086b();
            } else if (c0608d.m1085a("--keep-classes")) {
                this.keepClassesInJar = true;
            } else if (c0608d.m1085a("--output=")) {
                this.outName = c0608d.m1086b();
                if (new File(this.outName).isDirectory()) {
                    this.jarOutput = false;
                    z2 = true;
                } else if (C1067a.m2537g(this.outName)) {
                    this.jarOutput = true;
                } else {
                    if (!this.outName.endsWith(".dex") && !this.outName.equals("-")) {
                        System.err.println("unknown output extension: " + this.outName);
                        throw new C0614b();
                    }
                    this.jarOutput = false;
                    z = true;
                }
            } else if (c0608d.m1085a("--dump-to=")) {
                this.humanOutName = c0608d.m1086b();
            } else if (c0608d.m1085a("--dump-width=")) {
                this.dumpWidth = Integer.parseInt(c0608d.m1086b());
            } else if (c0608d.m1085a("--dump-method=")) {
                this.methodToDump = c0608d.m1086b();
                this.jarOutput = false;
            } else if (c0608d.m1085a("--positions=")) {
                String strIntern = c0608d.m1086b().intern();
                if (strIntern == "none") {
                    this.positionInfo = 1;
                } else if (strIntern == "important") {
                    this.positionInfo = 3;
                } else {
                    if (strIntern != "lines") {
                        System.err.println("unknown positions option: " + strIntern);
                        throw new C0614b();
                    }
                    this.positionInfo = 2;
                }
            } else if (c0608d.m1085a("--no-locals")) {
                this.localInfo = false;
            } else if (c0608d.m1085a("--num-threads=")) {
                this.numThreads = Integer.parseInt(c0608d.m1086b());
            } else if (c0608d.m1085a(INCREMENTAL_OPTION)) {
                this.incremental = true;
            } else if (c0608d.m1085a("--force-jumbo")) {
                this.forceJumbo = true;
            } else if (c0608d.m1085a(MULTI_DEX_OPTION)) {
                this.multiDex = true;
            } else if (c0608d.m1085a("--main-dex-list=")) {
                this.mainDexListFile = c0608d.m1086b();
            } else if (c0608d.m1085a(MINIMAL_MAIN_DEX_OPTION)) {
                this.minimalMainDex = true;
            } else if (c0608d.m1085a("--set-max-idx-number=")) {
                this.maxNumberOfIdxPerDex = Integer.parseInt(c0608d.m1086b());
            } else {
                if (!c0608d.m1085a("--input-list=")) {
                    System.err.println("unknown option: " + c0608d.m1084a());
                    throw new C0614b();
                }
                File file = new File(c0608d.m1086b());
                try {
                    this.inputList = C0605a.m1075c(file.getAbsolutePath());
                } catch (IOException e) {
                    System.err.println("Unable to read input list file: " + file.getName());
                    throw new C0614b();
                }
            }
        }
        this.fileNames = c0608d.m1088d();
        if (this.inputList != null && !this.inputList.isEmpty()) {
            this.inputList.addAll(Arrays.asList(this.fileNames));
            this.fileNames = (String[]) this.inputList.toArray(new String[this.inputList.size()]);
        }
        if (this.fileNames.length == 0) {
            if (!this.emptyOk) {
                System.err.println("no input files specified");
                throw new C0614b();
            }
        } else if (this.emptyOk) {
            System.out.println("ignoring input files");
        }
        if (this.humanOutName == null && this.methodToDump != null) {
            this.humanOutName = "-";
        }
        if (this.mainDexListFile != null && !this.multiDex) {
            System.err.println("--main-dex-list is only supported in combination with --multi-dex");
            throw new C0614b();
        }
        if (this.minimalMainDex && (this.mainDexListFile == null || !this.multiDex)) {
            System.err.println("--minimal-main-dex is only supported in combination with --multi-dex and --main-dex-list");
            throw new C0614b();
        }
        if (this.multiDex && this.numThreads != 1) {
            System.out.println("--num-threads is ignored when used with --multi-dex");
            this.numThreads = 1;
        }
        if (this.multiDex && this.incremental) {
            System.err.println("--incremental is not supported with --multi-dex");
            throw new C0614b();
        }
        if (this.multiDex && z) {
            System.err.println("Unsupported output \"" + this.outName + "\". --multi-dex supports only archive or directory output");
            throw new C0614b();
        }
        if (z2 && !this.multiDex) {
            this.outName = new File(this.outName, "classes.dex").getPath();
        }
        makeOptionsObjects();
    }
}
