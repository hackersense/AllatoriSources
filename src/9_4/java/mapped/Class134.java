package mapped;

// $VF: Compiled from cc
public final class Class134 extends Class131 {
   // $VF: synthetic field
   public Class205 field570;
   // $VF: synthetic field
   public Class576 field571;

   // $VF: synthetic method
   @Override
   public Class581 method116() {
      Class134 var2 = this;

      Class205 var1;
      try {
         if ((var1 = var2.method136()) != null && !var2.field571.method1913().equals(var1.method93())) {// 5 82 450
            throw new Class227(
               "Wrong name: the internal name of the .class file '"// 149
                  + var1.method93()
                  + "' does not match the file's name '"
                  + var2.field571.method1913()
                  + "'."
            );
         }
      } catch (Class227 var3) {// 108
         return new Class581(2, var3.getMessage());// 27
      } catch (Class239 var4) {// 94
         return new Class581(2, var4.getMessage());// 209
      } catch (RuntimeException var5) {// 116
         return new Class581(2, "Parsing via BCEL did not succeed. " + var5.getClass().getName() + " occured:\n" + Class515.method1463(var5));// 25
      }

      return var1 != null ? Class581.field2340 : new Class581(2, "Repository.lookup() failed. FILE NOT FOUND?");// 97 115 223
   }

   // $VF: synthetic method
   public Class205 method136() {
      if (this.field570 == null) {// 185
         try {
            this.field570 = Class411.method790(this.field571.method1913());// 1
         } catch (ClassNotFoundException var1) {
            return this.field570;// 132
         }

         return this.field570;
      } else {
         return this.field570;
      }
   }

   // $VF: synthetic method
   public Class134(Class576 var1) {
      this.field571 = var1;// 377 604
   }// 22

   // $VF: synthetic method
   @Override
   public String[] method130() {
      return super.method130();// 57
   }
}
