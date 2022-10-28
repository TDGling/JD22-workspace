// import javax.swing.plaf.synth.SynthSpinnerUI;

// java03. 연산자와 제어문
public class java03 {
    public static void main(String[] args) {
        
            // [ 자바 연산자 ] 
            // : 변수와 값에 대한 연산을 수행하는데 사용됨

            // [1.산술 연산자] : 일반적인 수학 연산을 수행하는 데 사용

            //    +   더하기   x + y   
            //    -   빼기   x - y   
            //    *   곱하기   x * y   
            //    /   나누기   x / y   
            //    %   나머지   x % y   
            //    ++   1씩증가   ++x   
            // --   1씩감소   --x

            System.out.println("[1. 산술 연산자]");
            System.out.println("사칙연산 : ");
            System.out.println("3+7+*9/20"+(3+7*0/20-5));
            System.out.println();
            System.out.println("나머지연산자 : ");
            System.out.println("500을 7로 나눈 나머지는 ? : "+(500%7));

            System.out.println("증감연산자 : ");
            int world = 72;
            System.out.println("현제 세계인구는"+world+"억 이다. \n 5년 뒤 10억명이 더 늘어?난다고 한다. \n 1억명만 더 늘려보자"+(world++)+"억명");
            // ++이 뒤에있으면 출력이 먼저되고 증가
            // ++ 이 앞에있으면 먼저 증가되고 출력
            System.out.println("world변수값 : "+world);

            // [2. 할당연산자] : = 오른쪽의 값을 왼쪽에 할당함!

            // [3. 대입연산자] : 기존값에 연산을 중첩함
            // -> += , -=, *=, /=, %=

            System.out.println("현제인구수 조정 : "+(--world));
            System.out.println();
            System.out.println("[ 3. 대입연산자 ]");
            System.out.println("5년뒤 인구는 몇명인가"+(world+=10)+"억명");

            // [4. 비교연산자] : >,<,==,!=,>=,<=
            // > 조건문에 값을 비교하여 true / false의 결과가 나옴
            System.out.println();
            System.out.println("[ 4. 비교연산자 ]");
            int broAge = 19;
            int myAge = 18;
            System.out.println("내가 알던 형은 형인가? : "+(broAge>myAge?"응, 형 맞아!":"아니,동생이였어! 헉!"));

            // [5. 논리연산자] : &&(논리곱), ||(논리합), !(논리부정)
            // &&(논리곲) > 모두 true이면 true
            // \\ (논리합) > 하나만 true이면 true
            //!(논리부정) > true / false 결과 반대로 출력
            System.out.println();
            System.out.println(" [ 5. 논리연산자 ]");
            String man = "남자";
            int age = 20;
            // 논리곱
            System.out.println("한 사람의 성별이 남자이고 20세 이상이면 회원자격을 준다. 이사람은 회원인가?"+(man=="남자"&&age>=20));
            // 논리합
            System.out.println("한 사람의 성별이 남자이거나 20세 이상이면 회원자격을 준다. 이사람은 회원인가?"+(man=="남자"||age>=20));
            // 논리부정
            boolean men = false;
            // false의 결과를 true로 처리해야 할 때 사용한다
            System.out.println("회원이 아니면 나가세요! 라고 말한다."+(!men?"나가세요":"어서오세요"));
    }
}
