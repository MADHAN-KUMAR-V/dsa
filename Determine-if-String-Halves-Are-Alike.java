class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int first=0;
        int second= s.length()/2;
        int count=0;
        
        while(second < s.length()){
            char firstchar = s.charAt(first++);
            char secondchar = s.charAt(second++);

            if(vowels.contains(firstchar)){
                    count+=1;
            }
            if(vowels.contains(secondchar)){
                count-=1;
            }
        }
        return count==0?true:false;
        
    }
}
