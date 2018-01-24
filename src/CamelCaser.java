public class CamelCaser {
    public static String camelCase(String inputString){
        inputString = inputString.toLowerCase();
        String[] words = inputString.split(" ");
        String finalOutput = words[0];
        for (int i = 1; i < words.length; i++) {
            finalOutput += words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }
        return finalOutput;
    }
}