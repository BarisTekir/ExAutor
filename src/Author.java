public class Author {
    private String nume = "Baris Tekir";
    private String email = "tekir@list.ru";
    private char gender = 'M';

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public Author(String Nume, char gender, String email) {
         this.nume   = Nume;
         this.gender = gender;
         this.email  = email;


    }

    public String toString(){
        return nume + gender + email;
    }
}