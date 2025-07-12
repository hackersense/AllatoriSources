package mapped;

import smardecSB._instanceof;
import smardecSB.ldc;
import smardecSB.ldc2_w;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// $VF: Compiled from ef
public class Class468 extends Class469 {
   // $VF: synthetic field
   public Map field1528 = new HashMap();
   // $VF: synthetic field
   public List field1529 = new ArrayList();
   // $VF: synthetic field
   public PrintWriter field1530;
   // $VF: synthetic field
   public Class203 field1531;
   // $VF: synthetic field
   public Class221 field1532;

   // $VF: synthetic method
   public boolean method1053(Class10 var1) {
      short var2 = var1.method22();// 232
      if (Opcodes.field54[var2] != null && !(var1 instanceof Class18) && !(var1 instanceof Class12)) {// 463
         this.field1530.println("il.append(InstructionConstants." + var1.method20().toUpperCase(Locale.ENGLISH) + ");");// 424
         return true;// 588
      } else {
         return false;// 412
      }
   }

   // $VF: synthetic method
   @Override
   public void method1054(Class18 var1) {
      this.method1068(var1.method27());// 288
   }// 129

   // $VF: synthetic method
   @Override
   public void method1055(Class27 var1) {
      Class138 var5;
      Class27 var10000;
      if (var1 instanceof Class1) {// 285
         var5 = ((Class1)var1).method1(this.field1532);// 119
         var10000 = var1;
      } else {
         var5 = ((Class294)var1).method26();// 238
         var10000 = var1;// 61
      }

      short var3 = ((Class10)var10000).method22();
      short var4 = 1;// 525
      switch (var3) {// 220
         case 187:
            while (false) {
            }

            this.field1530.println("il.append(_factory.createNew(\"" + ((Class144)var5).method93() + "\"));");// 336
            return;// 291
         case 197:
            var4 = ((Class295)var1).method523();// 169
         case 188:
         case 189:
            if (var5 instanceof Class145) {// 137
               var5 = ((Class145)var5).method26();// 50
            }

            this.field1530.println("il.append(_factory.createNewArray(" + Class461.method1042(var5) + ", (short) " + var4 + "));");// 135
            return;// 443
         default:
            throw new RuntimeException("Oops: " + var3);// 434
      }
   }

   // $VF: synthetic method
   @Override
   public void method1056(Class90 var1) {
      Class468 var3 = this;
      Class247 var8;
      int var6 = (var8 = (Class247)this.field1528.get(var1)).method2();// 355 496
      String var4 = new StringBuilder().insert(0, var1.method20()).append("_").append(var6).toString();// 369
      Class247 var14;
      if (var1 instanceof Class113) {// 215
         Class113 var5 = (Class113)var1;// 511
         this.field1529.add(var1);// 382
         StringBuffer var9 = new StringBuffer("new int[] { ");// 210
         int[] var7 = var5.method41();// 576
         int var2 = 0;

         for (int var10000 = var2; var10000 < var7.length; var10000 = ++var2) {// 103
            var9.append(var7[var2]);// 548
            if (var2 < var7.length - 1) {// 545
               var9.append(", ");// 570
            }
         }

         var9.append(" }");// 282
         this.field1530// 503
            .print(
               new StringBuilder()
                  .insert(0, "Select ")
                  .append(var4)
                  .append(" = new ")
                  .append(var1.method20().toUpperCase(Locale.ENGLISH))
                  .append("(")
                  .append(var9)
                  .append(", new InstructionHandle[] { ")
                  .toString()
            );
         var2 = 0;

         for (int var13 = var2; var13 < var7.length; var13 = ++var2) {// 308
            var3.field1530.print("null");// 596
            if (var2 < var7.length - 1) {// 549
               var3.field1530.print(", ");// 499
            }
         }

         var3.field1530.println(" }, null);");// 390
         var14 = var8;
      } else {
         int var12 = var8.method274().method2();// 520
         String var10;
         Class468 var15;
         if (var6 > var12) {// 188
            var10 = "ih_" + var12;// 172
            var15 = this;
         } else {
            var15 = this;// 48
            this.field1529.add(var1);
            var10 = "null";// 281
         }

         var15.field1530// 592
            .println(
               "    BranchInstruction "
                  + var4
                  + " = _factory.createBranchInstruction("
                  + "Constants."
                  + var1.method20().toUpperCase(Locale.ENGLISH)
                  + ", "
                  + var10
                  + ");"
            );
         var14 = var8;// 125
      }

      if (var14.method101()) {
         var3.field1530.println("    ih_" + var6 + " = il.append(" + var4 + ");");// 413
      } else {
         var3.field1530.println("    il.append(" + var4 + ");");// 478
      }
   }// 320 365

