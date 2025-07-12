package mapped;

import smardecSB._instanceof;
import smardecSB.aload_x;
import smardecSB.astore_x;
import smardecSB.dload_x;
import smardecSB.dstore_x;
import smardecSB.fload_x;
import smardecSB.fstore_x;
import smardecSB.getfield;
import smardecSB.if_acmpne;
import smardecSB.if_icmple;
import smardecSB.if_icmpne;
import smardecSB.ifgt;
import smardecSB.ifle;
import smardecSB.ifnull;
import smardecSB.iload_x;
import smardecSB.istore_x;
import smardecSB.jsr_w;
import smardecSB.lload_x;
import smardecSB.lstore_x;

import java.io.Serializable;

// $VF: Compiled from mk
public class Class120 implements Opcodes, Serializable {
   // $VF: synthetic field
   public static Class347[] field147 = new Class347[]{
      new Class347("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field593}, 1),
      new Class347("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field583}, 1),
      null,
      null,
      new Class347("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field584}, 1),
      new Class347("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field585}, 1),
      new Class347("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field575}, 1),
      new Class347("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field576}, 1),
      new Class347("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field591}, 1),
      new Class347("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field591}, 1),
      new Class347("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field591}, 1),
      new Class347("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field578}, 1)
   };
   // $VF: synthetic field
   public Class206 field148;
   // $VF: synthetic field
   // This field contains java descriptor
   public static final String[] known_descriptor = new String[]{"C", "F", "D", "B", "S", "I", "L"};
   // $VF: synthetic field
   public Class221 field150;

   // $VF: synthetic method
   public static Class33 method45(Class138 var0) {
      switch (var0.method142()) {// 489
         case 4:
         case 8:
            return field32;// 247
         case 5:
            return castore;// 194
         case 6:
            return field139;// 531
         case 7:
            return field76;// 104
         case 9:
            return field37;// 163
         case 10:
            return field132;// 243
         case 11:
            return field80;// 309
         case 12:
         default:
            throw new RuntimeException("Invalid type " + var0);// 449
         case 13:
         case 14:
            return field83;// 344
      }
   }

   // $VF: synthetic method
   public Class221 method46() {
      return this.field150;// 765
   }

   // $VF: synthetic method
   public Class288 method47(String var1, String var2, Class138 var3, Class138[] var4, short var5) {
      int var6 = 0;// 6
      String var7 = Class138.method148(var3, var4);// 144

      int var8;
      for (int var12 = var8 = 0; var12 < var4.length; var12 = var8) {// 461
         Class138 var10001 = var4[var8];// 358
         var8++;
         var6 += var10001.method2();
      }

      int var10;
      short var13;
      if (var5 == 185) {// 574
         var10 = this.field150.method410(var1, var2, var7);// 272
         var13 = var5;
      } else {
         var10 = this.field150.method408(var1, var2, var7);// 179
         var13 = var5;// 567
      }

      switch (var13) {
         case 182:
            return new Class292(var10);// 240
         case 183:
            return new Class289(var10);// 33
         case 184:
            return new Class291(var10);// 552
         case 185:
            return new Class290(var10, var6 + 1);// 278
         default:
            throw new RuntimeException("Oops: Unknown invoke kind:" + var5);// 467
      }
   }

   // $VF: synthetic method
   public _instanceof method48 (Class137 var1) {
      return var1 instanceof Class145 ? new _instanceof(this.field150.method396((Class145)var1)) : new _instanceof(this.field150.method390((Class144)var1));// 605 752 847
   }

   // $VF: synthetic method
   public Class5 method49(String var1, String var2, Class138 var3, short var4) {
      String var8 = var3.method20();// 300
      int var6 = this.field150.method398(var1, var2, var8);// 245
      switch (var4) {// 296
         case 178:
            return new Class6(var6);// 556
         case 179:
            return new Class267(var6);// 207
         case 180:
            return new getfield(var6);// 417
         case 181:
            return new Class287(var6);// 401
         default:
            throw new RuntimeException("Oops: Unknown getfield kind:" + var4);// 127
      }
   }

   // $VF: synthetic method
   public Class267 method50(String var1, String var2, Class138 var3) {
      return new Class267(this.field150.method398(var1, var2, var3.method20()));// 70
   }

   // $VF: synthetic method
   public Class287 method51(String var1, String var2, Class138 var3) {
      return new Class287(this.field150.method398(var1, var2, var3.method20()));// 277
   }

   // $VF: synthetic method
   public static Class9 method52(int var0) {
      return var0 == 2 ? pop2 : pop;// 231
   }

   // $VF: synthetic method
   public static Class9 method53(int var0) {
      return var0 == 2 ? field91 : dup;// 376
   }

   // $VF: synthetic method
   public static final Class51 method54(char var0, String var1) {
      switch (var0) {// 283
         case '%':
            return field117;// 183
         case '&':
            return field72;// 196
         case '*':
            return field142;// 64
         case '+':
            return field119;// 102
         case '-':
            return field41;// 114
         case '/':
            return field114;// 249
         case '<':
            return field42;// 599
         case '>':
            if (var1.equals(">>>")) {// 88
               return field150;
            }

            return field115;
         case '^':
            return field57;// 89
         case '|':
            return field44;// 554
         default:
            throw new RuntimeException("Invalid operand " + var1);// 384
      }
   }

   // $VF: synthetic method
   public Class120(Class206 var1) {
      this(var1, var1.method46());// 78
   }// 418

   // $VF: synthetic method
   public static Class12 method55(Class138 var0) {
      switch (var0.method142()) {// 282
         case 4:
         case 5:
         case 8:
         case 9:
         case 10:
            return field81;// 390
         case 6:
            return field47;// 520
         case 7:
            return known_descriptor;// 188
         case 11:
            return field49;// 564
         case 12:
            return field66;// 281
         case 13:
         case 14:
            return field100;// 308
         default:
            throw new RuntimeException("Invalid type: " + var0);// 592
      }
   }

   // $VF: synthetic method
   public static Class9 method56(int var0) {
      return var0 == 2 ? field136 : dup_x2;// 421
   }

   // $VF: synthetic method
   public static Class9 method57(int var0) {
      return var0 == 2 ? field121 : dup_x1;// 264
   }

   // $VF: synthetic method
   public Class28 method58(String var1) {
      return this.method74(new Class144(var1));// 609
   }

   // $VF: synthetic method
   public void method59(Class221 var1) {
      this.field150 = var1;// 824
   }// 858

   // $VF: synthetic method
   public Class120(Class221 var1) {
      this(null, var1);// 170
   }// 553

   // $VF: synthetic method
   public static final Class51 method60(char var0, String var1) {
      switch (var0) {// 320
         case '%':
            return field38;// 225
         case '&':
            return field89;// 522
         case '*':
            return field69;// 297
         case '+':
            return field70;// 366
         case '-':
            return isub;// 212
         case '/':
            return field135;// 11
         case '<':
            return field96;// 340
         case '>':
            if (var1.equals(">>>")) {// 558
               return field95;
            }

            return field133;
         case '^':
            return field112;// 360
         case '|':
            return field33;// 551
         default:
            throw new RuntimeException("Invalid operand " + var1);// 168
      }
   }

   // $VF: synthetic method
   public Class288 method61(Class347 var1, short var2) {
      return this.method47(var1.field1009, var1.field1012, var1.field1011, var1.field1010, var2);// 69
   }

   // $VF: synthetic method
   public static final boolean method62(Class138 var0) {
      return var0 instanceof Class144 && ((Class144)var0).method93().equals("java.lang.String");// 292
   }

   // $VF: synthetic method
   public Class10 method63(Class138 var1) {
      byte var3 = var1.method142();// 536
      if (method62(var1)) {// 307
         return this.method61(field147[0], (short)182);// 218
      } else {
         switch (var3) {// 213
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:

               return this.method61(field147[var3], (short)182);// 280
            case 12:
            default:
               throw new RuntimeException("Oops: No append for this type? " + var1);// 55
            case 13:
            case 14:
               return this.method61(field147[1], (short)182);// 95
         }
      }
   }

   // $VF: synthetic method
   public static Class10 method18() {
      return new aload_x(0);// 576
   }

   // $VF: synthetic method
   public Class2 method64(Class137 var1) {
      return var1 instanceof Class145 ? new Class2(this.field150.method396((Class145)var1)) : new Class2(this.field150.method390((Class144)var1));// 79 165 189
   }

   // $VF: synthetic method
   public static final Class51 method65(char var0) {
      switch (var0) {// 35
         case '*':
            return field131;// 182
         case '+':
            return field94;// 357
         case ',':
         case '.':
         default:
            throw new RuntimeException("Invalid operand " + var0);// 346
         case '-':
            return field29;// 271
         case '/':
            return field51;// 122
      }
   }

   // $VF: synthetic method
   public static Class33 method66(Class138 var0) {
      switch (var0.method142()) {// 187
         case 4:
         case 8:
            return field140;// 594
         case 5:
            return field110;// 388
         case 6:
            return field62;// 42
         case 7:
            return field45;// 529
         case 9:
            return field64;// 487
         case 10:
            return field88;// 347
         case 11:
            return field63;// 569
         case 12:
         default:
            throw new RuntimeException("Invalid type " + var0);// 383
         case 13:
         case 14:
            return aaload;// 327
      }
   }

   // $VF: synthetic method
   public Class120(Class206 var1, Class221 var2) {
      this.field148 = var1;// 295
      this.field150 = var2;// 147 338
   }// 273

   // $VF: synthetic method
   public Class10 method67(Class138 var1, short var2) {
      if (var2 == 1) {// 968
         if (var1 instanceof Class144) {// 936
            return new Class26(this.field150.method390((Class144)var1));// 670
         } else {
            return (Class10)(var1 instanceof Class145 ? new Class26(this.field150.method396((Class145)var1)) : new Class294(((Class142)var1).method142()));// 691 788 899
         }
      } else {
         Class145 var3;
         if (var1 instanceof Class145) {// 902
            var3 = (Class145)var1;// 608
         } else {
            var3 = new Class145(var1, var2);// 960
         }

         return new Class295(this.field150.method396(var3), var2);// 914
      }
   }

   // $VF: synthetic method
   public void method68(Class206 var1) {
      this.field148 = var1;// 800
   }// 828

   // $VF: synthetic method
   public Class251 method69(String var1) {
      Class251 var5 = new Class251();// 415
      int var3 = this.field150.method398("java.lang.System", "out", "Ljava/io/PrintStream;");// 398
      int var4 = this.field150.method408("java.io.PrintStream", "println", "(Ljava/lang/String;)V");// 428
      var5.method451(new Class6(var3));// 87
      var5.method484(new Class116(this.field150, var1));// 586
      var5.method451(new Class292(var4));// 399
      return var5;// 232
   }

   // $VF: synthetic method
   public getfield method70 (String var1, String var2, Class138 var3) {
      return new getfield(this.field150.method398(var1, var2, var3.method20()));// 158
   }

   // $VF: synthetic method
   public Class10 method71(Object var1) {
      Class116 var5;
      if (var1 instanceof Number) {// 257
         var5 = new Class116(this.field150, (Number)var1);// 269
      } else if (var1 instanceof String) {// 455
         var5 = new Class116(this.field150, (String)var1);// 148
      } else if (var1 instanceof Boolean) {// 236
         var5 = new Class116(this.field150, (Boolean)var1);// 142
      } else {
         if (!(var1 instanceof Character)) {// 39
            throw new Class241("Illegal type: " + var1.getClass());// 160
         }

         var5 = new Class116(this.field150, (Character)var1);// 368
      }

      return var5.method18();// 63
   }

   // $VF: synthetic method
   public static final Class51 method72(char var0) {
      switch (var0) {// 284
         case '*':
            while (false) {
            }

            return field93;// 524
         case '+':
            return field53;// 517
         case ',':
         case '.':
         default:
            throw new RuntimeException("Invalid operand " + var0);// 563
         case '-':
            return field99;// 234
         case '/':
            return field137;// 585
      }
   }

   // $VF: synthetic method
   public static Class90 method73(short var0, Class246 var1) {
      switch (var0) {// 768
         case 153:
            return new Class103(var1);// 688
         case 154:
            return new Class104(var1);// 655
         case 155:
            return new Class101(var1);// 863
         case 156:
            return new Class107(var1);// 647
         case 157:
            return new ifgt(var1);// 671
         case 158:
            return new ifle(var1);// 750
         case 159:
            return new Class106(var1);// 787
         case 160:
            return new if_icmpne(var1);// 782
         case 161:
            return new Class105(var1);// 929
         case 162:
            return new Class93(var1);// 836
         case 163:
            return new Class102(var1);// 610
         case 164:
            return new if_icmple(var1);// 639
         case 165:
            return new Class100(var1);// 822
         case 166:
            return new if_acmpne(var1);// 959
         case 167:
            return new Class112(var1);// 843
         case 168:
            return new Class110(var1);// 687
         case 169:
         case 170:
         case 171:
         case 172:
         case 173:
         case 174:
         case 175:
         case 176:
         case 177:
         case 178:
         case 179:
         case 180:
         case 181:
         case 182:
         case 183:
         case 184:
         case 185:
         case 186:
         case 187:
         case 188:
         case 189:
         case 190:
         case 191:
         case 192:
         case 193:
         case 194:
         case 195:
         case 196:
         case 197:
         default:
            throw new RuntimeException("Invalid opcode: " + var0);// 715
         case 198:
            return new ifnull(var1);// 666
         case 199:
            return new Class92(var1);// 730
         case 200:
            return new Class260(var1);// 625
         case 201:
            return new jsr_w(var1);// 802
      }
   }

   // $VF: synthetic method
   public Class28 method74(Class144 var1) {
      return new Class28(this.field150.method390(var1));// 689
   }

   // $VF: synthetic method
   public static Class277 method75(Class138 var0, int var1) {
      switch (var0.method142()) {// 56
         case 4:
         case 5:
         case 8:
         case 9:
         case 10:
            return new istore_x(var1);// 475
         case 6:
            return new fstore_x(var1);// 202
         case 7:
            return new dstore_x(var1);// 128
         case 11:
            return new lstore_x(var1);// 199
         case 12:
         default:
            throw new RuntimeException("Invalid type " + var0);// 171
         case 13:
         case 14:
            return new astore_x(var1);// 92
      }
   }

   // $VF: synthetic method
   public Class206 method76() {
      return this.field148;// 702
   }

   // $VF: synthetic method
   public static Class277 method77(Class138 var0, int var1) {
      switch (var0.method142()) {// 16
         case 4:
         case 5:
         case 8:
         case 9:
         case 10:
            return new iload_x(var1);// 387
         case 6:
            return new fload_x(var1);// 261
         case 7:
            return new dload_x(var1);// 206
         case 11:
            return new lload_x(var1);// 156
         case 12:
         default:
            throw new RuntimeException("Invalid type " + var0);// 276
         case 13:
         case 14:
            return new aload_x(var1);// 186
      }
   }

   // $VF: synthetic method
   public static Class51 method78(String var0, Class138 var1) {
      char var3 = var0.toCharArray()[0];// 71
      switch (var1.method142()) {// 375
         case 5:
         case 8:
         case 9:
         case 10:

            return method60(var3, var0);// 303
         case 6:
            return method65(var3);// 521
         case 7:
            return method72(var3);// 546
         case 11:
            return method54(var3, var0);// 29
         default:
            throw new RuntimeException("Invalid type " + var1);// 51
      }
   }

   // $VF: synthetic method
   public Class10 method79(Class138 var1, Class138 var2) {
      if (var1 instanceof Class142 && var2 instanceof Class142) {// 75
         byte var4 = var2.method142();// 372
         byte var6 = var1.method142();// 111
         if (var4 == 11 && (var6 == 5 || var6 == 8 || var6 == 9)) {// 587
            var6 = 10;// 153
         }

         String var8 = "org.apache.bcel.generic." + known_descriptor[var6 - 5] + "2" + known_descriptor[var4 - 5];// 53
         Object var7 = null;// 200

         try {
            return (Class10)Class.forName(var8).newInstance();// 230 267
         } catch (Exception var5) {
            throw new RuntimeException("Could not find instruction: " + var8);// 419
         }
      } else if (!(var1 instanceof Class137) || !(var2 instanceof Class137)) {// 515
         throw new RuntimeException("Can not cast " + var1 + " to " + var2);// 322
      } else {
         return var2 instanceof Class145// 112
            ? new Class2(this.field150.method396((Class145)var2))// 395
            : new Class2(this.field150.method404(((Class144)var2).method93()));// 535
      }
   }

   // $VF: synthetic method
   public static Class10 method80(Class138 var0) {
      switch (var0.method142()) {// 801
         case 4:
         case 5:
         case 8:
         case 9:
         case 10:
            return field78;// 829
         case 6:
            return field25;// 675
         case 7:
            return field43;// 690
         case 11:
            return field98;// 619
         case 12:
            return field39;// 816
         case 13:
         case 14:
            return field128;// 923
         default:
            throw new RuntimeException("Invalid type: " + var0);// 755
      }
   }

   // $VF: synthetic method
   public Class6 method81(String var1, String var2, Class138 var3) {
      return new Class6(this.field150.method398(var1, var2, var3.method20()));// 96
   }
}
