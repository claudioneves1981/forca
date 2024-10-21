package forca

import java.util.Random;
import java.util.Scanner;

public class Forca {

	public static void main(String[] args) {
		
		String[] palavras = new String[]{"casa","teste","hora","choque"};
		Random sorteiapalavra = new Random();
		int i = sorteiapalavra.nextInt(4);
		String palavrasorteada =palavras[i];
		char[] palavraformada = new char[palavrasorteada.length()];
		String[] desenhoforca = new String[] {" O "," | ", " V ", " | "," M "};

		int j = 0;
		int k = 0;
		int x = 0;
		int y = 0;
		int h = 0;
	
		int cont=0;
		
		Scanner entrada = new Scanner(System.in);
		String letrapalavra = null;
		
		System.out.print("Jogo da forca a palavra sorteada tem "+palavrasorteada.length()+" letras\n");
		
		while(h<palavrasorteada.length()) {
			
			palavraformada[h]='_';
			
			System.out.print(palavraformada[h]+" ");
			
			h++;
			
		}
		
		while(x>=0) {
		
		letrapalavra = entrada.nextLine();
		
			if(!palavrasorteada.contains(letrapalavra)) {
				
				k++;
				
				while(y<k) {
					
						if(y==desenhoforca.length-1 || letrapalavra.length()!=1) {
							
								if(desenhoforca[y]==" O ") {	
							
									System.out.print("FORCA!!!!Que Pena voce perdeu!!! \nA palavra escolhida pelo sistema foi '"+palavrasorteada+"' tente novamente!!!");
						
								}else {
							
									System.out.print(desenhoforca[y]);
							
									System.out.print("\nFORCA!!!!Que Pena voce perdeu!!! \nA palavra escolhida pelo sistema foi '"+palavrasorteada+"' tente novamente!!!");
							
								}
						
						System.exit(0);
						
						}
								
								
				System.out.println(desenhoforca[y]);
						
				y++;
					
				}
				
				y=0;
								
			}else if(letrapalavra.length()==1) {
			
				while( j < palavrasorteada.length()) {
					
					try {
				
					if(letrapalavra.charAt(0)==palavrasorteada.charAt(j)) {
					
						palavraformada[j]=palavrasorteada.charAt(j);
						
						cont++;
					
					}
					
					}catch(ArrayIndexOutOfBoundsException e) {
						
						if(cont == palavrasorteada.length()) {

					
							System.out.print(palavraformada[j]+" "+palavraformada[j+1]);	
					
							System.exit(0);
					
						}
						
						
					}
							
				System.out.print(palavraformada[j]+" ");	
					
				j++;
				
				}
				
				if(cont == palavrasorteada.length()) {
					break;
				}
			
			}else if(letrapalavra.equals(palavrasorteada)){
				
			System.out.println();	
			System.out.print("Parabens!!! Vc acertou. A palavra e '"+palavrasorteada+"'");
			
			System.exit(0);
			
			}else{
				
			System.out.print("FORCA!!!!Que Pena voce perdeu!!! \nA palavra escolhida pelo sistema foi '"+palavrasorteada+"' tente novamente!!!");

			System.exit(0);
				
			}
				
			x++;
			j=0;		
			
		}	
		
		if(!palavraformada.toString().contains("_") || !palavraformada.toString().contains(letrapalavra)) {
			System.out.println();	
			System.out.print("Parabens!!! Vc acertou. A palavra e '"+palavrasorteada+"'");
			
		}

	}

}
