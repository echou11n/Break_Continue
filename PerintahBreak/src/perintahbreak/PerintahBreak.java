package perintahbreak;
public class PerintahBreak {

    public static void main(String[] a) {
        System.out.println("=========Ini Break========")
        for(int i = 0; i<20; i++){
        if (i == 10){
            break;
        }
        System.out.println(i);
    }
        System.out.println("=========Ini Continue========")
        for (int i=0 ; i <10; i++){
        if (i == 10){
            continue;
        }
        System.out.println(i);
    }
} 
}
