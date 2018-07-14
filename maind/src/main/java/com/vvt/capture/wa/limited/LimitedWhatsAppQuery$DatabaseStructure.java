package com.vvt.capture.wa.limited;

 enum LimitedWhatsAppQuery$DatabaseStructure
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/capture/wa/limited/LimitedWhatsAppQuery$DatabaseStructure;
    ((DatabaseStructure)localObject).<init>("UNKNOWN", 0);
    UNKNOWN = (DatabaseStructure)localObject;
    localObject = new com/vvt/capture/wa/limited/LimitedWhatsAppQuery$DatabaseStructure;
    ((DatabaseStructure)localObject).<init>("OLD_DESIGN", j);
    OLD_DESIGN = (DatabaseStructure)localObject;
    localObject = new com/vvt/capture/wa/limited/LimitedWhatsAppQuery$DatabaseStructure;
    ((DatabaseStructure)localObject).<init>("NEW_DESIGN", i);
    NEW_DESIGN = (DatabaseStructure)localObject;
    localObject = new DatabaseStructure[3];
    DatabaseStructure localDatabaseStructure = UNKNOWN;
    localObject[0] = localDatabaseStructure;
    localDatabaseStructure = OLD_DESIGN;
    localObject[j] = localDatabaseStructure;
    localDatabaseStructure = NEW_DESIGN;
    localObject[i] = localDatabaseStructure;
    a = (DatabaseStructure[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/limited/LimitedWhatsAppQuery$DatabaseStructure.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */