package mapped;

import smardecSB.*;

// $VF: Compiled from gc
public class Class470 extends Class469 implements Class471 {
   // $VF: synthetic field
   public Class203 field1533;
   // $VF: synthetic field
   public Class480 field1534 = null;
   // $VF: synthetic field
   public static Class144 field1535 = new Class144("com.allatori.IiIIiiIIiI");
   // $VF: synthetic field
   public Class221 field1536 = null;

   // $VF: synthetic method
   @Override
   public void method1185 (faload var1) {
      this.method1239(var1, this.method1246().method1301());// 1375
      if (this.method1246().method1305(1) != Class138.field579) {// 1681
         if (!(this.method1246().method1305(1) instanceof Class145)) {// 1062
            this.method1245(var1, "Stack next-to-top must be of type float[] but is '" + this.method1246().method1305(1) + "'.");// 1412
         }

         if (((Class145)this.method1246().method1305(1)).method26() != Class138.field575) {// 1215 1428
            this.method1245(var1, "Stack next-to-top must be of type float[] but is '" + this.method1246().method1305(1) + "'.");// 1027
         }
      }
   }// 1600 1673

   // $VF: synthetic method
   public void method1238(Class10 var1) {
      int var2;
      if ((var2 = var1.method15(this.field1536)) > this.method1246().method1304()) {// 109 213
         this.method1245(
            var1, "Cannot consume " + var2 + " stack slots: only " + this.method1246().method1304() + " slot(s) left on stack!\nStack:\n" + this.method1246()// 15
         );
      }

      if ((var2 = var1.method11(this.field1536) - var1.method15(this.field1536)) + this.method1246().method1304() > this.method1246().method1306()) {// 270 582
         this.method1245(
            var1,// 177
            "Cannot produce "
               + var2
               + " stack slots: only "
               + (this.method1246().method1306() - this.method1246().method1304())
               + " free stack slot(s) left.\nStack:\n"
               + this.method1246()
         );
      }
   }// 235

   // $VF: synthetic method
   @Override
   public void method1163 (lload_x var1) {
   }// 2019

   // $VF: synthetic method
   @Override
   public void method1170(Class313 var1) {
      if (this.method1246().method1301() != Class138.field576) {// 755
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 777
      }
   }// 705

