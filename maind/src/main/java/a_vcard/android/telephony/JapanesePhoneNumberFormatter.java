package a_vcard.android.telephony;

import a_vcard.android.text.Editable;

class JapanesePhoneNumberFormatter
{
  private static short[] FORMAT_MAP;
  
  static
  {
    short[] arrayOfShort = new short['Ұ'];
    arrayOfShort[0] = -100;
    arrayOfShort[1] = 10;
    arrayOfShort[2] = 'Ü';
    arrayOfShort[3] = -15;
    arrayOfShort[4] = 'ƚ';
    arrayOfShort[5] = 'Ȓ';
    arrayOfShort[6] = -15;
    arrayOfShort[7] = 'ʞ';
    arrayOfShort[8] = '̌';
    arrayOfShort[9] = 'Ф';
    arrayOfShort[10] = -100;
    arrayOfShort[11] = -25;
    arrayOfShort[12] = 20;
    arrayOfShort[13] = 40;
    arrayOfShort[14] = 70;
    arrayOfShort[15] = 100;
    arrayOfShort[16] = '';
    arrayOfShort[17] = '¾';
    arrayOfShort[18] = 'È';
    arrayOfShort[19] = 'Ò';
    arrayOfShort[20] = -36;
    arrayOfShort[21] = -100;
    arrayOfShort[22] = -100;
    arrayOfShort[23] = -35;
    arrayOfShort[24] = -35;
    arrayOfShort[25] = -35;
    arrayOfShort[26] = 30;
    arrayOfShort[27] = -100;
    arrayOfShort[28] = -100;
    arrayOfShort[29] = -100;
    arrayOfShort[30] = -35;
    arrayOfShort[31] = -35;
    arrayOfShort[32] = -35;
    arrayOfShort[33] = -35;
    arrayOfShort[34] = -35;
    arrayOfShort[35] = -35;
    arrayOfShort[36] = -35;
    arrayOfShort[37] = -45;
    arrayOfShort[38] = -35;
    arrayOfShort[39] = -35;
    arrayOfShort[40] = -100;
    arrayOfShort[41] = -100;
    arrayOfShort[42] = -100;
    arrayOfShort[43] = -35;
    arrayOfShort[44] = -35;
    arrayOfShort[45] = -35;
    arrayOfShort[46] = -35;
    arrayOfShort[47] = 50;
    arrayOfShort[48] = -35;
    arrayOfShort[49] = 60;
    arrayOfShort[50] = -35;
    arrayOfShort[51] = -35;
    arrayOfShort[52] = -45;
    arrayOfShort[53] = -35;
    arrayOfShort[54] = -45;
    arrayOfShort[55] = -35;
    arrayOfShort[56] = -35;
    arrayOfShort[57] = -45;
    arrayOfShort[58] = -35;
    arrayOfShort[59] = -35;
    arrayOfShort[60] = -35;
    arrayOfShort[61] = -35;
    arrayOfShort[62] = -45;
    arrayOfShort[63] = -35;
    arrayOfShort[64] = -35;
    arrayOfShort[65] = -35;
    arrayOfShort[66] = -35;
    arrayOfShort[67] = -45;
    arrayOfShort[68] = -45;
    arrayOfShort[69] = -35;
    arrayOfShort[70] = -100;
    arrayOfShort[71] = -100;
    arrayOfShort[72] = -35;
    arrayOfShort[73] = -35;
    arrayOfShort[74] = -35;
    arrayOfShort[75] = 80;
    arrayOfShort[76] = 90;
    arrayOfShort[77] = -100;
    arrayOfShort[78] = -100;
    arrayOfShort[79] = -100;
    arrayOfShort[80] = -35;
    arrayOfShort[81] = -35;
    arrayOfShort[82] = -35;
    arrayOfShort[83] = -35;
    arrayOfShort[84] = -35;
    arrayOfShort[85] = -35;
    arrayOfShort[86] = -45;
    arrayOfShort[87] = -45;
    arrayOfShort[88] = -35;
    arrayOfShort[89] = -35;
    arrayOfShort[90] = -35;
    arrayOfShort[91] = -35;
    arrayOfShort[92] = -35;
    arrayOfShort[93] = -35;
    arrayOfShort[94] = -35;
    arrayOfShort[95] = -35;
    arrayOfShort[96] = -45;
    arrayOfShort[97] = -35;
    arrayOfShort[98] = -35;
    arrayOfShort[99] = -35;
    arrayOfShort[100] = -25;
    arrayOfShort[101] = -25;
    arrayOfShort[102] = -35;
    arrayOfShort[103] = -35;
    arrayOfShort[104] = 110;
    arrayOfShort[105] = 120;
    arrayOfShort[106] = '';
    arrayOfShort[107] = -35;
    arrayOfShort[108] = '';
    arrayOfShort[109] = -25;
    arrayOfShort[110] = -35;
    arrayOfShort[111] = -25;
    arrayOfShort[112] = -35;
    arrayOfShort[113] = -35;
    arrayOfShort[114] = -35;
    arrayOfShort[115] = -35;
    arrayOfShort[116] = -35;
    arrayOfShort[117] = -45;
    arrayOfShort[118] = -25;
    arrayOfShort[119] = -35;
    arrayOfShort[120] = -35;
    arrayOfShort[121] = -25;
    arrayOfShort[122] = -35;
    arrayOfShort[123] = -35;
    arrayOfShort[124] = -35;
    arrayOfShort[125] = -35;
    arrayOfShort[126] = -35;
    arrayOfShort[127] = -25;
    arrayOfShort[''] = -45;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -45;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -45;
    arrayOfShort[''] = -45;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -100;
    arrayOfShort[''] = -100;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = ' ';
    arrayOfShort[''] = 'ª';
    arrayOfShort[''] = '´';
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -35;
    arrayOfShort[''] = -100;
    arrayOfShort[''] = -100;
    arrayOfShort[' '] = -35;
    arrayOfShort['¡'] = -35;
    arrayOfShort['¢'] = -45;
    arrayOfShort['£'] = -35;
    arrayOfShort['¤'] = -45;
    arrayOfShort['¥'] = -45;
    arrayOfShort['¦'] = -35;
    arrayOfShort['§'] = -35;
    arrayOfShort['¨'] = -35;
    arrayOfShort['©'] = -35;
    arrayOfShort['ª'] = -35;
    arrayOfShort['«'] = -35;
    arrayOfShort['¬'] = -35;
    arrayOfShort['­'] = -35;
    arrayOfShort['®'] = -35;
    arrayOfShort['¯'] = -35;
    arrayOfShort['°'] = -35;
    arrayOfShort['±'] = -35;
    arrayOfShort['²'] = -45;
    arrayOfShort['³'] = -35;
    arrayOfShort['´'] = -35;
    arrayOfShort['µ'] = -35;
    arrayOfShort['¶'] = -35;
    arrayOfShort['·'] = -35;
    arrayOfShort['¸'] = -45;
    arrayOfShort['¹'] = -45;
    arrayOfShort['º'] = -45;
    arrayOfShort['»'] = -35;
    arrayOfShort['¼'] = -45;
    arrayOfShort['½'] = -35;
    arrayOfShort['¾'] = -25;
    arrayOfShort['¿'] = -25;
    arrayOfShort['À'] = -35;
    arrayOfShort['Á'] = -35;
    arrayOfShort['Â'] = -35;
    arrayOfShort['Ã'] = -35;
    arrayOfShort['Ä'] = -35;
    arrayOfShort['Å'] = -25;
    arrayOfShort['Æ'] = -35;
    arrayOfShort['Ç'] = -35;
    arrayOfShort['È'] = -25;
    arrayOfShort['É'] = -25;
    arrayOfShort['Ê'] = -35;
    arrayOfShort['Ë'] = -35;
    arrayOfShort['Ì'] = -35;
    arrayOfShort['Í'] = -35;
    arrayOfShort['Î'] = -35;
    arrayOfShort['Ï'] = -35;
    arrayOfShort['Ð'] = -25;
    arrayOfShort['Ñ'] = -25;
    arrayOfShort['Ò'] = -25;
    arrayOfShort['Ó'] = -35;
    arrayOfShort['Ô'] = -35;
    arrayOfShort['Õ'] = -35;
    arrayOfShort['Ö'] = -35;
    arrayOfShort['×'] = -35;
    arrayOfShort['Ø'] = -25;
    arrayOfShort['Ù'] = -35;
    arrayOfShort['Ú'] = -35;
    arrayOfShort['Û'] = -25;
    arrayOfShort['Ü'] = -100;
    arrayOfShort['Ý'] = -100;
    arrayOfShort['Þ'] = 'æ';
    arrayOfShort['ß'] = 'ú';
    arrayOfShort['à'] = 'Ą';
    arrayOfShort['á'] = 'Ď';
    arrayOfShort['â'] = 'ŀ';
    arrayOfShort['ã'] = 'Ŕ';
    arrayOfShort['ä'] = 'Ũ';
    arrayOfShort['å'] = 'Ɔ';
    arrayOfShort['æ'] = -35;
    arrayOfShort['ç'] = -25;
    arrayOfShort['è'] = -25;
    arrayOfShort['é'] = 'ð';
    arrayOfShort['ê'] = -35;
    arrayOfShort['ë'] = -35;
    arrayOfShort['ì'] = -35;
    arrayOfShort['í'] = -25;
    arrayOfShort['î'] = -35;
    arrayOfShort['ï'] = -35;
    arrayOfShort['ð'] = -25;
    arrayOfShort['ñ'] = -35;
    arrayOfShort['ò'] = -35;
    arrayOfShort['ó'] = -35;
    arrayOfShort['ô'] = -25;
    arrayOfShort['õ'] = -25;
    arrayOfShort['ö'] = -25;
    arrayOfShort['÷'] = -25;
    arrayOfShort['ø'] = -25;
    arrayOfShort['ù'] = -25;
    arrayOfShort['ú'] = -25;
    arrayOfShort['û'] = -25;
    arrayOfShort['ü'] = -25;
    arrayOfShort['ý'] = -35;
    arrayOfShort['þ'] = -35;
    arrayOfShort['ÿ'] = -35;
    arrayOfShort['Ā'] = -25;
    arrayOfShort['ā'] = -35;
    arrayOfShort['Ă'] = -35;
    arrayOfShort['ă'] = -25;
    arrayOfShort['Ą'] = -35;
    arrayOfShort['ą'] = -35;
    arrayOfShort['Ć'] = -35;
    arrayOfShort['ć'] = -35;
    arrayOfShort['Ĉ'] = -35;
    arrayOfShort['ĉ'] = -25;
    arrayOfShort['Ċ'] = -35;
    arrayOfShort['ċ'] = -35;
    arrayOfShort['Č'] = -35;
    arrayOfShort['č'] = -25;
    arrayOfShort['Ď'] = -35;
    arrayOfShort['ď'] = -25;
    arrayOfShort['Đ'] = -25;
    arrayOfShort['đ'] = -25;
    arrayOfShort['Ē'] = -35;
    arrayOfShort['ē'] = 'Ę';
    arrayOfShort['Ĕ'] = 'Ģ';
    arrayOfShort['ĕ'] = 'Ĭ';
    arrayOfShort['Ė'] = 'Ķ';
    arrayOfShort['ė'] = -35;
    arrayOfShort['Ę'] = -25;
    arrayOfShort['ę'] = -25;
    arrayOfShort['Ě'] = -25;
    arrayOfShort['ě'] = -25;
    arrayOfShort['Ĝ'] = -25;
    arrayOfShort['ĝ'] = -25;
    arrayOfShort['Ğ'] = -25;
    arrayOfShort['ğ'] = -35;
    arrayOfShort['Ġ'] = -35;
    arrayOfShort['ġ'] = -25;
    arrayOfShort['Ģ'] = -25;
    arrayOfShort['ģ'] = -35;
    arrayOfShort['Ĥ'] = -35;
    arrayOfShort['ĥ'] = -35;
    arrayOfShort['Ħ'] = -35;
    arrayOfShort['ħ'] = -35;
    arrayOfShort['Ĩ'] = -35;
    arrayOfShort['ĩ'] = -35;
    arrayOfShort['Ī'] = -35;
    arrayOfShort['ī'] = -35;
    arrayOfShort['Ĭ'] = -25;
    arrayOfShort['ĭ'] = -25;
    arrayOfShort['Į'] = -35;
    arrayOfShort['į'] = -35;
    arrayOfShort['İ'] = -35;
    arrayOfShort['ı'] = -25;
    arrayOfShort['Ĳ'] = -25;
    arrayOfShort['ĳ'] = -25;
    arrayOfShort['Ĵ'] = -25;
    arrayOfShort['ĵ'] = -25;
    arrayOfShort['Ķ'] = -25;
    arrayOfShort['ķ'] = -35;
    arrayOfShort['ĸ'] = -35;
    arrayOfShort['Ĺ'] = -35;
    arrayOfShort['ĺ'] = -35;
    arrayOfShort['Ļ'] = -35;
    arrayOfShort['ļ'] = -35;
    arrayOfShort['Ľ'] = -35;
    arrayOfShort['ľ'] = -35;
    arrayOfShort['Ŀ'] = -35;
    arrayOfShort['ŀ'] = -35;
    arrayOfShort['Ł'] = -35;
    arrayOfShort['ł'] = -25;
    arrayOfShort['Ń'] = -35;
    arrayOfShort['ń'] = 'Ŋ';
    arrayOfShort['Ņ'] = -35;
    arrayOfShort['ņ'] = -35;
    arrayOfShort['Ň'] = -35;
    arrayOfShort['ň'] = -35;
    arrayOfShort['ŉ'] = -35;
    arrayOfShort['Ŋ'] = -25;
    arrayOfShort['ŋ'] = -35;
    arrayOfShort['Ō'] = -35;
    arrayOfShort['ō'] = -35;
    arrayOfShort['Ŏ'] = -35;
    arrayOfShort['ŏ'] = -35;
    arrayOfShort['Ő'] = -25;
    arrayOfShort['ő'] = -25;
    arrayOfShort['Œ'] = -25;
    arrayOfShort['œ'] = -25;
    arrayOfShort['Ŕ'] = -35;
    arrayOfShort['ŕ'] = -25;
    arrayOfShort['Ŗ'] = -25;
    arrayOfShort['ŗ'] = -25;
    arrayOfShort['Ř'] = -35;
    arrayOfShort['ř'] = -25;
    arrayOfShort['Ś'] = -35;
    arrayOfShort['ś'] = -35;
    arrayOfShort['Ŝ'] = 'Ş';
    arrayOfShort['ŝ'] = -35;
    arrayOfShort['Ş'] = -25;
    arrayOfShort['ş'] = -35;
    arrayOfShort['Š'] = -35;
    arrayOfShort['š'] = -35;
    arrayOfShort['Ţ'] = -35;
    arrayOfShort['ţ'] = -35;
    arrayOfShort['Ť'] = -35;
    arrayOfShort['ť'] = -35;
    arrayOfShort['Ŧ'] = -25;
    arrayOfShort['ŧ'] = -25;
    arrayOfShort['Ũ'] = -35;
    arrayOfShort['ũ'] = -25;
    arrayOfShort['Ū'] = -35;
    arrayOfShort['ū'] = 'Ų';
    arrayOfShort['Ŭ'] = -35;
    arrayOfShort['ŭ'] = -35;
    arrayOfShort['Ů'] = -25;
    arrayOfShort['ů'] = -35;
    arrayOfShort['Ű'] = -35;
    arrayOfShort['ű'] = 'ż';
    arrayOfShort['Ų'] = -25;
    arrayOfShort['ų'] = -35;
    arrayOfShort['Ŵ'] = -35;
    arrayOfShort['ŵ'] = -25;
    arrayOfShort['Ŷ'] = -25;
    arrayOfShort['ŷ'] = -35;
    arrayOfShort['Ÿ'] = -35;
    arrayOfShort['Ź'] = -35;
    arrayOfShort['ź'] = -35;
    arrayOfShort['Ż'] = -35;
    arrayOfShort['ż'] = -25;
    arrayOfShort['Ž'] = -35;
    arrayOfShort['ž'] = -25;
    arrayOfShort['ſ'] = -25;
    arrayOfShort['ƀ'] = -25;
    arrayOfShort['Ɓ'] = -25;
    arrayOfShort['Ƃ'] = -35;
    arrayOfShort['ƃ'] = -35;
    arrayOfShort['Ƅ'] = -35;
    arrayOfShort['ƅ'] = -35;
    arrayOfShort['Ɔ'] = -25;
    arrayOfShort['Ƈ'] = -35;
    arrayOfShort['ƈ'] = -25;
    arrayOfShort['Ɖ'] = 'Ɛ';
    arrayOfShort['Ɗ'] = -35;
    arrayOfShort['Ƌ'] = -35;
    arrayOfShort['ƌ'] = -35;
    arrayOfShort['ƍ'] = -35;
    arrayOfShort['Ǝ'] = -25;
    arrayOfShort['Ə'] = -35;
    arrayOfShort['Ɛ'] = -25;
    arrayOfShort['Ƒ'] = -35;
    arrayOfShort['ƒ'] = -35;
    arrayOfShort['Ɠ'] = -35;
    arrayOfShort['Ɣ'] = -35;
    arrayOfShort['ƕ'] = -25;
    arrayOfShort['Ɩ'] = -25;
    arrayOfShort['Ɨ'] = -25;
    arrayOfShort['Ƙ'] = -25;
    arrayOfShort['ƙ'] = -25;
    arrayOfShort['ƚ'] = -15;
    arrayOfShort['ƛ'] = -15;
    arrayOfShort['Ɯ'] = 'Ƥ';
    arrayOfShort['Ɲ'] = 'ǌ';
    arrayOfShort['ƞ'] = -25;
    arrayOfShort['Ɵ'] = -25;
    arrayOfShort['Ơ'] = 'ǖ';
    arrayOfShort['ơ'] = 'Ǡ';
    arrayOfShort['Ƣ'] = 'Ǵ';
    arrayOfShort['ƣ'] = 'Ǿ';
    arrayOfShort['Ƥ'] = -15;
    arrayOfShort['ƥ'] = -25;
    arrayOfShort['Ʀ'] = 'Ʈ';
    arrayOfShort['Ƨ'] = -25;
    arrayOfShort['ƨ'] = -25;
    arrayOfShort['Ʃ'] = -25;
    arrayOfShort['ƪ'] = -25;
    arrayOfShort['ƫ'] = -25;
    arrayOfShort['Ƭ'] = 'Ƹ';
    arrayOfShort['ƭ'] = 'ǂ';
    arrayOfShort['Ʈ'] = -25;
    arrayOfShort['Ư'] = -35;
    arrayOfShort['ư'] = -35;
    arrayOfShort['Ʊ'] = -35;
    arrayOfShort['Ʋ'] = -35;
    arrayOfShort['Ƴ'] = -35;
    arrayOfShort['ƴ'] = -35;
    arrayOfShort['Ƶ'] = -35;
    arrayOfShort['ƶ'] = -35;
    arrayOfShort['Ʒ'] = -35;
    arrayOfShort['Ƹ'] = -25;
    arrayOfShort['ƹ'] = -25;
    arrayOfShort['ƺ'] = -35;
    arrayOfShort['ƻ'] = -35;
    arrayOfShort['Ƽ'] = -25;
    arrayOfShort['ƽ'] = -25;
    arrayOfShort['ƾ'] = -25;
    arrayOfShort['ƿ'] = -35;
    arrayOfShort['ǀ'] = -35;
    arrayOfShort['ǁ'] = -35;
    arrayOfShort['ǂ'] = -15;
    arrayOfShort['ǃ'] = -25;
    arrayOfShort['Ǆ'] = -15;
    arrayOfShort['ǅ'] = -15;
    arrayOfShort['ǆ'] = -15;
    arrayOfShort['Ǉ'] = -15;
    arrayOfShort['ǈ'] = -15;
    arrayOfShort['ǉ'] = -25;
    arrayOfShort['Ǌ'] = -25;
    arrayOfShort['ǋ'] = -15;
    arrayOfShort['ǌ'] = -25;
    arrayOfShort['Ǎ'] = -25;
    arrayOfShort['ǎ'] = -25;
    arrayOfShort['Ǐ'] = -25;
    arrayOfShort['ǐ'] = -25;
    arrayOfShort['Ǒ'] = -25;
    arrayOfShort['ǒ'] = -35;
    arrayOfShort['Ǔ'] = -25;
    arrayOfShort['ǔ'] = -35;
    arrayOfShort['Ǖ'] = -35;
    arrayOfShort['ǖ'] = -35;
    arrayOfShort['Ǘ'] = -25;
    arrayOfShort['ǘ'] = -25;
    arrayOfShort['Ǚ'] = -35;
    arrayOfShort['ǚ'] = -25;
    arrayOfShort['Ǜ'] = -35;
    arrayOfShort['ǜ'] = -35;
    arrayOfShort['ǝ'] = -35;
    arrayOfShort['Ǟ'] = -25;
    arrayOfShort['ǟ'] = -25;
    arrayOfShort['Ǡ'] = 'Ǫ';
    arrayOfShort['ǡ'] = -15;
    arrayOfShort['Ǣ'] = -25;
    arrayOfShort['ǣ'] = -25;
    arrayOfShort['Ǥ'] = -25;
    arrayOfShort['ǥ'] = -35;
    arrayOfShort['Ǧ'] = -35;
    arrayOfShort['ǧ'] = -25;
    arrayOfShort['Ǩ'] = -35;
    arrayOfShort['ǩ'] = -35;
    arrayOfShort['Ǫ'] = -15;
    arrayOfShort['ǫ'] = -35;
    arrayOfShort['Ǭ'] = -35;
    arrayOfShort['ǭ'] = -35;
    arrayOfShort['Ǯ'] = -35;
    arrayOfShort['ǯ'] = -35;
    arrayOfShort['ǰ'] = -35;
    arrayOfShort['Ǳ'] = -35;
    arrayOfShort['ǲ'] = -35;
    arrayOfShort['ǳ'] = -15;
    arrayOfShort['Ǵ'] = -35;
    arrayOfShort['ǵ'] = -25;
    arrayOfShort['Ƕ'] = -25;
    arrayOfShort['Ƿ'] = -25;
    arrayOfShort['Ǹ'] = -25;
    arrayOfShort['ǹ'] = -25;
    arrayOfShort['Ǻ'] = -25;
    arrayOfShort['ǻ'] = -25;
    arrayOfShort['Ǽ'] = -25;
    arrayOfShort['ǽ'] = -25;
    arrayOfShort['Ǿ'] = -25;
    arrayOfShort['ǿ'] = -25;
    arrayOfShort['Ȁ'] = -25;
    arrayOfShort['ȁ'] = -35;
    arrayOfShort['Ȃ'] = -35;
    arrayOfShort['ȃ'] = -35;
    arrayOfShort['Ȅ'] = -25;
    arrayOfShort['ȅ'] = -25;
    arrayOfShort['Ȇ'] = -25;
    arrayOfShort['ȇ'] = 'Ȉ';
    arrayOfShort['Ȉ'] = -100;
    arrayOfShort['ȉ'] = -100;
    arrayOfShort['Ȋ'] = -45;
    arrayOfShort['ȋ'] = -100;
    arrayOfShort['Ȍ'] = -45;
    arrayOfShort['ȍ'] = -100;
    arrayOfShort['Ȏ'] = -45;
    arrayOfShort['ȏ'] = -100;
    arrayOfShort['Ȑ'] = -45;
    arrayOfShort['ȑ'] = -100;
    arrayOfShort['Ȓ'] = -25;
    arrayOfShort['ȓ'] = -100;
    arrayOfShort['Ȕ'] = -25;
    arrayOfShort['ȕ'] = 'Ȝ';
    arrayOfShort['Ȗ'] = 'Ʉ';
    arrayOfShort['ȗ'] = 'Ɏ';
    arrayOfShort['Ș'] = 'ɘ';
    arrayOfShort['ș'] = 'ɢ';
    arrayOfShort['Ț'] = 'ɶ';
    arrayOfShort['ț'] = 'ʀ';
    arrayOfShort['Ȝ'] = -25;
    arrayOfShort['ȝ'] = -35;
    arrayOfShort['Ȟ'] = -35;
    arrayOfShort['ȟ'] = -35;
    arrayOfShort['Ƞ'] = -25;
    arrayOfShort['ȡ'] = -25;
    arrayOfShort['Ȣ'] = -35;
    arrayOfShort['ȣ'] = -35;
    arrayOfShort['Ȥ'] = -35;
    arrayOfShort['ȥ'] = 'Ȧ';
    arrayOfShort['Ȧ'] = -35;
    arrayOfShort['ȧ'] = -35;
    arrayOfShort['Ȩ'] = -25;
    arrayOfShort['ȩ'] = -25;
    arrayOfShort['Ȫ'] = -25;
    arrayOfShort['ȫ'] = -25;
    arrayOfShort['Ȭ'] = 'Ȱ';
    arrayOfShort['ȭ'] = 'Ⱥ';
    arrayOfShort['Ȯ'] = -25;
    arrayOfShort['ȯ'] = -35;
    arrayOfShort['Ȱ'] = -35;
    arrayOfShort['ȱ'] = -35;
    arrayOfShort['Ȳ'] = -35;
    arrayOfShort['ȳ'] = -35;
    arrayOfShort['ȴ'] = -25;
    arrayOfShort['ȵ'] = -25;
    arrayOfShort['ȶ'] = -25;
    arrayOfShort['ȷ'] = -25;
    arrayOfShort['ȸ'] = -25;
    arrayOfShort['ȹ'] = -25;
    arrayOfShort['Ⱥ'] = -25;
    arrayOfShort['Ȼ'] = -25;
    arrayOfShort['ȼ'] = -25;
    arrayOfShort['Ƚ'] = -25;
    arrayOfShort['Ⱦ'] = -35;
    arrayOfShort['ȿ'] = -25;
    arrayOfShort['ɀ'] = -25;
    arrayOfShort['Ɂ'] = -35;
    arrayOfShort['ɂ'] = -25;
    arrayOfShort['Ƀ'] = -25;
    arrayOfShort['Ʉ'] = -25;
    arrayOfShort['Ʌ'] = -25;
    arrayOfShort['Ɇ'] = -25;
    arrayOfShort['ɇ'] = -25;
    arrayOfShort['Ɉ'] = -35;
    arrayOfShort['ɉ'] = -35;
    arrayOfShort['Ɋ'] = -25;
    arrayOfShort['ɋ'] = -35;
    arrayOfShort['Ɍ'] = -35;
    arrayOfShort['ɍ'] = -25;
    arrayOfShort['Ɏ'] = -35;
    arrayOfShort['ɏ'] = -35;
    arrayOfShort['ɐ'] = -25;
    arrayOfShort['ɑ'] = -35;
    arrayOfShort['ɒ'] = -35;
    arrayOfShort['ɓ'] = -35;
    arrayOfShort['ɔ'] = -35;
    arrayOfShort['ɕ'] = -35;
    arrayOfShort['ɖ'] = -35;
    arrayOfShort['ɗ'] = -25;
    arrayOfShort['ɘ'] = -100;
    arrayOfShort['ə'] = -35;
    arrayOfShort['ɚ'] = -35;
    arrayOfShort['ɛ'] = -35;
    arrayOfShort['ɜ'] = -35;
    arrayOfShort['ɝ'] = -35;
    arrayOfShort['ɞ'] = -35;
    arrayOfShort['ɟ'] = -35;
    arrayOfShort['ɠ'] = -35;
    arrayOfShort['ɡ'] = -35;
    arrayOfShort['ɢ'] = -36;
    arrayOfShort['ɣ'] = -100;
    arrayOfShort['ɤ'] = -35;
    arrayOfShort['ɥ'] = -35;
    arrayOfShort['ɦ'] = -35;
    arrayOfShort['ɧ'] = -35;
    arrayOfShort['ɨ'] = 'ɬ';
    arrayOfShort['ɩ'] = -35;
    arrayOfShort['ɪ'] = -35;
    arrayOfShort['ɫ'] = -100;
    arrayOfShort['ɬ'] = -35;
    arrayOfShort['ɭ'] = -35;
    arrayOfShort['ɮ'] = -35;
    arrayOfShort['ɯ'] = -35;
    arrayOfShort['ɰ'] = -35;
    arrayOfShort['ɱ'] = -35;
    arrayOfShort['ɲ'] = -35;
    arrayOfShort['ɳ'] = -35;
    arrayOfShort['ɴ'] = -35;
    arrayOfShort['ɵ'] = -45;
    arrayOfShort['ɶ'] = -25;
    arrayOfShort['ɷ'] = -35;
    arrayOfShort['ɸ'] = -25;
    arrayOfShort['ɹ'] = -25;
    arrayOfShort['ɺ'] = -35;
    arrayOfShort['ɻ'] = -35;
    arrayOfShort['ɼ'] = -35;
    arrayOfShort['ɽ'] = -35;
    arrayOfShort['ɾ'] = -25;
    arrayOfShort['ɿ'] = -25;
    arrayOfShort['ʀ'] = -25;
    arrayOfShort['ʁ'] = -25;
    arrayOfShort['ʂ'] = -25;
    arrayOfShort['ʃ'] = -25;
    arrayOfShort['ʄ'] = -35;
    arrayOfShort['ʅ'] = -35;
    arrayOfShort['ʆ'] = -35;
    arrayOfShort['ʇ'] = 'ʊ';
    arrayOfShort['ʈ'] = -35;
    arrayOfShort['ʉ'] = 'ʔ';
    arrayOfShort['ʊ'] = -35;
    arrayOfShort['ʋ'] = -35;
    arrayOfShort['ʌ'] = -35;
    arrayOfShort['ʍ'] = -35;
    arrayOfShort['ʎ'] = -45;
    arrayOfShort['ʏ'] = -35;
    arrayOfShort['ʐ'] = -35;
    arrayOfShort['ʑ'] = -35;
    arrayOfShort['ʒ'] = -35;
    arrayOfShort['ʓ'] = -45;
    arrayOfShort['ʔ'] = -35;
    arrayOfShort['ʕ'] = -35;
    arrayOfShort['ʖ'] = -35;
    arrayOfShort['ʗ'] = -35;
    arrayOfShort['ʘ'] = -35;
    arrayOfShort['ʙ'] = -35;
    arrayOfShort['ʚ'] = -35;
    arrayOfShort['ʛ'] = -35;
    arrayOfShort['ʜ'] = -35;
    arrayOfShort['ʝ'] = -25;
    arrayOfShort['ʞ'] = -26;
    arrayOfShort['ʟ'] = -100;
    arrayOfShort['ʠ'] = 'ʨ';
    arrayOfShort['ʡ'] = 'ʲ';
    arrayOfShort['ʢ'] = 'ʼ';
    arrayOfShort['ʣ'] = -25;
    arrayOfShort['ʤ'] = 'ː';
    arrayOfShort['ʥ'] = '˚';
    arrayOfShort['ʦ'] = -25;
    arrayOfShort['ʧ'] = 'ˤ';
    arrayOfShort['ʨ'] = -25;
    arrayOfShort['ʩ'] = -35;
    arrayOfShort['ʪ'] = -25;
    arrayOfShort['ʫ'] = -25;
    arrayOfShort['ʬ'] = -25;
    arrayOfShort['ʭ'] = -35;
    arrayOfShort['ʮ'] = -25;
    arrayOfShort['ʯ'] = -25;
    arrayOfShort['ʰ'] = -25;
    arrayOfShort['ʱ'] = -25;
    arrayOfShort['ʲ'] = -25;
    arrayOfShort['ʳ'] = -25;
    arrayOfShort['ʴ'] = -25;
    arrayOfShort['ʵ'] = -25;
    arrayOfShort['ʶ'] = -25;
    arrayOfShort['ʷ'] = -35;
    arrayOfShort['ʸ'] = -35;
    arrayOfShort['ʹ'] = -35;
    arrayOfShort['ʺ'] = -35;
    arrayOfShort['ʻ'] = -35;
    arrayOfShort['ʼ'] = -35;
    arrayOfShort['ʽ'] = -100;
    arrayOfShort['ʾ'] = -35;
    arrayOfShort['ʿ'] = -35;
    arrayOfShort['ˀ'] = -35;
    arrayOfShort['ˁ'] = -35;
    arrayOfShort['˂'] = 'ˆ';
    arrayOfShort['˃'] = -35;
    arrayOfShort['˄'] = -35;
    arrayOfShort['˅'] = -35;
    arrayOfShort['ˆ'] = -35;
    arrayOfShort['ˇ'] = -35;
    arrayOfShort['ˈ'] = -35;
    arrayOfShort['ˉ'] = -35;
    arrayOfShort['ˊ'] = -35;
    arrayOfShort['ˋ'] = -35;
    arrayOfShort['ˌ'] = -35;
    arrayOfShort['ˍ'] = -35;
    arrayOfShort['ˎ'] = -45;
    arrayOfShort['ˏ'] = -35;
    arrayOfShort['ː'] = -25;
    arrayOfShort['ˑ'] = -35;
    arrayOfShort['˒'] = -25;
    arrayOfShort['˓'] = -35;
    arrayOfShort['˔'] = -25;
    arrayOfShort['˕'] = -35;
    arrayOfShort['˖'] = -35;
    arrayOfShort['˗'] = -35;
    arrayOfShort['˘'] = -35;
    arrayOfShort['˙'] = -25;
    arrayOfShort['˚'] = -35;
    arrayOfShort['˛'] = -35;
    arrayOfShort['˜'] = -35;
    arrayOfShort['˝'] = -35;
    arrayOfShort['˞'] = -35;
    arrayOfShort['˟'] = -25;
    arrayOfShort['ˠ'] = -35;
    arrayOfShort['ˡ'] = -25;
    arrayOfShort['ˢ'] = -35;
    arrayOfShort['ˣ'] = -35;
    arrayOfShort['ˤ'] = -35;
    arrayOfShort['˥'] = -35;
    arrayOfShort['˦'] = -25;
    arrayOfShort['˧'] = -25;
    arrayOfShort['˨'] = 'ˮ';
    arrayOfShort['˩'] = '˸';
    arrayOfShort['˪'] = '̂';
    arrayOfShort['˫'] = -35;
    arrayOfShort['ˬ'] = -35;
    arrayOfShort['˭'] = -35;
    arrayOfShort['ˮ'] = -25;
    arrayOfShort['˯'] = -35;
    arrayOfShort['˰'] = -25;
    arrayOfShort['˱'] = -25;
    arrayOfShort['˲'] = -25;
    arrayOfShort['˳'] = -25;
    arrayOfShort['˴'] = -35;
    arrayOfShort['˵'] = -35;
    arrayOfShort['˶'] = -35;
    arrayOfShort['˷'] = -25;
    arrayOfShort['˸'] = -25;
    arrayOfShort['˹'] = -35;
    arrayOfShort['˺'] = -35;
    arrayOfShort['˻'] = -35;
    arrayOfShort['˼'] = -35;
    arrayOfShort['˽'] = -25;
    arrayOfShort['˾'] = -25;
    arrayOfShort['˿'] = -35;
    arrayOfShort['̀'] = -35;
    arrayOfShort['́'] = -25;
    arrayOfShort['̂'] = -25;
    arrayOfShort['̃'] = -35;
    arrayOfShort['̄'] = -35;
    arrayOfShort['̅'] = -35;
    arrayOfShort['̆'] = -35;
    arrayOfShort['̇'] = -35;
    arrayOfShort['̈'] = -25;
    arrayOfShort['̉'] = -25;
    arrayOfShort['̊'] = -35;
    arrayOfShort['̋'] = -35;
    arrayOfShort['̌'] = '̖';
    arrayOfShort['̍'] = -100;
    arrayOfShort['̎'] = '̠';
    arrayOfShort['̏'] = '͒';
    arrayOfShort['̐'] = '΄';
    arrayOfShort['̑'] = 'Θ';
    arrayOfShort['̒'] = 'ά';
    arrayOfShort['̓'] = 'І';
    arrayOfShort['̔'] = 'А';
    arrayOfShort['̕'] = 'К';
    arrayOfShort['̖'] = -36;
    arrayOfShort['̗'] = -26;
    arrayOfShort['̘'] = -26;
    arrayOfShort['̙'] = -26;
    arrayOfShort['̚'] = -26;
    arrayOfShort['̛'] = -26;
    arrayOfShort['̜'] = -26;
    arrayOfShort['̝'] = -26;
    arrayOfShort['̞'] = -26;
    arrayOfShort['̟'] = -26;
    arrayOfShort['̠'] = -35;
    arrayOfShort['̡'] = -25;
    arrayOfShort['̢'] = -25;
    arrayOfShort['̣'] = -35;
    arrayOfShort['̤'] = '̪';
    arrayOfShort['̥'] = -25;
    arrayOfShort['̦'] = -35;
    arrayOfShort['̧'] = -35;
    arrayOfShort['̨'] = -25;
    arrayOfShort['̩'] = '̴';
    arrayOfShort['̪'] = -25;
    arrayOfShort['̫'] = -35;
    arrayOfShort['̬'] = -25;
    arrayOfShort['̭'] = -25;
    arrayOfShort['̮'] = -35;
    arrayOfShort['̯'] = -35;
    arrayOfShort['̰'] = -35;
    arrayOfShort['̱'] = -35;
    arrayOfShort['̲'] = -35;
    arrayOfShort['̳'] = -25;
    arrayOfShort['̴'] = -25;
    arrayOfShort['̵'] = -35;
    arrayOfShort['̶'] = '̾';
    arrayOfShort['̷'] = -35;
    arrayOfShort['̸'] = '͈';
    arrayOfShort['̹'] = -35;
    arrayOfShort['̺'] = -25;
    arrayOfShort['̻'] = -35;
    arrayOfShort['̼'] = -35;
    arrayOfShort['̽'] = -25;
    arrayOfShort['̾'] = -35;
    arrayOfShort['̿'] = -25;
    arrayOfShort['̀'] = -25;
    arrayOfShort['́'] = -25;
    arrayOfShort['͂'] = -25;
    arrayOfShort['̓'] = -25;
    arrayOfShort['̈́'] = -25;
    arrayOfShort['ͅ'] = -25;
    arrayOfShort['͆'] = -25;
    arrayOfShort['͇'] = -25;
    arrayOfShort['͈'] = -100;
    arrayOfShort['͉'] = -25;
    arrayOfShort['͊'] = -25;
    arrayOfShort['͋'] = -25;
    arrayOfShort['͌'] = -100;
    arrayOfShort['͍'] = -100;
    arrayOfShort['͎'] = -100;
    arrayOfShort['͏'] = -100;
    arrayOfShort['͐'] = -100;
    arrayOfShort['͑'] = -100;
    arrayOfShort['͒'] = -25;
    arrayOfShort['͓'] = -25;
    arrayOfShort['͔'] = -35;
    arrayOfShort['͕'] = -35;
    arrayOfShort['͖'] = -35;
    arrayOfShort['͗'] = -35;
    arrayOfShort['͘'] = '͜';
    arrayOfShort['͙'] = -35;
    arrayOfShort['͚'] = 'ͦ';
    arrayOfShort['͛'] = 'Ͱ';
    arrayOfShort['͜'] = -25;
    arrayOfShort['͝'] = -35;
    arrayOfShort['͞'] = -35;
    arrayOfShort['͟'] = -35;
    arrayOfShort['͠'] = -35;
    arrayOfShort['͡'] = -35;
    arrayOfShort['͢'] = -35;
    arrayOfShort['ͣ'] = -35;
    arrayOfShort['ͤ'] = -35;
    arrayOfShort['ͥ'] = -35;
    arrayOfShort['ͦ'] = -35;
    arrayOfShort['ͧ'] = -35;
    arrayOfShort['ͨ'] = -35;
    arrayOfShort['ͩ'] = -35;
    arrayOfShort['ͪ'] = -35;
    arrayOfShort['ͫ'] = -35;
    arrayOfShort['ͬ'] = -35;
    arrayOfShort['ͭ'] = -45;
    arrayOfShort['ͮ'] = -45;
    arrayOfShort['ͯ'] = -35;
    arrayOfShort['Ͱ'] = -100;
    arrayOfShort['ͱ'] = -100;
    arrayOfShort['Ͳ'] = -100;
    arrayOfShort['ͳ'] = -100;
    arrayOfShort['ʹ'] = -100;
    arrayOfShort['͵'] = -100;
    arrayOfShort['Ͷ'] = 'ͺ';
    arrayOfShort['ͷ'] = -100;
    arrayOfShort['͸'] = -100;
    arrayOfShort['͹'] = -100;
    arrayOfShort['ͺ'] = -25;
    arrayOfShort['ͻ'] = -45;
    arrayOfShort['ͼ'] = -45;
    arrayOfShort['ͽ'] = -25;
    arrayOfShort[';'] = -45;
    arrayOfShort['Ϳ'] = -45;
    arrayOfShort['΀'] = -25;
    arrayOfShort['΁'] = -45;
    arrayOfShort['΂'] = -45;
    arrayOfShort['΃'] = -45;
    arrayOfShort['΄'] = -25;
    arrayOfShort['΅'] = -25;
    arrayOfShort['Ά'] = -25;
    arrayOfShort['·'] = -25;
    arrayOfShort['Έ'] = -25;
    arrayOfShort['Ή'] = -35;
    arrayOfShort['Ί'] = -35;
    arrayOfShort['΋'] = 'Ύ';
    arrayOfShort['Ό'] = -35;
    arrayOfShort['΍'] = -25;
    arrayOfShort['Ύ'] = -35;
    arrayOfShort['Ώ'] = -35;
    arrayOfShort['ΐ'] = -35;
    arrayOfShort['Α'] = -35;
    arrayOfShort['Β'] = -35;
    arrayOfShort['Γ'] = -35;
    arrayOfShort['Δ'] = -35;
    arrayOfShort['Ε'] = -45;
    arrayOfShort['Ζ'] = -35;
    arrayOfShort['Η'] = -35;
    arrayOfShort['Θ'] = -100;
    arrayOfShort['Ι'] = '΢';
    arrayOfShort['Κ'] = -35;
    arrayOfShort['Λ'] = -35;
    arrayOfShort['Μ'] = -35;
    arrayOfShort['Ν'] = -35;
    arrayOfShort['Ξ'] = -35;
    arrayOfShort['Ο'] = -35;
    arrayOfShort['Π'] = -35;
    arrayOfShort['Ρ'] = -35;
    arrayOfShort['΢'] = -100;
    arrayOfShort['Σ'] = -100;
    arrayOfShort['Τ'] = -45;
    arrayOfShort['Υ'] = -100;
    arrayOfShort['Φ'] = -45;
    arrayOfShort['Χ'] = -100;
    arrayOfShort['Ψ'] = -100;
    arrayOfShort['Ω'] = -100;
    arrayOfShort['Ϊ'] = -100;
    arrayOfShort['Ϋ'] = -100;
    arrayOfShort['ά'] = -25;
    arrayOfShort['έ'] = -25;
    arrayOfShort['ή'] = -25;
    arrayOfShort['ί'] = 'ζ';
    arrayOfShort['ΰ'] = -25;
    arrayOfShort['α'] = 'ϊ';
    arrayOfShort['β'] = 'Ϟ';
    arrayOfShort['γ'] = -35;
    arrayOfShort['δ'] = 'Ϩ';
    arrayOfShort['ε'] = 'ϲ';
    arrayOfShort['ζ'] = -35;
    arrayOfShort['η'] = -35;
    arrayOfShort['θ'] = -35;
    arrayOfShort['ι'] = -35;
    arrayOfShort['κ'] = -35;
    arrayOfShort['λ'] = -35;
    arrayOfShort['μ'] = 'π';
    arrayOfShort['ν'] = -35;
    arrayOfShort['ξ'] = -35;
    arrayOfShort['ο'] = -35;
    arrayOfShort['π'] = -45;
    arrayOfShort['ρ'] = -45;
    arrayOfShort['ς'] = -45;
    arrayOfShort['σ'] = -45;
    arrayOfShort['τ'] = -45;
    arrayOfShort['υ'] = -45;
    arrayOfShort['φ'] = -35;
    arrayOfShort['χ'] = -45;
    arrayOfShort['ψ'] = -45;
    arrayOfShort['ω'] = -45;
    arrayOfShort['ϊ'] = -35;
    arrayOfShort['ϋ'] = -35;
    arrayOfShort['ό'] = -25;
    arrayOfShort['ύ'] = -35;
    arrayOfShort['ώ'] = -35;
    arrayOfShort['Ϗ'] = 'ϔ';
    arrayOfShort['ϐ'] = -35;
    arrayOfShort['ϑ'] = -35;
    arrayOfShort['ϒ'] = -35;
    arrayOfShort['ϓ'] = -35;
    arrayOfShort['ϔ'] = -100;
    arrayOfShort['ϕ'] = -100;
    arrayOfShort['ϖ'] = -25;
    arrayOfShort['ϗ'] = -25;
    arrayOfShort['Ϙ'] = -100;
    arrayOfShort['ϙ'] = -100;
    arrayOfShort['Ϛ'] = -100;
    arrayOfShort['ϛ'] = -100;
    arrayOfShort['Ϝ'] = -100;
    arrayOfShort['ϝ'] = -100;
    arrayOfShort['Ϟ'] = -25;
    arrayOfShort['ϟ'] = -35;
    arrayOfShort['Ϡ'] = -35;
    arrayOfShort['ϡ'] = -35;
    arrayOfShort['Ϣ'] = -35;
    arrayOfShort['ϣ'] = -35;
    arrayOfShort['Ϥ'] = -35;
    arrayOfShort['ϥ'] = -35;
    arrayOfShort['Ϧ'] = -35;
    arrayOfShort['ϧ'] = -35;
    arrayOfShort['Ϩ'] = -25;
    arrayOfShort['ϩ'] = -35;
    arrayOfShort['Ϫ'] = -35;
    arrayOfShort['ϫ'] = -35;
    arrayOfShort['Ϭ'] = -35;
    arrayOfShort['ϭ'] = -35;
    arrayOfShort['Ϯ'] = -35;
    arrayOfShort['ϯ'] = -35;
    arrayOfShort['ϰ'] = -35;
    arrayOfShort['ϱ'] = -25;
    arrayOfShort['ϲ'] = -25;
    arrayOfShort['ϳ'] = -35;
    arrayOfShort['ϴ'] = -35;
    arrayOfShort['ϵ'] = -35;
    arrayOfShort['϶'] = -25;
    arrayOfShort['Ϸ'] = -25;
    arrayOfShort['ϸ'] = -35;
    arrayOfShort['Ϲ'] = -35;
    arrayOfShort['Ϻ'] = -35;
    arrayOfShort['ϻ'] = 'ϼ';
    arrayOfShort['ϼ'] = -45;
    arrayOfShort['Ͻ'] = -45;
    arrayOfShort['Ͼ'] = -35;
    arrayOfShort['Ͽ'] = -35;
    arrayOfShort['Ѐ'] = -45;
    arrayOfShort['Ё'] = -45;
    arrayOfShort['Ђ'] = -45;
    arrayOfShort['Ѓ'] = -45;
    arrayOfShort['Є'] = -45;
    arrayOfShort['Ѕ'] = -45;
    arrayOfShort['І'] = -25;
    arrayOfShort['Ї'] = -25;
    arrayOfShort['Ј'] = -25;
    arrayOfShort['Љ'] = -25;
    arrayOfShort['Њ'] = -25;
    arrayOfShort['Ћ'] = -35;
    arrayOfShort['Ќ'] = -25;
    arrayOfShort['Ѝ'] = -35;
    arrayOfShort['Ў'] = -25;
    arrayOfShort['Џ'] = -35;
    arrayOfShort['А'] = -35;
    arrayOfShort['Б'] = -25;
    arrayOfShort['В'] = -25;
    arrayOfShort['Г'] = -35;
    arrayOfShort['Д'] = -35;
    arrayOfShort['Е'] = -35;
    arrayOfShort['Ж'] = -25;
    arrayOfShort['З'] = -35;
    arrayOfShort['И'] = -25;
    arrayOfShort['Й'] = -35;
    arrayOfShort['К'] = -25;
    arrayOfShort['Л'] = -25;
    arrayOfShort['М'] = -35;
    arrayOfShort['Н'] = -35;
    arrayOfShort['О'] = -35;
    arrayOfShort['П'] = -35;
    arrayOfShort['Р'] = -35;
    arrayOfShort['С'] = -35;
    arrayOfShort['Т'] = -35;
    arrayOfShort['У'] = -25;
    arrayOfShort['Ф'] = -26;
    arrayOfShort['Х'] = -100;
    arrayOfShort['Ц'] = 'Ю';
    arrayOfShort['Ч'] = 'и';
    arrayOfShort['Ш'] = 'т';
    arrayOfShort['Щ'] = 'і';
    arrayOfShort['Ъ'] = 'Ѡ';
    arrayOfShort['Ы'] = 'Ѫ';
    arrayOfShort['Ь'] = 'Ѵ';
    arrayOfShort['Э'] = '҈';
    arrayOfShort['Ю'] = -35;
    arrayOfShort['Я'] = -25;
    arrayOfShort['а'] = -25;
    arrayOfShort['б'] = -25;
    arrayOfShort['в'] = -25;
    arrayOfShort['г'] = -25;
    arrayOfShort['д'] = -25;
    arrayOfShort['е'] = -25;
    arrayOfShort['ж'] = -25;
    arrayOfShort['з'] = -25;
    arrayOfShort['и'] = -35;
    arrayOfShort['й'] = -25;
    arrayOfShort['к'] = -25;
    arrayOfShort['л'] = -25;
    arrayOfShort['м'] = -25;
    arrayOfShort['н'] = -25;
    arrayOfShort['о'] = -25;
    arrayOfShort['п'] = -25;
    arrayOfShort['р'] = -25;
    arrayOfShort['с'] = -25;
    arrayOfShort['т'] = -35;
    arrayOfShort['у'] = -100;
    arrayOfShort['ф'] = -35;
    arrayOfShort['х'] = -35;
    arrayOfShort['ц'] = -35;
    arrayOfShort['ч'] = -100;
    arrayOfShort['ш'] = -35;
    arrayOfShort['щ'] = -35;
    arrayOfShort['ъ'] = -35;
    arrayOfShort['ы'] = 'ь';
    arrayOfShort['ь'] = -35;
    arrayOfShort['э'] = -35;
    arrayOfShort['ю'] = -35;
    arrayOfShort['я'] = -35;
    arrayOfShort['ѐ'] = -35;
    arrayOfShort['ё'] = -35;
    arrayOfShort['ђ'] = -45;
    arrayOfShort['ѓ'] = -35;
    arrayOfShort['є'] = -35;
    arrayOfShort['ѕ'] = -35;
    arrayOfShort['і'] = -35;
    arrayOfShort['ї'] = -25;
    arrayOfShort['ј'] = -35;
    arrayOfShort['љ'] = -25;
    arrayOfShort['њ'] = -35;
    arrayOfShort['ћ'] = -35;
    arrayOfShort['ќ'] = -35;
    arrayOfShort['ѝ'] = -35;
    arrayOfShort['ў'] = -25;
    arrayOfShort['џ'] = -35;
    arrayOfShort['Ѡ'] = -25;
    arrayOfShort['ѡ'] = -25;
    arrayOfShort['Ѣ'] = -25;
    arrayOfShort['ѣ'] = -25;
    arrayOfShort['Ѥ'] = -35;
    arrayOfShort['ѥ'] = -35;
    arrayOfShort['Ѧ'] = -35;
    arrayOfShort['ѧ'] = -35;
    arrayOfShort['Ѩ'] = -35;
    arrayOfShort['ѩ'] = -35;
    arrayOfShort['Ѫ'] = -25;
    arrayOfShort['ѫ'] = -25;
    arrayOfShort['Ѭ'] = -35;
    arrayOfShort['ѭ'] = -35;
    arrayOfShort['Ѯ'] = -35;
    arrayOfShort['ѯ'] = -25;
    arrayOfShort['Ѱ'] = -25;
    arrayOfShort['ѱ'] = -35;
    arrayOfShort['Ѳ'] = -35;
    arrayOfShort['ѳ'] = -35;
    arrayOfShort['Ѵ'] = 'Ѿ';
    arrayOfShort['ѵ'] = -25;
    arrayOfShort['Ѷ'] = -35;
    arrayOfShort['ѷ'] = -35;
    arrayOfShort['Ѹ'] = -35;
    arrayOfShort['ѹ'] = -35;
    arrayOfShort['Ѻ'] = -35;
    arrayOfShort['ѻ'] = -35;
    arrayOfShort['Ѽ'] = -25;
    arrayOfShort['ѽ'] = -25;
    arrayOfShort['Ѿ'] = -35;
    arrayOfShort['ѿ'] = -35;
    arrayOfShort['Ҁ'] = -45;
    arrayOfShort['ҁ'] = -35;
    arrayOfShort['҂'] = -35;
    arrayOfShort['҃'] = -35;
    arrayOfShort['҄'] = -35;
    arrayOfShort['҅'] = -35;
    arrayOfShort['҆'] = -35;
    arrayOfShort['҇'] = -35;
    arrayOfShort['҈'] = -35;
    arrayOfShort['҉'] = 'Ғ';
    arrayOfShort['Ҋ'] = -25;
    arrayOfShort['ҋ'] = -35;
    arrayOfShort['Ҍ'] = 'Ҝ';
    arrayOfShort['ҍ'] = -35;
    arrayOfShort['Ҏ'] = 'Ҧ';
    arrayOfShort['ҏ'] = -35;
    arrayOfShort['Ґ'] = -25;
    arrayOfShort['ґ'] = -25;
    arrayOfShort['Ғ'] = -100;
    arrayOfShort['ғ'] = -100;
    arrayOfShort['Ҕ'] = -45;
    arrayOfShort['ҕ'] = -45;
    arrayOfShort['Җ'] = -100;
    arrayOfShort['җ'] = -100;
    arrayOfShort['Ҙ'] = -100;
    arrayOfShort['ҙ'] = -100;
    arrayOfShort['Қ'] = -100;
    arrayOfShort['қ'] = -100;
    arrayOfShort['Ҝ'] = -25;
    arrayOfShort['ҝ'] = -35;
    arrayOfShort['Ҟ'] = -35;
    arrayOfShort['ҟ'] = -35;
    arrayOfShort['Ҡ'] = -35;
    arrayOfShort['ҡ'] = -35;
    arrayOfShort['Ң'] = -35;
    arrayOfShort['ң'] = -25;
    arrayOfShort['Ҥ'] = -25;
    arrayOfShort['ҥ'] = -35;
    arrayOfShort['Ҧ'] = -35;
    arrayOfShort['ҧ'] = -35;
    arrayOfShort['Ҩ'] = -35;
    arrayOfShort['ҩ'] = -35;
    arrayOfShort['Ҫ'] = -35;
    arrayOfShort['ҫ'] = -35;
    arrayOfShort['Ҭ'] = -35;
    arrayOfShort['ҭ'] = -35;
    arrayOfShort['Ү'] = -35;
    arrayOfShort['ү'] = -45;
    FORMAT_MAP = arrayOfShort;
  }
  
