/**
 * a procedure-type method called examGrade that will take an exam percentage as a parameter and print out the associated letter grade.
 * @author Ahmad Zeshan
 */
public class Main {
	/**make a it method and make multiple if statements in it so that it would output the corresponding grade to that mark
	*/
	public static int examGrade(int mark){
		if (mark >= 80){
			System.out.println("A");
		}else if (mark >= 70 && mark <= 79){
			System.out.println("B");
		}else if (mark >= 60 && mark <= 69){
			System.out.println("C");
		}else if (mark >= 50 && mark <= 59){
			System.out.println("D");
		}else if (mark < 50){
			System.out.println("F");
		}
		return mark;
	}
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
		//call the method with the number of percent grade
    examGrade(81);
  }
}
