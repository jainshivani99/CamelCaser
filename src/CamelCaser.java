public class CamelCaser {
    public static String camelCase(String inputString){
        //String characterRegex = "/^[!@#$%^&*()_+\\-=\\[\\]{};':|,.\"<>/?]*$/";
        String regex = "[!@#%&,^*()_+={};':|.<>?/]";
        if (inputString == null) {
            throw new IllegalArgumentException(ErrorConstants.INPUT_NULL);
        }
        if (inputString.equals("")) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if (inputString.substring(0,1).equals(" ")) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if (inputString.substring(0,1).matches("[0-9]")) {
            throw new IllegalArgumentException(ErrorConstants.INVALID_FORMAT);
        }
        for (int i = 0; i < inputString.length(); i++) {
            String current = inputString.substring(i, i+1);
            if (current.matches(regex)) {
                throw new IllegalArgumentException(ErrorConstants.INVALID_CHARACTER);
            }
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