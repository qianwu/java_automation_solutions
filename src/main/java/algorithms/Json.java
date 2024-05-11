package algorithms;

public class Json {

    /*
    diff two json strings, return the difference
     */
    public static void main(String[] args) {
        // 1. Get the first json string
        String json1 = "{\"name\":\"John\", \"age\":30, \"car\":null}";
        // 2. Get the second json string
        String json2 = "{\"name\":\"John\", \"age\":30, \"car\":null}";
        // 3. output the result
        if(json1.equals(json2)){
            System.out.println("The two json strings are the same.");
        }
        else{
            System.out.println("The two json strings are different.");
        }
    }
}
