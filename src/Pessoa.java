public class Pessoa {

    private int id;
    private String name;
    private String tel;
    private String email;
    private static int numeroPessoas = 0;
    
    public Pessoa() {
    
        this.id = ++Pessoa.numeroPessoas;
    
    }
    
    public Pessoa(String name, String tel, String email) {
        
        this(); // chamando constructor vazio

        this.name = name;
    
        this.tel = tel;
    
        this.email = email;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", name=" + name + ", tel=" + tel + ", email=" + email + "]";
    }
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Juan Perez", "55442233", "juan@gmail.com");
        System.out.println(pessoa.toString());
    }


}
