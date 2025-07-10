package com.allatori.eclipse;

import com.allatori.Obfuscate;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

// $VF: Compiled from sy
public class AllatoriBuilder extends IncrementalProjectBuilder {
   // $VF: synthetic field
   public static final String field1766 = "com.allatori.eclipse";

   // $VF: synthetic method
   public void method1496(IProgressMonitor var1) {
      AllatoriBuilder var2 = this;

      try {
         String var18 = var2.getProject().getLocation().toString();// 123
         File var6;
         File var31;
         if (!(var6 = new File(var18 + "/allatori.xml")).exists()) {// 78 533
            StringBuilder var10 = new StringBuilder();// 185
            StringBuilder var4 = new StringBuilder();// 406
            IJavaProject var5;
            IClasspathEntry[] var9;
            int var8 = (var9 = (var5 = JavaCore.create(var2.getProject())).getResolvedClasspath(true)).length;// 46

            int var7;
            for (int var10000 = var7 = 0; var10000 < var8; var10000 = ++var7) {// 170
               IClasspathEntry var13;
               if ((var13 = var9[var7]).getEntryKind() == 3) {// 553
                  if (var13.getOutputLocation() != null) {// 58
                     String var3 = var13.getOutputLocation().removeFirstSegments(1).toString();// 190
                     var10.append("        <dir in=\"" + var3 + "\" out=\"" + var3 + "\"/>\n");// 315
                  }
               } else if (var13.getEntryKind() == 1) {// 132
                  var4.append("        <jar name=\"" + var13.getPath().toString() + "\"/>\n");// 184
               }
            }

            if (var5.getOutputLocation() != null) {// 495
               String var14 = var5.getOutputLocation().removeFirstSegments(1).toString();// 159
               var10.append("        <dir in=\"" + var14 + "\" out=\"" + var14 + "\"/>\n");// 493
            }

            String var15 = "<config>\n    <input>\n"// 604
               + var10
               + "    </input>\n\n"
               + "    <classpath>\n"
               + var4// 22
               + "    </classpath>\n\n"
               + "    <keep-names>\n"
               + "        <class access=\"protected+\">\n"// 6
               + "            <field access=\"protected+\"/>\n"
               + "            <method access=\"protected+\"/>\n"// 144
               + "        </class>\n"
               + "    </keep-names>\n\n"// 461
               + "    <property name=\"log-file\" value=\"allatori-log.xml\"/>\n"// 358
               + "</config>\n";
            BufferedWriter var25 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(var6), "UTF-8"));// 272 574
            var31 = var6;
            var25.write(var15);// 321
            var25.close();// 179
         } else {
            StringBuffer var29 = new StringBuffer((int)var6.length());// 567

            BufferedReader var21;
            int var23;
            for (BufferedReader var32 = var21 = new BufferedReader(new InputStreamReader(new FileInputStream(var6), "UTF-8"));// 33 400
               (var23 = var32.read()) != -1;
               var32 = var21// 240
            ) {
               var29.append((char)var23);// 246
            }

            var21.close();// 552
            String var16;
            if ((var16 = var29.toString()).contains("${eclipse-")) {// 466 603
               StringBuilder var26 = new StringBuilder();// 467
               StringBuilder var27 = new StringBuilder();// 485
               IClasspathEntry[] var24;
               IJavaProject var28;
               int var22 = (var24 = (var28 = JavaCore.create(var2.getProject())).getResolvedClasspath(true)).length;// 59

               for (int var33 = var30 = 0; var33 < var22; var33 = ++var30) {// 391
                  IClasspathEntry var19;
                  if ((var19 = var24[var30]).getEntryKind() == 3) {// 330
                     if (var19.getOutputLocation() != null) {// 589
                        String var11 = var19.getOutputLocation().removeFirstSegments(1).toString();// 579
                        var26.append("        <dir in=\"" + var11 + "\" out=\"" + var11 + "\"/>\n");// 555
                     }
                  } else if (var19.getEntryKind() == 1) {// 415
                     var27.append("        <jar name=\"" + var19.getPath().toString() + "\"/>\n");// 398
                  }
               }

               if (var28.getOutputLocation() != null) {// 586
                  String var20 = var28.getOutputLocation().removeFirstSegments(1).toString();// 399
                  var26.append("        <dir in=\"" + var20 + "\" out=\"" + var20 + "\"/>\n");// 232
               }

               String var17 = var16.replace("${eclipse-input}", var26).replace("${eclipse-classpath}", var27);// 28 424
               var6 = new File(var18 + "/allatori-resolved.xml");// 329
               BufferedWriter var34 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(var6), "UTF-8"));// 38
               var34.write(var17);// 257
               var34.close();// 269
            }

            var31 = var6;// 142
         }

         Obfuscate.run(var31);
      } catch (Exception var12) {
         var12.printStackTrace();// 368
         throw new CoreException(new Status(4, "com.allatori.eclipse", 0, var12.getMessage(), var12));// 99
      }
   }// 39

   // $VF: synthetic method
   public IProject[] build(int var1, Map var2, IProgressMonitor var3) {
      this.getProject();// 484
      switch (var1) {// 389
         case 6:
            while (false) {
            }

            this.method1496(var3);// 513
         case 7:
         case 8:
         case 9:
         case 10:
         default:
            return null;// 273
      }
   }
}
