package com.allatori.eclipse;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;

// $VF: Compiled from yz
public class AllatoriPropertyTester extends PropertyTester {
   // $VF: synthetic field
   public static final String field1767 = "isEnabled";

   // $VF: synthetic method
   public boolean test(Object var1, String var2, Object[] var3, Object var4) {
      IProject var5;
      return "isEnabled".equals(var2) && (var5 = (IProject)Platform.getAdapterManager().getAdapter(var1, IProject.class)) != null// 52 134 446
         ? MenuAddBuilder.method1498(var5)// 10
         : false;// 507
   }
}
