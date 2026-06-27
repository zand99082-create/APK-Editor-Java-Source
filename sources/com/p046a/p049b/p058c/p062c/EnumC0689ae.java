package com.p046a.p049b.p058c.p062c;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.InputDeviceCompat;
import com.p046a.p049b.p073h.InterfaceC0971s;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.a.b.c.c.ae */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0689ae implements InterfaceC0971s {

    /* JADX INFO: renamed from: w */
    private final int f1399w;

    /* JADX INFO: renamed from: x */
    private final String f1400x;

    /* JADX INFO: renamed from: y */
    private final String f1401y;

    /* JADX INFO: renamed from: a */
    public static final EnumC0689ae f1377a = new EnumC0689ae("TYPE_HEADER_ITEM", 0, 0, "header_item");

    /* JADX INFO: renamed from: b */
    public static final EnumC0689ae f1378b = new EnumC0689ae("TYPE_STRING_ID_ITEM", 1, 1, "string_id_item");

    /* JADX INFO: renamed from: c */
    public static final EnumC0689ae f1379c = new EnumC0689ae("TYPE_TYPE_ID_ITEM", 2, 2, "type_id_item");

    /* JADX INFO: renamed from: d */
    public static final EnumC0689ae f1380d = new EnumC0689ae("TYPE_PROTO_ID_ITEM", 3, 3, "proto_id_item");

    /* JADX INFO: renamed from: e */
    public static final EnumC0689ae f1381e = new EnumC0689ae("TYPE_FIELD_ID_ITEM", 4, 4, "field_id_item");

    /* JADX INFO: renamed from: f */
    public static final EnumC0689ae f1382f = new EnumC0689ae("TYPE_METHOD_ID_ITEM", 5, 5, "method_id_item");

    /* JADX INFO: renamed from: g */
    public static final EnumC0689ae f1383g = new EnumC0689ae("TYPE_CLASS_DEF_ITEM", 6, 6, "class_def_item");

    /* JADX INFO: renamed from: h */
    public static final EnumC0689ae f1384h = new EnumC0689ae("TYPE_MAP_LIST", 7, 4096, "map_list");

    /* JADX INFO: renamed from: i */
    public static final EnumC0689ae f1385i = new EnumC0689ae("TYPE_TYPE_LIST", 8, FragmentTransaction.TRANSIT_FRAGMENT_OPEN, "type_list");

    /* JADX INFO: renamed from: j */
    public static final EnumC0689ae f1386j = new EnumC0689ae("TYPE_ANNOTATION_SET_REF_LIST", 9, InputDeviceCompat.SOURCE_TOUCHSCREEN, "annotation_set_ref_list");

    /* JADX INFO: renamed from: k */
    public static final EnumC0689ae f1387k = new EnumC0689ae("TYPE_ANNOTATION_SET_ITEM", 10, FragmentTransaction.TRANSIT_FRAGMENT_FADE, "annotation_set_item");

    /* JADX INFO: renamed from: l */
    public static final EnumC0689ae f1388l = new EnumC0689ae("TYPE_CLASS_DATA_ITEM", 11, 8192, "class_data_item");

    /* JADX INFO: renamed from: m */
    public static final EnumC0689ae f1389m = new EnumC0689ae("TYPE_CODE_ITEM", 12, 8193, "code_item");

    /* JADX INFO: renamed from: n */
    public static final EnumC0689ae f1390n = new EnumC0689ae("TYPE_STRING_DATA_ITEM", 13, 8194, "string_data_item");

    /* JADX INFO: renamed from: o */
    public static final EnumC0689ae f1391o = new EnumC0689ae("TYPE_DEBUG_INFO_ITEM", 14, 8195, "debug_info_item");

    /* JADX INFO: renamed from: p */
    public static final EnumC0689ae f1392p = new EnumC0689ae("TYPE_ANNOTATION_ITEM", 15, 8196, "annotation_item");

    /* JADX INFO: renamed from: q */
    public static final EnumC0689ae f1393q = new EnumC0689ae("TYPE_ENCODED_ARRAY_ITEM", 16, 8197, "encoded_array_item");

    /* JADX INFO: renamed from: r */
    public static final EnumC0689ae f1394r = new EnumC0689ae("TYPE_ANNOTATIONS_DIRECTORY_ITEM", 17, 8198, "annotations_directory_item");

    /* JADX INFO: renamed from: s */
    public static final EnumC0689ae f1395s = new EnumC0689ae("TYPE_MAP_ITEM", 18, -1, "map_item");

    /* JADX INFO: renamed from: u */
    private static EnumC0689ae f1397u = new EnumC0689ae("TYPE_TYPE_ITEM", 19, -1, "type_item");

    /* JADX INFO: renamed from: v */
    private static EnumC0689ae f1398v = new EnumC0689ae("TYPE_EXCEPTION_HANDLER_ITEM", 20, -1, "exception_handler_item");

    /* JADX INFO: renamed from: t */
    public static final EnumC0689ae f1396t = new EnumC0689ae("TYPE_ANNOTATION_SET_REF_ITEM", 21, -1, "annotation_set_ref_item");

    static {
        EnumC0689ae[] enumC0689aeArr = {f1377a, f1378b, f1379c, f1380d, f1381e, f1382f, f1383g, f1384h, f1385i, f1386j, f1387k, f1388l, f1389m, f1390n, f1391o, f1392p, f1393q, f1394r, f1395s, f1397u, f1398v, f1396t};
    }

    private EnumC0689ae(String str, int i, int i2, String str2) {
        this.f1399w = i2;
        this.f1400x = str2;
        this.f1401y = (str2.endsWith("_item") ? str2.substring(0, str2.length() - 5) : str2).replace('_', ' ');
    }

    /* JADX INFO: renamed from: a */
    public final int m1317a() {
        return this.f1399w;
    }

    /* JADX INFO: renamed from: b */
    public final String m1318b() {
        return this.f1400x;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return this.f1401y;
    }
}
