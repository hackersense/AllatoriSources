package mapped;

import smardecSB._instanceof;
import smardecSB.aload_x;
import smardecSB.astore_x;
import smardecSB.dload_x;
import smardecSB.dstore_x;
import smardecSB.fload_x;
import smardecSB.fstore_x;
import smardecSB.iload_x;
import smardecSB.istore_x;
import smardecSB.ldc;
import smardecSB.ldc2_w;
import smardecSB.lload_x;
import smardecSB.lstore_x;

// $VF: Compiled from qc
public class Class473 extends Class469 {
   // $VF: synthetic field
   public Class221 field1539;
   // $VF: synthetic field
   public final Class133 field1540;

   // $VF: synthetic method
   @Override
   public void method1063(Class5 var1) {
      Class473 var2 = this;

      try {
         var2.method1252(var1, var1.method2());// 195
         Class178 var5;
         if (!((var5 = var2.field1539.method174(var1.method2())) instanceof Class190)) {// 490 577
            var2.method1245(var1, "Indexing a constant that's not a CONSTANT_Fieldref but a '" + var5 + "'.");// 481
         }

         String var7 = var1.method12(var2.field1539);// 372
         Class205 var4;
         Class207[] var13 = (var4 = Class411.method790(var1.method525(var2.field1539).method93())).method346();// 304 587
         Class207 var6 = null;// 153
         int var3;
         int var10000 = var3 = 0;

         while (true) {
            if (var10000 >= var13.length) {
               var21 = var6;// 43
               break;
            }

            if (var13[var3].method190().equals(var7)) {// 53
               Class138 var8 = Class138.method151(var13[var3].method20());// 584
               Class138 var9 = var1.method1(var2.field1539);// 200
               if (var8.equals(var9)) {// 419
                  var21 = var6 = var13[var3];// 230
                  break;// 402
               }
            }

            var10000 = ++var3;// 477
         }

         if (var21 != null) {
            Class138 var16 = Class138.method151(var6.method20());// 597
            Class138 var19 = var1.method1(var2.field1539);// 118
         } else {
            Class205[] var15 = var4.method351();// 535
            int var18;
            var10000 = var18 = 0;

            label57:
            while (true) {
               if (var10000 < var15.length) {
                  Class207[] var14 = var15[var18].method346();// 322
                  int var20;
                  var10000 = var20 = 0;

                  while (true) {
                     if (var10000 >= var14.length) {
                        var10000 = ++var18;// 54
                        continue label57;
                     }

                     if (var14[var20].method190().equals(var7)) {// 317
                        Class138 var10 = Class138.method151(var14[var20].method20());// 241
                        Class138 var11 = var1.method1(var2.field1539);// 526
                        if (var10.equals(var11)) {// 136
                           if (((var6 = var14[var20]).method17() & 5) == 0) {// 90 158
                              var24 = var6 = null;// 294
                              break label57;// 342
                           }
                           break;
                        }
                     }

                     var10000 = ++var20;// 74
                  }
               }

               var24 = var6;// 313
               break;
            }

            if (var24 == null) {
               var2.method1245(var1, "Referenced field '" + var7 + "' does not exist in class '" + var4.method93() + "'.");// 277
            }
         }
      } catch (ClassNotFoundException var12) {// 154
         throw new Class242("Missing class: " + var12.toString());// 752
      }
   }// 459 847 958

   // $VF: synthetic method
   @Override
   public void method1065 (ldc2_w var1) {
      ldc2_w var4 = var1;
      Class473 var5 = this;
      this.method1252(var1, var1.method2());// 397
      Class178 var2;
      if (!((var2 = this.field1539.method174(var1.method2())) instanceof Class183) && !(var2 instanceof Class179)) {// 9 163
         this.method1245(var1, "Operand of LDC2_W must be CONSTANT_Long or CONSTANT_Double, but is '" + var2 + "'.");// 566
      }

      try {
         var5.method1252(var4, var4.method2() + 1);// 104
      } catch (Class231 var3) {
         throw new Class242("OOPS: Does not BCEL handle that? LDC2_W operand has a problem.");// 430
      }
   }// 442

