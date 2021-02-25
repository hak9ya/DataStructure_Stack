//Array Stack

public class TestStack {
	static class Stack{
		private int top;			//�����͸� �����ϴ� �迭 ����, ��ܽ���
		private int stackSize;		//���� ũ��
		private int stackArr[];		//���� �迭 ����	
		
		public Stack(int stackSize) {	//������
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
		
		public void push(int data) {	//������ ����
			if(isFull()) {
				System.out.println("������ ���� ��");
			} else {
				stackArr[++top] = data;		// ���� �� 1�� ������ top�� �������� 0�� ��
				System.out.println("Insert Data : " + data);
			}				
		}
		
		public int pop() {	//���� ���� ��ġ�� ��ȯ �� ����
			if(isEmpty()) {
				System.out.println("���� ����, ������ �������");
				return 0;
			} else {
				System.out.println("��� ���� ���� : " + stackArr[top]);
				return stackArr[top--];
			}
		}
		
		public int peek() {
			if(isEmpty()) {
				System.out.println("���� ����, ������ �������");
				return 0;
			} else {
	            System.out.println("Peek Data : " + stackArr[top]);
	            return stackArr[top];
			}
		}
		
		public void printStack() {
			if(isEmpty()) {
				System.out.println("������ �������");
			} else {
				System.out.println("Stack list : ");
				for(int i = 0; i <= top; i++) {
					System.out.println(stackArr[i] + "");
				}
			}
		}
	}
	 
	public static void main(String[] args) {
		Stack st = new Stack(100);		//������
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
 