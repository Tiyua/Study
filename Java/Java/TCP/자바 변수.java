변수
변수(variable)
변수(variable)란 데이터(data)를 저장하기 위해 프로그램에 의해 이름을 할당받은 메모리 공간을 의미합니다.

즉, 변수란 데이터(data)를 저장할 수 있는 메모리 공간을 의미하며, 이렇게 저장된 값은 변경될 수 있습니다.

변수의 이름 생성 규칙
자바에서는 변수뿐만 아니라 클래스, 메소드 등의 이름을 짓는데 반드시 지켜야 하는 공통된 규칙이 있습니다.

자바에서 이름을 생성할 때에 반드시 지켜야 하는 규칙은 다음과 같습니다.

 

1. 변수의 이름은 영문자(대소문자), 숫자, 언더스코어(_), 달러($)로만 구성할 수 있습니다.

2. 변수의 이름은 숫자로 시작할 수 없습니다.

3. 변수의 이름 사이에는 공백을 포함할 수 없습니다.

4. 변수의 이름으로 자바에서 미리 정의된 키워드(keyword)는 사용할 수 없습니다.

 

변수의 이름은 해당 변수에 저장될 데이터의 의미를 잘 나타내도록 짓는 것이 좋습니다.
변수의 종류
자바에서 변수는 타입에 따라 크게 다음과 같이 구분할 수 있습니다.

 

1. 기본형(primitive type) 변수

2. 참조형(reference type) 변수

 

기본형(primitive type) 변수는 실제 연산에 사용되는 변수입니다.

자바에서는 다음과 같이 8가지 종류의 기본형 변수를 제공하고 있습니다. 

 

- 정수형 : byte, short, int, long

- 실수형 : float, double

- 문자형 : char

- 논리형 : boolean

 

자바에서 제공하는 기본 타입에 대한 더 자세한 사항은 자바 기본 타입 수업에서 확인할 수 있습니다.

자바 기본 타입 수업 확인 =>

 

참조형 변수는 8개의 기본형 변수를 사용하여 사용자가 직접 만들어 사용하는 변수를 의미합니다.

변수의 선언
자바에서는 변수를 사용하기 전에 반드시 먼저 변수를 선언하고 초기화해야 합니다.

변수를 선언하는 방법에는 다음과 같이 두 가지 방법이 있습니다.

 

1. 변수의 선언만 하는 방법

2. 변수의 선언과 동시에 초기화하는 방법

변수의 선언만 하는 방법
이 방법은 먼저 변수를 선언하여 메모리 공간을 할당받고, 나중에 변수를 초기화하는 방법입니다.

하지만 이렇게 선언만 된 변수는 초기화되지 않았으므로, 해당 메모리 공간에는 알 수 없는 쓰레깃값만이 들어가 있습니다.

따라서 선언만 된 변수는 반드시 초기화한 후에 사용해야만 합니다.

 

자바에서는 프로그램의 안전성을 위해 초기화하지 않은 변수는 사용할 수 없도록 하고 있습니다.

만약 초기화되지 않은 변수를 사용하려고 하면, 자바 컴파일러는 오류를 발생시킬 것입니다.

 

문법
타입 변수이름;

예제
int num;                 // 변수의 선언

System.out.println(num); // 오류 발생

num = 20;                // 변수의 초기화

System.out.println(num); // 20

 

위의 예제처럼 정수를 저장하기 위한 메모리 공간을 할당받으면, 반드시 해당 타입의 데이터만을 저장해야 합니다.

만약 다른 타입의 데이터를 저장하려고 하면, 자바 컴파일러는 오류를 발생시킬 것입니다.

변수의 선언과 동시에 초기화하는 방법
자바에서는 변수의 선언과 동시에 그 값을 초기화할 수 있습니다.

또한, 선언하고자 하는 변수들의 타입이 같다면 이를 동시에 선언할 수도 있습니다.

 

문법
1. 타입 변수이름[, 변수이름];

2. 타입 변수이름 = 초깃값[, 변수이름 = 초깃값];

예제
int num1, num2;                  // 같은 타입의 변수를 동시에 선언함.

double num3 = 3.14;              // 선언과 동시에 초기화함.

double num4 = 1.23, num5 = 4.56; // 같은 타입의 변수를 동시에 선언하면서 초기화함.

 

선언하고자 하는 변수의 타입이 서로 다르면 동시에 선언할 수 없습니다.
 

하지만 다음 예제처럼 여러 변수를 동시에 초기화할 수는 없습니다.

만약 다음 예제처럼 변수의 초기화를 동시에 하려고 하면, 자바 컴파일러는 오류를 발생시킬 것입니다.

 

잘못된 예제
double num1, num2;        // 같은 타입의 변수를 동시에 선언함.

...

num1 = 1.23, num2 = 4.56; // 하지만 이미 선언된 여러 변수를 동시에 초기화할 수는 없음.