package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

// $VF: Compiled from si
public final class Class124 implements Class125, Cloneable, Class123, Serializable {
   // $VF: synthetic field
   public int field157;
   // $VF: synthetic field
   public int field158;
   // $VF: synthetic field
   public int field159;
   // $VF: synthetic field
   public int field160;
   // $VF: synthetic field
   public Class149 field161;
   // $VF: synthetic field
   public int field162;

   // $VF: synthetic method
   public Class124(DataInputStream var1, Class149 var2) {
      this(var1.readUnsignedShort(), var1.readUnsignedShort(), var1.readUnsignedShort(), var1.readUnsignedShort(), var1.readUnsignedShort(), var2);// 315
   }// 132

   // $VF: synthetic method
   public final void method91(int var1) {
      this.field162 = var1;// 66
   }// 536

   // $VF: synthetic method
   public final int method92() {
      return this.field162;// 470
   }

   // $VF: synthetic method
   public final void method85(int var1) {
      this.field159 = var1;// 516
   }// 95

   // $VF: synthetic method
   public Class124(int var1, int var2, int var3, int var4, int var5, Class149 var6) {
      this.field157 = var1;// 461
      this.field158 = var2;// 358
      this.field162 = var3;// 192
      this.field160 = var4;// 574
      this.field159 = var5;// 272
      this.field161 = var6;// 144 321
   }// 179

   // $VF: synthetic method
   public final String method93() {
      return ((Class191)this.field161.method171(this.field162, (byte)1)).method20();// 456 510
   }

   // $VF: synthetic method
   public final int method84() {
      return this.field157;// 525
   }

   // $VF: synthetic method
   public final int method30() {
      return this.field159;// 468
   }

   // $VF: synthetic method
   public final String method20() {
      return ((Class191)this.field161.method171(this.field160, (byte)1)).method20();// 94 209
   }

   // $VF: synthetic method
   public final void method89(int var1) {
      this.field157 = var1;// 107
   }// 437

   // $VF: synthetic method
   public final void method90(int var1) {
      this.field160 = var1;// 471
   }// 270

   // $VF: synthetic method
   public final Class149 method94() {
      return this.field161;// 329
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1027(this);// 466
   }// 467

   // $VF: synthetic method
   public Class124 method95() {
      try {
         return (Class124)this.clone();// 316
      } catch (CloneNotSupportedException var1) {
         return null;// 127
      }
   }

   // $VF: synthetic method
   public final void method6(int var1) {
      this.field158 = var1;// 443
   }// 166

   // $VF: synthetic method
   public final void method96(Class149 var1) {
      this.field161 = var1;// 216
   }// 299

   // $VF: synthetic method
   public final int method17() {
      return this.field158;// 142
   }

   // $VF: synthetic method
   public final int method2() {
      return this.field160;// 115
   }

   // $VF: synthetic method
   public final void method3(DataOutputStream var1) {
      var1.writeShort(this.field157);
      var1.writeShort(this.field158);// 398
      var1.writeShort(this.field162);// 428
      var1.writeShort(this.field160);// 87
      var1.writeShort(this.field159);// 415 586
   }// 399

   // $VF: synthetic method
   public Class124(Class124 var1) {
      this(var1.method84(), var1.method17(), var1.method92(), var1.method2(), var1.method30(), var1.method94());// 78
   }// 533
}
