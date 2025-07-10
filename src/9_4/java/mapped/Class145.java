package mapped;

// $VF: Compiled from jm
public final class Class145 extends Class137 {
   // $VF: synthetic field
   public int field600;
   // $VF: synthetic field
   public Class138 field601;

   // $VF: synthetic method
   public Class145(byte var1, int var2) {
      this(Class142.method158(var1), var2);// 530
   }// 491

   // $VF: synthetic method
   public Class145(String var1, int var2) {
      this(new Class144(var1), var2);// 123
   }// 78

   // $VF: synthetic method
   @Override
   public int hashCode() {
      return this.field601.hashCode() ^ this.field600;// 28
   }

   // $VF: synthetic method
   public Class145(Class138 var1, int var2) {
      Class145 var3 = this;
      super((byte)13, "<dummy>");// 58
      if (var2 >= 1 && var2 <= 255) {// 190
         switch (var1.method142()) {// 132
            case 12:
               throw new Class241("Invalid type: void[]");// 561
            case 13:
               while (false) {
               }

               Class145 var4;
               Class145 var10001 = var4 = (Class145)var1;// 534
               this.field600 = var2 + var4.field600;// 488
               this.field601 = var10001.field601;// 495
               break;// 159
            default:
               this.field600 = var2;
               this.field601 = var1;// 22 604
         }

         StringBuffer var5 = new StringBuffer();// 461

         for (int var10000 = var6 = 0; var10000 < var3.field600; var10000 = var6) {// 358
            var6++;
            var5.append('[');// 192
         }

         var5.append(var3.field601.method20());// 272
         var3.field590 = var5.toString();// 321
      } else {
         throw new Class241("Invalid number of dimensions: " + var2);// 315
      }
   }// 179

   // $VF: synthetic method
   @Override
   public boolean equals(Object var1) {
      Class145 var3;
      return var1 instanceof Class145 ? (var3 = (Class145)var1).field600 == this.field600 && var3.field601.equals(this.field601) : false;// 39 148 236 455
   }

   // $VF: synthetic method
   public int method17() {
      return this.field600;// 87
   }

   // $VF: synthetic method
   public Class138 method164() {
      return (Class138)(this.field600 == 1 ? this.field601 : new Class145(this.field601, this.field600 - 1));// 59 391 589
   }

   // $VF: synthetic method
   public Class138 method26() {
      return this.field601;// 246
   }
}
