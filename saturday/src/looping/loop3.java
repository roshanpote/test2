package looping;

public class loop3 {

	public static void main(String[] args) {
		for(int i=5;i>=0;i--){
			for (int s=1;s<i;s++){
				System.out.print(" ");
			} for (int j=5;j>=i;j--){
				System.out.println("#");
			}System.out.println(" ");
		}
	}
	
}
