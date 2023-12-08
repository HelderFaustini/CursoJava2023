public class CalcularMedia {
    static float media ( int a, int b){
       return (( a + b)/2); 
    }

    public static void main(String[] args) throws Exception {
        float cmedia = media(2, 5);
        System.out.println("A média é: " + cmedia);
    }
}
