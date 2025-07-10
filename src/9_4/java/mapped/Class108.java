package mapped;

// $VF: Compiled from ig
public abstract class Class108 extends Class90 implements Class88, Class16, Class3 {
   // $VF: synthetic method
   public Class108(short var1, Class246 var2) {
      super(var1, var2);// 239
   }// 310

   // $VF: synthetic method
   public Class246 method37() {
      Class108 var1 = this;
      Class246 var3;
      Class246 var10000 = var3 = this.field12;// 190

      while (var10000.method37() != null) {// 465
         var10000 = var3 = var3.method37();// 132
      }

      var10000 = var3;// 488

      while (var10000.method18() != var1) {
         var10000 = var3 = var3.method32();// 495
      }

      Class246 var2 = var3;// 493

      while (var3 != null) {// 561
         if ((var3 = var3.method32()) != null && var3.method18() == var1) {// 377 604
            throw new RuntimeException("physicalSuccessor() called on a shared JsrInstruction.");// 22
         }
      }

      return var2.method32();// 358
   }

   // $VF: synthetic method
   @Override
   public Class138 method1(Class221 var1) {
      return new Class140(this.method37());// 273
   }

   // $VF: synthetic method
   public Class108() {
   }// 151
}
