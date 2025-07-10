package mapped;

// $VF: Compiled from vb
public class Class433 {
   // $VF: synthetic field
   public Class138[] field1284;

   // $VF: synthetic method
   public Class433 method863() {
      return (Class433)this.clone();// 377
   }

   // $VF: synthetic method
   public void method864(Class136 var1) {
      Class433 var2 = this;

      for (int var10000 = var3 = 0; var10000 < var2.field1284.length; var10000 = ++var3) {// 218
         if (var2.field1284[var3] == var1) {// 109
            var2.field1284[var3] = var1.method138();// 213
         }
      }
   }// 471

   // $VF: synthetic method
   public int method865() {
      return this.field1284.length;// 574
   }

   // $VF: synthetic method
   public int hashCode() {
      return this.field1284.length;// 467
   }

   // $VF: synthetic method
   public Object clone() {
      Class433 var2 = this;
      Class433 var1 = new Class433(this.field1284.length);// 533

      for (int var10000 = var3 = 0; var10000 < var2.field1284.length; var10000 = var3) {// 185
         int var10001 = var3;
         Class138 var10002 = var2.field1284[var3];
         var3++;
         var1.field1284[var10001] = var10002;// 406
      }

      return var1;// 46
   }

   // $VF: synthetic method
   public void method866(Class433 var1, int var2) {
      int var5 = var2;
      Class433 var6 = this;

      try {
         if (!(var6.field1284[var5] instanceof Class136) && var1.field1284[var5] instanceof Class136) {// 386
            throw new Class233("Backwards branch with an uninitialized object in the local variables detected.");// 470
         } else if (!var6.field1284[var5].equals(var1.field1284[var5]) && var6.field1284[var5] instanceof Class136 && var1.field1284[var5] instanceof Class136) {// 24
            throw new Class233("Backwards branch with an uninitialized object in the local variables detected.");// 286
         } else {
            if (var6.field1284[var5] instanceof Class136 && !(var1.field1284[var5] instanceof Class136)) {// 27 242
               var6.field1284[var5] = ((Class136)var6.field1284[var5]).method138();// 94
            }

            if (var6.field1284[var5] instanceof Class137 && var1.field1284[var5] instanceof Class137) {// 116
               if (!var6.field1284[var5].equals(var1.field1284[var5])) {// 422
                  Class137 var3;
                  if ((var3 = ((Class137)var6.field1284[var5]).method141((Class137)var1.field1284[var5])) != null) {// 31 464
                     var6.field1284[var5] = var3;// 21
                     return;// 115
                  }

                  throw new Class242("Could not load all the super classes of '" + var6.field1284[var5] + "' and '" + var1.field1284[var5] + "'.");// 23
               }
            } else if (!var6.field1284[var5].equals(var1.field1284[var5])) {// 468
               var6.field1284[var5] = Class138.field592;// 61
               return;// 291
            }
         }
      } catch (ClassNotFoundException var4) {// 593
         throw new Class242("Missing class: " + var4.toString());// 540
      }
   }// 57

   // $VF: synthetic method
   public Class138 method867(int var1) {
      return this.field1284[var1];// 132
   }

   // $VF: synthetic method
   public Class433(int var1) {
      Class433 var2 = this;
      super();
      this.field1284 = new Class138[var1];// 491 530

      for (int var10000 = var3 = 0; var10000 < var1; var10000 = var3) {// 147
         var2.field1284[var3++] = Class138.field592;// 295
      }
   }// 273

   // $VF: synthetic method
   public void method868(Class433 var1) {
      Class433 var2 = this;
      if (this.field1284.length != var1.field1284.length) {// 148
         throw new Class242("Merging LocalVariables of different size?!? From different methods or what?!?");// 236
      } else {
         for (int var10000 = var3 = 0; var10000 < var2.field1284.length; var10000 = var3) {// 368
            var2.method866(var1, var3++);// 99
         }
      }
   }// 40

   // $VF: synthetic method
   public boolean equals(Object var1) {
      var1 = this;
      if (!(var1 instanceof Class433)) {// 589
         return false;// 579
      } else {
         this = var1;// 73
         if (this.field1284.length != this.field1284.length) {// 415
            return false;// 398
         } else {
            int var2;
            for (int var6 = var2 = 0; var6 < var1.field1284.length; var6 = ++var2) {// 87
               if (!var1.field1284[var2].equals(this.field1284[var2])) {// 586
                  return false;// 232
               }
            }

            return true;// 424
         }
      }
   }

   // $VF: synthetic method
   public void method869(int var1, Class138 var2) {
      if (var2 != Class138.field594 && var2 != Class138.field581 && var2 != Class138.field584 && var2 != Class138.field585) {// 33
         this.field1284[var1] = var2;// 246
      } else {
         throw new Class242("LocalVariables do not know about '" + var2 + "'. Use Type.INT instead.");// 0
      }
   }// 552
}
