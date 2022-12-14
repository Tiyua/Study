한 개의 문자 값에 대한 자료형은 char 를 이용한다.

char 자료형은 다음과 같이 사용한다.

char a1 = 'a';
주의할 점은 위와같이 문자값을 '(단일 인용부호)로 감싸주어야 한다는 점이다.

char 자료형은 사실 프로그램 작성 시 그리 많이 사용되는 편이 아니다. 어쩌면 거의 사용 할 일이 없을 정도로 활용성이 적다.

char는 문자값을 표현하는 방식이 다양하기 때문에 주의해야 한다.

다음과 같은 소스코드를 작성하고 실행해 보자.

char a1 = 'a';  // 문자로 표현
char a2 = 97;  // 아스키코드로 표현
char a3 = '\u0061';  // 유니코드로 표현

System.out.println(a1);
System.out.println(a2);
System.out.println(a3);
세가지 모두 'a'라는 문자를 출력할 것이다. 즉 'a'라는 문자값을 위와 같이 'a', 97, '\u0061'과 같이 값을 설정해도 모두 같은 것이라는 말이다.

첫번째는 문자값, 두번째는 아스키코드값, 세번째는 유니코드값으로 표현한 것이다.