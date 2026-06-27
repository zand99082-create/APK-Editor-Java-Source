package p000a.p014d;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: a.d.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0089i {

    /* JADX INFO: renamed from: a */
    private static LinkedHashMap f254a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f254a = linkedHashMap;
        linkedHashMap.put("-aa", "Afar");
        f254a.put("-ab", "Abkhazian");
        f254a.put("-af", "Afrikaans");
        f254a.put("-ak", "Akan");
        f254a.put("-sq", "Albanian");
        f254a.put("-am", "Amharic");
        f254a.put("-ar", "Arabic");
        f254a.put("-an", "Aragonese");
        f254a.put("-hy", "Armenian");
        f254a.put("-as", "Assamese");
        f254a.put("-av", "Avaric");
        f254a.put("-ae", "Avestan");
        f254a.put("-ay", "Aymara");
        f254a.put("-az", "Azerbaijani");
        f254a.put("-ba", "Bashkir");
        f254a.put("-bm", "Bambara");
        f254a.put("-eu", "Basque");
        f254a.put("-be", "Belarusian");
        f254a.put("-bn", "Bengali");
        f254a.put("-bh", "Bihari languages+B372");
        f254a.put("-bi", "Bislama");
        f254a.put("-bo", "Tibetan");
        f254a.put("-bs", "Bosnian");
        f254a.put("-br", "Breton");
        f254a.put("-bg", "Bulgarian");
        f254a.put("-my", "Burmese");
        f254a.put("-ca", "Catalan; Valencian");
        f254a.put("-cs", "Czech");
        f254a.put("-ch", "Chamorro");
        f254a.put("-ce", "Chechen");
        f254a.put("-zh", "Chinese");
        f254a.put("cu", "Church Slavic; Old Slavonic; Church Slavonic; Old Bulgarian; Old Church Slavonic");
        f254a.put("-cv", "Chuvash");
        f254a.put("-kw", "Cornish");
        f254a.put("-co", "Corsican");
        f254a.put("-cr", "Cree");
        f254a.put("-cy", "Welsh");
        f254a.put("-cs", "Czech");
        f254a.put("-da", "Danish");
        f254a.put("-de", "German");
        f254a.put("-dv", "Divehi; Dhivehi; Maldivian");
        f254a.put("-nl", "Dutch; Flemish");
        f254a.put("-dz", "Dzongkha");
        f254a.put("-el", "Greek, Modern (1453-)");
        f254a.put("-en", "English");
        f254a.put("-eo", "Esperanto");
        f254a.put("-et", "Estonian");
        f254a.put("-eu", "Basque");
        f254a.put("-ee", "Ewe");
        f254a.put("-fo", "Faroese");
        f254a.put("-fa", "Persian");
        f254a.put("-fj", "Fijian");
        f254a.put("-fi", "Finnish");
        f254a.put("-fr", "French");
        f254a.put("-fy", "Western Frisian");
        f254a.put("-ff", "Fulah");
        f254a.put("-ka", "Georgian");
        f254a.put("-de", "German");
        f254a.put("-gd", "Gaelic; Scottish Gaelic");
        f254a.put("-ga", "Irish");
        f254a.put("-gl", "Galician");
        f254a.put("-gv", "Manx");
        f254a.put("-el", "Greek, Modern");
        f254a.put("-gn", "Guarani");
        f254a.put("-gu", "Gujarati");
        f254a.put("-ht", "Haitian; Haitian Creole");
        f254a.put("-ha", "Hausa");
        f254a.put("-iw", "Hebrew");
        f254a.put("-he", "Hebrew");
        f254a.put("-hz", "Herero");
        f254a.put("-hi", "Hindi");
        f254a.put("-ho", "Hiri Motu");
        f254a.put("-hr", "Croatian");
        f254a.put("-hu", "Hungarian");
        f254a.put("-hy", "Armenian");
        f254a.put("-ig", "Igbo");
        f254a.put("-is", "Icelandic");
        f254a.put("-io", "Ido");
        f254a.put("-ii", "Sichuan Yi; Nuosu");
        f254a.put("-iu", "Inuktitut");
        f254a.put("-ie", "Interlingue; Occidental");
        f254a.put("-ia", "Interlingua (International Auxiliary Language Association)");
        f254a.put("-in", "Indonesian");
        f254a.put("-in", "Indonesian");
        f254a.put("-ik", "Inupiaq");
        f254a.put("-is", "Icelandic");
        f254a.put("-it", "Italian");
        f254a.put("-jv", "Javanese");
        f254a.put("-ja", "Japanese");
        f254a.put("-kl", "Kalaallisut; Greenlandic");
        f254a.put("-kn", "Kannada");
        f254a.put("-ks", "Kashmiri");
        f254a.put("-ka", "Georgian");
        f254a.put("-kr", "Kanuri");
        f254a.put("-kk", "Kazakh");
        f254a.put("-km", "Central Khmer");
        f254a.put("-ki", "Kikuyu; Gikuyu");
        f254a.put("-rw", "Kinyarwanda");
        f254a.put("-ky", "Kirghiz; Kyrgyz");
        f254a.put("-kv", "Komi");
        f254a.put("-kg", "Kongo");
        f254a.put("-ko", "Korean");
        f254a.put("-kj", "Kuanyama; Kwanyama");
        f254a.put("-ku", "Kurdish");
        f254a.put("-lo", "Lao");
        f254a.put("-la", "Latin");
        f254a.put("-lv", "Latvian");
        f254a.put("-li", "Limburgan; Limburger; Limburgish");
        f254a.put("-ln", "Lingala");
        f254a.put("-lt", "Lithuanian");
        f254a.put("-lb", "Luxembourgish; Letzeburgesch");
        f254a.put("-lu", "Luba-Katanga");
        f254a.put("-lg", "Ganda");
        f254a.put("-mk", "Macedonian");
        f254a.put("-mh", "Marshallese");
        f254a.put("-ml", "Malayalam");
        f254a.put("-mi", "Maori");
        f254a.put("-mr", "Marathi");
        f254a.put("-ms", "Malay");
        f254a.put("-mk", "Macedonian");
        f254a.put("-mg", "Malagasy");
        f254a.put("-mt", "Maltese");
        f254a.put("-mn", "Mongolian");
        f254a.put("-mi", "Maori");
        f254a.put("-ms", "Malay");
        f254a.put("-my", "Burmese");
        f254a.put("-na", "Nauru");
        f254a.put("-nv", "Navajo; Navaho");
        f254a.put("-nr", "Ndebele, South; South Ndebele");
        f254a.put("-nd", "Ndebele, North; North Ndebele");
        f254a.put("-ng", "Ndonga");
        f254a.put("-ne", "Nepali");
        f254a.put("-nl", "Dutch; Flemish");
        f254a.put("-nn", "Norwegian Nynorsk; Nynorsk, Norwegian");
        f254a.put("-nb", "Bokmål, Norwegian; Norwegian Bokmål");
        f254a.put("-no", "Norwegian");
        f254a.put("-ny", "Chichewa; Chewa; Nyanja");
        f254a.put("-oc", "Occitan (post 1500)");
        f254a.put("-oj", "Ojibwa");
        f254a.put("-or", "Oriya");
        f254a.put("-om", "Oromo");
        f254a.put("-os", "Ossetian; Ossetic");
        f254a.put("-pa", "Panjabi; Punjabi");
        f254a.put("-fa", "Persian");
        f254a.put("-pi", "Pali");
        f254a.put("-pl", "Polish");
        f254a.put("-pt", "Portuguese");
        f254a.put("-ps", "Pushto; Pashto");
        f254a.put("-qu", "Quechua");
        f254a.put("-rm", "Romansh");
        f254a.put("-ro", "Romanian; Moldavian; Moldovan");
        f254a.put("-ro", "Romanian; Moldavian; Moldovan");
        f254a.put("-rn", "Rundi");
        f254a.put("-ru", "Russian");
        f254a.put("-sg", "Sango");
        f254a.put("-sa", "Sanskrit");
        f254a.put("-si", "Sinhala; Sinhalese");
        f254a.put("-sk", "Slovak");
        f254a.put("-sk", "Slovak");
        f254a.put("-sl", "Slovenian");
        f254a.put("-se", "Northern Sami");
        f254a.put("-sm", "Samoan");
        f254a.put("-sn", "Shona");
        f254a.put("-sd", "Sindhi");
        f254a.put("-so", "Somali");
        f254a.put("-st", "Sotho, Southern");
        f254a.put("-es", "Spanish; Castilian");
        f254a.put("-sq", "Albanian");
        f254a.put("-sc", "Sardinian");
        f254a.put("-sr", "Serbian");
        f254a.put("-ss", "Swati");
        f254a.put("-su", "Sundanese");
        f254a.put("-sw", "Swahili");
        f254a.put("-sv", "Swedish");
        f254a.put("-ty", "Tahitian");
        f254a.put("-ta", "Tamil");
        f254a.put("-tt", "Tatar");
        f254a.put("-te", "Telugu");
        f254a.put("-tg", "Tajik");
        f254a.put("-tl", "Tagalog");
        f254a.put("-th", "Thai");
        f254a.put("-bo", "Tibetan");
        f254a.put("-ti", "Tigrinya");
        f254a.put("-to", "Tonga (Tonga Islands)");
        f254a.put("-tn", "Tswana");
        f254a.put("-ts", "Tsonga");
        f254a.put("-tk", "Turkmen");
        f254a.put("-tr", "Turkish");
        f254a.put("-tw", "Twi");
        f254a.put("-ug", "Uighur; Uyghur");
        f254a.put("-uk", "Ukrainian");
        f254a.put("-ur", "Urdu");
        f254a.put("-uz", "Uzbek");
        f254a.put("-ve", "Venda");
        f254a.put("-vi", "Vietnamese");
        f254a.put("-vo", "Volapük");
        f254a.put("-cy", "Welsh");
        f254a.put("-wa", "Walloon");
        f254a.put("-wo", "Wolof");
        f254a.put("-xh", "Xhosa");
        f254a.put("-ji", "Yiddish");
        f254a.put("-yi", "Yiddish");
        f254a.put("-yo", "Yoruba");
        f254a.put("-za", "Zhuang; Chuang");
        f254a.put("-zh", "Chinese");
        f254a.put("-zu", "Zulu");
    }

    /* JADX INFO: renamed from: a */
    public static int m228a() {
        return f254a.size();
    }

    /* JADX INFO: renamed from: a */
    public static String m229a(String str) {
        if (str.equals("")) {
            return "[ Default ]";
        }
        int iIndexOf = str.indexOf(45, 1);
        String str2 = (String) f254a.get(iIndexOf != -1 ? str.substring(0, iIndexOf) : str);
        return str2 != null ? str2 + " (" + str + ")" : " (" + str + ")";
    }

    /* JADX INFO: renamed from: a */
    public static void m230a(String[] strArr, String[] strArr2) {
        int i = 0;
        Iterator it = f254a.entrySet().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i = i2 + 1;
        }
    }
}
