package mapped;

import java.io.FileOutputStream;
import java.io.PrintWriter;

// $VF: Compiled from ke
public final class Class127 implements Class125 {
   // $VF: synthetic field
   public PrintWriter field543;
   // $VF: synthetic field
   public String field544;
   // $VF: synthetic field
   public Class148 field545;
   // $VF: synthetic field
   public Class129 field546;

   // $VF: synthetic method
   public Class127(String var1, String var2, Class208[] var3, Class207[] var4, Class129 var5, Class148 var6) {
      Class127 var10 = this;
      int var11 = 0;
      super();
      this.field544 = var2;// 580
      this.field545 = var6;// 226
      this.field546 = var5;// 123
      this.field543 = new PrintWriter(new FileOutputStream(var1 + var2 + "_methods.html"));// 141
      this.field543.println("<HTML><BODY BGCOLOR=\"#C0C0C0\"><TABLE BORDER=0>");// 78 418
      this.field543.println("<TR><TH ALIGN=LEFT>Access&nbsp;flags</TH><TH ALIGN=LEFT>Type</TH><TH ALIGN=LEFT>Field&nbsp;name</TH></TR>");// 533

      for (int var8 = 0; var11 < var4.length; var11 = var8) {// 406
         var10.method100(var4[var8++]);// 1
      }

      var10.field543.println("</TABLE>");// 170
      var10.field543// 553
         .println(
            "<TABLE BORDER=0><TR><TH ALIGN=LEFT>Access&nbsp;flags</TH><TH ALIGN=LEFT>Return&nbsp;type</TH><TH ALIGN=LEFT>Method&nbsp;name</TH><TH ALIGN=LEFT>Arguments</TH></TR>"
         );

      for (int var12 = var9 = 0; var12 < var3.length; var12 = var9) {// 315
         var10.method98(var3[var9], var9++);// 465
      }

      var10.field543.println("</TABLE></BODY></HTML>");// 184
      var10.field543.close();// 534
   }// 488

   // $VF: synthetic method
   public final void method98(Class208 var1, int var2) {
      Class127 var3 = this;
      String var10003 = var1.method20();// 415
      String[] var10 = Class523.method1529(var10003, false);// 428
      String var7 = Class523.method1535(var10003, false);// 586
      String var4 = var1.method190();// 232
      String var5 = Class523.method1515(var1.method17());// 198
      Class151[] var6 = var1.method200();// 28
      var5 = Class523.method1500(var5, " ", "&nbsp;");// 38
      var4 = Class147.method165(var4);// 257
      this.field543.print("<TR VALIGN=TOP><TD><FONT COLOR=\"#FF0000\"><A NAME=method" + var2 + ">" + var5 + "</A></FONT></TD>");// 269
      PrintWriter var18 = this.field543;// 148
      StringBuilder var26 = new StringBuilder();
      int var19 = 0;
      var18.print(
         var26.insert(0, "<TD>")
            .append(Class147.method166(var7))
            .append("</TD><TD>")
            .append("<A HREF=")
            .append(this.field544)
            .append("_code.html#method")
            .append(var2)
            .append(" TARGET=Code>")
            .append(var4)
            .append("</A></TD>\n<TD>(")
            .toString()
      );

      for (int var8 = 0; var19 < var10.length; var19 = ++var8) {// 39
         var3.field543.print(Class147.method166(var10[var8]));// 368
         if (var8 < var10.length - 1) {// 99
            var3.field543.print(", ");// 160
         }
      }

      var3.field543.print(")</TD></TR>");// 541

      for (int var20 = var9 = 0; var20 < var6.length; var20 = ++var9) {// 510
         var3.field545.method168(var6[var9], "method" + var2 + "@" + var9, var2);// 456
         byte var11;
         if ((var11 = var6[var9].method142()) != 3) {// 82 83
            if (var11 == 2) {// 600
               Class151[] var14 = ((Class164)var6[var9]).method200();// 108

               for (int var22 = var17 = 0; var22 < var14.length; var22 = var17) {// 27
                  Class148 var23 = var3.field545;// 242
                  Class151 var25 = var14[var17];
                  var26 = new StringBuilder().append("method").append(var2).append("@").append(var9).append("@").append(var17);
                  var17++;
                  var23.method168(var25, var26.toString(), var2);
               }
            }
         } else {
            var3.field543.print("<TR VALIGN=TOP><TD COLSPAN=2></TD><TH ALIGN=LEFT>throws</TH><TD>");// 5
            int[] var13 = ((Class157)var6[var9]).method41();// 279

            for (int var21 = var16 = 0; var21 < var13.length; var21 = ++var16) {// 450
               var3.field543.print(var3.field546.method105(var13[var16]));// 386
               if (var16 < var13.length - 1) {// 470
                  var3.field543.print(", ");// 149
               }
            }

            var3.field543.println("</TD></TR>");// 286
         }
      }
   }// 422

   // $VF: synthetic method
   public void method100(Class207 var1) {
      Class127 var3 = this;
      String var8 = Class523.method1517(var1.method20());// 461
      String var2 = var1.method190();// 358
      String var5 = Class523.method1500(Class523.method1515(var1.method17()), " ", "&nbsp;");// 192 272
      this.field543// 321
         .print(
            "<TR><TD><FONT COLOR=\"#FF0000\">"
               + var5
               + "</FONT></TD>\n<TD>"
               + Class147.method166(var8)
               + "</TD><TD><A NAME=\"field"
               + var2
               + "\">"
               + var2
               + "</A></TD>"
         );
      Class151[] var9 = var1.method200();// 567

      for (int var10 = var6 = 0; var10 < var9.length; var10 = var6) {// 33
         var3.field545.method169(var9[var6], var2 + "@" + var6++);// 0
      }

      int var7;
      int var12 = var7 = 0;

      while (true) {
         if (var12 >= var9.length) {
            var14 = var3;// 391
            break;
         }

         if (var9[var7].method142() == 1) {// 552
            String var4 = ((Class161)var9[var7]).toString();// 603
            PrintWriter var13 = var3.field543;// 466
            StringBuilder var18 = new StringBuilder().append("<TD>= <A HREF=\"");
            var14 = var3;
            var13.print(
               var18.append(var3.field544)
                  .append("_attributes.html#")
                  .append(var2)
                  .append("@")
                  .append(var7)
                  .append("\" TARGET=\"Attributes\">")
                  .append(var4)
                  .append("</TD>\n")
                  .toString()
            );
            break;// 485
         }

         var12 = ++var7;// 246
      }

      var14.field543.println("</TR>");
   }// 330
}
