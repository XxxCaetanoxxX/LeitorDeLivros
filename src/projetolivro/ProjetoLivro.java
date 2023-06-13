package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        pessoa[] p= new pessoa[2];
        livro[] l=new livro[3];
        
        p[0]=new pessoa("Pedro",22,"M");
        p[1]=new pessoa("Maria",25,"F");
        
        l[0]= new livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1]= new livro("POO para iniciantes", "Pedro paulo", 500, p[1]);
        l[2]= new livro("Java avançado", "Maria Candido", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}
