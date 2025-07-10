package mapped;

// $VF: Compiled from tb
public class Class357 {
   // $VF: synthetic field
   public static final int field1074 = 2;
   // $VF: synthetic field
   public static final int field1075 = 8388608;
   // $VF: synthetic field
   public static final int field1076 = 10;
   // $VF: synthetic field
   public Class483 field1077;
   // $VF: synthetic field
   public static final int field1078 = -67108864;
   // $VF: synthetic field
   public int[] field1079;
   // $VF: synthetic field
   public static final int field1080 = 4194314;
   // $VF: synthetic field
   public static final int field1081 = 247;
   // $VF: synthetic field
   public static final int field1082 = 64;
   // $VF: synthetic field
   public static final int field1083 = 4;
   // $VF: synthetic field
   public static final int field1084 = 1048575;
   // $VF: synthetic field
   public static final int field1085 = 128;
   // $VF: synthetic field
   public static final int field1086 = 4;
   // $VF: synthetic field
   public static final int field1087 = 248;
   // $VF: synthetic field
   public static final int field1088 = 4194305;
   // $VF: synthetic field
   public static final int field1089 = 22;
   // $VF: synthetic field
   public static final int field1090 = 67108864;
   // $VF: synthetic field
   public static final int field1091 = 1;
   // $VF: synthetic field
   public static final int field1092 = 0;
   // $VF: synthetic field
   public static final int field1093 = 12582912;
   // $VF: synthetic field
   public static final int field1094 = 4194308;
   // $VF: synthetic field
   public static final int field1095 = 6;
   // $VF: synthetic field
   public static final int field1096 = 1048576;
   // $VF: synthetic field
   public static final int field1097 = 6;
   // $VF: synthetic field
   public static final int field1098 = 8;
   // $VF: synthetic field
   public int field1099;
   // $VF: synthetic field
   public static final int field1100 = 9;
   // $VF: synthetic field
   public int[] field1101;
   // $VF: synthetic field
   public short field1102;
   // $VF: synthetic field
   public int[] field1103;
   // $VF: synthetic field
   public static final int field1104 = 4194306;
   // $VF: synthetic field
   public static final int field1105 = 4194307;
   // $VF: synthetic field
   public static final int field1106 = 26;
   // $VF: synthetic field
   public static final int field1107 = 4194304;
   // $VF: synthetic field
   public static final int field1108 = 4194309;
   // $VF: synthetic field
   public static final int field1109 = 5;
   // $VF: synthetic field
   public static final int field1110 = 11;
   // $VF: synthetic field
   public static final int field1111 = 4194304;
   // $VF: synthetic field
   public static final int field1112 = 20971520;
   // $VF: synthetic field
   public int[] field1113;
   // $VF: synthetic field
   public static final int field1114 = 255;
   // $VF: synthetic field
   public static final int field1115 = 20;
   // $VF: synthetic field
   public static final int field1116 = 3;
   // $VF: synthetic field
   public static final int field1117 = 0;
   // $VF: synthetic field
   public static final int field1118 = 251;
   // $VF: synthetic field
   public static final int field1119 = 252;
   // $VF: synthetic field
   public static final int field1120 = -67108864;
   // $VF: synthetic field
   public static final int field1121 = 12;
   // $VF: synthetic field
   public static final int field1122 = 4194316;
   // $VF: synthetic field
   public static final int field1123 = 4194313;
   // $VF: synthetic field
   public static final int field1124 = 7;
   // $VF: synthetic field
   public static final int field1125 = 16777216;
   // $VF: synthetic field
   public static final int field1126 = 2;
   // $VF: synthetic field
   public static final int field1127 = 20;
   // $VF: synthetic field
   public static final int field1128 = 25165824;
   // $VF: synthetic field
   public static final int field1129 = 62914560;
   // $VF: synthetic field
   public static final int field1130 = 4194315;
   // $VF: synthetic field
   public int[] field1131;
   // $VF: synthetic field
   public static final int field1132 = 4194310;
   // $VF: synthetic field
   public short field1133;

   // $VF: synthetic method
   public void method684(int var1) {
      if (this.field1131 == null) {// 968
         this.field1131 = new int[2];// 936
      }

      int var4 = this.field1131.length;// 691
      if (this.field1099 >= var4) {// 899
         int[] var3 = new int[Math.max(this.field1099 + 1, 2 * var4)];// 788 823
         System.arraycopy(this.field1131, 0, var3, 0, var4);// 897
         this.field1131 = var3;// 927
      }

      this.field1131[this.field1099++] = var1;// 608
   }// 721

   // $VF: synthetic method
   public final int method685() {
      return this.field1103.length;// 156
   }

   // $VF: synthetic method
   public final void method686(Class590 var1, int var2, Object[] var3, int var4, Object[] var5) {
      Object[] var8 = var3;
      Class357 var12 = this;
      int var6 = 0;// 250

      int var7;
      for (int var14 = var7 = 0; var14 < var2; var14 = ++var7) {// 128
         var12.field1113[var6++] = method687(var1, var8[var7]);// 290
         if (var8[var7] == Class572.field2145 || var8[var7] == Class572.field2286) {// 199
            var12.field1113[var6++] = 4194304;// 512
         }
      }

      for (int var15 = var6; var15 < var12.field1113.length; var15 = var6) {// 176
         var12.field1113[var6++] = 4194304;// 171
      }

      var7 = 0;// 568

      for (int var16 = var2 = 0; var16 < var4; var16 = ++var2) {// 152
         if (var5[var2] == Class572.field2145 || var5[var2] == Class572.field2286) {// 311
            var7++;// 98
         }
      }

      var12.field1103 = new int[var4 + var7];// 85
      var2 = 0;// 16

      for (int var17 = var9 = 0; var17 < var4; var17 = ++var9) {// 121
         var12.field1103[var2++] = method687(var1, var5[var9]);// 480
         if (var5[var9] == Class572.field2145 || var5[var9] == Class572.field2286) {// 518
            var12.field1103[var2++] = 4194304;// 472
         }
      }

      var12.field1099 = var12.field1133 = 0;// 261 380
   }// 180

   // $VF: synthetic method
   public static int method687(Class590 var0, Object var1) {
      if (var1 instanceof Integer) {// 413
         return 4194304 | (Integer)var1;// 320
      } else if (var1 instanceof String) {// 478
         String var4 = Class599.method2047((String)var1).method2061();// 212
         return method699(var0, var4, 0);// 365
      } else {
         Class483 var3;
         return ((var3 = (Class483)var1).field1600 & 4) != 0 ? 12582912 | var0.method1962("", var3.field1618) : 16777216 | var0.method1977("", var3);// 225 263 426 532
      }
   }

   // $VF: synthetic method
   public static String method688(String var0) {
      return "Invalid descriptor fragment: " + var0;
   }

   // $VF: synthetic method
   public Class357(Class483 var1) {
      this.field1077 = var1;// 127 355
   }// 496

   // $VF: synthetic method
   public void method689(int var1, int var2) {
      if (this.field1079 == null) {// 451
         this.field1079 = new int[10];// 49
      }

      int var5 = this.field1079.length;// 173
      if (var1 >= var5) {// 448
         int[] var4;
         int[] var10001 = var4 = new int[Math.max(var1 + 1, 2 * var5)];// 101
         System.arraycopy(this.field1079, 0, var4, 0, var5);// 489
         this.field1079 = var10001;// 562
      }

      this.field1079[var1] = var2;// 259
   }// 194

   // $VF: synthetic method
   public static String method690(String var0) {
      return "Invalid descriptor: " + var0;
   }

   // $VF: synthetic method
   public void method691(int var1) {
      if (this.field1133 >= var1) {// 302
         this.field1133 = (short)(this.field1133 - var1);// 203
      } else {
         this.field1102 = (short)(this.field1102 - (var1 - this.field1133));
         this.field1133 = 0;// 353 379
      }
   }// 165

   // $VF: synthetic method
   public int method692(int var1, int var2) {
      int var5 = var1 & -67108864;// 1183
      int var4;
      if ((var4 = var1 & 62914560) == 20971520) {// 1545 1645
         int var7 = var5 + this.field1113[var1 & 1048575];// 1510
         if ((var1 & 1048576) != 0 && (var7 == 4194308 || var7 == 4194307)) {// 1457
            var7 = 4194304;// 1553
         }

         return var7;// 1302
      } else if (var4 != 25165824) {// 1325
         return var1;// 1426
      } else {
         int var6 = var5 + this.field1103[var2 - (var1 & 1048575)];// 1383
         if ((var1 & 1048576) != 0 && (var6 == 4194308 || var6 == 4194307)) {// 1532
            var6 = 4194304;// 1509
         }

         return var6;// 995
      }
   }

