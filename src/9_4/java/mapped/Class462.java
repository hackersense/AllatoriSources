package mapped;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

// $VF: Compiled from tc
public class Class462 extends Class460 implements Class463 {
   // $VF: synthetic field
   public Set field1503;
   // $VF: synthetic field
   public Class field1504;
   // $VF: synthetic field
   public Class field1505;
   // $VF: synthetic field
   public final int field1506;
   // $VF: synthetic field
   public final Class130 field1507;
   // $VF: synthetic field
   public final Class149 field1508;
   // $VF: synthetic field
   public Class464 field1509;
   // $VF: synthetic field
   public final Class205 field1510;
   // $VF: synthetic field
   public Class field1511;
   // $VF: synthetic field
   public Class field1512;
   // $VF: synthetic field
   public Set field1513;
   // $VF: synthetic field
   public Class field1514;
   // $VF: synthetic field
   public Class field1515;
   // $VF: synthetic field
   public Class field1516;
   // $VF: synthetic field
   public Set field1517;
   // $VF: synthetic field
   public Class field1518;

   // $VF: synthetic method
   @Override
   public void method1001(Class177 var1) {
      this.method1044(var1, var1.method17(), this.field1516);// 1044
      this.field1507.method131("Unknown attribute '" + Class130.method118(var1) + "'. This attribute is not known in any context!");// 1293
   }// 1671

   // $VF: synthetic method
   @Override
   public void method1028(Class175 var1) {
      this.method1044(var1, var1.method17(), this.field1516);// 793
      String var2;
      if (!(var2 = ((Class191)this.field1508.method174(var1.method17())).method20()).equals("Deprecated")) {// 726 757
         throw new Class235("The Deprecated attribute '" + Class130.method118(var1) + "' is not correctly named 'Deprecated' but '" + var2 + "'.");// 720
      }
   }// 626

   // $VF: synthetic method
   @Override
   public void method1010(Class210 var1) {
   }// 1467

   // $VF: synthetic method
   @Override
   public void method1014(Class184 var1) {
      if (var1.method142() != 4) {// 16
         throw new Class235("Wrong constant tag in '" + Class130.method118(var1) + "'.");// 121
      }
   }// 472

   // $VF: synthetic method
   @Override
   public void method1000(Class190 var1) {
      if (var1.method142() != 9) {// 323
         throw new Class235("Wrong constant tag in '" + Class130.method118(var1) + "'.");// 458
      } else {
         this.method1044(var1, var1.method17(), this.field1504);
         this.method1044(var1, var1.method2(), this.field1505);// 60 572
      }
   }// 348

   // $VF: synthetic method
   @Override
   public void method1027(Class124 var1) {
   }// 1139

   // $VF: synthetic method
   @Override
   public void method1025(Class182 var1) {
      if (var1.method142() != 7) {// 19
         throw new Class235("Wrong constant tag in '" + Class130.method118(var1) + "'.");// 86
      } else {
         this.method1044(var1, var1.method2(), this.field1516);// 131
      }
   }// 289

   // $VF: synthetic method
   public Class462(Class130 var1, Class205 var2, Class527 var3) {
      this(var1, var2);// 65
   }

   // $VF: synthetic method
   @Override
   public void method1012(Class186 var1) {
      if (var1.method142() != 12) {// 167
         throw new Class235("Wrong constant tag in '" + Class130.method118(var1) + "'.");// 414
      } else {
         this.method1044(var1, var1.method17(), this.field1516);
         this.method1044(var1, var1.method2(), this.field1516);// 319 462
      }
   }// 559

