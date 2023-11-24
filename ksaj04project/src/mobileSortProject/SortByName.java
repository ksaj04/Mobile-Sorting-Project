package mobileSortProject;

import java.util.Comparator;

public class SortByName implements Comparator{
	
	public int compare(Object O1,Object O2)
	{
		RealmeMobiles m1=(RealmeMobiles)O1;
		RealmeMobiles m2=(RealmeMobiles)O2;
		
		return m1.name.compareTo(m2.name);
		
	}

}