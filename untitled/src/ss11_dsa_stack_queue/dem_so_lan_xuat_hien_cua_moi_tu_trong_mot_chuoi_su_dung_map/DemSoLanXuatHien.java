package ss11_dsa_stack_queue.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_su_dung_map;

import java.util.Map;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String str = "hEllo words heLlo   ";
        str = str.replaceAll(" ", "");
        str = str.trim();
        String[] arr = str.toLowerCase().split("");
        Map<String,Integer > map = new TreeMap<>();
        Integer temp;
        for (String s : arr) {
            if (map.containsKey(s)) {
                temp = map.get(s);
                map.remove(s);
                map.put(s,temp + 1);
            } else {
                map.put(s,1);
            }
        }
        for (String key1 : map.keySet()) {
            System.out.println("Từ '" + key1 + "' xuất hiện " + map.get(key1) + " lần");
        }
    }
}
