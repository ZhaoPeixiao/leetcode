package warmup.page4.employeeimportance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}


class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees){
            map.put(employee.id, employee);
        }
        return getImportance(map, id);
    }

    public int getImportance(Map<Integer, Employee> map, int id){
        Employee employee = map.get(id);
        if (employee.subordinates.size() == 0){
            return employee.importance;
        }
        int sum = employee.importance;
        for (int i : employee.subordinates){
            sum += getImportance(map, i);
        }
        return sum;
    }
}
