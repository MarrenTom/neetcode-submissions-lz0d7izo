class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            List<String> group = new ArrayList<>();
            for (int j = 0; j < strs.length; j++) {
                char[] charsJ = strs[j].toCharArray();
                Arrays.sort(charsJ);
                boolean same = true;
                if (chars.length != charsJ.length) {
                    same = false;
                } else {
                    for (int k = 0; k < chars.length; k++) {
                        if (chars[k] != charsJ[k]) {
                            same = false;
                        }
                    } 
                }
                if (same) {
                    group.add(strs[j]);
                }
            }
            boolean found = false;
            for (int m = 0; m < result.size(); m++) {
                if (result.get(m).size() == group.size()) {
                    boolean same = true;
                    for (int n = 0; n < group.size(); n++) {
                        if (!result.get(m).get(n).equals(group.get(n))) {
                            same = false;
                        }
                    }
                    if (same) {
                        found = true;
                    }
                }
            }
            if (!found) {
                result.add(group);
            }
        }
        return result;
    }
}