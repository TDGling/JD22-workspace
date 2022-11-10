// java06. 자바 메서드
public class java06 {   
    public static void main(String[] args) {
        /* 
            [ 자바 메서드 기본 특징 ]
            1. 메서드는 호출시에만 실행되는 코드블록이다.
            2. 매개변수로 데이터를 메서드에 전달함
            3. 메서드는 특정 작업을 수행하는 함수로 볼 수 있다.
            4. 메서드를 쓰는 이유는? 코드의 재사용
            5. 메서드 안에 메서드는 만들 수 없다(주의)

            [ 메서드의 생성 ]
            1. 메서드는 클래스 내부에 선언함
            2. 메서드의 이름과 소괄호, 중괄호로 구성
            3. 자바에는 내장 메서드도 있고 사용자 정의 메서드도 있음
            4. 메서드는 클래스와 구분하기 위해 소문자로 시작한다.
            (보탕 캐믈케이스 즉, 두번째 단어부터 대문자로 씀)
            5. void는 메서드의 리턴값이 없다는 뜻
            > string / int 등의 데이터 형을 쓰면 그 형의 리턴값이 있다는 뜻

            [ 메서드의 매개변수 ]
            1. 특정 데이터를 메서드에 전달하는 변수임
            2. 매개변수는 메서드 내에서만 사용되는 지역변수임
            3. 메개변수는 변수형 선언과 함께 소괄호 안에 작성됨
            4. 매개변수 개수만큼 콤마로 구분하여 소괄호에 작성됨

            [ main 메서드 소개 ]
            1. 클래스에서 자동으로 가장 먼저 실행되는 메서드
            2. 메인 메서드에서 사용자 정의 메서드를 호출 할 수 있다.
            3. public 접근 제한자는 모든 클래스에서 접근할 수 있다는 표시
            5. static는 메서드가 클래스에 속해 있음( new키워드로 생성안함 )
         */

         // 나의 첫 메서드 호출
         myFirst();
         myFirst();
         myFirst();
         // 호출한 만큼 실행됨
         // 나의 두번째 메서드 호출
         System.out.println(mySecond("지"));
         System.out.println(mySecond("코"));
         System.out.println(mySecond("박"));

         // 나의 세번째 메서드 호출
        }
        public static void myFirst() {
            System.out.println("나는 자바개발자다");
        }
        // 나의 두번째 메서드
        // static이 아니므로 본 클래스에 자동 소속되지 않고 객체형으로 생성해야 사용할 수 있다.
        // new 키워드로 생성함 클래스 소속으로 생성해야함
        // 생성법 : 클래스명 변수 = new 클래스명()
        // 클래스가 객체로 생성되어야 static이 아닌 메서드를 호출 할 수 있다.
        
        // System.out.println("9000원 짜리 점심을 6명이 먹었다. 얼마 내야 하나?"+j06.myThird(9000, 6)+"원")
        
        // 나의 네번째 메서드 : 이달의 표어
        syso
        
        
        
        public static String mySecond(String family) {
            return family + "씨 가문";
        }
        
         // 나의 세번째 메서드 > static 이 없음
         // 식사비 계산 : pat 가격 , people 사람수
         public int myThird(int pay, int people){
             return pay * people ;
            }
        }
        java06 j06 = new java06();
        
        // 나의 4번째 메서드 : 포어 만들기
    public String makeTitle(int num, String msg) {

    }