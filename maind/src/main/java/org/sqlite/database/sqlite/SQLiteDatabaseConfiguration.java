package org.sqlite.database.sqlite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SQLiteDatabaseConfiguration
{
  private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
  public static final String MEMORY_DB_PATH = ":memory:";
  public final ArrayList customFunctions;
  public boolean foreignKeyConstraintsEnabled;
  public final String label;
  public Locale locale;
  public int maxSqlCacheSize;
  public int openFlags;
  public final String path;
  
  public SQLiteDatabaseConfiguration(String paramString, int paramInt)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.customFunctions = ((ArrayList)localObject);
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("path must not be null.");
      throw ((Throwable)localObject);
    }
    this.path = paramString;
    localObject = stripPathForLogs(paramString);
    this.label = ((String)localObject);
    this.openFlags = paramInt;
    this.maxSqlCacheSize = 25;
    localObject = Locale.getDefault();
    this.locale = ((Locale)localObject);
  }
  
  public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.customFunctions = ((ArrayList)localObject);
    if (paramSQLiteDatabaseConfiguration == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("other must not be null.");
      throw ((Throwable)localObject);
    }
    localObject = paramSQLiteDatabaseConfiguration.path;
    this.path = ((String)localObject);
    localObject = paramSQLiteDatabaseConfiguration.label;
    this.label = ((String)localObject);
    updateParametersFrom(paramSQLiteDatabaseConfiguration);
  }
  
  private static String stripPathForLogs(String paramString)
  {
    int i = paramString.indexOf('@');
    int j = -1;
    if (i == j) {}
    for (;;)
    {
      return paramString;
      Matcher localMatcher = EMAIL_IN_DB_PATTERN.matcher(paramString);
      String str = "XX@YY";
      paramString = localMatcher.replaceAll(str);
    }
  }
  
  public boolean isInMemoryDb()
  {
    return this.path.equalsIgnoreCase(":memory:");
  }
  
  public void updateParametersFrom(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    if (paramSQLiteDatabaseConfiguration == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("other must not be null.");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.path;
    Object localObject2 = paramSQLiteDatabaseConfiguration.path;
    boolean bool1 = ((String)localObject1).equals(localObject2);
    if (!bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("other configuration must refer to the same database.");
      throw ((Throwable)localObject1);
    }
    int i = paramSQLiteDatabaseConfiguration.openFlags;
    this.openFlags = i;
    i = paramSQLiteDatabaseConfiguration.maxSqlCacheSize;
    this.maxSqlCacheSize = i;
    localObject1 = paramSQLiteDatabaseConfiguration.locale;
    this.locale = ((Locale)localObject1);
    boolean bool2 = paramSQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
    this.foreignKeyConstraintsEnabled = bool2;
    this.customFunctions.clear();
    localObject1 = this.customFunctions;
    localObject2 = paramSQLiteDatabaseConfiguration.customFunctions;
    ((ArrayList)localObject1).addAll((Collection)localObject2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteDatabaseConfiguration.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */