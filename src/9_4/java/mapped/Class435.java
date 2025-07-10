package mapped;

import java.io.ByteArrayInputStream;

// $VF: Compiled from de
public final class Class435 extends ByteArrayInputStream {
   // $VF: synthetic method
   public Class435(String var1) {
      super(var1.getBytes());// 40
   }// 63

   // $VF: synthetic method
   public final void method870() {
      if (this.pos > 0) {// 27
         this.pos--;// 242
      }
   }// 209

   // $VF: synthetic method
   public final String method871() {
      return new String(this.buf);// 279
   }

   // $VF: synthetic method
   public final void method872(int var1) {
      this.pos = var1;// 157
   }// 24

   // $VF: synthetic method
   public final int method873() {
      return this.pos;// 456
   }
}