   // $VF: synthetic method
   @Override
   public void method1133(Class26 var1) {
      this.method1252(var1, var1.method2());// 650
      Class178 var2;
      if (!((var2 = this.field1539.method174(var1.method2())) instanceof Class182)) {// 746 747
         this.method1245(var1, "Expecting a CONSTANT_Class operand, but found a '" + var2 + "'.");// 882
      }

      Class138 var5;
      if ((var5 = var1.method1(this.field1539)) instanceof Class145 && ((Class145)var5).method17() >= 255) {// 629 673 891 948
         this.method1245(var1, "Not allowed to create an array with more than 255 dimensions.");// 834
      }
   }// 759

   // $VF: synthetic method
   @Override
   public void method1113(Class292 var1) {
      Class292 var8 = var1;
      Class473 var9 = this;

      try {
         Class205 var4;
         Class208[] var3 = (var4 = Class411.method790(var8.method521(var9.field1539))).method341();// 1064 1470 1541
         Object var5 = null;// 1439
         int var2;
         int var11 = var2 = 0;

         while (true) {
            if (var11 >= var3.length) {
               var12 = (Class208)var5;// 1493
               break;
            }

            if (var3[var2].method190().equals(var8.method12(var9.field1539))// 1154
               && Class138.method150(var3[var2].method20()).equals(var8.method14(var9.field1539))
               && var9.method1250(Class138.method146(var3[var2].method20()), var8.method519(var9.field1539))) {
               var12 = (Class208)(var5 = var3[var2]);// 1320
               break;// 1625
            }

            var11 = ++var2;// 1437
         }

         if (var12 == null) {
            var9.method1245(
               var8,
               "Referenced method '"// 1591
                  + var8.method12(var9.field1539)
                  + "' with expected signature '"
                  + var8.method518(var9.field1539)
                  + "' not found in class '"
                  + var4.method93()
                  + "'. The native verifier does allow the method to be declared in some superclass or implemented interface, which the Java Virtual Machine Specification, Second Edition does not."
            );
         }

         if (!var4.method329()) {// 1201
            var9.method1245(var8, "Referenced class '" + var4.method93() + "' is an interface, but not a class as expected.");// 1575
         }
      } catch (ClassNotFoundException var7) {// 1316
         throw new Class242("Missing class: " + var7.toString());// 1530
      }
   }// 1016 1258

   // $VF: synthetic method
   @Override
   public void method1080(Class267 var1) {
      Class473 var2 = this;

      try {
         String var5 = var1.method12(var2.field1539);// 973
         Class205 var6;
         Class207[] var4 = (var6 = Class411.method790(var1.method525(var2.field1539).method93())).method346();// 657 916
         Class207 var8 = null;// 621
         int var3;
         int var10000 = var3 = 0;

         while (true) {
            if (var10000 >= var4.length) {
               var10 = var8;// 925
               break;
            }

            if (var4[var3].method190().equals(var5)) {// 893
               var10 = var8 = var4[var3];// 917
               break;// 680
            }

            var10000 = ++var3;// 709
         }

         if (var10 == null) {
            throw new Class242("Field not found?!?");// 783
         } else {
            if (var8.method242() && !Class133.method134(var2.field1540).method1913().equals(var1.method525(var2.field1539).method93())) {// 840 937
               var2.method1245(
                  var1,// 969
                  "Referenced field '"
                     + var8
                     + "' is final and must therefore be declared in the current class '"
                     + Class133.method134(var2.field1540).method1913()
                     + "' which is not the case: it is declared in '"
                     + var1.method525(var2.field1539).method93()
                     + "'."
               );
            }

            if (!var8.method254()) {// 1292
               var2.method1245(var1, "Referenced field '" + var8 + "' is not static which it should be.");// 1199
            }

            String var9 = Class411.method790(Class133.method134(var2.field1540).method1913()).method341()[Class133.method133(var2.field1540)].method190();// 1209
            if (!var6.method329() && !var9.equals("<clinit>")) {// 1627
               var2.method1245(var1, "Interface field '" + var8 + "' must be set in a '" + "<clinit>" + "' method.");// 1283
            }
         }
      } catch (ClassNotFoundException var7) {// 1483
         throw new Class242("Missing class: " + var7.toString());// 1558
      }
   }// 1196 1217