   // $VF: synthetic method
   @Override
   public void method1182(Class103 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1540
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1063
      }
   }// 1669

   // $VF: synthetic method
   @Override
   public void method1234(Class297 var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2328
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2027
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 2036
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2129
      }
   }// 2349

   // $VF: synthetic method
   @Override
   public void method1195 (irem var1) {
      if (this.method1246().method1301() != Class138.field591) {// 2217
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2058
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 2234
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 2141
      }
   }// 2097

   // $VF: synthetic method
   @Override
   public void method1154(Class261 var1) {
      if (!(this.method1246().method1301() instanceof Class137)) {// 2540
         this.method1245(var1, "The stack top should be of a ReferenceType, but is '" + this.method1246().method1301() + "'.");// 2500
      }
   }// 2382

   // $VF: synthetic method
   @Override
   public void method1146(Class280 var1) {
      if (this.method1241().method867(var1.method2()) == Class138.field592) {// 64
         this.method1245(var1, "Read-Access on local variable " + var1.method2() + " with unknown content.");// 469
      }

      if (var1.method1(this.field1536).method2() == 2 && this.method1241().method867(var1.method2() + 1) != Class138.field592) {// 89 429
         this.method1245(// 506
            var1, "Reading a two-locals value from local variables " + var1.method2() + " and " + (var1.method2() + 1) + " where the latter one is destroyed."
         );
      }

      Class470 var4;
      label27: {
         if (!(var1 instanceof aload_x)) {// 8
            if (this.method1241().method867(var1.method2()) != var1.method1(this.field1536)) {// 331
               StringBuilder var10002 = new StringBuilder().append("Local Variable type and LOADing Instruction type mismatch: Local Variable: '");
               var4 = this;
               this.method1245(
                  var1,// 384
                  var10002.append(this.method1241().method867(var1.method2()))
                     .append("'; Instruction type: '")
                     .append(var1.method1(this.field1536))
                     .append("'.")
                     .toString()
               );
               break label27;// 130
            }
         } else if (!(this.method1241().method867(var1.method2()) instanceof Class137)) {// 363
            this.method1245(
               var1,// 509
               "Local Variable type and LOADing Instruction type mismatch: Local Variable: '"
                  + this.method1241().method867(var1.method2())
                  + "'; Instruction expects a ReferenceType."
            );
         }

         var4 = this;// 182
      }

      if (var4.method1246().method1306() - this.method1246().method1304() < var1.method1(this.field1536).method2()) {
         this.method1245(var1, "Not enough free stack slots to load a '" + var1.method1(this.field1536) + "' onto the OperandStack.");// 4
      }
   }// 305

   // $VF: synthetic method
   @Override
   public void method1124(Class87 var1) {
      Class470 var2 = this;

      try {
         if (!(var2.method1246().method1301() instanceof Class144) && !var2.method1246().method1301().equals(Class138.field579)) {// 111
            var2.method1245(var1, "The 'objectref' is not of an (initialized) ObjectType but of type " + var2.method1246().method1301() + ".");// 587
         }

         if (!var2.method1246().method1301().equals(Class138.field579)) {// 53
            Class144 var5 = (Class144)var2.method1246().method1301();// 267
            Class144 var3 = (Class144)Class138.method151("Ljava/lang/Throwable;");// 393
            if (!var5.method162(var3) && !var5.equals(var3)) {// 419
               var2.method1245(
                  var1, "The 'objectref' is not of class Throwable or of a subclass of Throwable, but of '" + var2.method1246().method1301() + "'."// 230
               );
            }
         }
      } catch (ClassNotFoundException var4) {// 515
         throw new Class242("Missing class: " + var4.toString());// 395
      }
   }// 43 535 584

   // $VF: synthetic method
   @Override
   public void method1096(Class114 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 2261
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2316
      }
   }// 2132

   // $VF: synthetic method
   @Override
   public void method1181 (aload_x var1) {
   }// 254

   // $VF: synthetic method
   @Override
   public void method1060(Class2 var1) {
      Class138 var3;
      if (!((var3 = this.method1246().method1305(0)) instanceof Class137)) {// 738 801
         this.method1245(var1, "The 'objectref' is not of a ReferenceType but of type " + var3 + ".");// 873
      }

      Class178 var4;
      if (!((var4 = this.field1536.method174(var1.method2())) instanceof Class182)) {// 734 829
         this.method1245(var1, "The Constant at 'index' is not a ConstantClass, but '" + var4 + "'.");// 675
      }
   }// 690

   // $VF: synthetic method
   @Override
   public void method1106 (f2d var1) {
      if (this.method1246().method1301() != Class138.field575) {// 916
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 657
      }
   }// 709

   // $VF: synthetic method
   @Override
   public void method1159(Class266 var1) {
      Class138 var3 = this.method1246().method1305(0);// 9
      this.method1249(var1, var3);// 243
   }// 566

   // $VF: synthetic method
   @Override
   public void method1172(Class77 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 2269
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2297
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 2310
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2291
      }
   }// 2090

   // $VF: synthetic method
   @Override
   public void method1093 (dup2 var1) {
      if (this.method1246().method1301().method2() != 2) {// 644
         if (this.method1246().method1305(1).method2() != 1) {// 638
            this.method1245(
               var1,// 741
               "If stack top's size is 1, then stack next-to-top's size must also be 1. But it is '"
                  + this.method1246().method1305(1)
                  + "' of size '"
                  + this.method1246().method1305(1).method2()
                  + "'."
            );
         }
      }
   }// 713 953

   // $VF: synthetic method
   @Override
   public void method1074 (dstore_x var1) {
   }// 761

   // $VF: synthetic method
   public void method1239(Class10 var1, Class138 var2) {
      if (!var2.equals(Class138.field591)) {// 27
         this.method1245(var1, "The 'index' is not of type int but of type " + var2 + ".");// 242
      }
   }// 209

   // $VF: synthetic method
   @Override
   public void method1104 (aaload var1) {
      Class138 var4 = this.method1246().method1305(1);// 60
      Class138 var3 = this.method1246().method1305(0);// 348
      this.method1239(var1, var3);// 56
      if (this.method1249(var1, var4) && !(((Class145)var4).method164() instanceof Class137)) {// 211 416
         this.method1245(// 427
            var1, "The 'arrayref' does not refer to an array with elements of a ReferenceType but to an array of " + ((Class145)var4).method164() + "."
         );
      }
   }// 100

   // $VF: synthetic method
   @Override
   public void method1150(Class62 var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2268
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 1997
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 1992
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2286
      }
   }// 2003

   // $VF: synthetic method
   @Override
   public void method1082(Class66 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 2323
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2278
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 2257
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2119
      }
   }// 2365

   // $VF: synthetic method
   @Override
   public void method1108(Class299 var1) {
      if (this.method1246().method1301() != Class138.field576) {// 746
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 882
      }

      if (this.method1246().method1305(1) != Class138.field576) {// 891
         this.method1245(var1, "The value at the stack next-to-top is not of type 'double', but of type '" + this.method1246().method1305(1) + "'.");// 673
      }
   }// 629

   // $VF: synthetic method
   @Override
   public void method1164 (drem var1) {
      if (this.method1246().method1301() != Class138.field576) {// 645
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 963
      }

      if (this.method1246().method1305(1) != Class138.field576) {// 794
         this.method1245(var1, "The value at the stack next-to-top is not of type 'double', but of type '" + this.method1246().method1305(1) + "'.");// 831
      }
   }// 784

   // $VF: synthetic method
   @Override
   public void method1200 (pop var1) {
      if (this.method1246().method1301().method2() != 1) {// 2442
         this.method1245(
            var1,
            "Stack top size should be 1 but stack top is '" + this.method1246().method1301() + "' of size '" + this.method1246().method1301().method2() + "'."// 2584
         );
      }
   }// 2547

   // $VF: synthetic method
   @Override
   public void method1226(Class13 var1) {
      if (this.method1246().method1301() != Class138.field575) {// 1376
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 1246
      }
   }// 1395

   // $VF: synthetic method
   @Override
   public void method1085 (nop var1) {
   }// 2577

   // $VF: synthetic method
   @Override
   public void method1138(Class105 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1357
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1076
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 1581
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1434
      }
   }// 1618

   // $VF: synthetic method
   @Override
   public void method1216 (iload_x var1) {
   }// 1604

   // $VF: synthetic method
   @Override
   public void method1225(Class309 var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2060
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2015
      }
   }// 2056

   // $VF: synthetic method
   @Override
   public void method1144(Class9 var1) {
      this.method1238(var1);// 340
   }// 274

   // $VF: synthetic method
   @Override
   public void method1126 (daload var1) {
      this.method1239(var1, this.method1246().method1301());// 843
      if (this.method1246().method1305(1) != Class138.field579) {// 851
         if (!(this.method1246().method1305(1) instanceof Class145)) {// 666
            this.method1245(var1, "Stack next-to-top must be of type double[] but is '" + this.method1246().method1305(1) + "'.");// 924
         }

         if (((Class145)this.method1246().method1305(1)).method26() != Class138.field576) {// 625 845
            this.method1245(var1, "Stack next-to-top must be of type double[] but is '" + this.method1246().method1305(1) + "'.");// 868
         }
      }
   }// 687 772

   // $VF: synthetic method
   @Override
   public void method1201(Class321 var1) {
      if (!(this.method1246().method1301() instanceof Class137)) {// 527
         this.method1245(var1, "The 'objectref' at the stack top is not of a ReferenceType but of type '" + this.method1246().method1301() + "'.");// 383
      }

      Class137 var3 = (Class137)this.method1246().method1301();// 140
      this.method1248(var1, var3);// 451
   }// 244

   // $VF: synthetic method
   @Override
   public void method1162(Class29 var1) {
      Class144 var3;
      Class581 var4;
      if ((var3 = var1.method8(this.field1536)) != null && (var4 = Class545.method1689(var3.method93()).method1912()).method1942() != 1) {// 110 193 221 444 601
         this.method1245(// 251
            (Class10)var1, "Class '" + var1.method8(this.field1536).method93() + "' is referenced, but cannot be loaded and resolved: '" + var4 + "'."
         );
      }
   }// 300

   // $VF: synthetic method
   @Override
   public void method1179 (caload var1) {
      Class138 var2 = this.method1246().method1305(1);// 633
      Class138 var4 = this.method1246().method1305(0);// 684
      this.method1239(var1, var4);// 632
      this.method1249(var1, var2);// 818
   }// 966

   // $VF: synthetic method
   @Override
   public void method1153(Class92 var1) {
      if (!(this.method1246().method1301() instanceof Class137)) {// 1328
         this.method1245(var1, "The value at the stack top is not of a ReferenceType, but of type '" + this.method1246().method1301() + "'.");// 1385
      }

      this.method1248(var1, (Class137)this.method1246().method1301());// 1596
   }// 1484

   // $VF: synthetic method
   @Override
   public void method1089 (istore_x var1) {
   }// 2145

   // $VF: synthetic method
   @Override
   public void method1095 (dmul var1) {
      if (this.method1246().method1301() != Class138.field576) {// 745
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 901
      }

      if (this.method1246().method1305(1) != Class138.field576) {// 616
         this.method1245(var1, "The value at the stack next-to-top is not of type 'double', but of type '" + this.method1246().method1305(1) + "'.");// 878
      }
   }// 856

   // $VF: synthetic method
   @Override
   public void method1230 (lconst_x var1) {
   }// 2163

   // $VF: synthetic method
   @Override
   public void method1231(Class1 var1) {
      int var3;
      if ((var3 = var1.method2()) < 0 || var3 >= this.field1536.method2()) {// 162 282
         throw new Class242("Huh?! Constant pool index of instruction '" + var1 + "' illegal? Pass 3a should have checked this!");// 503
      }
   }// 308

   // $VF: synthetic method
   public void method1240(Class480 var1) {
      this.field1534 = var1;// 142
   }// 368

   // $VF: synthetic method
   @Override
   public void method1142 (fstore_x var1) {
   }// 1457

   // $VF: synthetic method
   @Override
   public void method1187 (dastore var1) {
      if (this.method1246().method1301() != Class138.field576) {// 751
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 800
      }

      this.method1239(var1, this.method1246().method1305(1));
      if (this.method1246().method1305(2) != Class138.field579) {// 813 896
         if (!(this.method1246().method1305(2) instanceof Class145)) {// 669
            this.method1245(var1, "Stack next-to-next-to-top must be of type double[] but is '" + this.method1246().method1305(2) + "'.");// 760
         }

         if (((Class145)this.method1246().method1305(2)).method26() != Class138.field576) {// 824 954
            this.method1245(var1, "Stack next-to-next-to-top must be of type double[] but is '" + this.method1246().method1305(2) + "'.");// 858
         }
      }
   }// 611 630

   // $VF: synthetic method
   @Override
   public void method1143(Class93 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1263
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1111
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 1165
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1435
      }
   }// 1529

   // $VF: synthetic method
   @Override
   public void method1088(Class57 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1685
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1797
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 1902
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1879
      }
   }// 1964

   // $VF: synthetic method
   @Override
   public void method1158(Class291 var1) {
      Class470 var2 = this;

      try {
         Class581 var5;
         String var6;
         Class138 var7;
         if ((var7 = var1.method1(var2.field1536)) instanceof Class144// 1704 1912
            && (var5 = Class545.method1689(var6 = ((Class144)var7).method93()).method1912()).method1942() != 1) {// 1755 1766 1901 1913
            var2.method1245(var1, "Class '" + var6 + "' is referenced, but cannot be loaded and resolved: '" + var5 + "'.");// 1931
         }

         int var4;
         for (int var12 = (var4 = (var13 = var1.method519(var2.field1536)).length) - 1; var12 >= 0; var12--) {// 1686 1726 1778
            Class138 var3 = var2.method1246().method1305(var4 - 1 - var12);// 1936
            Object var11;
            if ((var11 = var13[var12]) == Class138.field584 || var11 == Class138.field594 || var11 == Class138.field585 || var11 == Class138.field581) {// 1698 1942
               var11 = Class138.field591;// 1905
            }

            if (!var3.equals(var11)) {// 1885
               if (var3 instanceof Class137 && var11 instanceof Class137) {// 1871
                  Class137 var8 = (Class137)var3;// 1935
                  Class137 var9 = (Class137)var11;// 1898
                  if (!var8.method139(var9)) {// 1702
                     var2.method1245(var1, "Expecting a '" + var11 + "' but found a '" + var3 + "' on the stack (which is not assignment compatible).");// 1773
                  }

                  var2.method1248(var1, var8);// 1794
               } else {
                  var2.method1245(var1, "Expecting a '" + var11 + "' but found a '" + var3 + "' on the stack.");// 1865
               }
            }
         }
      } catch (ClassNotFoundException var10) {// 1909
         throw new Class242("Missing class: " + var10.toString());// 1805
      }
   }// 1831

   // $VF: synthetic method
   @Override
   public void method1197 (ifle var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1310
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1411
      }
   }// 1275

   // $VF: synthetic method
   @Override
   public void method1198(Class115 var1) {
      this.method1239(var1, this.method1246().method1301());// 2681
   }// 2870

   // $VF: synthetic method
   @Override
   public void method1214 (dip2_x2 var1) {
      Class470 var4;
      if (this.method1246().method1305(0).method2() == 2) {// 642
         if (this.method1246().method1305(1).method2() == 2) {// 622
            return;// 659
         }

         if (this.method1246().method1305(2).method2() == 1) {// 804
            return;// 910
         }

         StringBuilder var10002 = new StringBuilder()
            .append("If stack top's size is 2 and stack-next-to-top's size is 1, then stack next-to-next-to-top's size must also be 1. But it is '");
         var4 = this;
         this.method1245(
            var1,// 890
            var10002.append(this.method1246().method1305(2)).append("' of size '").append(this.method1246().method1305(2).method2()).append("'.").toString()
         );
      } else {
         if (this.method1246().method1305(1).method2() == 1) {// 767
            if (this.method1246().method1305(2).method2() == 2) {// 980
               return;// 733
            }

            if (this.method1246().method1305(3).method2() == 1) {// 640
               return;// 940
            }
         }

         var4 = this;// 895
      }

      var4.method1245(var1, "The operand sizes on the stack do not match any of the four forms of usage of this instruction.");
   }// 790

   // $VF: synthetic method
   @Override
   public void method1233 (swap var1) {
      if (this.method1246().method1301().method2() != 1) {// 3561
         this.method1245(var1, "The value at the stack top is not of size '1', but of size '" + this.method1246().method1301().method2() + "'.");// 3250
      }

      if (this.method1246().method1305(1).method2() != 1) {// 3239
         this.method1245(var1, "The value at the stack next-to-top is not of size '1', but of size '" + this.method1246().method1305(1).method2() + "'.");// 3485
      }
   }// 3046

   // $VF: synthetic method
   @Override
   public void method1077 (dup var1) {
      if (this.method1246().method1301().method2() != 1) {// 719
         this.method1245(
            var1,
            "Won't DUP type on stack top '"
               + this.method1246().method1301()
               + "' because it must occupy exactly one slot, not '"
               + this.method1246().method1301().method2()
               + "'."// 938
         );
      }
   }// 879

   // $VF: synthetic method
   @Override
   public void method1109(Class102 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1658
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1017
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 1350
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1195
      }
   }// 1249

   // $VF: synthetic method
   @Override
   public void method1084 (baload var1) {
      Class138 var4 = this.method1246().method1305(1);// 241
      Class138 var3 = this.method1246().method1305(0);// 526
      this.method1239(var1, var3);// 136
      if (this.method1249(var1, var4) && !((Class145)var4).method164().equals(Class138.field584) && !((Class145)var4).method164().equals(Class138.field594)) {// 90 158
         this.method1245(// 342
            var1,
            "The 'arrayref' does not refer to an array with elements of a Type.BYTE or Type.BOOLEAN but to an array of '" + ((Class145)var4).method164() + "'."
         );
      }
   }// 581

   // $VF: synthetic method
   @Override
   public void method1059(Class279 var1) {
      if (!(this.method1241().method867(var1.method2()) instanceof Class140)) {// 3551
         this.method1245(var1, "Expecting a ReturnaddressType in local variable " + var1.method2() + ".");// 2932
      }

      if (this.method1241().method867(var1.method2()) == Class140.field596) {// 3436
         throw new Class242("Oops: RET expecting a target!");// 2783
      }
   }// 3009

   // $VF: synthetic method
   @Override
   public void method1112(Class32 var1) {
      if (!(this.method1246().method1301() instanceof Class137)) {// 2375
         this.method1245(var1, "The stack top should be of a ReferenceType, but is '" + this.method1246().method1301() + "'.");// 2567
      }
   }// 2399

   // $VF: synthetic method
   @Override
   public void method1204 (pop2 var1) {
      if (this.method1246().method1301().method2() != 2) {// 2551
         this.method1245(
            var1,
            "Stack top size should be 2 but stack top is '" + this.method1246().method1301() + "' of size '" + this.method1246().method1301().method2() + "'."// 2508
         );
      }
   }// 2533

   // $VF: synthetic method
   @Override
   public void method1161 (saload var1) {
      this.method1239(var1, this.method1246().method1301());// 3005
      if (this.method1246().method1305(1) != Class138.field579) {// 3125
         if (!(this.method1246().method1305(1) instanceof Class145)) {// 2800
            this.method1245(var1, "Stack next-to-top must be of type short[] but is '" + this.method1246().method1305(1) + "'.");// 3554
         }

         if (((Class145)this.method1246().method1305(1)).method26() != Class138.field581) {// 3015 3236
            this.method1245(var1, "Stack next-to-top must be of type short[] but is '" + this.method1246().method1305(1) + "'.");// 2658
         }
      }
   }// 2667 3520

   // $VF: synthetic method
   @Override
   public void method1203(Class304 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1279
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1086
      }
   }// 1516

   // $VF: synthetic method
   @Override
   public void method1180 (ldiv var1) {
      if (this.method1246().method1301() != Class138.field578) {// 1999
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2331
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 2192
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2252
      }
   }// 2107

   // $VF: synthetic method
   @Override
   public void method1193 (aastore var1) {
      Class470 var2 = this;

      try {
         Class138 var6 = var2.method1246().method1305(2);// 538
         Class138 var4 = var2.method1246().method1305(1);// 92
         Class138 var3 = var2.method1246().method1305(0);// 176
         var2.method1239(var1, var4);// 124
         if (!(var3 instanceof Class137)) {// 568
            var2.method1245(var1, "The 'value' is not of a ReferenceType but of type " + var3 + ".");// 152
         }

         if (var2.method1249(var1, var6)) {// 16
            if (!(((Class145)var6).method164() instanceof Class137)) {// 121
               var2.method1245(// 480
                  var1, "The 'arrayref' does not refer to an array with elements of a ReferenceType but to an array of " + ((Class145)var6).method164() + "."
               );
            }

            if (!((Class137)var3).method139((Class137)((Class145)var6).method164())) {// 472
               var2.method1245(// 381
                  var1,
                  "The type of 'value' ('"
                     + var3
                     + "') is not assignment compatible to the components of the array 'arrayref' refers to. ('"
                     + ((Class145)var6).method164()
                     + "')"
               );
               return;// 350
            }
         }
      } catch (ClassNotFoundException var5) {// 261
         throw new Class242("Missing class: " + var5.toString());// 206
      }
   }// 156

   // $VF: synthetic method
   @Override
   public void method1107(Class271 var1) {
      if (this.method1246().method1296()) {// 255
         this.method1245(var1, "Cannot STORE: Stack to read from is empty.");// 234
      }

      if (!(var1 instanceof astore_x)) {// 214
         if (this.method1246().method1301() != var1.method1(this.field1536)) {// 524
            this.method1245(
               var1,// 371
               "Stack top type and STOREing Instruction type mismatch: Stack top: '"
                  + this.method1246().method1301()
                  + "'; Instruction type: '"
                  + var1.method1(this.field1536)
                  + "'."
            );
            return;// 585
         }
      } else {
         Class138 var2;
         if (!((var2 = this.method1246().method1301()) instanceof Class137) && !(var2 instanceof Class140)) {// 14 514
            this.method1245(
               var1,// 374
               "Stack top type and STOREing Instruction type mismatch: Stack top: '"
                  + this.method1246().method1301()
                  + "'; Instruction expects a ReferenceType or a ReturnadressType."
            );
         }
      }
   }// 560

   // $VF: synthetic method
   @Override
   public void method1123 (getfield var1) {
      Class470 var3 = this;

      try {
         Class138 var9;
         if (!((var9 = var3.method1246().method1301()) instanceof Class144) && var9 != Class138.field579) {// 1024 1057
            var3.method1245(var1, "Stack top should be an object reference that's not an array reference, but is '" + var9 + "'.");// 1599
         }

         String var7 = var1.method12(var3.field1536);// 1552
         Class205 var4;
         Class207[] var5 = (var4 = Class411.method790(var1.method525(var3.field1536).method93())).method346();// 1365 1392
         Class207 var6 = null;// 1282
         int var12;
         int var10000 = var12 = 0;

         while (true) {
            if (var10000 >= var5.length) {
               var22 = var6;// 1297
               break;
            }

            if (var5[var12].method190().equals(var7)) {// 1527
               Class138 var8 = Class138.method151(var5[var12].method20());// 1280
               Class138 var2 = var1.method1(var3.field1536);// 1513
               if (var8.equals(var2)) {// 1439
                  var22 = var6 = var5[var12];// 1437
                  break;// 1154
               }
            }

            var10000 = ++var12;// 1362
         }

         if (var22 == null) {
            Class205[] var13 = var4.method351();// 1675

            label81: {
               int var19;
               label80:
               for (int var23 = var19 = 0; var23 < var13.length; var23 = ++var19) {// 1591
                  var5 = var13[var19].method346();// 1171

                  int var15;
                  for (int var24 = var15 = 0; var24 < var5.length; var24 = ++var15) {// 1201
                     if (var5[var15].method190().equals(var7)) {// 1575
                        Class138 var10 = Class138.method151(var5[var15].method20());// 1211
                        Class138 var17 = var1.method1(var3.field1536);// 1410
                        if (var10.equals(var17)) {// 1316
                           if (((var6 = var5[var15]).method17() & 5) == 0) {// 1273 1530
                              var25 = var6 = null;// 1016
                              break label81;// 1258
                           }
                           break label80;
                        }
                     }
                  }
               }

               var25 = var6;// 1241
            }

            if (var25 == null) {
               throw new Class242("Field '" + var7 + "' not found?!?");// 1522
            }
         }

         if (var6.method249()) {// 1006
            Class144 var14 = var1.method525(var3.field1536);// 1526
            Class144 var20 = new Class144(var3.field1533.method190());// 1551
            if (var14.equals(var20) || var20.method162(var14)) {// 1602
               Class138 var16;
               if ((var16 = var3.method1246().method1301()) == Class138.field579) {// 1040 1185
                  return;// 1639
               }

               if (!(var16 instanceof Class144)) {// 987
                  var3.method1245(var1, "The 'objectref' must refer to an object that's not an array. Found instead: '" + var16 + "'.");// 1181
               }

               Class144 var21;
               if (!(var21 = (Class144)var16).equals(var20) && !var21.method162(var20)) {// 1104 1585
               }
            }
         }

         if (var6.method254()) {// 1546
            var3.method1245(var1, "Referenced field '" + var6 + "' is static which it shouldn't be.");// 1286
         }
      } catch (ClassNotFoundException var11) {// 1332
         throw new Class242("Missing class: " + var11.toString());// 1144
      }
   }// 1589 1663

   // $VF: synthetic method
   public Class433 method1241() {
      return this.field1534.method1269();// 589
   }

   // $VF: synthetic method
   @Override
   public void method1078(Class322 var1) {
      throw new Class242("In this JustIce verification pass there should not occur an illegal instruction such as IMPDEP2.");// 1501
   }

   // $VF: synthetic method
   @Override
   public void method1094(Class3 var1) {
      this.method1238((Class10)var1);// 355
   }// 496

   // $VF: synthetic method
   @Override
   public void method1222 (astore_x var1) {
      if (!(this.method1246().method1301() instanceof Class137) && !(this.method1246().method1301() instanceof Class140)) {// 430
         this.method1245(var1, "The 'objectref' is not of a ReferenceType or of ReturnaddressType but of " + this.method1246().method1301() + ".");// 442
      }
   }// 217

   // $VF: synthetic method
   @Override
   public void method1118 (sastore var1) {
      if (this.method1246().method1301() != Class138.field591) {// 3040
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 3148
      }

      this.method1239(var1, this.method1246().method1305(1));
      if (this.method1246().method1305(2) != Class138.field579) {// 2675 3284
         if (!(this.method1246().method1305(2) instanceof Class145)) {// 3333
            this.method1245(var1, "Stack next-to-next-to-top must be of type short[] but is '" + this.method1246().method1305(2) + "'.");// 3483
         }

         if (((Class145)this.method1246().method1305(2)).method26() != Class138.field581) {// 3228 3461
            this.method1245(var1, "Stack next-to-next-to-top must be of type short[] but is '" + this.method1246().method1305(2) + "'.");// 3426
         }
      }
   }// 2739 2749

   // $VF: synthetic method
   @Override
   public void method1113(Class292 var1) {
      Class470 var2 = this;

      try {
         Class138 var5;
         String var7;
         Class581 var11;
         if ((var5 = var1.method1(var2.field1536)) instanceof Class144// 1878 1966
            && (var11 = Class545.method1689(var7 = ((Class144)var5).method93()).method1912()).method1942() != 1) {// 1712 1761 1762 1941
            var2.method1245(var1, "Class '" + var7 + "' is referenced, but cannot be loaded and resolved: '" + var11 + "'.");// 1687
         }

         int var4;
         for (int var10000 = var12 = (var4 = (var16 = var1.method519(var2.field1536)).length) - 1; var10000 >= 0; var10000 = --var12) {// 1789 1803 1851
            Class138 var6 = var2.method1246().method1305(var4 - 1 - var12);// 1866
            Object var3;
            if ((var3 = var16[var12]) == Class138.field584 || var3 == Class138.field594 || var3 == Class138.field585 || var3 == Class138.field581) {// 1816 1918
               var3 = Class138.field591;// 1970
            }

            if (!var6.equals(var3)) {// 1843
               if (var6 instanceof Class137 && var3 instanceof Class137) {// 1867
                  Class137 var8 = (Class137)var6;// 1804
                  Class137 var9 = (Class137)var3;// 1959
                  if (!var8.method139(var9)) {// 1764
                     var2.method1245(var1, "Expecting a '" + var3 + "' but found a '" + var6 + "' on the stack (which is not assignment compatible).");// 1757
                  }

                  var2.method1248(var1, var8);// 1746
               } else {
                  var2.method1245(var1, "Expecting a '" + var3 + "' but found a '" + var6 + "' on the stack.");// 1893
               }
            }
         }

         Object var13;
         if ((var13 = var2.method1246().method1305(var4)) != Class138.field579) {// 1711 1714
            if (!(var13 instanceof Class137)) {// 1896
               var2.method1245(var1, "Expecting a reference type as 'objectref' on the stack, not a '" + var13 + "'.");// 1944
            }

            Object var17;
            label56: {
               var2.method1248(var1, (Class137)var13);// 1800
               if (!(var13 instanceof Class144)) {// 1872
                  if (!(var13 instanceof Class145)) {// 1856
                     var17 = var13;
                     var2.method1245(var1, "Expecting an ObjectType as 'objectref' on the stack, not a '" + var13 + "'.");// 1732
                     break label56;// 1734
                  }

                  var13 = field1535;// 1781
               }

               var17 = var13;// 1710
            }

            String var15 = ((Class144)var17).method93();
            String var14 = var1.method521(var2.field1536);// 1760
            if (!Class411.method779(var15, var14)) {// 1860
               var2.method1245(var1, "The 'objref' item '" + var13 + "' does not implement '" + var14 + "' as expected.");// 1810
            }
         }
      } catch (ClassNotFoundException var10) {// 1844
         throw new Class242("Missing class: " + var10.toString());// 1729
      }
   }// 1743 1753 1962

   // $VF: synthetic method
   @Override
   public void method1217(Class311 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1130
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1179
      }
   }// 1187

   // $VF: synthetic method
   @Override
   public void method1152 (dsub var1) {
      if (this.method1246().method1301() != Class138.field576) {// 865
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 939
      }

      if (this.method1246().method1305(1) != Class138.field576) {// 614
         this.method1245(var1, "The value at the stack next-to-top is not of type 'double', but of type '" + this.method1246().method1305(1) + "'.");// 725
      }
   }// 700

   // $VF: synthetic method
   public void method1242(Class10 var1, Class138 var2) {
      if (!var2.equals(Class138.field591)) {// 468
         this.method1245(var1, "The 'value' is not of type int but of type " + var2 + ".");// 138
      }
   }// 119

   // $VF: synthetic method
   public void method1243(Class221 var1) {
      this.field1536 = var1;// 510
   }// 456

   // $VF: synthetic method
   @Override
   public void method1148(Class316 var1) {
      if (this.method1246().method1301() != Class138.field576) {// 742
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 900
      }

      if (this.method1246().method1305(1) != Class138.field576) {// 732
         this.method1245(var1, "The value at the stack next-to-top is not of type 'double', but of type '" + this.method1246().method1305(1) + "'.");// 806
      }
   }// 911

   // $VF: synthetic method
   @Override
   public void method1115(Class308 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1340
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1388
      }
   }// 1352

   // $VF: synthetic method
   @Override
   public void method1223(Class112 var1) {
   }// 1109

   // $VF: synthetic method
   @Override
   public void method1175 (castore var1) {
      Class138 var5 = this.method1246().method1305(2);// 899
      Class138 var3 = this.method1246().method1305(1);// 823
      Class138 var4 = this.method1246().method1305(0);// 788
      this.method1239(var1, var3);// 927
      this.method1242(var1, var4);// 833
      if (this.method1249(var1, var5) && !((Class145)var5).method164().equals(Class138.field585)) {// 608 902
         this.method1245(// 721
            var1, "The 'arrayref' does not refer to an array with elements of type char but to an array of type " + ((Class145)var5).method164() + "."
         );
      }
   }// 914

   // $VF: synthetic method
   @Override
   public void method1189 (sipush var1) {
   }// 2906

   // $VF: synthetic method
   @Override
   public void method1102 (lrem var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2043
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 1991
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 2171
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2284
      }
   }// 2176

   // $VF: synthetic method
   @Override
   public void method1062 (_instanceof var1) {
      Class138 var3;
      if (!((var3 = this.method1246().method1305(0)) instanceof Class137)) {// 1072 1220
         this.method1245(var1, "The 'objectref' is not of a ReferenceType but of type " + var3 + ".");// 1487
      }

      Class178 var4;
      if (!((var4 = this.field1536.method174(var1.method2())) instanceof Class182)) {// 1250 1305
         this.method1245(var1, "The Constant at 'index' is not a ConstantClass, but '" + var4 + "'.");// 1603
      }
   }// 1606

   // $VF: synthetic method
   @Override
   public void method1188 (dup_x1 var1) {
      if (this.method1246().method1301().method2() != 1) {// 886
         this.method1245(
            var1,// 704
            "Type on stack top '"
               + this.method1246().method1301()
               + "' should occupy exactly one slot, not '"
               + this.method1246().method1301().method2()
               + "'."
         );
      }

      if (this.method1246().method1305(1).method2() != 1) {// 884
         this.method1245(
            var1,// 748
            "Type on stack next-to-top '"
               + this.method1246().method1305(1)
               + "' should occupy exactly one slot, not '"
               + this.method1246().method1305(1).method2()
               + "'."
         );
      }
   }// 872

   // $VF: synthetic method
   @Override
   public void method1169(Class305 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1629
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1226
      }
   }// 1517

   // $VF: synthetic method
   @Override
   public void method1117 (iaload var1) {
      this.method1239(var1, this.method1246().method1301());// 1647
      if (this.method1246().method1305(1) != Class138.field579) {// 1386
         if (!(this.method1246().method1305(1) instanceof Class145)) {// 1458
            this.method1245(var1, "Stack next-to-top must be of type int[] but is '" + this.method1246().method1305(1) + "'.");// 1107
         }

         if (((Class145)this.method1246().method1305(1)).method26() != Class138.field591) {// 1098 1153
            this.method1245(var1, "Stack next-to-top must be of type int[] but is '" + this.method1246().method1305(1) + "'.");// 1233
         }
      }
   }// 1378 1653

   // $VF: synthetic method
   @Override
   public void method1237(Class104 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1398
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1355
      }
   }// 1122

   // $VF: synthetic method
   @Override
   public void method1194 (isub var1) {
      if (this.method1246().method1301() != Class138.field591) {// 2114
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2274
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 2087
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 2258
      }
   }// 2245

   // $VF: synthetic method
   public void method1244 (ldc_w var1) {
      Class178 var3;
      if (!((var3 = this.field1536.method174(var1.method2())) instanceof Class181) && !(var3 instanceof Class184) && !(var3 instanceof Class185)) {// 1998 2052
         this.method1245(var1, "Referenced constant should be a CONSTANT_Integer, a CONSTANT_Float or a CONSTANT_String, but is '" + var3 + "'.");// 2273
      }
   }// 2246

   // $VF: synthetic method
   @Override
   public void method1090(Class289 var1) {
      Class470 var2 = this;

      try {
         if (var1.method12(var2.field1536).equals("<init>") && !(var2.method1246().method1305(var1.method519(var2.field1536).length) instanceof Class136)) {// 1791
            var2.method1245(// 1745
               var1,
               "Possibly initializing object twice. A valid instruction sequence must not have an uninitialized object on the operand stack or in a local variable during a backwards branch, or in a local variable in code protected by an exception handler. Please see The Java Virtual Machine Specification, Second Edition, 4.9.4 (pages 147 and 148) for details."
            );
         }

         Class138 var5;
         String var7;
         Class581 var11;
         if ((var5 = var1.method1(var2.field1536)) instanceof Class144// 1774 1828
            && (var11 = Class545.method1689(var7 = ((Class144)var5).method93()).method1912()).method1942() != 1) {// 1733 1771 1863 1930
            var2.method1245(var1, "Class '" + var7 + "' is referenced, but cannot be loaded and resolved: '" + var11 + "'.");// 1819
         }

         int var4;
         for (int var10000 = var12 = (var4 = (var17 = var1.method519(var2.field1536)).length) - 1; var10000 >= 0; var10000 = --var12) {// 1829 1839 1951
            Class138 var6 = var2.method1246().method1305(var4 - 1 - var12);// 1811
            Object var3;
            if ((var3 = var17[var12]) == Class138.field584 || var3 == Class138.field594 || var3 == Class138.field585 || var3 == Class138.field581) {// 1832 1939
               var3 = Class138.field591;// 1701
            }

            if (!var6.equals(var3)) {// 1957
               if (var6 instanceof Class137 && var3 instanceof Class137) {// 1949
                  Class137 var8 = (Class137)var6;// 1798
                  Class137 var9 = (Class137)var3;// 1938
                  if (!var8.method139(var9)) {// 1919
                     var2.method1245(var1, "Expecting a '" + var3 + "' but found a '" + var6 + "' on the stack (which is not assignment compatible).");// 1864
                  }

                  var2.method1248(var1, var8);// 1888
               } else {
                  var2.method1245(var1, "Expecting a '" + var3 + "' but found a '" + var6 + "' on the stack.");// 1883
               }
            }
         }

         Object var13;
         if ((var13 = var2.method1246().method1305(var4)) != Class138.field579) {// 1692 1799
            if (!(var13 instanceof Class137)) {// 1705
               var2.method1245(var1, "Expecting a reference type as 'objectref' on the stack, not a '" + var13 + "'.");// 1742
            }

            Object var15 = null;// 1862
            Class289 var19;
            if (!var1.method12(var2.field1536).equals("<init>")) {// 1700
               label69: {
                  var2.method1248(var1, (Class137)var13);// 1903
                  if (!(var13 instanceof Class144)) {// 1739
                     if (!(var13 instanceof Class145)) {// 1737
                        var18 = var13;
                        var2.method1245(var1, "Expecting an ObjectType as 'objectref' on the stack, not a '" + var13 + "'.");// 1945
                        break label69;// 1740
                     }

                     var13 = field1535;// 1695
                  }

                  var18 = var13;// 1845
               }

               var15 = ((Class144)var18).method93();
               var19 = var1;
            } else {
               if (!(var13 instanceof Class136)) {// 1884
                  var2.method1245(// 1937
                     var1,
                     "Expecting an UninitializedObjectType as 'objectref' on the stack, not a '"
                        + var13
                        + "'. Otherwise, you couldn't invoke a method since an array has no methods (not to speak of a return address)."
                  );
               }

               var15 = ((Class136)var13).method138().method93();// 1772
               var19 = var1;// 1780
            }

            String var14 = var19.method521(var2.field1536);
            if (!Class411.method779((String)var15, var14)) {// 1697
               var2.method1245(var1, "The 'objref' item '" + var13 + "' does not implement '" + var14 + "' as expected.");// 1940
            }
         }
      } catch (ClassNotFoundException var10) {// 1806
         throw new Class242("Missing class: " + var10.toString());// 1947
      }
   }// 1837 1847 1854

   // $VF: synthetic method
   @Override
   public void method1183(Class106 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1034
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1353
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 1162
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1403
      }
   }// 1133

   // $VF: synthetic method
   @Override
   public void method1091 (idiv var1) {
      if (this.method1246().method1301() != Class138.field591) {// 999
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1396
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 1078
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1192
      }
   }// 1175

   // $VF: synthetic method
   @Override
   public void method1215(Class319 var1) {
      if (this.method1246().method1301() != Class138.field578) {// 1984
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2224
      }
   }// 2203

   // $VF: synthetic method
   @Override
   public void method1101 (fmul var1) {
      if (this.method1246().method1301() != Class138.field575) {// 1494
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 1442
      }

      if (this.method1246().method1305(1) != Class138.field575) {// 1126
         this.method1245(var1, "The value at the stack next-to-top is not of type 'float', but of type '" + this.method1246().method1305(1) + "'.");// 1138
      }
   }// 1496

   // $VF: synthetic method
   @Override
   public void method1075 (lstore_x var1) {
   }// 2000

   // $VF: synthetic method
   @Override
   public void method1236(Class303 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1620
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1124
      }
   }// 1608

   // $VF: synthetic method
   @Override
   public void method1076(Class296 var1) {
      if (this.method1246().method1301() != Class138.field575) {// 1623
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 1239
      }

      if (this.method1246().method1305(1) != Class138.field575) {// 1298
         this.method1245(var1, "The value at the stack next-to-top is not of type 'float', but of type '" + this.method1246().method1305(1) + "'.");// 1058
      }
   }// 1339

   // $VF: synthetic method
   @Override
   public void method1066(Class12 var1) {
      Object var3;
      if ((var3 = this.field1533.method26()) == Class138.field584 || var3 == Class138.field594 || var3 == Class138.field581 || var3 == Class138.field585) {// 547 575
         var3 = Class138.field591;// 328
      }

      Class12 var10000;
      if (var1 instanceof voidReturn) {// 546
         if (var3 == Class138.field586) {// 341
            return;// 392
         }

         var10000 = var1;
         this.method1245(var1, "RETURN instruction in non-void method.");// 51
      } else {
         var10000 = var1;// 362
      }

      if (var10000 instanceof Class321) {
         if (this.method1246().method1301() != Class138.field579) {// 476
            if (!(this.method1246().method1301() instanceof Class137)) {// 454
               this.method1245(var1, "Reference type expected on top of stack, but is: '" + this.method1246().method1301() + "'.");// 343
            }

            this.method1248(var1, (Class137)this.method1246().method1301());// 126
         }
      } else {
         if (!var3.equals(this.method1246().method1301())) {// 505
            this.method1245(
               var1,// 421
               "Current method has return type of '"
                  + this.field1533.method26()
                  + "' expecting a '"
                  + var3
                  + "' on top of the stack. But stack top is a '"
                  + this.method1246().method1301()
                  + "'."
            );
         }
      }
   }// 86 155 542

   // $VF: synthetic method
   public void method1245(Class10 var1, String var2) {
      String var3 = var1.getClass().getName();// 232
      throw new Class233("Instruction " + var3.substring(var3.lastIndexOf(46) + 1) + " constraint violated: " + var2);// 463
   }

   // $VF: synthetic method
   @Override
   public void method1125 (laload var1) {
      this.method1239(var1, this.method1246().method1301());// 2332
      if (this.method1246().method1305(1) != Class138.field579) {// 2022
         if (!(this.method1246().method1305(1) instanceof Class145)) {// 1971
            this.method1245(var1, "Stack next-to-top must be of type long[] but is '" + this.method1246().method1305(1) + "'.");// 2335
         }

         if (((Class145)this.method1246().method1305(1)).method26() != Class138.field578) {// 2208 2296
            this.method1245(var1, "Stack next-to-top must be of type long[] but is '" + this.method1246().method1305(1) + "'.");// 2302
         }
      }
   }// 1977 2023

   // $VF: synthetic method
   @Override
   public void method1207 (dneg var1) {
      if (this.method1246().method1301() != Class138.field576) {// 971
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 711
      }
   }// 636

   // $VF: synthetic method
   @Override
   public void method1190 (imul var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1224
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1595
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 1521
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1128
      }
   }// 1008

   // $VF: synthetic method
   @Override
   public void method1063(Class5 var1) {
      Class178 var4;
      if (!((var4 = this.field1536.method174(var1.method2())) instanceof Class190)) {// 172 188
         this.method1245(var1, "Index '" + var1.method2() + "' should refer to a CONSTANT_Fieldref_info structure, but refers to '" + var4 + "'.");// 564
      }

      Class581 var3;
      Class138 var5;
      String var6;
      if ((var5 = var1.method1(this.field1536)) instanceof Class144// 438 592
         && (var3 = Class545.method1689(var6 = ((Class144)var5).method93()).method1912()).method1942() != 1) {// 125 181 433 483
         this.method1245(var1, "Class '" + var6 + "' is referenced, but cannot be loaded and resolved: '" + var3 + "'.");// 413
      }
   }// 212

   // $VF: synthetic method
   @Override
   public void method1199 (ifgt var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1115
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1567
      }
   }// 1056

   // $VF: synthetic method
   @Override
   public void method1209(Class11 var1) {
      throw new Class242("In this JustIce verification pass there should not occur an illegal instruction such as IMPDEP1.");// 1026
   }

   // $VF: synthetic method
   @Override
   public void method1114 (fneg var1) {
      if (this.method1246().method1301() != Class138.field575) {// 1659
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 1234
      }
   }// 1506

   // $VF: synthetic method
   @Override
   public void method1071(Class55 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 2021
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2301
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 2195
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1978
      }
   }// 2017

   // $VF: synthetic method
   @Override
   public void method1191(Class324 var1) {
      throw new Class242("In this JustIce verification pass there should not occur an illegal instruction such as BREAKPOINT.");// 698
   }

   // $VF: synthetic method
   @Override
   public void method1202 (lshl var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1973
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2131
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 2347
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2359
      }
   }// 2068

   // $VF: synthetic method
   @Override
   public void method1072 (voidReturn var1) {
      if (this.field1533.method20().equals("<init>") && Class480.field1564 != null && !this.field1533.method190().equals(Class138.field583.method93())) {// 2760 3343
         this.method1245(var1, "Leaving a constructor that itself did not call a constructor.");// 3106
      }
   }// 2937

   // $VF: synthetic method
   @Override
   public void method1130 (ishl var1) {
      if (this.method1246().method1301() != Class138.field591) {// 2108
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2333
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 2147
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 2351
      }
   }// 2159

   // $VF: synthetic method
   @Override
   public void method1079 (lneg var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2355
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2033
      }
   }// 1995

   // $VF: synthetic method
   @Override
   public void method1206 (dload_x var1) {
   }// 641

   // $VF: synthetic method
   @Override
   public void method1219(Class314 var1) {
      if (this.method1246().method1301() != Class138.field575) {// 925
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 783
      }
   }// 934

   // $VF: synthetic method
   @Override
   public void method1228 (dconst_x var1) {
   }// 962

   // $VF: synthetic method
   @Override
   public void method1232(Class310 var1) {
      if (this.method1246().method1301() != Class138.field576) {// 768
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 933
      }
   }// 744

   // $VF: synthetic method
   @Override
   public void method1213 (iastore var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1649
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1502
      }

      this.method1239(var1, this.method1246().method1305(1));
      if (this.method1246().method1305(2) != Class138.field579) {// 993 1160
         if (!(this.method1246().method1305(2) instanceof Class145)) {// 1495
            this.method1245(var1, "Stack next-to-next-to-top must be of type int[] but is '" + this.method1246().method1305(2) + "'.");// 1666
         }

         if (((Class145)this.method1246().method1305(2)).method26() != Class138.field591) {// 992 1342
            this.method1245(var1, "Stack next-to-next-to-top must be of type int[] but is '" + this.method1246().method1305(2) + "'.");// 1061
         }
      }
   }// 1036 1290

   // $VF: synthetic method
   @Override
   public void method1073 (fload_x var1) {
   }// 1643

   // $VF: synthetic method
   @Override
   public void method1119 (fadd var1) {
      if (this.method1246().method1301() != Class138.field575) {// 1283
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 1430
      }

      if (this.method1246().method1305(1) != Class138.field575) {// 1170
         this.method1245(var1, "The value at the stack next-to-top is not of type 'float', but of type '" + this.method1246().method1305(1) + "'.");// 1558
      }
   }// 1196

   // $VF: synthetic method
   @Override
   public void method1147 (bipush var1) {
   }// 958

   // $VF: synthetic method
   @Override
   public void method1145(Class301 var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2221
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2014
      }
   }// 2320

   // $VF: synthetic method
   public Class484 method1246() {
      return this.field1534.method1270();// 603
   }

   // $VF: synthetic method
   public void method1247(Class203 var1) {
      this.field1533 = var1;// 386
   }// 470

   // $VF: synthetic method
   @Override
   public void method1224 (fconst_x var1) {
   }// 1568

   // $VF: synthetic method
   @Override
   public void method1087 (if_acmpne var1) {
      if (!(this.method1246().method1301() instanceof Class137)) {// 1299
         this.method1245(var1, "The value at the stack top is not of a ReferenceType, but of type '" + this.method1246().method1301() + "'.");// 1200
      }

      if (!(this.method1246().method1305(1) instanceof Class137)) {// 1093
         this.method1245(var1, "The value at the stack next-to-top is not of a ReferenceType, but of type '" + this.method1246().method1305(1) + "'.");// 1096
      }
   }// 1018

   // $VF: synthetic method
   @Override
   public void method1220 (aconst_null var1) {
   }// 414

   // $VF: synthetic method
   @Override
   public void method1160 (dreturn var1) {
      if (this.method1246().method1301() != Class138.field576) {// 905
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 651
      }
   }// 678

   // $VF: synthetic method
   @Override
   public void method1165 (iadd var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1562
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1231
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 1281
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1313
      }
   }// 1640

   // $VF: synthetic method
   @Override
   public void method1097(Class79 var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2155
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2254
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 2519
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2401
      }
   }// 2476

   // $VF: synthetic method
   @Override
   public void method1061 (ldc var1) {
      Class178 var3;
      if (!((var3 = this.field1536.method174(var1.method2())) instanceof Class181) && !(var3 instanceof Class184) && !(var3 instanceof Class185)) {// 1982 2324
         this.method1245(var1, "Referenced constant should be a CONSTANT_Integer, a CONSTANT_Float or a CONSTANT_String, but is '" + var3 + "'.");// 2307
      }
   }// 2281

   // $VF: synthetic method
   @Override
   public void method1105(Class107 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1583
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1449
      }
   }// 1514

   // $VF: synthetic method
   @Override
   public void method1167 (if_icmple var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1486
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1453
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 1565
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1052
      }
   }// 1244

   // $VF: synthetic method
   public Class470() {
      this.field1533 = null;// 146
   }// 190

   // $VF: synthetic method
   @Override
   public void method1100 (dadd var1) {
      if (this.method1246().method1301() != Class138.field576) {// 929
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 676
      }

      if (this.method1246().method1305(1) != Class138.field576) {// 956
         this.method1245(var1, "The value at the stack next-to-top is not of type 'double', but of type '" + this.method1246().method1305(1) + "'.");// 610
      }
   }// 639

   // $VF: synthetic method
   @Override
   public void method1174(Class295 var1) {
      Class470 var3 = this;
      short var2 = var1.method523();// 2559

      for (int var10000 = var4 = 0; var10000 < var2; var10000 = ++var4) {// 2525
         if (var3.method1246().method1305(var4) != Class138.field591) {// 2550
            var3.method1245(var1, "The '" + var2 + "' upper stack types should be 'int' but aren't.");// 2517
         }
      }
   }// 2441

   // $VF: synthetic method
   @Override
   public void method1092(Class307 var1) {
      if (this.method1246().method1301() != Class138.field576) {// 950
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 671
      }
   }// 750

   // $VF: synthetic method
   @Override
   public void method1168(Class28 var1) {
      Class138 var3;
      if (!((var3 = var1.method1(this.field1536)) instanceof Class137)) {// 2422 2483
         throw new Class242("NEW.getType() returning a non-reference type?!");// 2425
      } else {
         if (!(var3 instanceof Class144)) {// 2463
            this.method1245(var1, "Expecting a class type (ObjectType) to work on. Found: '" + var3 + "'.");// 2400
         }

         Class144 var4;
         if (!(var4 = (Class144)var3).method163()) {// 2455 2575
            this.method1245(var1, "Expecting a class type (ObjectType) to work on. Found: '" + var4 + "'.");// 2408
         }
      }
   }// 2512

   // $VF: synthetic method
   @Override
   public void method1210 (jsr_w var1) {
   }// 2148

   // $VF: synthetic method
   @Override
   public void method1176(Class260 var1) {
   }// 1555

   // $VF: synthetic method
   @Override
   public void method1156 (ineg var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1237
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1204
      }
   }// 1147

   // $VF: synthetic method
   @Override
   public void method1086 (fsub var1) {
      if (this.method1246().method1301() != Class138.field575) {// 1219
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 1467
      }

      if (this.method1246().method1305(1) != Class138.field575) {// 1383
         this.method1245(var1, "The value at the stack next-to-top is not of type 'float', but of type '" + this.method1246().method1305(1) + "'.");// 1532
      }
   }// 1509

   // $VF: synthetic method
   @Override
   public void method1177 (lsub var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2181
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2262
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 2040
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2276
      }
   }// 2237

   // $VF: synthetic method
   @Override
   public void method1111 (dup_x2 var1) {
      if (this.method1246().method1301().method2() != 1) {// 635
         this.method1245(
            var1,// 981
            "Stack top type must be of size 1, but is '" + this.method1246().method1301() + "' of size '" + this.method1246().method1301().method2() + "'."
         );
      }

      if (this.method1246().method1305(1).method2() != 2) {// 970
         if (this.method1246().method1305(2).method2() != 1) {// 888
            this.method1245(
               var1,// 623
               "If stack top's size is 1 and stack next-to-top's size is 1, stack next-to-next-to-top's size must also be 1, but is: '"
                  + this.method1246().method1305(2)
                  + "' of size '"
                  + this.method1246().method1305(2).method2()
                  + "'."
            );
         }
      }
   }// 652 877

   // $VF: synthetic method
   @Override
   public void method1227 (fastore var1) {
      if (this.method1246().method1301() != Class138.field575) {// 1047
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 1161
      }

      this.method1239(var1, this.method1246().method1305(1));
      if (this.method1246().method1305(2) != Class138.field579) {// 1150 1528
         if (!(this.method1246().method1305(2) instanceof Class145)) {// 1676
            this.method1245(var1, "Stack next-to-next-to-top must be of type float[] but is '" + this.method1246().method1305(2) + "'.");// 1389
         }

         if (((Class145)this.method1246().method1305(2)).method26() != Class138.field575) {// 1245 1492
            this.method1245(var1, "Stack next-to-next-to-top must be of type float[] but is '" + this.method1246().method1305(2) + "'.");// 1616
         }
      }
   }// 1296 1505

   // $VF: synthetic method
   @Override
   public void method1141(Class100 var1) {
      if (!(this.method1246().method1301() instanceof Class137)) {// 1368
         this.method1245(var1, "The value at the stack top is not of a ReferenceType, but of type '" + this.method1246().method1301() + "'.");// 1544
      }

      if (!(this.method1246().method1305(1) instanceof Class137)) {// 1242
         this.method1245(var1, "The value at the stack next-to-top is not of a ReferenceType, but of type '" + this.method1246().method1305(1) + "'.");// 1615
      }
   }// 1301

   // $VF: synthetic method
   @Override
   public void method1149 (ladd var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2250
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2038
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 2174
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2300
      }
   }// 2011

   // $VF: synthetic method
   public void method1248(Class10 var1, Class137 var2) {
      if (var2 instanceof Class136) {// 223
         this.method1245(var1, "Working on an uninitialized object '" + var2 + "'.");// 45
      }
   }// 440

   // $VF: synthetic method
   @Override
   public void method1110(Class294 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 2541
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2379
      }
   }// 2520

   // $VF: synthetic method
   @Override
   public void method1173 (dip2_x1 var1) {
      if (this.method1246().method1301().method2() == 2) {// 944
         if (this.method1246().method1305(1).method2() != 1) {// 663
            this.method1245(
               var1,// 706
               "If stack top's size is 2, then stack next-to-top's size must be 1. But it is '"
                  + this.method1246().method1305(1)
                  + "' of size '"
                  + this.method1246().method1305(1).method2()
                  + "'."
            );
         }
      } else {
         if (this.method1246().method1305(1).method2() != 1) {// 631
            this.method1245(
               var1,// 862
               "If stack top's size is 1, then stack next-to-top's size must also be 1. But it is '"
                  + this.method1246().method1305(1)
                  + "' of size '"
                  + this.method1246().method1305(1).method2()
                  + "'."
            );
         }

         if (this.method1246().method1305(2).method2() != 1) {// 850
            this.method1245(
               var1,// 692
               "If stack top's size is 1, then stack next-to-next-to-top's size must also be 1. But it is '"
                  + this.method1246().method1305(2)
                  + "' of size '"
                  + this.method1246().method1305(2).method2()
                  + "'."
            );
         }
      }
   }// 668 731 770

   // $VF: synthetic method
   @Override
   public void method1081(Class306 var1) {
      if (this.method1246().method1301() != Class138.field575) {// 1276
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 1292
      }
   }// 1284

   // $VF: synthetic method
   @Override
   public void method1184 (frem var1) {
      if (this.method1246().method1301() != Class138.field575) {// 1671
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 1227
      }

      if (this.method1246().method1305(1) != Class138.field575) {// 1523
         this.method1245(var1, "The value at the stack next-to-top is not of type 'float', but of type '" + this.method1246().method1305(1) + "'.");// 1015
      }
   }// 1519

   // $VF: synthetic method
   @Override
   public void method1080(Class267 var1) {
      Class470 var3 = this;

      try {
         String var7 = var1.method12(var3.field1536);// 2538
         Class207[] var5 = Class411.method790(var1.method525(var3.field1536).method93()).method346();// 2536 2570
         Class207 var4 = null;// 2474
         int var9;
         int var10000 = var9 = 0;

         while (true) {
            if (var10000 >= var5.length) {
               var15 = var4;// 2450
               break;
            }

            if (var5[var9].method190().equals(var7)) {// 2580
               Class138 var6 = Class138.method151(var5[var9].method20());// 2430
               Class138 var2 = var1.method1(var3.field1536);// 2529
               if (var6.equals(var2)) {// 2454
                  var15 = var4 = var5[var9];// 2555
                  break;// 2532
               }
            }

            var10000 = ++var9;// 2456
         }

         if (var15 == null) {
            throw new Class242("Field not found?!?");// 2566
         } else {
            Class138 var10 = var3.method1246().method1301();// 2543
            Class138 var14;
            Object var11 = var14 = Class138.method151(var4.method20());// 2434 2481
            if (var11 == Class138.field584 || var11 == Class138.field594 || var11 == Class138.field585 || var11 == Class138.field581) {// 2591
               var11 = Class138.field591;// 3280
            }

            if (var14 instanceof Class137) {// 3152
               var5 = null;// 3258
               Class137 var16;
               if (var10 instanceof Class137) {// 2660
                  Class137 var13 = (Class137)var10;// 2852
                  var16 = var13;
                  var3.method1248(var1, var13);// 3242
               } else {
                  var3.method1245(var1, "The stack top type '" + var10 + "' is not of a reference type as expected.");// 3234
                  var16 = var5;// 2954
               }

               if (!var16.method139((Class138)var11)) {
                  var3.method1245(var1, "The stack top type '" + var10 + "' is not assignment compatible with '" + var11 + "'.");// 3032
                  return;// 3245
               }
            } else if (var11 != var10) {// 3118
               var3.method1245(var1, "The stack top type '" + var10 + "' is not of type '" + var11 + "' as expected.");// 2782
               return;// 2736
            }
         }
      } catch (ClassNotFoundException var8) {// 3505
         throw new Class242("Missing class: " + var8.toString());// 3404
      }
   }// 3460

   // $VF: synthetic method
   @Override
   public void method1131(Class312 var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2073
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2298
      }
   }// 2136

   // $VF: synthetic method
   @Override
   public void method1211(Class286 var1) {
      if (this.method1241().method865() <= (var1.method1(this.field1536).method2() == 1 ? var1.method2() : var1.method2() + 1)) {// 1158
         this.method1245(var1, "The 'index' is not a valid index into the local variable array.");// 1535
      }

      this.method1239(var1, this.method1241().method867(var1.method2()));// 1677
   }// 1267

   // $VF: synthetic method
   @Override
   public void method1139(Class68 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 2189
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2086
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 2313
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 2216
      }
   }// 2001

   // $VF: synthetic method
   @Override
   public void method1134(Class24 var1) {
      if (this.method1246().method1301() != Class138.field575) {// 1436
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 1433
      }

      if (this.method1246().method1305(1) != Class138.field575) {// 1069
         this.method1245(var1, "The value at the stack next-to-top is not of type 'float', but of type '" + this.method1246().method1305(1) + "'.");// 1137
      }
   }// 1525

   // $VF: synthetic method
   @Override
   public void method1064(Class277 var1) {
      if (this.method1241().method865() <= (var1.method1(this.field1536).method2() == 1 ? var1.method2() : var1.method2() + 1)) {// 133
         this.method1245(var1, "The 'index' is not a valid index into the local variable array.");// 65
      }
   }// 80

   // $VF: synthetic method
   @Override
   public void method1065 (ldc2_w var1) {
      Class178 var3;
      if (!((var3 = this.field1536.method174(var1.method2())) instanceof Class183) && !(var3 instanceof Class179)) {// 2006 2223
         this.method1245(var1, "Referenced constant should be a CONSTANT_Integer, a CONSTANT_Float or a CONSTANT_String, but is '" + var3 + "'.");// 2009
      }
   }// 2194

   // $VF: synthetic method
   @Override
   public void method1178(Class75 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1110
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1143
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 1664
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1049
      }
   }// 1186

   // $VF: synthetic method
   @Override
   public void method1229 (lastore var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2062
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2240
      }

      this.method1239(var1, this.method1246().method1305(1));
      if (this.method1246().method1305(2) != Class138.field579) {// 2092 2099
         if (!(this.method1246().method1305(2) instanceof Class145)) {// 2272
            this.method1245(var1, "Stack next-to-next-to-top must be of type long[] but is '" + this.method1246().method1305(2) + "'.");// 2075
         }

         if (((Class145)this.method1246().method1305(2)).method26() != Class138.field578) {// 2363 2366
            this.method1245(var1, "Stack next-to-next-to-top must be of type long[] but is '" + this.method1246().method1305(2) + "'.");// 2315
         }
      }
   }// 2041 2312

   // $VF: synthetic method
   @Override
   public void method1140(Class290 var1) {
      Class470 var2 = this;
      int var6;
      if ((var6 = var1.method30()) == 0) {// 1103 1351
         this.method1245(var1, "The 'count' argument must not be 0.");// 1584
      }

      Class138 var3;
      String var4;
      Class581 var9;
      if ((var3 = var1.method1(this.field1536)) instanceof Class144// 1479 1537
         && (var9 = Class545.method1689(var4 = ((Class144)var3).method93()).method1912()).method1942() != 1) {// 1037 1166 1174 1417
         this.method1245(var1, "Class '" + var4 + "' is referenced, but cannot be loaded and resolved: '" + var9 + "'.");// 1594
      }

      int var5;
      for (int var10000 = var10 = (var5 = (var15 = var1.method519(this.field1536)).length) - 1; var10000 >= 0; var10000 = --var10) {// 1172 1485 1636
         var3 = var2.method1246().method1305(var5 - 1 - var10);// 1041
         Object var7;
         if ((var7 = var15[var10]) == Class138.field584 || var7 == Class138.field594 || var7 == Class138.field585 || var7 == Class138.field581) {// 989 1309
            var7 = Class138.field591;// 1848
         }

         if (!var3.equals(var7)) {// 1683
            if (var3 instanceof Class137 && var7 instanceof Class137) {// 1728
               Class137 var8 = (Class137)var3;// 1782
               var2.method1248(var1, var8);// 1765
            } else {
               var2.method1245(var1, "Expecting a '" + var7 + "' but found a '" + var3 + "' on the stack.");// 1699
            }
         }
      }

      Class138 var11;
      if ((var11 = var2.method1246().method1305(var5)) != Class138.field579) {// 1735 1946
         if (!(var11 instanceof Class137)) {// 1923
            var2.method1245(var1, "Expecting a reference type as 'objectref' on the stack, not a '" + var11 + "'.");// 1696
         }

         var2.method1248(var1, (Class137)var11);// 1887
         if (!(var11 instanceof Class144)) {// 1751
            if (!(var11 instanceof Class145)) {// 1880
               var2.method1245(var1, "Expecting an ObjectType as 'objectref' on the stack, not a '" + var11 + "'.");// 1693
            } else {
               Class144 var12 = field1535;// 1894
            }
         }

         int var14 = 1;// 1968

         int var16;
         for (int var17 = var16 = 0; var17 < var5; var17 = var16) {// 1813
            Class138 var10001 = var15[var16];// 1852
            var16++;
            var14 += var10001.method2();
         }

         if (var6 != var14) {// 1899
            var2.method1245(var1, "The 'count' argument should probably read '" + var14 + "' but is '" + var6 + "'.");// 1776
         }
      }
   }// 1727 1920

   // $VF: synthetic method
   @Override
   public void method1235 (i2b var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1146
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1390
      }
   }// 1277

   // $VF: synthetic method
   @Override
   public void method1058(Class288 var1) {
   }// 522

   // $VF: synthetic method
   @Override
   public void method1192 (if_icmpne var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1481
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1605
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 1416
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 1145
      }
   }// 1548

   // $VF: synthetic method
   @Override
   public void method1120(Class110 var1) {
   }// 2182

   // $VF: synthetic method
   @Override
   public void method1121(Class287 var1) {
      Class470 var3 = this;

      try {
         Class138 var8;
         if (!((var8 = var3.method1246().method1305(1)) instanceof Class144) && var8 != Class138.field579) {// 2406 2439
            var3.method1245(var1, "Stack next-to-top should be an object reference that's not an array reference, but is '" + var8 + "'.");// 2542
         }

         String var10 = var1.method12(var3.field1536);// 2514
         Class207[] var4 = Class411.method790(var1.method525(var3.field1536).method93()).method346();// 2386 2578
         Class207 var5 = null;// 2388
         int var6;
         int var10000 = var6 = 0;

         while (true) {
            if (var10000 >= var4.length) {
               var20 = var5;// 2435
               break;
            }

            if (var4[var6].method190().equals(var10)) {// 2504
               Class138 var7 = Class138.method151(var4[var6].method20());// 2478
               Class138 var2 = var1.method1(var3.field1536);// 2569
               if (var7.equals(var2)) {// 2407
                  var20 = var5 = var4[var6];// 2428
                  break;// 2479
               }
            }

            var10000 = ++var6;// 2565
         }

         if (var20 == null) {
            throw new Class242("Field not found?!?");// 2579
         } else {
            Class138 var18 = var3.method1246().method1301();// 2523
            Class138 var19;
            Object var16 = var19 = Class138.method151(var5.method20());// 2453 2527
            if (var16 == Class138.field584 || var16 == Class138.field594 || var16 == Class138.field585 || var16 == Class138.field581) {// 2502
               var16 = Class138.field591;// 2581
            }

            if (var19 instanceof Class137) {// 2493
               Object var11 = null;// 2431
               Class137 var21;
               if (var18 instanceof Class137) {// 2417
                  var11 = (Class137)var18;// 2553
                  var21 = (Class137)var11;
                  var3.method1248(var1, (Class137)var11);// 2571
               } else {
                  var3.method1245(var1, "The stack top type '" + var18 + "' is not of a reference type as expected.");// 2574
                  var21 = (Class137)var11;// 2513
               }

               if (!var21.method139((Class138)var16)) {
                  var3.method1245(var1, "The stack top type '" + var18 + "' is not assignment compatible with '" + var16 + "'.");// 2438
               }
            } else if (var16 != var18) {// 2472
               var3.method1245(var1, "The stack top type '" + var18 + "' is not of type '" + var16 + "' as expected.");// 2446
            }

            if (var5.method249()) {// 2384
               Class144 var13 = var1.method525(var3.field1536);// 2494
               Class144 var17 = new Class144(var3.field1533.method190());// 2420
               if (var13.equals(var17) || var17.method162(var13)) {// 2404
                  Class138 var14;
                  if ((var14 = var3.method1246().method1305(1)) == Class138.field579) {// 2549 2557
                     return;// 2552
                  }

                  if (!(var14 instanceof Class144)) {// 2383
                     var3.method1245(var1, "The 'objectref' must refer to an object that's not an array. Found instead: '" + var14 + "'.");// 2592
                  }

                  Class144 var15;
                  if (!(var15 = (Class144)var14).equals(var17) && !var15.method162(var17)) {// 2416 2544
                     var3.method1245(
                        var1,// 2459
                        "The referenced field has the ACC_PROTECTED modifier, and it's a member of the current class or a superclass of the current class. However, the referenced object type '"
                           + var3.method1246().method1301()
                           + "' is not the current class or a subclass of the current class."
                     );
                  }
               }
            }

            if (var5.method254()) {// 2545
               var3.method1245(var1, "Referenced field '" + var5 + "' is static which it shouldn't be.");// 2528
            }
         }
      } catch (ClassNotFoundException var9) {// 2548
         throw new Class242("Missing class: " + var9.toString());// 2563
      }
   }// 2466 2487

   // $VF: synthetic method
   @Override
   public void method1171 (ddiv var1) {
      if (this.method1246().method1301() != Class138.field576) {// 757
         this.method1245(var1, "The value at the stack top is not of type 'double', but of type '" + this.method1246().method1301() + "'.");// 726
      }

      if (this.method1246().method1305(1) != Class138.field576) {// 653
         this.method1245(var1, "The value at the stack next-to-top is not of type 'double', but of type '" + this.method1246().method1305(1) + "'.");// 626
      }
   }// 643

   // $VF: synthetic method
   @Override
   public void method1157(Class6 var1) {
   }// 1372

   // $VF: synthetic method
   @Override
   public void method1127 (ifnull var1) {
      if (!(this.method1246().method1301() instanceof Class137)) {// 1012
         this.method1245(var1, "The value at the stack top is not of a ReferenceType, but of type '" + this.method1246().method1301() + "'.");// 1071
      }

      this.method1248(var1, (Class137)this.method1246().method1301());// 1221
   }// 1306

   // $VF: synthetic method
   @Override
   public void method1103 (bastore var1) {
      Class138 var5 = this.method1246().method1305(2);// 459
      Class138 var3 = this.method1246().method1305(1);// 302
      Class138 var4 = this.method1246().method1305(0);// 203
      this.method1239(var1, var3);// 597
      this.method1242(var1, var4);// 118
      if (this.method1249(var1, var5) && !((Class145)var5).method164().equals(Class138.field584) && !((Class145)var5).method164().equals(Class138.field594)) {// 353 379
         this.method1245(// 165
            var1,
            "The 'arrayref' does not refer to an array with elements of a Type.BYTE or Type.BOOLEAN but to an array of '" + ((Class145)var5).method164() + "'."
         );
      }
   }// 500

   // $VF: synthetic method
   public boolean method1249(Class10 var1, Class138 var2) {
      if (!(var2 instanceof Class145) && !var2.equals(Class138.field579)) {// 336
         this.method1245(var1, "The 'arrayref' does not refer to an array but is of type " + var2 + ".");// 540
      }

      return var2 instanceof Class145;// 57
   }

   // $VF: synthetic method
   @Override
   public void method1186 (fdiv var1) {
      if (this.method1246().method1301() != Class138.field575) {// 1399
         this.method1245(var1, "The value at the stack top is not of type 'float', but of type '" + this.method1246().method1301() + "'.");// 1614
      }

      if (this.method1246().method1305(1) != Class138.field575) {// 1679
         this.method1245(var1, "The value at the stack next-to-top is not of type 'float', but of type '" + this.method1246().method1305(1) + "'.");// 1593
      }
   }// 1400

   // $VF: synthetic method
   @Override
   public void method1083(Class76 var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2225
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2180
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 2230
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2170
      }
   }// 2173

   // $VF: synthetic method
   @Override
   public void method1137(Class84 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 2004
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2125
      }

      if (this.method1246().method1305(1) != Class138.field591) {// 2362
         this.method1245(var1, "The value at the stack next-to-top is not of type 'int', but of type '" + this.method1246().method1305(1) + "'.");// 2063
      }
   }// 2117

   // $VF: synthetic method
   @Override
   public void method1221 (lmul var1) {
      if (this.method1246().method1301() != Class138.field578) {// 2343
         this.method1245(var1, "The value at the stack top is not of type 'long', but of type '" + this.method1246().method1301() + "'.");// 2322
      }

      if (this.method1246().method1305(1) != Class138.field578) {// 2255
         this.method1245(var1, "The value at the stack next-to-top is not of type 'long', but of type '" + this.method1246().method1305(1) + "'.");// 2044
      }
   }// 2150

   // $VF: synthetic method
   @Override
   public void method1128(Class101 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 1635
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 1446
      }
   }// 1065

   // $VF: synthetic method
   @Override
   public void method1133(Class26 var1) {
      if (!this.method1246().method1301().equals(Class138.field591)) {// 479
         this.method1245(var1, "The 'count' at the stack top is not of type '" + Class138.field591 + "' but of type '" + this.method1246().method1301() + "'.");// 347
      }
   }// 529

   // $VF: synthetic method
   @Override
   public void method1098 (iconst_x var1) {
   }// 1374

   // $VF: synthetic method
   @Override
   public void method1129(Class320 var1) {
      if (this.method1246().method1301() != Class138.field591) {// 2078
         this.method1245(var1, "The value at the stack top is not of type 'int', but of type '" + this.method1246().method1301() + "'.");// 2100
      }
   }// 2285

   // $VF: synthetic method
   @Override
   public void method1208(Class25 var1) {
      this.method1238((Class10)var1);// 401
   }// 394
}