   // $VF: synthetic method
   public void method693(int var1, int var2, Class552 var3, Class590 var4) {
      switch (var1) {// 676
         case 0:
         case 116:
         case 117:
         case 118:
         case 119:
         case 145:
         case 146:
         case 147:
         case 167:
         case 177:
            return;// 843
         case 1:
            this.method708(4194309);// 687
            return;// 696
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 16:
         case 17:
         case 21:
            this.method708(4194305);// 819
            return;// 814
         case 9:
         case 10:
         case 22:
            this.method708(4194308);
            this.method708(4194304);// 828 896
            return;// 813
         case 11:
         case 12:
         case 13:
         case 23:
            this.method708(4194306);// 753
            return;// 954
         case 14:
         case 15:
         case 24:
            this.method708(4194307);
            this.method708(4194304);// 630 791
            return;// 765
         case 18:
            switch (var3.field1920) {// 650
               case 3:
                  while (false) {
                  }

                  this.method708(4194305);// 746
                  return;// 882
               case 4:
                  this.method708(4194306);// 834
                  return;// 736
               case 5:
                  this.method708(4194308);
                  this.method708(4194304);// 673 891
                  return;// 948
               case 6:
                  this.method708(4194307);
                  this.method708(4194304);// 759 875
                  return;// 742
               case 7:
                  this.method708(8388608 | var4.method1998("java/lang/Class"));// 740
                  return;// 732
               case 8:
                  this.method708(8388608 | var4.method1998("java/lang/String"));// 869
                  return;// 911
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               default:
                  throw new AssertionError();// 793
               case 15:
                  this.method708(8388608 | var4.method1998("java/lang/invoke/MethodHandle"));// 909
                  return;// 837
               case 16:
                  this.method708(8388608 | var4.method1998("java/lang/invoke/MethodType"));// 903
                  return;// 908
               case 17:
                  this.method706(var4, var3.field1911);// 612
                  return;// 874
            }
         case 19:
         case 20:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 196:
         default:
            throw new IllegalArgumentException();// 1671
         case 25:
            this.method708(this.method702(var2));// 720
            return;// 653
         case 46:
         case 51:
         case 52:
         case 53:
         case 96:
         case 100:
         case 104:
         case 108:
         case 112:
         case 120:
         case 122:
         case 124:
         case 126:
         case 128:
         case 130:
         case 136:
         case 142:
         case 149:
         case 150:
            this.method691(2);
            this.method708(4194305);// 778 792
            return;// 640
         case 47:
         case 143:
            this.method691(2);
            this.method708(4194308);// 724
            this.method708(4194304);// 643 807
            return;// 849
         case 48:
         case 98:
         case 102:
         case 106:
         case 110:
         case 114:
         case 137:
         case 144:
            this.method691(2);
            this.method708(4194306);// 717 925
            return;// 783
         case 49:
         case 138:
            this.method691(2);
            this.method708(4194307);// 839
            this.method708(4194304);// 607 918
            return;// 641
         case 50:
            this.method691(1);// 842
            int var20;
            this.method708((var20 = this.method696()) == 4194309 ? var20 : -67108864 + var20);// 779 785
            return;// 946
         case 54:
         case 56:
         case 58:
            int var19 = this.method696();// 616
            this.method689(var2, var19);// 878
            if (var2 > 0) {// 943
               int var30;
               if ((var30 = this.method702(var2 - 1)) == 4194308 || var30 == 4194307) {// 830 856
                  this.method689(var2 - 1, 4194304);// 957
                  return;
               }

               if ((var30 & 62914560) == 20971520 || (var30 & 62914560) == 25165824) {// 769
                  this.method689(var2 - 1, var30 | 1048576);// 711
                  return;// 636
               }
            }
            break;
         case 55:
         case 57:
            this.method691(1);// 951
            int var18 = this.method696();// 693
            this.method689(var2, var18);// 645
            this.method689(var2 + 1, 4194304);// 963
            if (var2 > 0) {// 707
               int var29;
               if ((var29 = this.method702(var2 - 1)) == 4194308 || var29 == 4194307) {// 794 831
                  this.method689(var2 - 1, 4194304);// 762
                  return;
               }

               if ((var29 & 62914560) == 20971520 || (var29 & 62914560) == 25165824) {// 784
                  this.method689(var2 - 1, var29 | 1048576);// 648
                  return;// 905
               }
            }
            break;
         case 79:
         case 81:
         case 83:
         case 84:
         case 85:
         case 86:
            this.method691(3);// 776
            return;// 797
         case 80:
         case 82:
            this.method691(4);// 761
            return;// 965
         case 87:
         case 153:
         case 154:
         case 155:
         case 156:
         case 157:
         case 158:
         case 170:
         case 171:
         case 172:
         case 174:
         case 176:
         case 191:
         case 194:
         case 195:
         case 198:
         case 199:
            this.method691(1);// 938
            return;// 919
         case 88:
         case 159:
         case 160:
         case 161:
         case 162:
         case 163:
         case 164:
         case 165:
         case 166:
         case 173:
         case 175:
            this.method691(2);// 825
            return;// 872
         case 89:
            int var17;
            this.method708(var17 = this.method696());// 723 898
            this.method708(var17);// 615
            return;// 798
         case 90:
            int var16 = this.method696();// 981
            int var26 = this.method696();// 699
            this.method708(var16);// 970
            this.method708(var26);// 652
            this.method708(var16);// 972
            return;// 679
         case 91:
            int var15 = this.method696();// 623
            int var25 = this.method696();// 827
            int var28 = this.method696();// 656
            this.method708(var15);// 877
            this.method708(var28);// 774
            this.method708(var25);// 716
            this.method708(var15);// 810
            return;// 945
         case 92:
            int var14 = this.method696();// 644
            int var24;
            this.method708(var24 = this.method696());// 667 953
            this.method708(var14);// 701
            this.method708(var24);// 638
            this.method708(var14);// 741
            return;// 913
         case 93:
            int var13 = this.method696();// 713
            int var23 = this.method696();// 955
            int var27 = this.method696();// 773
            this.method708(var23);// 758
            this.method708(var13);// 935
            this.method708(var27);// 664
            this.method708(var23);// 944
            this.method708(var13);// 663
            return;// 706
         case 94:
            int var12 = this.method696();// 708
            int var22 = this.method696();// 731
            int var7 = this.method696();// 894
            int var8 = this.method696();// 749
            this.method708(var22);// 634
            this.method708(var12);// 631
            this.method708(var8);// 862
            this.method708(var7);// 703
            this.method708(var22);// 850
            this.method708(var12);// 692
            return;// 848
         case 95:
            int var11 = this.method696();// 668
            int var6 = this.method696();// 977
            this.method708(var11);// 672
            this.method708(var6);// 754
            return;// 637
         case 97:
         case 101:
         case 105:
         case 109:
         case 113:
         case 127:
         case 129:
         case 131:
            this.method691(4);
            this.method708(4194308);// 906
            this.method708(4194304);// 685 812
            return;// 973
         case 99:
         case 103:
         case 107:
         case 111:
         case 115:
            this.method691(4);
            this.method708(4194307);// 658
            this.method708(4194304);// 889 1276
            return;// 1292
         case 121:
         case 123:
         case 125:
            this.method691(3);
            this.method708(4194308);// 1682
            this.method708(4194304);// 1135 1209
            return;// 1627
         case 132:
            this.method689(var2, 4194305);// 1430
            return;// 1483
         case 133:
         case 140:
            this.method691(1);
            this.method708(4194308);// 1196
            this.method708(4194304);// 1217 1360
            return;// 1429
         case 134:
            this.method691(1);
            this.method708(4194306);// 1191 1315
            return;// 1375
         case 135:
         case 141:
            this.method691(1);
            this.method708(4194307);// 1062
            this.method708(4194304);// 1412 1560
            return;// 1621
         case 139:
         case 190:
         case 193:
            this.method691(1);
            this.method708(4194305);// 1549 1673
            return;// 1118
         case 148:
         case 151:
         case 152:
            this.method691(4);
            this.method708(4194305);// 1010 1047
            return;// 1161
         case 168:
         case 169:
            throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");// 1150
         case 178:
            this.method706(var4, var3.field1911);// 1050
            return;// 1676
         case 179:
            this.method703(var3.field1911);// 1670
            return;// 1492
         case 180:
            this.method691(1);
            this.method706(var4, var3.field1911);// 1367 1616
            return;// 1296
         case 181:
            this.method703(var3.field1911);// 1423
            this.method696();// 1238
            return;// 1134
         case 182:
         case 183:
         case 184:
         case 185:
            this.method703(var3.field1911);// 1298
            if (var1 != 184) {// 1058
               int var10 = this.method696();// 990
               if (var1 == 183 && var3.field1899.charAt(0) == '<') {// 1339
                  this.method684(var10);// 1080
               }
            }

            this.method706(var4, var3.field1911);// 1288
            return;// 1463
         case 186:
            this.method703(var3.field1911);
            this.method706(var4, var3.field1911);// 1253 1433
            return;// 1069
         case 187:
            this.method708(12582912 | var4.method1962(var3.field1911, var2));// 1105
            return;// 1525
         case 188:
            this.method696();// 1338
            switch (var2) {// 1465
               case 4:

                  this.method708(71303177);// 1491
                  return;// 1508
               case 5:
                  this.method708(71303179);// 1255
                  return;// 1266
               case 6:
                  this.method708(71303170);// 1025
                  return;// 1007
               case 7:
                  this.method708(71303171);// 1084
                  return;// 1136
               case 8:
                  this.method708(71303178);// 1444
                  return;// 1035
               case 9:
                  this.method708(71303180);// 1614
                  return;// 1259
               case 10:
                  this.method708(71303169);// 1593
                  return;// 1582
               case 11:
                  this.method708(71303172);// 1538
                  return;// 1028
               default:
                  throw new IllegalArgumentException();// 1564
            }
         case 189:
            String var9;
            String var31 = var9 = var3.field1911;// 1081
            this.method696();// 1494
            if (var31.charAt(0) == '[') {// 1442
               this.method706(var4, method707(var9));// 1633
               return;
            }

            this.method708(75497472 | var4.method1998(var9));// 1138
            return;// 1496
         case 192:
            String var21;
            String var10000 = var21 = var3.field1911;// 1208
            this.method696();// 1087
            if (var10000.charAt(0) == '[') {// 1397
               this.method706(var4, var21);// 1330
               return;
            }

            this.method708(8388608 | var4.method1998(var21));// 1234
            return;// 1506
         case 197:
            this.method691(var2);
            this.method706(var4, var3.field1911);// 1044 1142
            return;// 1321
      }
   }// 1326

   // $VF: synthetic method
   public final boolean method694(Class590 var1, Class357 var2, int var3) {
      Class357 var7 = this;
      boolean var4 = false;// 1541
      int var5 = this.field1113.length;// 1156
      int var6 = this.field1103.length;// 1660
      if (var2.field1113 == null) {// 1320
         var2.field1113 = new int[var5];// 1625
         var4 = true;// 1297
      }

      for (int var10000 = var10 = 0; var10000 < var5; var10000 = var10) {// 1493
         int var8;
         if (var7.field1079 != null && var10 < var7.field1079.length) {// 1171
            int var9;
            if ((var9 = var7.field1079[var10]) == 0) {// 1201 1575
               var8 = var7.field1113[var10];// 1316
            } else {
               var8 = var7.method692(var9, var6);// 1530
            }
         } else {
            var8 = var7.field1113[var10];// 1294
         }

         if (var7.field1131 != null) {// 1262
            var8 = var7.method700(var1, var8);// 1391
         }

         var4 |= method695(var1, var8, var2.field1113, var10++);// 1006
      }

      if (var3 <= 0) {// 1639
         int var12 = var7.field1103.length + var7.field1102;// 1634
         if (var2.field1103 == null) {// 1518
            var2.field1103 = new int[var12 + var7.field1133];// 1546
            var4 = true;// 1286
         }

         int var14;
         for (int var19 = var14 = 0; var19 < var12; var19 = var14) {// 1144
            int var16 = var7.field1103[var14];// 1589
            if (var7.field1131 != null) {// 1663
               var16 = var7.method700(var1, var16);// 1235
            }

            var4 |= method695(var1, var16, var2.field1103, var14++);// 1095
         }

         for (int var20 = var14 = 0; var20 < var7.field1133; var20 = var14) {// 1372
            int var17;
            var3 = var7.method692(var17 = var7.field1101[var14], var6);// 1088 1598
            if (var7.field1131 != null) {// 1336
               var3 = var7.method700(var1, var3);// 1680
            }

            int var23 = var12 + var14;
            var14++;
            var4 |= method695(var1, var3, var2.field1103, var23);// 1109 1543
         }

         return var4;// 1120
      } else {
         for (int var18 = var11 = 0; var18 < var5; var18 = var11) {// 1512
            var4 |= method695(var1, var7.field1113[var11], var2.field1113, var11++);// 987
         }

         if (var2.field1103 == null) {// 1218
            var2.field1103 = new int[1];// 1585
            var4 = true;// 1104
         }

         return var4 | method695(var1, var3, var2.field1103, 0);// 1590 1654
      }
   }