   // $VF: synthetic method
   @Override
   public void method1090(Class289 var1) {
      Class289 var9 = var1;
      Class473 var10 = this;

      try {
         Class205 var4;
         Class208[] var3 = (var4 = Class411.method790(var9.method521(var10.field1539))).method341();// 1259 1593 1679
         Object var5 = null;// 1582
         int var2;
         int var16 = var2 = 0;

         while (true) {
            if (var16 >= var3.length) {
               var17 = (Class208)var5;// 1028
               break;
            }

            if (var3[var2].method190().equals(var9.method12(var10.field1539))// 1025
               && Class138.method150(var3[var2].method20()).equals(var9.method14(var10.field1539))
               && var10.method1250(Class138.method146(var3[var2].method20()), var9.method519(var10.field1539))) {
               var17 = (Class208)(var5 = var3[var2]);// 1084
               break;// 1136
            }

            var16 = ++var2;// 1400
         }

         if (var17 == null) {
            var10.method1245(
               var9,
               "Referenced method '"// 1643
                  + var9.method12(var10.field1539)
                  + "' with expected signature '"
                  + var9.method518(var10.field1539)
                  + "' not found in class '"
                  + var4.method93()
                  + "'. The native verifier does allow the method to be declared in some superclass or implemented interface, which the Java Virtual Machine Specification, Second Edition does not."
            );
         }

         Class205 var11;
         if ((var11 = Class411.method790(Class133.method134(var10.field1540).method1913())).method334()// 1149 1561
            && Class411.method787(var11, var4)// 1494
            && !var11.equals(var4)
            && !var9.method12(var10.field1539).equals("<init>")) {// 1633
            int var13 = -1;// 1432
            Class208 var12 = null;// 1222

            while (true) {
               if (var13 == 0) {// 1208
                  var20 = var12;// 1015
                  break;
               }

               var13 = var11.method199();// 1087
               var5 = (var11 = Class411.method790(var11.method20())).method341();// 1397 1659
               int var7;
               var16 = var7 = 0;

               while (true) {
                  if (var16 >= ((Object[])var5).length) {
                     var19 = var12;// 1671
                     break;
                  }

                  if (((Object[])var5)[var7].method190().equals(var9.method12(var10.field1539))// 1004
                     && Class138.method150(((Object[])var5)[var7].method20()).equals(var9.method14(var10.field1539))
                     && var10.method1250(Class138.method146(((Object[])var5)[var7].method20()), var9.method519(var10.field1539))) {
                     var19 = var12 = (Class208)((Object[])var5)[var7];// 1044
                     break;// 1142
                  }

                  var16 = ++var7;// 1234
               }

               if (var19 != null) {
                  var20 = var12;
                  break;// 1227
               }
            }

            if (var20 == null) {
               var10.method1245(// 1188
                  var9,
                  "ACC_SUPER special lookup procedure not successful: method '"
                     + var9.method12(var10.field1539)
                     + "' with proper signature not declared in superclass hierarchy."
               );
               return;// 1401
            }
         }
      } catch (ClassNotFoundException var8) {// 1637
         throw new Class242("Missing class: " + var8.toString());// 1246
      }
   }// 1265