   // $VF: synthetic method
   public void method1057() {
      Class468 var2 = this;

      for (Class90 var6 : this.field1529) {// 41 522
         Class247 var10000 = (Class247)var2.field1528.get(var6);// 551
         int var3 = var10000.method2();// 91
         String var8 = new StringBuilder().insert(0, var6.method20()).append("_").append(var3).toString();// 360
         int var4 = var10000.method274().method2();// 312
         var2.field1530.println("    " + var8 + ".setTarget(ih_" + var4 + ");");// 340
         if (var6 instanceof Class113) {// 274
            Class246[] var7 = ((Class113)var6).method39();// 558

            int var1;
            for (int var10 = var1 = 0; var10 < var7.length; var10 = var1) {// 501
               var4 = var7[var1].method2();// 337
               PrintWriter var11 = var2.field1530;// 208
               StringBuilder var10001 = new StringBuilder().append("    ").append(var8).append(".setTarget(").append(var1).append(", ih_").append(var4);
               var1++;
               var11.println(var10001.append(");").toString());
            }
         }
      }
   }// 65

   // $VF: synthetic method
   @Override
   public void method1058(Class288 var1) {
      short var7 = var1.method22();
      String var2 = var1.method521(this.field1532);// 25 464
      String var3 = var1.method12(this.field1532);// 31
      Class138 var4 = var1.method14(this.field1532);// 21
      Class138[] var5 = var1.method519(this.field1532);// 115
      this.field1530// 223
         .println(
            "il.append(_factory.createInvoke(\""
               + var2
               + "\", \""
               + var3
               + "\", "
               + Class461.method1042(var4)
               + ", "
               + Class461.method1043(var5)
               + ", "
               + "Constants."
               + Class125.field386[var7].toUpperCase(Locale.ENGLISH)
               + "));"
         );
   }// 248

   // $VF: synthetic method
   @Override
   public void method1059(Class279 var1) {
      this.field1530.println("il.append(new RET(" + var1.method2() + ")));");// 532
   }// 297

   // $VF: synthetic method
   @Override
   public void method1060(Class2 var1) {
      Class138 var3 = var1.method1(this.field1532);// 486
      this.field1530.println("il.append(_factory.createCheckCast(" + Class461.method1042(var3) + "));");// 117
   }// 300

   // $VF: synthetic method
   @Override
   public void method1061 (ldc var1) {
      this.method1068(var1.method522(this.field1532));// 177
   }// 266

   // $VF: synthetic method
   @Override
   public void method1062 (_instanceof var1) {
      Class138 var3 = var1.method1(this.field1532);// 110
      this.field1530.println("il.append(new INSTANCEOF(_cp.addClass(" + Class461.method1042(var3) + ")));");// 221
   }// 444

   // $VF: synthetic method
   @Override
   public void method1063(Class5 var1) {
      short var6 = var1.method22();
      String var2 = var1.method521(this.field1532);// 24 286
      String var3 = var1.method12(this.field1532);// 600
      Class138 var4 = var1.method14(this.field1532);// 108
      this.field1530// 27
         .println(
            "il.append(_factory.createFieldAccess(\""
               + var2
               + "\", \""
               + var3
               + "\", "
               + Class461.method1042(var4)
               + ", "
               + "Constants."
               + Class125.field386[var6].toUpperCase(Locale.ENGLISH)
               + "));"
         );
   }// 209

