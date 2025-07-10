package mapped;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

// $VF: Compiled from mc
public abstract class Class523 {
   // $VF: synthetic field
   public static int[] field1768 = new int[256];
   // $VF: synthetic field
   public static int[] field1769 = new int[48];
   // $VF: synthetic field
   public static ThreadLocal field1770 = new Class511();
   // $VF: synthetic field
   public static final char field1771 = '$';
   // $VF: synthetic field
   public static boolean field1772 = false;
   // $VF: synthetic field
   public static final int field1773 = 48;

   // $VF: synthetic method
   public static int method1499(ThreadLocal var0) {
      return (Integer)var0.get();// 533
   }

   // $VF: synthetic method
   public static final String method1500(String var0, String var1, String var2) {
      String var3 = var0;
      StringBuffer var5 = new StringBuffer();// 828

      try {
         if (var3.indexOf(var1) != -1) {// 813
            int var7 = 0;// 611
            String var10000 = var3;// 669

            int var4;
            while ((var4 = var10000.indexOf(var1, var7)) != -1) {
               var10000 = var3;
               var5.append(var3.substring(var7, var4));// 760
               var5.append(var2);// 753
               var7 = var4 + var1.length();// 954
            }

            var5.append(var3.substring(var7));// 858
            var3 = var5.toString();// 928
         }
      } catch (StringIndexOutOfBoundsException var6) {// 791
         System.err.println(var6);// 765
      }

      return var3;// 650
   }

   // $VF: synthetic method
   public static final String method1501(String var0) {
      return method1535(var0, true);// 379
   }

   // $VF: synthetic method
   public static final boolean method1502(int var0, int var1) {
      return (var0 & method1526(var1)) != 0;// 489
   }

   static {
      int var0 = 0;// 1590

      int var1;
      for (int var10000 = var1 = 65; var10000 <= 90; var10000 = ++var1) {// 1067
         field1769[var0] = var1;// 1225
         field1768[var1] = var0++;// 1005 1452
      }

      for (int var4 = var1 = 103; var4 <= 122; var4 = ++var1) {// 1634
         field1769[var0] = var1;// 1518
         field1768[var1] = var0++;// 1286 1546
      }

      field1769[var0] = 36;// 1132
      field1768[36] = var0++;// 1332 1488
      field1769[var0] = 95;// 1144
      field1768[95] = var0;// 1589
   }// 1663

   // $VF: synthetic method
   public static final String method1503(Object[] var0, boolean var1) {
      return method1543(var0, var1, false);// 1142
   }

   // $VF: synthetic method
   public static final String method1504(String var0, boolean var1) {
      return method1524(var0, "java.lang.", var1);// 539
   }

   // $VF: synthetic method
   public static final String method1505(Object[] var0) {
      return method1503(var0, true);// 1234
   }

   // $VF: synthetic method
   public static final boolean method1506(byte[] var0, byte[] var1) {
      byte[] var3 = var0;
      int var2;
      if ((var2 = var0.length) != var1.length) {// 1136
         return false;// 1229
      } else {
         for (int var10000 = var4 = 0; var10000 < var2; var10000 = ++var4) {// 1028
            if (var3[var4] != var1[var4]) {// 1643
               return false;// 1564
            }
         }

         return true;// 1561
      }
   }

   // $VF: synthetic method
   public static final int method1507(int var0, int var1) {
      return var0 | method1526(var1);// 439
   }

   // $VF: synthetic method
   public static void method1508(ThreadLocal var0, int var1) {
      var0.set(new Integer(var1));// 170
   }// 553

   // $VF: synthetic method
   public static final String method1509(String var0, boolean var1) {
      String var2 = var0;
      method1508(field1770, 1);// 779

      String var9;
      try {
         switch (var2.charAt(0)) {// 946
            case 'B':
               var9 = "byte";// 901
               break;
            case 'C':
               return "char";// 616
            case 'D':
               return "double";// 943
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
               throw new Class239("Invalid signature: `" + var2 + "'");// 646
            case 'F':
               return "float";// 830
            case 'I':
               return "int";// 769
            case 'J':
               return "long";// 718
            case 'L':
               int var7;
               if ((var7 = var2.indexOf(59)) < 0) {// 711 859
                  throw new Class239("Invalid signature: " + var2);// 636
               }

               method1508(field1770, var7 + 1);// 857
               return method1504(var2.substring(1, var7), var1);// 951
            case 'S':
               return "short";// 963
            case 'V':
               return "void";// 761
            case 'Z':
               return "boolean";// 794
            case '[':
               StringBuffer var4 = new StringBuffer();// 808
               int var6 = 0;// 781
               var9 = var2;

               while (var9.charAt(var6) == '[') {
                  var9 = var2;
                  var6++;
                  var4.append("[]");// 905
               }

               String var8 = method1509(var2.substring(var6), var1);// 809
               int var3 = method1499(field1770) + var6;// 729 983
               method1508(field1770, var3);// 776
               return var8 + var4.toString();// 797
         }
      } catch (StringIndexOutOfBoundsException var5) {// 728
         throw new Class239("Invalid signature: " + var5 + ":" + var2);// 766
      }

      while (false) {
      }

      return var9;
   }

   // $VF: synthetic method
   public static final String method1510(String var0) {
      return method1504(var0, true);// 171
   }

   // $VF: synthetic method
   public static final String method1511(byte[] var0) {
      byte[] var1 = var0;
      StringBuffer var5 = new StringBuffer();// 1676

      int var2;
      for (int var10000 = var2 = 0; var10000 < var1.length; var10000 = ++var2) {// 1389
         short var3;
         String var4 = Integer.toString(var3 = method1537(var1[var2]), 16);// 1492 1670
         if (var3 < 16) {// 1245
            var5.append('0');// 1616
         }

         var5.append(var4);// 1296
         if (var2 < var1.length - 1) {// 1228
            var5.append(' ');// 1423
         }
      }

      return var5.toString();// 1610
   }

   // $VF: synthetic method
   public static final String method1512(String var0, String var1, String var2) {
      return method1534(var0, var1, var2, true);// 936
   }

   // $VF: synthetic method
   public static final String method1513(String var0) {
      char[] var1 = var0.toCharArray();// 1647
      StringBuffer var4 = new StringBuffer();// 1386

      int var3;
      for (int var10000 = var3 = 0; var10000 < var1.length; var10000 = ++var3) {// 1378
         switch (var1[var3]) {// 1029
            case '\n':
               while (false) {
               }

               var4.append("\\n");// 1107
               break;// 1251
            case '\r':
               var4.append("\\r");// 1153
               break;// 1233
            case '"':
               var4.append("\\\"");// 1653
               break;// 1023
            case '\'':
               var4.append("\\'");// 1456
               break;// 1212
            case '\\':
               var4.append("\\\\");// 1110
               break;// 1143
            default:
               var4.append(var1[var3]);// 1664
         }
      }

      return var4.toString();// 1631
   }

   // $VF: synthetic method
   public static final String method1514(String var0, String[] var1) {
      StringBuffer var4 = new StringBuffer("(");// 590
      int var2;
      if (var1 != null) {// 430
         for (int var10000 = var2 = 0; var10000 < var1.length; var10000 = var2) {// 442
            if ((var0 = method1518(var1[var2])).endsWith("V")) {// 344 345
               throw new Class239("Invalid type: " + var1[var2]);// 449
            }

            var2++;
            var4.append(var0);// 217
         }
      }

      var0 = method1518(var0);// 490
      var4.append(")").append(var0);// 577
      return var4.toString();// 481
   }

   // $VF: synthetic method
   public static final String method1515(int var0) {
      return method1516(var0, false);// 240
   }

   // $VF: synthetic method
   public static final String method1516(int var0, boolean var1) {
      int var3 = var0;
      StringBuffer var2 = new StringBuffer();// 398
      int var5 = 0;// 428
      int var4 = 0;
      int var10000 = var5;

      while (var10000 < 16384) {
         var5 = method1526(var4);// 586
         if ((var3 & var5) != 0 && (!var1 || var5 != 32 && var5 != 512)) {// 399 588
            var2.append(Class125.field344[var4]).append(" ");// 38
         }

         var4++;// 87
         var10000 = var5;
      }

      return var2.toString().trim();// 455
   }

   // $VF: synthetic method
   public static final String method1517(String var0) {
      return method1509(var0, true);// 681
   }

   // $VF: synthetic method
   public static String method1518(String var0) {
      StringBuffer var6 = new StringBuffer();// 617
      char[] var7 = var0.toCharArray();// 719
      int var3 = 0;// 938
      boolean var4 = false;
      int var5 = -1;// 919

      int var1;
      label67:
      for (int var10000 = var1 = 0; var10000 < var7.length; var10000 = ++var1) {// 879
         switch (var7[var1]) {// 803
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
               while (false) {
               }

               if (var3) {// 704
                  var4 = true;// 887
               }
               break;
            case '[':
               if (!var3) {// 872
                  throw new RuntimeException("Illegal type: " + var0);// 860
               }

               var5 = var1;// 723
               break label67;// 615
            default:
               var3 = 1;// 635
               if (!var4) {// 981
                  var6.append(var7[var1]);// 699
               }
         }
      }

      var1 = 0;// 679
      if (var5 > 0) {// 888
         var1 = method1528(var0.substring(var5));// 623
      }

      String var11 = var6.toString();// 656
      var6.setLength(0);// 877

      for (int var13 = var8 = 0; var13 < var1; var13 = var8) {// 774
         var8++;
         var6.append('[');// 716
      }

      boolean var9 = false;// 945

      for (int var14 = var3 = 4; var14 <= 12 && !var9; var14 = ++var3) {// 743
         if (Class125.field354[var3].equals(var11)) {// 644
            var9 = true;// 953
            var6.append(Class125.field204[var3]);// 667
         }
      }

      if (!var9) {// 741
         var6.append('L').append(var11.replace('.', '/')).append(';');// 913
      }

      return var6.toString();// 713
   }

   // $VF: synthetic method
   public static final String method1519(String var0, int var1, boolean var2, char var3) {
      int var6;
      char[] var7 = new char[(var6 = var1 - var0.length()) < 0 ? 0 : var6];// 1101 1444

      int var4;
      for (int var9 = var4 = 0; var9 < var7.length; var9 = var4) {// 1035
         var7[var4++] = var3;// 1399
      }

      return var2 ? var0 + new String(var7) : new StringBuilder().insert(0, new String(var7)).append(var0).toString();// 1259 1582 1679
   }

   // $VF: synthetic method
   public static final String method1520(Class437 var0, Class149 var1, boolean var2) {
      Class437 var3 = var0;
      short var12 = (short)var0.readUnsignedByte();// 50
      int var4 = 0;// 253
      int var10 = 0;// 443
      StringBuffer var17 = new StringBuffer(Class125.field386[var12]);// 166
      if (var12 == 170 || var12 == 171) {// 72
         int var13;
         var10 = (var13 = var0.method873() % 4) == 0 ? 0 : 4 - var13;// 268 497

         int var14;
         for (int var10000 = var14 = 0; var10000 < var10; var10000 = ++var14) {// 66
            byte var15;
            if ((var15 = var3.readByte()) != 0) {// 307
               System.err.println("Warning: Padding byte != 0 in " + Class125.field386[var12] + ":" + var15);// 218
            }
         }

         var4 = var3.readInt();// 471
      }

      switch (var12) {// 582
         case 18:
            while (false) {
            }

            int var30 = var3.readUnsignedByte();// 354
            var17.append("\t\t").append(var1.method177(var30, var1.method174(var30).method142())).append(var2 ? " (" + var30 + ")" : "");// 224
            return var17.toString();
         case 19:
         case 20:
            int var29 = var3.readUnsignedShort();// 563
            var17.append("\t\t").append(var1.method177(var29, var1.method174(var29).method142())).append(var2 ? " (" + var29 + ")" : "");// 14
            return var17.toString();
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 169:
            int var31;
            StringBuffer var45;
            if (field1772) {// 532
               var31 = var3.readUnsignedShort();// 297
               field1772 = false;// 426
               var45 = var17;
            } else {
               var31 = var3.readUnsignedByte();// 356
               var45 = var17;// 41
            }

            var45.append("\t\t%").append(var31);
            return var17.toString();
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
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
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
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
         case 91:
         case 92:
         case 93:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
         case 116:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 122:
         case 123:
         case 124:
         case 125:
         case 126:
         case 127:
         case 128:
         case 129:
         case 130:
         case 131:
         case 133:
         case 134:
         case 135:
         case 136:
         case 137:
         case 138:
         case 139:
         case 140:
         case 141:
         case 142:
         case 143:
         case 144:
         case 145:
         case 146:
         case 147:
         case 148:
         case 149:
         case 150:
         case 151:
         case 152:
         case 172:
         case 173:
         case 174:
         case 175:
         case 176:
         case 177:
         case 190:
         case 191:
         case 194:
         case 195:
         default:
            int var39;
            if (Class125.field327[var12] > 0) {// 432
               for (int var44 = var39 = 0; var44 < Class125.field350[var12].length; var44 = ++var39) {// 67
                  var17.append("\t\t");// 155
                  switch (Class125.field350[var12][var39]) {// 2
                     case 8:
                        while (false) {
                        }

                        var17.append(var3.readByte());// 421
                        break;// 583
                     case 9:
                        var17.append(var3.readShort());// 86
                        break;// 473
                     case 10:
                        var17.append(var3.readInt());// 528
                        break;// 289
                     default:
                        System.err.println("Unreachable default case reached!");// 323
                        System.exit(-1);// 458
                  }
               }
            }
            break;
         case 132:
            int var8;
            short var18;
            StringBuffer var43;
            if (field1772) {// 231
               var8 = var3.readUnsignedShort();// 420
               var43 = var17;
               var18 = var3.readShort();// 454
               field1772 = false;// 343
            } else {
               var8 = var3.readUnsignedByte();// 126
               var43 = var17;
               var18 = var3.readByte();// 324
            }

            var43.append("\t\t%").append(var8).append("\t").append(var18);// 376
            return var17.toString();
         case 153:
         case 154:
         case 155:
         case 156:
         case 157:
         case 158:
         case 159:
         case 160:
         case 161:
         case 162:
         case 163:
         case 164:
         case 165:
         case 166:
         case 167:
         case 168:
         case 198:
         case 199:
            var17.append("\t\t#").append(var3.method873() - 1 + var3.readShort());// 520
            return var17.toString();
         case 170:
            int var21 = var3.readInt();// 280
            int var22 = var3.readInt();// 370
            int var33 = var3.method873() - 12 - var10 - 1;// 516
            var4 += var33;// 95
            var17.append("\tdefault = ").append(var4).append(", low = ").append(var21).append(", high = ").append(var22).append("(");// 227
            int[] var32 = new int[var22 - var21 + 1];// 77
            int var36 = 0;

            for (int var42 = var36; var42 < var32.length; var42 = ++var36) {// 288
               var32[var36] = var33 + var3.readInt();
               var17.append(var32[var36]);// 258
               if (var36 < var32.length - 1) {// 107
                  var17.append(", ");// 437
               }
            }

            var17.append(")");// 444
            return var17.toString();
         case 171:
            int var5 = var3.readInt();// 117
            int var11 = var3.method873() - 8 - var10 - 1;// 300
            int[] var6 = new int[var5];// 245
            int[] var9 = new int[var5];// 296
            var4 += var11;// 404
            var17.append("\tdefault = ").append(var4).append(", npairs = ").append(var5).append(" (");// 417
            int var35 = 0;

            for (int var41 = var35; var41 < var5; var41 = ++var35) {// 401
               var6[var35] = var3.readInt();// 394
               var9[var35] = var11 + var3.readInt();// 556
               var17.append("(").append(var6[var35]).append(", ").append(var9[var35]).append(")");// 316
               if (var35 < var5 - 1) {// 207
                  var17.append(", ");// 275
               }
            }

            var17.append(")");// 496
            return var17.toString();
         case 178:
         case 179:
         case 180:
         case 181:
            int var28 = var3.readUnsignedShort();// 105
            var17.append("\t\t").append(var1.method177(var28, (byte)9)).append(var2 ? " (" + var28 + ")" : "");// 183
            return var17.toString();
         case 182:
         case 183:
         case 184:
            int var27 = var3.readUnsignedShort();// 602
            var17.append("\t").append(var1.method177(var27, (byte)10)).append(var2 ? " (" + var27 + ")" : "");// 363
            return var17.toString();
         case 185:
            int var26 = var3.readUnsignedShort();// 256
            int var34 = var3.readUnsignedByte();// 357
            var17.append("\t")// 47
               .append(var1.method177(var26, (byte)11))
               .append(var2 ? " (" + var26 + ")\t" : "")
               .append(var34)
               .append("\t")
               .append(var3.readUnsignedByte());
            return var17.toString();
         case 186:
            int var25 = var3.readUnsignedShort();// 334
            int var37 = var3.readUnsignedShort();// 219
            Class192 var38 = (Class192)var1.method171(var25, (byte)18);// 13
            var17.append("\t").append("<dyn>.").append(var1.method177(var38.method2(), (byte)12));// 333
            if (var2) {// 234
               var17.append(" (" + var25 + "/" + var38.method2() + ")");// 508
               return var17.toString();
            }
            break;
         case 187:
         case 192:
            var17.append("\t");// 554
         case 193:
            int var24 = var3.readUnsignedShort();// 506
            var17.append("\t<").append(var1.method177(var24, (byte)7)).append(">").append(var2 ? " (" + var24 + ")" : "");// 599
            return var17.toString();
         case 188:
            var17.append("\t\t<").append(Class125.field354[var3.readByte()]).append(">");// 65
            return var17.toString();
         case 189:
            int var23 = var3.readUnsignedShort();// 441
            var17.append("\t\t<").append(method1504(var1.method176(var23, (byte)7), false)).append(">").append(var2 ? " (" + var23 + ")" : "");// 575
            return var17.toString();
         case 196:
            field1772 = true;// 501
            var17.append("\t(wide)");// 337
            return var17.toString();
         case 197:
            int var7 = var3.readUnsignedShort();// 546
            int var16 = var3.readUnsignedByte();// 341
            var17.append("\t<").append(method1504(var1.method176(var7, (byte)7), false)).append(">\t").append(var16).append(var2 ? " (" + var7 + ")" : "");// 51
            return var17.toString();
         case 200:
         case 201:
            var17.append("\t\t#").append(var3.method873() - 1 + var3.readInt());// 281
            return var17.toString();
      }

      return var17.toString();// 150
   }

   // $VF: synthetic method
   public static final String[] method1521(String var0) {
      return method1529(var0, true);// 200
   }

   // $VF: synthetic method
   public static final void method1522(PrintWriter var0, Object[] var1) {
      var0.println(method1503(var1, true));// 1208
   }// 1087

   // $VF: synthetic method
   public static final byte method1523(String var0) {
      byte var10000;
      try {
         switch (var0.charAt(0)) {// 709
            case 'B':
               var10000 = 8;// 917
               break;
            case 'C':
               return 5;// 855
            case 'D':
               return 7;// 925
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
            case 'U':
            case 'W':
            case 'X':
            case 'Y':
            default:
               throw new Class239("Invalid method signature: " + var0);// 1430
            case 'F':
               return 6;// 786
            case 'I':
               return 10;// 840
            case 'J':
               return 11;// 969
            case 'L':
            case 'T':
               return 14;// 1276
            case 'S':
               return 9;// 1627
            case 'V':
               return 12;// 994
            case 'Z':
               return 4;// 1682
            case '[':
               return 13;// 1199
         }
      } catch (StringIndexOutOfBoundsException var1) {
         throw new Class239("Invalid method signature: " + var0);// 1558
      }

      while (false) {
      }

      return var10000;
   }

   // $VF: synthetic method
   public static final String method1524(String var0, String var1, boolean var2) {
      int var4 = var1.length();// 380
      String var3 = var0.replace('/', '.');// 261
      if (var2 && var3.startsWith(var1) && var3.substring(var4).indexOf(46) == -1) {// 180 350
         var3 = var3.substring(var4);// 156
      }

      return var3;// 186
   }

   // $VF: synthetic method
   public static final String method1525(Class437 var0, Class149 var1) {
      return method1520(var0, var1, true);// 262
   }

   // $VF: synthetic method
   public static final int method1526(int var0) {
      return 1 << var0;// 924
   }

   // $VF: synthetic method
   public static byte[] method1527(String var0, boolean var1) {
      char[] var6 = var0.toCharArray();// 1316
      CharArrayReader var7 = new CharArrayReader(var6);// 1273
      Class441 var4 = new Class441(var7);// 1530
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();// 1016
      Class441 var10000 = var4;// 1415

      int var5;
      while ((var5 = var10000.read()) >= 0) {
         var10000 = var4;
         var3.write(var5);// 1333
      }

      var3.close();
      var7.close();// 1243
      var4.close();// 1241
      byte[] var8 = var3.toByteArray();// 1349 1522
      if (var1) {// 1262
         GZIPInputStream var9 = new GZIPInputStream(new ByteArrayInputStream(var8));// 1391
         byte[] var11 = new byte[var8.length * 3];// 1586
         int var10 = 0;// 1006
         GZIPInputStream var13 = var9;// 1551

         while ((var5 = var13.read()) >= 0) {
            var13 = var9;
            int var10002 = var10;
            byte var10003 = (byte)var5;
            var10++;
            var11[var10002] = var10003;// 1159
         }

         var8 = new byte[var10];// 1230
         System.arraycopy(var11, 0, var8, 0, var10);// 1185
      }

      return var8;// 1639
   }

   // $VF: synthetic method
   public static int method1528(String var0) {
      char[] var1 = var0.toCharArray();// 664
      int var4 = 0;// 944
      boolean var5 = false;// 663

      int var2;
      for (int var10000 = var2 = 0; var10000 < var1.length; var10000 = ++var2) {// 706
         switch (var1[var2]) {// 770
            case '[':
               while (false) {
               }

               if (var5) {// 731
                  throw new RuntimeException("Illegally nested brackets:" + var0);// 894
               }

               var5 = true;// 634
               break;// 631
            case ']':
               if (!var5) {// 703
                  throw new RuntimeException("Illegally nested brackets:" + var0);// 850
               }

               var4++;// 660
               var5 = false;// 848
         }
      }

      if (var5) {// 932
         throw new RuntimeException("Illegally nested brackets:" + var0);// 961
      } else {
         return var4;// 622
      }
   }

   // $VF: synthetic method
   public static final String[] method1529(String var0, boolean var1) {
      String var3 = var0;
      ArrayList var2 = new ArrayList();// 293

      try {
         if (var3.charAt(0) != '(') {// 74
            throw new Class239("Invalid method signature: " + var3);// 317
         }

         for (int var5 = 1; var3.charAt(var5) != ')'; var5 += method1499(field1770)) {// 136 294 526
            var2.add(method1509(var3.substring(var5), var1));// 158
         }
      } catch (StringIndexOutOfBoundsException var4) {
         throw new Class239("Invalid method signature: " + var3);// 96
      }

      return (String[])var2.toArray(new String[var2.size()]);// 359
   }

   // $VF: synthetic method
   public static final String method1530(int var0, int var1, boolean var2, char var3) {
      return method1519(Integer.toString(var0), var1, var2, var3);// 1253
   }

   // $VF: synthetic method
   public static final byte method1531(String var0) {
      try {
         if (var0.charAt(0) != '(') {// 980
            throw new Class239("Invalid method signature: " + var0);// 733
         } else {
            return method1523(var0.substring(var0.lastIndexOf(41) + 1));// 640 778
         }
      } catch (StringIndexOutOfBoundsException var1) {
         throw new Class239("Invalid method signature: " + var0);// 606
      }
   }

   // $VF: synthetic method
   public static final String method1532(int var0) {
      return (var0 & 512) != 0 ? "interface" : "class";// 40
   }

   // $VF: synthetic method
   public static final void method1533(PrintStream var0, Object[] var1) {
      var0.println(method1503(var1, true));// 1126
   }// 1138

   // $VF: synthetic method
   public static final String method1534(String var0, String var1, String var2, boolean var3) {
      return method1545(var0, var1, var2, var3, null);// 897
   }

   // $VF: synthetic method
   public static final String method1535(String var0, boolean var1) {
      boolean var3 = var1;
      String var4 = var0;

      try {
         return method1509(var4.substring(var4.lastIndexOf(41) + 1), var3);// 689 921 985
      } catch (StringIndexOutOfBoundsException var2) {
         throw new Class239("Invalid method signature: " + var0);// 698
      }
   }

   // $VF: synthetic method
   public static final String method1536(byte[] var0, Class149 var1, int var2, int var3) {
      return method1541(var0, var1, var2, var3, true);// 238
   }

   // $VF: synthetic method
   public static final short method1537(byte var0) {
      return var0 < 0 ? (short)(256 + var0) : (short)var0;// 1542
   }

   // $VF: synthetic method
   public static boolean method1538(char var0) {
      return var0 >= 'a' && var0 <= 'z' || var0 >= 'A' && var0 <= 'Z' || var0 >= '0' && var0 <= '9' || var0 == '_';// 1219
   }

   // $VF: synthetic method
   public static String method1539(byte[] var0, boolean var1) {
      byte[] var7 = var0;
      if (var1) {// 1282
         ByteArrayOutputStream var5 = new ByteArrayOutputStream();// 1362
         GZIPOutputStream var2;
         (var2 = new GZIPOutputStream(var5)).write(var0, 0, var0.length);// 1280 1527
         var2.close();// 1513
         var5.close();// 1064
         var7 = var5.toByteArray();// 1541
      }

      CharArrayWriter var6 = new CharArrayWriter();// 1439
      Class434 var8 = new Class434(var6);// 1437

      int var3;
      for (int var9 = var3 = 0; var9 < var7.length; var9 = var3) {// 1154
         byte var10001 = var7[var3];// 1156
         var3++;
         var8.write(var10001 & 255);// 1660
      }

      return var6.toString();// 1625
   }

   // $VF: synthetic method
   public static short method1540(String var0) {
      String var1 = var0.toLowerCase(Locale.ENGLISH);// 1375

      for (short var10000 = var2 = 0; var10000 < Class125.field386.length; var10000 = ++var2) {// 1681
         if (Class125.field386[var2].equals(var1)) {// 1600
            return var2;// 1560
         }
      }

      return -1;// 1621
   }

   // $VF: synthetic method
   public static final String method1541(byte[] var0, Class149 var1, int var2, int var3, boolean var4) {
      StringBuffer var5 = new StringBuffer(var0.length * 20);// 27
      Class437 var6 = new Class437(var0);// 242

      try {
         for (int var10000 = var9 = 0; var10000 < var2; var10000 = var9) {// 209
            var9++;
            method1520(var6, var1, var4);// 69
         }

         for (int var10 = 0; var6.available() > 0; var10++) {// 422
            if (var3 < 0 || var10 < var3) {// 464
               String var11 = method1519(var6.method873() + ":", 6, true, ' ');// 25
               var5.append(var11).append(method1520(var6, var1, var4)).append('\n');// 31
            }
         }
      } catch (IOException var8) {// 45
         System.out.println(var5.toString());// 23
         var8.printStackTrace();// 440
         throw new Class239("Byte code error: " + var8);// 248
      }

      return var5.toString();// 411
   }

   // $VF: synthetic method
   public static final int method1542(int var0, int var1) {
      int var3 = method1526(var1);// 383
      return (var0 & var3) == 0 ? var0 : var0 ^ var3;// 197
   }

   // $VF: synthetic method
   public static final String method1543(Object[] var0, boolean var1, boolean var2) {
      Object[] var3 = var0;
      if (var0 == null) {// 1326
         return null;// 1523
      } else {
         StringBuffer var5 = new StringBuffer();// 1188
         if (var1) {// 1519
            var5.append('{');// 1455
         }

         int var4;
         for (int var10000 = var4 = 0; var10000 < var3.length; var10000 = ++var4) {// 1139
            if (var3[var4] != null) {// 1382
               var5.append(var2 ? "\"" : "").append(var3[var4].toString()).append(var2 ? "\"" : "");// 1637
               var10000 = var4;
            } else {
               var5.append("null");// 1401
               var10000 = var4;// 1265
            }

            if (var10000 < var3.length - 1) {
               var5.append(", ");// 1183
            }
         }

         if (var1) {// 1563
            var5.append('}');// 1539
         }

         return var5.toString();// 1510
      }
   }

   // $VF: synthetic method
   public static Class151[] method1544(Class221 var0, List var1) {
      Class221 var3 = var0;
      if (var1.size() == 0) {// 1666
         return null;
      } else {
         try {
            int var4 = 0;// 1342
            int var10 = 0;// 1061

            int var2;
            for (int var10000 = var2 = 0; var10000 < var1.size(); var10000 = ++var2) {// 1031
               if (((Class533)var1.get(var2)).method1584()) {// 1167 1644
                  var4++;
               } else {
                  var10++;// 1503
               }
            }

            ByteArrayOutputStream var14 = new ByteArrayOutputStream();// 1374
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();// 1413
            DataOutputStream var6 = new DataOutputStream(var14);// 1358
            DataOutputStream var7 = new DataOutputStream(var5);// 1075
            int var18 = 0;
            var6.writeShort(var4);// 1427
            var7.writeShort(var10);// 999

            for (int var11 = 0; var18 < var1.size(); var18 = ++var11) {// 1078
               Class533 var8;
               if ((var8 = (Class533)var1.get(var11)).method1584()) {// 1192 1337
                  var8.method1587(var6);
               } else {
                  var8.method1587(var7);// 1175
               }
            }

            var6.close();// 1254
            var7.close();// 1347
            byte[] var12 = var14.toByteArray();// 1368
            byte[] var17 = var5.toByteArray();// 1544
            int var13 = -1;// 1464
            var2 = -1;// 1205
            if (var12.length > 2) {// 1615
               var13 = var3.method106("RuntimeVisibleAnnotations");
            }

            if (var17.length > 2) {// 1648
               var2 = var3.method106("RuntimeInvisibleAnnotations");
            }

            ArrayList var16 = new ArrayList();// 1445
            if (var12.length > 2) {// 1301
               var16.add(new Class155(var13, var12.length, new DataInputStream(new ByteArrayInputStream(var12)), var3.method402()));// 1193
            }

            if (var17.length > 2) {// 1419
               var16.add(new Class156(var2, var17.length, new DataInputStream(new ByteArrayInputStream(var17)), var3.method402()));// 1299
            }

            return (Class151[])var16.toArray(new Class151[var16.size()]);// 1093
         } catch (IOException var9) {// 1096
            System.err.println("IOException whilst processing annotations");// 1363
            var9.printStackTrace();// 1042
            return null;// 1490
         }
      }
   }

   // $VF: synthetic method
   public static final String method1545(String var0, String var1, String var2, boolean var3, Class160 var4) {
      String var5 = var0;
      StringBuffer var11 = new StringBuffer("(");// 816
      int var7 = var2.indexOf("static") >= 0 ? 0 : 1;// 777

      try {
         if (var5.charAt(0) != '(') {// 705
            throw new Class239("Invalid method signature: " + var5);// 697
         }

         int var6 = 1;// 722

         for (String var10000 = var5; var10000.charAt(var6) != ')'; var10000 = var5) {// 613
            String var8 = method1509(var5.substring(var6), var3);// 867
            var11.append(var8);// 768
            if (var4 != null) {// 933
               Class124 var9;
               if ((var9 = var4.method193(var7)) != null) {// 688 744
                  var11.append(" ").append(var9.method93());// 655
               }
            } else {
               var11.append(" arg").append(var7);// 864
            }

            StringBuffer var14;
            if (!"double".equals(var8) && !"long".equals(var8)) {// 950
               var7++;// 750
               var14 = var11;// 787
            } else {
               var7 += 2;// 671
               var14 = var11;
            }

            var14.append(", ");
            var6 += method1499(field1770);// 782
         }

         var12 = method1509(var5.substring(++var6), var3);// 836 929
      } catch (StringIndexOutOfBoundsException var10) {// 956
         throw new Class239("Invalid method signature: " + var5);
      }

      if (var11.length() > 1) {// 610 639 686
         var11.setLength(var11.length() - 2);// 805
      }

      var11.append(")");// 627
      return var2 + (var2.length() > 0 ? " " : "") + var12 + " " + var1 + var11.toString();// 959
   }

   // $VF: synthetic method
   public static Class151[] method1546(Class221 var0, List[] var1) {
      List[] var13 = var1;
      Class221 var15 = var0;
      int[] var10 = new int[var1.length];// 1054
      int var8 = 0;// 1622
      int[] var4 = new int[var1.length];// 1661
      int var5 = 0;// 1119

      try {
         int var6;
         for (int var29 = var6 = 0; var29 < var13.length; var29 = ++var6) {// 1079
            List var7;
            if ((var7 = var13[var6]) != null) {// 1164 1435
               Iterator var3 = var7.iterator();// 1536

               while (var3.hasNext()) {
                  if (((Class533)var3.next()).method1584()) {// 1019 1438
                     int var10002 = var10[var6] + 1;// 1658
                     var8++;// 1017
                     var10[var6] = var10002;
                  } else {
                     int var32 = var4[var6] + 1;// 1441
                     var5++;// 1249
                     var4[var6] = var32;
                  }
               }
            }
         }

         ByteArrayOutputStream var20 = new ByteArrayOutputStream();// 1486
         DataOutputStream var21;
         (var21 = new DataOutputStream(var20)).writeByte(var13.length);// 1097 1453

         int var18;
         for (int var30 = var18 = 0; var30 < var13.length; var30 = ++var18) {// 1565
            var21.writeShort(var10[var18]);// 1116
            if (var10[var18] > 0) {// 1244
               List var9;
               Iterator var2 = (var9 = var13[var18]).iterator();// 1053 1468

               while (var2.hasNext()) {
                  Class533 var11;
                  if ((var11 = (Class533)var2.next()).method1584()) {// 1357 1450
                     var11.method1587(var21);// 1076
                  }
               }
            }
         }

         var21.close();// 1073
         ByteArrayOutputStream var19 = new ByteArrayOutputStream();// 1550
         DataOutputStream var24;
         (var24 = new DataOutputStream(var19)).writeByte(var13.length);// 1194 1656

         int var16;
         for (int var31 = var16 = 0; var31 < var13.length; var31 = ++var16) {// 1045
            var24.writeShort(var4[var16]);// 1481
            if (var4[var16] > 0) {// 1605
               List var27;
               Iterator var25 = (var27 = var13[var16]).iterator();// 1145 1416

               while (var25.hasNext()) {
                  Class533 var22;
                  if (!(var22 = (Class533)var25.next()).method1584()) {// 1106 1548
                     var22.method1587(var24);// 1038
                  }
               }
            }
         }

         var24.close();// 1540
         byte[] var17 = var20.toByteArray();// 1063
         byte[] var28 = var19.toByteArray();// 1169
         int var26 = -1;// 1669
         int var23 = -1;// 1672
         if (var8 > 0) {// 1248
            var26 = var15.method106("RuntimeVisibleParameterAnnotations");// 1476
         }

         if (var5 > 0) {// 1129
            var23 = var15.method106("RuntimeInvisibleParameterAnnotations");// 1515
         }

         ArrayList var14 = new ArrayList();// 1583
         if (var8 > 0) {// 1449
            var14.add(new Class167(var26, var17.length, new DataInputStream(new ByteArrayInputStream(var17)), var15.method402()));// 1514
         }

         if (var5 > 0) {// 1578
            var14.add(new Class166(var23, var28.length, new DataInputStream(new ByteArrayInputStream(var28)), var15.method402()));// 1115
         }

         return (Class151[])var14.toArray(new Class151[var14.size()]);// 1652
      } catch (IOException var12) {// 1380
         System.err.println("IOException whilst processing parameter annotations");// 1285
         var12.printStackTrace();// 1411
         return null;// 1275
      }
   }
}