   // $VF: synthetic method
   public static boolean method695(Class590 var0, int var1, int[] var2, int var3) {
      int var4;
      if ((var4 = var2[var3]) == var1) {// 1425 1517
         return false;// 1424
      } else {
         int var8 = var1;// 1264
         if ((var1 & 67108863) == 4194309) {// 1130
            if (var4 == 4194309) {// 1179
               return false;// 1469
            }

            var8 = 4194309;// 1498
         }

         if (var4 == 0) {// 1151
            var2[var3] = var8;// 1214
            return true;// 1620
         } else {
            int var10000;
            if ((var4 & -67108864) == 0 && (var4 & 62914560) != 8388608) {// 1608
               if (var4 == 4194309) {// 1029
                  var1 = (var8 & -67108864) == 0 && (var8 & 62914560) != 8388608 ? 4194304 : var8;// 1098
                  var10000 = var1;
               } else {
                  var10000 = var1 = 4194304;// 1312
               }
            } else {
               if (var8 == 4194309) {// 1557
                  return false;// 1216
               }

               if ((var8 & -4194304) == (var4 & -4194304)) {// 1418
                  int var6;
                  var10000 = (var4 & 62914560) == 8388608// 1086
                     ? (var1 = var8 & -67108864 | 8388608 | var0.method1966(var8 & 1048575, var4 & 1048575))// 1531 1556
                     : (var1 = (var6 = -67108864 + (var8 & -67108864)) | 8388608 | var0.method1998("java/lang/Object"));// 1352 1507
               } else if ((var8 & -67108864) == 0 && (var8 & 62914560) != 8388608) {// 1499
                  var10000 = var1 = 4194304;// 1386
               } else {
                  int var10;
                  if ((var10 = var8 & -67108864) != 0 && (var8 & 62914560) != 8388608) {// 1231 1404
                     var10 += -67108864;// 1281
                  }

                  int var7;
                  if ((var7 = var4 & -67108864) != 0 && (var4 & 62914560) != 8388608) {// 1011 1640
                     var7 += -67108864;// 1576
                  }

                  var10000 = var1 = Math.min(var10, var7) | 8388608 | var0.method1998("java/lang/Object");// 1348 1356
               }
            }

            if (var10000 != var4) {// 1023
               var2[var3] = var1;// 1099
               return true;// 1456
            } else {
               return false;// 1329
            }
         }
      }
   }

