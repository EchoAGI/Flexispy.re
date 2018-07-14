package com.vvt.capture.wechat;

import com.vvt.im.events.info.a;
import com.vvt.im.events.info.b;
import com.vvt.im.events.info.c;
import com.vvt.im.events.info.d;
import com.vvt.im.events.info.e;
import com.vvt.im.events.info.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeChatData {
    enum Direction {
        UNKNOWN,
        IN,
        OUT
    }

    private int a = 0;
    private long b;
    private String c = "";
    private WeChatData.Direction d;
    private String e = "";
    private boolean f = false;
    private List g;
    private d h;
    private c i;
    private f j;
    private b k;
    private List l;

    public WeChatData() {
        this.l = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        localObject = new com.vvt.im.events.info.d();
        a((d)localObject);
        localObject = new com.vvt.im.events.info.c();
        a((c)localObject);
        this.j = new com.vvt.im.events.info.f();;
        this.k = new com.vvt.im.events.info.b();
    }

    public int a()
    {
        return this.a;
    }

    public void a(int paramInt)
    {
        this.a = paramInt;
    }

    public void a(long paramLong)
    {
        this.b = paramLong;
    }

    public void a(WeChatData.Direction paramDirection)
    {
        this.d = paramDirection;
    }

    public void a(b paramb)
    {
        this.k = paramb;
    }

    public void a(c paramc)
    {
        this.i = paramc;
    }

    public void a(d paramd)
    {
        this.h = paramd;
    }

    public void a(f paramf)
    {
        this.j = paramf;
    }

    public void a(String paramString)
    {
        this.c = paramString;
    }

    public void a(List paramList)
    {
        this.g = paramList;
    }

    public void a(boolean paramBoolean)
    {
        this.f = paramBoolean;
    }

    public long b()
    {
        return this.b;
    }

    public void b(String paramString)
    {
        this.e = paramString;
    }

    public void b(List paramList)
    {
        this.l = paramList;
    }

    public String c()
    {
        return this.c;
    }

    public WeChatData.Direction d()
    {
        return this.d;
    }

    public List e()
    {
        return this.g;
    }

    public d f()
    {
        return this.h;
    }

    public c g()
    {
        return this.i;
    }

    public f h()
    {
        return this.j;
    }

    public b i()
    {
        return this.k;
    }

    public List j()
    {
        return this.l;
    }

    public String toString() {
        StringBuilder localStringBuilder1 = new java.lang.StringBuilder();
        Object localObject1 = new java.lang.StringBuilder();
        localObject1 = ((StringBuilder)localObject1).append("\ntextRepresentation: ");
        int m = this.a;
        localObject1 = m;
        localStringBuilder1.append((String)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("\ntext: ");
        localObject1 = (String)this.c;
        localStringBuilder1.append((String)localObject1);
        localObject1 = new java.lang.StringBuilder();
        localObject1 = ((StringBuilder)localObject1).append("\ndateTime: ");
        localObject2 = this.e;
        localObject1 = (String)localObject2;
        localStringBuilder1.append((String)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("\nsender: ");
        localObject2 = this.j.a();
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("|");
        localObject2 = this.j.b();
        localObject1 = (String)localObject2;
        localStringBuilder1.append((String)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("\nconversation: ");
        localObject2 = this.k.toString();
        localObject1 = (String)localObject2;
        localStringBuilder1.append((String)localObject1);
        localObject1 = this.g;
        localObject2 = ((List)localObject1).iterator();
        boolean bool;
        for (;;)
        {
            bool = ((Iterator)localObject2).hasNext();
            if (!bool) {
                break;
            }
            localObject1 = (e)((Iterator)localObject2).next();
            StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
            localStringBuilder2.<init>();
            String str = "\nparticipant: ";
            localStringBuilder2 = localStringBuilder2.append(str);
            localObject1 = ((e)localObject1).toString();
            localObject1 = (String)localObject1;
            localStringBuilder1.append((String)localObject1);
        }
        localObject1 = this.i;
        if (localObject1 != null)
        {
            localObject1 = this.i;
            double d1 = ((c)localObject1).a();
            double d2 = 0.0D;
            bool = d1 < d2;
            if (bool)
            {
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject1 = ((StringBuilder)localObject1).append("\nlocation: (");
                d1 = this.i.a();
                localObject1 = ((StringBuilder)localObject1).append(d1).append(",");
                d1 = this.i.b();
                localObject1 = ((StringBuilder)localObject1).append(d1).append(") name: ");
                localObject2 = this.i.c();
                localObject1 = (String)localObject2;
                localStringBuilder1.append((String)localObject1);
            }
        }
        localObject1 = this.l;
        if (localObject1 != null)
        {
            localObject1 = this.l;
            int n = ((List)localObject1).size();
            if (n > 0)
            {
                localObject1 = this.l.get(0);
                if (localObject1 != null)
                {
                    localObject1 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject1).<init>();
                    localObject2 = ((StringBuilder)localObject1).append("attachments: ");
                    localObject1 = ((a)this.l.get(0)).a();
                    localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append(" ");
                    localObject1 = ((a)this.l.get(0)).c();
                    localObject1 = (String)localObject1;
                    localStringBuilder1.append((String)localObject1);
                }
            }
        }
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("\nownerData: ");
        localObject2 = this.h.toString();
        localObject1 = (String)localObject2;
        localStringBuilder1.append((String)localObject1);
        return localStringBuilder1.toString();
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/WeChatData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */