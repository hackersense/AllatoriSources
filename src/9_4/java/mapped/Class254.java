package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// $VF: Compiled from l
public class Class254 extends Class252 {
   // $VF: synthetic field
   public ZipFile field857;

   // $VF: synthetic method
   public static ZipFile method487(Class254 var0) {
      return var0.field857;// 231
   }

   // $VF: synthetic method
   public Class254(ZipFile var1) {
      super(null);
      this.field857 = var1;// 126 324
   }// 519

   // $VF: synthetic method
   @Override
   public URL method426(String var1) {
      Class254 var2 = this;
      ZipEntry var4 = this.field857.getEntry(var1);// 482

      try {
         return var4 != null ? new URL("jar:file:" + var2.field857.getName() + "!/" + var1) : null;// 67
      } catch (MalformedURLException var3) {
         return null;// 2
      }
   }

   // $VF: synthetic method
   @Override
   public Class396 method423(String var1, String var2) {
      ZipEntry var4;
      return (var4 = this.field857.getEntry(new StringBuilder().insert(0, var1.replace('.', '/')).append(var2).toString())) == null// 348 572
         ? null// 150
         : new Class395(this, var4);// 416
   }

   // $VF: synthetic method
   @Override
   public InputStream method422(String var1) {
      Class254 var5 = this;
      ZipEntry var4 = this.field857.getEntry(var1);// 86

      try {
         return var4 != null ? var5.field857.getInputStream(var4) : null;// 131
      } catch (IOException var2) {
         return null;// 289
      }
   }
}
