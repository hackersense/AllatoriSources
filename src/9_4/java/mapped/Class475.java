package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from pn
public abstract class Class475 {
   // $VF: synthetic field
   public static final int field1542 = 90;
   // $VF: synthetic field
   public static final int field1543 = 66;
   // $VF: synthetic field
   public static final int field1544 = 91;
   // $VF: synthetic field
   public static final int field1545 = 64;
   // $VF: synthetic field
   public static final int field1546 = 74;
   // $VF: synthetic field
   public static final int field1547 = 68;
   // $VF: synthetic field
   public static final int field1548 = 73;
   // $VF: synthetic field
   public static final int field1549 = 83;
   // $VF: synthetic field
   public Class221 field1550;
   // $VF: synthetic field
   public static final int field1551 = 70;
   // $VF: synthetic field
   public static final int field1552 = 115;
   // $VF: synthetic field
   public static final int field1553 = 67;
   // $VF: synthetic field
   public static final int field1554 = 101;
   // $VF: synthetic field
   public int field1555;
   // $VF: synthetic field
   public static final int field1556 = 99;

   // $VF: synthetic method
   public abstract Class332 method1253();

   // $VF: synthetic method
   public Class221 method1257() {
      return this.field1550;// 40
   }

   // $VF: synthetic method
   public int method1258() {
      return this.field1555;// 18
   }

   // $VF: synthetic method
   public abstract void method1254(DataOutputStream var1);

   // $VF: synthetic method
   public Class475(int var1, Class221 var2) {
      this.field1555 = var1;// 30
      this.field1550 = var2;// 143 260
   }// 252

   // $VF: synthetic method
   public abstract String method1255();

   // $VF: synthetic method
   public static Class475 method1259(DataInputStream var0, Class221 var1) {
      Class221 var6 = var1;
      DataInputStream var7 = var0;
      int var5;
      switch (var5 = var0.readUnsignedByte()) {// 377 604
         case 64:
            return new Class474(64, new Class533(Class128.method102(var0, var1.method402(), true), var1, false), var1);// 399
         case 65:
         case 69:
         case 71:
         case 72:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 92:
         case 93:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 100:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         default:
            throw new RuntimeException("Unexpected element value kind in annotation: " + var5);// 148
         case 66:
            return new Class479(66, var0.readUnsignedShort(), var1);// 144
         case 67:
            return new Class479(67, var0.readUnsignedShort(), var1);// 192
         case 68:
            return new Class479(68, var0.readUnsignedShort(), var1);// 321
         case 70:
            return new Class479(70, var0.readUnsignedShort(), var1);// 567
         case 73:
            return new Class479(73, var0.readUnsignedShort(), var1);// 0
         case 74:
            return new Class479(74, var0.readUnsignedShort(), var1);// 552
         case 83:
            return new Class479(83, var0.readUnsignedShort(), var1);// 466
         case 90:
            return new Class479(90, var0.readUnsignedShort(), var1);// 68
         case 91:
            while (false) {
            }

            int var4;
            Class332[] var3 = new Class332[var4 = var0.readUnsignedShort()];// 28 424

            int var2;
            for (int var8 = var2 = 0; var8 < var4; var8 = var2) {// 588
               int var10001 = var2;
               Class332 var10002 = Class332.method533(var7, var6.method402());
               var2++;
               var3[var10001] = var10002;// 412
            }

            return new Class478(91, var3, var6);// 269
         case 99:
            return new Class477(var0.readUnsignedShort(), var1);// 398
         case 101:
            return new Class476(var0.readUnsignedShort(), var0.readUnsignedShort(), var1);// 555
         case 115:
            return new Class479(115, var0.readUnsignedShort(), var1);// 330
      }
   }

   // $VF: synthetic method
   public static Class475 method1260(Class332 var0, Class221 var1, boolean var2) {
      switch (var0.method532()) {// 279
         case 64:
            return new Class474((Class336)var0, var1, var2);// 464
         case 65:
         case 69:
         case 71:
         case 72:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 92:
         case 93:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 100:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         default:
            throw new RuntimeException("Not implemented yet! (" + var0.method532() + ")");// 248
         case 66:
         case 67:
         case 68:
         case 70:
         case 73:
         case 74:
         case 83:
         case 90:
         case 115:
            return new Class479((Class333)var0, var1, var2);// 242
         case 91:
            return new Class478((Class331)var0, var1, var2);// 21
         case 99:
            return new Class477((Class334)var0, var1, var2);// 45
         case 101:
            return new Class476((Class335)var0, var1, var2);// 69
      }
   }
}
