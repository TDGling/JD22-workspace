public class java02 {
    public static void main(String[] args) {
        /* 
            [ 자바 변수 ]
            변수는 데이터 값을 저장하기 위한 컨테이너

            [ 변수의 선언과 사용혁식 ]
            데이터형 변수명 = type에  맞는값
         */
        System.out.println("자바변수");
        /* 
            [ 자바 변수 유형 ]
            String
            - "Hello"와 같은 텍스트를 저장 문자열 값은 큰따옴표사용!
            int
            - 123 또는 -123과 같이 소수 없이 정수(정수)를 저장
            float
            - 19.99 또는 -19.99와 같은 소수를 사용. 부동 소수점 숫자를 저장
            char
            - 'a' 또는 'B'와 같은 단일 문자를 저장. Char 값은 작은따옴표사용!
            boolean
            - true / false
         */
        // 1. 문자형
        String nameKim = "김석구 멋쟁이";
        System.out.println(nameKim);
        // 2. 정수형
        int myNum = 1000;
        System.out.println(myNum+"라인의 코딩을 짱");
        // 기존 변수에 다른 값이 덮어써짐
        myNum = 2222;
        System.out.println(myNum+"라인의 코딩을 짱");
        // 자바에서 상수는 = 변수선언 안에 Final키워드 사용
        int newNum = 7777;
        // newNum = 8888; = 에러남 재할당불가
        System.out.println(newNum+"라인을 또 짬");
        // 변수와 문자와의 결합 = (+) 연산자 사용
        String nameTom = "톰 행크스";
        System.out.println("안녕"+nameTom);

        String familyName = "킴씨";
        String myName = "오룡";
        String fullName = familyName + myName;
        System.out.println(fullName);

        // 변수를 한번에 선언과 할당
        int x = 5, y = 6, z = 55;
        System.out.println(x+"와"+y+"와"+z+"="+(x+y+z));
        // 다른방식
        int xx, yy, zz;
        xx = yy = zz =50;
        System.out.println(xx+"를 3번 더하면 ="+(xx+yy+zz));

        /* 
            [ 변수 이름 규칙 ]
            1. 문자, 숫자, 밑줄 및 달러 기호 포함가능
            2. 문자로 시작
            3. 소문자로 시작
            4. 중간 공백 안됨 
            5. $ 및 _로 시작할 수도 있음
            6. 대소문자를 구분
            7. 예약어 사용불가
         */

         /* 
            [ 데이터 유형 ]
                -> 두 그룹으로 나뉩니다.

                1. 기본 데이터 유형 (8가지)

                (1) byte	1 byte	 -128 ~ 127
                (2) short	2 bytes	 -32,768 ~ 32,767
                (3) int		4 bytes	 -21억 ~ 21억
                (4) long	8 bytes	 -9백경 ~ 9백경
                (5) float	4 bytes	 소수 6 to 7 자릿수
                (6) double	8 bytes	 소수 15 자릿수
                (7) boolean	1 bit	 true / false
                (8) char	2 bytes	 한문자 or 아스키값

                ->>>(질문) 
                Java에는 많은 숫자 유형이 있지만 
                숫자에 가장 많이 사용되는 유형은? 
                (답)
                int(정수) 및 double(부동 소수점 숫자)
          */
          int iamInt = 5; // int
          float iamFloat = 5.99f; //float
          char iamChar = 'D'; // char ->"D"라고 쌍따옴표를 쓰면 에러 > 한글자 전용 홀따옴표만 줄 수 있음
          boolean iamBoolean = true; // boolean
          String iamString = "Hello"; // string

          System.out.println("정수"+iamInt);
          System.out.println("실수"+iamFloat);
          System.out.println("한글자"+iamChar);
          System.out.println("불린"+iamBoolean);
          System.out.println("문자"+iamString);

          System.out.println("");
          // 데이터형별 크기체크
            System.out.println("[데이터 형별 크기체크]");
          // 1. byte : -128 ~ 127
          byte namByte = -128;
          // -129 와 같이 범위밖은 에러
          System.out.println("byte = "+namByte);

          // 2. short : -32,768 ~ 32,768
          // > 0때문에 + 자릿수 하나적음
          short numShort = 32767;
          System.out.println("short = "+ numShort);
          // 3. int : -2,147,483,648 to 2,147,483,647 (-21억 ~ +21억 )
        int numint = 2137483647;
        System.out.println("int"+numint);
        // 4. long : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (-9백경 ~ 9백경)
        // 특이사항 > 범위안의 숫자일 지라도 끝에 L 표시를 하지 않으면 int형 상수로 처리한다
        // int 범위를 벗어나는 에러가 발생한다 끝에 L 자를 써줘야 한다 소문자 l도 가능(햇갈림
        long numLong = 9223372036854775807L;
        System.out.println("Long : "+ numLong);

        // 5 . float : 소수 자릿수 6~7
        // 특이사항 : 숫자데이터 끝에 f로 처리해야 같은형임
        // 소수점 아래 넘치는 경우 7째 자리에서 반올림
        float numFloat = 1.23456789F; // 결과 : 1.234567 
        System.out.println("Float : "+numFloat);
        // 6. double : 소수 자리수 15
        // 특이사항 :  숫자데이터 끝에 D로 처리해야 같은 형
        // float 이나 doble은 근사값이므로 끝자리가 달라질 수 있다.
        double numDouble = 5.123456789123456789123456D;
        System.out.println("doble :"+numDouble);
        // 과학적인 10의 거듭제곱 표시 사용가능 (e+자리수)
        // float이나 doubl은 소수점이 없으면 기본 한자리수 표시함
        float f1 = 35e3F;
        double d1 = 12E4D;
        System.out.println("거듭제곱 : \n"+f1+"\n"+d1);
        // \(역슬래쉬)n 은 줄바꿈 기호

    }
}
