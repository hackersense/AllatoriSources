package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from vn
public abstract class Class332 {
   // $VF: synthetic field
   public static final int field921 = 91;
   // $VF: synthetic field
   public static final int field922 = 99;
   // $VF: synthetic field
   public static final int field923 = 70;
   // $VF: synthetic field
   public static final int field924 = 115;
   // $VF: synthetic field
   public static final int field925 = 74;
   // $VF: synthetic field
   public static final int field926 = 64;
   // $VF: synthetic field
   public static final int field927 = 90;
   // $VF: synthetic field
   public static final int field928 = 83;
   // $VF: synthetic field
   public Class149 field929;
   // $VF: synthetic field
   public static final int field930 = 73;
   // $VF: synthetic field
   public static final int field931 = 66;
   // $VF: synthetic field
   public static final int field932 = 101;
   // $VF: synthetic field
   public static final int field933 = 67;
   // $VF: synthetic field
   public int field934;
   // $VF: synthetic field
   public static final int field935 = 68;

   // $VF: synthetic method
   public abstract String method530();

   // $VF: synthetic method
   public abstract void method527(DataOutputStream var1);

   // $VF: synthetic method
   public String method531() {
      StringBuffer var10000 = new StringBuffer();
      var10000.append(this.method530());// 386
      return var10000.toString();// 470
   }

   // $VF: synthetic method
   public int method532() {
      return this.field934;// 123
   }

   // $VF: synthetic method
   public Class332(int var1, Class149 var2) {
      this.field934 = var1;// 338
      this.field929 = var2;// 273 295
   }// 161

   // $VF: synthetic method
   public static Class332 method533(DataInputStream var0, Class149 var1) {
      Class149 var6 = var1;
      DataInputStream var7 = var0;
      byte var5;
      switch (var5 = var0.readByte()) {// 33 400
         case 64:
            return new Class336(64, Class128.method102(var0, var1, false), var1);// 148
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
            throw new RuntimeException("Unexpected element value kind in annotation: " + var5);// 510
         case 66:
            return new Class333(66, var0.readUnsignedShort(), var1);// 246
         case 67:
            return new Class333(67, var0.readUnsignedShort(), var1);// 278
         case 68:
            return new Class333(68, var0.readUnsignedShort(), var1);// 485
         case 70:
            return new Class333(70, var0.readUnsignedShort(), var1);// 391
         case 73:
            return new Class333(73, var0.readUnsignedShort(), var1);// 579
         case 74:
            return new Class333(74, var0.readUnsignedShort(), var1);// 415
         case 83:
            return new Class333(83, var0.readUnsignedShort(), var1);// 87
         case 90:
            return new Class333(90, var0.readUnsignedShort(), var1);// 232
         case 91:
            while (false) {
            }

            int var4;
            Class332[] var3 = new Class332[var4 = var0.readUnsignedShort()];// 39 368

            int var2;
            for (int var8 = var2 = 0; var8 < var4; var8 = var2) {// 99
               int var10001 = var2;
               Class332 var10002 = method533(var7, var6);
               var2++;
               var3[var10001] = var10002;// 40
            }

            return new Class331(91, var3, var6);// 541
         case 99:
            return new Class334(99, var0.readUnsignedShort(), var1);// 257
         case 101:
            return new Class335(101, var0.readUnsignedShort(), var0.readUnsignedShort(), var1);// 329
         case 115:
            return new Class333(115, var0.readUnsignedShort(), var1);// 424
      }
   }
}
