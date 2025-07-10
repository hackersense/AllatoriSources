package com.allatori.eclipse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

// $VF: Compiled from bx
public class MenuAddBuilder extends AbstractHandler implements IHandler {
   // $VF: synthetic method
   public Object execute(ExecutionEvent var1) {
      IProject var10;
      if ((var10 = method1497(var1)) != null) {// 30 332
         try {
            if (method1498(var10)) {// 252
               return null;// 20
            }

            ICommand var4;
            IProjectDescription var9;
            (var4 = (var9 = var10.getDescription()).newCommand()).setBuilderName("com.allatori.eclipse");// 239 310 498
            ArrayList var3;
            (var3 = new ArrayList()).addAll(Arrays.asList(var9.getBuildSpec()));// 389 409
            int var5 = 0;// 513
            Iterator var7 = var3.iterator();

            ArrayList var11;
            label32: {
               for (Iterator var10000 = var7; var10000.hasNext(); var10000 = var7) {// 93
                  var5++;// 151
                  ICommand var6 = (ICommand)var7.next();
                  if ("org.eclipse.jdt.core.javabuilder".equals(var6.getBuilderName())) {// 530
                     var11 = var3;
                     break label32;// 491
                  }
               }

               var11 = var3;// 338
            }

            var11.add(var5, var4);
            var9.setBuildSpec((ICommand[])var3.toArray(new ICommand[var3.size()]));// 161
            var10.setDescription(var9, null);// 141
         } catch (CoreException var8) {// 226
            var8.printStackTrace();// 123
         }
      }

      return null;// 185
   }

   // $VF: synthetic method
   public static IProject method1497(ExecutionEvent var0) {
      ISelection var2;
      if ((var2 = HandlerUtil.getCurrentSelection(var0)) instanceof IStructuredSelection) {// 170 553
         Object var3 = ((IStructuredSelection)var2).getFirstElement();// 58
         return (IProject)Platform.getAdapterManager().getAdapter(var3, IProject.class);// 315
      } else {
         return null;// 184
      }
   }

   // $VF: synthetic method
   public static final boolean method1498(IProject var0) {
      IProject var2 = var0;

      try {
         ICommand[] var4;
         int var3 = (var4 = var2.getDescription().getBuildSpec()).length;

         for (int var10000 = var6 = 0; var10000 < var3; var10000 = ++var6) {// 493
            ICommand var1 = var4[var6];
            if ("com.allatori.eclipse".equals(var1.getBuilderName())) {// 561
               return true;// 377
            }
         }
      } catch (CoreException var5) {// 22
      }

      return false;// 461
   }
}
