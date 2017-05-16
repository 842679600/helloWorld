package 单例之饿汉式;

public class singgleton {

		private static singgleton singgle;
		private singgleton(){
			
		}
		static {
			System.out.println("----创建一个单例---");
			singgle=new singgleton();
		}
		private static singgleton getInstance(){
			return singgle;
		}
		
		public static void main(String[] args) {
			System.out.println(new singgleton().getInstance());
			System.out.println(new singgleton().getInstance());
		}
		
}
