package mapped;

import java.io.FileOutputStream;
import java.io.PrintWriter;

// $VF: Compiled from te
public final class Class148 implements Class125 {
   // $VF: synthetic field
   public Class129 field607;
   // $VF: synthetic field
   public String field608;
   // $VF: synthetic field
   public int field609 = 0;
   // $VF: synthetic field
   public Class149 field610;
   // $VF: synthetic field
   public PrintWriter field611;

   // $VF: synthetic method
   public final void method19() {
      this.field611.println("</TABLE></BODY></HTML>");// 377
      this.field611.close();// 604
   }// 22

   // $VF: synthetic method
   public final void method168(Class151 var1, String var2, int var3) {
      Class148 var9 = this;
      byte var4;
      if ((var4 = var1.method142()) != -1) {// 146 400
         this.field609++;// 240
         Class148 var10000;
         if (this.field609 % 2 == 0) {// 246
            var10000 = this;// 552
            this.field611.print("<TR BGCOLOR=\"#C0C0C0\"><TD>");
         } else {
            var10000 = this;// 278
            this.field611.print("<TR BGCOLOR=\"#A0A0A0\"><TD>");
         }

         label93: {
            var10000.field611.println("<H4><A NAME=\"" + var2 + "\">" + this.field609 + " " + field523[var4] + "</A></H4>");// 467
            switch (var4) {// 391
               case 0:
                  while (false) {
                  }

                  int var18 = ((Class169)var1).method30();// 367
                  PrintWriter var41 = this.field611;// 83
                  StringBuilder var47 = new StringBuilder().append("<UL><LI><A HREF=\"");
                  var10000 = this;
                  var41.print(
                     var47.append(this.field608)
                        .append("_cp.html#cp")
                        .append(var18)
                        .append("\" TARGET=\"ConstantPool\">Source file index(")
                        .append(var18)
                        .append(")</A></UL>\n")
                        .toString()
                  );
                  break label93;// 279
               case 1:
                  int var17 = ((Class161)var1).method30();// 160
                  PrintWriter var40 = this.field611;// 63
                  StringBuilder var10002 = new StringBuilder().append("<UL><LI><A HREF=\"");
                  var10000 = this;
                  var40.print(
                     var10002.append(this.field608)
                        .append("_cp.html#cp")
                        .append(var17)
                        .append("\" TARGET=\"ConstantPool\">Constant value index(")
                        .append(var17)
                        .append(")</A></UL>\n")
                        .toString()
                  );
                  break label93;// 510
               case 2:
                  Class164 var19 = (Class164)var1;// 589
                  this.field611// 555
                     .print(
                        "<UL><LI>Maximum stack size = "
                           + var19.method92()
                           + "</LI>\n<LI>Number of local variables = "
                           + var19.method30()
                           + "</LI>\n<LI><A HREF=\""
                           + this.field608
                           + "_code.html#method"
                           + var3
                           + "\" TARGET=Code>Byte code</A></LI></UL>\n"
                     );
                  int var5;
                  Class122[] var20;
                  if ((var5 = (var20 = var19.method201()).length) > 0) {// 87 399 586
                     int var37 = 0;
                     this.field611.print("<P><B>Exceptions handled</B><UL>");// 232

                     for (int var21 = 0; var37 < var5; var37 = var21) {// 463
                        int var23 = var20[var21].method84();// 198
                        var9.field611.print("<LI>");// 424
                        if (var23 != 0) {// 28
                           var9.field611.print(var9.field607.method105(var23));// 588
                           var10000 = var9;
                        } else {
                           var9.field611.print("Any Exception");// 412
                           var10000 = var9;// 257
                        }

                        PrintWriter var39 = var10000.field611;
                        StringBuilder var44 = new StringBuilder()
                           .append("<BR>(Ranging from lines ")
                           .append(var9.method170(var20[var21].method17(), var3))
                           .append(" to ")
                           .append(var9.method170(var20[var21].method2(), var3))
                           .append(", handled at line ")
                           .append(var9.method170(var20[var21].method30(), var3));
                        var21++;
                        var39.print(var44.append(")</LI>").toString());
                     }

                     var10000 = var9;// 142
                     var9.field611.print("</UL>");
                     break label93;// 39
                  }
                  break;
               case 3:
                  int[] var6 = ((Class157)var1).method41();// 470
                  int var35 = 0;
                  this.field611.print("<UL>");// 149

                  for (int var22 = 0; var35 < var6.length; var35 = var22) {// 157
                     PrintWriter var36 = var9.field611;// 24
                     StringBuilder var43 = new StringBuilder()
                        .append("<LI><A HREF=\"")
                        .append(var9.field608)
                        .append("_cp.html#cp")
                        .append(var6[var22])
                        .append("\" TARGET=\"ConstantPool\">Exception class index(")
                        .append(var6[var22]);
                     var22++;
                     var36.print(var43.append(")</A>\n").toString());
                  }

                  var10000 = var9;// 27
                  var9.field611.print("</UL>\n");
                  break label93;// 242
               case 4:
                  Class210[] var7 = ((Class163)var1).method197();// 209
                  int var34 = 0;
                  this.field611.print("<P>");// 116

                  for (int var24 = 0; var34 < var7.length; var34 = ++var24) {// 422
                     var9.field611.print("(" + var7[var24].method2() + ",&nbsp;" + var7[var24].method17() + ")");// 464
                     if (var24 < var7.length - 1) {// 31
                        var9.field611.print(", ");// 21
                     }
                  }
                  break;
               case 5:
                  Class124[] var8 = ((Class160)var1).method191();// 440
                  int var32 = 0;
                  this.field611.print("<UL>");// 97

                  for (int var14 = 0; var32 < var8.length; var32 = var14) {// 411
                     int var16 = var8[var14].method2();// 468
                     String var25 = Class523.method1509(((Class191)var9.field610.method171(var16, (byte)1)).method20(), false);// 119 138
                     int var26;
                     int var27 = (var26 = var8[var14].method84()) + var8[var14].method17();// 32 238
                     PrintWriter var33 = var9.field611;// 423
                     StringBuilder var42 = new StringBuilder()
                        .append("<LI>")
                        .append(Class147.method166(var25))
                        .append("&nbsp;<B>")
                        .append(var8[var14].method93())
                        .append("</B> in slot %")
                        .append(var8[var14].method30())
                        .append("<BR>Valid from lines ")
                        .append("<A HREF=\"")
                        .append(var9.field608)
                        .append("_code.html#code")
                        .append(var3)
                        .append("@")
                        .append(var26)
                        .append("\" TARGET=Code>")
                        .append(var26)
                        .append("</A> to ")
                        .append("<A HREF=\"")
                        .append(var9.field608)
                        .append("_code.html#code")
                        .append(var3)
                        .append("@")
                        .append(var27)
                        .append("\" TARGET=Code>")
                        .append(var27);
                     var14++;
                     var33.println(var42.append("</A></LI>").toString());
                  }

                  var10000 = var9;// 291
                  var9.field611.print("</UL>\n");
                  break label93;// 57
               case 6:
                  Class211[] var13 = ((Class162)var1).method196();// 216
                  int var28 = 0;
                  this.field611.print("<UL>");// 314

                  for (int var10 = 0; var28 < var13.length; var28 = var10) {// 137
                     String var11;
                     int var15;
                     Class211[] var29;
                     if ((var15 = var13[var10].method17()) > 0) {// 135 253
                        var11 = ((Class191)var9.field610.method171(var15, (byte)1)).method20();// 474
                        var29 = var13;
                     } else {
                        var11 = "&lt;anonymous&gt;";// 434
                        var29 = var13;// 373
                     }

                     String var12 = Class523.method1515(var29[var10].method30());
                     PrintWriter var30 = var9.field611;// 72
                     StringBuilder var10001 = new StringBuilder()
                        .append("<LI><FONT COLOR=\"#FF0000\">")
                        .append(var12)
                        .append("</FONT> ")
                        .append(var9.field607.method105(var13[var10].method84()))
                        .append(" in&nbsp;class ")
                        .append(var9.field607.method105(var13[var10].method2()))
                        .append(" named ")
                        .append(var11);
                     var10++;
                     var30.print(var10001.append("</LI>\n").toString());
                  }

                  var10000 = var9;// 218
                  var9.field611.print("</UL>\n");
                  break label93;// 109
               default:
                  this.field611.print("<P>" + var1.toString());// 15
            }

            var10000 = var9;// 471
         }

         var10000.field611.println("</TD></TR>");
         var9.field611.flush();// 270
      }
   }// 33 582

   // $VF: synthetic method
   public final void method169(Class151 var1, String var2) {
      this.method168(var1, var2, 0);// 358
   }// 192

   // $VF: synthetic method
   public Class148(String var1, String var2, Class149 var3, Class129 var4) {
      this.field608 = var2;// 46
      this.field610 = var3;// 170
      this.field607 = var4;// 1 553
      this.field611 = new PrintWriter(new FileOutputStream(var1 + var2 + "_attributes.html"));// 58
      this.field611.println("<HTML><BODY BGCOLOR=\"#C0C0C0\"><TABLE BORDER=0>");// 190
   }// 315

   // $VF: synthetic method
   public final String method170(int var1, int var2) {
      return "<A HREF=\"" + this.field608 + "_code.html#code" + var2 + "@" + var1 + "\" TARGET=Code>" + var1 + "</A>";// 534
   }
}
