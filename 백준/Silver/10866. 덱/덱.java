import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // static을 붙이면 인스턴스를 생성할 필요 없이 필드와 메서드 둘다 접근이 가능하다.
    static List<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    static int front, back;

    public static void main(String[] args) throws IOException {
        // 덱. 스택과 큐의 성질을 동시에 갖고 있는 자료구조

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {

            String[] sArr = br.readLine().split(" ");

            String s = sArr[0];


            switch(s) {
                case "push_front":
                    front = Integer.parseInt(sArr[1]);
                    push_front(front);
                    break;
                case "push_back":
                    back = Integer.parseInt(sArr[1]);
                    push_back(back);
                    break;
                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
                    break;
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    if(list.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front":
                    if(list.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(front).append("\n");
                    break;
                case "back":
                    if(list.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(back).append("\n");
                    break;
            }

        }
        System.out.println(sb);
        
    }

    public static void push_front(int X) {
        list.add(0, front);
        front = list.get(0);

        if(list.size() == 1) {
            back = front;
        }
    }
    public static void push_back(int X) {
        list.add(list.size(), back);
        back = list.get(list.size()-1);

        if(list.size() == 1) {
            front = back;
        }
    }
    public static int pop_front() {
        if(list.isEmpty()) return -1;
        else {

            int temp = front;
            list.remove(0);

            if(! list.isEmpty()) {
                front = list.get(0);

                if(list.size() == 1) {
                    back = front;
                }

            }

            return temp;
        }
    }
    public static int pop_back() {
        if(list.isEmpty()) return -1;
        else {

            int temp = back;
            list.remove(list.size()-1);
            // 지우고 나서도 비어있지 않으면
            if(! list.isEmpty()) {
                back = list.get(list.size()-1);

                if(list.size() == 1) {
                    front = back;
                }
            }

            return temp;
        }
    }
}