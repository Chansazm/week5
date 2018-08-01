/**
 * 
 */
package MscGroupProject;

/**
 * @author Chansa Chishimba
 * Tells us whether the employee is part of management and shows inheritance
 */
class check {
	  public check() {
	    System.out.println("Employee");
	  }
	}
	class B extends check {
	  public B() {
	    System.out.println("Management");
	  }
	}

	class Program {
	
	      B obj = new B();
	  }// ends method check
	