   // $VF: synthetic method
   @Override
   public void method1009(Class207 var1) {
      Class207 var6 = var1;
      Class462 var7 = this;
      if (this.field1510.method329()) {// 298
         int var2 = 0;// 42
         if (var1.method163()) {// 439
            var2++;// 529
         }

         if (var1.method249()) {// 569
            var2++;// 445
         }

         if (var1.method252()) {// 327
            var2++;// 527
         }

         if (var2 > 1) {// 197
            throw new Class235(
               "Field '" + Class130.method118(var1) + "' must only have at most one of its ACC_PRIVATE, ACC_PROTECTED, ACC_PUBLIC modifiers set."// 140
            );
         }

         if (var1.method242() && var1.method159()) {// 565
            throw new Class235("Field '" + Class130.method118(var1) + "' must only have at most one of its ACC_FINAL, ACC_VOLATILE modifiers set.");// 173
         }
      } else {
         if (!var1.method252()) {// 562
            throw new Class235("Interface field '" + Class130.method118(var1) + "' must have the ACC_PUBLIC modifier set but hasn't!");// 244
         }

         if (!var1.method254()) {// 259
            throw new Class235("Interface field '" + Class130.method118(var1) + "' must have the ACC_STATIC modifier set but hasn't!");// 194
         }

         if (!var1.method242()) {// 163
            throw new Class235("Interface field '" + Class130.method118(var1) + "' must have the ACC_FINAL modifier set but hasn't!");// 9
         }
      }

      if ((var1.method17() & -224) > 0) {// 229
         this.field1507// 104
            .method131(
               "Field '"
                  + Class130.method118(var1)
                  + "' has access flag(s) other than ACC_PUBLIC, ACC_PRIVATE, ACC_PROTECTED, ACC_STATIC, ACC_FINAL, ACC_VOLATILE, ACC_TRANSIENT set (ignored)."
            );
      }

      this.method1044(var1, var1.method84(), this.field1516);// 430
      String var8;
      if (!Class130.method112(var8 = var1.method190())) {// 344 345
         throw new Class235("Field '" + Class130.method118(var1) + "' has illegal name '" + var1.method190() + "'.");// 449
      } else {
         this.method1044(var1, var1.method30(), this.field1516);
         String var3 = ((Class191)this.field1508.method174(var1.method30())).method20();// 195 577

         try {
            Class138.method151(var3);// 75
         } catch (Class239 var5) {// 111
            throw new Class235("Illegal descriptor (==signature) '" + var3 + "' used by '" + Class130.method118(var1) + "'.");// 587
         }

         String var4 = var8 + var3;// 477
         if (this.field1517.contains(var4)) {// 53
            throw new Class235("No two fields (like '" + Class130.method118(var1) + "') are allowed have same names and descriptors!");// 584
         } else {
            if (this.field1513.contains(var8)) {// 84
               this.field1507.method131("More than one field of name '" + var8 + "' detected (but with different type descriptors). This is very unusual.");// 267
            }

            this.field1517.add(var4);// 419
            this.field1513.add(var8);// 230
            Class151[] var9 = var1.method200();// 515
            int var10 = 0;

            for (int var11 = var10; var11 < var9.length; var11 = ++var10) {// 112
               if (!(var9[var10] instanceof Class161) && !(var9[var10] instanceof Class176) && !(var9[var10] instanceof Class175)) {// 395
                  var7.field1507// 293
                     .method131(
                        "Attribute '"
                           + Class130.method118(var9[var10])
                           + "' as an attribute of Field '"
                           + Class130.method118(var6)
                           + "' is unknown and will therefore be ignored."
                     );
               }

               if (!(var9[var10] instanceof Class161)) {// 322
                  var7.field1507// 74
                     .method131(
                        "Attribute '"
                           + Class130.method118(var9[var10])
                           + "' as an attribute of Field '"
                           + Class130.method118(var6)
                           + "' is not a ConstantValue and is therefore only of use for debuggers and such."
                     );
               }
            }
         }
      }
   }// 526

   // $VF: synthetic method
   @Override
   public void method999(Class189 var1) {
      if (var1.method142() != 11) {// 100
         throw new Class235("Wrong constant tag in '" + Class130.method118(var1) + "'.");// 202
      } else {
         this.method1044(var1, var1.method17(), this.field1504);
         this.method1044(var1, var1.method2(), this.field1505);// 128 290
      }
   }// 199

   // $VF: synthetic method
   @Override
   public void method1034(Class191 var1) {
      if (var1.method142() != 1) {// 187
         throw new Class235("Wrong constant tag in '" + Class130.method118(var1) + "'.");// 595
      }
   }// 539

   // $VF: synthetic method
   @Override
   public void method1007(Class122 var1) {
   }// 1265

   // $VF: synthetic method
   @Override
   public void method1016(Class149 var1) {
   }// 1539

   // $VF: synthetic method
   @Override
   public void method1005(Class205 var1) {
      Class462 var2 = this;
      Class151[] var7 = var1.method200();// 514
      boolean var6 = false;// 374
      boolean var4 = false;// 361
      boolean var5 = new Class466(this.field1510).method1049();// 494

      int var3;
      for (int var10000 = var3 = 0; var10000 < var7.length; var10000 = ++var3) {// 174
         if (!(var7[var3] instanceof Class169) && !(var7[var3] instanceof Class175) && !(var7[var3] instanceof Class162) && !(var7[var3] instanceof Class176)) {// 71
            var2.field1507// 575
               .method131(
                  "Attribute '"
                     + Class130.method118(var7[var3])
                     + "' as an attribute of the ClassFile structure '"
                     + Class130.method118(var1)
                     + "' is unknown and will therefore be ignored."
               );
         }

         Class151[] var8;
         if (var7[var3] instanceof Class169) {// 326
            if (var6) {// 29
               throw new Class235("A ClassFile structure (like '" + Class130.method118(var1) + "') may have no more than one SourceFile attribute.");// 457
            }

            var6 = true;// 328
            var8 = var7;
         } else {
            var8 = var7;// 598
         }

         if (var8[var3] instanceof Class162) {
            boolean var9;
            if (!var4) {// 325
               var4 = true;// 392
               var9 = var5;
            } else {
               if (var5) {// 44
                  throw new Class235(
                     "A Classfile structure (like '"// 362
                        + Class130.method118(var1)
                        + "') must have exactly one InnerClasses attribute if at least one Inner Class is referenced (which is the case). More than one InnerClasses attribute was found."
                  );
               }

               var9 = var5;// 231
            }

            if (!var9) {
               var2.field1507// 420
                  .method131(
                     "No referenced Inner Class found, but InnerClasses attribute '"
                        + Class130.method118(var7[var3])
                        + "' found. Strongly suggest removal of that attribute."
                  );
            }
         }
      }

      if (var5 && !var4) {// 324
         var2.field1507// 432
            .method131(
               "A Classfile structure (like '"
                  + Class130.method118(var1)
                  + "') must have exactly one InnerClasses attribute if at least one Inner Class is referenced (which is the case). No InnerClasses attribute was found."
            );
      }
   }// 155

