public class Lutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos
    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: "+ this.getNacionalidade());
        System.out.println(this.getIdade()+ " anos");
        System.out.println(this.getAltura()+ " m de altura");
        System.out.println("Pesando: "+ this.getPeso()+ " Kg");
        System.out.println("Ganhou: "+ this.getVitorias());
        System.out.println("Perdeu: "+ this.getDerrotas());
        System.out.println("Empatou: "+ this.getEmpates());
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso "+ this.getCategoria());
        System.out.println(this.getVitorias()+ " Vitórias");
        System.out.println(this.getDerrotas()+ " Derrotas");
        System.out.println(this.getEmpates()+" Empates");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setVitorias(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    //Métodos Especiais
    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em){ //Método construtor
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome(){ //Métodos Getters e Setters
        return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }

    public double getPeso(){
        return peso;
    }
    public void setPeso(double pe){
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "INVÁLIDO";
        }else{
            if (this.peso <= 70.3){
                this.categoria = "LEVE";
            }else{
                if (this.peso <= 83.9){
                    this.categoria = "MÉDIO";
                }else{
                    if (this.peso <= 120.2){
                        this.categoria = "PESADO";
                    }
                    else{
                        this.categoria = "INVÁLIDO";
                    }
                }
            }
        }
    }

    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double al){
        this.altura = al;
    }

    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }

    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de){
        this.derrotas = de;
    }

    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int em){
        this.empates = em;
    }

}
