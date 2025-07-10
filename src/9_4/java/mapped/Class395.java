package mapped;

import java.io.InputStream;
import java.util.zip.ZipEntry;

// $VF: Compiled from l
public class Class395 implements Class396 {
   // $VF: synthetic field
   public final Class254 field1207;
   // $VF: synthetic field
   public final ZipEntry field1208;

   // $VF: synthetic method
   public Class395(Class254 var1, ZipEntry var2) {
      this.field1207 = var1;
      this.field1208 = var2;// 407
   }

   // $VF: synthetic method
   @Override
   public InputStream method743() {
      return Class254.method487(this.field1207).getInputStream(this.field1208);// 178
   }

   // $VF: synthetic method
   @Override
   public long method744() {
      return this.field1208.getTime();// 538
   }

   // $VF: synthetic method
   @Override
   public String method745() {
      return this.field1208.toString();// 250
   }

   // $VF: synthetic method
   @Override
   public String method746() {
      return Class254.method487(this.field1207).getName();// 405
   }

   // $VF: synthetic method
   @Override
   public long method747() {
      return this.field1208.getSize();// 568
   }
}
