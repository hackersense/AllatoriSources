package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from cm
public class Class249 implements Class248 {
   // $VF: synthetic field
   public Map field845 = new HashMap();
   // $VF: synthetic field
   public ClassLoader field846;

   // $VF: synthetic method
   @Override
   public void method19() {
      this.field845.clear();// 463
   }// 198

   // $VF: synthetic method
   @Override
   public void method442(Class205 var1) {
      this.field845.remove(var1.method93());// 132
   }// 184

   // $VF: synthetic method
   @Override
   public Class205 method440(String var1) {
      return this.field845.containsKey(var1) ? (Class205)this.field845.get(var1) : null;// 6 377 604
   }

   // $VF: synthetic method
   @Override
   public Class205 method441(Class var1) {
      return this.method443(var1.getName());// 415
   }

   // $VF: synthetic method
   @Override
   public Class223 method444() {
      return null;// 257
   }

   // $VF: synthetic method
   @Override
   public Class205 method443(String var1) {
      Class249 var2 = this;
      String var5 = var1.replace('.', '/');// 146
      Class205 var3;
      if ((var3 = this.method440(var1)) != null) {// 400 567
         return var3;// 33
      } else {
         try {
            InputStream var6;
            if ((var6 = var2.field846.getResourceAsStream(var5 + ".class")) == null) {// 246 552
               throw new ClassNotFoundException(var1 + " not found.");// 603
            } else {
               var3 = new Class410(var6, var1).method765();// 466 467
               var2.method389(var3);// 485
               return var3;// 68
            }
         } catch (IOException var4) {// 59
            throw new ClassNotFoundException(var4.toString());// 391
         }
      }
   }

   // $VF: synthetic method
   @Override
   public void method389(Class205 var1) {
      this.field845.put(var1.method93(), var1);// 406
      var1.method348(this);// 1
   }// 46

   // $VF: synthetic method
   public Class249(ClassLoader var1) {
      this.field846 = var1;// 141 161
   }// 580
}
