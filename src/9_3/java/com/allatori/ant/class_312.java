package com.allatori.ant;

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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_312 extends AbstractHandler implements IHandler {
    public static final boolean method_1364(IProject iProject) {
        try {
            ICommand[] buildSpec = iProject.getDescription().getBuildSpec();
            int length = buildSpec.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (!"com.allatori.eclipse".equals(buildSpec[i2].getBuilderName())) {
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                } else {
                    return true;
                }
            }
            return false;
        } catch (CoreException e) {
            return false;
        }
    }

    public static IProject method_1362(ExecutionEvent executionEvent) {
        IStructuredSelection currentSelection = HandlerUtil.getCurrentSelection(executionEvent);
        if (!(currentSelection instanceof IStructuredSelection)) {
            return null;
        }
        return (IProject) Platform.getAdapterManager().getAdapter(currentSelection.getFirstElement(), IProject.class);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0031 */
    public Object method_1363(ExecutionEvent executionEvent) {
        ArrayList arrayList;
        IProject method_1362 = method_1362(executionEvent);
        if (method_1362 != null) {
            try {
                if (!method_1364(method_1362)) {
                    IProjectDescription description = method_1362.getDescription();
                    ICommand newCommand = description.newCommand();
                    newCommand.setBuilderName("com.allatori.eclipse");
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(Arrays.asList(description.getBuildSpec()));
                    int i = 0;
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            arrayList = arrayList2;
                            break;
                        }
                        i++;
                        if ("org.eclipse.jdt.core.javabuilder".equals(((ICommand) it.next()).getBuilderName())) {
                            arrayList = arrayList2;
                            break;
                        }
                    }
                    arrayList.add(i, newCommand);
                    description.setBuildSpec((ICommand[]) arrayList2.toArray(new ICommand[arrayList2.size()]));
                    method_1362.setDescription(description, (IProgressMonitor) null);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
