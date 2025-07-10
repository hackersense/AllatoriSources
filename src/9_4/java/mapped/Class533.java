package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $VF: Compiled from qn
public class Class533 {
   // $VF: synthetic field
   public List field1795;
   // $VF: synthetic field
   public int field1796;
   // $VF: synthetic field
   public boolean field1797 = false;
   // $VF: synthetic field
   public Class221 field1798;

   // $VF: synthetic method
   public void method1580(Class548 var1) {
      if (this.field1795 == null) {// 455
         this.field1795 = new ArrayList();// 148
      }

      this.field1795.add(var1);// 236
   }// 142

   // $VF: synthetic method
   public Class128 method1581() {
      Class128 var1 = new Class128(this.field1796, this.field1798.method402(), this.field1797);// 377
      Iterator var4;
      Iterator var10000 = var4 = this.field1795.iterator();// 22

      while (var10000.hasNext()) {
         Class548 var3 = (Class548)var4.next();// 144
         var10000 = var4;
         var1.method103(var3.method1717());// 358
      }

      return var1;// 574
   }

   // $VF: synthetic method
   public Class533(Class221 var1) {
      this.field1798 = var1;// 132 465
   }// 184

   // $VF: synthetic method
   public String method1582() {
      Class533 var1 = this;
      StringBuffer var3 = new StringBuffer();// 238
      var3.append("@" + this.method1590() + "(");// 423
      int var2 = 0;

      for (int var10000 = var2; var10000 < var1.field1795.size(); var10000 = ++var2) {// 61
         var3.append(var1.field1795.get(var2));// 220
         if (var2 + 1 < var1.field1795.size()) {// 593
            var3.append(",");// 336
         }
      }

      var3.append(")");// 291
      return var3.toString();// 57
   }

   // $VF: synthetic method
   public List method1583() {
      return this.field1795;// 116
   }

   // $VF: synthetic method
   public boolean method1584() {
      return this.field1797;// 443
   }

   // $VF: synthetic method
   public void method1585(int var1) {
      this.field1796 = var1;// 550
   }// 510

   // $VF: synthetic method
   public List method1586(Class544[] var1, Class221 var2, boolean var3) {
      ArrayList var4 = new ArrayList();// 418
      int var5 = var1.length;// 533

      for (int var10000 = var8 = 0; var10000 < var5; var10000 = var8) {// 185
         Class544 var7 = var1[var8];// 1
         var8++;
         var4.add(new Class548(var7, var2, var3));// 46
      }

      return var4;// 553
   }

   // $VF: synthetic method
   public void method1587(DataOutputStream var1) {
      Class533 var2 = this;
      int var10000 = 0;
      var1.writeShort(this.field1796);
      var1.writeShort(this.field1795.size());// 232 463

      for (int var3 = 0; var10000 < var2.field1795.size(); var10000 = var3) {// 198
         Object var4 = var2.field1795.get(var3);// 28
         var3++;
         ((Class548)var4).method1718(var1);// 588
      }
   }// 412

   // $VF: synthetic method
   public Class533(Class128 var1, Class221 var2, boolean var3) {
      this.field1798 = var2;// 18 389
      Class533 var6;
      if (var3) {// 513
         var6 = this;// 151
         this.field1796 = var2.method106(var1.method20());
      } else {
         var6 = this;// 295
         this.field1796 = var1.method17();
      }

      var6.field1797 = var1.method101();// 273
      this.field1795 = this.method1586(var1.method104(), var2, var3);// 161
   }// 141

   // $VF: synthetic method
   public void method1588(boolean var1) {
      this.field1797 = var1;// 137
   }// 50

   // $VF: synthetic method
   public Class533(Class144 var1, List var2, boolean var3, Class221 var4) {
      this.field1798 = var4;// 33
      this.field1796 = var4.method106(var1.method20());// 0
      this.field1795 = var2;// 240
      this.field1797 = var3;// 246 400
   }// 552

   // $VF: synthetic method
   public final String method1589() {
      return ((Class191)this.field1798.method174(this.field1796)).method20();// 5 450
   }

   // $VF: synthetic method
   public final String method1590() {
      return this.method1589();// 24
   }

   // $VF: synthetic method
   public int method1591() {
      return this.field1796;// 160
   }

   // $VF: synthetic method
   public static Class533 method1592(DataInputStream var0, Class221 var1, boolean var2) {
      DataInputStream var3 = var0;
      Class533 var7;
      (var7 = new Class533(var1)).field1796 = var0.readUnsignedShort();// 68 485
      int var4 = var0.readUnsignedShort();// 59

      int var5;
      for (int var10000 = var5 = 0; var10000 < var4; var10000 = var5) {// 391
         int var6 = var3.readUnsignedShort();// 589
         Class475 var10004 = Class475.method1259(var3, var1);
         var5++;
         var7.method1580(new Class548(var6, var10004, var1));// 579
      }

      var7.method1588(var2);// 415
      return var7;// 398
   }
}
