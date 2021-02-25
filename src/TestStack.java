//Array Stack

public class TestStack {
	static class Stack{
		private int top;			//데이터를 저장하는 배열 변수, 상단스택
		private int stackSize;		//스택 크기
		private int stackArr[];		//스택 배열 생성	
		
		public Stack(int stackSize) {	//생성자
			top = -1;
			stackArr = new int[stackSize];
			this.stackSize = stackSize;			
		}
		
		public boolean isEmpty() {
			return (top == -1);
		}
		
		public boolean isFull() {
			return (top == this.stackSize - 1);
		}
		
		public void push(int data) {	//데이터 저장
			if(isFull()) {
				System.out.println("스택이 가득 참");
			} else {
				stackArr[++top] = data;		// 인자 값 1이 들어오면 top을 증가시켜 0이 됨
				System.out.println("Insert Data : " + data);
			}				
		}
		
		public int pop() {	//현재 스택 위치를 반환 후 제거
			if(isEmpty()) {
				System.out.println("삭제 실패, 스택이 비어있음");
				return 0;
			} else {
				System.out.println("상단 스택 삭제 : " + stackArr[top]);
				return stackArr[top--];
			}
		}
		
		public int peek() {
			if(isEmpty()) {
				System.out.println("추출 실패, 스택이 비어있음");
				return 0;
			} else {
	            System.out.println("Peek Data : " + stackArr[top]);
	            return stackArr[top];
			}
		}
		
		public void printStack() {
			if(isEmpty()) {
				System.out.println("스택이 비어있음");
			} else {
				System.out.println("Stack list : ");
				for(int i = 0; i <= top; i++) {
					System.out.println(stackArr[i] + "");
				}
			}
		}
	}
	 
	public static void main(String[] args) {
		Stack st = new Stack(100);		//생성자
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.printStack(); 
		System.out.println("peek: " + st.peek()); // peek : 5
		st.pop();
		st.printStack(); 
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.printStack(); 
	}
}
 