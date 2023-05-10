// Isabela Lima da Cunha

/** 
* A classe principal é onde fica o método main e o while loop para que o programa funcione. 
*/
public class Principal
    {
    /**
    * Método main: cria um novo objeto (tamagotchi), determina as variáveis e 
    * possui um while loop que determina se o Tamagotchi morre ou continua vivo,
    * imprime o estado do Tamagotchi e chama os métodos: SentirSono, SentirFome e 
    * FicarEntediado.
    */
    public static void main(String[] args){
            System.out.println("♪♫•*¨*•.¸¸❤¸¸.•*¨*•♫♪•*¨*•.¸¸❤¸¸.•*¨*•♫♪");
            System.out.println("Bem Vindo ao jogo do Tamagotchi!");
            String nome = Teclado.leString("Qual será o nome do seu Tamagotchi?");
            
            Tamagotchi tamagotchi = new Tamagotchi(nome, 1, 1, 0);
            double sono = 0;
            double fome = 0;
            double entediado = 0;
            int dias = 0;
            int peso = 1; 
              while(dias<15 && tamagotchi.getPeso() >= 0 && tamagotchi.getPeso() <= 21) {
                    System.out.println("∘₊✧──────────────────────────✧₊∘");
                    System.out.println("Estado do Tamagotchi:");
                    System.out.println("Dia: " + tamagotchi.getDias());
                    System.out.println("Peso: " + tamagotchi.getPeso() + " kg");
                    System.out.println("∘₊✧──────────────────────────✧₊∘"); 
                    tamagotchi.SentirSono(); 
                    tamagotchi.SentirFome();
                    tamagotchi.FicarEntediado(); 
                    
                    if (tamagotchi.getDias() >= 15){
                        
                         System.out.println("Más notícias (✖╭╮✖)");
                         System.out.println("Já se passaram 15 dias e " + nome + " morreu de velhice.");   
                         break;
                    }
                    else if(tamagotchi.getPeso()>20){
                         System.out.println("Más notícias (✖╭╮✖)");
                         System.out.println(nome + " comeu demais e morreu.");
                         break;
                    }
                    else if (tamagotchi.getPeso()<=0){
                        System.out.println("Más notícias (✖╭╮✖)");
                        System.out.println(nome + " morreu de desnutrição");
                        break;
                    }
            }
            System.out.println("♪♫•*¨*•.¸¸❤¸¸.•*¨*•♫♪•*¨*•.¸¸❤¸¸.•*¨*•♫♪");
    }
}

    
    
    

