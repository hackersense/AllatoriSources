package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from yi
public final class Class184 extends Class178 implements Class180 {
   // $VF: synthetic field
   public float field671;

   // $VF: synthetic method
   @Override
   public Object method227(Class149 var1) {
      return new Float(this.field671);// 38
   }

   // $VF: synthetic method
   public final float method230() {
      return this.field671;// 485
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field665);
      var1.writeFloat(this.field671);// 0 33
   }// 240

   // $VF: synthetic method
   public final void method231(float var1) {
      this.field671 = var1;// 73
   }// 415

   // $VF: synthetic method
   public Class184(Class184 var1) {
      this(var1.method230());// 533
   }// 185

   // $VF: synthetic method
   public Class184(DataInputStream var1) {
      this(var1.readFloat());// 132
   }// 184

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1014(this);// 144
   }// 461

   // $VF: synthetic method
   public Class184(float var1) {
      super((byte)4);
      this.field671 = var1;// 295 338
   }// 273
}
