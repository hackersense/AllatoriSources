package com.allatori.ant;

import com.allatori.Obfuscate;
import java.io.File;
import mapped.Class528;
import mapped.Class550;
import mapped.Class580;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

// $VF: Compiled from jw
public class ObfuscatorTask extends Task {
   // $VF: synthetic field
   public String config;

   // $VF: synthetic method
   public void setConfig(String var1) {
      this.config = var1;// 161
   }// 141

   // $VF: synthetic method
   public void execute() {
      ObfuscatorTask var2 = this;
      if (this.config == null) {// 7
         throw new BuildException("Missing 'config' attribute.");
      } else {
         try {
            Class528.method1557("*");// 34
            Class528.method1557("*");// 332
            Class528.method1557("* DEMO VERSION OF ALLATORI JAVA OBFUSCATOR!");// 260
            Class528.method1557("* NOT FOR COMMERCIAL USE!");// 30
            Class528.method1557("* Demo version adds System.out's and gives 'ALLATORI_DEMO' name to some fields and methods.");// 143
            Class528.method1557("*");// 252
            Class528.method1557("*");// 20
            File var1;
            if (!(var1 = new File(var2.config)).canRead()) {// 239 310
               throw new BuildException("Cannot find configuration file: '" + var2.config + "'");
            } else {
               File var4 = new File(new StringBuilder().insert(0, var2.config).append(".resolved").toString());// 498
               var4.deleteOnExit();
               String var5 = Class550.method1725(var1, "UTF-8");// 409 484
               String var6 = var2.getProject().replaceProperties(var5);// 389
               Class550.method1727(var4, "UTF-8", var6);// 18
               Class580.method1931(var4.getPath());// 513
               Obfuscate.method1479();// 93
               Class580.method1934();// 151
            }
         } catch (Exception var3) {// 530
            throw new BuildException(var3);// 491
         }
      }
   }// 147
}
