대입 연산자
대입 연산자(assignment operator)
대입 연산자는 변수에 값을 대입할 때 사용하는 이항 연산자이며, 피연산자들의 결합 방향은 오른쪽에서 왼쪽입니다.

또한, 자바에서는 대입 연산자와 다른 연산자를 결합하여 만든 다양한 복합 대입 연산자를 제공합니다.

대입 연산자	설명
=	왼쪽의 피연산자에 오른쪽의 피연산자를 대입함.
+=	왼쪽의 피연산자에 오른쪽의 피연산자를 더한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
-=	왼쪽의 피연산자에서 오른쪽의 피연산자를 뺀 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
*=	왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
/=	왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
%=	왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 왼쪽의 피연산자에 대입함.
&=	왼쪽의 피연산자를 오른쪽의 피연산자와 비트 AND 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
|=	왼쪽의 피연산자를 오른쪽의 피연산자와 비트 OR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
^=	왼쪽의 피연산자를 오른쪽의 피연산자와 비트 XOR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
<<=	
왼쪽의 피연산자를 오른쪽의 피연산자만큼 왼쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.

>>=	왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호를 유지하며 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
>>>=	왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호에 상관없이 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
 

예제
int num1 = 7, num2 = 7, num3 = 7;

 

num1 = num1 - 3;

num2 -= 3;

num3 =- 3;

 

System.out.println("- 연산자에 의한 결과 : "+ num1);

System.out.println("-= 연산자에 의한 결과 : "+ num2);

System.out.println("=- 연산자에 의한 결과 : "+ num3);

코딩연습 ▶

실행 결과
-  연산자에 의한 결과 : 4

-= 연산자에 의한 결과 : 4

=- 연산자에 의한 결과 : -3

 

위의 예제에서 num3 =- 3 연산은 단순히 -3를 변수 num3에 대입하는 연산이 되었습니다.
이처럼 복합 대입 연산자에서 연산자의 순서는 매우 중요하므로 주의를 기울여야 합니다.