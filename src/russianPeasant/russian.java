package russianPeasant;
import javax.swing.JOptionPane;
public class russian {
	public static int peasant(int first, int second){
		int answer = 0;
		if(first%2==0&&first>0){
			answer=(first/2)*2*second;
			System.out.println("The answer is "+answer);
			russian.main(null);
			return answer;
		}else if(first%2!=0&&first>0){
			answer=(((first-1)/2)*2*second) + second;
			System.out.println("The answer is "+answer);
			russian.main(null);
			return answer;
		}
		return answer;
	}
	public static void main(String[]args){
		int first;
		int second;
		
		String tempFirst = JOptionPane.showInputDialog("Please enter the first number to multiply or enter X to cancel");
		if(tempFirst=="X"){
			System.exit(0);
		}
		String tempSecond = JOptionPane.showInputDialog("Please enter the second number to multiply or enter X to cancel");
		if(tempSecond=="X"){
			System.exit(0);
		}
		first = Integer.parseInt(tempFirst);
		second = Integer.parseInt(tempSecond);
		peasant(first,second);
		}		
	}

