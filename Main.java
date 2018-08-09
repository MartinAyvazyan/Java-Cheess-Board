import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class Main {

	public static void main(String... args) throws IOException{
		int n = 8;
		int m = 8;
		File file = new File("xxx.txt");
		FileWriter xxx = new FileWriter("xxx.ppm");		
		xxx.append("P2\n");
		xxx.append(""+m +" " + n + ""  + "\n");
		xxx.append("15\n");
		System.out.println(file.exists());
		for (int i = 0; i<n; i++) {
			for (int j=0; j<m; j++){
				if((i+j)%2==0){
					xxx.append("0 ");
					System.out.print("0");
				}else {	
					xxx.append("15 ");	
					System.out.print("15");
				}
			}
			xxx.append("\n");
			System.out.println(" ");
		}	
		xxx.flush();
	}
  }
