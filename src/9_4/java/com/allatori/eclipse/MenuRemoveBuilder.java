package com.allatori.eclipse;

import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;

// $VF: Compiled from ww
public class MenuRemoveBuilder extends AbstractHandler implements IHandler {
   // $VF: synthetic method
   public Object execute(ExecutionEvent var1) {
      IProject var10;
      if ((var10 = MenuAddBuilder.method1497(var1)) != null) {// 34 507
         try {
            IProjectDescription var9 = var10.getDescription();// 260
            ArrayList var3;
            (var3 = new ArrayList()).addAll(Arrays.asList(var9.getBuildSpec()));// 30 143
            ICommand[] var7;
            int var6 = (var7 = var9.getBuildSpec()).length;

            int var5;
            for (int var10000 = var5 = 0; var10000 < var6; var10000 = ++var5) {// 20
               ICommand var4 = var7[var5];
               if ("com.allatori.eclipse".equals(var4.getBuilderName())) {// 204
                  var3.remove(var4);// 239
               }
            }

            var9.setBuildSpec((ICommand[])var3.toArray(new ICommand[var3.size()]));// 409
            var10.setDescription(var9, null);// 389
         } catch (CoreException var8) {// 18
            var8.printStackTrace();// 513
         }
      }

      return null;// 491
   }
}
