package StrStrCodingStyle;
/*
 * For a given source string and a target string, you should output the first index(from 0) of target string in source string.
 * If target does not exist in source, just return -1.
 * *****************************************************
 * If source = "source" and target = "target", return -1.
 * If source = "abcdabcdefg" and target = "bcd", return 1.
 */
class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
//    public int strStr(String source, String target) {
//        // write your code here
//        if (source == null || target == null){
//            return -1;
//        }
//        if (source.length() < target.length()){
//            return -1;
//        }
//        for(int i = 0; i < source.length() - target.length() + 1; i++){
//            int j = 0;
//            for(j = 0; j < target.length(); j++){
//                if (source.charAt(i + j) != target.charAt(j)){
//                    break;
//                }
//            //move the next if block outside, otherwise code would fail
//            }
//            if (j == target.length()) {
//                return i;
//            }
//        }
//
//
//        return -1;
//    }
    public int strStr(String source, String target) {
        // write your code here
        if(source == null || target == null || source.length() < target.length()){
            return -1;
        }
        int scanLeftBound = 0;
        int scanRightBound = source.length() - target.length();
        while(scanLeftBound <= scanRightBound){
            int i = 0;
            for(i = 0; i < target.length(); i++){ // not i <= target.length(), if "<=" will run nullPointerExcep
                if(source.charAt(i + scanLeftBound) != target.charAt(i)){
                    break;
                }
            }
            if(i == target.length()){
                return scanLeftBound;
            }
            scanLeftBound++;
        }
        return -1;
    }

}

// if (source == null || target == null) {
//             return -1;
//         }
        
//         for (int i = 0; i < source.length() - target.length() + 1; i++) {
//             int j = 0;
//             for (j = 0; j < target.length(); j++) {
//                 if (source.charAt(i + j) != target.charAt(j)) {
//                     break;
//                 }
//             }
//             // finished loop, target found
//             if (j == target.length()) {
//                 return i;
//             }
//         }
//         return -1;