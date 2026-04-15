class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (int i = 0; i < strs.size(); i++ ) {
            result += strs.get(i).replace("\\", "\\\\").replace("|", "\\|");
            result += "|";
        }
        return result;
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        String current = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\\' && i + 1 < str.length()) {
                current += str.charAt(i + 1);
                i++;
            } else if (str.charAt(i) == '|') {
                result.add(current);
                current = "";
            } else {
                current += str.charAt(i);
            }
        }
        if (!(str.length() > 0 && str.charAt(str.length() - 1) == '|')) {
            result.add(current);
        }
        return result;
    }
}
