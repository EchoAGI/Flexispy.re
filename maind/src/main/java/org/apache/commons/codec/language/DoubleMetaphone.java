package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class DoubleMetaphone
  implements StringEncoder
{
  private static final String[] ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER;
  private static final String[] L_R_N_M_B_H_F_V_W_SPACE;
  private static final String[] L_T_K_S_N_M_B_Z;
  private static final String[] SILENT_START;
  private static final String VOWELS = "AEIOUY";
  protected int maxCodeLen = 4;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    String[] arrayOfString = new String[5];
    arrayOfString[0] = "GN";
    arrayOfString[m] = "KN";
    arrayOfString[k] = "PN";
    arrayOfString[j] = "WR";
    arrayOfString[i] = "PS";
    SILENT_START = arrayOfString;
    arrayOfString = new String[10];
    arrayOfString[0] = "L";
    arrayOfString[m] = "R";
    arrayOfString[k] = "N";
    arrayOfString[j] = "M";
    arrayOfString[i] = "B";
    arrayOfString[5] = "H";
    arrayOfString[6] = "F";
    arrayOfString[7] = "V";
    arrayOfString[8] = "W";
    arrayOfString[9] = " ";
    L_R_N_M_B_H_F_V_W_SPACE = arrayOfString;
    arrayOfString = new String[11];
    arrayOfString[0] = "ES";
    arrayOfString[m] = "EP";
    arrayOfString[k] = "EB";
    arrayOfString[j] = "EL";
    arrayOfString[i] = "EY";
    arrayOfString[5] = "IB";
    arrayOfString[6] = "IL";
    arrayOfString[7] = "IN";
    arrayOfString[8] = "IE";
    arrayOfString[9] = "EI";
    arrayOfString[10] = "ER";
    ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER = arrayOfString;
    arrayOfString = new String[8];
    arrayOfString[0] = "L";
    arrayOfString[m] = "T";
    arrayOfString[k] = "K";
    arrayOfString[j] = "S";
    arrayOfString[i] = "N";
    arrayOfString[5] = "M";
    arrayOfString[6] = "B";
    arrayOfString[7] = "Z";
    L_T_K_S_N_M_B_Z = arrayOfString;
  }
  
  private String cleanInput(String paramString)
  {
    Object localObject = null;
    if (paramString == null) {}
    for (;;)
    {
      return (String)localObject;
      paramString = paramString.trim();
      int i = paramString.length();
      if (i != 0)
      {
        localObject = Locale.ENGLISH;
        localObject = paramString.toUpperCase((Locale)localObject);
      }
    }
  }
  
  private boolean conditionC0(String paramString, int paramInt)
  {
    int i = 1;
    int j = 0;
    String str1 = "CHIA";
    boolean bool1 = contains(paramString, paramInt, 4, str1);
    if (bool1) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt > i)
      {
        int m = paramInt + -2;
        m = charAt(paramString, m);
        boolean bool2 = isVowel(m);
        if (!bool2)
        {
          int n = paramInt + -1;
          int i2 = 3;
          String str2 = "ACH";
          boolean bool3 = contains(paramString, n, i2, str2);
          if (bool3)
          {
            int i1 = paramInt + 2;
            int i3 = charAt(paramString, i1);
            i1 = 73;
            if (i3 != i1)
            {
              i1 = 69;
              if (i3 != i1) {}
            }
            else
            {
              i1 = paramInt + -2;
              i2 = 6;
              str2 = "BACHER";
              String str3 = "MACHER";
              boolean bool4 = contains(paramString, i1, i2, str2, str3);
              if (!bool4) {
                continue;
              }
            }
            int k = i;
          }
        }
      }
    }
  }
  
  private boolean conditionCH0(String paramString, int paramInt)
  {
    int i = 5;
    boolean bool1;
    String str1;
    if (paramInt != 0)
    {
      bool1 = false;
      str1 = null;
    }
    for (;;)
    {
      return bool1;
      int j = paramInt + 1;
      String str2 = "HARAC";
      String str3 = "HARIS";
      boolean bool2 = contains(paramString, j, i, str2, str3);
      if (!bool2)
      {
        int k = paramInt + 1;
        int m = 3;
        String str4 = "HOR";
        String str5 = "HYM";
        String str6 = "HIA";
        String str7 = "HEM";
        str1 = paramString;
        bool2 = contains(paramString, k, m, str4, str5, str6, str7);
        if (!bool2)
        {
          bool2 = false;
          str1 = null;
          continue;
        }
      }
      str1 = "CHORE";
      bool2 = contains(paramString, 0, i, str1);
      if (bool2)
      {
        bool2 = false;
        str1 = null;
      }
      else
      {
        bool2 = true;
      }
    }
  }
  
  private boolean conditionCH1(String paramString, int paramInt)
  {
    int i = 1;
    Object localObject = "VAN ";
    String str1 = "VON ";
    boolean bool1 = contains(paramString, 0, 4, (String)localObject, str1);
    if (!bool1)
    {
      localObject = "SCH";
      bool1 = contains(paramString, 0, 3, (String)localObject);
      if (!bool1)
      {
        int i1 = paramInt + -2;
        int i2 = 6;
        String str2 = "ORCHES";
        String str3 = "ARCHIT";
        String str4 = "ORCHID";
        bool1 = contains(paramString, i1, i2, str2, str3, str4);
        if (!bool1)
        {
          int j = paramInt + 2;
          localObject = "T";
          str1 = "S";
          boolean bool2 = contains(paramString, j, i, (String)localObject, str1);
          if (!bool2)
          {
            i1 = paramInt + -1;
            str2 = "A";
            str3 = "O";
            str4 = "U";
            String str5 = "E";
            i2 = i;
            bool2 = contains(paramString, i1, i, str2, str3, str4, str5);
            if ((!bool2) && (paramInt != 0)) {
              break label222;
            }
            int k = paramInt + 2;
            localObject = L_R_N_M_B_H_F_V_W_SPACE;
            boolean bool3 = contains(paramString, k, i, (String[])localObject);
            if (!bool3)
            {
              m = paramInt + 1;
              i1 = paramString.length() + -1;
              if (m != i1) {
                break label222;
              }
            }
          }
        }
      }
    }
    label222:
    int n;
    for (int m = i;; n = 0) {
      return m;
    }
  }
  
  private boolean conditionL0(String paramString, int paramInt)
  {
    int i = 4;
    int j = 1;
    int k = paramString.length() + -3;
    int i2;
    String str1;
    String str2;
    boolean bool1;
    if (paramInt == k)
    {
      i2 = paramInt + -1;
      str1 = "ILLO";
      str2 = "ILLA";
      String str3 = "ALLE";
      bool1 = contains(paramString, i2, i, str1, str2, str3);
      if (bool1) {
        bool1 = j;
      }
    }
    for (;;)
    {
      return bool1;
      int m = paramString.length() + -2;
      i2 = 2;
      str1 = "AS";
      str2 = "OS";
      boolean bool2 = contains(paramString, m, i2, str1, str2);
      String str4;
      if (!bool2)
      {
        int n = paramString.length() + -1;
        str4 = "A";
        str1 = "O";
        boolean bool3 = contains(paramString, n, j, str4, str1);
        if (!bool3) {}
      }
      else
      {
        int i1 = paramInt + -1;
        str4 = "ALLE";
        bool4 = contains(paramString, i1, i, str4);
        if (bool4)
        {
          bool4 = j;
          continue;
        }
      }
      boolean bool4 = false;
    }
  }
  
  private boolean conditionM0(String paramString, int paramInt)
  {
    boolean bool1 = true;
    int i = paramInt + 1;
    i = charAt(paramString, i);
    int k = 77;
    if (i == k) {}
    for (;;)
    {
      return bool1;
      i = paramInt + -1;
      k = 3;
      String str = "UMB";
      boolean bool2 = contains(paramString, i, k, str);
      if (bool2)
      {
        int j = paramInt + 1;
        k = paramString.length() + -1;
        if (j != k)
        {
          j = paramInt + 2;
          k = 2;
          str = "ER";
          boolean bool3 = contains(paramString, j, k, str);
          if (bool3) {}
        }
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  private static boolean contains(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString2;
    return contains(paramString1, paramInt1, paramInt2, arrayOfString);
  }
  
  private static boolean contains(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramString2;
    arrayOfString[1] = paramString3;
    return contains(paramString1, paramInt1, paramInt2, arrayOfString);
  }
  
  private static boolean contains(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4)
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = paramString2;
    arrayOfString[1] = paramString3;
    arrayOfString[2] = paramString4;
    return contains(paramString1, paramInt1, paramInt2, arrayOfString);
  }
  
  private static boolean contains(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    String[] arrayOfString = new String[4];
    arrayOfString[0] = paramString2;
    arrayOfString[1] = paramString3;
    arrayOfString[2] = paramString4;
    arrayOfString[3] = paramString5;
    return contains(paramString1, paramInt1, paramInt2, arrayOfString);
  }
  
  private static boolean contains(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    String[] arrayOfString = new String[5];
    arrayOfString[0] = paramString2;
    arrayOfString[1] = paramString3;
    arrayOfString[2] = paramString4;
    arrayOfString[3] = paramString5;
    arrayOfString[4] = paramString6;
    return contains(paramString1, paramInt1, paramInt2, arrayOfString);
  }
  
  private static boolean contains(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    String[] arrayOfString = new String[6];
    arrayOfString[0] = paramString2;
    arrayOfString[1] = paramString3;
    arrayOfString[2] = paramString4;
    arrayOfString[3] = paramString5;
    arrayOfString[4] = paramString6;
    arrayOfString[5] = paramString7;
    return contains(paramString1, paramInt1, paramInt2, arrayOfString);
  }
  
  protected static boolean contains(String paramString, int paramInt1, int paramInt2, String[] paramArrayOfString)
  {
    boolean bool1 = false;
    int i;
    String str1;
    int k;
    if (paramInt1 >= 0)
    {
      i = paramInt1 + paramInt2;
      int j = paramString.length();
      if (i <= j)
      {
        i = paramInt1 + paramInt2;
        str1 = paramString.substring(paramInt1, i);
        k = 0;
      }
    }
    for (;;)
    {
      i = paramArrayOfString.length;
      if (k < i)
      {
        String str2 = paramArrayOfString[k];
        boolean bool2 = str1.equals(str2);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      k += 1;
    }
  }
  
  private int handleAEIOUY(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    if (paramInt == 0)
    {
      char c = 'A';
      paramDoubleMetaphoneResult.append(c);
    }
    return paramInt + 1;
  }
  
  private int handleC(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    int i = 1;
    char c1 = 'X';
    char c2 = 'K';
    char c3 = 'S';
    int j = 2;
    boolean bool1 = conditionC0(paramString, paramInt);
    if (bool1)
    {
      paramDoubleMetaphoneResult.append(c2);
      paramInt += 2;
    }
    for (;;)
    {
      String str1;
      int i1;
      for (int k = paramInt;; i1 = handleCC(paramString, paramDoubleMetaphoneResult, paramInt))
      {
        return k;
        if (paramInt == 0)
        {
          str1 = "CAESAR";
          bool2 = contains(paramString, paramInt, 6, str1);
          if (bool2)
          {
            paramDoubleMetaphoneResult.append(c3);
            paramInt += 2;
            break;
          }
        }
        str2 = "CH";
        boolean bool2 = contains(paramString, paramInt, j, str2);
        if (bool2)
        {
          paramInt = handleCH(paramString, paramDoubleMetaphoneResult, paramInt);
          break;
        }
        str2 = "CZ";
        bool2 = contains(paramString, paramInt, j, str2);
        if (bool2)
        {
          int m = paramInt + -2;
          i3 = 4;
          str3 = "WICZ";
          boolean bool3 = contains(paramString, m, i3, str3);
          if (!bool3)
          {
            paramDoubleMetaphoneResult.append(c3, c1);
            paramInt += 2;
            break;
          }
        }
        int n = paramInt + 1;
        i3 = 3;
        str3 = "CIA";
        boolean bool4 = contains(paramString, n, i3, str3);
        if (bool4)
        {
          paramDoubleMetaphoneResult.append(c1);
          paramInt += 3;
          break;
        }
        str2 = "CC";
        bool4 = contains(paramString, paramInt, j, str2);
        if (!bool4) {
          break label282;
        }
        if (paramInt == i)
        {
          str2 = null;
          i1 = charAt(paramString, 0);
          i3 = 77;
          if (i1 == i3) {
            break label282;
          }
        }
      }
      label282:
      String str3 = "CK";
      String str4 = "CG";
      String str5 = "CQ";
      String str2 = paramString;
      int i3 = paramInt;
      boolean bool5 = contains(paramString, paramInt, j, str3, str4, str5);
      if (bool5)
      {
        paramDoubleMetaphoneResult.append(c2);
        paramInt += 2;
      }
      else
      {
        str3 = "CI";
        str4 = "CE";
        str5 = "CY";
        bool5 = contains(paramString, paramInt, j, str3, str4, str5);
        if (bool5)
        {
          j = 3;
          str3 = "CIO";
          str4 = "CIE";
          str5 = "CIA";
          bool5 = contains(paramString, paramInt, j, str3, str4, str5);
          if (bool5) {
            paramDoubleMetaphoneResult.append(c3, c1);
          }
          for (;;)
          {
            paramInt += 2;
            break;
            paramDoubleMetaphoneResult.append(c3);
          }
        }
        paramDoubleMetaphoneResult.append(c2);
        i3 = paramInt + 1;
        str3 = " C";
        str4 = " Q";
        str5 = " G";
        bool5 = contains(paramString, i3, j, str3, str4, str5);
        if (bool5)
        {
          paramInt += 3;
        }
        else
        {
          int i4 = paramInt + 1;
          String str6 = "C";
          String str7 = "K";
          String str8 = "Q";
          str3 = paramString;
          bool5 = contains(paramString, i4, i, str6, str7, str8);
          if (bool5)
          {
            int i2 = paramInt + 1;
            str1 = "CE";
            str3 = "CI";
            boolean bool6 = contains(paramString, i2, j, str1, str3);
            if (!bool6)
            {
              paramInt += 2;
              continue;
            }
          }
          paramInt += 1;
        }
      }
    }
  }
  
  private int handleCC(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    int i = 1;
    int j = paramInt + 2;
    String str1 = "I";
    String str2 = "E";
    String str3 = "H";
    String str4 = paramString;
    boolean bool1 = contains(paramString, j, i, str1, str2, str3);
    if (bool1)
    {
      int k = paramInt + 2;
      j = 2;
      str1 = "HU";
      boolean bool2 = contains(paramString, k, j, str1);
      if (!bool2)
      {
        int m;
        if (paramInt == i)
        {
          m = paramInt + -1;
          m = charAt(paramString, m);
          j = 65;
          if (m == j) {}
        }
        else
        {
          m = paramInt + -1;
          j = 5;
          String str5 = "UCCEE";
          str1 = "UCCES";
          boolean bool3 = contains(paramString, m, j, str5, str1);
          if (!bool3) {
            break label160;
          }
        }
        str4 = "KS";
        paramDoubleMetaphoneResult.append(str4);
        paramInt += 3;
      }
    }
    for (;;)
    {
      return paramInt;
      label160:
      char c = 'X';
      paramDoubleMetaphoneResult.append(c);
      break;
      c = 'K';
      paramDoubleMetaphoneResult.append(c);
      paramInt += 2;
    }
  }
  
  private int handleCH(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    char c1 = 'X';
    char c2 = 'K';
    int i;
    if (paramInt > 0)
    {
      String str1 = "CHAE";
      boolean bool1 = contains(paramString, paramInt, 4, str1);
      if (bool1)
      {
        paramDoubleMetaphoneResult.append(c2, c1);
        i = paramInt + 2;
      }
    }
    for (;;)
    {
      return i;
      boolean bool2 = conditionCH0(paramString, paramInt);
      if (bool2)
      {
        paramDoubleMetaphoneResult.append(c2);
        int j = paramInt + 2;
      }
      else
      {
        boolean bool3 = conditionCH1(paramString, paramInt);
        if (!bool3) {
          break;
        }
        paramDoubleMetaphoneResult.append(c2);
        int k = paramInt + 2;
      }
    }
    if (paramInt > 0)
    {
      int n = 2;
      String str2 = "MC";
      boolean bool4 = contains(paramString, 0, n, str2);
      if (bool4) {
        paramDoubleMetaphoneResult.append(c2);
      }
    }
    for (;;)
    {
      int m = paramInt + 2;
      break;
      paramDoubleMetaphoneResult.append(c1, c2);
      continue;
      paramDoubleMetaphoneResult.append(c1);
    }
  }
  
  private int handleD(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    char c1 = 'T';
    int i = 2;
    String str1 = "DG";
    boolean bool1 = contains(paramString, paramInt, i, str1);
    if (bool1)
    {
      int j = paramInt + 2;
      i = 1;
      String str2 = "I";
      String str3 = "E";
      String str4 = "Y";
      str1 = paramString;
      bool1 = contains(paramString, j, i, str2, str3, str4);
      if (bool1)
      {
        char c2 = 'J';
        paramDoubleMetaphoneResult.append(c2);
        paramInt += 3;
      }
    }
    for (;;)
    {
      return paramInt;
      str1 = "TK";
      paramDoubleMetaphoneResult.append(str1);
      paramInt += 2;
      continue;
      str1 = "DT";
      String str5 = "DD";
      boolean bool2 = contains(paramString, paramInt, i, str1, str5);
      if (bool2)
      {
        paramDoubleMetaphoneResult.append(c1);
        paramInt += 2;
      }
      else
      {
        paramDoubleMetaphoneResult.append(c1);
        paramInt += 1;
      }
    }
  }
  
  private int handleG(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt, boolean paramBoolean)
  {
    int i = paramInt + 1;
    i = charAt(paramString, i);
    int i8 = 72;
    if (i == i8) {
      paramInt = handleGH(paramString, paramDoubleMetaphoneResult, paramInt);
    }
    for (;;)
    {
      return paramInt;
      i = paramInt + 1;
      i = charAt(paramString, i);
      i8 = 78;
      String str1;
      String str2;
      if (i == i8)
      {
        i = 1;
        if (paramInt == i)
        {
          str1 = null;
          i = charAt(paramString, 0);
          boolean bool1 = isVowel(i);
          if ((bool1) && (!paramBoolean))
          {
            str1 = "KN";
            str2 = "N";
            paramDoubleMetaphoneResult.append(str1, str2);
          }
        }
        for (;;)
        {
          paramInt += 2;
          break;
          int j = paramInt + 2;
          i8 = 2;
          localObject = "EY";
          boolean bool2 = contains(paramString, j, i8, (String)localObject);
          if (!bool2)
          {
            k = paramInt + 1;
            k = charAt(paramString, k);
            i8 = 89;
            if ((k != i8) && (!paramBoolean))
            {
              str1 = "N";
              str2 = "KN";
              paramDoubleMetaphoneResult.append(str1, str2);
              continue;
            }
          }
          str1 = "KN";
          paramDoubleMetaphoneResult.append(str1);
        }
      }
      int k = paramInt + 1;
      i8 = 2;
      Object localObject = "LI";
      boolean bool3 = contains(paramString, k, i8, (String)localObject);
      if ((bool3) && (!paramBoolean))
      {
        str1 = "KL";
        str2 = "L";
        paramDoubleMetaphoneResult.append(str1, str2);
        paramInt += 2;
      }
      else
      {
        if (paramInt == 0)
        {
          int m = paramInt + 1;
          m = charAt(paramString, m);
          i8 = 89;
          if (m != i8)
          {
            m = paramInt + 1;
            i8 = 2;
            localObject = ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER;
            boolean bool4 = contains(paramString, m, i8, (String[])localObject);
            if (!bool4) {}
          }
          else
          {
            char c1 = 'K';
            i8 = 74;
            paramDoubleMetaphoneResult.append(c1, i8);
            paramInt += 2;
            continue;
          }
        }
        int n = paramInt + 1;
        i8 = 2;
        localObject = "ER";
        boolean bool5 = contains(paramString, n, i8, (String)localObject);
        if (!bool5)
        {
          int i1 = paramInt + 1;
          i1 = charAt(paramString, i1);
          i8 = 89;
          if (i1 != i8) {}
        }
        else
        {
          i8 = 0;
          str2 = null;
          i9 = 6;
          str3 = "DANGER";
          str4 = "RANGER";
          str5 = "MANGER";
          str1 = paramString;
          boolean bool6 = contains(paramString, 0, i9, str3, str4, str5);
          if (!bool6)
          {
            int i2 = paramInt + -1;
            i8 = 1;
            localObject = "E";
            str3 = "I";
            boolean bool7 = contains(paramString, i2, i8, (String)localObject, str3);
            if (!bool7)
            {
              int i3 = paramInt + -1;
              i8 = 3;
              localObject = "RGY";
              str3 = "OGY";
              boolean bool8 = contains(paramString, i3, i8, (String)localObject, str3);
              if (!bool8)
              {
                char c2 = 'K';
                i8 = 74;
                paramDoubleMetaphoneResult.append(c2, i8);
                paramInt += 2;
                continue;
              }
            }
          }
        }
        i8 = paramInt + 1;
        int i9 = 1;
        String str3 = "E";
        String str4 = "I";
        String str5 = "Y";
        str1 = paramString;
        boolean bool9 = contains(paramString, i8, i9, str3, str4, str5);
        boolean bool10;
        if (!bool9)
        {
          int i4 = paramInt + -1;
          i8 = 4;
          localObject = "AGGI";
          str3 = "OGGI";
          bool10 = contains(paramString, i4, i8, (String)localObject, str3);
          if (!bool10) {}
        }
        else
        {
          str1 = null;
          i8 = 4;
          localObject = "VAN ";
          str3 = "VON ";
          bool10 = contains(paramString, 0, i8, (String)localObject, str3);
          if (!bool10)
          {
            str1 = null;
            i8 = 3;
            localObject = "SCH";
            bool10 = contains(paramString, 0, i8, (String)localObject);
            if (!bool10)
            {
              int i5 = paramInt + 1;
              i8 = 2;
              localObject = "ET";
              boolean bool11 = contains(paramString, i5, i8, (String)localObject);
              if (!bool11) {
                break label739;
              }
            }
          }
          char c3 = 'K';
          paramDoubleMetaphoneResult.append(c3);
          for (;;)
          {
            paramInt += 2;
            break;
            label739:
            int i6 = paramInt + 1;
            i8 = 3;
            localObject = "IER";
            boolean bool12 = contains(paramString, i6, i8, (String)localObject);
            char c4;
            if (bool12)
            {
              c4 = 'J';
              paramDoubleMetaphoneResult.append(c4);
            }
            else
            {
              c4 = 'J';
              i8 = 75;
              paramDoubleMetaphoneResult.append(c4, i8);
            }
          }
        }
        int i7 = paramInt + 1;
        i7 = charAt(paramString, i7);
        i8 = 71;
        if (i7 == i8)
        {
          paramInt += 2;
          i7 = 75;
          paramDoubleMetaphoneResult.append(i7);
        }
        else
        {
          paramInt += 1;
          char c5 = 'K';
          paramDoubleMetaphoneResult.append(c5);
        }
      }
    }
  }
  
  private int handleGH(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    int i = 73;
    int j = 2;
    char c1 = 'K';
    int k = 1;
    if (paramInt > 0)
    {
      int m = paramInt + -1;
      m = charAt(paramString, m);
      boolean bool1 = isVowel(m);
      if (!bool1)
      {
        paramDoubleMetaphoneResult.append(c1);
        paramInt += 2;
      }
    }
    int i4;
    String str1;
    String str2;
    String str3;
    for (;;)
    {
      return paramInt;
      if (paramInt == 0)
      {
        int n = paramInt + 2;
        n = charAt(paramString, n);
        if (n == i)
        {
          n = 74;
          paramDoubleMetaphoneResult.append(n);
        }
        for (;;)
        {
          paramInt += 2;
          break;
          paramDoubleMetaphoneResult.append(c1);
        }
      }
      boolean bool2;
      if (paramInt > k)
      {
        i4 = paramInt + -2;
        str1 = "B";
        str2 = "H";
        str3 = "D";
        bool2 = contains(paramString, i4, k, str1, str2, str3);
        if (bool2) {}
      }
      else if (paramInt > j)
      {
        i4 = paramInt + -3;
        str1 = "B";
        str2 = "H";
        str3 = "D";
        bool2 = contains(paramString, i4, k, str1, str2, str3);
        if (bool2) {}
      }
      else
      {
        int i1 = 3;
        if (paramInt <= i1) {
          break;
        }
        i1 = paramInt + -4;
        String str4 = "B";
        str1 = "H";
        boolean bool3 = contains(paramString, i1, k, str4, str1);
        if (!bool3) {
          break;
        }
      }
      paramInt += 2;
    }
    if (paramInt > j)
    {
      int i2 = paramInt + -1;
      i2 = charAt(paramString, i2);
      i4 = 85;
      if (i2 == i4)
      {
        i4 = paramInt + -3;
        str1 = "C";
        str2 = "G";
        str3 = "L";
        String str5 = "R";
        String str6 = "T";
        boolean bool4 = contains(paramString, i4, k, str1, str2, str3, str5, str6);
        if (bool4)
        {
          char c2 = 'F';
          paramDoubleMetaphoneResult.append(c2);
        }
      }
    }
    for (;;)
    {
      paramInt += 2;
      break;
      if (paramInt > 0)
      {
        int i3 = paramInt + -1;
        i3 = charAt(paramString, i3);
        if (i3 != i) {
          paramDoubleMetaphoneResult.append(c1);
        }
      }
    }
  }
  
  private int handleH(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    if (paramInt != 0)
    {
      int i = paramInt + -1;
      i = charAt(paramString, i);
      boolean bool1 = isVowel(i);
      if (!bool1) {}
    }
    else
    {
      int j = paramInt + 1;
      j = charAt(paramString, j);
      boolean bool2 = isVowel(j);
      if (bool2)
      {
        char c = 'H';
        paramDoubleMetaphoneResult.append(c);
        paramInt += 2;
      }
    }
    for (;;)
    {
      return paramInt;
      paramInt += 1;
    }
  }
  
  private int handleJ(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt, boolean paramBoolean)
  {
    int i = 1;
    String str1 = null;
    char c1 = 'H';
    int j = 4;
    int k = 74;
    String str2 = "JOSE";
    boolean bool1 = contains(paramString, paramInt, j, str2);
    int i3;
    boolean bool2;
    if (!bool1)
    {
      str2 = "SAN ";
      bool1 = contains(paramString, 0, j, str2);
      if (!bool1) {}
    }
    else
    {
      int m;
      if (paramInt == 0)
      {
        m = paramInt + 4;
        m = charAt(paramString, m);
        i3 = 32;
        if (m == i3) {}
      }
      else
      {
        m = paramString.length();
        if (m != j)
        {
          str2 = "SAN ";
          bool2 = contains(paramString, 0, j, str2);
          if (!bool2) {
            break label134;
          }
        }
      }
      paramDoubleMetaphoneResult.append(c1);
      paramInt += 1;
    }
    for (;;)
    {
      return paramInt;
      label134:
      paramDoubleMetaphoneResult.append(k, c1);
      break;
      if (paramInt == 0)
      {
        str2 = "JOSE";
        bool2 = contains(paramString, paramInt, j, str2);
        if (!bool2)
        {
          char c2 = 'A';
          paramDoubleMetaphoneResult.append(k, c2);
        }
      }
      for (;;)
      {
        int n = paramInt + 1;
        n = charAt(paramString, n);
        if (n != k) {
          break label409;
        }
        paramInt += 2;
        break;
        int i1 = paramInt + -1;
        i1 = charAt(paramString, i1);
        boolean bool3 = isVowel(i1);
        if ((bool3) && (!paramBoolean))
        {
          i2 = paramInt + 1;
          i2 = charAt(paramString, i2);
          i3 = 65;
          if (i2 != i3)
          {
            i2 = paramInt + 1;
            i2 = charAt(paramString, i2);
            i3 = 79;
            if (i2 != i3) {}
          }
          else
          {
            paramDoubleMetaphoneResult.append(k, c1);
            continue;
          }
        }
        int i2 = paramString.length() + -1;
        if (paramInt == i2)
        {
          i2 = 32;
          paramDoubleMetaphoneResult.append(k, i2);
        }
        else
        {
          i2 = paramInt + 1;
          String[] arrayOfString = L_T_K_S_N_M_B_Z;
          boolean bool4 = contains(paramString, i2, i, arrayOfString);
          if (!bool4)
          {
            i3 = paramInt + -1;
            String str3 = "S";
            String str4 = "K";
            str1 = "L";
            str2 = paramString;
            bool4 = contains(paramString, i3, i, str3, str4, str1);
            if (!bool4) {
              paramDoubleMetaphoneResult.append(k);
            }
          }
        }
      }
      label409:
      paramInt += 1;
    }
  }
  
  private int handleL(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    int i = 76;
    int j = paramInt + 1;
    j = charAt(paramString, j);
    if (j == i)
    {
      boolean bool = conditionL0(paramString, paramInt);
      if (bool)
      {
        paramDoubleMetaphoneResult.appendPrimary(i);
        paramInt += 2;
      }
    }
    for (;;)
    {
      return paramInt;
      paramDoubleMetaphoneResult.append(i);
      break;
      paramInt += 1;
      paramDoubleMetaphoneResult.append(i);
    }
  }
  
  private int handleP(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    int i = paramInt + 1;
    i = charAt(paramString, i);
    int k = 72;
    if (i == k)
    {
      i = 70;
      paramDoubleMetaphoneResult.append(i);
      paramInt += 2;
      return paramInt;
    }
    paramDoubleMetaphoneResult.append('P');
    int j = paramInt + 1;
    int m = 1;
    String str1 = "P";
    String str2 = "B";
    boolean bool = contains(paramString, j, m, str1, str2);
    if (bool) {
      paramInt += 2;
    }
    for (;;)
    {
      break;
      paramInt += 1;
    }
  }
  
  private int handleR(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt, boolean paramBoolean)
  {
    int i = 2;
    int j = 82;
    int k = paramString.length() + -1;
    if ((paramInt == k) && (!paramBoolean))
    {
      k = paramInt + -2;
      String str1 = "IE";
      boolean bool1 = contains(paramString, k, i, str1);
      if (bool1)
      {
        int m = paramInt + -4;
        str1 = "ME";
        String str2 = "MA";
        boolean bool2 = contains(paramString, m, i, str1, str2);
        if (!bool2)
        {
          paramDoubleMetaphoneResult.appendAlternate(j);
          int n = paramInt + 1;
          n = charAt(paramString, n);
          if (n != j) {
            break label132;
          }
        }
      }
    }
    label132:
    for (int i1 = paramInt + 2;; i1 = paramInt + 1)
    {
      return i1;
      paramDoubleMetaphoneResult.append(j);
      break;
    }
  }
  
  private int handleS(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt, boolean paramBoolean)
  {
    int i = 3;
    int j = 2;
    char c1 = 'X';
    int k = 1;
    char c2 = 'S';
    int m = paramInt + -1;
    String str1 = "ISL";
    String str2 = "YSL";
    boolean bool1 = contains(paramString, m, i, str1, str2);
    if (bool1) {
      paramInt += 1;
    }
    for (;;)
    {
      return paramInt;
      if (paramInt == 0)
      {
        str1 = "SUGAR";
        bool1 = contains(paramString, paramInt, 5, str1);
        if (bool1)
        {
          paramDoubleMetaphoneResult.append(c1, c2);
          paramInt += 1;
          continue;
        }
      }
      String str3 = "SH";
      bool1 = contains(paramString, paramInt, j, str3);
      int i4;
      String str4;
      String str5;
      String str6;
      if (bool1)
      {
        i4 = paramInt + 1;
        k = 4;
        str2 = "HEIM";
        str4 = "HOEK";
        str5 = "HOLM";
        str6 = "HOLZ";
        str3 = paramString;
        bool1 = contains(paramString, i4, k, str2, str4, str5, str6);
        if (bool1) {
          paramDoubleMetaphoneResult.append(c2);
        }
        for (;;)
        {
          paramInt += 2;
          break;
          paramDoubleMetaphoneResult.append(c1);
        }
      }
      str3 = "SIO";
      str1 = "SIA";
      bool1 = contains(paramString, paramInt, i, str3, str1);
      if (!bool1)
      {
        str1 = "SIAN";
        bool1 = contains(paramString, paramInt, 4, str1);
        if (!bool1) {}
      }
      else
      {
        if (paramBoolean) {
          paramDoubleMetaphoneResult.append(c2);
        }
        for (;;)
        {
          paramInt += 3;
          break;
          paramDoubleMetaphoneResult.append(c2, c1);
        }
      }
      if (paramInt == 0)
      {
        i4 = paramInt + 1;
        str2 = "M";
        str4 = "N";
        str5 = "L";
        str6 = "W";
        str3 = paramString;
        bool1 = contains(paramString, i4, k, str2, str4, str5, str6);
        if (bool1) {}
      }
      else
      {
        int n = paramInt + 1;
        str1 = "Z";
        boolean bool2 = contains(paramString, n, k, str1);
        if (!bool2) {
          break label395;
        }
      }
      paramDoubleMetaphoneResult.append(c2, c1);
      int i1 = paramInt + 1;
      str1 = "Z";
      boolean bool3 = contains(paramString, i1, k, str1);
      if (bool3) {
        paramInt += 2;
      }
      for (;;)
      {
        break;
        paramInt += 1;
      }
      label395:
      str3 = "SC";
      bool3 = contains(paramString, paramInt, j, str3);
      if (!bool3) {
        break;
      }
      paramInt = handleSC(paramString, paramDoubleMetaphoneResult, paramInt);
    }
    int i2 = paramString.length() + -1;
    if (paramInt == i2)
    {
      i2 = paramInt + -2;
      str1 = "AI";
      str2 = "OI";
      boolean bool4 = contains(paramString, i2, j, str1, str2);
      if (bool4)
      {
        paramDoubleMetaphoneResult.appendAlternate(c2);
        label482:
        int i3 = paramInt + 1;
        str1 = "S";
        str2 = "Z";
        boolean bool5 = contains(paramString, i3, k, str1, str2);
        if (!bool5) {
          break label530;
        }
        paramInt += 2;
      }
    }
    for (;;)
    {
      break;
      paramDoubleMetaphoneResult.append(c2);
      break label482;
      label530:
      paramInt += 1;
    }
  }
  
  private int handleSC(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    char c1 = 'X';
    char c2 = 'S';
    int i = 3;
    int j = 2;
    int k = paramInt + 2;
    k = charAt(paramString, k);
    int i1 = 72;
    String str1;
    String str2;
    String str3;
    String str7;
    if (k == i1)
    {
      i1 = paramInt + 3;
      str1 = "OO";
      str2 = "ER";
      str3 = "EN";
      String str4 = "UY";
      String str5 = "ED";
      String str6 = "EM";
      str7 = paramString;
      boolean bool1 = contains(paramString, i1, j, str1, str2, str3, str4, str5, str6);
      if (bool1)
      {
        int m = paramInt + 3;
        String str8 = "ER";
        str1 = "EN";
        boolean bool2 = contains(paramString, m, j, str8, str1);
        if (bool2)
        {
          str7 = "X";
          str8 = "SK";
          paramDoubleMetaphoneResult.append(str7, str8);
        }
      }
    }
    for (;;)
    {
      return paramInt + 3;
      str7 = "SK";
      paramDoubleMetaphoneResult.append(str7);
      continue;
      if (paramInt == 0)
      {
        char c3 = charAt(paramString, i);
        boolean bool3 = isVowel(c3);
        if (!bool3)
        {
          int n = charAt(paramString, i);
          i1 = 87;
          if (n != i1)
          {
            paramDoubleMetaphoneResult.append(c1, c2);
            continue;
          }
        }
      }
      paramDoubleMetaphoneResult.append(c1);
      continue;
      i1 = paramInt + 2;
      j = 1;
      str1 = "I";
      str2 = "E";
      str3 = "Y";
      str7 = paramString;
      boolean bool4 = contains(paramString, i1, j, str1, str2, str3);
      if (bool4)
      {
        paramDoubleMetaphoneResult.append(c2);
      }
      else
      {
        str7 = "SK";
        paramDoubleMetaphoneResult.append(str7);
      }
    }
  }
  
  private int handleT(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    int i = 4;
    int j = 2;
    char c1 = 'T';
    int k = 3;
    String str1 = "TION";
    boolean bool1 = contains(paramString, paramInt, i, str1);
    if (bool1)
    {
      char c2 = 'X';
      paramDoubleMetaphoneResult.append(c2);
      paramInt += 3;
    }
    String str2;
    for (;;)
    {
      return paramInt;
      str1 = "TIA";
      str2 = "TCH";
      boolean bool2 = contains(paramString, paramInt, k, str1, str2);
      if (!bool2) {
        break;
      }
      char c3 = 'X';
      paramDoubleMetaphoneResult.append(c3);
      paramInt += 3;
    }
    str1 = "TH";
    boolean bool3 = contains(paramString, paramInt, j, str1);
    if (!bool3)
    {
      str1 = "TTH";
      bool3 = contains(paramString, paramInt, k, str1);
      if (!bool3) {}
    }
    else
    {
      int m = paramInt + 2;
      str2 = "OM";
      str3 = "AM";
      boolean bool4 = contains(paramString, m, j, str2, str3);
      if (!bool4)
      {
        str1 = "VAN ";
        str2 = "VON ";
        bool4 = contains(paramString, 0, i, str1, str2);
        if (!bool4)
        {
          str1 = "SCH";
          bool4 = contains(paramString, 0, k, str1);
          if (!bool4) {
            break label230;
          }
        }
      }
      paramDoubleMetaphoneResult.append(c1);
      for (;;)
      {
        paramInt += 2;
        break;
        label230:
        char c4 = '0';
        paramDoubleMetaphoneResult.append(c4, c1);
      }
    }
    paramDoubleMetaphoneResult.append(c1);
    int n = paramInt + 1;
    int i1 = 1;
    String str3 = "T";
    String str4 = "D";
    boolean bool5 = contains(paramString, n, i1, str3, str4);
    if (bool5) {
      paramInt += 2;
    }
    for (;;)
    {
      break;
      paramInt += 1;
    }
  }
  
  private int handleW(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    char c1 = 'F';
    char c2 = 'A';
    int i = 2;
    String str1 = "WR";
    boolean bool1 = contains(paramString, paramInt, i, str1);
    if (bool1)
    {
      char c3 = 'R';
      paramDoubleMetaphoneResult.append(c3);
      paramInt += 2;
    }
    for (;;)
    {
      return paramInt;
      if (paramInt == 0)
      {
        int j = paramInt + 1;
        j = charAt(paramString, j);
        boolean bool2 = isVowel(j);
        if (!bool2)
        {
          str1 = "WH";
          bool2 = contains(paramString, paramInt, i, str1);
          if (!bool2) {}
        }
        else
        {
          int k = paramInt + 1;
          k = charAt(paramString, k);
          boolean bool3 = isVowel(k);
          if (bool3) {
            paramDoubleMetaphoneResult.append(c2, c1);
          }
          for (;;)
          {
            paramInt += 1;
            break;
            paramDoubleMetaphoneResult.append(c2);
          }
        }
      }
      int m = paramString.length() + -1;
      if (paramInt == m)
      {
        m = paramInt + -1;
        m = charAt(paramString, m);
        bool4 = isVowel(m);
        if (bool4) {}
      }
      else
      {
        i = paramInt + -1;
        c2 = '\005';
        String str2 = "EWSKI";
        String str3 = "EWSKY";
        String str4 = "OWSKI";
        String str5 = "OWSKY";
        str1 = paramString;
        bool4 = contains(paramString, i, c2, str2, str3, str4, str5);
        if (!bool4)
        {
          str1 = null;
          i = 3;
          str6 = "SCH";
          bool4 = contains(paramString, 0, i, str6);
          if (!bool4) {
            break label284;
          }
        }
      }
      paramDoubleMetaphoneResult.appendAlternate(c1);
      paramInt += 1;
      continue;
      label284:
      String str7 = "WICZ";
      String str6 = "WITZ";
      boolean bool4 = contains(paramString, paramInt, 4, str7, str6);
      if (bool4)
      {
        str1 = "TS";
        str7 = "FX";
        paramDoubleMetaphoneResult.append(str1, str7);
        paramInt += 4;
      }
      else
      {
        paramInt += 1;
      }
    }
  }
  
  private int handleX(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt)
  {
    if (paramInt == 0)
    {
      char c = 'S';
      paramDoubleMetaphoneResult.append(c);
      paramInt += 1;
      return paramInt;
    }
    int i = paramString.length() + -1;
    if (paramInt == i)
    {
      i = paramInt + -3;
      m = 3;
      str1 = "IAU";
      str2 = "EAU";
      boolean bool1 = contains(paramString, i, m, str1, str2);
      if (!bool1)
      {
        int j = paramInt + -2;
        m = 2;
        str1 = "AU";
        str2 = "OU";
        boolean bool2 = contains(paramString, j, m, str1, str2);
        if (bool2) {}
      }
    }
    else
    {
      String str3 = "KS";
      paramDoubleMetaphoneResult.append(str3);
    }
    int k = paramInt + 1;
    int m = 1;
    String str1 = "C";
    String str2 = "X";
    boolean bool3 = contains(paramString, k, m, str1, str2);
    if (bool3) {
      paramInt += 2;
    }
    for (;;)
    {
      break;
      paramInt += 1;
    }
  }
  
  private int handleZ(String paramString, DoubleMetaphone.DoubleMetaphoneResult paramDoubleMetaphoneResult, int paramInt, boolean paramBoolean)
  {
    int i = paramInt + 1;
    i = charAt(paramString, i);
    int k = 72;
    if (i == k)
    {
      i = 74;
      paramDoubleMetaphoneResult.append(i);
      paramInt += 2;
      return paramInt;
    }
    int m = paramInt + 1;
    int i1 = 2;
    String str1 = "ZO";
    String str2 = "ZI";
    String str3 = "ZA";
    String str4 = paramString;
    boolean bool = contains(paramString, m, i1, str1, str2, str3);
    int j;
    if (!bool)
    {
      if ((paramBoolean) && (paramInt > 0))
      {
        j = paramInt + -1;
        j = charAt(paramString, j);
        m = 84;
        if (j == m) {}
      }
    }
    else
    {
      str4 = "S";
      String str5 = "TS";
      paramDoubleMetaphoneResult.append(str4, str5);
      label139:
      j = paramInt + 1;
      j = charAt(paramString, j);
      int n = 90;
      if (j != n) {
        break label184;
      }
      paramInt += 2;
    }
    for (;;)
    {
      break;
      j = 83;
      paramDoubleMetaphoneResult.append(j);
      break label139;
      label184:
      paramInt += 1;
    }
  }
  
  private boolean isSilentStart(String paramString)
  {
    boolean bool1 = false;
    int i = 0;
    for (;;)
    {
      Object localObject = SILENT_START;
      int j = localObject.length;
      if (i < j)
      {
        localObject = SILENT_START[i];
        boolean bool2 = paramString.startsWith((String)localObject);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
  
  private boolean isSlavoGermanic(String paramString)
  {
    int i = -1;
    int j = paramString.indexOf('W');
    String str;
    if (j <= i)
    {
      j = paramString.indexOf('K');
      if (j <= i)
      {
        str = "CZ";
        j = paramString.indexOf(str);
        if (j <= i)
        {
          str = "WITZ";
          j = paramString.indexOf(str);
          if (j <= i) {
            break label63;
          }
        }
      }
    }
    j = 1;
    for (;;)
    {
      return j;
      label63:
      int k = 0;
      str = null;
    }
  }
  
  private boolean isVowel(char paramChar)
  {
    String str = "AEIOUY";
    int i = str.indexOf(paramChar);
    int k = -1;
    if (i != k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  protected char charAt(String paramString, int paramInt)
  {
    if (paramInt >= 0)
    {
      i = paramString.length();
      if (paramInt < i) {
        break label18;
      }
    }
    label18:
    for (int i = 0;; i = paramString.charAt(paramInt)) {
      return i;
    }
  }
  
  public String doubleMetaphone(String paramString)
  {
    return doubleMetaphone(paramString, false);
  }
  
  public String doubleMetaphone(String paramString, boolean paramBoolean)
  {
    int i = 78;
    int j = 75;
    int k = 70;
    paramString = cleanInput(paramString);
    boolean bool1;
    String str;
    if (paramString == null)
    {
      bool1 = false;
      str = null;
    }
    for (;;)
    {
      return str;
      boolean bool4 = isSlavoGermanic(paramString);
      bool1 = isSilentStart(paramString);
      int i5;
      DoubleMetaphone.DoubleMetaphoneResult localDoubleMetaphoneResult;
      if (bool1)
      {
        i5 = 1;
        localDoubleMetaphoneResult = new org/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;
        int m = getMaxCodeLen();
        localDoubleMetaphoneResult.<init>(this, m);
      }
      for (;;)
      {
        boolean bool2 = localDoubleMetaphoneResult.isComplete();
        if (bool2) {
          break label931;
        }
        int n = paramString.length() + -1;
        if (i5 > n) {
          break label931;
        }
        n = paramString.charAt(i5);
        int i6;
        int i4;
        int i8;
        switch (n)
        {
        default: 
          i5 += 1;
          continue;
          i6 = 0;
          break;
        case 65: 
        case 69: 
        case 73: 
        case 79: 
        case 85: 
        case 89: 
          i6 = handleAEIOUY(paramString, localDoubleMetaphoneResult, i6);
          break;
        case 66: 
          localDoubleMetaphoneResult.append('P');
          n = i6 + 1;
          n = charAt(paramString, n);
          int i7 = 66;
          if (n == i7) {
            i6 += 2;
          }
          for (;;)
          {
            break;
            i6 += 1;
          }
        case 199: 
          n = 83;
          localDoubleMetaphoneResult.append(n);
          i6 += 1;
          break;
        case 67: 
          i6 = handleC(paramString, localDoubleMetaphoneResult, i6);
          break;
        case 68: 
          i6 = handleD(paramString, localDoubleMetaphoneResult, i6);
          break;
        case 70: 
          localDoubleMetaphoneResult.append(k);
          int i1 = i6 + 1;
          i1 = charAt(paramString, i1);
          if (i1 == k) {
            i6 += 2;
          }
          for (;;)
          {
            break;
            i6 += 1;
          }
        case 71: 
          i6 = handleG(paramString, localDoubleMetaphoneResult, i6, bool4);
          break;
        case 72: 
          i6 = handleH(paramString, localDoubleMetaphoneResult, i6);
          break;
        case 74: 
          i6 = handleJ(paramString, localDoubleMetaphoneResult, i6, bool4);
          break;
        case 75: 
          localDoubleMetaphoneResult.append(j);
          int i2 = i6 + 1;
          i2 = charAt(paramString, i2);
          if (i2 == j) {
            i6 += 2;
          }
          for (;;)
          {
            break;
            i6 += 1;
          }
        case 76: 
          i6 = handleL(paramString, localDoubleMetaphoneResult, i6);
          break;
        case 77: 
          localDoubleMetaphoneResult.append('M');
          boolean bool3 = conditionM0(paramString, i6);
          if (bool3) {
            i6 += 2;
          }
          for (;;)
          {
            break;
            i6 += 1;
          }
        case 78: 
          localDoubleMetaphoneResult.append(i);
          int i3 = i6 + 1;
          i3 = charAt(paramString, i3);
          if (i3 == i) {
            i6 += 2;
          }
          for (;;)
          {
            break;
            i6 += 1;
          }
        case 209: 
          localDoubleMetaphoneResult.append(i);
          i6 += 1;
          break;
        case 80: 
          i6 = handleP(paramString, localDoubleMetaphoneResult, i6);
          break;
        case 81: 
          localDoubleMetaphoneResult.append(j);
          i4 = i6 + 1;
          i4 = charAt(paramString, i4);
          i8 = 81;
          if (i4 == i8) {
            i6 += 2;
          }
          for (;;)
          {
            break;
            i6 += 1;
          }
        case 82: 
          i6 = handleR(paramString, localDoubleMetaphoneResult, i6, bool4);
          break;
        case 83: 
          i6 = handleS(paramString, localDoubleMetaphoneResult, i6, bool4);
          break;
        case 84: 
          i6 = handleT(paramString, localDoubleMetaphoneResult, i6);
          break;
        case 86: 
          localDoubleMetaphoneResult.append(k);
          i4 = i6 + 1;
          i4 = charAt(paramString, i4);
          i8 = 86;
          if (i4 == i8) {
            i6 += 2;
          }
          for (;;)
          {
            break;
            i6 += 1;
          }
        case 87: 
          i6 = handleW(paramString, localDoubleMetaphoneResult, i6);
          break;
        case 88: 
          i6 = handleX(paramString, localDoubleMetaphoneResult, i6);
          break;
        case 90: 
          i6 = handleZ(paramString, localDoubleMetaphoneResult, i6, bool4);
        }
      }
      label931:
      if (paramBoolean) {
        str = localDoubleMetaphoneResult.getAlternate();
      } else {
        str = localDoubleMetaphoneResult.getPrimary();
      }
    }
  }
  
  public Object encode(Object paramObject)
  {
    boolean bool = paramObject instanceof String;
    if (!bool)
    {
      EncoderException localEncoderException = new org/apache/commons/codec/EncoderException;
      localEncoderException.<init>("DoubleMetaphone encode parameter is not of type String");
      throw localEncoderException;
    }
    paramObject = (String)paramObject;
    return doubleMetaphone((String)paramObject);
  }
  
  public String encode(String paramString)
  {
    return doubleMetaphone(paramString);
  }
  
  public int getMaxCodeLen()
  {
    return this.maxCodeLen;
  }
  
  public boolean isDoubleMetaphoneEqual(String paramString1, String paramString2)
  {
    return isDoubleMetaphoneEqual(paramString1, paramString2, false);
  }
  
  public boolean isDoubleMetaphoneEqual(String paramString1, String paramString2, boolean paramBoolean)
  {
    String str1 = doubleMetaphone(paramString1, paramBoolean);
    String str2 = doubleMetaphone(paramString2, paramBoolean);
    return str1.equals(str2);
  }
  
  public void setMaxCodeLen(int paramInt)
  {
    this.maxCodeLen = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/language/DoubleMetaphone.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */