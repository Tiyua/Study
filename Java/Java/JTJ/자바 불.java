
참 또는 거짓의 값을 갖는 자료형을 불 자료형이라고 한다. 자료형의 명칭은 boolean(불린 또는 불리언이라고 부른다)이다. 불 자료형에 대입되는 값은 참(true) 또는 거짓(false)만 가능하다.

다음은 불 변수에 값을 대입한 예제이다.

boolean isSuccess = true;
boolean isTest = false;
불 연산
조건문
불 연산
불 자료형에는 불 연산의 결과값이 대입될 수 있다. 불 연산은 참, 거짓을 판단하는 연산을 말한다. 예를 들어 다음과 같은 불 연산들이 있다.

2 > 1             // 참
1 == 2            // 거짓
3 % 2 == 1        // 참 (3을 2로 나눈 나머지는 1이므로 참이다.)
"3".equals("2")   // 거짓 
이러한 부울 연산의 결과는 참 또는 거짓이므로 if문과 같은 조건문에 쓰이거나 불 자료형에 대입될 수 있다.

조건문
불 연산은 보통 다음처럼 조건문의 판단 기준으로 많이 사용한다.

int base = 180;
int height = 185;
boolean isTall = height > base;

if (isTall) {
    System.out.println("키가 큽니다.");
}
하나의 예를 더 보자.

int i = 3;
boolean isOdd = i % 2 == 1;
i % 2 == 1은 i를 2로 나누었을 때 나머지가 1인지를 묻는 조건문이다. i는 3이므로 3을 2로 나눈 나머지는 1이 되어 참이 된다. 따라서 isOdd 는 true 값을 갖게 될것이다.