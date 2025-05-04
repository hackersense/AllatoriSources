package com.allatori.ant;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_439 implements Iterator {
    public class_337 field_1694;
    public final class_70 field_1695;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.field_1694 != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.field_1694 == null) {
            throw new NoSuchElementException();
        }
        class_337 class_337Var = this.field_1694;
        this.field_1694 = this.field_1694.field_1117;
        return class_337Var;
    }

    public class_439(class_70 class_70Var) {
        this.field_1695 = class_70Var;
        this.field_1694 = class_70.method_416(this.field_1695);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
