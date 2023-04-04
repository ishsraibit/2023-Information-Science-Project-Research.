package ch05.sec04;


public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        //문자열 분리
        String[] tokens = board.split("S");

        //인덱스별로 읽기
        System.out.println("번호: " + tokens[0]);
        System.out.println("제목: " + tokens[1]);
        System.out.println("내용: " + tokens[2]);
        System.out.println("성명: " + tokens[3]);
        System.out.println(tokens[4]);
        System.out.println();

        //for 문을 이용한 읽기
        for(int i=0; i<tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}

    String ssn = "880815-1234567";

    System.out.println(firstNum);

                String secondNum = ssn.substring(7);
                System.out.println(secondNum);

                String oldstring = "자바 프로그래밍";
                String newstring = oldstring.replace(target:"프로그래밍", replacement: "Programming");


                String a = "자바";
                String b = "자바";
                String c = new String(original: "자바");

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);

                System.out.println(a == b);
                System.out.println(b == c);
                System.out.println(c != a);
                System.out.println(a.equals(c));

                int[] intArray = null;
                //int[] intArray = {3, -9, 7};
                //System.out.println(intArray[0]);
                //intArray[0] = 10; //NullPointerException

                String str = null;
                //String str = "인천과학고";
                System.out.println("총 문자 수 :"+ str.length());
                //System.out.println("총 문자 수: " + str.length() );//NullPointerException
                }
                }