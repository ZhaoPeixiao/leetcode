package warmup.page3.reformatdate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String reformatDate(String date) {
        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");

        String[] dates = date.split(" ");
        String day = dates[0].replace("st","").replace("nd","").replace("rd","").replace("th","");

        return dates[2] + "-" + months.get(dates[1]) + "-" + (day.length() == 1 ? "0" + day : day);
    }
}
