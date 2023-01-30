package Tinkoff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Floors {

    public int minFloors(int n, int time, int[] array, int employeeNumber) {

        List<Integer> floors = new ArrayList<Integer>();
        array = new int[n];

        for (int i = 0; i < n; i++) {
            floors.add(array[i]);
        }
        int max = Collections.max(floors);

        int res = 0;
        if (floors.get(employeeNumber - 1) <= time) {

            return res += max - floors.get(0);
        } else {
            if (max - floors.get(employeeNumber) <= floors.get(employeeNumber) - floors.get(0)) {
                res += max - floors.get(employeeNumber);
            } else
                res += floors.get(employeeNumber) - floors.get(0);
            return res += max - floors.get(0);
        }
    }
}
