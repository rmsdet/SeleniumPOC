
package Test;
import java.util.LinkedHashMap;
import java.util.Map;

public class Inter2 {

    LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

    public void addEmployee(int id, String name) {
        map.put(id, name);
    }

    public void updateEmployee(int id, String name) {
        if(map.containsKey(id)) {
            map.put(id, name);
        }
    }

    public void deleteEmployee(int id) {
        map.remove(id);
    }

    public void displayEmployees() {
        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {

    	Inter2 em = new Inter2();

        em.addEmployee(101, "John");
        em.addEmployee(102, "Alice");

        em.displayEmployees();

        em.updateEmployee(102, "Alice Smith");
        em.displayEmployees();

        em.deleteEmployee(101);

        em.displayEmployees();
    }
}