package com.allatori.ant;

import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_313 extends AbstractHandler implements IHandler {
    public Object method_1365(ExecutionEvent executionEvent) {
        IProject method_1362 = class_312.method_1362(executionEvent);
        if (method_1362 != null) {
            try {
                IProjectDescription description = method_1362.getDescription();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(Arrays.asList(description.getBuildSpec()));
                ICommand[] buildSpec = description.getBuildSpec();
                int length = buildSpec.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    ICommand iCommand = buildSpec[i2];
                    if ("com.allatori.eclipse".equals(iCommand.getBuilderName())) {
                        arrayList.remove(iCommand);
                    }
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                }
                description.setBuildSpec((ICommand[]) arrayList.toArray(new ICommand[arrayList.size()]));
                method_1362.setDescription(description, (IProgressMonitor) null);
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
