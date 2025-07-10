package mapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// $VF: Compiled from l
public class Class397 implements Class396 {
   // $VF: synthetic field
   public final Class253 field1209;
   // $VF: synthetic field
   public final File field1210;

   // $VF: synthetic method
   @Override
   public String method745() {
      try {
         return this.field1210.getCanonicalPath();// 453
      } catch (IOException var1) {
         return null;// 224
      }
   }

   // $VF: synthetic method
   @Override
   public String method746() {
      return Class253.method486(this.field1209);// 546
   }

   // $VF: synthetic method
   public Class397(Class253 var1, File var2) {
      this.field1209 = var1;
      this.field1210 = var2;// 457
   }

   // $VF: synthetic method
   @Override
   public long method744() {
      return this.field1210.lastModified();// 191
   }

   // $VF: synthetic method
   @Override
   public InputStream method743() {
      return new FileInputStream(this.field1210);// 431
   }

   // $VF: synthetic method
   @Override
   public long method747() {
      return this.field1210.length();// 326
   }
}
