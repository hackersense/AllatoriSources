package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from jo
public final class Class191 extends Class178 {
   // $VF: synthetic field
   public String field677;

   // $VF: synthetic method
   public Class191(Class191 var1) {
      this(var1.method20());// 295
   }// 338

   // $VF: synthetic method
   public Class191(DataInputStream var1) {
      super((byte)1);
      this.field677 = var1.readUTF();// 185 406
   }// 1

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1034(this);// 192
   }// 574

   // $VF: synthetic method
   public final void method131(String var1) {
      this.field677 = var1;// 428
   }// 87

   // $VF: synthetic method
   public Class191(String var1) {
      super((byte)1);// 465
      if (var1 == null) {// 132
         throw new IllegalArgumentException("bytes must not be null!");// 184
      } else {
         this.field677 = var1;// 488
      }
   }// 495

   // $VF: synthetic method
   public final String method20() {
      return this.field677;// 391
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field665);
      var1.writeUTF(this.field677);// 246 552
   }// 603
}
