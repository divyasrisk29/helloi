public class Main {
    public static void main(String[] args){
        HashMap<String,String> map =new HashMap<>();
        map.put("TN","Tamilnadu");
        map.put("KA","Karnataka");
        map.put("KL","kerala");
        
        System.out.println(map.get("TN"));
        System.out.println(map.get("KA"));
        System.out.println(map.getOrDefault("AG","not found"));
        map.remove("KL");
        System.out.println("after removing key KL:" + map);
    }
} 
