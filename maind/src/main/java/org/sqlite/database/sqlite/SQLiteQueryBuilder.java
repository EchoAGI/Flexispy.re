package org.sqlite.database.sqlite;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.sqlite.os.CancellationSignal;

public class SQLiteQueryBuilder
{
  private static final String TAG = "SQLiteQueryBuilder";
  private static final Pattern sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
  private boolean mDistinct = false;
  private SQLiteDatabase.CursorFactory mFactory = null;
  private Map mProjectionMap = null;
  private boolean mStrict;
  private String mTables = "";
  private StringBuilder mWhereClause = null;
  
  private static void appendClause(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    boolean bool = TextUtils.isEmpty(paramString2);
    if (!bool)
    {
      paramStringBuilder.append(paramString1);
      paramStringBuilder.append(paramString2);
    }
  }
  
  public static void appendColumns(StringBuilder paramStringBuilder, String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    int j = 0;
    while (j < i)
    {
      String str1 = paramArrayOfString[j];
      if (str1 != null)
      {
        if (j > 0)
        {
          String str2 = ", ";
          paramStringBuilder.append(str2);
        }
        paramStringBuilder.append(str1);
      }
      j += 1;
    }
    paramStringBuilder.append(' ');
  }
  
  public static String buildQueryString(boolean paramBoolean, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    boolean bool = TextUtils.isEmpty(paramString3);
    if (bool)
    {
      bool = TextUtils.isEmpty(paramString4);
      if (!bool)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("HAVING clauses are only permitted when using a groupBy clause");
        throw ((Throwable)localObject1);
      }
    }
    bool = TextUtils.isEmpty(paramString6);
    if (!bool)
    {
      localObject1 = sLimitPattern.matcher(paramString6);
      bool = ((Matcher)localObject1).matches();
      if (!bool)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "invalid LIMIT clauses:" + paramString6;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    Object localObject1 = new java/lang/StringBuilder;
    int i = 120;
    ((StringBuilder)localObject1).<init>(i);
    Object localObject2 = "SELECT ";
    ((StringBuilder)localObject1).append((String)localObject2);
    if (paramBoolean)
    {
      localObject2 = "DISTINCT ";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    if (paramArrayOfString != null)
    {
      i = paramArrayOfString.length;
      if (i != 0) {
        appendColumns((StringBuilder)localObject1, paramArrayOfString);
      }
    }
    for (;;)
    {
      ((StringBuilder)localObject1).append("FROM ");
      ((StringBuilder)localObject1).append(paramString1);
      appendClause((StringBuilder)localObject1, " WHERE ", paramString2);
      appendClause((StringBuilder)localObject1, " GROUP BY ", paramString3);
      appendClause((StringBuilder)localObject1, " HAVING ", paramString4);
      appendClause((StringBuilder)localObject1, " ORDER BY ", paramString5);
      appendClause((StringBuilder)localObject1, " LIMIT ", paramString6);
      return ((StringBuilder)localObject1).toString();
      localObject2 = "* ";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
  }
  
  private String[] computeProjection(String[] paramArrayOfString)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2;
    int n;
    String str1;
    String str2;
    boolean bool1;
    if (paramArrayOfString != null)
    {
      int j = paramArrayOfString.length;
      if (j > 0)
      {
        localObject2 = this.mProjectionMap;
        if (localObject2 != null)
        {
          j = paramArrayOfString.length;
          localObject2 = new String[j];
          int m = paramArrayOfString.length;
          n = 0;
          str1 = null;
          if (n < m)
          {
            str2 = paramArrayOfString[n];
            localObject1 = (String)this.mProjectionMap.get(str2);
            if (localObject1 != null) {
              localObject2[n] = localObject1;
            }
            for (;;)
            {
              i = n + 1;
              n = i;
              break;
              bool1 = this.mStrict;
              if (bool1) {
                break label145;
              }
              localObject1 = " AS ";
              bool1 = str2.contains((CharSequence)localObject1);
              if (!bool1)
              {
                localObject1 = " as ";
                bool1 = str2.contains((CharSequence)localObject1);
                if (!bool1) {
                  break label145;
                }
              }
              localObject2[n] = str2;
            }
            label145:
            localObject1 = new java/lang/IllegalArgumentException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("Invalid column ");
            str1 = paramArrayOfString[n];
            localObject2 = str1;
            ((IllegalArgumentException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
          paramArrayOfString = (String[])localObject2;
        }
      }
    }
    for (;;)
    {
      return paramArrayOfString;
      localObject2 = this.mProjectionMap;
      if (localObject2 != null)
      {
        localObject2 = this.mProjectionMap.entrySet();
        paramArrayOfString = new String[((Set)localObject2).size()];
        Iterator localIterator = ((Set)localObject2).iterator();
        n = 0;
        str1 = null;
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (Map.Entry)localIterator.next();
          localObject2 = (String)((Map.Entry)localObject1).getKey();
          str2 = "_count";
          boolean bool2 = ((String)localObject2).equals(str2);
          if (!bool2)
          {
            int k = n + 1;
            localObject1 = (String)((Map.Entry)localObject1).getValue();
            paramArrayOfString[n] = localObject1;
            n = k;
          }
        }
      }
      paramArrayOfString = null;
    }
  }
  
  private void validateQuerySql(SQLiteDatabase paramSQLiteDatabase, String paramString, CancellationSignal paramCancellationSignal)
  {
    SQLiteSession localSQLiteSession = paramSQLiteDatabase.getThreadSession();
    int i = paramSQLiteDatabase.getThreadDefaultConnectionFlags(true);
    localSQLiteSession.prepare(paramString, i, paramCancellationSignal, null);
  }
  
  public void appendWhere(CharSequence paramCharSequence)
  {
    StringBuilder localStringBuilder = this.mWhereClause;
    int i;
    if (localStringBuilder == null)
    {
      localStringBuilder = new java/lang/StringBuilder;
      i = paramCharSequence.length() + 16;
      localStringBuilder.<init>(i);
      this.mWhereClause = localStringBuilder;
    }
    localStringBuilder = this.mWhereClause;
    int j = localStringBuilder.length();
    if (j == 0)
    {
      localStringBuilder = this.mWhereClause;
      i = 40;
      localStringBuilder.append(i);
    }
    this.mWhereClause.append(paramCharSequence);
  }
  
  public void appendWhereEscapeString(String paramString)
  {
    StringBuilder localStringBuilder = this.mWhereClause;
    int i;
    if (localStringBuilder == null)
    {
      localStringBuilder = new java/lang/StringBuilder;
      i = paramString.length() + 16;
      localStringBuilder.<init>(i);
      this.mWhereClause = localStringBuilder;
    }
    localStringBuilder = this.mWhereClause;
    int j = localStringBuilder.length();
    if (j == 0)
    {
      localStringBuilder = this.mWhereClause;
      i = 40;
      localStringBuilder.append(i);
    }
    DatabaseUtils.appendEscapedSQLString(this.mWhereClause, paramString);
  }
  
  public String buildQuery(String[] paramArrayOfString, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    char c = ')';
    String[] arrayOfString = computeProjection(paramArrayOfString);
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = this.mWhereClause;
    int i;
    if (localObject2 != null)
    {
      localObject2 = this.mWhereClause;
      i = ((StringBuilder)localObject2).length();
      if (i > 0) {
        i = 1;
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        str = this.mWhereClause.toString();
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append(c);
      }
      if (paramString1 != null)
      {
        int j = paramString1.length();
        if (j > 0)
        {
          if (i != 0)
          {
            localObject2 = " AND ";
            ((StringBuilder)localObject1).append((String)localObject2);
          }
          i = 40;
          ((StringBuilder)localObject1).append(i);
          ((StringBuilder)localObject1).append(paramString1);
          ((StringBuilder)localObject1).append(c);
        }
      }
      boolean bool = this.mDistinct;
      String str = this.mTables;
      localObject1 = ((StringBuilder)localObject1).toString();
      return buildQueryString(bool, str, arrayOfString, (String)localObject1, paramString2, paramString3, paramString4, paramString5);
      bool = false;
      localObject2 = null;
    }
  }
  
  public String buildQuery(String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    return buildQuery(paramArrayOfString1, paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public String buildUnionQuery(String[] paramArrayOfString, String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    int i = paramArrayOfString.length;
    boolean bool = this.mDistinct;
    if (bool) {}
    for (String str1 = " UNION ";; str1 = " UNION ALL ")
    {
      int j = 0;
      while (j < i)
      {
        if (j > 0) {
          localStringBuilder.append(str1);
        }
        String str2 = paramArrayOfString[j];
        localStringBuilder.append(str2);
        j += 1;
      }
    }
    appendClause(localStringBuilder, " ORDER BY ", paramString1);
    appendClause(localStringBuilder, " LIMIT ", paramString2);
    return localStringBuilder.toString();
  }
  
  public String buildUnionSubQuery(String paramString1, String[] paramArrayOfString, Set paramSet, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    int i = paramArrayOfString.length;
    String[] arrayOfString = new String[i];
    int j = 0;
    if (j < i)
    {
      localObject1 = paramArrayOfString[j];
      boolean bool = ((String)localObject1).equals(paramString1);
      if (bool)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("'").append(paramString2);
        localObject2 = "' AS ";
        localObject1 = (String)localObject2 + paramString1;
        arrayOfString[j] = localObject1;
      }
      for (;;)
      {
        j += 1;
        break;
        if (j > paramInt)
        {
          bool = paramSet.contains(localObject1);
          if (!bool) {}
        }
        else
        {
          arrayOfString[j] = localObject1;
          continue;
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "NULL AS ";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject1 = (String)localObject1;
        arrayOfString[j] = localObject1;
      }
    }
    Object localObject1 = paramString4;
    Object localObject2 = paramString5;
    return buildQuery(arrayOfString, paramString3, paramString4, paramString5, null, null);
  }
  
  public String buildUnionSubQuery(String paramString1, String[] paramArrayOfString1, Set paramSet, int paramInt, String paramString2, String paramString3, String[] paramArrayOfString2, String paramString4, String paramString5)
  {
    return buildUnionSubQuery(paramString1, paramArrayOfString1, paramSet, paramInt, paramString2, paramString3, paramString4, paramString5);
  }
  
  public String getTables()
  {
    return this.mTables;
  }
  
  public Cursor query(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4)
  {
    return query(paramSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramString3, paramString4, null, null);
  }
  
  public Cursor query(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    return query(paramSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramString3, paramString4, paramString5, null);
  }
  
  public Cursor query(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4, String paramString5, CancellationSignal paramCancellationSignal)
  {
    Object localObject1 = this.mTables;
    boolean bool1;
    if (localObject1 == null) {
      bool1 = false;
    }
    String str1;
    Object localObject2;
    String str2;
    for (localObject1 = null;; localObject1 = paramSQLiteDatabase.rawQueryWithFactory((SQLiteDatabase.CursorFactory)localObject2, str1, paramArrayOfString2, str2, paramCancellationSignal))
    {
      return (Cursor)localObject1;
      bool1 = this.mStrict;
      if ((bool1) && (paramString1 != null))
      {
        int i = paramString1.length();
        if (i > 0)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          str1 = "(" + paramString1 + ")";
          localObject1 = this;
          localObject2 = paramArrayOfString1;
          localObject3 = paramString2;
          str2 = paramString3;
          localObject1 = buildQuery(paramArrayOfString1, str1, paramString2, paramString3, paramString4, paramString5);
          validateQuerySql(paramSQLiteDatabase, (String)localObject1, paramCancellationSignal);
        }
      }
      localObject1 = this;
      localObject2 = paramArrayOfString1;
      str1 = paramString1;
      Object localObject3 = paramString2;
      str2 = paramString3;
      str1 = buildQuery(paramArrayOfString1, paramString1, paramString2, paramString3, paramString4, paramString5);
      localObject1 = "SQLiteQueryBuilder";
      int j = 3;
      boolean bool2 = Log.isLoggable((String)localObject1, j);
      if (bool2)
      {
        localObject1 = "SQLiteQueryBuilder";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "Performing query: ";
        localObject2 = (String)localObject3 + str1;
        Log.d((String)localObject1, (String)localObject2);
      }
      localObject2 = this.mFactory;
      str2 = SQLiteDatabase.findEditTable(this.mTables);
      localObject1 = paramSQLiteDatabase;
      localObject3 = paramArrayOfString2;
    }
  }
  
  public void setCursorFactory(SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    this.mFactory = paramCursorFactory;
  }
  
  public void setDistinct(boolean paramBoolean)
  {
    this.mDistinct = paramBoolean;
  }
  
  public void setProjectionMap(Map paramMap)
  {
    this.mProjectionMap = paramMap;
  }
  
  public void setStrict(boolean paramBoolean)
  {
    this.mStrict = paramBoolean;
  }
  
  public void setTables(String paramString)
  {
    this.mTables = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteQueryBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */