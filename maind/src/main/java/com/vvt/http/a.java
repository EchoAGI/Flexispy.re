package com.vvt.http;

import com.vvt.async.NullListenerException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class a
  extends com.vvt.async.a
{
  private static final boolean b;
  private static final boolean c;
  private static final boolean d;
  public HttpURLConnection a;
  private d e;
  private com.vvt.http.request.b f;
  private boolean g;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      b = bool;
      c = com.vvt.ak.a.d;
      d = com.vvt.ak.a.e;
      return;
    }
  }
  
  private void a(com.vvt.http.request.b paramb)
  {
    HashMap localHashMap = paramb.f();
    boolean bool = b;
    if (bool) {}
    Iterator localIterator = localHashMap.keySet().iterator();
    Object localObject1 = "";
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = localIterator.next();
      Object localObject2 = localObject1;
      localObject2 = (String)localObject1;
      HttpURLConnection localHttpURLConnection = this.a;
      localObject1 = (String)localHashMap.get(localObject2);
      localHttpURLConnection.setRequestProperty((String)localObject2, (String)localObject1);
    }
  }
  
  private void f()
  {
    d locald = this.e;
    if (locald != null)
    {
      locald = this.e;
      b(locald);
      locald = null;
      this.e = null;
    }
  }
  
  protected void a(d paramd, int paramInt, Object... paramVarArgs)
  {
    int i = 0;
    boolean bool = b;
    if (bool) {}
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      bool = b;
      if (bool) {}
      Object localObject = (Exception)paramVarArgs[0];
      paramd.a((Exception)localObject);
      continue;
      bool = b;
      if (bool) {}
      localObject = (Exception)paramVarArgs[0];
      paramd.b((Exception)localObject);
      continue;
      bool = b;
      if (bool) {}
      i = ((Integer)paramVarArgs[0]).intValue();
      bool = true;
      localObject = (Exception)paramVarArgs[bool];
      paramd.a(i, (Exception)localObject);
      continue;
      bool = b;
      if (bool) {}
      localObject = (com.vvt.http.a.b)paramVarArgs[0];
      paramd.a((com.vvt.http.a.b)localObject);
      continue;
      bool = b;
      if (bool) {}
      localObject = (com.vvt.http.a.a)paramVarArgs[0];
      paramd.a((com.vvt.http.a.a)localObject);
      continue;
      bool = b;
      if (bool) {}
      localObject = (com.vvt.http.a.a)paramVarArgs[0];
      paramd.b((com.vvt.http.a.a)localObject);
    }
  }
  
  public boolean a(com.vvt.http.request.b paramb, d paramd)
  {
    int i = 1;
    boolean bool2 = this.g;
    if (!bool2)
    {
      this.g = i;
      this.f = paramb;
      this.e = paramd;
      if (paramd == null) {}
    }
    for (;;)
    {
      try
      {
        a(paramd);
        c localc = new com/vvt/http/c;
        localc.<init>(this, null);
        localc.setPriority(i);
        localc.start();
        return i;
      }
      catch (NullListenerException localNullListenerException)
      {
        bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      boolean bool1 = c;
      if (bool1) {}
      bool1 = false;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/http/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */