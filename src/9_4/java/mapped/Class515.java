package mapped;

import java.io.PrintWriter;
import java.io.StringWriter;

// $VF: Compiled from mc
public final class Class515 {
   // $VF: synthetic method
   public static String method1463(Throwable var0) {
      StringWriter var3 = new StringWriter();// 18
      PrintWriter var2 = new PrintWriter(var3);// 513
      var0.printStackTrace(var2);// 93
      return var3.toString();// 151
   }
}
