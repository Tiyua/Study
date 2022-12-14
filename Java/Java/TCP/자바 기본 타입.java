기본 타입
기본 타입(primitive type)
타입(data type)은 해당 데이터가 메모리에 어떻게 저장되고, 프로그램에서 어떻게 처리되어야 하는지를 명시적으로 알려주는 역할을 합니다.

자바에서는 여러 형태의 타입을 미리 정의하여 제공하고 있는데, 이것을 기본 타입(primitive type)이라고 합니다.

자바의 기본 타입은 모두 8종류가 제공되며, 크게는 정수형, 실수형, 문자형 그리고 논리형 타입으로 나눌 수 있습니다.

정수형 타입
자바에서 정수란 부호를 가지고 있으며, 소수 부분이 없는 수를 의미합니다.

자바의 기본 타입 중 정수를 나타내는 타입은 다음과 같습니다.

 

1. byte

2. short

3. int

4. long

 

다음 표는 각각의 정수형 타입에 따른 메모리의 크기 및 데이터의 표현 범위를 나타냅니다.

정수형 타입	할당되는 메모리의 크기	데이터의 표현 범위
byte	1바이트	-128 ~ 127
short	2바이트	
-215 ~ (215 - 1)

-32,768 ~ 32,767
int	4바이트	-231 ~ (231 - 1)
-2,147,483,648 ~ 2,147,483,647
long	8바이트	-263 ~ (263 - 1)
-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
 

정수형 데이터의 타입을 결정할 때에는 반드시 자신이 사용하고자 하는 데이터의 최대 크기를 고려해야 합니다.

해당 타입이 표현할 수 있는 범위를 벗어난 데이터를 저장하면, 오버플로우(overflow)가 발생해 전혀 다른 값이 저장될 수 있기 때문입니다.

 

오버플로우(overflow)란 해당 타입이 표현할 수 있는 최대 범위보다 큰 수를 저장할 때 발생하는 현상을 가리킵니다.

오버플로우가 발생하면 최상위 비트(MSB)를 벗어난 데이터가 인접 비트를 덮어쓰므로, 잘못된 결과를 얻을 수 있습니다.

또한, 언더플로우(underflow)란 해당 타입이 표현할 수 있는 최소 범위보다 작은 수를 저장할 때 발생하는 현상을 가리킵니다.

 

다음 예제는 오버플로우나 언더플로우가 발생하면 결과에 어떠한 영향을 주는지를 보여주는 예제입니다.

예제
public class Datatype04 {

    public static void main(String[] args) {

        byte num1 = 127;

        byte num2 = -128;

 

        num1++; // 127 + 1

        num2--; // -128 - 1

 

        System.out.println(num1); // -128

        System.out.println(num2); // 127

    }

}

코딩연습 ▶

실행 결과
-128

127

 

자바에서 byte 타입이 표현할 수 있는 범위는 -128부터 127까지 입니다.

하지만 위의 예제에서 변수 num1은 127에 1을 더해 128을 저장하려고 합니다.

이렇게 해당 타입이 표현할 수 있는 최대 범위보다 더 큰 수를 저장하려고 하면, 오버플로우가 발생하여 잘못된 결과가 저장됩니다.

또한, 변수 num2에는 해당 타입이 표현할 수 있는 최소 범위보다 더 작은 수인 -129를 저장하려고 합니다.

따라서 이때도 언더플로우가 발생하여 잘못된 결과값이 저장됩니다.

 

위의 예제에서 사용된 증감 연산자(++, --)에 대한 더 자세한 사항은 자바 증감 연산자 수업에서 확인할 수 있습니다.

자바 증감 연산자 수업 확인 =>

 

자바에서 정수형 타입 중 기본이 되는 타입은 int형입니다.

따라서 컴퓨터는 내부적으로 정수형 중에서도 int형의 데이터를 가장 빠르게 처리합니다.

실수형 타입
자바에서 실수란 소수부나 지수부가 있는 수를 가리키며, 정수보다 훨씬 더 넓은 표현 범위를 가집니다.

자바의 기본 타입 중 실수를 나타내는 타입은 다음과 같습니다.

 

1. float

2. double

 

과거에는 실수를 표현할 때 float형을 많이 사용했지만, 하드웨어의 발달로 인한 메모리 공간의 증가로 현재에는 double형을 가장 많이 사용합니다.

따라서 실수형 타입 중 기본이 되는 타입은 double형입니다.

 

실수형 데이터의 타입을 결정할 때에는 표현 범위 이외에도 반드시 유효 자릿수를 고려해야 합니다.

실수형 타입	지수의 길이	가수의 길이	유효 자릿수
float	8 비트	23 비트	소수 부분 6자리까지 오차없이 표현할 수 있음.
double	11 비트	52 비트	소수 부분 15자리까지 오차없이 표현할 수 있음.
실수형 타입	할당되는 메모리의 크기	데이터의 표현 범위	리터럴 타입 접미사
float	4바이트	(3.4 X 10-38) ~ (3.4 X 1038)	F 또는 f
double	8바이트	(1.7 X 10-308) ~ (1.7 X 10308)	D 또는 d (생략 가능함)
 

컴퓨터에서 실수를 표현하는 방식은 오차가 발생할 수 밖에 없는 태생적 한계를 지닙니다.

이러한 실수형 데이터의 오차는 자바뿐만 아니라 모든 프로그래밍 언어에서 발생하는 공통된 문제입니다.

 

자바 실수의 표현 수업 확인 =>

문자형 타입
자바에서 문자형 데이터란 작은 정수나 문자 하나를 표현할 수 있는 타입을 의미합니다.

자바의 기본 타입 중 문자를 나타내는 타입은 다음과 같습니다.

 

1. char

 

컴퓨터는 2진수밖에 인식하지 못하므로 문자도 숫자로 표현해야 인식할 수 있습니다.

따라서 어떤 문자를 어떤 숫자에 대응시킬 것인가에 대한 약속이 필요해집니다.

 

C언어와 C++에서는 아스키코드(ASCII)를 사용하여 문자를 표현합니다.

아스키코드(ASCII)는 영문 대소문자를 사용하는 7비트의 문자 인코딩 방식입니다.

아스키코드는 문자 하나를 7비트로 표현하므로, 총 128개의 문자를 표현할 수 있습니다.

 

하지만 자바에서는 유니코드(unicode)를 사용하여 문자를 표현합니다.

아스키코드는 영문자와 숫자밖에 표현 못 하지만, 유니코드는 각 나라의 모든 언어를 표현할 수 있습니다.

유니코드는 문자 하나를 16비트로 표현하므로, 총 65,536개의 문자를 표현할 수 있습니다.

 

문자형 타입	할당되는 메모리의 크기	데이터의 표현 범위
char	2 바이트	0 ~ 216
논리형 타입
논리형은 참(true)이나 거짓(false) 중 한 가지 값만을 가질 수 있는 불리언 타입을 의미합니다.

자바의 기본 타입 중 논리형 타입은 다음과 같습니다.

 

1. boolean

 

boolean형의 기본값은 false이며, 기본 타입 중 가장 작은 크기인 1바이트의 크기를 가집니다.

 

논리형 타입	할당되는 메모리의 크기	데이터의 표현 범위
boolean	1바이트	true 또는 false