package TestCollectiopn;

import java.util.LinkedList;
import java.util.List;



public class Node {
	Object value;
	public Node leftNode;
	public Node rightNode;
	public void add(Object x) {
		if(value==null) {
			value = x;
		}
		else{
			
	if((Integer)x-(Integer)value <=0) { //��ԭֵ�Ƚ� ,��С�ڵ���ԭֵ����������ڵ����
		if(leftNode==null) 
			leftNode =new Node();
		leftNode.add(x);
		}
		else {  //��֮���ҽڵ����
			if(rightNode==null) 
				rightNode = new Node();
			rightNode.add(x);
			}
		}
	}
	public List<Object> values() {
		List<Object> values = new LinkedList<>();
		if(null!=leftNode)
			values.addAll(leftNode.values());
		
		values.add(value);
		if(null!=rightNode)
			values.addAll(rightNode.values());
		return values;
			
	}
		public static void main(String[] args) {
			int test[] = new int [] {67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
			Node root = new Node();
			for(int number:test)
				root.add(number);
			System.out.println(root.values());
			
		}
		
	
	}
