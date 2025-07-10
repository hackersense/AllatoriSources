package mapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

// $VF: Compiled from l
public class Class253 extends Class252 {
   // $VF: synthetic field
   public String field856;

   // $VF: synthetic method
   public static String method486(Class253 var0) {
      return var0.field856;// 88
   }

   // $VF: synthetic method
   @Override
   public URL method426(String var1) {
      File var4 = new File(new StringBuilder().insert(0, this.field856).append(File.separatorChar).append(var1.replace('/', File.separatorChar)).toString());// 233

      try {
         return var4.exists() ? var4.toURL() : null;// 256
      } catch (MalformedURLException var2) {
         return null;// 47
      }
   }

   // $VF: synthetic method
   public Class253(String var1) {
      super(null);
      this.field856 = var1;// 130 301
   }// 602

   // $VF: synthetic method
   @Override
   public InputStream method422(String var1) {
      File var4 = new File(new StringBuilder().insert(0, this.field856).append(File.separatorChar).append(var1.replace('/', File.separatorChar)).toString());// 228

      try {
         return var4.exists() ? new FileInputStream(var4) : null;// 219
      } catch (IOException var2) {
         return null;// 333
      }
   }

   // $VF: synthetic method
   @Override
   public Class396 method423(String var1, String var2) {
      File var4;
      return (var4 = new File(
               new StringBuilder().insert(0, this.field856).append(File.separatorChar).append(var1.replace('.', File.separatorChar)).append(var2).toString()// 517
            ))
            .exists()// 524
         ? new Class397(this, var4)
         : null;
   }
}
