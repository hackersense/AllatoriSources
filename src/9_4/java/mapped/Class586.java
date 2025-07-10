package mapped;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

// $VF: Compiled from l
public class Class586 implements FilenameFilter {
   // $VF: synthetic method
   public boolean accept(File var1, String var2) {
      String var3;
      return (var3 = var2.toLowerCase(Locale.ENGLISH)).endsWith(".zip") || var3.endsWith(".jar");// 386 470
   }
}
