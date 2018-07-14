package com.android.internal.telephony;

import android.text.TextUtils;
import android.util.SparseIntArray;
import com.vvt.callmanager.ref.g;
import com.vvt.f.a;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GsmAlphabet
{
  public static final byte GSM_EXTENDED_ESCAPE = 27;
  private static final boolean LOGV = false;
  private static final String TAG = "GSM";
  public static final int UDH_SEPTET_COST_CONCATENATED_MESSAGE = 6;
  public static final int UDH_SEPTET_COST_LENGTH = 1;
  public static final int UDH_SEPTET_COST_ONE_SHIFT_TABLE = 4;
  public static final int UDH_SEPTET_COST_TWO_SHIFT_TABLES = 7;
  private static final SparseIntArray[] sCharsToGsmTables;
  private static final SparseIntArray[] sCharsToShiftTables;
  private static boolean sDisableCountryEncodingCheck;
  private static int[] sEnabledLockingShiftTables;
  private static int[] sEnabledSingleShiftTables;
  private static int sHighestEnabledSingleShiftCode;
  private static final String[] sLanguageShiftTables;
  private static final String[] sLanguageTables;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    LOGV = g.a;
    sDisableCountryEncodingCheck = false;
    Object localObject1 = new String[14];
    localObject1[0] = "@£$¥èéùìòÇ\nØø\rÅåΔ_ΦΓΛΩΠΨΣΘΞ￿ÆæßÉ !\"#¤%&'()*+,-./0123456789:;<=>?¡ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÑÜ§¿abcdefghijklmnopqrstuvwxyzäöñüà";
    localObject1[m] = "@£$¥€éùıòÇ\nĞğ\rÅåΔ_ΦΓΛΩΠΨΣΘΞ￿ŞşßÉ !\"#¤%&'()*+,-./0123456789:;<=>?İABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÑÜ§çabcdefghijklmnopqrstuvwxyzäöñüà";
    localObject1[k] = "";
    localObject1[j] = "@£$¥êéúíóç\nÔô\rÁáΔ_ªÇÀ∞^\\€Ó|￿ÂâÊÉ !\"#º%&'()*+,-./0123456789:;<=>?ÍABCDEFGHIJKLMNOPQRSTUVWXYZÃÕÚÜ§~abcdefghijklmnopqrstuvwxyzãõ`üà";
    localObject1[i] = "ঁংঃঅআইঈউঊঋ\nঌ \r এঐ  ওঔকখগঘঙচ￿ছজঝঞ !টঠডঢণত)(থদ,ধ.ন0123456789:; পফ?বভমযর ল   শষসহ়ঽািীুূৃৄ  েৈ  োৌ্ৎabcdefghijklmnopqrstuvwxyzৗড়ঢ়ৰৱ";
    localObject1[5] = "ઁંઃઅઆઇઈઉઊઋ\nઌઍ\r એઐઑ ઓઔકખગઘઙચ￿છજઝઞ !ટઠડઢણત)(થદ,ધ.ન0123456789:; પફ?બભમયર લળ વશષસહ઼ઽાિીુૂૃૄૅ ેૈૉ ોૌ્ૐabcdefghijklmnopqrstuvwxyzૠૡૢૣ૱";
    localObject1[6] = "ँंःअआइईउऊऋ\nऌऍ\rऎएऐऑऒओऔकखगघङच￿छजझञ !टठडढणत)(थद,ध.न0123456789:;ऩपफ?बभमयरऱलळऴवशषसह़ऽािीुूृॄॅॆेैॉॊोौ्ॐabcdefghijklmnopqrstuvwxyzॲॻॼॾॿ";
    localObject1[7] = " ಂಃಅಆಇಈಉಊಋ\nಌ \rಎಏಐ ಒಓಔಕಖಗಘಙಚ￿ಛಜಝಞ !ಟಠಡಢಣತ)(ಥದ,ಧ.ನ0123456789:; ಪಫ?ಬಭಮಯರಱಲಳ ವಶಷಸಹ಼ಽಾಿೀುೂೃೄ ೆೇೈ ೊೋೌ್ೕabcdefghijklmnopqrstuvwxyzೖೠೡೢೣ";
    localObject1[8] = " ംഃഅആഇഈഉഊഋ\nഌ \rഎഏഐ ഒഓഔകഖഗഘങച￿ഛജഝഞ !ടഠഡഢണത)(ഥദ,ധ.ന0123456789:; പഫ?ബഭമയരറലളഴവശഷസഹ ഽാിീുൂൃൄ െേൈ ൊോൌ്ൗabcdefghijklmnopqrstuvwxyzൠൡൢൣ൹";
    localObject1[9] = "ଁଂଃଅଆଇଈଉଊଋ\nଌ \r ଏଐ  ଓଔକଖଗଘଙଚ￿ଛଜଝଞ !ଟଠଡଢଣତ)(ଥଦ,ଧ.ନ0123456789:; ପଫ?ବଭମଯର ଲଳ ଵଶଷସହ଼ଽାିୀୁୂୃୄ  େୈ  ୋୌ୍ୖabcdefghijklmnopqrstuvwxyzୗୠୡୢୣ";
    localObject1[10] = "ਁਂਃਅਆਇਈਉਊ \n  \r ਏਐ  ਓਔਕਖਗਘਙਚ￿ਛਜਝਞ !ਟਠਡਢਣਤ)(ਥਦ,ਧ.ਨ0123456789:; ਪਫ?ਬਭਮਯਰ ਲਲ਼ ਵਸ਼ ਸਹ਼ ਾਿੀੁੂ    ੇੈ  ੋੌ੍ੑabcdefghijklmnopqrstuvwxyzੰੱੲੳੴ";
    localObject1[11] = " ஂஃஅஆஇஈஉஊ \n  \rஎஏஐ ஒஓஔக   ஙச￿ ஜ ஞ !ட   ணத)(  , .ந0123456789:;னப ?  மயரறலளழவஶஷஸஹ  ாிீுூ   ெேை ொோௌ்ௐabcdefghijklmnopqrstuvwxyzௗ௰௱௲௹";
    localObject1[12] = "ఁంఃఅఆఇఈఉఊఋ\nఌ \rఎఏఐ ఒఓఔకఖగఘఙచ￿ఛజఝఞ !టఠడఢణత)(థద,ధ.న0123456789:; పఫ?బభమయరఱలళ వశషసహ ఽాిీుూృౄ ెేై ొోౌ్ౕabcdefghijklmnopqrstuvwxyzౖౠౡౢౣ";
    localObject1[13] = "اآبٻڀپڦتۂٿ\nٹٽ\rٺټثجځڄڃڅچڇحخد￿ڌڈډڊ !ڏڍذرڑړ)(ڙز,ږ.ژ0123456789:;ښسش?صضطظعفقکڪګگڳڱلمنںڻڼوۄەہھءیېےٍُِٗٔabcdefghijklmnopqrstuvwxyzّٰٕٖٓ";
    sLanguageTables = (String[])localObject1;
    int n = 14;
    localObject1 = new String[n];
    localObject1[0] = "          \f         ^                   {}     \\            [~] |                                    €                          ";
    localObject1[m] = "          \f         ^                   {}     \\            [~] |      Ğ İ         Ş               ç € ğ ı         ş            ";
    localObject1[k] = "         ç\f         ^                   {}     \\            [~] |Á       Í     Ó     Ú           á   €   í     ó     ú          ";
    localObject1[j] = "     ê   ç\fÔô Áá  ΦΓ^ΩΠΨΣΘ     Ê        {}     \\            [~] |À       Í     Ó     Ú     ÃÕ    Â   €   í     ó     ú     ãõ  â";
    String str1 = "@£$¥¿\"¤%&'\f*+ -/<=>¡^¡_#*০১ ২৩৪৫৬৭৮৯য়ৠৡৢ{}ৣ৲৳৴৵\\৶৷৸৹৺       [~] |ABCDEFGHIJKLMNOPQRSTUVWXYZ          €                          ";
    localObject1[i] = str1;
    localObject1[5] = "@£$¥¿\"¤%&'\f*+ -/<=>¡^¡_#*।॥ ૦૧૨૩૪૫૬૭૮૯  {}     \\            [~] |ABCDEFGHIJKLMNOPQRSTUVWXYZ          €                          ";
    localObject1[6] = "@£$¥¿\"¤%&'\f*+ -/<=>¡^¡_#*।॥ ०१२३४५६७८९॒॑{}॓॔क़ख़ग़\\ज़ड़ढ़फ़य़ॠॡॢॣ॰ॱ [~] |ABCDEFGHIJKLMNOPQRSTUVWXYZ          €                          ";
    localObject1[7] = "@£$¥¿\"¤%&'\f*+ -/<=>¡^¡_#*।॥ ೦೧೨೩೪೫೬೭೮೯ೞೱ{}ೲ    \\            [~] |ABCDEFGHIJKLMNOPQRSTUVWXYZ          €                          ";
    localObject1[8] = "@£$¥¿\"¤%&'\f*+ -/<=>¡^¡_#*।॥ ൦൧൨൩൪൫൬൭൮൯൰൱{}൲൳൴൵ൺ\\ൻർൽൾൿ       [~] |ABCDEFGHIJKLMNOPQRSTUVWXYZ          €                          ";
    localObject1[9] = "@£$¥¿\"¤%&'\f*+ -/<=>¡^¡_#*।॥ ୦୧୨୩୪୫୬୭୮୯ଡ଼ଢ଼{}ୟ୰ୱ  \\            [~] |ABCDEFGHIJKLMNOPQRSTUVWXYZ          €                          ";
    localObject1[10] = "@£$¥¿\"¤%&'\f*+ -/<=>¡^¡_#*।॥ ੦੧੨੩੪੫੬੭੮੯ਖ਼ਗ਼{}ਜ਼ੜਫ਼ੵ \\            [~] |ABCDEFGHIJKLMNOPQRSTUVWXYZ          €                          ";
    localObject1[11] = "@£$¥¿\"¤%&'\f*+ -/<=>¡^¡_#*।॥ ௦௧௨௩௪௫௬௭௮௯௳௴{}௵௶௷௸௺\\            [~] |ABCDEFGHIJKLMNOPQRSTUVWXYZ          €                          ";
    localObject1[12] = "@£$¥¿\"¤%&'\f*+ -/<=>¡^¡_#*   ౦౧౨౩౪౫౬౭౮౯ౘౙ{}౸౹౺౻౼\\౽౾౿         [~] |ABCDEFGHIJKLMNOPQRSTUVWXYZ          €                          ";
    int i6 = 13;
    String str2 = "@£$¥¿\"¤%&'\f*+ -/<=>¡^¡_#*؀؁ ۰۱۲۳۴۵۶۷۸۹،؍{}؎؏ؐؑؒ\\ؓؔ؛؟ـْ٘٫٬ٲٳۍ[~]۔|ABCDEFGHIJKLMNOPQRSTUVWXYZ          €                          ";
    localObject1[i6] = str2;
    sLanguageShiftTables = (String[])localObject1;
    enableCountrySpecificEncodings();
    int i7 = sLanguageTables.length;
    localObject1 = sLanguageShiftTables;
    m = localObject1.length;
    if (i7 != m)
    {
      boolean bool = LOGV;
      if (!bool) {}
    }
    localObject1 = new SparseIntArray[i7];
    sCharsToGsmTables = (SparseIntArray[])localObject1;
    i6 = 0;
    str1 = null;
    int i8;
    int i3;
    while (i6 < i7)
    {
      localObject1 = sLanguageTables;
      Object localObject2 = localObject1[i6];
      j = ((String)localObject2).length();
      if (j != 0)
      {
        int i1 = 128;
        if (j != i1)
        {
          i2 = LOGV;
          if (i2 == 0) {}
        }
      }
      SparseIntArray localSparseIntArray1 = new android/util/SparseIntArray;
      localSparseIntArray1.<init>(j);
      sCharsToGsmTables[i6] = localSparseIntArray1;
      int i2 = 0;
      localObject1 = null;
      while (i2 < j)
      {
        i8 = ((String)localObject2).charAt(i2);
        localSparseIntArray1.put(i8, i2);
        i2 += 1;
      }
      i3 = i6 + 1;
      i6 = i3;
    }
    localObject1 = new SparseIntArray[i7];
    sCharsToShiftTables = (SparseIntArray[])localObject1;
    i6 = 0;
    str1 = null;
    while (i6 < m)
    {
      localObject1 = sLanguageShiftTables;
      str2 = localObject1[i6];
      k = str2.length();
      if (k != 0)
      {
        i3 = 128;
        if (k != i3)
        {
          i4 = LOGV;
          if (i4 == 0) {}
        }
      }
      SparseIntArray localSparseIntArray2 = new android/util/SparseIntArray;
      localSparseIntArray2.<init>(k);
      sCharsToShiftTables[i6] = localSparseIntArray2;
      int i4 = 0;
      localObject1 = null;
      while (i4 < k)
      {
        i = str2.charAt(i4);
        i8 = 32;
        if (i != i8) {
          localSparseIntArray2.put(i, i4);
        }
        i4 += 1;
      }
      int i5 = i6 + 1;
      i6 = i5;
    }
  }
  
  public static int charToGsm(char paramChar)
  {
    i = 32;
    j = 0;
    Object localObject = null;
    try
    {
      j = charToGsm(paramChar, false);
    }
    catch (EncodeException localEncodeException)
    {
      for (;;)
      {
        SparseIntArray localSparseIntArray = sCharsToGsmTables[0];
        j = localSparseIntArray.get(i, i);
      }
    }
    return j;
  }
  
  public static int charToGsm(char paramChar, boolean paramBoolean)
  {
    int i = 32;
    int j = -1;
    Object localObject = sCharsToGsmTables[0];
    int k = ((SparseIntArray)localObject).get(paramChar, j);
    if (k == j)
    {
      localObject = sCharsToShiftTables[0];
      k = ((SparseIntArray)localObject).get(paramChar, j);
      if (k != j) {
        break label86;
      }
      if (paramBoolean)
      {
        localObject = new com/android/internal/telephony/EncodeException;
        ((EncodeException)localObject).<init>(paramChar);
        throw ((Throwable)localObject);
      }
      localObject = sCharsToGsmTables[0];
    }
    label86:
    for (k = ((SparseIntArray)localObject).get(i, i);; k = 27) {
      return k;
    }
  }
  
  public static int charToGsmExtended(char paramChar)
  {
    int i = 32;
    int j = -1;
    SparseIntArray localSparseIntArray = sCharsToShiftTables[0];
    int k = localSparseIntArray.get(paramChar, j);
    if (k == j)
    {
      localSparseIntArray = sCharsToGsmTables[0];
      k = localSparseIntArray.get(i, i);
    }
    return k;
  }
  
  public static int countGsmSeptets(char paramChar)
  {
    int i = 0;
    try
    {
      i = countGsmSeptets(paramChar, false);
    }
    catch (EncodeException localEncodeException)
    {
      for (;;) {}
    }
    return i;
  }
  
  public static int countGsmSeptets(char paramChar, boolean paramBoolean)
  {
    int i = 1;
    int j = -1;
    SparseIntArray localSparseIntArray = sCharsToGsmTables[0];
    int k = localSparseIntArray.get(paramChar, j);
    if (k != j) {}
    do
    {
      for (;;)
      {
        return i;
        localSparseIntArray = sCharsToShiftTables[0];
        k = localSparseIntArray.get(paramChar, j);
        if (k == j) {
          break;
        }
        i = 2;
      }
    } while (!paramBoolean);
    EncodeException localEncodeException = new com/android/internal/telephony/EncodeException;
    localEncodeException.<init>(paramChar);
    throw localEncodeException;
  }
  
  public static GsmAlphabet.TextEncodingDetails countGsmSeptets(CharSequence paramCharSequence, boolean paramBoolean)
  {
    boolean bool1 = sDisableCountryEncodingCheck;
    if (!bool1) {
      enableCountrySpecificEncodings();
    }
    Object localObject1 = sEnabledSingleShiftTables;
    int i = localObject1.length;
    Object localObject2 = sEnabledLockingShiftTables;
    int i1 = localObject2.length;
    i += i1;
    int[] arrayOfInt1;
    int i2;
    if (i == 0)
    {
      localObject1 = new com/android/internal/telephony/GsmAlphabet$TextEncodingDetails;
      ((GsmAlphabet.TextEncodingDetails)localObject1).<init>();
      localObject2 = null;
      arrayOfInt1 = null;
      i1 = countGsmSeptetsUsingTables(paramCharSequence, paramBoolean, 0, 0);
      i2 = -1;
      if (i1 == i2)
      {
        i = 0;
        localObject1 = null;
      }
    }
    for (;;)
    {
      return (GsmAlphabet.TextEncodingDetails)localObject1;
      ((GsmAlphabet.TextEncodingDetails)localObject1).codeUnitSize = 1;
      ((GsmAlphabet.TextEncodingDetails)localObject1).codeUnitCount = i1;
      i2 = 160;
      if (i1 > i2)
      {
        i2 = (i1 + 152) / 153;
        ((GsmAlphabet.TextEncodingDetails)localObject1).msgCount = i2;
        i2 = ((GsmAlphabet.TextEncodingDetails)localObject1).msgCount * 153;
        i1 = i2 - i1;
      }
      for (((GsmAlphabet.TextEncodingDetails)localObject1).codeUnitsRemaining = i1;; ((GsmAlphabet.TextEncodingDetails)localObject1).codeUnitsRemaining = i1)
      {
        i1 = 1;
        ((GsmAlphabet.TextEncodingDetails)localObject1).codeUnitSize = i1;
        break;
        i2 = 1;
        ((GsmAlphabet.TextEncodingDetails)localObject1).msgCount = i2;
        i1 = 160 - i1;
      }
      int i3 = sHighestEnabledSingleShiftCode;
      ArrayList localArrayList = new java/util/ArrayList;
      i = sEnabledLockingShiftTables.length + 1;
      localArrayList.<init>(i);
      localObject1 = new com/android/internal/telephony/GsmAlphabet$LanguagePairCount;
      i1 = 0;
      ((GsmAlphabet.LanguagePairCount)localObject1).<init>(0);
      localArrayList.add(localObject1);
      localObject2 = sEnabledLockingShiftTables;
      i2 = localObject2.length;
      i = 0;
      localObject1 = null;
      while (i < i2)
      {
        i4 = localObject2[i];
        if (i4 != 0)
        {
          localObject3 = sLanguageTables[i4];
          boolean bool6 = a.b((String)localObject3);
          if (!bool6)
          {
            localObject3 = new com/android/internal/telephony/GsmAlphabet$LanguagePairCount;
            ((GsmAlphabet.LanguagePairCount)localObject3).<init>(i4);
            localArrayList.add(localObject3);
          }
        }
        i += 1;
      }
      int i4 = paramCharSequence.length();
      i = 0;
      localObject1 = null;
      i2 = 0;
      arrayOfInt1 = null;
      Iterator localIterator;
      label453:
      int i7;
      while (i2 < i4)
      {
        boolean bool2 = localArrayList.isEmpty();
        if (!bool2)
        {
          int i5 = paramCharSequence.charAt(i2);
          int j = 27;
          if (i5 == j)
          {
            boolean bool3 = LOGV;
            if (bool3) {}
            int k = i2 + 1;
            i2 = k;
          }
          else
          {
            localIterator = localArrayList.iterator();
            for (;;)
            {
              boolean bool4 = localIterator.hasNext();
              if (!bool4) {
                break;
              }
              localObject1 = (GsmAlphabet.LanguagePairCount)localIterator.next();
              localObject2 = sCharsToGsmTables;
              int i6 = ((GsmAlphabet.LanguagePairCount)localObject1).languageCode;
              localObject2 = localObject2[i6];
              i1 = ((SparseIntArray)localObject2).get(i5, -1);
              i6 = -1;
              if (i1 == i6)
              {
                i1 = 0;
                localObject2 = null;
                if (i1 <= i3)
                {
                  localObject4 = ((GsmAlphabet.LanguagePairCount)localObject1).septetCounts;
                  i6 = localObject4[i1];
                  i7 = -1;
                  if (i6 != i7)
                  {
                    localObject4 = sCharsToShiftTables[i1];
                    i6 = ((SparseIntArray)localObject4).get(i5, -1);
                    i7 = -1;
                    if (i6 != i7) {
                      break label587;
                    }
                    if (!paramBoolean) {
                      break label568;
                    }
                    localObject4 = ((GsmAlphabet.LanguagePairCount)localObject1).septetCounts;
                    i7 = localObject4[i1] + 1;
                    localObject4[i1] = i7;
                    localObject4 = ((GsmAlphabet.LanguagePairCount)localObject1).unencodableCounts;
                    i7 = localObject4[i1] + 1;
                    localObject4[i1] = i7;
                  }
                }
                for (;;)
                {
                  i1 += 1;
                  break label453;
                  break;
                  label568:
                  localObject4 = ((GsmAlphabet.LanguagePairCount)localObject1).septetCounts;
                  i7 = -1;
                  localObject4[i1] = i7;
                  continue;
                  label587:
                  localObject4 = ((GsmAlphabet.LanguagePairCount)localObject1).septetCounts;
                  i7 = localObject4[i1] + 2;
                  localObject4[i1] = i7;
                }
              }
              i1 = 0;
              localObject2 = null;
              while (i1 <= i3)
              {
                localObject4 = ((GsmAlphabet.LanguagePairCount)localObject1).septetCounts;
                i6 = localObject4[i1];
                i7 = -1;
                if (i6 != i7)
                {
                  localObject4 = ((GsmAlphabet.LanguagePairCount)localObject1).septetCounts;
                  i7 = localObject4[i1] + 1;
                  localObject4[i1] = i7;
                }
                i1 += 1;
              }
            }
          }
        }
      }
      Object localObject3 = new com/android/internal/telephony/GsmAlphabet$TextEncodingDetails;
      ((GsmAlphabet.TextEncodingDetails)localObject3).<init>();
      ((GsmAlphabet.TextEncodingDetails)localObject3).msgCount = (-1 >>> 1);
      ((GsmAlphabet.TextEncodingDetails)localObject3).codeUnitSize = 1;
      int m = -1 >>> 1;
      Object localObject4 = localArrayList.iterator();
      i1 = m;
      int i8;
      for (;;)
      {
        boolean bool5 = ((Iterator)localObject4).hasNext();
        if (!bool5) {
          break label1054;
        }
        localObject1 = (GsmAlphabet.LanguagePairCount)((Iterator)localObject4).next();
        i2 = 0;
        arrayOfInt1 = null;
        i8 = 0;
        localIterator = null;
        while (i8 <= i3)
        {
          arrayOfInt1 = ((GsmAlphabet.LanguagePairCount)localObject1).septetCounts;
          i7 = arrayOfInt1[i8];
          i2 = -1;
          if (i7 != i2) {
            break label797;
          }
          i2 = i8 + 1;
          i8 = i2;
        }
      }
      label797:
      i2 = ((GsmAlphabet.LanguagePairCount)localObject1).languageCode;
      label817:
      int i9;
      if ((i2 != 0) && (i8 != 0))
      {
        i2 = 8;
        i9 = i7 + i2;
        i4 = 160;
        if (i9 <= i4) {
          break label1037;
        }
        if (i2 == 0) {
          i2 = 1;
        }
        i2 += 6;
        i2 = 160 - i2;
        i9 = (i7 + i2 + -1) / i2;
      }
      for (i2 = i2 * i9 - i7;; i2 = 160 - i2 - i7)
      {
        int[] arrayOfInt2 = ((GsmAlphabet.LanguagePairCount)localObject1).unencodableCounts;
        i4 = arrayOfInt2[i8];
        if ((paramBoolean) && (i4 > i1)) {
          break;
        }
        if ((!paramBoolean) || (i4 >= i1))
        {
          int i10 = ((GsmAlphabet.TextEncodingDetails)localObject3).msgCount;
          if (i9 >= i10)
          {
            i10 = ((GsmAlphabet.TextEncodingDetails)localObject3).msgCount;
            if (i9 != i10) {
              break;
            }
            i10 = ((GsmAlphabet.TextEncodingDetails)localObject3).codeUnitsRemaining;
            if (i2 <= i10) {
              break;
            }
          }
        }
        ((GsmAlphabet.TextEncodingDetails)localObject3).msgCount = i9;
        ((GsmAlphabet.TextEncodingDetails)localObject3).codeUnitCount = i7;
        ((GsmAlphabet.TextEncodingDetails)localObject3).codeUnitsRemaining = i2;
        i1 = ((GsmAlphabet.LanguagePairCount)localObject1).languageCode;
        ((GsmAlphabet.TextEncodingDetails)localObject3).languageTable = i1;
        ((GsmAlphabet.TextEncodingDetails)localObject3).languageShiftTable = i8;
        i1 = i4;
        break;
        i2 = ((GsmAlphabet.LanguagePairCount)localObject1).languageCode;
        if ((i2 != 0) || (i8 != 0))
        {
          i2 = 5;
          break label817;
        }
        i2 = 0;
        arrayOfInt1 = null;
        break label817;
        label1037:
        i9 = 1;
      }
      label1054:
      int n = ((GsmAlphabet.TextEncodingDetails)localObject3).msgCount;
      i1 = -1 >>> 1;
      if (n == i1)
      {
        n = 0;
        localObject1 = null;
      }
      else
      {
        localObject1 = localObject3;
      }
    }
  }
  
  public static int countGsmSeptetsUsingTables(CharSequence paramCharSequence, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = -1;
    int k = paramCharSequence.length();
    SparseIntArray localSparseIntArray1 = sCharsToGsmTables[paramInt1];
    SparseIntArray localSparseIntArray2 = sCharsToShiftTables[paramInt2];
    int m = 0;
    if (m < k)
    {
      int n = paramCharSequence.charAt(m);
      int i3 = 27;
      int i1;
      if (n == i3)
      {
        i1 = LOGV;
        if (i1 == 0) {}
      }
      for (;;)
      {
        m += 1;
        break;
        i3 = localSparseIntArray1.get(i1, j);
        if (i3 != j)
        {
          i += 1;
        }
        else
        {
          int i2 = localSparseIntArray2.get(i1, j);
          if (i2 != j)
          {
            i += 2;
          }
          else
          {
            if (!paramBoolean) {
              break label145;
            }
            i += 1;
          }
        }
      }
      label145:
      i = j;
    }
    return i;
  }
  
  private static void enableCountrySpecificEncodings()
  {
    int[] arrayOfInt1 = sEnabledSingleShiftTables;
    int i = arrayOfInt1.length;
    if (i > 0)
    {
      arrayOfInt1 = sEnabledSingleShiftTables;
      int[] arrayOfInt2 = sEnabledSingleShiftTables;
      int j = arrayOfInt2.length + -1;
      i = arrayOfInt1[j];
    }
    for (sHighestEnabledSingleShiftCode = i;; sHighestEnabledSingleShiftCode = 0)
    {
      return;
      i = 0;
      arrayOfInt1 = null;
    }
  }
  
  public static int findGsmSeptetLimitIndex(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = -1;
    int j = 0;
    int k = paramString.length();
    SparseIntArray localSparseIntArray1 = sCharsToGsmTables[paramInt3];
    SparseIntArray[] arrayOfSparseIntArray = sCharsToShiftTables;
    SparseIntArray localSparseIntArray2 = arrayOfSparseIntArray[paramInt4];
    int m = paramInt1;
    if (m < k)
    {
      int n = paramString.charAt(m);
      n = localSparseIntArray1.get(n, i);
      if (n == i)
      {
        n = paramString.charAt(m);
        n = localSparseIntArray2.get(n, i);
        if (n == i)
        {
          j += 1;
          label99:
          if (j <= paramInt2) {
            break label126;
          }
        }
      }
    }
    for (;;)
    {
      return m;
      j += 2;
      break label99;
      j += 1;
      break label99;
      label126:
      m += 1;
      break;
      m = k;
    }
  }
  
  static int[] getEnabledLockingShiftTables()
  {
    synchronized (GsmAlphabet.class)
    {
      int[] arrayOfInt = sEnabledLockingShiftTables;
      return arrayOfInt;
    }
  }
  
  static int[] getEnabledSingleShiftTables()
  {
    synchronized (GsmAlphabet.class)
    {
      int[] arrayOfInt = sEnabledSingleShiftTables;
      return arrayOfInt;
    }
  }
  
  public static String gsm7BitPackedToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return gsm7BitPackedToString(paramArrayOfByte, paramInt1, paramInt2, 0, 0, 0);
  }
  
  public static String gsm7BitPackedToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(paramInt2);
    Object localObject1;
    if (paramInt4 >= 0)
    {
      localObject1 = sLanguageTables;
      int i = localObject1.length;
      if (paramInt4 <= i) {}
    }
    else
    {
      boolean bool1 = LOGV;
      if (bool1) {}
      paramInt4 = 0;
    }
    boolean bool2;
    if (paramInt5 >= 0)
    {
      localObject1 = sLanguageShiftTables;
      int j = localObject1.length;
      if (paramInt5 <= j) {}
    }
    else
    {
      bool2 = LOGV;
      if (bool2) {}
      paramInt5 = 0;
    }
    int k = 0;
    for (;;)
    {
      Object localObject2;
      Object localObject3;
      int i1;
      String str;
      try
      {
        localObject1 = sLanguageTables;
        localObject2 = localObject1[paramInt4];
        localObject1 = sLanguageShiftTables;
        localObject1 = localObject1[paramInt5];
        int m = a.b((String)localObject2);
        if (m == 0) {
          break label477;
        }
        boolean bool3 = LOGV;
        if (bool3) {}
        localObject2 = sLanguageTables;
        m = 0;
        localObject2 = localObject2[0];
        localObject3 = localObject2;
        bool3 = a.b((String)localObject1);
        if (bool3)
        {
          bool2 = LOGV;
          if (bool2) {}
          localObject1 = sLanguageShiftTables;
          bool3 = false;
          localObject2 = null;
          localObject1 = localObject1[0];
        }
        m = 0;
        bool3 = false;
        localObject2 = null;
        if (m >= paramInt2) {
          break label467;
        }
        k = m * 7 + paramInt3;
        i2 = k / 8;
        int i3 = k % 8;
        k = paramInt1 + i2;
        k = paramArrayOfByte[k] >> i3 & 0x7F;
        int i4 = 1;
        if (i3 > i4)
        {
          int i5 = i3 + -1;
          i4 = 127 >> i5;
          k &= i4;
          i2 = i2 + paramInt1 + 1;
          i2 = paramArrayOfByte[i2];
          i3 = 8 - i3;
          i2 = i2 << i3 & 0x7F;
          k |= i2;
        }
        if (!bool3) {
          break label430;
        }
        int n = 27;
        if (k == n)
        {
          i1 = 32;
          localStringBuilder.append(i1);
          i1 = 0;
          localObject2 = null;
          k = m + 1;
          m = k;
          continue;
        }
        i1 = ((String)localObject1).charAt(k);
        i2 = 32;
        if (i1 == i2)
        {
          i1 = ((String)localObject3).charAt(k);
          localStringBuilder.append(i1);
          continue;
        }
        localStringBuilder.append(i1);
      }
      catch (RuntimeException localRuntimeException)
      {
        bool2 = LOGV;
        if (bool2) {}
        bool2 = false;
        str = null;
        return str;
      }
      continue;
      label430:
      int i2 = 27;
      if (k == i2)
      {
        i1 = 1;
      }
      else
      {
        k = ((String)localObject3).charAt(k);
        localStringBuilder.append(k);
        continue;
        label467:
        str = localStringBuilder.toString();
        continue;
        label477:
        localObject3 = localObject2;
      }
    }
  }
  
  public static String gsm8BitUnpackedToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return gsm8BitUnpackedToString(paramArrayOfByte, paramInt1, paramInt2, "");
  }
  
  public static String gsm8BitUnpackedToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString)
  {
    int i = 0;
    Charset localCharset = null;
    int j = 0;
    ByteBuffer localByteBuffer = null;
    boolean bool = TextUtils.isEmpty(paramString);
    if (!bool)
    {
      localObject1 = "us-ascii";
      bool = paramString.equalsIgnoreCase((String)localObject1);
      if (!bool)
      {
        bool = Charset.isSupported(paramString);
        if (bool)
        {
          i = 1;
          localCharset = Charset.forName(paramString);
          j = 2;
          localByteBuffer = ByteBuffer.allocate(j);
        }
      }
    }
    String str = sLanguageTables[0];
    Object localObject1 = sLanguageShiftTables;
    Object localObject2 = localObject1[0];
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(paramInt2);
    int m = 0;
    int k = paramInt1;
    int i2 = paramInt1 + paramInt2;
    if (k < i2)
    {
      i2 = paramArrayOfByte[k] & 0xFF;
      int i4 = 255;
      if (i2 != i4) {}
    }
    else
    {
      return localStringBuilder.toString();
    }
    int i5 = 27;
    if (i2 == i5)
    {
      if (m != 0) {
        localStringBuilder.append(' ');
      }
      for (m = 0;; m = 1)
      {
        k += 1;
        break;
      }
    }
    if (m != 0)
    {
      m = ((String)localObject2).charAt(i2);
      int i6 = 32;
      if (m == i6)
      {
        m = str.charAt(i2);
        localStringBuilder.append(m);
      }
    }
    for (;;)
    {
      m = 0;
      break;
      localStringBuilder.append(m);
      continue;
      if (i != 0)
      {
        m = 128;
        if (i2 >= m)
        {
          n = k + 1;
          int i7 = paramInt1 + paramInt2;
          if (n < i7) {
            break label302;
          }
        }
      }
      int n = str.charAt(i2);
      localStringBuilder.append(n);
      continue;
      label302:
      localByteBuffer.clear();
      int i1 = k + 1;
      int i3 = 2;
      localByteBuffer.put(paramArrayOfByte, k, i3);
      localByteBuffer.flip();
      localObject1 = localCharset.decode(localByteBuffer).toString();
      localStringBuilder.append((String)localObject1);
      k = i1;
    }
  }
  
  public static char gsmExtendedToChar(int paramInt)
  {
    int i = 32;
    int j = 27;
    if (paramInt == j) {}
    for (;;)
    {
      return i;
      if (paramInt >= 0)
      {
        j = 128;
        if (paramInt < j)
        {
          String str1 = sLanguageShiftTables[0];
          j = str1.charAt(paramInt);
          if (j == i)
          {
            String str2 = sLanguageTables[0];
            i = str2.charAt(paramInt);
          }
          else
          {
            i = j;
          }
        }
      }
    }
  }
  
  public static char gsmToChar(int paramInt)
  {
    String str;
    if (paramInt >= 0)
    {
      i = 128;
      if (paramInt < i) {
        str = sLanguageTables[0];
      }
    }
    for (int i = str.charAt(paramInt);; i = 32) {
      return i;
    }
  }
  
  private static void packSmsChar(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt1 / 8;
    int j = paramInt1 % 8;
    i += 1;
    int k = paramArrayOfByte[i];
    int m = paramInt2 << j;
    k = (byte)(k | m);
    paramArrayOfByte[i] = k;
    k = 1;
    if (j > k)
    {
      i += 1;
      j = 8 - j;
      j = (byte)(paramInt2 >> j);
      paramArrayOfByte[i] = j;
    }
  }
  
  static void setEnabledLockingShiftTables(int[] paramArrayOfInt)
  {
    synchronized (GsmAlphabet.class)
    {
      sEnabledLockingShiftTables = paramArrayOfInt;
      boolean bool = true;
      sDisableCountryEncodingCheck = bool;
      return;
    }
  }
  
  static void setEnabledSingleShiftTables(int[] paramArrayOfInt)
  {
    synchronized (GsmAlphabet.class)
    {
      sEnabledSingleShiftTables = paramArrayOfInt;
      int i = 1;
      sDisableCountryEncodingCheck = i;
      i = paramArrayOfInt.length;
      if (i > 0)
      {
        i = paramArrayOfInt.length + -1;
        i = paramArrayOfInt[i];
        sHighestEnabledSingleShiftCode = i;
        return;
      }
      i = 0;
      Object localObject1 = null;
      sHighestEnabledSingleShiftCode = 0;
    }
  }
  
  public static byte[] stringToGsm7BitPacked(String paramString)
  {
    return stringToGsm7BitPacked(paramString, 0, true, 0, 0);
  }
  
  public static byte[] stringToGsm7BitPacked(String paramString, int paramInt1, int paramInt2)
  {
    return stringToGsm7BitPacked(paramString, 0, true, paramInt1, paramInt2);
  }
  
  public static byte[] stringToGsm7BitPacked(String paramString, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    int i = paramString.length();
    boolean bool;
    if (!paramBoolean) {
      bool = true;
    }
    for (;;)
    {
      j = countGsmSeptetsUsingTables(paramString, bool, paramInt2, paramInt3);
      k = -1;
      if (j != k) {
        break;
      }
      localEncodeException = new com/android/internal/telephony/EncodeException;
      localEncodeException.<init>("countGsmSeptetsUsingTables(): unencodable char");
      throw localEncodeException;
      j = 0;
      localEncodeException = null;
    }
    int m = j + paramInt1;
    int j = 255;
    if (m > j)
    {
      localEncodeException = new com/android/internal/telephony/EncodeException;
      localEncodeException.<init>("Payload cannot exceed 255 septets");
      throw localEncodeException;
    }
    byte[] arrayOfByte = new byte[(m * 7 + 7) / 8 + 1];
    SparseIntArray localSparseIntArray1 = sCharsToGsmTables[paramInt2];
    SparseIntArray localSparseIntArray2 = sCharsToShiftTables[paramInt3];
    j = 0;
    EncodeException localEncodeException = null;
    int k = paramInt1 * 7;
    int n = paramInt1;
    int i1 = 0;
    if ((i1 < i) && (n < m))
    {
      int i2 = paramString.charAt(i1);
      j = localSparseIntArray1.get(i2, -1);
      int i3 = -1;
      if (j == i3)
      {
        j = localSparseIntArray2.get(i2, -1);
        i2 = -1;
        if (j != i2) {
          break label275;
        }
        if (paramBoolean)
        {
          localEncodeException = new com/android/internal/telephony/EncodeException;
          localEncodeException.<init>("stringToGsm7BitPacked(): unencodable char");
          throw localEncodeException;
        }
        i2 = 32;
        j = localSparseIntArray1.get(32, i2);
      }
      for (;;)
      {
        packSmsChar(arrayOfByte, k, j);
        n += 1;
        j = i1 + 1;
        k += 7;
        i1 = j;
        break;
        label275:
        i2 = 27;
        packSmsChar(arrayOfByte, k, i2);
        k += 7;
        n += 1;
      }
    }
    k = (byte)m;
    arrayOfByte[0] = k;
    return arrayOfByte;
  }
  
  public static byte[] stringToGsm7BitPackedWithHeader(String paramString, byte[] paramArrayOfByte)
  {
    return stringToGsm7BitPackedWithHeader(paramString, paramArrayOfByte, 0, 0);
  }
  
  public static byte[] stringToGsm7BitPackedWithHeader(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    int j;
    byte[] arrayOfByte;
    if (paramArrayOfByte != null)
    {
      j = paramArrayOfByte.length;
      if (j != 0) {}
    }
    else
    {
      arrayOfByte = stringToGsm7BitPacked(paramString, paramInt1, paramInt2);
    }
    for (;;)
    {
      return arrayOfByte;
      j = ((paramArrayOfByte.length + 1) * 8 + 6) / 7;
      arrayOfByte = stringToGsm7BitPacked(paramString, j, bool, paramInt1, paramInt2);
      int k = (byte)paramArrayOfByte.length;
      arrayOfByte[bool] = k;
      k = 0;
      int i = 2;
      int m = paramArrayOfByte.length;
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, i, m);
    }
  }
  
  public static byte[] stringToGsm8BitPacked(String paramString)
  {
    byte[] arrayOfByte = new byte[countGsmSeptetsUsingTables(paramString, true, 0, 0)];
    int i = arrayOfByte.length;
    stringToGsm8BitUnpackedField(paramString, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public static void stringToGsm8BitUnpackedField(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 32;
    int j = 0;
    int k = -1;
    SparseIntArray localSparseIntArray1 = sCharsToGsmTables[0];
    SparseIntArray[] arrayOfSparseIntArray = sCharsToShiftTables;
    SparseIntArray localSparseIntArray2 = arrayOfSparseIntArray[0];
    int m = paramString.length();
    int n = 0;
    int i1 = paramInt1;
    int i2;
    if (n < m)
    {
      j = i1 - paramInt1;
      if (j < paramInt2)
      {
        i2 = paramString.charAt(n);
        j = localSparseIntArray1.get(i2, k);
        if (j == k)
        {
          j = localSparseIntArray2.get(i2, k);
          if (j != k) {
            break label148;
          }
          j = localSparseIntArray1.get(i, i);
        }
      }
    }
    for (;;)
    {
      i2 = i1 + 1;
      j = (byte)j;
      paramArrayOfByte[i1] = j;
      j = n + 1;
      n = j;
      i1 = i2;
      break;
      label148:
      i2 = i1 + 1 - paramInt1;
      if (i2 >= paramInt2) {
        for (;;)
        {
          j = i1 - paramInt1;
          if (j >= paramInt2) {
            break;
          }
          j = i1 + 1;
          paramArrayOfByte[i1] = k;
          i1 = j;
        }
      }
      i2 = i1 + 1;
      int i3 = 27;
      paramArrayOfByte[i1] = i3;
      i1 = i2;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/GsmAlphabet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */