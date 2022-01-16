package de.hessin.java.utils;

/**
 * @param
 *            @Example
 *     @String test = "TYPE2=@[" +
 *             "@{title:Kheri, icon:drawable, img:https://komini.de}#" +
 *             "@{title:system, icon:system, img:https://komini.de2}#" +
 *             "@={title:system, icon:system, img:https://komini.de3}#" +
 *             "@{title:Kheri, icon:url, img:https://komini.de4}#" +
 *             "@{title:system, icon:url, img:https://komini.de5}#" +
 *             "@{title:system, icon:system, img:https://komini.de6}#" +
 *             "]#";
 *     HArray array = new HArray(test);
 *     int i=0;
 * for (String item : array.getItemArray()) {
 *     System.out.println(" Item -"+i+"= " + array.getSubItem(item, "img"));
 *     i++;
 * }
 *
 */

public class HArray {
    public static class TYPE {
        public static String
                TYPE0="TYPE0", // main items without keys
                TYPE2="TYPE1"; // main item always with keys
    }
    private String[] string;
    private String[] arr;

    public HArray(String s){
        try {
            arr = s.split("=@\\[");
            String ss = arr[1].split("]#")[0].replace("@{", "");
            string = ss.split("\\}#");
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public boolean isType(String type){
        type = type.toUpperCase();
        return arr[0].toUpperCase().equals(type);
    }
    public String[] getItemArray(){
        return string;
    }
    public String getItem(int pos){
        return string[pos];
    }

    public String getSubItem(int itemPos, String key){
        try {
            String item = getItem(itemPos);
            return item.split(key + ":")[1].split(",")[0];
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return null;
    }
    public String getSubItem(String item, String key){
        return item.split(key+":")[1].split(",")[0];
    }
    public int getCount(){
        return string.length;
    }
}