   // $VF: synthetic method
   @Override
   public void method1064(Class277 var1) {
      short var4 = var1.method22();
      Class138 var3 = var1.method1(this.field1532);// 148 236
      if (var4 == 132) {// 142
         this.field1530.println("il.append(new IINC(" + var1.method2() + ", " + ((Class286)var1).method30() + "));");// 39
      } else {
         String var5 = var4 < 54 ? "Load" : "Store";// 160
         this.field1530.println("il.append(_factory.create" + var5 + "(" + Class461.method1042(var3) + ", " + var1.method2() + "));");// 40
      }
   }// 99 550

   // $VF: synthetic method
   @Override
   public void method1065 (ldc2_w var1) {
      this.method1068(var1.method526(this.field1532));// 516
   }// 95

   // $VF: synthetic method
   @Override
   public void method1066(Class12 var1) {
      Class138 var3 = var1.method1(this.field1532);// 417
      this.field1530.println("il.append(_factory.createReturn(" + Class461.method1042(var3) + "));");// 81
   }// 401

   // $VF: synthetic method
   public Class468(Class203 var1, PrintWriter var2) {
      this.field1531 = var1;// 6
      this.field1532 = var1.method46();// 144
      this.field1530 = var2;// 22 461
   }// 358

   // $VF: synthetic method
   public void method1067() {
      Class468 var1 = this;
      if (!this.field1531.method261() && !this.field1531.method246()) {// 146
         for (Class246 var10000 = var3 = this.field1531.method42().method32(); var10000 != null; var10000 = var3 = var3.method32()) {// 567
            Class10 var2;
            if ((var2 = var3.method18()) instanceof Class90) {// 0 33
               var1.field1528.put(var2, var3);// 240
            }

            Class468 var4;
            if (var3.method101()) {// 552
               if (var2 instanceof Class90) {// 603
                  var4 = var1;// 278
                  var1.field1530.println("    InstructionHandle ih_" + var3.method2() + ";");
               } else {
                  var4 = var1;// 467
                  var1.field1530.print("    InstructionHandle ih_" + var3.method2() + " = ");
               }
            } else {
               var4 = var1;// 59
               var1.field1530.print("    ");
            }

            if (!var4.method1053(var2)) {// 330
               var2.method10(var1);// 589
            }
         }

         var1.method1057();// 73
         var1.method1070();// 415
      }
   }// 428

   // $VF: synthetic method
   public void method1068(Object var1) {
      String var3 = var1.toString();// 66
      Class468 var10000;
      if (var1 instanceof String) {// 536
         var3 = '"' + Class523.method1513(var1.toString()) + '"';// 307
         var10000 = this;
      } else {
         if (var1 instanceof Character) {// 218
            var3 = "(char)0x" + Integer.toHexString((Character)var1);// 109
         }

         var10000 = this;// 15
      }

      var10000.field1530.println("il.append(new PUSH(_cp, " + var3 + "));");
   }// 385

   // $VF: synthetic method
   @Override
   public void method1069(Class33 var1) {
      short var4 = var1.method22();
      Class138 var2 = var1.method1(this.field1532);// 82 83
      String var5 = var4 < 79 ? "Load" : "Store";// 5
      this.field1530.println("il.append(_factory.createArray" + var5 + "(" + Class461.method1042(var2) + "));");// 279
   }// 386

   // $VF: synthetic method
   public void method1070() {
      Class468 var3 = this;
      Class202[] var1 = this.field1531.method282();// 544

      int var2;
      for (int var10000 = var2 = 0; var10000 < var1.length; var10000 = var2) {// 114
         Class202 var5;
         String var4 = (var5 = var1[var2]).method138() == null ? "null" : Class461.method1042(var5.method138());// 102 460
         PrintWriter var6 = var3.field1530;// 183
         StringBuilder var10001 = new StringBuilder()
            .append("    method.addExceptionHandler(ih_")
            .append(var5.method32().method2())
            .append(", ")
            .append("ih_")
            .append(var5.method37().method2())
            .append(", ")
            .append("ih_")
            .append(var5.method274().method2())
            .append(", ")
            .append(var4);
         var2++;
         var6.println(var10001.append(");").toString());
      }
   }// 249
}
