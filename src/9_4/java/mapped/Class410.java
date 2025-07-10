package mapped;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// $VF: Compiled from yg
public final class Class410 {
   // $VF: synthetic field
   public int field1218;
   // $VF: synthetic field
   public Class208[] field1219;
   // $VF: synthetic field
   public boolean field1220;
   // $VF: synthetic field
   public DataInputStream field1221;
   // $VF: synthetic field
   public int field1222;
   // $VF: synthetic field
   public Class207[] field1223;
   // $VF: synthetic field
   public static final int field1224 = 8192;
   // $VF: synthetic field
   public Class149 field1225;
   // $VF: synthetic field
   public int[] field1226;
   // $VF: synthetic field
   public int field1227;
   // $VF: synthetic field
   public String field1228;
   // $VF: synthetic field
   public int field1229;
   // $VF: synthetic field
   public int field1230;
   // $VF: synthetic field
   public Class151[] field1231;
   // $VF: synthetic field
   public boolean field1232;
   // $VF: synthetic field
   public String field1233;

   // $VF: synthetic method
   public final void method763() {
      int var2 = -889275714;// 369
      if (this.field1221.readInt() != var2) {// 215
         throw new Class239(new StringBuilder().insert(0, this.field1233).append(" is not a Java .class file").toString());// 511
      }
   }// 210

   // $VF: synthetic method
   public final void method764() {
      this.field1229 = this.field1221.readUnsignedShort();// 66
      if ((this.field1229 & 512) != 0) {// 109
         this.field1229 |= 1024;// 213
      }

      if ((this.field1229 & 1024) != 0 && (this.field1229 & 16) != 0) {// 385
         throw new Class239("Class can't be both final and abstract");// 270
      } else {
         this.field1227 = this.field1221.readUnsignedShort();// 177
         this.field1218 = this.field1221.readUnsignedShort();// 266
      }
   }// 235

   // $VF: synthetic method
   public Class205 method765() {
      Class410 var1 = this;
      ZipFile var6 = null;// 329

      try {
         Class410 var10000;
         label62: {
            if (var1.field1220) {// 38
               if (var1.field1232) {// 257
                  ZipEntry var2 = (var6 = new ZipFile(var1.field1228)).getEntry(var1.field1233);// 269 455
                  var10000 = var1;// 148
                  var1.field1221 = new DataInputStream(new BufferedInputStream(var6.getInputStream(var2), 8192));
                  break label62;// 142
               }

               var1.field1221 = new DataInputStream(new BufferedInputStream(new FileInputStream(var1.field1233), 8192));// 39
            }

            var10000 = var1;// 541
         }

         var10000.method763();
         var1.method771();// 510
         var1.method769();// 82
         var1.method764();// 5
         var1.method770();// 450
         var1.method766();// 149
         var1.method768();// 24
         var1.method767();// 600
      } finally {
         if (this.field1220) {// 440
            this.field1221.close();// 248
            if (var6 != null) {// 97
               var6.close();// 411
            }
         }
      }

      return new Class205(// 32
         this.field1227,
         this.field1218,
         this.field1233,
         this.field1222,
         this.field1230,
         this.field1229,
         this.field1225,
         this.field1226,
         this.field1223,
         this.field1219,
         this.field1231,
         (byte)(this.field1232 ? 3 : 2)
      );
   }

   // $VF: synthetic method
   public Class410(String var1) {
      this.field1232 = false;// 400
      this.field1233 = var1;// 33
      this.field1220 = true;// 0 567
   }// 240

   // $VF: synthetic method
   public Class410(String var1, String var2) {
      this.field1232 = true;// 59
      this.field1220 = true;// 391
      this.field1228 = var1;// 330
      this.field1233 = var2;// 68 589
   }// 579

   // $VF: synthetic method
   public Class410(InputStream var1, String var2) {
      this.field1233 = var2;// 159
      this.field1220 = false;// 493
      this.field1232 = (var2 = var1.getClass().getName()).startsWith("java.util.zip.") || var2.startsWith("java.util.jar.");// 377 495 561
      if (var1 instanceof DataInputStream) {// 604
         this.field1221 = (DataInputStream)var1;// 22
      } else {
         this.field1221 = new DataInputStream(new BufferedInputStream(var1, 8192));// 144
      }
   }// 6 358

   // $VF: synthetic method
   public final void method766() {
      Class410 var2 = this;
      int var1;
      this.field1223 = new Class207[var1 = this.field1221.readUnsignedShort()];// 117 300

      for (int var10000 = var3 = 0; var10000 < var1; var10000 = var3) {// 245
         Class207[] var4 = var2.field1223;// 296
         int var10001 = var3;
         Class207 var10002 = new Class207(var2.field1221, var2.field1225);
         var3++;
         var4[var10001] = var10002;
      }
   }// 417

   // $VF: synthetic method
   public final void method767() {
      Class410 var2 = this;
      int var1;
      this.field1231 = new Class151[var1 = this.field1221.readUnsignedShort()];// 137 314

      for (int var10000 = var3 = 0; var10000 < var1; var10000 = var3) {// 50
         Class151[] var4 = var2.field1231;// 253
         int var10001 = var3;
         Class151 var10002 = Class151.method182(var2.field1221, var2.field1225);
         var3++;
         var4[var10001] = var10002;
      }
   }// 474

   // $VF: synthetic method
   public final void method768() {
      Class410 var2 = this;
      int var1;
      this.field1219 = new Class208[var1 = this.field1221.readUnsignedShort()];// 281 438

      for (int var10000 = var3 = 0; var10000 < var1; var10000 = var3) {// 592
         Class208[] var4 = var2.field1219;// 483
         int var10001 = var3;
         Class208 var10002 = new Class208(var2.field1221, var2.field1225);
         var3++;
         var4[var10001] = var10002;
      }
   }// 433

   // $VF: synthetic method
   public final void method769() {
      this.field1225 = new Class149(this.field1221);// 129
   }// 258

   // $VF: synthetic method
   public final void method770() {
      Class410 var2 = this;
      int var1;
      this.field1226 = new int[var1 = this.field1221.readUnsignedShort()];// 308 339

      for (int var10000 = var3 = 0; var10000 < var1; var10000 = var3) {// 596
         int[] var4 = var2.field1226;// 549
         int var10001 = var3;
         int var10002 = var2.field1221.readUnsignedShort();
         var3++;
         var4[var10001] = var10002;
      }
   }// 76

   // $VF: synthetic method
   public final void method771() {
      this.field1230 = this.field1221.readUnsignedShort();// 225
      this.field1222 = this.field1221.readUnsignedShort();// 532
   }// 297
}
