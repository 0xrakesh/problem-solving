public class Manipulate {
    public String userIDGeneration(String input1, String input2, int input3, int input4) {
        // Step 1: Determine Smaller and Longer Names
        String smallerName, longerName;
        if (input1.length() == input2.length()) {
            if (input1.compareTo(input2) < 0) {
                smallerName = input1;
                longerName = input2;
            } else {
                smallerName = input2;
                longerName = input1;
            }
        } else if (input1.length() < input2.length()) {
            smallerName = input1;
            longerName = input2;
        } else {
            smallerName = input2;
            longerName = input1;
        }

        // Step 2: Generate user-id
        String pinStr = String.valueOf(input3);
        char firstLetterLongerName = smallerName.charAt(smallerName.length()-1);
        char leftDigit = pinStr.charAt(input4 - 1);
        char rightDigit = pinStr.charAt(pinStr.length() - input4);
        String userId = firstLetterLongerName + longerName + leftDigit + rightDigit;

        // Step 3: Toggle the alphabets
        StringBuilder toggledUserId = new StringBuilder();
        for (char c : userId.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledUserId.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledUserId.append(Character.toUpperCase(c));
            } else {
                toggledUserId.append(c);
            }
        }

        return toggledUserId.toString();
   }
}