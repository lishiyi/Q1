import java.io.*;
import java.util.*;

public Class Solution{

	private int count = 0;
	private int sum = 0;

	public static void main(String[] args) {

		calculator("1.txt");
		System.out.println("Count: " + count);
		System.out.println("Sum: " + sum);
	}

	public void calculator(String filePath){

		File file = new file(filePath);
		BufferedReader reader = null;
		try{
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			while((tempString = reader.readLine()) != null) {

				String[] arrays = tempString.split(" +");

				for(String str: arrays){
					int num = Float.parseFloat(str);
					count++;
					sum += num;
				}
			}
			reader.close();
		} catch (IOException e){
			e.printStackTrace();
		} finally{
			if(reader != null){
				try{
					reader.close();
				}
				catch(IOException e1){

				}
			}
		}
	}

	public int getCount(){
		return this.count;
	}

	public int getSum(){
		return this.sum;
	}

} 




