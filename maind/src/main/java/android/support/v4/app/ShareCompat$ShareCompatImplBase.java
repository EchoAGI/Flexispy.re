package android.support.v4.app;

import android.content.Intent;
import android.view.MenuItem;

class ShareCompat$ShareCompatImplBase
  implements ShareCompat.ShareCompatImpl
{
  private static void withinStyle(StringBuilder paramStringBuilder, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = 32;
    int j = paramInt1;
    if (j < paramInt2)
    {
      char c1 = paramCharSequence.charAt(j);
      char c2 = '<';
      Object localObject;
      if (c1 == c2)
      {
        localObject = "&lt;";
        paramStringBuilder.append((String)localObject);
      }
      for (;;)
      {
        j += 1;
        break;
        c2 = '>';
        if (c1 == c2)
        {
          localObject = "&gt;";
          paramStringBuilder.append((String)localObject);
        }
        else
        {
          c2 = '&';
          if (c1 == c2)
          {
            localObject = "&amp;";
            paramStringBuilder.append((String)localObject);
          }
          else
          {
            c2 = '~';
            if ((c1 > c2) || (c1 < i))
            {
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>();
              localObject = ((StringBuilder)localObject).append("&#").append(c1);
              String str = ";";
              localObject = str;
              paramStringBuilder.append((String)localObject);
            }
            else if (c1 == i)
            {
              for (;;)
              {
                int k = j + 1;
                if (k >= paramInt2) {
                  break;
                }
                k = j + 1;
                k = paramCharSequence.charAt(k);
                if (k != i) {
                  break;
                }
                localObject = "&nbsp;";
                paramStringBuilder.append((String)localObject);
                j += 1;
              }
              paramStringBuilder.append(i);
            }
            else
            {
              paramStringBuilder.append(c1);
            }
          }
        }
      }
    }
  }
  
  public void configureMenuItem(MenuItem paramMenuItem, ShareCompat.IntentBuilder paramIntentBuilder)
  {
    Intent localIntent = paramIntentBuilder.createChooserIntent();
    paramMenuItem.setIntent(localIntent);
  }
  
  public String escapeHtml(CharSequence paramCharSequence)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = paramCharSequence.length();
    withinStyle(localStringBuilder, paramCharSequence, 0, i);
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/ShareCompat$ShareCompatImplBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */