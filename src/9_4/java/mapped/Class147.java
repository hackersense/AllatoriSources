package mapped;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// $VF: Compiled from qd
public class Class147 implements Class125 {
   // $VF: synthetic field
   public static Class149 field602;
   // $VF: synthetic field
   public Class205 field603;
   // $VF: synthetic field
   public String field604;
   // $VF: synthetic field
   public static String field605;
   // $VF: synthetic field
   public static String field606;

   // $VF: synthetic method
   public static String method165(String var0) {
      String var1 = var0;
      StringBuffer var5 = new StringBuffer();// 291

      try {
         for (int var2 = 0; var2 < var1.length(); var2++) {// 169
            char var3;
            switch (var3 = var1.charAt(var2)) {// 299
               case '\n':
                  while (false) {
                  }

                  var5.append("\\n");// 166
                  break;// 434
               case '\r':
                  var5.append("\\r");// 373
                  break;// 72
               case '<':
                  var5.append("&lt;");// 137
                  break;// 50
               case '>':
                  var5.append("&gt;");// 135
                  break;// 474
               default:
                  var5.append(var3);// 497
            }
         }
      } catch (StringIndexOutOfBoundsException var4) {// 307
      }

      return var5.toString();// 109
   }

   // $VF: synthetic method
   public static String method105(int var0) {
      String var2 = Class523.method1510(field602.method176(var0, (byte)7));// 69 209
      String var3 = Class523.method1524(var2, field605 + ".", true);// 116
      return "<A HREF=\"" + field606 + "_cp.html#cp" + var0 + "\" TARGET=ConstantPool>" + var3 + "</A>";// 422
   }

   // $VF: synthetic method
   public static final String method166(String var0) {
      String var1 = Class523.method1510(var0);// 223
      var1 = Class523.method1524(var1, field605 + ".", true);// 45
      int var2 = var0.indexOf(91);// 23
      var0 = var0;// 440
      if (var2 > -1) {// 248
         var0 = var0.substring(0, var2);// 97
      }

      return !var0.equals("int")// 138
            && !var0.equals("short")
            && !var0.equals("boolean")
            && !var0.equals("void")
            && !var0.equals("char")
            && !var0.equals("byte")
            && !var0.equals("long")
            && !var0.equals("double")
            && !var0.equals("float")
         ? "<A HREF=\"" + var0 + ".html\" TARGET=_top>" + var1 + "</A>"// 61
         : "<FONT COLOR=\"#00FF00\">" + var0 + "</FONT>";// 238
   }

   // $VF: synthetic method
   public void method167(Class148 var1) {
      PrintWriter var4 = new PrintWriter(new FileOutputStream(new StringBuilder().insert(0, this.field604).append(field606).append(".html").toString()));// 270
      Class151[] var3 = this.field603.method200();// 582
      int var10000 = 0;
      var4.println(// 177
         "<HTML>\n<HEAD><TITLE>Documentation for "
            + field606
            + "</TITLE>"
            + "</HEAD>\n"
            + "<FRAMESET BORDER=1 cols=\"30%,*\">\n"
            + "<FRAMESET BORDER=1 rows=\"80%,*\">\n"
            + "<FRAME NAME=\"ConstantPool\" SRC=\""
            + field606
            + "_cp.html"
            + "\"\n MARGINWIDTH=\"0\" "
            + "MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n"
            + "<FRAME NAME=\"Attributes\" SRC=\""
            + field606
            + "_attributes.html"
            + "\"\n MARGINWIDTH=\"0\" "
            + "MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n"
            + "</FRAMESET>\n"
            + "<FRAMESET BORDER=1 rows=\"80%,*\">\n"
            + "<FRAME NAME=\"Code\" SRC=\""
            + field606
            + "_code.html\"\n MARGINWIDTH=0 "
            + "MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n"
            + "<FRAME NAME=\"Methods\" SRC=\""
            + field606
            + "_methods.html\"\n MARGINWIDTH=0 "
            + "MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n"
            + "</FRAMESET></FRAMESET></HTML>"
      );
      var4.close();// 110

      for (int var5 = 0; var10000 < var3.length; var10000 = var5) {// 221
         var1.method169(var3[var5], "class" + var5++);// 444
      }
   }// 193

   // $VF: synthetic method
   public Class147(Class205 var1, String var2) {
      Class208[] var4 = var1.method341();// 159 493
      this.field603 = var1;// 561
      this.field604 = var2;// 377
      field606 = var1.method93();// 604
      field602 = var1.method94();// 22
      int var6;
      if ((var6 = field606.lastIndexOf(46)) > -1) {// 144 461
         field605 = field606.substring(0, var6);// 358
      } else {
         field605 = "";// 574
      }

      Class129 var7 = new Class129(var2, field606, field605, var4, field602);// 321
      Class148 var5 = new Class148(var2, field606, field602, var7);// 33
      new Class127(var2, field606, var4, var1.method346(), var7, var5);// 240
      this.method167(var5);// 603
      new Class126(var2, field606, var4, field602, var7);// 278
      var5.method19();// 466
   }// 467

   // $VF: synthetic method
   public static void main(String[] var0) {
      String[] var1 = var0;
      String[] var7 = new String[var0.length];// 391
      int var6 = 0;// 330
      Object var5 = null;// 579 589
      String var4 = null;// 555
      char var3 = System.getProperty("file.separator").toCharArray()[0];// 73
      String var2 = "." + var3;// 415

      try {
         for (int var10000 = var9 = 0; var10000 < var1.length; var10000 = ++var9) {// 586
            if (var1[var9].charAt(0) == '-') {// 399
               if (var1[var9].equals("-d")) {// 232
                  var2 = var1[++var9];// 463
                  if (!var2.endsWith("" + var3)) {// 198
                     var2 = var2 + var3;// 424
                  }

                  new File(var2).mkdirs();// 588
               } else if (var1[var9].equals("-zip")) {// 329
                  var4 = var1[++var9];// 412
               } else {
                  System.out.println("Unknown option " + var1[var9]);// 257
               }
            } else {
               var7[var6++] = var1[var9];// 148
            }
         }

         if (var6 == 0) {// 39
            System.err.println("Class2HTML: No input files specified.");// 368
            return;// 99
         }

         int var10 = 0;// 160

         while (var10 < var6) {
            System.out.print("Processing " + var7[var10] + "...");// 40
            Class410 var10002 = new Class410;
            if (var4 == null) {// 63
               var10002./* $VF: Unable to resugar constructor */<init>(var7[var10]);// 541
            } else {
               var10002./* $VF: Unable to resugar constructor */<init>(var4, var7[var10]);// 510
            }

            var5 = var10002.method765();// 367
            new Class147((Class205)var5, var2);// 82
            var10++;
            System.out.println("Done.");// 83
         }
      } catch (Exception var8) {// 450
         System.out.println(var8);// 386
         var8.printStackTrace(System.out);// 470
      }
   }// 157
}
