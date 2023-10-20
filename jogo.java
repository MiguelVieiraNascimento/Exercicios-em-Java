
import java.util.Scanner;

public class jogo {
     String [][] arena = {{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"}};
    public static void main(String[] args) {
    }
    public void mostrar() {
    Scanner sca = new Scanner(System.in);
    System.out.println("Escolha seu Icone: ");
    System.out.println("1 Para jogar com X");
    System.out.println("2 Para jogar com 0");
    int icone = sca.nextInt();
    int icone2;
  
    //problema
    if(icone == 1){
    icone2 = 2;
    System.out.println("Jogador 1 é X");
    System.out.println("Jogador 2 é 0");
    boolean escolhal = true;
    jogadaX();
    }
    else if(icone == 2) {
    icone2 = 1;
    System.out.println("Jogador 1 é 0");
    System.out.println("Jogador 2 é X");
    boolean escolha2 = true;
    jogadaO();
    }else{
    boolean erro = true; 
    }
    System.out.println("-----------------------------------------------");
    }

    public String arena(){
    for(int i = 0; i < this.arena.length; i++){
        for(int j = 0; j < this.arena[i].length; j++){
        System.out.print(this.arena[i][j]);
        }
        System.out.println();
    }
     return "";
    }

// arena[0] 
    public int jogadaX() {
    String [][] arena = {{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"}};
    //String[] array = 

    Scanner sca = new Scanner(System.in);

    System.out.println("Digite a cordenada onde quer jogar:");
    
    int linhaX = sca.nextInt()-1;
    int colunaY = sca.nextInt()-1;

    if(verificaJogada(this.arena[linhaX][colunaY])) {
        //true
        this.arena[linhaX][colunaY] = "[X]";
    }
    else {
        //false
        System.out.println("Jogada inválida, campo indisponível. Escolha outro campo:");
        jogadaX();
    
    }

    //this.arena[linhaX][colunaY] = "[X]";

    for(int i = 0; i < this.arena.length; i++){
        for(int j = 0; j < this.arena[i].length; j++){
        System.out.print(this.arena[i][j]);
    }
    System.out.println("");
}
   if(vitoria() == true){
        //se alguem ganhou
    } else {
        
    if(velha() == true){
        System.out.println("IXI... deu velha!");
    } else{
       jogadaO(); 
    }
    }

    return 0;
}

    public int jogadaO() {
    Scanner sca = new Scanner(System.in);
    System.out.println("Digite a coordenada onde quer jogar:");

    int linhaX = sca.nextInt()-1;
    int colunaY = sca.nextInt()-1;

    //só fazer se estiver vazia
    if(verificaJogada(this.arena[linhaX][colunaY])) {
        //true
        this.arena[linhaX][colunaY] = "[O]";
    }
    else {
        //false
        System.out.println("Jogada inválida, campo indisponível. Escolha outro campo:");
        jogadaO();
    
    }
    //this.arena[linhaX][colunaY] = "[O]";

    for (int i = 0; i < this.arena.length; i++){
            for(int j = 0; j < this.arena[i].length; j++){
        System.out.print(this.arena[i][j]);
    }
   
    System.out.println("");
    }
    //velha
    
    if(vitoria() == true){
        //se alguem ganhou
    } else {
        
    if(velha() == true){
        System.out.println("IXI... deu velha!");
    } else{
       jogadaX(); 
    }
    }

    return 0;
    }

    public boolean vitoria(){
       
        if(horizontal() || vertical() || diagonal() == true){
            return true;
        }else {
            return false;
        }
}

    public boolean verificaJogada(String casaDesejada){
        if(casaDesejada.equals("[ ]")){
            return true;
            
        }else {
            return false;
            //System.out.println("Jogada inválida. Tente outro campo!");
        }
    }

    public boolean velha(){
        for(int i = 0; i < this.arena.length; i++){
            for(int j = 0; j < this.arena[i].length; j++){
                if(verificaJogada(this.arena[i][j])){
                    return false;
                }
            }
        }
        System.out.println("Deu velha!");
        return true;
    }

    public boolean horizontal(){
        //this.arena[0]
        if(this.arena[0][0] == this.arena[0][1] && this.arena[0][2] == this.arena[0][1] && this.arena[0][1] != "[ ]"){
                System.out.println("Você ganhou seu marmanjo");
                return true;
        }
        if(this.arena[1][0] == this.arena[1][1]  && this.arena[1][2] == this.arena[1][1] && this.arena[1][1] != "[ ]"){
                System.out.println("Você ganhou seu marmanjo");
                return true;
        }
        if(this.arena[2][0] ==  this.arena[2][1]  && this.arena[2][2] == this.arena[2][1] && this.arena[2][1] != "[ ]"){
                System.out.println("Você ganhou seu marmanjo");
                return true;
        }
        return false;
    }
    public boolean vertical(){
        if(this.arena[0][0] == this.arena[1][0] && this.arena[2][0] == this.arena[1][0] && this.arena[1][0] != "[ ]"){
                System.out.println("Você ganhou seu marmanjo");
                return true;
        }
        if(this.arena[0][1] == this.arena[1][1] && this.arena[2][1] ==  this.arena[1][1] && this.arena[1][1] != "[ ]"){
                System.out.println("Você ganhou seu marmanjo");
                return true;
        }
        if(this.arena[0][2] == this.arena[1][2] && this.arena[2][2] == this.arena[1][2] && this.arena[1][2] != "[ ]"){
                System.out.println("Você ganhou seu marmanjo");
                return true;
        }
        
        return false;
    }
    public boolean diagonal(){
        if(this.arena[0][0] == this.arena[1][1] && this.arena[2][2] == this.arena[1][1] && this.arena[1][1] != "[ ]"){
                System.out.println("Você ganhou seu marmanjo");
                return true;
        }
        if(this.arena[0][2] == this.arena[1][1] && this.arena[2][0] == this.arena[1][1] && this.arena[1][1] != "[ ]"){
                System.out.println("Você ganhou seu marmanjo");
                return true;
        }
                
        return false;
    }
}
