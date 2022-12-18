import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 광야의 크기 N * M
        int N = sc.nextInt();
        int M = sc.nextInt();

        int Ac = sc.nextInt(); // 처음 위치의 열
        int D = sc.nextInt(); // 진행 방향(0:왼쪽, 1:오른쪽)
        boolean isRight;

        if(D == 1) {
            isRight = true;
        } else {
            isRight = false;
        }

        // 부하 몬스터의 위치 Sr * Sc
        int Sr = sc.nextInt();
        int Sc = sc.nextInt();

        String retVal = "NO...";

        if(Sr < 1) {
            retVal = "YES!";
        } else if(Sr == 1) {
            if(isRight) {
                if(Ac > Sc) {
                    retVal = "YES!";
                }
            } else {
                if(Ac < Sc) {
                    retVal = "YES!";
                }
            }
        } else{
            if(Sr == N) {
                if(((N - 1) % 2) == 1) {
                    isRight = !isRight;
                }
                if(isRight) {
                    if(M < Sc) {
                        retVal = "YES!";
                    }
                } else {
                    if(M > Sc) {
                        retVal = "YES!";
                    }
                }

            }
        }

        System.out.println(retVal);

    }
}

