package mapped;

import java.io.Serializable;

// $VF: Compiled from dj
public abstract class Class196 implements Serializable {
   // $VF: synthetic field
   public int field692;

   // $VF: synthetic method
   public final void method235(boolean var1) {
      this.method255(16, var1);// 541
   }// 550

   // $VF: synthetic method
   public final boolean method236() {
      return (this.field692 & 2048) != 0;// 15
   }

   // $VF: synthetic method
   public final boolean method237() {
      return (this.field692 & 4096) != 0;// 516
   }

   // $VF: synthetic method
   public final boolean method238() {
      return (this.field692 & 32) != 0;// 286
   }

   // $VF: synthetic method
   public final void method239(boolean var1) {
      this.method255(4, var1);// 463
   }// 198

   // $VF: synthetic method
   public final void method240(boolean var1) {
      this.method255(4096, var1);// 177
   }// 266

   // $VF: synthetic method
   public final void method241(boolean var1) {
      this.method255(8, var1);// 455
   }// 148

   // $VF: synthetic method
   public final boolean method242() {
      return (this.field692 & 16) != 0;// 82
   }

   // $VF: synthetic method
   public final int method17() {
      return this.field692;// 123
   }

   // $VF: synthetic method
   public final void method243(boolean var1) {
      this.method255(64, var1);// 94
   }// 209

   // $VF: synthetic method
   public final boolean method244() {
      return (this.field692 & 8192) != 0;// 110
   }

   // $VF: synthetic method
   public final void method245(boolean var1) {
      this.method255(128, var1);// 223
   }// 45

   // $VF: synthetic method
   public final boolean method246() {
      return (this.field692 & 256) != 0;// 525
   }

   // $VF: synthetic method
   public final boolean method247() {
      return (this.field692 & 128) != 0;// 97
   }

   // $VF: synthetic method
   public final void method248(boolean var1) {
      this.method255(16384, var1);// 251
   }// 486

   // $VF: synthetic method
   public final boolean method249() {
      return (this.field692 & 4) != 0;// 329
   }

   // $VF: synthetic method
   public final void method250(boolean var1) {
      this.method255(1024, var1);// 474
   }// 443

   // $VF: synthetic method
   public final void method251(boolean var1) {
      this.method255(32, var1);// 386
   }// 470

   // $VF: synthetic method
   public final boolean method252() {
      return (this.field692 & 1) != 0;// 68
   }

   // $VF: synthetic method
   public final void method253(boolean var1) {
      this.method255(512, var1);// 291
   }// 57

   // $VF: synthetic method
   public final boolean method254() {
      return (this.field692 & 8) != 0;// 368
   }

   // $VF: synthetic method
   public final void method255(int var1, boolean var2) {
      if ((this.field692 & var1) != 0) {// 192
         if (!var2) {// 574
            this.field692 ^= var1;// 272
            return;// 321
         }
      } else if (var2) {// 146
         this.field692 |= var1;// 567
      }
   }// 0

   // $VF: synthetic method
   public final void method256(boolean var1) {
      this.method255(2, var1);// 579
   }// 555

   // $VF: synthetic method
   public final void method257(boolean var1) {
      this.method255(2048, var1);// 536
   }// 307

   // $VF: synthetic method
   public Class196(int var1) {
      this.field692 = var1;// 147 491
   }// 295

   // $VF: synthetic method
   public final void method258(boolean var1) {
      this.method255(1, var1);// 603
   }// 278

   // $VF: synthetic method
   public final void method259(boolean var1) {
      this.method255(256, var1);// 119
   }// 32

   // $VF: synthetic method
   public final void method260(boolean var1) {
      this.method255(8192, var1);// 288
   }// 129

   // $VF: synthetic method
   public final void method90(int var1) {
      this.field692 = var1;// 534
   }// 488

   // $VF: synthetic method
   public final boolean method261() {
      return (this.field692 & 1024) != 0;// 373
   }

   // $VF: synthetic method
   public Class196() {
   }// 389

   // $VF: synthetic method
   public final boolean method159() {
      return (this.field692 & 64) != 0;// 464
   }

   // $VF: synthetic method
   public final int method2() {
      return this.field692;// 170
   }

   // $VF: synthetic method
   public final boolean method161() {
      return (this.field692 & 16384) != 0;// 296
   }

   // $VF: synthetic method
   public final void method6(int var1) {
      this.method90(var1);// 22
   }// 6

   // $VF: synthetic method
   public final boolean method163() {
      return (this.field692 & 2) != 0;// 428
   }

   // $VF: synthetic method
   public final boolean method101() {
      return (this.field692 & 512) != 0;// 314
   }
}
