class Count{
    public static void CountVovelsConsonants(String str){
        int vowels=0;
        int consonants=0;
        int space=0;
        String small=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=small.charAt(i) ;
            if(ch!=' '&&(ch>='a'&&ch<='z')){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;


                }
                else{
                    consonants++;
                }
            }else{
                space++;
            }

        }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(space);
        


        

    }
}
public class CountVovelsConsonants{
    public static void main(String[] args) {
        String str="rd engineering college";
        Count c=new Count();
        c.CountVovelsConsonants(str);

    }
    
}