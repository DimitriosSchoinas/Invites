import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int numeroBilhetes = in.nextInt();
		in.nextLine();
		int numeroAmigos = in.nextInt();
		in.nextLine();
		int [] numeroBilhetesPedido = new int [numeroAmigos];//foi criado um array de inteiros para guardar o numero de bilhetes pedido por cada amigo
		int [] numeroBilhetesRecebido = new int [numeroAmigos];
		
		int soma =0;
		for(int i=0;i<numeroAmigos;i++) {    //esta parte serve para registar num array o numero inteiro do numeor de bilhetes pedido por cada amigo
			 numeroBilhetesPedido [i]= in.nextInt();
			in.nextLine();
			soma = soma + numeroBilhetesPedido [i];	
			
		}
		
		int divisao = numeroBilhetes/numeroAmigos;
		int resto;
		int adicao = 0;
		int subtracao = numeroBilhetes;
		int numeroAmigosFinal = numeroAmigos;
		int divisao2;
		int diferenca2;
		
		
	
		
		
		
		for(int i=0;i<numeroAmigos;i++) {
			if(soma <=numeroBilhetes ) {
				numeroBilhetesPedido [i] = numeroBilhetesPedido [i];
				
			}else if(numeroBilhetes<numeroAmigos) {
				numeroBilhetesPedido[i]=0;
			}
			
			else if(soma >numeroBilhetes) {
			int z= 0;
				while(numeroBilhetes>0) {
					if (z<4 && numeroBilhetesRecebido[z]<numeroBilhetesPedido [z]) {numeroBilhetesRecebido[z]=numeroBilhetesRecebido[z]+1;
					z=z+1;
					numeroBilhetes = numeroBilhetes-1;} 
					else if(z>=4 &&numeroBilhetesRecebido[z]<numeroBilhetesPedido [z]){
						numeroBilhetesRecebido[z]=numeroBilhetesRecebido[z]+1;
						z = 0;
						numeroBilhetes = numeroBilhetes-1;
					}
					
				}}}
				
				
				
				
				
				
				
				
				
				
				
			
				
			
			
	
		
			
		
		
		
		
		
		
	
			
			
		
		
		
		
		
		
	for(int z=0;z<numeroAmigos;z++) {  
		System.out.println( numeroBilhetesRecebido[z]);
	}
	
		
	

		
		
		
		
		
		
		
		
		
		
		

	}

}