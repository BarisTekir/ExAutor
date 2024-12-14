public class TestAuthor {
    public static void main(String[] args) {

        Author a1 = new Author("Baris Tekir, ",'m', ", tekir@list.ru ");
        System.out.println(a1.toString());
        a1.setEmail(", tekir@gmail.com");
        System.out.println(a1);
    }

}
