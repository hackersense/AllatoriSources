package smardecSB;

import java.util.*;

public class StringCompartor implements Comparator
{
   public StringCompartor () {
      super();
   }

   public /* synthetic */ int compare(final Object o, final Object o2) {
      return ((String)o).length() - ((String)o2).length();
   }
}
