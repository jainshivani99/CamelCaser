public class CamelCaser {
    public static String camelCase(String inputString){
        String characterRegex = "/^[!@#$%^&*()_+\\-=\\[\\]{};':|,.\"<>/?]*$/";
        if (inputString.equals(null)) {
            throw new IllegalArgumentException(ErrorConstants.INPUT_NULL);
        }
        if (inputString.matches(characterRegex)) {
            throw new IllegalArgumentException(ErrorConstants.INVALID_CHARACTER);
        }
        if (inputString.substring(0,1).matches("[0-9]")) {
            throw new IllegalArgumentException(ErrorConstants.INVALID_FORMAT);
        }
        inputString = inputString.toLowerCase();
        String[] words = inputString.split(" ");
        String finalOutput = words[0];
        for (int i = 1; i < words.length; i++) {
            finalOutput += words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }
        return finalOutput;
    }
}