   // $VF: synthetic method
   @Override
   public void method998(Class188 var1) {
      if (var1.method142() != 10) {// 56
         throw new Class235("Wrong constant tag in '" + Class130.method118(var1) + "'.");// 416
      } else {
         this.method1044(var1, var1.method17(), this.field1504);
         this.method1044(var1, var1.method2(), this.field1505);// 178 427
      }
   }// 262

   // $VF: synthetic method
   @Override
   public void method1021(Class163 var1) {
      this.method1044(var1, var1.method17(), this.field1516);// 1451
      String var2;
      if (!(var2 = ((Class191)this.field1508.method174(var1.method17())).method20()).equals("LineNumberTable")) {// 1081 1561
         throw new Class235("The LineNumberTable attribute '" + Class130.method118(var1) + "' is not correctly named 'LineNumberTable' but '" + var2 + "'.");// 1494
      }
   }// 1222

   // $VF: synthetic method
   @Override
   public void method1015(Class164 var1) {
      Class164 var20 = var1;
      Class462 var21 = this;

      try {
         var21.method1044(var20, var20.method17(), var21.field1516);
         String var4;
         if (!(var4 = ((Class191)var21.field1508.method174(var20.method17())).method20()).equals("Code")) {// 825 860 898
            throw new Class235("The Code attribute '" + Class130.method118(var20) + "' is not correctly named 'Code' but '" + var4 + "'.");// 723
         } else {
            Object var13 = null;// 635
            if (!(var21.field1509.method1046() instanceof Class208)) {// 981
               var21.field1507// 699
                  .method131(
                     "Code attribute '"
                        + Class130.method118(var20)
                        + "' is not declared in a method_info structure but in '"
                        + var21.field1509.method1046()
                        + "'. Ignored."
                  );
            } else {
               var13 = (Class208)var21.field1509.method1046();// 679
               if (var20.method207().length == 0) {// 656
                  throw new Class235("Code array of Code attribute '" + Class130.method118(var20) + "' (method '" + var13 + "') must not be empty.");// 877
               } else {
                  Class122[] var2 = var20.method201();// 945

                  int var5;
                  for (int var35 = var5 = 0; var35 < var2.length; var35 = ++var5) {// 743
                     int var6;
                     if ((var6 = var2[var5].method84()) != 0) {// 644 953
                        var21.method1044(var20, var6, var21.field1504);// 667
                        Class182 var7;
                        Class182 var36 = var7 = (Class182)var21.field1508.method174(var6);// 701
                        var21.method1044(var36, var36.method2(), var21.field1516);// 638
                        String var8;
                        Class581 var10;
                        if ((
                              var10 = Class545.method1689(var8 = ((Class191)var21.field1508.method174(var7.method2())).method20().replace('/', '.'))// 741 832
                                 .method1910()// 713
                           )
                           != Class581.field2340) {// 773
                           throw new Class235(
                              "Code attribute '"// 758
                                 + Class130.method118(var20)
                                 + "' (method '"
                                 + var13
                                 + "') has an exception_table entry '"
                                 + Class130.method118(var2[var5])
                                 + "' that references '"
                                 + var8
                                 + "' as an Exception but it does not pass verification pass 1: "
                                 + var10
                           );
                        }

                        Class205 var11 = Class411.method790(var8);// 706
                        Class205 var12 = Class411.method790(Class138.field580.method93());// 770
                        Class205 var3 = Class411.method790(Class138.field583.method93());// 708
                        Class205 var37 = var11;// 731

                        while (true) {
                           if (var37 == var3) {
                              var38 = var11;// 754
                              break;
                           }

                           if (var11 == var12) {// 894
                              var38 = var11;
                              break;// 749
                           }

                           if ((var10 = Class545.method1689(var11.method20()).method1910()) != Class581.field2340) {// 703 850 862
                              throw new Class235(
                                 "Code attribute '"// 692
                                    + Class130.method118(var20)
                                    + "' (method '"
                                    + var13
                                    + "') has an exception_table entry '"
                                    + Class130.method118(var2[var5])
                                    + "' that references '"
                                    + var8
                                    + "' as an Exception but '"
                                    + var11.method20()
                                    + "' in the ancestor hierachy does not pass verification pass 1: "
                                    + var10
                              );
                           }

                           var37 = var11 = Class411.method790(var11.method20());// 668
                        }

                        if (var38 != var12) {
                           throw new Class235(
                              "Code attribute '"// 637
                                 + Class130.method118(var20)
                                 + "' (method '"
                                 + var13
                                 + "') has an exception_table entry '"
                                 + Class130.method118(var2[var5])
                                 + "' that references '"
                                 + var8
                                 + "' as an Exception but it is not a subclass of '"
                                 + var12.method93()
                                 + "'."
                           );
                        }
                     }
                  }

                  var5 = -1;// 890
                  Class208[] var25 = Class411.method790(Class130.method128(var21.field1507).method1913()).method341();// 984
                  int var27;
                  int var39 = var27 = 0;

                  while (true) {
                     if (var39 >= var25.length) {
                        var39 = var5;// 767
                        break;
                     }

                     if (var13 == var25[var27]) {// 910
                        var39 = var5 = var27;// 967
                        break;// 737
                     }

                     var39 = ++var27;// 817
                  }

                  if (var39 < 0) {
                     throw new Class242("Could not find a known BCEL Method object in the corresponding BCEL JavaClass object.");// 980
                  } else {
                     Class130.method117(var21.field1507)[var5] = new Class485(var20.method30());// 792
                     var27 = 0;// 640
                     Class151[] var29 = var20.method200();// 606

                     for (int var9 = 0; var9 < var29.length; var9++) {// 780
                        Class151[] var41;
                        if (!(var29[var9] instanceof Class163) && !(var29[var9] instanceof Class160)) {// 789
                           Class130 var42 = var21.field1507;// 895
                           StringBuilder var10002 = new StringBuilder().append("Attribute '");
                           var41 = var29;
                           var42.method131(
                              var10002.append(Class130.method118(var29[var9]))
                                 .append("' as an attribute of Code attribute '")
                                 .append(Class130.method118(var20))
                                 .append("' (method '")
                                 .append(var13)
                                 .append("') is unknown and will therefore be ignored.")
                                 .toString()
                           );
                        } else {
                           var21.field1507// 812
                              .method131(
                                 "Attribute '"
                                    + Class130.method118(var29[var9])
                                    + "' as an attribute of Code attribute '"
                                    + Class130.method118(var20)
                                    + "' (method '"
                                    + var13
                                    + "') will effectively be ignored and is only useful for debuggers and such."
                              );
                           var41 = var29;// 709
                        }

                        if (var41[var9] instanceof Class160) {
                           Class160 var31;
                           Class160 var43 = var31 = (Class160)var29[var9];// 917
                           var21.method1044(var43, var43.method17(), var21.field1516);// 855
                           String var32;
                           if (!(var32 = ((Class191)var21.field1508.method174(var31.method17())).method20()).equals("LocalVariableTable")) {// 783 925
                              throw new Class235(
                                 "The LocalVariableTable attribute '"// 786
                                    + Class130.method118(var31)
                                    + "' is not correctly named 'LocalVariableTable' but '"
                                    + var32
                                    + "'."
                              );
                           }

                           Class164 var33 = var20;// 937
                           Class124[] var23 = var31.method191();// 658

                           for (var39 = var22 = 0; var39 < var23.length; var39 = ++var22) {// 1292
                              var21.method1044(var31, var23[var22].method92(), var21.field1516);// 1199
                              String var26;
                              if (!Class130.method127(var26 = ((Class191)var21.field1508.method174(var23[var22].method92())).method20())) {// 994 1284
                                 throw new Class235(
                                    "LocalVariableTable '"// 1209
                                       + Class130.method118(var31)
                                       + "' references a local variable by the name '"
                                       + var26
                                       + "' which is not a legal Java simple name."
                                 );
                              }

                              var21.method1044(var31, var23[var22].method2(), var21.field1516);
                              String var14 = ((Class191)var21.field1508.method174(var23[var22].method2())).method20();// 1283 1627

                              Class138 var15;
                              try {
                                 var15 = Class138.method151(var14);// 1170
                              } catch (Class239 var17) {// 1217
                                 throw new Class235(
                                    "Illegal descriptor (==signature) '"// 1196
                                       + var14
                                       + "' used by LocalVariable '"
                                       + Class130.method118(var23[var22])
                                       + "' referenced by '"
                                       + Class130.method118(var31)
                                       + "'."
                                 );
                              }

                              int var16 = var23[var22].method30();// 1429
                              Class164 var46;
                              if (var15 != Class138.field578 && var15 != Class138.field576) {// 1274
                                 var39 = var16;
                                 var46 = var33;
                              } else {
                                 var39 = var16 + 1;
                                 var46 = var33;
                              }

                              if (var39 >= var46.method30()) {
                                 throw new Class235(
                                    "LocalVariableTable attribute '"// 1315
                                       + Class130.method118(var31)
                                       + "' references a LocalVariable '"
                                       + Class130.method118(var23[var22])
                                       + "' with an index that exceeds the surrounding Code attribute's max_locals value of '"
                                       + var33.method30()
                                       + "'."
                                 );
                              }

                              try {
                                 Class130.method117(var21.field1507)[var5].method1309(var16, var26, var23[var22].method84(), var23[var22].method17(), var15);// 1600
                              } catch (Class236 var18) {// 1062
                                 throw new Class235(
                                    "Conflicting information in LocalVariableTable '"// 1412
                                       + Class130.method118(var31)
                                       + "' found in Code attribute '"
                                       + Class130.method118(var20)
                                       + "' (method '"
                                       + Class130.method118((Class123)var13)
                                       + "'). "
                                       + var18.getMessage()
                                 );
                              }
                           }

                           if (++var27 > var20.method30()) {// 1027 1549
                              throw new Class235(
                                 "Number of LocalVariableTable attributes of Code attribute '"// 1673
                                    + Class130.method118(var20)
                                    + "' (method '"
                                    + Class130.method118((Class123)var13)
                                    + "') exceeds number of local variable slots '"
                                    + var20.method30()
                                    + "' ('There may be no more than one LocalVariableTable attribute per local variable in the Code attribute.')."
                              );
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (ClassNotFoundException var19) {// 1010
         throw new Class242("Missing class: " + var19.toString());// 1161
      }
   }// 970 1150

   // $VF: synthetic method
   @Override
   public void method1004(Class176 var1) {
      this.method1044(var1, var1.method17(), this.field1516);// 643
      String var2;
      if (!(var2 = ((Class191)this.field1508.method174(var1.method17())).method20()).equals("Synthetic")) {// 724 807
         throw new Class235("The Synthetic attribute '" + Class130.method118(var1) + "' is not correctly named 'Synthetic' but '" + var2 + "'.");// 849
      }
   }// 683

   // $VF: synthetic method
   @Override
   public void method1008(Class179 var1) {
      if (var1.method142() != 6) {// 156
         throw new Class235("Wrong constant tag in '" + Class130.method118(var1) + "'.");// 3
      }
   }// 175

   // $VF: synthetic method
   @Override
   public void method1013(Class169 var1) {
      this.method1044(var1, var1.method17(), this.field1516);// 681
      String var4;
      if (!(var4 = ((Class191)this.field1508.method174(var1.method17())).method20()).equals("SourceFile")) {// 742 875
         throw new Class235("The SourceFile attribute '" + Class130.method118(var1) + "' is not correctly named 'SourceFile' but '" + var4 + "'.");// 900
      } else {
         this.method1044(var1, var1.method30(), this.field1516);
         String var5;
         String var10000 = var5 = ((Class191)this.field1508.method174(var1.method30())).method20();// 806 911
         String var3 = var10000.toLowerCase(Locale.ENGLISH);// 947
         if (var10000.indexOf(47) != -1 || var5.indexOf(92) != -1 || var5.indexOf(58) != -1 || var3.lastIndexOf(".java") == -1) {// 908
            this.field1507// 962
               .method131(
                  "SourceFile attribute '"
                     + Class130.method118(var1)
                     + "' has a funny name: remember not to confuse certain parsers working on javap's output. Also, this name ('"
                     + var5
                     + "') is considered an unqualified (simple) file name only."
               );
         }
      }
   }// 874

   // $VF: synthetic method
   @Override
   public void method1018(Class208 var1) {
      Class208 var10 = var1;
      Class462 var11 = this;
      this.method1044(var1, var1.method84(), this.field1516);// 435
      String var2;
      if (!Class130.method125(var2 = var1.method190(), true)) {// 359 581
         throw new Class235("Method '" + Class130.method118(var1) + "' has illegal name '" + var2 + "'.");// 408
      } else {
         this.method1044(var1, var1.method30(), this.field1516);
         String var7 = ((Class191)this.field1508.method174(var1.method30())).method20();// 203 459

         Class138 var4;
         Class138[] var5;
         try {
            var4 = Class138.method150(var7);// 353
            var5 = Class138.method146(var7);// 189
         } catch (Class239 var9) {// 447
            throw new Class235("Illegal descriptor (==signature) '" + var7 + "' used by Method '" + Class130.method118(var1) + "'.");
         }

         Class138 var6 = var4;// 79 154 500
         if (var4 instanceof Class145) {// 861
            var6 = ((Class145)var4).method26();// 752
         }

         Class581 var3;
         if (var6 instanceof Class144 && (var3 = Class545.method1689(((Class144)var6).method93()).method1910()) != Class581.field2340) {// 605 712 958 985
            throw new Class235("Method '" + Class130.method118(var1) + "' has a return type that does not pass verification pass 1: '" + var3 + "'.");// 921
         } else {
            for (int var19 = var14 = 0; var19 < var5.length; var19 = ++var14) {// 811
               if ((var6 = var5[var14]) instanceof Class145) {// 764 821
                  var6 = ((Class145)var6).method26();// 654
               }

               Class581 var8;
               if (var6 instanceof Class144 && (var8 = Class545.method1689(((Class144)var6).method93()).method1910()) != Class581.field2340) {// 632 633 684 892
                  throw new Class235("Method '" + Class130.method118(var1) + "' has an argument type that does not pass verification pass 1: '" + var8 + "'.");// 818
               }
            }

            if (var2.equals("<clinit>") && var5.length != 0) {// 691
               throw new Class235(
                  "Method '"// 899
                     + Class130.method118(var1)
                     + "' has illegal name '"
                     + var2
                     + "'. It's name resembles the class or interface initialization method which it isn't because of its arguments (==descriptor)."
               );
            } else {
               if (this.field1510.method329()) {// 897
                  int var15 = 0;// 927
                  if (var1.method163()) {// 833
                     var15++;// 902
                  }

                  if (var1.method249()) {// 721
                     var15++;// 960
                  }

                  if (var1.method252()) {// 914
                     var15++;// 735
                  }

                  if (var15 > 1) {// 756
                     throw new Class235(
                        "Method '" + Class130.method118(var1) + "' must only have at most one of its ACC_PRIVATE, ACC_PROTECTED, ACC_PUBLIC modifiers set."// 975
                     );
                  }

                  if (var1.method261()) {// 738
                     if (var1.method242()) {// 801
                        throw new Class235("Abstract method '" + Class130.method118(var1) + "' must not have the ACC_FINAL modifier set.");// 873
                     }

                     if (var1.method246()) {// 923
                        throw new Class235("Abstract method '" + Class130.method118(var1) + "' must not have the ACC_NATIVE modifier set.");// 618
                     }

                     if (var1.method163()) {// 854
                        throw new Class235("Abstract method '" + Class130.method118(var1) + "' must not have the ACC_PRIVATE modifier set.");// 844
                     }

                     if (var1.method254()) {// 829
                        throw new Class235("Abstract method '" + Class130.method118(var1) + "' must not have the ACC_STATIC modifier set.");// 734
                     }

                     if (var1.method236()) {// 665
                        throw new Class235("Abstract method '" + Class130.method118(var1) + "' must not have the ACC_STRICT modifier set.");// 690
                     }

                     if (var1.method238()) {// 619
                        throw new Class235("Abstract method '" + Class130.method118(var1) + "' must not have the ACC_SYNCHRONIZED modifier set.");// 682
                     }
                  }
               } else if (!var2.equals("<clinit>")) {// 649
                  if (!var1.method252()) {// 705
                     throw new Class235("Interface method '" + Class130.method118(var1) + "' must have the ACC_PUBLIC modifier set but hasn't!");// 697
                  }

                  if (!var1.method261()) {// 722
                     throw new Class235("Interface method '" + Class130.method118(var1) + "' must have the ACC_STATIC modifier set but hasn't!");// 613
                  }

                  if (var1.method163() || var1.method249() || var1.method254() || var1.method242() || var1.method238() || var1.method246() || var1.method236()) {// 768
                     throw new Class235(
                        "Interface method '"// 864
                           + Class130.method118(var1)
                           + "' must not have any of the ACC_PRIVATE, ACC_PROTECTED, ACC_STATIC, ACC_FINAL, ACC_SYNCHRONIZED, ACC_NATIVE, ACC_ABSTRACT, ACC_STRICT modifiers set."
                     );
                  }
               }

               if (!var2.equals("<init>") || !var1.method254() && !var1.method242() && !var1.method238() && !var1.method246() && !var1.method261()) {// 782 853
                  if (var2.equals("<clinit>")) {// 822
                     if ((var1.method17() & -2049) > 0) {// 627
                        this.field1507// 959
                           .method131(
                              "Class or interface initialization method '"
                                 + Class130.method118(var1)
                                 + "' has superfluous access modifier(s) set: everything but ACC_STRICT is ignored."
                           );
                     }

                     if (var1.method261()) {// 843
                        throw new Class235(
                           "Class or interface initialization method '"// 851
                              + Class130.method118(var1)
                              + "' must not be abstract. This contradicts the Java Language Specification, Second Edition (which omits this constraint) but is common practice of existing verifiers."
                        );
                     }
                  }

                  if ((var1.method17() & -3392) > 0) {// 924
                     this.field1507// 730
                        .method131(
                           "Method '"
                              + Class130.method118(var1)
                              + "' has access flag(s) other than ACC_PUBLIC, ACC_PRIVATE, ACC_PROTECTED, ACC_STATIC, ACC_FINAL, ACC_SYNCHRONIZED, ACC_NATIVE, ACC_ABSTRACT, ACC_STRICT set (ignored)."
                        );
                  }

                  String var16 = var2 + var7;// 868
                  if (this.field1503.contains(var16)) {// 802
                     throw new Class235("No two methods (like '" + Class130.method118(var1) + "') are allowed have same names and desciptors!");// 772
                  } else {
                     this.field1503.add(var16);// 979
                     Class151[] var13 = var1.method200();// 814
                     int var18 = 0;// 920
                     int var12 = 0;

                     for (int var20 = var12; var20 < var13.length; var20 = ++var12) {// 751
                        if (!(var13[var12] instanceof Class164)// 800
                           && !(var13[var12] instanceof Class157)
                           && !(var13[var12] instanceof Class176)
                           && !(var13[var12] instanceof Class175)) {
                           var11.field1507// 611
                              .method131(
                                 "Attribute '"
                                    + Class130.method118(var13[var12])
                                    + "' as an attribute of Method '"
                                    + Class130.method118(var10)
                                    + "' is unknown and will therefore be ignored."
                              );
                        }

                        if (!(var13[var12] instanceof Class164) && !(var13[var12] instanceof Class157)) {// 669
                           var11.field1507// 753
                              .method131(
                                 "Attribute '"
                                    + Class130.method118(var13[var12])
                                    + "' as an attribute of Method '"
                                    + Class130.method118(var10)
                                    + "' is neither Code nor Exceptions and is therefore only of use for debuggers and such."
                              );
                        }

                        if (var13[var12] instanceof Class164 && (var10.method246() || var10.method261())) {// 824
                           throw new Class235(
                              "Native or abstract methods like '"// 858
                                 + Class130.method118(var10)
                                 + "' must not have a Code attribute like '"
                                 + Class130.method118(var13[var12])
                                 + "'."
                           );
                        }

                        if (var13[var12] instanceof Class164) {// 630
                           var18++;// 791
                        }
                     }

                     if (!var10.method246() && !var10.method261() && var18 != 1) {// 650
                        throw new Class235(
                           "Non-native, non-abstract methods like '"// 747
                              + Class130.method118(var10)
                              + "' must have exactly one Code attribute (found: "
                              + var18
                              + ")."
                        );
                     }
                  }
               } else {
                  throw new Class235(
                     "Instance initialization method '"// 956
                        + Class130.method118(var1)
                        + "' must not have any of the ACC_STATIC, ACC_FINAL, ACC_SYNCHRONIZED, ACC_NATIVE, ACC_ABSTRACT modifiers set."
                  );
               }
            }
         }
      }
   }// 882

   // $VF: synthetic method
   @Override
   public void method1022(Class162 var1) {
      Class462 var2 = this;
      this.method1044(var1, var1.method17(), this.field1516);// 915
      String var5;
      if (!(var5 = ((Class191)this.field1508.method174(var1.method17())).method20()).equals("InnerClasses")) {// 779 785
         throw new Class235("The InnerClasses attribute '" + Class130.method118(var1) + "' is not correctly named 'InnerClasses' but '" + var5 + "'.");// 946
      } else {
         Class211[] var6 = var1.method196();// 952

         int var3;
         for (int var10000 = var3 = 0; var10000 < var6.length; var10000 = ++var3) {// 878
            var2.method1044(var1, var6[var3].method84(), var2.field1504);// 943
            int var4;
            if ((var4 = var6[var3].method2()) != 0) {// 830 856
               var2.method1044(var1, var4, var2.field1504);// 957
            }

            if ((var4 = var6[var3].method17()) != 0) {// 718 922
               var2.method1044(var1, var4, var2.field1516);// 971
            }

            if ((var6[var3].method30() & -1568) != 0) {// 636 859 926
               var2.field1507// 880
                  .method131(
                     "Unknown access flag for inner class '"
                        + Class130.method118(var6[var3])
                        + "' set (InnerClasses attribute '"
                        + Class130.method118(var1)
                        + "')."
                  );
            }
         }
      }
   }// 963

   // $VF: synthetic method
   @Override
   public void method1026(Class183 var1) {
      if (var1.method142() != 5) {// 387
         throw new Class235("Wrong constant tag in '" + Class130.method118(var1) + "'.");// 380
      }
   }// 206

   // $VF: synthetic method
   @Override
   public void method1020(Class161 var1) {
      this.method1044(var1, var1.method17(), this.field1516);// 931
      String var4;
      if (!(var4 = ((Class191)this.field1508.method174(var1.method17())).method20()).equals("ConstantValue")) {// 648 781
         throw new Class235("The ConstantValue attribute '" + Class130.method118(var1) + "' is not correctly named 'ConstantValue' but '" + var4 + "'.");// 905
      } else if ((var4 = (String)this.field1509.method1046()) instanceof Class207) {// 678 809
         Class207 var8 = (Class207)var4;// 912
         Class138 var5 = Class138.method151(((Class191)this.field1508.method174(var8.method30())).method20());// 729
         int var2;
         if ((var2 = var1.method30()) >= 0 && var2 < this.field1506) {// 674 797
            Class178 var6 = this.field1508.method174(var2);// 965
            if (!this.field1511.isInstance(var6) || !var5.equals(Class138.field578)) {// 795
               if (!this.field1515.isInstance(var6) || !var5.equals(Class138.field575)) {// 865
                  if (!this.field1512.isInstance(var6) || !var5.equals(Class138.field576)) {// 614
                     if (!this.field1514.isInstance(var6)// 700
                        || !var5.equals(Class138.field591)
                           && !var5.equals(Class138.field581)
                           && !var5.equals(Class138.field585)
                           && !var5.equals(Class138.field594)
                           && !var5.equals(Class138.field584)) {
                        if (!this.field1518.isInstance(var6) || !var5.equals(Class138.field593)) {// 662
                           throw new Class235(
                              "Illegal type of ConstantValue '"// 938
                                 + var1
                                 + "' embedding Constant '"
                                 + var6
                                 + "'. It is referenced by field '"
                                 + Class130.method118(var8)
                                 + "' expecting a different type: '"
                                 + var5
                                 + "'."
                           );
                        }
                     }
                  }
               }
            }
         } else {
            throw new Class235("Invalid index '" + var2 + "' used by '" + Class130.method118(var1) + "'.");// 714
         }
      }
   }// 661 695 725 728 879 939

   // $VF: synthetic method
   public Class462(Class130 var1, Class205 var2) {
      this.field1507 = var1;
      this.field1513 = new HashSet();// 506
      this.field1517 = new HashSet();// 599
      this.field1503 = new HashSet();// 318
      this.field1510 = var2;// 8
      this.field1508 = var2.method94();// 331
      this.field1506 = this.field1508.method2();// 384
      this.field1504 = Class182.class;// 301
      this.field1518 = Class185.class;// 271
      this.field1514 = Class181.class;// 256
      this.field1515 = Class184.class;// 357
      this.field1511 = Class183.class;// 47
      this.field1512 = Class179.class;// 182
      this.field1505 = Class186.class;// 4
      this.field1516 = Class191.class;// 122 306
      this.field1509 = new Class464(var2, this);// 346
      this.field1509.method1040();// 228
   }// 334

   // $VF: synthetic method
   @Override
   public void method1019(Class181 var1) {
      if (var1.method142() != 3) {// 152
         throw new Class235("Wrong constant tag in '" + Class130.method118(var1) + "'.");// 311
      }
   }// 405

   // $VF: synthetic method
   @Override
   public void method1006(Class160 var1) {
   }// 1330

   // $VF: synthetic method
   @Override
   public void method1017(Class185 var1) {
      if (var1.method142() != 8) {// 538
         throw new Class235("Wrong constant tag in '" + Class130.method118(var1) + "'.");// 92
      } else {
         this.method1044(var1, var1.method2(), this.field1516);// 171
      }
   }// 124

   // $VF: synthetic method
   @Override
   public void method1031(Class157 var1) {
      Class462 var2 = this;

      try {
         var2.method1044(var1, var1.method17(), var2.field1516);
         String var7;
         if (!(var7 = ((Class191)var2.field1508.method174(var1.method17())).method20()).equals("Exceptions")) {// 1245 1616 1670
            throw new Class235("The Exceptions attribute '" + Class130.method118(var1) + "' is not correctly named 'Exceptions' but '" + var7 + "'.");// 1367
         } else {
            int[] var5 = var1.method41();// 1423

            for (int var4 = 0; var4 < var5.length; var4++) {// 1134
               var2.method1044(var1, var5[var4], var2.field1504);// 1610
               Class182 var3;
               Class182 var10000 = var3 = (Class182)var2.field1508.method174(var5[var4]);// 1239
               var2.method1044(var10000, var10000.method2(), var2.field1516);// 1039
               Class581 var6;
               String var12;
               if ((var6 = Class545.method1689(var12 = ((Class191)var2.field1508.method174(var3.method2())).method20().replace('/', '.')).method1910())// 990 1298 1339
                  != Class581.field2340) {// 1210
                  throw new Class235(
                     "Exceptions attribute '"// 1570
                        + Class130.method118(var1)
                        + "' references '"
                        + var12
                        + "' as an Exception but it does not pass verification pass 1: "
                        + var6
                  );
               }

               Class205 var11 = Class411.method790(var12);// 1253
               Class205 var8 = Class411.method790(Class138.field580.method93());// 1069
               Class205 var9 = Class411.method790(Class138.field583.method93());// 1137
               Class205 var14 = var11;// 1105

               while (true) {
                  if (var14 == var9) {
                     var15 = var11;// 1399
                     break;
                  }

                  if (var11 == var8) {// 1525
                     var15 = var11;
                     break;// 1566
                  }

                  if ((var6 = Class545.method1689(var11.method20()).method1910()) != Class581.field2340) {// 1268 1491 1508
                     throw new Class235(
                        "Exceptions attribute '"// 1568
                           + Class130.method118(var1)
                           + "' references '"
                           + var12
                           + "' as an Exception but '"
                           + var11.method20()
                           + "' in the ancestor hierachy does not pass verification pass 1: "
                           + var6
                     );
                  }

                  var14 = var11 = Class411.method790(var11.method20());// 1101
               }

               if (var15 != var8) {
                  throw new Class235(
                     "Exceptions attribute '"// 1614
                        + Class130.method118(var1)
                        + "' references '"
                        + var12
                        + "' as an Exception but it is not a subclass of '"
                        + var8.method93()
                        + "'."
                  );
               }
            }
         }
      } catch (ClassNotFoundException var10) {// 1400
         throw new Class242("Missing class: " + var10.toString());// 1007
      }
   }// 1084

   // $VF: synthetic method
   @Override
   public void method1024(Class211 var1) {
   }// 1198

   // $VF: synthetic method
   public void method1044(Class123 var1, int var2, Class var3) {
      if (var2 >= 0 && var2 < this.field1506) {// 333
         Class178 var4 = this.field1508.method174(var2);// 234
         if (!var3.isInstance(var4)) {// 508
            throw new ClassCastException(
               "Illegal constant '" + Class130.method118(var4) + "' at index '" + var2 + "'. '" + Class130.method118(var1) + "' expects a '" + var3 + "'."// 214
            );
         }
      } else {
         throw new Class235("Invalid index '" + var2 + "' used by '" + Class130.method118(var1) + "'.");// 284
      }
   }// 371
}
