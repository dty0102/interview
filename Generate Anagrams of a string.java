Generate all permutations of that string and then check all those strings to decide it is an anagram of that string or not;
public class MyClass {
	public static void main(String[] args){
		generate("dog");
	}
	public static void generate(String input){
		char[] characters = input.toCharArray();
		ArrayList<String> result = new ArrayList<String>();
		if (input == null || input.length() == 0){return;}
		StringBuilder sb = new StringBuilder();
		helper(result,sb,characters);
		for(String s : result){
			if(anagram(s,input)){System.out.println(s);}
		}
		return;
	}
	public static boolean anagram(String s, String t) {
        // write your code here
        if (s.length() != t.length()) return false;
        int [] time = new int[126];
        for (int i = 0; i < s.length();i++){
            time[(int) s.charAt(i)]++;
        }
        for (int j = 0;j < t.length();j++){
            time[(int)t.charAt(j)]--;
            if (time[(int) t.charAt(j)] < 0) return false;
        }
        return true;
    }
	public static void helper(ArrayList<String> result, StringBuilder sb, char[] characters){
		if(sb.length() == characters.length){
			String level = sb.toString();
			result.add(level);
			return;
		}
		for(char c: characters){
			sb.append(c);
			helper(result,sb,characters);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
