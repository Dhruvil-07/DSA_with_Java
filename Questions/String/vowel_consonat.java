
/*
 q-> find vowel and consonate in string
 */
public class vowel_consonat 
{
    static void count(String str)
    {
        int vowel , consonate;
        vowel = consonate = 0;

        for(char ch : str.toCharArray())
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            {
                vowel++;
            }
            else if(ch >= 'A' && ch <='z')
            {
                consonate++;
            }
        }
        System.out.println("vowel : "+vowel +"  consoanate:"+consonate) ;
    }

    public static void main(String[] args) {
        String str = "apple";
        count(str);
    }    
}
