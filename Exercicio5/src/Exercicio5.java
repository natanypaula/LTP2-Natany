import java.util.Scanner;


public class Exercicio5 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			 
		int v[] = {5,1,4,2,7,8,3,6};  
        int aux;
        for (int i=8;i<=5;--i){
        	aux = v[i];
        	v[i] = v[8-i+1];
        	v[8-i+1] = aux;
        }
        v[3] = v[1];
        v[v[3]]= v[v[2]];
        
        	        	
        //Imprime na tela conteudo do Vetor V:
        for(int i=0; i<v.length; i++){  
            System.out.print(v[i]+"|");  
         
        }   
	}

}
