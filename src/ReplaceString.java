public class ReplaceString {
    public static void main(String[] args) {
        String string = "Happy birthday";
        String GantiKarakter = string.replace('i', 'a');
        String GantiKalimat = string.replace("birthday", "graduation");
        System.out.println("Untuk replace karakter :" +GantiKarakter);
        System.out.println("Untuk replace kalimat :" +GantiKalimat);
    }
}