   // $VF: synthetic method
   @Override
   public void method1181 (aload_x var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 856 943
         this.method1245(var1, "Index '" + var4 + "' must be non-negative.");// 830
      } else {
         int var3 = this.method1251() - 1;// 922
         if (var4 > var3) {// 718
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-1 '" + var3 + "'.");// 971
         }
      }
   }// 636 957

   // $VF: synthetic method
   @Override
   public void method1096(Class114 var1) {
      Class473 var2 = this;
      int[] var4 = var1.method41();// 984
      int var3 = -2147483648;// 817

      for (int var10000 = var5 = 0; var10000 < var4.length; var10000 = ++var5) {// 910
         if (var4[var5] == var3 && var5 != 0) {// 967
            var2.method1245(var1, "Match '" + var4[var5] + "' occurs more than once.");// 737
         }

         if (var4[var5] < var3) {// 763
            var2.method1245(var1, "Lookup table must be sorted but isn't.");// 767
         } else {
            var3 = var4[var5];// 792
         }
      }
   }// 940

   // $VF: synthetic method
   @Override
   public void method1062 (_instanceof var1) {
      this.method1252(var1, var1.method2());// 864
      Class178 var2;
      if (!((var2 = this.field1539.method174(var1.method2())) instanceof Class182)) {// 647 950
         this.method1245(var1, "Expecting a CONSTANT_Class operand, but found a '" + var2 + "'.");// 671
      }
   }// 750

   // $VF: synthetic method
   @Override
   public void method1140(Class290 var1) {
      Class290 var8 = var1;
      Class473 var9 = this;

      try {
         Class205 var4;
         Class208[] var3 = (var4 = Class411.method790(var8.method521(var9.field1539))).method341();// 1039 1058 1298
         Object var5 = null;// 990
         int var2;
         int var11 = var2 = 0;

         while (true) {
            if (var11 >= var3.length) {
               var12 = (Class208)var5;// 1253
               break;
            }

            if (var3[var2].method190().equals(var8.method12(var9.field1539))// 1080
               && Class138.method150(var3[var2].method20()).equals(var8.method14(var9.field1539))
               && var9.method1250(Class138.method146(var3[var2].method20()), var8.method519(var9.field1539))) {
               var12 = (Class208)(var5 = var3[var2]);// 1288
               break;// 1463
            }

            var11 = ++var2;// 1339
         }

         if (var12 == null) {
            var9.method1245(
               var8,
               "Referenced method '"// 1069
                  + var8.method12(var9.field1539)
                  + "' with expected signature '"
                  + var8.method518(var9.field1539)
                  + "' not found in class '"
                  + var4.method93()
                  + "'. The native verifier does allow the method to be declared in some superinterface, which the Java Virtual Machine Specification, Second Edition does not."
            );
         }

         if (var4.method329()) {// 1105
            var9.method1245(var8, "Referenced class '" + var4.method93() + "' is a class, but not an interface as expected.");// 1525
         }
      } catch (ClassNotFoundException var7) {// 1338
         throw new Class242("Missing class: " + var7.toString());// 1268
      }
   }// 1491 1508

   // $VF: synthetic method
   public void method1245(Class10 var1, String var2) {
      throw new Class231("Instruction " + var1 + " constraint violated: " + var2);// 518
   }

   // $VF: synthetic method
   @Override
   public void method1058(Class288 var1) {
      Class473 var2 = this;
      this.method1252(var1, var1.method2());// 921
      if (!(var1 instanceof Class292) && !(var1 instanceof Class289) && !(var1 instanceof Class291)) {// 677
         Class178 var7;
         if (!((var7 = this.field1539.method174(var1.method2())) instanceof Class189)) {// 788 823
            this.method1245(var1, "Indexing a constant that's not a CONSTANT_InterfaceMethodref but a '" + var7 + "'.");// 897
         }

         Class186 var13 = (Class186)this.field1539.method174(((Class189)var7).method2());// 914
         String var10;
         if ((var10 = ((Class191)this.field1539.method174(var13.method17())).method20()).equals("<init>")) {// 735 846
            this.method1245(var1, "Method to invoke must not be '<init>'.");// 756
         }

         if (var10.equals("<clinit>")) {// 883
            this.method1245(var1, "Method to invoke must not be '<clinit>'.");// 881
         }
      } else {
         Class178 var6;
         if (!((var6 = this.field1539.method174(var1.method2())) instanceof Class188)) {// 764 811
            this.method1245(var1, "Indexing a constant that's not a CONSTANT_Methodref but a '" + var6 + "'.");// 821
         } else {
            Class186 var4 = (Class186)this.field1539.method174(((Class188)var6).method2());// 684
            Class191 var3;
            if ((var3 = (Class191)this.field1539.method174(var4.method17())).method20().equals("<init>") && !(var1 instanceof Class289)) {// 632 892
               this.method1245(var1, "Only INVOKESPECIAL is allowed to invoke instance initialization methods.");// 818
            }

            if (!var3.method20().equals("<init>") && var3.method20().startsWith("<")) {// 949
               this.method1245(// 968
                  var1,
                  "No method with a name beginning with '<' other than the instance initialization methods may be called by the method invocation instructions."
               );
            }
         }
      }

      Class138 var8;
      if ((var8 = var1.method14(this.field1539)) instanceof Class145) {// 618 838
         var8 = ((Class145)var8).method26();// 854
      }

      Class581 var11;
      if (var8 instanceof Class144 && (var11 = Class545.method1689(((Class144)var8).method93()).method1912()).method1942() != 1) {// 675 734 829 852
         this.method1245(var1, "Return type class/interface could not be verified successfully: '" + var11.method1943() + "'.");// 665
      }

      Class138[] var14 = var1.method519(this.field1539);// 682

      for (int var10000 = var12 = 0; var10000 < var14.length; var10000 = ++var12) {// 816
         Class138 var9;
         if ((var9 = var14[var12]) instanceof Class145) {// 755 974
            var9 = ((Class145)var9).method26();// 777
         }

         Class581 var5;
         if (var9 instanceof Class144 && (var5 = Class545.method1689(((Class144)var9).method93()).method1912()).method1942() != 1) {// 697 705 722 982
            var2.method1245(var1, "Argument type class/interface could not be verified successfully: '" + var5.method1943() + "'.");// 613
         }
      }
   }// 744

   // $VF: synthetic method
   @Override
   public void method1157(Class6 var1) {
      Class473 var2 = this;

      try {
         String var4 = var1.method12(var2.field1539);// 1191
         Class207[] var3 = Class411.method790(var1.method525(var2.field1539).method93()).method346();// 1375 1681
         Class207 var7 = null;// 1600
         int var5;
         int var10000 = var5 = 0;

         while (true) {
            if (var10000 >= var3.length) {
               var8 = var7;// 1027
               break;
            }

            if (var3[var5].method190().equals(var4)) {// 1062
               var8 = var7 = var3[var5];// 1412
               break;// 1621
            }

            var10000 = ++var5;// 1560
         }

         if (var8 == null) {
            throw new Class242("Field not found?!?");// 1549
         } else if (!var7.method254()) {// 1366
            var2.method1245(var1, "Referenced field '" + var7 + "' is not static which it should be.");// 1500
         }
      } catch (ClassNotFoundException var6) {// 1010
         throw new Class242("Missing class: " + var6.toString());// 1161
      }
   }// 1341 1528

   // $VF: synthetic method
   @Override
   public void method1168(Class28 var1) {
      this.method1252(var1, var1.method2());// 805
      Class178 var3;
      if (!((var3 = this.field1539.method174(var1.method2())) instanceof Class182)) {// 627 822
         this.method1245(var1, "Expecting a CONSTANT_Class operand, but found a '" + var3 + "'.");// 959
      } else {
         Class191 var4 = (Class191)this.field1539.method174(((Class182)var3).method2());// 851
         if (Class138.method151("L" + var4.method20() + ";") instanceof Class145) {// 687 696
            this.method1245(var1, "NEW must not be used to create an array.");// 666
         }
      }
   }// 625 976

   // $VF: synthetic method
   public Class473(Class133 var1, Class221 var2) {
      this.field1540 = var1;
      this.field1539 = var2;// 202 250
   }// 128

   // $VF: synthetic method
   @Override
   public void method1211(Class286 var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 617 661
         this.method1245(var1, "Index '" + var4 + "' must be non-negative.");// 719
      } else {
         int var3 = this.method1251() - 1;// 879
         if (var4 > var3) {// 803
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-1 '" + var3 + "'.");// 620
         }
      }
   }// 938 964

   // $VF: synthetic method
   @Override
   public void method1089 (istore_x var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 693 951
         this.method1245(var1, "Index '" + var4 + "' must be non-negative.");// 645
      } else {
         int var3 = this.method1251() - 1;// 794
         if (var4 > var3) {// 831
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-1 '" + var3 + "'.");// 762
         }
      }
   }// 931 963

   // $VF: synthetic method
   @Override
   public void method1198(Class115 var1) {
   }// 790

   // $VF: synthetic method
   public boolean method1250(Object[] var1, Object[] var2) {
      if (var1.length != var2.length) {// 1006
         return false;// 1526
      } else {
         for (int var10000 = var4 = 0; var10000 < var1.length; var10000 = ++var4) {// 1602
            if (!var1[var4].equals(var2[var4])) {// 1230
               return false;// 1185
            }
         }

         return true;// 987
      }
   }

   // $VF: synthetic method
   @Override
   public void method1075 (lstore_x var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 706 770
         this.method1245(// 708
            var1,
            "Index '"
               + var4
               + "' must be non-negative. [Constraint by JustIce as an analogon to the single-slot xLOAD/xSTORE instructions; may not happen anyway.]"
         );
      } else {
         int var3 = this.method1251() - 2;// 749
         if (var4 > var3) {// 634
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-2 '" + var3 + "'.");// 631
         }
      }
   }// 731 850

   // $VF: synthetic method
   @Override
   public void method1206 (dload_x var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 667 701
         this.method1245(// 638
            var1,
            "Index '"
               + var4
               + "' must be non-negative. [Constraint by JustIce as an analogon to the single-slot xLOAD/xSTORE instructions; may not happen anyway.]"
         );
      } else {
         int var3 = this.method1251() - 2;// 832
         if (var4 > var3) {// 713
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-2 '" + var3 + "'.");// 955
         }
      }
   }// 741 935

   // $VF: synthetic method
   @Override
   public void method1060(Class2 var1) {
      this.method1252(var1, var1.method2());// 782
      Class178 var2;
      if (!((var2 = this.field1539.method174(var1.method2())) instanceof Class182)) {// 870 929
         this.method1245(var1, "Expecting a CONSTANT_Class operand, but found a '" + var2 + "'.");// 676
      }
   }// 956

   // $VF: synthetic method
   @Override
   public void method1061 (ldc var1) {
      this.method1252(var1, var1.method2());// 327
      Class178 var3;
      if ((var3 = this.field1539.method174(var1.method2())) instanceof Class182) {// 383 527
         this.field1540.method131("Operand of LDC or LDC_W is CONSTANT_Class '" + var3 + "' - this is only supported in JDK 1.5 and higher.");// 197
      } else {
         if (!(var3 instanceof Class181) && !(var3 instanceof Class184) && !(var3 instanceof Class185)) {// 49
            this.method1245(var1, "Operand of LDC or LDC_W must be one of CONSTANT_Integer, CONSTANT_Float or CONSTANT_String, but is '" + var3 + "'.");// 448
         }
      }
   }// 140 562

   // $VF: synthetic method
   @Override
   public void method1158(Class291 var1) {
      Class291 var8 = var1;
      Class473 var9 = this;

      try {
         Class205 var4;
         Class208[] var3 = (var4 = Class411.method790(var8.method521(var9.field1539))).method341();// 1152 1198 1553
         Class208 var5 = null;// 1302
         int var2;
         int var10 = var2 = 0;

         while (true) {
            if (var10 >= var3.length) {
               var11 = var5;// 1588
               break;
            }

            if (var3[var2].method190().equals(var8.method12(var9.field1539))// 1219
               && Class138.method150(var3[var2].method20()).equals(var8.method14(var9.field1539))
               && var9.method1250(Class138.method146(var3[var2].method20()), var8.method519(var9.field1539))) {
               var11 = var5 = var3[var2];// 1383
               break;// 1532
            }

            var10 = ++var2;// 1325
         }

         if (var11 == null) {
            var9.method1245(
               var8,
               "Referenced method '"// 995
                  + var8.method12(var9.field1539)
                  + "' with expected signature '"
                  + var8.method518(var9.field1539)
                  + "' not found in class '"
                  + var4.method93()
                  + "'. The native verifier possibly allows the method to be declared in some superclass or implemented interface, which the Java Virtual Machine Specification, Second Edition does not."
            );
         } else if (!var5.method254()) {
            var9.method1245(var8, "Referenced method '" + var8.method12(var9.field1539) + "' has ACC_STATIC unset.");// 1426
         }
      } catch (ClassNotFoundException var7) {// 1024
         throw new Class242("Missing class: " + var7.toString());// 1599
      }
   }// 997 1173 1379

   // $VF: synthetic method
   @Override
   public void method1110(Class294 var1) {
      byte var3;
      if ((var3 = var1.method142()) != 4 && var3 != 5 && var3 != 6 && var3 != 7 && var3 != 8 && var3 != 9 && var3 != 10 && var3 != 11) {// 732 740
         this.method1245(var1, "Illegal type code '+t+' for 'atype' operand.");// 909
      }
   }// 962

   // $VF: synthetic method
   public int method1251() {
      Class473 var1 = this;

      try {
         return Class411.method790(Class133.method134(var1.field1540).method1913()).method341()[Class133.method133(var1.field1540)].method369().method30();// 124
      } catch (ClassNotFoundException var2) {// 568
         throw new Class242("Missing class: " + var2.toString());// 311
      }
   }

   // $VF: synthetic method
   public void method1252(Class10 var1, int var2) {
      if (var2 < 0 || var2 >= this.field1539.method2()) {// 350
         this.method1245(var1, "Illegal constant pool index '" + var2 + "'.");// 156
      }
   }// 543

   // $VF: synthetic method
   @Override
   public void method1059(Class279 var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 748 884
         this.method1245(var1, "Index '" + var4 + "' must be non-negative.");// 825
      } else {
         int var3 = this.method1251() - 1;// 898
         if (var4 > var3) {// 723
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-1 '" + var3 + "'.");// 615
         }
      }
   }// 872 981

   // $VF: synthetic method
   @Override
   public void method1073 (fload_x var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 839 918
         this.method1245(var1, "Index '" + var4 + "' must be non-negative.");// 607
      } else {
         int var3 = this.method1251() - 1;// 842
         if (var4 > var3) {// 779
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-1 '" + var3 + "'.");// 785
         }
      }
   }// 641 901

   // $VF: synthetic method
   @Override
   public void method1174(Class295 var1) {
      this.method1252(var1, var1.method2());// 715
      Class178 var2;
      if (!((var2 = this.field1539.method174(var1.method2())) instanceof Class182)) {// 819 979
         this.method1245(var1, "Expecting a CONSTANT_Class operand, but found a '" + var2 + "'.");// 814
      }

      short var6;
      if ((var6 = var1.method523()) < 1) {// 751 800
         this.method1245(var1, "Number of dimensions to create must be greater than zero.");// 828
      }

      Class138 var3;
      if ((var3 = var1.method1(this.field1539)) instanceof Class145) {// 611 813
         if (((Class145)var3).method17() < var6) {// 669 702
            this.method1245(// 760
               var1, "Not allowed to create array with more dimensions ('+dimensions2create+') than the one referenced by the CONSTANT_Class '" + var3 + "'."
            );
            return;// 954
         }
      } else {
         this.method1245(// 858
            var1,
            "Expecting a CONSTANT_Class referencing an array type. [Constraint not found in The Java Virtual Machine Specification, Second Edition, 4.8.1]"
         );
      }
   }// 630

   // $VF: synthetic method
   @Override
   public void method1216 (iload_x var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 793 820
         this.method1245(var1, "Index '" + var4 + "' must be non-negative.");// 757
      } else {
         int var3 = this.method1251() - 1;// 653
         if (var4 > var3) {// 626
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-1 '" + var3 + "'.");// 775
         }
      }
   }// 726 807

   // $VF: synthetic method
   @Override
   public void method1163 (lload_x var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 679 972
         this.method1245(// 888
            var1,
            "Index '"
               + var4
               + "' must be non-negative. [Constraint by JustIce as an analogon to the single-slot xLOAD/xSTORE instructions; may not happen anyway.]"
         );
      } else {
         int var3 = this.method1251() - 2;// 656
         if (var4 > var3) {// 877
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-2 '" + var3 + "'.");// 774
         }
      }
   }// 623 945

   // $VF: synthetic method
   @Override
   public void method1222 (astore_x var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 646 795
         this.method1245(var1, "Index '" + var4 + "' must be non-negative.");// 728
      } else {
         int var3 = this.method1251() - 1;// 939
         if (var4 > var3) {// 885
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-1 '" + var3 + "'.");// 614
         }
      }
   }// 700 766

   // $VF: synthetic method
   @Override
   public void method1074 (dstore_x var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 668 977
         this.method1245(// 672
            var1,
            "Index '"
               + var4
               + "' must be non-negative. [Constraint by JustIce as an analogon to the single-slot xLOAD/xSTORE instructions; may not happen anyway.]"
         );
      } else {
         int var3 = this.method1251() - 2;// 932
         if (var4 > var3) {// 961
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-2 '" + var3 + "'.");// 642
         }
      }
   }// 628 754

   // $VF: synthetic method
   @Override
   public void method1162(Class29 var1) {
      Class144 var3;
      Class581 var4;
      if ((var3 = var1.method8(this.field1539)) != null && (var4 = Class545.method1689(var3.method93()).method1910()).method1942() != 1) {// 187 254 452 559 595
         this.method1245((Class10)var1, "Class '" + var1.method8(this.field1539).method93() + "' is referenced, but cannot be loaded: '" + var4 + "'.");// 594
      }
   }// 120

   // $VF: synthetic method
   @Override
   public void method1142 (fstore_x var1) {
      int var4;
      if ((var4 = var1.method2()) < 0) {// 651 905
         this.method1245(var1, "Index '" + var4 + "' must be non-negative.");// 983
      } else {
         int var3 = this.method1251() - 1;// 912
         if (var4 > var3) {// 841
            this.method1245(var1, "Index '" + var4 + "' must not be greater than max_locals-1 '" + var3 + "'.");// 729
         }
      }
   }// 674 678
}
