package mapped;

// $VF: Compiled from hb
public abstract class Class137 extends Class138 {
   // $VF: synthetic method
   public Class137() {
      super((byte)14, "<null object>");// 530
   }// 491

   // $VF: synthetic method
   public boolean method139(Class138 var1) {
      if (!(var1 instanceof Class137)) {// 22
         return false;// 6
      } else {
         this = (Class137)var1;// 461
         if (this.equals(Class138.field579)) {// 358
            return true;// 192
         } else {
            if (this instanceof Class144 && ((Class144)this).method101()) {// 179
               if (this instanceof Class144 && ((Class144)this).method101()) {// 33
                  if (this.equals(this)) {// 0
                     return true;// 240
                  }

                  if (Class411.method779(((Class144)this).method93(), ((Class144)this).method93())) {// 552
                     return true;// 278
                  }
               }

               if (this instanceof Class144 && ((Class144)this).method161() && Class411.method772(((Class144)this).method93(), ((Class144)this).method93())) {// 59 391
                  return true;// 589
               }
            }

            if (this instanceof Class144 && ((Class144)this).method161()) {// 428
               if (this instanceof Class144 && ((Class144)this).method101() && this.equals(Class138.field583)) {// 232 399
                  return true;// 463
               }

               if (this instanceof Class144 && ((Class144)this).method161()) {// 412
                  if (this.equals(this)) {// 38
                     return true;// 257
                  }

                  if (Class411.method772(((Class144)this).method93(), ((Class144)this).method93())) {// 455
                     return true;// 236
                  }
               }
            }

            if (this instanceof Class145) {// 63
               if (this instanceof Class144 && ((Class144)this).method101() && this.equals(Class138.field583)) {// 456 510
                  return true;// 367
               }

               if (this instanceof Class145) {// 386
                  Class138 var2 = ((Class145)this).method164();// 157
                  Class138 var3 = ((Class145)this).method164();// 24
                  if (var2 instanceof Class142 && var3 instanceof Class142 && var2.equals(var3)) {// 286
                     return true;// 600
                  }

                  if (var3 instanceof Class137 && var2 instanceof Class137 && ((Class137)var2).method139(var3)) {// 209
                     return true;// 116
                  }
               }

               int var7;
               if (this instanceof Class144 && ((Class144)this).method161()) {// 23
                  for (int var8 = var7 = 0; var8 < Class125.field202.length; var8 = ++var7) {// 440
                     if (this.equals(new Class144(Class125.field202[var7]))) {// 248
                        return true;// 97
                     }
                  }
               }
            }

            return false;// 119
         }
      }
   }

   /** @deprecated */
   // $VF: synthetic method
   public Class137 method140(Class137 var1) {
      if (this.equals(Class138.field579)) {// 281
         return var1;// 438
      } else if (var1.equals(Class138.field579)) {// 483
         return this;// 181
      } else if (this.equals(var1)) {// 125
         return this;// 413
      } else if (!(this instanceof Class145) && !(var1 instanceof Class145)) {// 297
         if ((!(this instanceof Class144) || !((Class144)this).method159()) && (!(var1 instanceof Class144) || !((Class144)var1).method159())) {// 522
            Class144 var2 = (Class144)this;// 558
            Class144 var8 = (Class144)var1;// 501
            Class205[] var5 = Class411.method780(var2.method93());// 337
            Class205[] var4 = Class411.method780(var8.method93());// 208
            if (var5 != null && var4 != null) {// 168
               Class205[] var3 = new Class205[var5.length + 1];// 504
               Class205[] var6 = new Class205[var4.length + 1];// 80
               System.arraycopy(var5, 0, var3, 1, var5.length);// 283
               System.arraycopy(var4, 0, var6, 1, var4.length);// 544
               int var12 = 0;
               var3[0] = Class411.method790(var2.method93());// 114
               var6[0] = Class411.method790(var8.method93());// 460

               for (int var9 = 0; var12 < var6.length; var12 = ++var9) {// 102
                  for (int var13 = var11 = 0; var13 < var3.length; var13 = ++var11) {// 105
                     if (var3[var11].equals(var6[var9])) {// 183
                        return new Class144(var3[var11].method93());// 205
                     }
                  }
               }

               return null;// 196
            } else {
               return null;// 237
            }
         } else {
            return Class138.field583;// 551
         }
      } else {
         return Class138.field583;// 426
      }
   }

   // $VF: synthetic method
   public Class137 method141(Class137 var1) {
      if (this.equals(Class138.field579)) {// 434
         return var1;// 292
      } else if (var1.equals(Class138.field579)) {// 72
         return this;// 268
      } else if (this.equals(var1)) {// 66
         return this;// 536
      } else {
         if (this instanceof Class145 && var1 instanceof Class145) {// 177
            Class145 var2 = (Class145)this;// 266
            Class145 var3 = (Class145)var1;// 235
            if (var2.method17() == var3.method17() && var2.method26() instanceof Class144 && var3.method26() instanceof Class144) {// 280
               return new Class145(((Class144)var2.method26()).method141((Class144)var3.method26()), var2.method17());// 95
            }
         }

         if (!(this instanceof Class145) && !(var1 instanceof Class145)) {// 129
            if ((!(this instanceof Class144) || !((Class144)this).method159()) && (!(var1 instanceof Class144) || !((Class144)var1).method159())) {// 110
               Class144 var11 = (Class144)this;// 300
               Class144 var13 = (Class144)var1;// 245
               Class205[] var8 = Class411.method780(var11.method93());// 296
               Class205[] var4 = Class411.method780(var13.method93());// 404
               if (var8 != null && var4 != null) {// 417
                  Class205[] var5 = new Class205[var8.length + 1];// 556
                  Class205[] var6 = new Class205[var4.length + 1];// 316
                  System.arraycopy(var8, 0, var5, 1, var8.length);// 207
                  System.arraycopy(var4, 0, var6, 1, var4.length);// 275
                  int var14 = 0;
                  var5[0] = Class411.method790(var11.method93());// 127
                  var6[0] = Class411.method790(var13.method93());// 355

                  for (int var9 = 0; var14 < var6.length; var14 = ++var9) {// 496
                     for (int var15 = var12 = 0; var15 < var5.length; var15 = ++var12) {// 369
                        if (var5[var12].equals(var6[var9])) {// 215
                           return new Class144(var5[var12].method93());// 511
                        }
                     }
                  }

                  return null;// 548
               } else {
                  return null;// 81
               }
            } else {
               return Class138.field583;// 444
            }
         } else {
            return Class138.field583;// 258
         }
      }
   }

   // $VF: synthetic method
   public boolean method62(Class138 var1) {
      return this.equals(Class138.field579) ? true : this.method139(var1);// 1 46 553
   }

   // $VF: synthetic method
   public Class137(byte var1, String var2) {
      super(var1, var2);// 484
   }// 409
}
