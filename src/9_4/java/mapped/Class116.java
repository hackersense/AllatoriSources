package mapped;

import smardecSB.bipush;
import smardecSB.ldc;
import smardecSB.ldc2_w;
import smardecSB.sipush;

// $VF: Compiled from uk
public final class Class116 implements Class117, Class111, Class119 {
   // $VF: synthetic field
   public Class10 field20;

   // $VF: synthetic method
   public Class116(Class221 var1, double var2) {
      if (var2 == 0.0) {// 330
         this.field20 = field43;// 589
      } else if (var2 == 1.0) {
         this.field20 = field141;// 555
      } else {
         this.field20 = new ldc2_w(var1.method415(var2));// 415
      }
   }// 73 428 579

   // $VF: synthetic method
   public Class116(Class221 var1, long var2) {
      if (var2 == 0L) {// 567
         this.field20 = field98;// 400
      } else if (var2 == 1L) {
         this.field20 = field50;// 0
      } else {
         this.field20 = new ldc2_w(var1.method407(var2));// 246
      }
   }// 33 240 603

   // $VF: synthetic method
   @Override
   public final Class251 method42() {
      return new Class251(this.field20);// 23
   }

   // $VF: synthetic method
   public Class116(Class221 var1, float var2) {
      if ((double)var2 == 0.0) {// 495
         this.field20 = field25;// 159
      } else if ((double)var2 == 1.0) {
         this.field20 = field138;// 561
      } else if ((double)var2 == 2.0) {
         this.field20 = field144;// 604
      } else {
         this.field20 = new ldc(var1.method411(var2));// 6
      }
   }// 22 377 461 493

   // $VF: synthetic method
   public Class116(Class221 var1, String var2) {
      if (var2 == null) {// 28
         this.field20 = field128;// 588
      } else {
         this.field20 = new ldc(var1.method409(var2));// 412
      }
   }// 257 329

   // $VF: synthetic method
   public Class116(Class221 var1, Number var2) {
      if (var2 instanceof Integer || var2 instanceof Short || var2 instanceof Byte) {// 99
         this.field20 = (new Class116(var1, var2.intValue())).field20;// 160
      } else if (var2 instanceof Double) {
         this.field20 = (new Class116(var1, var2.doubleValue())).field20;// 63
      } else if (var2 instanceof Float) {
         this.field20 = (new Class116(var1, var2.floatValue())).field20;// 550
      } else if (var2 instanceof Long) {
         this.field20 = (new Class116(var1, var2.longValue())).field20;// 456
      } else {
         throw new Class241("What's this: " + var2);// 82
      }
   }// 40 367 510 541

   // $VF: synthetic method
   public Class116(Class221 var1, Character var2) {
      this(var1, var2.charValue());// 27
   }// 242

   // $VF: synthetic method
   public Class116(Class221 var1, int var2) {
      if (var2 >= -1 && var2 <= 5) {// 147
         this.field20 = field54[3 + var2];// 295
      } else if (var2 >= -128 && var2 <= 127) {
         this.field20 = new bipush((byte)var2);// 273
      } else if (var2 >= -32768 && var2 <= 32767) {
         this.field20 = new sipush((short)var2);// 141
      } else {
         this.field20 = new ldc(var1.method143(var2));// 226
      }
   }// 78 161 338 580

   // $VF: synthetic method
   public Class116(Class221 var1, boolean var2) {
      this.field20 = field54[3 + (var2 ? 1 : 0)];// 170 553
   }// 58

   // $VF: synthetic method
   public Class116(Class221 var1, Boolean var2) {
      this(var1, var2.booleanValue());// 31
   }// 21

   // $VF: synthetic method
   public final Class10 method18() {
      return this.field20;// 468
   }
}