  public static void format(Editable paramEditable)
  {
    int i = 3;
    int j = 1;
    int k = paramEditable.length();
    Object localObject;
    CharSequence localCharSequence;
    if (k > i)
    {
      localObject = paramEditable.subSequence(0, i).toString();
      String str = "+81";
      boolean bool1 = ((String)localObject).equals(str);
      if (bool1)
      {
        j = 3;
        localCharSequence = paramEditable.subSequence(0, k);
        i1 = 0;
      }
    }
    int i2;
    for (;;)
    {
      int m = paramEditable.length();
      if (i1 >= m) {
        break label157;
      }
      m = paramEditable.charAt(i1);
      i2 = 45;
      if (m == i2)
      {
        m = i1 + 1;
        paramEditable.delete(i1, m);
        continue;
        m = 1;
        if (k >= m)
        {
          m = paramEditable.charAt(0);
          i2 = 48;
          if (m == i2) {
            break;
          }
        }
        return;
      }
      i1 += 1;
    }
    label157:
    k = paramEditable.length();
    int i1 = j;
    char c1 = '\000';
    for (;;)
    {
      int i3;
      if (i1 < k)
      {
        char c2 = paramEditable.charAt(i1);
        boolean bool2 = Character.isDigit(c2);
        if (!bool2)
        {
          paramEditable.replace(0, k, localCharSequence);
          break;
        }
        localObject = FORMAT_MAP;
        i2 = c1 + c2 + -48;
        i3 = localObject[i2];
        if (i3 >= 0) {
          break label365;
        }
        int n = -100;
        if (i3 <= n)
        {
          paramEditable.replace(0, k, localCharSequence);
          break;
        }
        n = Math.abs(i3) % 10;
        int i4 = j + n;
        if (k > i4)
        {
          localObject = "-";
          paramEditable.insert(i4, (CharSequence)localObject);
        }
        n = Math.abs(i3) / 10;
        int i5 = j + n;
        if (k > i5)
        {
          localObject = "-";
          paramEditable.insert(i5, (CharSequence)localObject);
        }
      }
      if ((k <= i) || (j != i)) {
        break;
      }
      localObject = "-";
      paramEditable.insert(j, (CharSequence)localObject);
      break;
      label365:
      c1 = i3;
      i1 += 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/telephony/JapanesePhoneNumberFormatter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */