package a_vcard.android.syncml.pim.vcard;

import java.io.BufferedReader;
import java.io.Reader;

class CustomBufferedReader
  extends BufferedReader
{
  private long mTime;
  
  public CustomBufferedReader(Reader paramReader)
  {
    super(paramReader);
  }
  
  public long getTotalmillisecond()
  {
    return this.mTime;
  }
  
  public String readLine()
  {
    long l1 = System.currentTimeMillis();
    String str = super.readLine();
    long l2 = System.currentTimeMillis();
    long l3 = this.mTime;
    long l4 = l2 - l1;
    l3 += l4;
    this.mTime = l3;
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/syncml/pim/vcard/CustomBufferedReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */