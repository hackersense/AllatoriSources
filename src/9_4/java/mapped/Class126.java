package mapped;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.BitSet;

// $VF: Compiled from lm
public final class Class126 implements Class125 {
   // $VF: synthetic field
   public static boolean field536 = false;
   // $VF: synthetic field
   public PrintWriter field537;
   // $VF: synthetic field
   public BitSet field538;
   // $VF: synthetic field
   public Class208[] field539;
   // $VF: synthetic field
   public String field540;
   // $VF: synthetic field
   public Class129 field541;
   // $VF: synthetic field
   public Class149 field542;

   // $VF: synthetic method
   public final String method97(Class437 var1, int var2) {
      short var4 = (short)var1.readUnsignedByte();// 192
      int var6 = 0;// 321
      int var13 = 0;// 567
      StringBuffer var19;
      (var19 = new StringBuffer(256)).append("<TT>").append(field386[var4]).append("</TT></TD><TD>");// 33 400
      if (var4 == 170 || var4 == 171) {// 552
         int var15;
         var13 = (var15 = var1.method873() % 4) == 0 ? 0 : 4 - var15;// 278 603

         int var16;
         for (int var10000 = var16 = 0; var10000 < var13; var10000 = var16) {// 466
            var16++;
            var1.readByte();// 467
         }

         var6 = var1.readInt();// 59
      }

      StringBuffer var58;
      switch (var4) {// 330
         case 18:
            while (false) {
            }

            int var40 = var1.readUnsignedByte();// 360
            var58 = var19;// 312
            var19.append("<A HREF=\"")
               .append(this.field540)
               .append("_cp.html#cp")
               .append(var40)
               .append("\" TARGET=\"ConstantPool\">")
               .append(Class147.method165(this.field542.method177(var40, this.field542.method174(var40).method142())))
               .append("</a>");
            break;// 501
         case 19:
         case 20:
            short var39 = var1.readShort();// 426
            var58 = var19;// 11
            var19.append("<A HREF=\"")
               .append(this.field540)
               .append("_cp.html#cp")
               .append(var39)
               .append("\" TARGET=\"ConstantPool\">")
               .append(Class147.method165(this.field542.method177(var39, this.field542.method174(var39).method142())))
               .append("</a>");
            break;// 551
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
            int var43;
            if (field536) {// 443
               var43 = var1.readShort();// 166
               field536 = false;// 434
               var58 = var19;
            } else {
               var43 = var1.readUnsignedByte();// 373
               var58 = var19;// 268
            }

            var58.append("%").append(var43);
            var58 = var19;
            break;// 497
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
         case 186:
         case 190:
         case 191:
         case 194:
         case 195:
         default:
            if (field327[var4] > 0) {// 88
               for (int var71 = var2 = 0; var71 < field350[var4].length; var71 = var2) {// 306
                  switch (field350[var4][var2]) {// 8
                     case 8:
                        var58 = var19;// 384

                        while (false) {
                        }

                        var19.append(var1.readUnsignedByte());
                        break;// 130
                     case 9:
                        var58 = var19;// 602
                        var19.append(var1.readShort());
                        break;// 363
                     case 10:
                        var58 = var19;// 35
                        var19.append(var1.readInt());
                        break;// 233
                     default:
                        System.err.println("Unreachable default case reached!");// 256
                        System.exit(-1);// 357
                        var58 = var19;// 182
                  }

                  var2++;
                  var58.append("&nbsp;");
               }
            }

            var58 = var19;// 346
            break;
         case 132:
            int var11;
            short var20;
            if (field536) {// 469
               var11 = var1.readShort();// 249
               var58 = var19;
               var20 = var1.readShort();// 349
               field536 = false;// 196
            } else {
               var11 = var1.readUnsignedByte();// 554
               var58 = var19;
               var20 = var1.readByte();// 429
            }

            var58.append("%").append(var11).append(" ").append(var20);// 506
            var58 = var19;
            break;// 599
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
            int var38 = var1.method873() + var1.readShort() - 1;// 411
            var58 = var19;// 468
            var19.append("<A HREF=\"#code").append(var2).append("@").append(var38).append("\">").append(var38).append("</A>");
            break;// 285
         case 170:
            int var29 = var1.readInt();// 579
            int var32 = var1.readInt();// 555
            int var49 = var1.method873() - 12 - var13 - 1;// 73
            var6 += var49;// 415
            var19.append("<TABLE BORDER=1><TR>");// 398
            int[] var46 = new int[var32 - var29 + 1];// 87
            int var51 = 0;// 586

            for (int var66 = var51; var66 < var46.length; var66 = var51) {
               var46[var51] = var49 + var1.readInt();// 399
               var58 = var19.append("<TH>").append(var29 + var51);// 232
               var51++;
               var58.append("</TH>");
            }

            var19.append("<TH>default</TH></TR>\n<TR>");// 198
            var51 = 0;// 28

            for (int var68 = var51; var68 < var46.length; var68 = var51) {
               var58 = var19.append("<TD><A HREF=\"#code").append(var2).append("@").append(var46[var51]).append("\">").append(var46[var51]);// 588
               var51++;
               var58.append("</A></TD>");
            }

            var58 = var19;// 38
            var19.append("<TD><A HREF=\"#code").append(var2).append("@").append(var6).append("\">").append(var6).append("</A></TD></TR>\n</TABLE>\n");
            break;// 455
         case 171:
            int var50 = var1.readInt();// 39
            int var14 = var1.method873() - 8 - var13 - 1;// 368
            int[] var45 = new int[var50];// 99
            var6 += var14;// 160
            var19.append("<TABLE BORDER=1><TR>");// 40
            int var54 = 0;// 541

            for (int var62 = var54; var62 < var50; var62 = var54) {
               int var56 = var1.readInt();// 550
               var45[var54] = var14 + var1.readInt();// 510
               var58 = var19.append("<TH>").append(var56);// 456
               var54++;
               var58.append("</TH>");
            }

            var19.append("<TH>default</TH></TR>\n<TR>");// 82
            var54 = 0;// 5

            for (int var64 = var54; var64 < var50; var64 = var54) {
               var58 = var19.append("<TD><A HREF=\"#code").append(var2).append("@").append(var45[var54]).append("\">").append(var45[var54]);// 279
               var54++;
               var58.append("</A></TD>");
            }

            var58 = var19;// 470
            var19.append("<TD><A HREF=\"#code").append(var2).append("@").append(var6).append("\">").append(var6).append("</A></TD></TR>\n</TABLE>\n");
            break;// 24
         case 178:
         case 179:
         case 180:
         case 181:
            int var36 = var1.readShort();// 288
            Class190 var17 = (Class190)this.field542.method171(var36, (byte)9);// 129
            int var42 = var17.method17();
            String var22 = Class523.method1504(this.field542.method176(var42, (byte)7), false);// 107 110 437
            var36 = var17.method2();// 221
            String var24 = this.field542.method177(var36, (byte)12);// 444
            if (var22.equals(this.field540)) {// 601
               var19.append("<A HREF=\"")// 193
                  .append(this.field540)
                  .append("_methods.html#field")
                  .append(var24)
                  .append("\" TARGET=Methods>")
                  .append(var24)
                  .append("</A>\n");
               var58 = var19;
            } else {
               var19.append(this.field541.method105(var42)).append(".").append(var24);// 300
               var58 = var19;
            }
            break;
         case 182:
         case 183:
         case 184:
         case 185:
            short var23 = var1.readShort();// 382
            int var35;
            int var59;
            if (var4 == 185) {// 576
               int var8 = var1.readUnsignedByte();// 103
               int var12 = var1.readUnsignedByte();// 548
               Class189 var47 = (Class189)this.field542.method171(var23, (byte)11);// 545
               int var10 = var47.method17();
               String var7 = this.field542.method178(var47);// 162 523
               var35 = var47.method2();// 282
               var59 = var10;
            } else {
               Class188 var30 = (Class188)this.field542.method171(var23, (byte)10);// 339
               int var41 = var30.method17();
               String var27 = this.field542.method178(var30);// 549 596
               var35 = var30.method2();// 499
               var59 = var41;// 145
            }

            String var5 = Class147.method105(var59);
            String var28 = Class147.method165(this.field542.method178(this.field542.method171(var35, (byte)12)));// 390
            Class186 var31 = (Class186)this.field542.method171(var35, (byte)12);// 502
            String var60 = this.field542.method177(var31.method2(), (byte)1);// 172
            String[] var44 = Class523.method1529(var60, false);// 564
            String var48 = Class523.method1535(var60, false);// 48
            var19.append(var5)// 281
               .append(".<A HREF=\"")
               .append(this.field540)
               .append("_cp.html#cp")
               .append(var23)
               .append("\" TARGET=ConstantPool>")
               .append(var28)
               .append("</A>")
               .append("(");
            int var57 = 0;

            for (int var61 = var57; var61 < var44.length; var61 = ++var57) {// 181
               var19.append(Class147.method166(var44[var57]));// 433
               if (var57 < var44.length - 1) {// 125
                  var19.append(", ");// 413
               }
            }

            var58 = var19;// 365
            var19.append("):").append(Class147.method166(var48));
            break;// 366
         case 187:
         case 192:
         case 193:
            short var34 = var1.readShort();// 316
            var58 = var19;// 207
            var19.append(this.field541.method105(var34));
            break;// 275
         case 188:
            var58 = var19;// 266
            var19.append("<FONT COLOR=\"#00FF00\">").append(field354[var1.readByte()]).append("</FONT>");
            break;// 280
         case 189:
            short var33 = var1.readShort();// 237
            var58 = var19;// 133
            var19.append(this.field541.method105(var33));
            break;// 65
         case 196:
            field536 = true;// 15
            var58 = var19;// 385
            var19.append("(wide)");
            break;// 471
         case 197:
            short var9 = var1.readShort();// 544
            byte var18 = var1.readByte();// 114
            var58 = var19;// 460
            var19.append(this.field541.method105(var9)).append(":").append(var18).append("-dimensional");
            break;// 105
         case 200:
         case 201:
            int var53 = var1.method873() + var1.readInt() - 1;// 61
            var58 = var19;// 525
            var19.append("<A HREF=\"#code").append(var2).append("@").append(var53).append("\">").append(var53).append("</A>");
      }

      var58.append("</TD>");
      return var19.toString();// 228
   }

   // $VF: synthetic method
   public void method98(Class208 var1, int var2) {
      Class126 var3 = this;
      String var10003 = var1.method20();// 156
      String[] var5 = Class523.method1529(var10003, false);// 543
      String var4 = Class523.method1535(var10003, false);// 175
      String var10 = Class147.method165(var1.method190());// 167 414
      String var6 = Class523.method1500(Class523.method1515(var1.method17()), " ", "&nbsp;");// 139 319
      Class151[] var7 = var1.method200();// 559
      PrintWriter var10000 = this.field537;// 452
      StringBuilder var10002 = new StringBuilder();
      int var23 = 0;
      var10000.print(
         var10002.insert(0, "<P><B><FONT COLOR=\"#FF0000\">")
            .append(var6)
            .append("</FONT>&nbsp;")
            .append("<A NAME=method")
            .append(var2)
            .append(">")
            .append(Class147.method166(var4))
            .append("</A>&nbsp<A HREF=\"")
            .append(this.field540)
            .append("_methods.html#method")
            .append(var2)
            .append("\" TARGET=Methods>")
            .append(var10)
            .append("</A>(")
            .toString()
      );

      for (int var14 = 0; var23 < var5.length; var23 = ++var14) {// 594
         var3.field537.print(Class147.method166(var5[var14]));// 539
         if (var14 < var5.length - 1) {// 388
            var3.field537.print(",&nbsp;");// 120
         }
      }

      var3.field537.println(")</B></P>");// 347
      Class164 var15 = null;// 298
      byte[] var17 = null;// 42
      if (var7.length > 0) {// 439
         int var24 = 0;
         var3.field537.print("<H4>Attributes</H4><UL>\n");// 529

         for (int var11 = 0; var24 < var7.length; var24 = ++var11) {// 106
            byte var18;
            byte var25;
            if ((var18 = var7[var11].method142()) != -1) {// 445 569
               var25 = var18;
               var3.field537// 425
                  .print(
                     "<LI><A HREF=\""
                        + var3.field540
                        + "_attributes.html#method"
                        + var2
                        + "@"
                        + var11
                        + "\" TARGET=Attributes>"
                        + field523[var18]
                        + "</A></LI>\n"
                  );
            } else {
               var3.field537.print("<LI>" + var7[var11] + "</LI>");// 197
               var25 = var18;// 451
            }

            if (var25 == 2) {
               Class164 var26 = var15 = (Class164)var7[var11];// 49
               Class151[] var8 = var26.method200();// 565
               var17 = var26.method207();// 173
               int var27 = 0;
               var3.field537.print("<UL>");// 448

               for (int var9 = 0; var27 < var8.length; var27 = var9) {// 101
                  byte var19 = var8[var9].method142();// 489
                  var10000 = var3.field537;// 562
                  StringBuilder var32 = new StringBuilder()
                     .append("<LI><A HREF=\"")
                     .append(var3.field540)
                     .append("_attributes.html#")
                     .append("method")
                     .append(var2)
                     .append("@")
                     .append(var11)
                     .append("@")
                     .append(var9)
                     .append("\" TARGET=Attributes>")
                     .append(field523[var19]);
                  var9++;
                  var10000.print(var32.append("</A></LI>\n").toString());
               }

               var3.field537.print("</UL>");// 194
            }
         }

         var3.field537.println("</UL>");// 9
      }

      if (var17 != null) {// 566
         Class437 var12 = new Class437(var17);// 104
         Class437 var29 = var12;
         var12.mark(var12.available());
         var3.method99(var12, var1, var15);// 309
         var12.reset();// 430
         var3.field537.println("<TABLE BORDER=0><TR><TH ALIGN=LEFT>Byte<BR>offset</TH><TH ALIGN=LEFT>Instruction</TH><TH ALIGN=LEFT>Argument</TH>");// 442

         for (int var20 = 0; var29.available() > 0; var29 = var12) {// 345 590
            int var21 = var12.method873();// 449
            String var22 = var3.method97(var12, var2);// 37
            String var13 = "";// 217
            if (var3.field538.get(var21)) {// 577
               var13 = "<A NAME=code" + var2 + "@" + var21 + "></A>";// 481
            }

            Class126 var30;
            if (var12.method873() == var17.length) {// 372
               var4 = "<A NAME=code" + var2 + "@" + var17.length + ">" + var21 + "</A>";// 111
               var30 = var3;
            } else {
               var4 = "" + var21;// 153
               var30 = var3;// 53
            }

            var10000 = var30.field537;
            StringBuilder var33 = new StringBuilder().append("<TR VALIGN=TOP><TD>").append(var4).append("</TD><TD>").append(var13).append(var22);
            var20++;
            var10000.println(var33.append("</TR>").toString());
         }

         var3.field537.println("<TR><TD> </A></TD></TR>");// 393
         var3.field537.println("</TABLE>");// 419
      }
   }// 402

   // $VF: synthetic method
   public Class126(String var1, String var2, Class208[] var3, Class149 var4, Class129 var5) {
      Class126 var8 = this;
      int var9 = 0;
      super();
      this.field540 = var2;// 46
      this.field539 = var3;// 170
      this.field542 = var4;// 553
      this.field541 = var5;// 1 58
      this.field537 = new PrintWriter(new FileOutputStream(var1 + var2 + "_code.html"));
      this.field537.println("<HTML><BODY BGCOLOR=\"#C0C0C0\">");// 190 315

      for (int var7 = 0; var9 < var3.length; var9 = var7) {// 465
         var8.method98(var3[var7], var7++);// 132
      }

      var8.field537.println("</BODY></HTML>");// 534
      var8.field537.close();// 488
   }// 495

   // $VF: synthetic method
   public final void method99(Class437 var1, Class208 var2, Class164 var3) {
      Class437 var12 = var1;
      Class126 var13 = this;
      this.field538 = new BitSet(var1.available());// 214
      if (var3 != null) {// 563
         Class122[] var4;
         int var5 = (var4 = var3.method201()).length;// 14 514

         int var6;
         for (int var35 = var6 = 0; var35 < var5; var35 = var6) {// 374
            var13.field538.set(var4[var6].method17());// 361
            var13.field538.set(var4[var6].method2());// 453
            var13.field538.set(var4[var6++].method30());// 354
         }

         Class151[] var21 = var3.method200();// 560

         int var7;
         for (int var36 = var7 = 0; var36 < var21.length; var36 = ++var7) {// 174
            if (var21[var7].method142() == 5) {// 71
               Class124[] var8 = ((Class160)var21[var7]).method191();// 375

               int var9;
               for (int var37 = var9 = 0; var37 < var8.length; var37 = var9) {// 441
                  int var10;
                  int var11 = (var10 = var8[var9].method84()) + var8[var9].method17();// 547 575
                  var13.field538.set(var10);// 303
                  var9++;
                  var13.field538.set(var11);// 326
               }
               break;
            }
         }
      }

      int var19 = 0;

      for (Class437 var38 = var1; var38.available() > 0; var38 = var12) {
         int var18;
         switch (var18 = var12.readUnsignedByte()) {// 392 598
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
               while (false) {
               }

               int var17 = var12.method873() + var12.readShort() - 1;// 176
               var13.field538.set(var17);// 171
               break;// 124
            case 169:
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
               var12.method870();// 16
               var13.method97(var12, 0);// 121
               break;
            case 170:
            case 171:
               int var20;
               int var22 = (var20 = var12.method873() % 4) == 0 ? 0 : 4 - var20;// 476 542

               int var28;
               for (int var39 = var28 = 0; var39 < var22; var39 = var28) {// 454
                  var28++;
                  var12.readByte();// 343
               }

               int var23 = var12.readInt();// 324
               if (var18 == 170) {// 519
                  var28 = var12.readInt();// 376
                  int var32 = var12.readInt();// 492
                  int var27 = var12.method873() - 12 - var22 - 1;// 482
                  var23 += var27;// 432
                  var13.field538.set(var23);// 67

                  int var34;
                  for (int var41 = var34 = 0; var41 < var32 - var28 + 1; var41 = var34) {// 155
                     int var16 = var27 + var12.readInt();// 2
                     var34++;
                     var13.field538.set(var16);// 505
                  }
                  break;
               }

               var28 = var12.readInt();// 19
               int var26 = var12.method873() - 8 - var22 - 1;// 86
               var23 += var26;// 473
               int var40 = 0;
               var13.field538.set(var23);// 131

               for (int var31 = 0; var40 < var28; var40 = var31) {// 528
                  int var33 = var12.readInt();// 289
                  int var15 = var26 + var12.readInt();// 264
                  var31++;
                  var13.field538.set(var15);// 323
               }
               break;
            case 200:
            case 201:
               int var14 = var12.method873() + var12.readInt() - 1;// 98
               var13.field538.set(var14);// 407
         }

         var19++;// 51
      }
   }// 472
}
