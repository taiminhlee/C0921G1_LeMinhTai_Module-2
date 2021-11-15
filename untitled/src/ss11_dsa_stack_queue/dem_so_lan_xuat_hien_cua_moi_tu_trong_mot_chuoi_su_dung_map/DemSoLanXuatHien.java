package ss11_dsa_stack_queue.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_su_dung_map;

import java.util.Set;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String str = "hEllo words heLlo   ";
        str = str.replaceAll(" ", "");
        str = str.trim();
        String[] arr = str.toLowerCase().split("");
        String key;
        Integer value;
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String s : arr) {
            key = s;
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }

        Set set=map.keySet();

        for (Object o : set) {
            key = (String) o;
            System.out.println("Từ '" + key + "' xuất hiện " + map.get(key) + " lần");
        }
    }
}
