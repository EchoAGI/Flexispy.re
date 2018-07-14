import a_vcard.android.syncml.pim.PropertyNode;
import a_vcard.android.syncml.pim.VDataBuilder;
import a_vcard.android.syncml.pim.VNode;
import a_vcard.android.syncml.pim.vcard.VCardException;
import a_vcard.android.syncml.pim.vcard.VCardParser;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadExample
{
  public static void main(String[] paramArrayOfString)
  {
    VCardParser localVCardParser = new a_vcard/android/syncml/pim/vcard/VCardParser;
    localVCardParser.<init>();
    VDataBuilder localVDataBuilder = new a_vcard/android/syncml/pim/VDataBuilder;
    localVDataBuilder.<init>();
    String str1 = "example.vcard";
    BufferedReader localBufferedReader = new java/io/BufferedReader;
    Object localObject1 = new java/io/InputStreamReader;
    Object localObject2 = new java/io/FileInputStream;
    ((FileInputStream)localObject2).<init>(str1);
    String str2 = "UTF-8";
    ((InputStreamReader)localObject1).<init>((InputStream)localObject2, str2);
    localBufferedReader.<init>((Reader)localObject1);
    for (String str3 = "";; str3 = ((StringBuilder)localObject1).toString())
    {
      String str4 = localBufferedReader.readLine();
      if (str4 == null) {
        break;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(str3).append(str4);
      localObject2 = "\n";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    }
    localBufferedReader.close();
    localObject1 = "UTF-8";
    boolean bool1 = localVCardParser.parse(str3, (String)localObject1, localVDataBuilder);
    if (!bool1)
    {
      localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Could not parse vCard file: " + str1;
      ((VCardException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    List localList = localVDataBuilder.vNodeList;
    Iterator localIterator1 = localList.iterator();
    for (;;)
    {
      boolean bool2 = localIterator1.hasNext();
      if (!bool2) {
        break;
      }
      VNode localVNode = (VNode)localIterator1.next();
      ArrayList localArrayList = localVNode.propList;
      String str5 = null;
      Iterator localIterator2 = localArrayList.iterator();
      PropertyNode localPropertyNode;
      do
      {
        bool2 = localIterator2.hasNext();
        if (!bool2) {
          break;
        }
        localPropertyNode = (PropertyNode)localIterator2.next();
        localObject1 = "FN";
        localObject2 = localPropertyNode.propName;
        bool2 = ((String)localObject1).equals(localObject2);
      } while (!bool2);
      str5 = localPropertyNode.propValue;
      localObject1 = System.out;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str2 = "Found contact: ";
      localObject2 = str2 + str5;
      ((PrintStream)localObject1).println((String)localObject2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/ReadExample.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */