// Isabela Lima da Cunha
import java.util.Random;

/** A classe Tamagotchi possui todos os atributos e
 *  métodos nessesários para o funcionamento do programa
 */ 
public class Tamagotchi
{
    private String nome;
    private int idade;
    private int peso;
    private int dias;
    private int diasSemDormir = 0;
    private int sono = 0;
    private int fome = 0;
    private int entediado = 0;
    
    /**
     * O construtor do Tamagotchi determina os atributos: nome, idade, peso e dias.
     */
    public Tamagotchi(String nome, int idade, int peso, int dias)
    {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.dias = dias;
        
    }

    /**
     * Getter e setter da variável nome
     */
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /**
     * Getter e setter da variável peso
     */
    public int getPeso(){  
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    /**
     * Getter e setter da variável idade
     */
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    /**
     * Getter e setter da variável dias
     */
    public int getDias(){
        return dias;
    }
    public void setDias(int dias){
        this.dias = dias;
    }
    
    /**
     * Getter e setter da variável diasSemDormir
     */
    public int getDiasSemDormir(){
        return diasSemDormir;
    }
    public void setDiasSemDormir(int diasSemDormir){
        this.diasSemDormir = diasSemDormir;
    }
    
    /**
     * Getter e setter da variável sono
     */
    public int getSono(){
        return sono;
    }
    public void setSono(int sono){
        this.sono = sono;
    }
    
    /**
     * Getter e setter da variável fome
     */
    public int getFome(){
        return fome;
    }
    public void setFome(int fome){
        this.fome = fome;
    }
    
    /**
     * Getter e setter da variável Entediado
     */
    public int getEntediado(){
        return entediado;
    }
    public void setEntediado(int entediado){
        this.entediado = entediado;
    }
    
    /**
     * Método dormir: aumenta um dia na vida do Tamagotchi e redefine a variável
     * diasSemDormir para 0
     */
    public void dormir(){
       dias++;
       diasSemDormir = 0;
    }
    
    /**
     * Método comerPouco: aumenta o peso 1 quilo do peso do Tamagotchi
     */
    public void comerPouco(){
        peso = peso + 1;
        
    }
    
    /**
     * Método comerMuito: aumenta 5 quilos do peso do Tamagotchi
     */
    public void comerMuito(){
        peso = peso + 5;
        
        dormir();
    }
    
    /**
     * Método naoComer: diminui 2 quilos do peso do Tamagotchi
     */
    public void naoComer(){
        peso = peso - 2;
        
    }
    
    /**
     * Método Correr: aumenta 1 quilo do peso do tamagotchi, pois ele perde 4 quilos 
     * e ganha 5 quilos
     */
    public void Correr(){
       peso = peso + 1;
       
    }
    
    /**
     * Método Caminhar: diminui 1 quilo do peso do Tamagotchi e deixa ele com some ao 
     * redefinir a variável fome para 6
     */
    public void Caminhar(){
        peso = peso - 1;
        fome = 6;
    }
    
    /**
     * Método SentirSono: Primeiro ele define um valor aleatório para 
     * a variável sono. Se ele ficar com sono, há a opção de dormir 
     * ou permanecer acordado. Se ele não ficar com sono, ele continua acordado.
     * Quando ele sentir sono e não tiver dormido por 5 dias ele automaticamente
     * dorme.
     */
    public void SentirSono(){
        sono = (int) (Math.random() * 10 +1);
        
        if (sono > 5) {
                    System.out.println(nome + " está com sono (∪｡∪)｡｡｡ zzZ"); 
                    String escolhaSono = Teclado.leString("Dormir ou Permanecer acordado?(1/2)");
                    if(escolhaSono.equals("1")) {
                        dormir();
                        System.out.println(nome + " dormiu ...ZzzZzzZzz");
                        diasSemDormir = 0;
                    }
                    else if (escolhaSono.equals("2")){
                        if(diasSemDormir >= 5){
                           System.out.println(nome + " é muito teimoso! (¬_¬)");
                           System.out.println("Não dorme faz 5 dias, então será obrigado a dormir hoje ");
                           System.out.println("(∪｡∪)｡｡｡ zzZZzzZZzz");
                           dormir(); 
                        }
                        else {  
                        System.out.println(nome + " não dormiu");
                        diasSemDormir++;
                        }
                    }
        }          
        else {    
            System.out.println(nome + " está sem sono (｡◕‿◕｡)");
        }
    }
    
    /**
     * Método SentirFome: é gerado um valor aleatório para fome. 
     * Se o Tamagotchi sentir fome, o usuário possui três opções.
     * De acordo com as opções o Tamagotchi pode ganhar ou perder peso. 
     */
    public void SentirFome(){
            fome = (int) (Math.random() * 10 +1);
            
            if (fome > 5) {
                    System.out.println(nome + " está com fome 《⋟ ﹏ ⋞》"); 
                    String escolhaFome = Teclado.leString("Comer um pouco, comer muito ou não comer?(1/2/3)");
                    if(escolhaFome.equals("1")){
                        comerPouco();
                        System.out.println(nome + " comeu um pouco"); 
                    }
                    else if(escolhaFome.equals("2")){
                        comerMuito();
                        System.out.println(nome + " comeu muito e foi dormir (∪｡∪)｡｡｡ zzZ");
                    }
                    else if (escolhaFome.equals("3")) {
                        System.out.println(nome + " não comeu e emagreceu 2 kilos"); 
                        naoComer();
                    }
            }
                else {  
                    System.out.println("Está sem fome ╰(´•‿•`)╯"); 
                }
    }
    
    /**
     * Método FicarEntediado: é gerado um valor aleatório para a variável 
     * entediado. Se o Tamagotchi ficar entediado, o usuário possui duas
     * opções. Quando ele se exercita ele pode ganhar peso, perder peso e
     * também ficar com fome.
     */
    public void FicarEntediado(){
        entediado = (int) (Math.random() * 10) + 1;
        
        if(entediado > 5){
                    System.out.println("Está entediado (-︹-)");
                    String escolhaEntediado = Teclado.leString("Correr ou caminhar por 10 minutos?(1/2)");
                    if(escolhaEntediado.equals("1")){
                        Correr();
                        System.out.println(nome + " se exercitou! 〲( ^ᴗ^ )〴"); 
                    }
                    else if(escolhaEntediado.equals("2")){
                        Caminhar();
                        System.out.println(nome + " se exercitou! 〲( ^ᴗ^ )〴");  
                    }
        }
                else{
                    System.out.println("Não está entediado! (ﾉ＾⌣＾)ﾉ"); 
                }
    }
}
        
    
    