   // $VF: synthetic method
   public int method696() {
      return this.field1133 > 0 ? this.field1101[--this.field1133] : 25165824 | -(--this.field1102);// 136 158 342
   }

   // $VF: synthetic method
   public static void method697(Class590 var0, int var1, Class529 var2) {
      int var4;
      if ((var4 = (var1 & -67108864) >> 26) == 0) {// 1093 1096
         int var6 = var1 & 1048575;// 1363
         switch (var1 & 62914560) {// 1042
            case 4194304:
               while (false) {
               }

               var2.method1568(var6);// 1490
               return;// 1607
            case 8388608:
               var2.method1568(7).method1566(var0.method1988(var0.method1974(var6).field1911).field1923);// 1034 1431 1574
               return;// 1353
            case 12582912:
               var2.method1568(8).method1566((int)var0.method1974(var6).field1898);// 1162
               return;// 1403
            case 16777216:
               var2.method1568(8);// 1133
               var0.method1999(var6).method1285(var2);// 1082
               return;// 1054
            default:
               throw new AssertionError();// 1661
         }
      } else {
         StringBuilder var5 = new StringBuilder();// 1079
         int var10000 = var4;// 1165

         while (true) {
            var4--;
            if (var10000 <= 0) {
               Class529 var7;
               if ((var1 & 62914560) == 8388608) {// 1529
                  var7 = var2;
                  var5.append('L').append(var0.method1974(var1 & 1048575).field1911).append(';');// 1019 1369 1438 1536
               } else {
                  switch (var1 & 1048575) {// 1658
                     case 1:
                        while (false) {
                        }

                        var5.append('I');// 1097
                        var7 = var2;
                        break;// 1565
                     case 2:
                        var5.append('F');// 1116
                        var7 = var2;
                        break;// 1244
                     case 3:
                        var5.append('D');// 1450
                        var7 = var2;
                        break;// 1357
                     case 4:
                        var5.append('J');// 1468
                        var7 = var2;
                        break;// 1053
                     case 5:
                     case 6:
                     case 7:
                     case 8:
                     default:
                        throw new AssertionError();// 1655
                     case 9:
                        var5.append('Z');// 1471
                        var7 = var2;
                        break;// 1350
                     case 10:
                        var5.append('B');// 1441
                        var7 = var2;
                        break;// 1249
                     case 11:
                        var5.append('C');// 1123
                        var7 = var2;
                        break;// 1370
                     case 12:
                        var5.append('S');// 1580
                        var7 = var2;
                  }
               }

               var7.method1568(7).method1566(var0.method1988(var5.toString()).field1923);// 1073 1550 1618
               return;// 1194
            }

            var10000 = var4;
            var5.append('[');// 1435
         }
      }
   }

   // $VF: synthetic method
   public final void method698(Class357 var1) {
      this.field1113 = var1.field1113;
      this.field1103 = var1.field1103;// 162
      this.field1102 = 0;// 282
      this.field1079 = var1.field1079;// 503
      this.field1101 = var1.field1101;// 339
      this.field1133 = var1.field1133;// 308
      this.field1099 = var1.field1099;// 596
      this.field1131 = var1.field1131;// 523 549
   }// 499

