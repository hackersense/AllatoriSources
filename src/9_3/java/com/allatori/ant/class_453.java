package com.allatori.ant;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_453 implements ListSelectionListener {
    public final JustIce field_1789;

    public class_453(JustIce justIceVar) {
        this.field_1789 = justIceVar;
    }

    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        this.field_1789.method_403(listSelectionEvent);
    }
}
