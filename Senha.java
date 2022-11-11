import java.util.Scanner;
public class Senha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		int senha;
       
       System.out.println("digite uma senha");
       senha=sc.nextInt();
       while (senha!=2002) {
			System.out.println("senha invalida");
			System.out.println();
			System.out.println("digite uma senha novamente");
			senha=sc.nextInt();
			//System.out.println("Parabens senha correta");
		
		}
       System.out.println("Parabens senha correta");
		
		sc.close();
	}

}
