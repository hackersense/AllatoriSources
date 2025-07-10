package mapped;

import java.io.FileOutputStream;
import java.io.PrintWriter;

// $VF: Compiled from bl
public final class Class129 implements Class125 {
   // $VF: synthetic field
   public Class149 field552;
   // $VF: synthetic field
   public Class208[] field553;
   // $VF: synthetic field
   public Class178[] field554;
   // $VF: synthetic field
   public String[] field555;
   // $VF: synthetic field
   public String field556;
   // $VF: synthetic field
   public PrintWriter field557;
   // $VF: synthetic field
   public String field558;

   // $VF: synthetic method
   public void method6(int var1) {
      byte var4 = this.field554[var1].method142();// 400
      this.field557.println("<H4> <A NAME=cp" + var1 + ">" + var1 + "</A> " + field434[var4] + "</H4>");// 246
      switch (var4) {// 466
         case 7:
            while (false) {
            }

            int var24 = ((Class182)this.field552.method171(var1, (byte)7)).method2();// 216 299
            String var20;
            String var31 = Class523.method1524(
               Class523.method1510(var20 = this.field552.method177(var1, var4)), new StringBuilder().insert(0, this.field558).append(".").toString(), true// 50 137 314
            );
            String var26 = "<A HREF=\"" + var20 + ".html\" TARGET=_top>" + var31 + "</A>";// 135
            this.field555[var1] = "<A HREF=\"" + this.field556 + "_cp.html#cp" + var1 + "\" TARGET=ConstantPool>" + var31 + "</A>";// 443
            this.field557.println("<P><TT>" + var26 + "</TT><UL>" + "<LI><A HREF=\"#cp" + var24 + "\">Name index(" + var24 + ")</A></UL>\n");// 434
            return;// 373
         case 8:
            int var23 = ((Class185)this.field552.method171(var1, (byte)8)).method2();// 66 268
            String var19 = Class147.method165(this.field552.method177(var1, var4));// 536
            this.field557.println("<P><TT>" + var19 + "</TT><UL>" + "<LI><A HREF=\"#cp" + var23 + "\">Name index(" + var23 + ")</A></UL>\n");// 307
            return;// 109
         case 9:
            Class190 var29 = (Class190)this.field552.method171(var1, (byte)9);// 464
            int var18 = var29.method17();// 31
            int var22 = var29.method2();// 21
            String var30;
            String var32 = Class523.method1524(
               Class523.method1510(var30 = this.field552.method177(var18, (byte)7)), new StringBuilder().insert(0, this.field558).append(".").toString(), true// 23 45 223
            );
            String var33 = this.field552.method177(var22, (byte)12);// 248
            boolean var44 = var30.equals(this.field556);// 411
            StringBuilder var48 = new StringBuilder;
            String var25;
            Class129 var45;
            if (var44) {
               var48./* $VF: Unable to resugar constructor */<init>();// 468
               var25 = var48.append("<A HREF=\"")
                  .append(var30)
                  .append("_methods.html#field")
                  .append(var33)
                  .append("\" TARGET=Methods>")
                  .append(var33)
                  .append("</A>")
                  .toString();
               var45 = this;
            } else {
               var48./* $VF: Unable to resugar constructor */<init>();// 119
               var25 = var48.append("<A HREF=\"")
                  .append(var30)
                  .append(".html\" TARGET=_top>")
                  .append(var32)
                  .append("</A>.")
                  .append(var33)
                  .append("\n")
                  .toString();
               var45 = this;// 423
            }

            var45.field555[var1] = "<A HREF=\""
               + this.field556
               + "_cp.html#cp"
               + var18
               + "\" TARGET=Constants>"
               + var32
               + "</A>.<A HREF=\""
               + this.field556
               + "_cp.html#cp"
               + var1
               + "\" TARGET=ConstantPool>"
               + var33
               + "</A>";
            this.field557// 593
               .println(
                  "<P><TT>"
                     + var25
                     + "</TT><BR>\n"
                     + "<UL>"
                     + "<LI><A HREF=\"#cp"
                     + var18
                     + "\">Class("
                     + var18
                     + ")</A><BR>\n"
                     + "<LI><A HREF=\"#cp"
                     + var22
                     + "\">NameAndType("
                     + var22
                     + ")</A></UL>"
               );
            return;// 57
         case 10:
         case 11:
            int var17;
            int var21;
            Class129 var10000;
            if (var4 == 10) {// 59
               Class188 var6 = (Class188)this.field552.method171(var1, (byte)10);// 391
               var10000 = this;
               var17 = var6.method17();// 589
               var21 = var6.method2();// 579
            } else {
               Class189 var27 = (Class189)this.field552.method171(var1, (byte)11);// 73
               var10000 = this;
               var17 = var27.method17();// 398
               var21 = var27.method2();// 428
            }

            String var28;
            String var7 = Class147.method165(var28 = var10000.field552.method177(var21, (byte)12));// 399 463
            String var8;
            String var38 = var8 = this.field552.method177(var17, (byte)7);// 424
            String var9 = Class523.method1510(var38);// 28
            var9 = Class523.method1510(var38);// 588
            var9 = Class523.method1524(var9, this.field558 + ".", true);// 329
            Class186 var10 = (Class186)this.field552.method171(var21, (byte)12);// 257
            String var36;
            String var39 = var36 = this.field552.method177(var10.method2(), (byte)1);// 455
            String[] var11 = Class523.method1529(var39, false);// 142
            String var12 = Class147.method166(Class523.method1535(var39, false));// 99 368
            StringBuffer var13 = new StringBuffer("(");// 160

            int var14;
            for (int var40 = var14 = 0; var40 < var11.length; var40 = ++var14) {// 40
               var13.append(Class147.method166(var11[var14]));// 63
               if (var14 < var11.length - 1) {// 541
                  var13.append(",&nbsp;");// 550
               }
            }

            var13.append(")");// 367
            String var37 = var13.toString();// 82
            boolean var41 = var8.equals(this.field556);// 83
            StringBuilder var10002 = new StringBuilder;
            String var5;
            if (var41) {
               var10002./* $VF: Unable to resugar constructor */<init>();// 5
               var5 = var10002.append("<A HREF=\"")
                  .append(this.field556)
                  .append("_code.html#method")
                  .append(this.method106(var28 + var36))
                  .append("\" TARGET=Code>")
                  .append(var7)
                  .append("</A>")
                  .toString();
               var10000 = this;
            } else {
               var10002./* $VF: Unable to resugar constructor */<init>();// 470
               var5 = var10002.append("<A HREF=\"").append(var8).append(".html").append("\" TARGET=_top>").append(var9).append("</A>.").append(var7).toString();
               var10000 = this;// 24
            }

            var10000.field555[var1] = var12
               + "&nbsp;<A HREF=\""
               + this.field556
               + "_cp.html#cp"
               + var17
               + "\" TARGET=Constants>"
               + var9
               + "</A>.<A HREF=\""
               + this.field556
               + "_cp.html#cp"
               + var1
               + "\" TARGET=ConstantPool>"
               + var7
               + "</A>&nbsp;"
               + var37;
            this.field557// 27
               .println(
                  "<P><TT>"
                     + var12
                     + "&nbsp;"
                     + var5
                     + var37
                     + "&nbsp;</TT>\n<UL>"
                     + "<LI><A HREF=\"#cp"
                     + var17
                     + "\">Class index("
                     + var17
                     + ")</A>\n"
                     + "<LI><A HREF=\"#cp"
                     + var21
                     + "\">NameAndType index("
                     + var21
                     + ")</A></UL>"
               );
            return;// 69
         case 12:
            Class186 var15 = (Class186)this.field552.method171(var1, (byte)12);// 15
            int var2 = var15.method17();// 471
            int var16 = var15.method2();// 270
            this.field557// 582
               .println(
                  "<P><TT>"
                     + Class147.method165(this.field552.method177(var1, var4))
                     + "</TT><UL>"
                     + "<LI><A HREF=\"#cp"
                     + var2
                     + "\">Name index("
                     + var2
                     + ")</A>\n"
                     + "<LI><A HREF=\"#cp"
                     + var16
                     + "\">Signature index("
                     + var16
                     + ")</A></UL>\n"
               );
            return;// 370
         default:
            this.field557.println("<P><TT>" + Class147.method165(this.field552.method177(var1, var4)) + "</TT>\n");// 95
      }
   }// 129

   // $VF: synthetic method
   public String method105(int var1) {
      return this.field555[var1];// 272
   }

   // $VF: synthetic method
   public final int method106(String var1) {
      Class129 var2 = this;

      for (int var10000 = var3 = 0; var10000 < var2.field553.length; var10000 = ++var3) {// 110
         if (new StringBuilder().insert(0, var2.field553[var3].method190()).append(var2.field553[var3].method20()).toString().equals(var1)) {// 221 444
            return var3;// 601
         }
      }

      return -1;// 486
   }

   // $VF: synthetic method
   public Class129(String var1, String var2, String var3, Class208[] var4, Class149 var5) {
      Class129 var8 = this;
      super();
      this.field556 = var2;// 185
      this.field558 = var3;// 406
      this.field552 = var5;// 1
      this.field553 = var4;// 46
      this.field554 = var5.method172();// 170
      this.field557 = new PrintWriter(new FileOutputStream(var1 + var2 + "_cp.html"));// 533
      this.field555 = new String[this.field554.length];// 58 553
      int var9 = 1;
      this.field555[0] = "&lt;unknown&gt;";// 190
      this.field557.println("<HTML><BODY BGCOLOR=\"#C0C0C0\"><TABLE BORDER=0>");// 315

      for (int var7 = 1; var9 < var8.field554.length; var9 = var7) {// 132
         Class129 var10;
         if (var7 % 2 == 0) {// 184
            var10 = var8;// 534
            var8.field557.print("<TR BGCOLOR=\"#C0C0C0\"><TD>");
         } else {
            var10 = var8;// 495
            var8.field557.print("<TR BGCOLOR=\"#A0A0A0\"><TD>");
         }

         if (var10.field554[var7] != null) {// 493
            var8.method6(var7);// 561
         }

         var7++;
         var8.field557.print("</TD></TR>\n");// 604
      }

      var8.field557.println("</TABLE></BODY></HTML>");// 6
      var8.field557.close();// 144
   }// 461
}