   // $VF: synthetic method
   public static int method699(Class590 var0, String var1, int var2) {
      switch (var1.charAt(var2)) {// 64
         case 'B':
         case 'C':
         case 'I':
         case 'S':
         case 'Z':
            while (false) {
            }

            return 4194305;// 89
         case 'D':
            return 4194307;// 8
         case 'E':
         case 'G':
         case 'H':
         case 'K':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'T':
         case 'U':
         case 'W':
         case 'X':
         case 'Y':
         default:
            throw new IllegalArgumentException(method690(var1.substring(var2)));// 71
         case 'F':
            return 4194306;// 599
         case 'J':
            return 4194308;// 88
         case 'L':
            String var7 = var1.substring(var2 + 1, var1.length() - 1);// 384
            return 8388608 | var0.method1998(var7);// 130
         case 'V':
            return 0;// 249
         case '[':
            int var6 = var2 + 1;// 602

            for (String var10000 = var1; var10000.charAt(var6) == '['; var6++) {// 363
               var10000 = var1;// 509
            }

            int var5;
            int var8;
            switch (var1.charAt(var6)) {// 271
               case 'B':
                  while (false) {
                  }

                  var5 = 4194314;// 346
                  var8 = var6;
                  break;// 228
               case 'C':
                  var5 = 4194315;// 4
                  var8 = var6;
                  break;// 122
               case 'D':
                  var5 = 4194307;// 431
                  var8 = var6;
                  break;// 563
               case 'E':
               case 'G':
               case 'H':
               case 'K':
               case 'M':
               case 'N':
               case 'O':
               case 'P':
               case 'Q':
               case 'R':
               case 'T':
               case 'U':
               case 'V':
               case 'W':
               case 'X':
               case 'Y':
               default:
                  throw new IllegalArgumentException(method688(var1.substring(var6)));// 224 354
               case 'F':
                  var5 = 4194306;// 508
                  var8 = var6;
                  break;// 517
               case 'I':
                  var5 = 4194305;// 284
                  var8 = var6;
                  break;// 255
               case 'J':
                  var5 = 4194308;// 524
                  var8 = var6;
                  break;// 371
               case 'L':
                  String var4 = var1.substring(var6 + 1, var1.length() - 1);// 514
                  var5 = 8388608 | var0.method1998(var4);// 374
                  var8 = var6;
                  break;// 361
               case 'S':
                  var5 = 4194316;// 219
                  var8 = var6;
                  break;// 13
               case 'Z':
                  var5 = 4194313;// 357
                  var8 = var6;
            }

            return var8 - var2 << 26 | var5;// 560
      }
   }

   // $VF: synthetic method
   public int method700(Class590 var1, int var2) {
      int var8 = var2;
      Class357 var9 = this;
      int var4;
      if (var2 == 4194310 || (var2 & -4194304) == 12582912 || (var2 & -4194304) == 16777216) {// 694
         for (int var10 = var4 = 0; var10 < var9.field1099; var10 = ++var4) {// 838
            int var3;
            int var5 = (var3 = var9.field1131[var4]) & -67108864;// 844 854
            int var6 = var3 & 62914560;// 852
            int var7 = var3 & 1048575;// 829
            if (var6 == 20971520) {// 734
               var3 = var5 + var9.field1113[var7];// 675
               var10 = var8;
            } else {
               if (var6 == 25165824) {// 665
                  var3 = var5 + var9.field1103[var9.field1103.length - var7];// 690
               }

               var10 = var8;// 619
            }

            if (var10 == var3) {
               if (var8 == 4194310) {// 682
                  return 8388608 | var1.method1998(var1.method1975());// 816
               }

               return 8388608 | var1.method1998(var1.method1974(var8 & 1048575).field1911);// 755 777
            }
         }
      }

      return var8;// 722
   }

