package org.apache.commons.lang;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

class Entities
{
  private static final String[][] APOS_ARRAY;
  private static final String[][] BASIC_ARRAY;
  public static final Entities HTML32;
  public static final Entities HTML40;
  static final String[][] HTML40_ARRAY;
  static final String[][] ISO8859_1_ARRAY;
  public static final Entities XML;
  private final Entities.EntityMap map;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    String[][] arrayOfString = new String[i][];
    String[] arrayOfString1 = new String[k];
    arrayOfString1[0] = "quot";
    arrayOfString1[m] = "34";
    arrayOfString[0] = arrayOfString1;
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "amp";
    arrayOfString1[m] = "38";
    arrayOfString[m] = arrayOfString1;
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "lt";
    arrayOfString1[m] = "60";
    arrayOfString[k] = arrayOfString1;
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "gt";
    arrayOfString1[m] = "62";
    arrayOfString[j] = arrayOfString1;
    BASIC_ARRAY = arrayOfString;
    arrayOfString = new String[m][];
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "apos";
    arrayOfString1[m] = "39";
    arrayOfString[0] = arrayOfString1;
    APOS_ARRAY = arrayOfString;
    arrayOfString = new String[96][];
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "nbsp";
    arrayOfString1[m] = "160";
    arrayOfString[0] = arrayOfString1;
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "iexcl";
    arrayOfString1[m] = "161";
    arrayOfString[m] = arrayOfString1;
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "cent";
    arrayOfString1[m] = "162";
    arrayOfString[k] = arrayOfString1;
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "pound";
    arrayOfString1[m] = "163";
    arrayOfString[j] = arrayOfString1;
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "curren";
    arrayOfString1[m] = "164";
    arrayOfString[i] = arrayOfString1;
    String[] arrayOfString2 = new String[k];
    arrayOfString2[0] = "yen";
    arrayOfString2[m] = "165";
    arrayOfString[5] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "brvbar";
    arrayOfString2[m] = "166";
    arrayOfString[6] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sect";
    arrayOfString2[m] = "167";
    arrayOfString[7] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "uml";
    arrayOfString2[m] = "168";
    arrayOfString[8] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "copy";
    arrayOfString2[m] = "169";
    arrayOfString[9] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ordf";
    arrayOfString2[m] = "170";
    arrayOfString[10] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "laquo";
    arrayOfString2[m] = "171";
    arrayOfString[11] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "not";
    arrayOfString2[m] = "172";
    arrayOfString[12] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "shy";
    arrayOfString2[m] = "173";
    arrayOfString[13] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "reg";
    arrayOfString2[m] = "174";
    arrayOfString[14] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "macr";
    arrayOfString2[m] = "175";
    arrayOfString[15] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "deg";
    arrayOfString2[m] = "176";
    arrayOfString[16] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "plusmn";
    arrayOfString2[m] = "177";
    arrayOfString[17] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sup2";
    arrayOfString2[m] = "178";
    arrayOfString[18] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sup3";
    arrayOfString2[m] = "179";
    arrayOfString[19] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "acute";
    arrayOfString2[m] = "180";
    arrayOfString[20] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "micro";
    arrayOfString2[m] = "181";
    arrayOfString[21] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "para";
    arrayOfString2[m] = "182";
    arrayOfString[22] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "middot";
    arrayOfString2[m] = "183";
    arrayOfString[23] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "cedil";
    arrayOfString2[m] = "184";
    arrayOfString[24] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sup1";
    arrayOfString2[m] = "185";
    arrayOfString[25] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ordm";
    arrayOfString2[m] = "186";
    arrayOfString[26] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "raquo";
    arrayOfString2[m] = "187";
    arrayOfString[27] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "frac14";
    arrayOfString2[m] = "188";
    arrayOfString[28] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "frac12";
    arrayOfString2[m] = "189";
    arrayOfString[29] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "frac34";
    arrayOfString2[m] = "190";
    arrayOfString[30] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "iquest";
    arrayOfString2[m] = "191";
    arrayOfString[31] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Agrave";
    arrayOfString2[m] = "192";
    arrayOfString[32] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Aacute";
    arrayOfString2[m] = "193";
    arrayOfString[33] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Acirc";
    arrayOfString2[m] = "194";
    arrayOfString[34] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Atilde";
    arrayOfString2[m] = "195";
    arrayOfString[35] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Auml";
    arrayOfString2[m] = "196";
    arrayOfString[36] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Aring";
    arrayOfString2[m] = "197";
    arrayOfString[37] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "AElig";
    arrayOfString2[m] = "198";
    arrayOfString[38] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Ccedil";
    arrayOfString2[m] = "199";
    arrayOfString[39] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Egrave";
    arrayOfString2[m] = "200";
    arrayOfString[40] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Eacute";
    arrayOfString2[m] = "201";
    arrayOfString[41] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Ecirc";
    arrayOfString2[m] = "202";
    arrayOfString[42] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Euml";
    arrayOfString2[m] = "203";
    arrayOfString[43] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Igrave";
    arrayOfString2[m] = "204";
    arrayOfString[44] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Iacute";
    arrayOfString2[m] = "205";
    arrayOfString[45] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Icirc";
    arrayOfString2[m] = "206";
    arrayOfString[46] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Iuml";
    arrayOfString2[m] = "207";
    arrayOfString[47] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ETH";
    arrayOfString2[m] = "208";
    arrayOfString[48] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Ntilde";
    arrayOfString2[m] = "209";
    arrayOfString[49] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Ograve";
    arrayOfString2[m] = "210";
    arrayOfString[50] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Oacute";
    arrayOfString2[m] = "211";
    arrayOfString[51] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Ocirc";
    arrayOfString2[m] = "212";
    arrayOfString[52] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Otilde";
    arrayOfString2[m] = "213";
    arrayOfString[53] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Ouml";
    arrayOfString2[m] = "214";
    arrayOfString[54] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "times";
    arrayOfString2[m] = "215";
    arrayOfString[55] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Oslash";
    arrayOfString2[m] = "216";
    arrayOfString[56] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Ugrave";
    arrayOfString2[m] = "217";
    arrayOfString[57] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Uacute";
    arrayOfString2[m] = "218";
    arrayOfString[58] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Ucirc";
    arrayOfString2[m] = "219";
    arrayOfString[59] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Uuml";
    arrayOfString2[m] = "220";
    arrayOfString[60] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Yacute";
    arrayOfString2[m] = "221";
    arrayOfString[61] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "THORN";
    arrayOfString2[m] = "222";
    arrayOfString[62] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "szlig";
    arrayOfString2[m] = "223";
    arrayOfString[63] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "agrave";
    arrayOfString2[m] = "224";
    arrayOfString[64] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "aacute";
    arrayOfString2[m] = "225";
    arrayOfString[65] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "acirc";
    arrayOfString2[m] = "226";
    arrayOfString[66] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "atilde";
    arrayOfString2[m] = "227";
    arrayOfString[67] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "auml";
    arrayOfString2[m] = "228";
    arrayOfString[68] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "aring";
    arrayOfString2[m] = "229";
    arrayOfString[69] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "aelig";
    arrayOfString2[m] = "230";
    arrayOfString[70] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ccedil";
    arrayOfString2[m] = "231";
    arrayOfString[71] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "egrave";
    arrayOfString2[m] = "232";
    arrayOfString[72] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "eacute";
    arrayOfString2[m] = "233";
    arrayOfString[73] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ecirc";
    arrayOfString2[m] = "234";
    arrayOfString[74] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "euml";
    arrayOfString2[m] = "235";
    arrayOfString[75] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "igrave";
    arrayOfString2[m] = "236";
    arrayOfString[76] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "iacute";
    arrayOfString2[m] = "237";
    arrayOfString[77] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "icirc";
    arrayOfString2[m] = "238";
    arrayOfString[78] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "iuml";
    arrayOfString2[m] = "239";
    arrayOfString[79] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "eth";
    arrayOfString2[m] = "240";
    arrayOfString[80] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ntilde";
    arrayOfString2[m] = "241";
    arrayOfString[81] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ograve";
    arrayOfString2[m] = "242";
    arrayOfString[82] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "oacute";
    arrayOfString2[m] = "243";
    arrayOfString[83] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ocirc";
    arrayOfString2[m] = "244";
    arrayOfString[84] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "otilde";
    arrayOfString2[m] = "245";
    arrayOfString[85] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ouml";
    arrayOfString2[m] = "246";
    arrayOfString[86] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "divide";
    arrayOfString2[m] = "247";
    arrayOfString[87] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "oslash";
    arrayOfString2[m] = "248";
    arrayOfString[88] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ugrave";
    arrayOfString2[m] = "249";
    arrayOfString[89] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "uacute";
    arrayOfString2[m] = "250";
    arrayOfString[90] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ucirc";
    arrayOfString2[m] = "251";
    arrayOfString[91] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "uuml";
    arrayOfString2[m] = "252";
    arrayOfString[92] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "yacute";
    arrayOfString2[m] = "253";
    arrayOfString[93] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "thorn";
    arrayOfString2[m] = "254";
    arrayOfString[94] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "yuml";
    arrayOfString2[m] = "255";
    arrayOfString[95] = arrayOfString2;
    ISO8859_1_ARRAY = arrayOfString;
    arrayOfString = new String[''][];
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "fnof";
    arrayOfString1[m] = "402";
    arrayOfString[0] = arrayOfString1;
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "Alpha";
    arrayOfString1[m] = "913";
    arrayOfString[m] = arrayOfString1;
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "Beta";
    arrayOfString1[m] = "914";
    arrayOfString[k] = arrayOfString1;
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "Gamma";
    arrayOfString1[m] = "915";
    arrayOfString[j] = arrayOfString1;
    arrayOfString1 = new String[k];
    arrayOfString1[0] = "Delta";
    arrayOfString1[m] = "916";
    arrayOfString[i] = arrayOfString1;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Epsilon";
    arrayOfString2[m] = "917";
    arrayOfString[5] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Zeta";
    arrayOfString2[m] = "918";
    arrayOfString[6] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Eta";
    arrayOfString2[m] = "919";
    arrayOfString[7] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Theta";
    arrayOfString2[m] = "920";
    arrayOfString[8] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Iota";
    arrayOfString2[m] = "921";
    arrayOfString[9] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Kappa";
    arrayOfString2[m] = "922";
    arrayOfString[10] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Lambda";
    arrayOfString2[m] = "923";
    arrayOfString[11] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Mu";
    arrayOfString2[m] = "924";
    arrayOfString[12] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Nu";
    arrayOfString2[m] = "925";
    arrayOfString[13] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Xi";
    arrayOfString2[m] = "926";
    arrayOfString[14] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Omicron";
    arrayOfString2[m] = "927";
    arrayOfString[15] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Pi";
    arrayOfString2[m] = "928";
    arrayOfString[16] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Rho";
    arrayOfString2[m] = "929";
    arrayOfString[17] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Sigma";
    arrayOfString2[m] = "931";
    arrayOfString[18] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Tau";
    arrayOfString2[m] = "932";
    arrayOfString[19] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Upsilon";
    arrayOfString2[m] = "933";
    arrayOfString[20] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Phi";
    arrayOfString2[m] = "934";
    arrayOfString[21] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Chi";
    arrayOfString2[m] = "935";
    arrayOfString[22] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Psi";
    arrayOfString2[m] = "936";
    arrayOfString[23] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Omega";
    arrayOfString2[m] = "937";
    arrayOfString[24] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "alpha";
    arrayOfString2[m] = "945";
    arrayOfString[25] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "beta";
    arrayOfString2[m] = "946";
    arrayOfString[26] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "gamma";
    arrayOfString2[m] = "947";
    arrayOfString[27] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "delta";
    arrayOfString2[m] = "948";
    arrayOfString[28] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "epsilon";
    arrayOfString2[m] = "949";
    arrayOfString[29] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "zeta";
    arrayOfString2[m] = "950";
    arrayOfString[30] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "eta";
    arrayOfString2[m] = "951";
    arrayOfString[31] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "theta";
    arrayOfString2[m] = "952";
    arrayOfString[32] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "iota";
    arrayOfString2[m] = "953";
    arrayOfString[33] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "kappa";
    arrayOfString2[m] = "954";
    arrayOfString[34] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "lambda";
    arrayOfString2[m] = "955";
    arrayOfString[35] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "mu";
    arrayOfString2[m] = "956";
    arrayOfString[36] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "nu";
    arrayOfString2[m] = "957";
    arrayOfString[37] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "xi";
    arrayOfString2[m] = "958";
    arrayOfString[38] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "omicron";
    arrayOfString2[m] = "959";
    arrayOfString[39] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "pi";
    arrayOfString2[m] = "960";
    arrayOfString[40] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "rho";
    arrayOfString2[m] = "961";
    arrayOfString[41] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sigmaf";
    arrayOfString2[m] = "962";
    arrayOfString[42] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sigma";
    arrayOfString2[m] = "963";
    arrayOfString[43] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "tau";
    arrayOfString2[m] = "964";
    arrayOfString[44] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "upsilon";
    arrayOfString2[m] = "965";
    arrayOfString[45] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "phi";
    arrayOfString2[m] = "966";
    arrayOfString[46] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "chi";
    arrayOfString2[m] = "967";
    arrayOfString[47] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "psi";
    arrayOfString2[m] = "968";
    arrayOfString[48] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "omega";
    arrayOfString2[m] = "969";
    arrayOfString[49] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "thetasym";
    arrayOfString2[m] = "977";
    arrayOfString[50] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "upsih";
    arrayOfString2[m] = "978";
    arrayOfString[51] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "piv";
    arrayOfString2[m] = "982";
    arrayOfString[52] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "bull";
    arrayOfString2[m] = "8226";
    arrayOfString[53] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "hellip";
    arrayOfString2[m] = "8230";
    arrayOfString[54] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "prime";
    arrayOfString2[m] = "8242";
    arrayOfString[55] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Prime";
    arrayOfString2[m] = "8243";
    arrayOfString[56] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "oline";
    arrayOfString2[m] = "8254";
    arrayOfString[57] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "frasl";
    arrayOfString2[m] = "8260";
    arrayOfString[58] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "weierp";
    arrayOfString2[m] = "8472";
    arrayOfString[59] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "image";
    arrayOfString2[m] = "8465";
    arrayOfString[60] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "real";
    arrayOfString2[m] = "8476";
    arrayOfString[61] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "trade";
    arrayOfString2[m] = "8482";
    arrayOfString[62] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "alefsym";
    arrayOfString2[m] = "8501";
    arrayOfString[63] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "larr";
    arrayOfString2[m] = "8592";
    arrayOfString[64] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "uarr";
    arrayOfString2[m] = "8593";
    arrayOfString[65] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "rarr";
    arrayOfString2[m] = "8594";
    arrayOfString[66] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "darr";
    arrayOfString2[m] = "8595";
    arrayOfString[67] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "harr";
    arrayOfString2[m] = "8596";
    arrayOfString[68] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "crarr";
    arrayOfString2[m] = "8629";
    arrayOfString[69] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "lArr";
    arrayOfString2[m] = "8656";
    arrayOfString[70] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "uArr";
    arrayOfString2[m] = "8657";
    arrayOfString[71] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "rArr";
    arrayOfString2[m] = "8658";
    arrayOfString[72] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "dArr";
    arrayOfString2[m] = "8659";
    arrayOfString[73] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "hArr";
    arrayOfString2[m] = "8660";
    arrayOfString[74] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "forall";
    arrayOfString2[m] = "8704";
    arrayOfString[75] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "part";
    arrayOfString2[m] = "8706";
    arrayOfString[76] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "exist";
    arrayOfString2[m] = "8707";
    arrayOfString[77] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "empty";
    arrayOfString2[m] = "8709";
    arrayOfString[78] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "nabla";
    arrayOfString2[m] = "8711";
    arrayOfString[79] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "isin";
    arrayOfString2[m] = "8712";
    arrayOfString[80] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "notin";
    arrayOfString2[m] = "8713";
    arrayOfString[81] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ni";
    arrayOfString2[m] = "8715";
    arrayOfString[82] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "prod";
    arrayOfString2[m] = "8719";
    arrayOfString[83] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sum";
    arrayOfString2[m] = "8721";
    arrayOfString[84] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "minus";
    arrayOfString2[m] = "8722";
    arrayOfString[85] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "lowast";
    arrayOfString2[m] = "8727";
    arrayOfString[86] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "radic";
    arrayOfString2[m] = "8730";
    arrayOfString[87] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "prop";
    arrayOfString2[m] = "8733";
    arrayOfString[88] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "infin";
    arrayOfString2[m] = "8734";
    arrayOfString[89] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ang";
    arrayOfString2[m] = "8736";
    arrayOfString[90] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "and";
    arrayOfString2[m] = "8743";
    arrayOfString[91] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "or";
    arrayOfString2[m] = "8744";
    arrayOfString[92] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "cap";
    arrayOfString2[m] = "8745";
    arrayOfString[93] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "cup";
    arrayOfString2[m] = "8746";
    arrayOfString[94] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "int";
    arrayOfString2[m] = "8747";
    arrayOfString[95] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "there4";
    arrayOfString2[m] = "8756";
    arrayOfString[96] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sim";
    arrayOfString2[m] = "8764";
    arrayOfString[97] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "cong";
    arrayOfString2[m] = "8773";
    arrayOfString[98] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "asymp";
    arrayOfString2[m] = "8776";
    arrayOfString[99] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ne";
    arrayOfString2[m] = "8800";
    arrayOfString[100] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "equiv";
    arrayOfString2[m] = "8801";
    arrayOfString[101] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "le";
    arrayOfString2[m] = "8804";
    arrayOfString[102] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ge";
    arrayOfString2[m] = "8805";
    arrayOfString[103] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sub";
    arrayOfString2[m] = "8834";
    arrayOfString[104] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sup";
    arrayOfString2[m] = "8835";
    arrayOfString[105] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sube";
    arrayOfString2[m] = "8838";
    arrayOfString[106] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "supe";
    arrayOfString2[m] = "8839";
    arrayOfString[107] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "oplus";
    arrayOfString2[m] = "8853";
    arrayOfString[108] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "otimes";
    arrayOfString2[m] = "8855";
    arrayOfString[109] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "perp";
    arrayOfString2[m] = "8869";
    arrayOfString[110] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sdot";
    arrayOfString2[m] = "8901";
    arrayOfString[111] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "lceil";
    arrayOfString2[m] = "8968";
    arrayOfString[112] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "rceil";
    arrayOfString2[m] = "8969";
    arrayOfString[113] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "lfloor";
    arrayOfString2[m] = "8970";
    arrayOfString[114] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "rfloor";
    arrayOfString2[m] = "8971";
    arrayOfString[115] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "lang";
    arrayOfString2[m] = "9001";
    arrayOfString[116] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "rang";
    arrayOfString2[m] = "9002";
    arrayOfString[117] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "loz";
    arrayOfString2[m] = "9674";
    arrayOfString[118] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "spades";
    arrayOfString2[m] = "9824";
    arrayOfString[119] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "clubs";
    arrayOfString2[m] = "9827";
    arrayOfString[120] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "hearts";
    arrayOfString2[m] = "9829";
    arrayOfString[121] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "diams";
    arrayOfString2[m] = "9830";
    arrayOfString[122] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "OElig";
    arrayOfString2[m] = "338";
    arrayOfString[123] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "oelig";
    arrayOfString2[m] = "339";
    arrayOfString[124] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Scaron";
    arrayOfString2[m] = "352";
    arrayOfString[125] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "scaron";
    arrayOfString2[m] = "353";
    arrayOfString[126] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Yuml";
    arrayOfString2[m] = "376";
    arrayOfString[127] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "circ";
    arrayOfString2[m] = "710";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "tilde";
    arrayOfString2[m] = "732";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ensp";
    arrayOfString2[m] = "8194";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "emsp";
    arrayOfString2[m] = "8195";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "thinsp";
    arrayOfString2[m] = "8201";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "zwnj";
    arrayOfString2[m] = "8204";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "zwj";
    arrayOfString2[m] = "8205";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "lrm";
    arrayOfString2[m] = "8206";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "rlm";
    arrayOfString2[m] = "8207";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ndash";
    arrayOfString2[m] = "8211";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "mdash";
    arrayOfString2[m] = "8212";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "lsquo";
    arrayOfString2[m] = "8216";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "rsquo";
    arrayOfString2[m] = "8217";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "sbquo";
    arrayOfString2[m] = "8218";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "ldquo";
    arrayOfString2[m] = "8220";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "rdquo";
    arrayOfString2[m] = "8221";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "bdquo";
    arrayOfString2[m] = "8222";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "dagger";
    arrayOfString2[m] = "8224";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "Dagger";
    arrayOfString2[m] = "8225";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "permil";
    arrayOfString2[m] = "8240";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "lsaquo";
    arrayOfString2[m] = "8249";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "rsaquo";
    arrayOfString2[m] = "8250";
    arrayOfString[''] = arrayOfString2;
    arrayOfString2 = new String[k];
    arrayOfString2[0] = "euro";
    arrayOfString2[m] = "8364";
    arrayOfString[''] = arrayOfString2;
    HTML40_ARRAY = arrayOfString;
    Entities localEntities1 = new org/apache/commons/lang/Entities;
    localEntities1.<init>();
    arrayOfString = BASIC_ARRAY;
    localEntities1.addEntities(arrayOfString);
    arrayOfString = APOS_ARRAY;
    localEntities1.addEntities(arrayOfString);
    XML = localEntities1;
    Entities localEntities2 = new org/apache/commons/lang/Entities;
    localEntities2.<init>();
    arrayOfString = BASIC_ARRAY;
    localEntities2.addEntities(arrayOfString);
    arrayOfString = ISO8859_1_ARRAY;
    localEntities2.addEntities(arrayOfString);
    HTML32 = localEntities2;
    Entities localEntities3 = new org/apache/commons/lang/Entities;
    localEntities3.<init>();
    fillWithHtml40Entities(localEntities3);
    HTML40 = localEntities3;
  }
  
  public Entities()
  {
    Entities.LookupEntityMap localLookupEntityMap = new org/apache/commons/lang/Entities$LookupEntityMap;
    localLookupEntityMap.<init>();
    this.map = localLookupEntityMap;
  }
  
  Entities(Entities.EntityMap paramEntityMap)
  {
    this.map = paramEntityMap;
  }
  
  private StringWriter createStringWriter(String paramString)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    double d1 = paramString.length();
    double d2 = paramString.length() * 0.1D;
    int i = (int)(d1 + d2);
    localStringWriter.<init>(i);
    return localStringWriter;
  }
  
  private void doUnescape(Writer paramWriter, String paramString, int paramInt)
  {
    int i = 0;
    String str1 = null;
    paramWriter.write(paramString, 0, paramInt);
    int j = paramString.length();
    int k = paramInt;
    if (k < j)
    {
      int m = paramString.charAt(k);
      i = 38;
      int n;
      int i1;
      if (m == i)
      {
        n = k + 1;
        i1 = paramString.indexOf(';', n);
        i = -1;
        if (i1 == i) {
          paramWriter.write(m);
        }
      }
      for (;;)
      {
        k += 1;
        break;
        int i2 = k + 1;
        int i3 = paramString.indexOf('&', i2);
        i = -1;
        if ((i3 != i) && (i3 < i1))
        {
          paramWriter.write(m);
        }
        else
        {
          String str2 = paramString.substring(n, i1);
          int i4 = -1;
          int i5 = str2.length();
          if (i5 > 0)
          {
            str1 = null;
            i = str2.charAt(0);
            i2 = 35;
            if (i != i2) {
              break label341;
            }
            i = 1;
            if (i5 > i)
            {
              i = 1;
              int i6 = str2.charAt(i);
              switch (i6)
              {
              default: 
                i = 1;
              }
            }
          }
          try
          {
            str1 = str2.substring(i);
            i2 = 10;
            i4 = Integer.parseInt(str1, i2);
            label253:
            i = (char)-1;
            if (i4 > i) {
              i4 = -1;
            }
          }
          catch (NumberFormatException localNumberFormatException)
          {
            for (;;)
            {
              label267:
              i4 = -1;
            }
          }
          i = -1;
          if (i4 == i)
          {
            paramWriter.write(38);
            paramWriter.write(str2);
            i = 59;
            paramWriter.write(i);
          }
          for (;;)
          {
            k = i1;
            break;
            i = 2;
            str1 = str2.substring(i);
            i2 = 16;
            i4 = Integer.parseInt(str1, i2);
            break label253;
            label341:
            i4 = entityValue(str2);
            break label267;
            paramWriter.write(i4);
          }
          paramWriter.write(m);
        }
      }
    }
  }
  
  static void fillWithHtml40Entities(Entities paramEntities)
  {
    String[][] arrayOfString = BASIC_ARRAY;
    paramEntities.addEntities(arrayOfString);
    arrayOfString = ISO8859_1_ARRAY;
    paramEntities.addEntities(arrayOfString);
    arrayOfString = HTML40_ARRAY;
    paramEntities.addEntities(arrayOfString);
  }
  
  public void addEntities(String[][] paramArrayOfString)
  {
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfString.length;
      if (i >= j) {
        break;
      }
      String str = paramArrayOfString[i][0];
      Object localObject = paramArrayOfString[i];
      int k = 1;
      localObject = localObject[k];
      int m = Integer.parseInt((String)localObject);
      addEntity(str, m);
      i += 1;
    }
  }
  
  public void addEntity(String paramString, int paramInt)
  {
    this.map.add(paramString, paramInt);
  }
  
  public String entityName(int paramInt)
  {
    return this.map.name(paramInt);
  }
  
  public int entityValue(String paramString)
  {
    return this.map.value(paramString);
  }
  
  public String escape(String paramString)
  {
    StringWriter localStringWriter = createStringWriter(paramString);
    try
    {
      escape(localStringWriter, paramString);
      return localStringWriter.toString();
    }
    catch (IOException localIOException)
    {
      UnhandledException localUnhandledException = new org/apache/commons/lang/UnhandledException;
      localUnhandledException.<init>(localIOException);
      throw localUnhandledException;
    }
  }
  
  public void escape(Writer paramWriter, String paramString)
  {
    int i = 59;
    int j = paramString.length();
    int k = 0;
    if (k < j)
    {
      int m = paramString.charAt(k);
      String str1 = entityName(m);
      int n;
      if (str1 == null)
      {
        n = 127;
        if (m > n)
        {
          paramWriter.write("&#");
          n = 10;
          String str2 = Integer.toString(m, n);
          paramWriter.write(str2);
          paramWriter.write(i);
        }
      }
      for (;;)
      {
        k += 1;
        break;
        paramWriter.write(m);
        continue;
        n = 38;
        paramWriter.write(n);
        paramWriter.write(str1);
        paramWriter.write(i);
      }
    }
  }
  
  public String unescape(String paramString)
  {
    int i = 38;
    int j = paramString.indexOf(i);
    if (j < 0) {}
    for (;;)
    {
      return paramString;
      StringWriter localStringWriter = createStringWriter(paramString);
      try
      {
        doUnescape(localStringWriter, paramString, j);
        paramString = localStringWriter.toString();
      }
      catch (IOException localIOException)
      {
        UnhandledException localUnhandledException = new org/apache/commons/lang/UnhandledException;
        localUnhandledException.<init>(localIOException);
        throw localUnhandledException;
      }
    }
  }
  
  public void unescape(Writer paramWriter, String paramString)
  {
    int i = 38;
    int j = paramString.indexOf(i);
    if (j < 0) {
      paramWriter.write(paramString);
    }
    for (;;)
    {
      return;
      doUnescape(paramWriter, paramString, j);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/Entities.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */