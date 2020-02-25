
import java.util.*;

public class OneStackSoution {
	
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            if(input.length() == 0) {
                System.out.println("true");
            } else {
                LinkedList<Character> stack = new LinkedList<Character>();
                boolean ready = true;
                label1:
                for(int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
					if (ch == '(' || ch =='{' || ch == '[') {
					    stack.addFirst(ch);	
					} else {
                    switch (ch) {
                        case ')':
                            if ((stack.size() > 0) && (stack.getFirst() == '(') ) {
                                stack.removeFirst();
							    break;
								} else {
									ready = false;
							        break label1;
									}
                                
                        case ']':
                              if ((stack.size() > 0) && (stack.getFirst() == '[') ) {
                                stack.removeFirst();
							    break;
								} else {
									ready = false;
							        break label1;
									}
                        case '}':
                              if ((stack.size() > 0) && (stack.getFirst() == '{') ) {
                                stack.removeFirst();
							    break;
								} else {
									ready = false;
							        break label1;
									}
                    }
					}
                }
                if (stack.size()==0 && ready) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                    stack.clear();

                }
            }
        }
        sc.close();
    }
}
