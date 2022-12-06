상수
상수(constant)
상수(constant)란 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미합니다.

하지만 상수가 변수와 다른 점은 프로그램이 실행되는 동안 메모리에 저장된 데이터를 변경할 수 없다는 점입니다.

상수(constant)
상수는 변수와 마찬가지로 이름을 가지고 있는 메모리 공간으로, 이러한 상수는 선언과 동시에 반드시 초기화해야 합니다.

C++에서는 const 키워드를 사용하여 상수를 선언하지만, 자바에서는 final 키워드를 사용하여 선언합니다.

 

자바에서 상수를 만드는 일반적인 방식은 다음과 같습니다.

예제
final int AGES = 30;

 

위의 예제처럼 final 키워드를 사용한 상수는 선언과 함께 반드시 초기화해야 합니다.

 

자바에서 상수의 이름은 일반적으로 모두 대문자를 사용하여 선언합니다.
또한, 여러 단어로 이루어진 이름의 경우에는 언더스코어(_)를 사용하여 구분합니다.
리터럴(literal)
리터럴(literal)이란 그 자체로 값을 의미하는 것입니다.

즉, 변수와 상수와는 달리 데이터가 저장된 메모리 공간을 가리키는 이름을 가지고 있지 않습니다.

예제
int var = 30;         // 30이 바로 리터럴임.

final int AGES = 100; // 100이 바로 리터럴임.

타입에 따른 리터럴
자바에서 리터럴은 타입에 따라 다음과 같이 구분할 수 있습니다.

 

1. 정수형 리터럴(Integer literals)은 123, -456과 같이 아라비아 숫자와 부호로 직접 표현됩니다.

2. 실수형 리터럴(floating-point literals)은 3.14, -45.6과 같이 소수 부분을 가지는 아라비아 숫자로 표현됩니다.

3. 논리형 리터럴(boolean literals)은 true나 false로 표현됩니다.

4. 문자형 리터럴(character literals)은 'a', 'Z'와 같이 작은따옴표('')로 감싸진 문자로 표현됩니다.

5. 문자열 리터럴(string literals)은 "자바", "홍길동"과 같이 큰따옴표("")로 감싸진 문자열로 표현됩니다.

6. null 리터럴(null literals)은 단 하나의 값인 null로 표현됩니다.

 

null이란 아무런 값도 가지고 있지 않은 빈 값을 의미합니다.
리터럴 타입 접미사(literal type suffix)
자바에서 3.14와 같은 실수형 리터럴을 그대로 사용하면, 해당 리터럴은 실수형 타입 중에서도 double형으로 인식할 것입니다.

하지만 실수형 리터럴 맨 뒤에 F나 f를 추가하면, 자바는 해당 실수형 리터럴을 float형으로 인식할 것입니다.

 

이처럼 리터럴 뒤에 추가되어 해당 리터럴의 타입을 명시해주는 접미사를 리터럴 타입 접미사(literal type suffix)라고 합니다.

자바에서 사용할 수 있는 리터럴 타입 접미사는 다음과 같습니다.

타입 접미사	리터럴 타입	예제
L 또는 l	long형	123456789L, ...
F 또는 f	float형	1.234567F, 8.9f, ...
D 또는 d (생략 가능)	double형	1.2345D, 6.789d, ...