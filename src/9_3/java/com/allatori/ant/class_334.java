package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_170;

import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_334 implements class_170, ListModel {
    public ArrayList field_1114 = new ArrayList();
    public TreeSet field_1115 = new TreeSet();

    /* renamed from: addListDataListener */
    public void m2x3e5730fd(ListDataListener listDataListener) {
        this.field_1114.add(listDataListener);
    }

    public class_334() {
        class_412.method_1572(this);
        method_146(null);
    }

    public Object getElementAt(int i) {
        return this.field_1115.toArray()[i];
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }

    @Override // p000.class_170
    public void method_146(String str) {
        int size = this.field_1114.size();
        class_225[] method_1575 = class_412.method_1575();
        int length = method_1575.length;
        this.field_1115.clear();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            this.field_1115.add(method_1575[i2].method_1062());
            i = i3;
            i2 = i3;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            int i6 = i5 + 1;
            ((ListDataListener) this.field_1114.get(i5)).contentsChanged(new ListDataEvent(this, 0, 0, length - 1));
            i4 = i6;
            i5 = i6;
        }
    }

    public int getSize() {
        return this.field_1115.size();
    }

    /* renamed from: removeListDataListener */
    public void m3x20628ae0(ListDataListener listDataListener) {
        this.field_1114.remove(listDataListener);
    }
}