   // $VF: synthetic method
   public final void method701(Class514 var1) {
      int[] var5 = this.field1113;// 1036
      int var8 = 0;// 1641
      int var4 = 0;// 1495
      int var9 = 0;// 1666

      while (var9 < var5.length) {// 1141
         int var6 = var5[var9];// 992
         var9 += var6 != 4194308 && var6 != 4194307 ? 1 : 2;// 1342
         if (var6 == 4194304) {// 1061
            var4++;// 1163
         } else {
            var8 += var4 + 1;// 1031
            var4 = 0;// 1644
         }
      }

      int[] var15 = this.field1103;// 1083
      var4 = 0;// 1374

      for (int var10000 = var10 = 0; var10000 < var15.length; var10000 = var10) {// 1358 1413 1427
         int var7 = var15[var10];// 1075
         var10000 = var10 + (var7 != 4194308 && var7 != 4194307 ? 1 : 2);// 1461
         var4++;
         var10 = var10000;
      }

      int var16 = var1.method1455(this.field1077.field1618, var8, var4);// 1665
      int var11 = 0;// 1078
      int var18 = var8;// 1192

      while (true) {
         var8--;
         if (var18 <= 0) {
            int var12 = 0;// 1254
            var18 = var4;// 1347

            while (true) {
               var4--;
               if (var18 <= 0) {
                  var1.method1461();// 1464
                  return;// 1205
               }

               int var13 = var15[var12];// 1092
               var12 += var13 != 4194308 && var13 != 4194307 ? 1 : 2;// 1368
               var1.method1459(var16, var13);// 1544
               var18 = var4;
               var16++;
            }
         }

         int var3 = var5[var11];// 1337
         var11 += var3 != 4194308 && var3 != 4194307 ? 1 : 2;// 1175
         var1.method1459(var16, var3);// 1345
         var18 = var8;
         var16++;
      }
   }

   // $VF: synthetic method
   public int method702(int var1) {
      if (this.field1079 != null && var1 < this.field1079.length) {// 187
         int var2;
         if ((var2 = this.field1079[var1]) == 0) {// 120 388
            var2 = this.field1079[var1] = 20971520 | var1;// 347
         }

         return var2;// 42
      } else {
         return 20971520 | var1;// 594
      }
   }

   // $VF: synthetic method
   public void method703(String var1) {
      char var3;
      if ((var3 = var1.charAt(0)) == '(') {// 752 847
         this.method691((Class599.method2054(var1) >> 2) - 1);// 958
      } else if (var3 != 'J' && var3 != 'D') {// 605
         this.method691(1);// 921
      } else {
         this.method691(2);// 712
      }
   }// 698

   // $VF: synthetic method
   public static int method704(Class590 var0, String var1) {
      return 8388608 | var0.method1998(var1);// 168
   }

   // $VF: synthetic method
   public final void method705(Class590 var1, int var2, String var3, int var4) {
      Class357 var5;
      String var10000;
      label41: {
         var5 = this;
         this.field1113 = new int[var4];// 231
         this.field1103 = new int[0];// 420
         var8 = 0;// 454
         if ((var2 & 8) == 0) {// 343
            if ((var2 & 262144) == 0) {// 62
               var10000 = var3;
               this.field1113[var8++] = 8388608 | var1.method1998(var1.method1975());// 126 324
               break label41;
            }

            this.field1113[var8++] = 4194310;// 376
         }

         var10000 = var3;
      }

      Class599[] var9;
      int var10 = (var9 = Class599.method2059(var10000)).length;

      int var6;
      for (int var12 = var6 = 0; var12 < var10; var12 = ++var6) {// 432
         Class599 var7 = var9[var6];
         int var11 = method699(var1, var7.method2061(), 0);// 67 155
         var5.field1113[var8++] = var11;// 2
         if (var11 == 4194308 || var11 == 4194307) {// 505
            var5.field1113[var8++] = 4194304;// 421
         }
      }

      for (int var13 = var8; var13 < var4; var13 = var8) {// 86
         var5.field1113[var8++] = 4194304;// 473
      }
   }// 528

   // $VF: synthetic method
   public void method706(Class590 var1, String var2) {
      int var3 = var2.charAt(0) == '(' ? Class599.method2064(var2) : 0;// 393
      int var5;
      if ((var5 = method699(var1, var2, var3)) != 0) {// 230 419
         this.method708(var5);// 402
         if (var5 == 4194308 || var5 == 4194307) {// 515
            this.method708(4194304);// 112
         }
      }
   }// 535

   // $VF: synthetic method
   public static String method707(String var0) {
      return "[" + var0;
   }

   // $VF: synthetic method
   public void method708(int var1) {
      if (this.field1101 == null) {// 590
         this.field1101 = new int[10];// 309
      }

      int var2 = this.field1101.length;// 442
      if (this.field1133 >= var2) {// 344
         int[] var4 = new int[Math.max(this.field1133 + 1, 2 * var2)];// 345
         System.arraycopy(this.field1101, 0, var4, 0, var2);// 449
         this.field1101 = var4;// 37
      }

      this.field1101[this.field1133++] = var1;// 195
      short var5;
      if ((var5 = (short)(this.field1102 + this.field1133)) > this.field1077.field1617) {// 351 481
         this.field1077.field1617 = var5;// 75
      }
   }// 111
}
