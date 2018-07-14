package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class Caverphone
  implements StringEncoder
{
  public String caverphone(String paramString)
  {
    int i;
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label18;
      }
    }
    label18:
    int j;
    for (Object localObject = "1111111111";; localObject = paramString.substring(0, j))
    {
      return (String)localObject;
      localObject = Locale.ENGLISH;
      paramString = paramString.toLowerCase((Locale)localObject).replaceAll("[^a-z]", "").replaceAll("e$", "").replaceAll("^cough", "cou2f").replaceAll("^rough", "rou2f").replaceAll("^tough", "tou2f").replaceAll("^enough", "enou2f").replaceAll("^trough", "trou2f").replaceAll("^gn", "2n").replaceAll("^mb", "m2").replaceAll("cq", "2q").replaceAll("ci", "si").replaceAll("ce", "se").replaceAll("cy", "sy").replaceAll("tch", "2ch").replaceAll("c", "k").replaceAll("q", "k").replaceAll("x", "k").replaceAll("v", "f").replaceAll("dg", "2g").replaceAll("tio", "sio").replaceAll("tia", "sia").replaceAll("d", "t").replaceAll("ph", "fh").replaceAll("b", "p").replaceAll("sh", "s2").replaceAll("z", "s").replaceAll("^[aeiou]", "A").replaceAll("[aeiou]", "3").replaceAll("j", "y").replaceAll("^y3", "Y3").replaceAll("^y", "A").replaceAll("y", "3").replaceAll("3gh3", "3kh3").replaceAll("gh", "22").replaceAll("g", "k").replaceAll("s+", "S").replaceAll("t+", "T").replaceAll("p+", "P").replaceAll("k+", "K").replaceAll("f+", "F").replaceAll("m+", "M").replaceAll("n+", "N").replaceAll("w3", "W3").replaceAll("wh3", "Wh3").replaceAll("w$", "3").replaceAll("w", "2").replaceAll("^h", "A").replaceAll("h", "2").replaceAll("r3", "R3").replaceAll("r$", "3").replaceAll("r", "2").replaceAll("l3", "L3").replaceAll("l$", "3").replaceAll("l", "2").replaceAll("2", "").replaceAll("3$", "A").replaceAll("3", "");
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append(paramString).append("111111");
      String str = "1111";
      paramString = str;
      i = 0;
      j = 10;
    }
  }
  
  public Object encode(Object paramObject)
  {
    boolean bool = paramObject instanceof String;
    if (!bool)
    {
      EncoderException localEncoderException = new org/apache/commons/codec/EncoderException;
      localEncoderException.<init>("Parameter supplied to Caverphone encode is not of type java.lang.String");
      throw localEncoderException;
    }
    paramObject = (String)paramObject;
    return caverphone((String)paramObject);
  }
  
  public String encode(String paramString)
  {
    return caverphone(paramString);
  }
  
  public boolean isCaverphoneEqual(String paramString1, String paramString2)
  {
    String str1 = caverphone(paramString1);
    String str2 = caverphone(paramString2);
    return str1.equals(str2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/language/Caverphone.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */