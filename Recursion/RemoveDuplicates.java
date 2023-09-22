public class RemoveDuplicates {

    public static void removeDuplicates(String queryString, int queryStringIndex, boolean mapArr[],
            StringBuilder uniqueString) {
        // base case
        if (queryStringIndex == queryString.length()) {
            // Print the unique String, because in this case,
            // we already iterate through the queryString
            System.out.println(uniqueString);
            return;
        } else {
            // Current char on the *queryString*
            char currentChar = queryString.charAt(queryStringIndex);

            // index of the currentChar on the map Array
            int currentCharIndexOnMap = currentChar - 'a';

            // substract the char with 'a' will return a int
            // ex:
            // 'a' - 'a'= 0
            // 'b' - 'a'= 1
            // 'c' - 'a'= 2
            // 'd' - 'a'= 3
            // .
            // .
            // .
            // 'z'-'a'=25

            // if the mapArr[currentCharIndexOnMap] is false, mean the character from the
            // queryString is not appear before. In this case take the mapArr[currentCharIndexOnMap] to true
            //because on the next check it will not append the char in uniqueString
            if (mapArr[currentCharIndexOnMap] == false) {
                mapArr[currentCharIndexOnMap] = true;
                uniqueString.append(currentChar);
            }
            removeDuplicates(queryString, queryStringIndex + 1, mapArr, uniqueString);
        }

    }

    public static void main(String[] args) {
        String queryString = "appnnacollege";
        int queryStringIndex = 0;
        StringBuilder uniqueString = new StringBuilder("");
        boolean mapArr[] = new boolean[26];
        removeDuplicates(queryString, queryStringIndex, mapArr, uniqueString);
    }
}
