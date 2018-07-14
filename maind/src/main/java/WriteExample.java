import a_vcard.android.syncml.pim.vcard.ContactStruct;
import a_vcard.android.syncml.pim.vcard.VCardComposer;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class WriteExample
{
  public static void main(String[] paramArrayOfString)
  {
    int i = 2;
    OutputStreamWriter localOutputStreamWriter = new java/io/OutputStreamWriter;
    FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
    localFileOutputStream.<init>("example.vcard");
    localOutputStreamWriter.<init>(localFileOutputStream, "UTF-8");
    VCardComposer localVCardComposer = new a_vcard/android/syncml/pim/vcard/VCardComposer;
    localVCardComposer.<init>();
    ContactStruct localContactStruct = new a_vcard/android/syncml/pim/vcard/ContactStruct;
    localContactStruct.<init>();
    localContactStruct.name = "Neo";
    localContactStruct.company = "The Company";
    localContactStruct.addPhone(i, "+123456789", null, true);
    String str = localVCardComposer.createVCard(localContactStruct, i);
    localOutputStreamWriter.write(str);
    localOutputStreamWriter.write("\n");
    localOutputStreamWriter.close();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/WriteExample.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */