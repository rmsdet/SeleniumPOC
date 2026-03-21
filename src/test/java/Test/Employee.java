package Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {

	
    

   /* create a java class that manages employee records using a linkedhashmap. 
   the class should include functions to add, update, and delete employee entries, 
   while ensuring that the insertion order of the records is preserved. 
   use the employee id as the key to allow easy identification and manipulation of employee data.*/
	Map<Integer,String> t=new LinkedHashMap<>();
	    public void empAdd(int k, String s) {
	    	t.put(k, s);
	    	
	    }
	    public void empUpdate(int l, String u) {
	    	if(t.containsKey(l)) {
	    		t.put(l, u);
	    	}
	    }
	    public void empDelete(int m) {
	    	if(t.containsKey(m)) {
	    		t.remove(m);
	    	}	
	    	
	    	
	    	
	    }
	    
	    public void emDisplay() {
	    	for(Map.Entry<Integer,String> me:t.entrySet()) {
	    		System.out.println(me.getKey()+"  "+me.getValue());
	    	}
	    	
	    	
	    	
	    }
	    
	    public static void main(String args[]) {
	    	Employee empObj = new Employee();
	    	empObj.empAdd(101,"A");
	    	empObj.empAdd(102,"B");
	    	empObj.empAdd(103,"C");
	    	empObj.emDisplay();
	    	
	    	empObj.empUpdate(102,"B Updated");
	    	empObj.emDisplay();
	    	
	    	empObj.empDelete(103);
	    	empObj.emDisplay();
	    	
	    	
	    	
	    }
	  
	
	
			
		}

  

