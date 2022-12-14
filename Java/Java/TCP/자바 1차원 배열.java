/*
1차원 배열

배열(array)이란?

배열(array)은 같은 타입의 변수들로 이루어진 유한 집합으로 정의할 수 있습니다.
배열을 구성하는 각각의 값을 배열 요소(element)라고 하며, 배열에서의 위치를 가리키는 숫자를 인덱스(index)라고 합니다.
자바에서 인덱스는 언제나 0부터 시작하며, 0을 포함한 양의 정수만을 가질 수 있습니다.
배열은 같은 종류의 데이터를 많이 다뤄야 하는 경우에 사용할 수 있는 가장 기본적인 자료 구조입니다.
배열은 선언되는 형식에 따라 1차원 배열, 2차원 배열뿐만 아니라 그 이상의 다차원 배열로도 선언할 수 있습니다.
하지만 현실적으로 이해하기가 쉬운 2차원 배열까지가 많이 사용됩니다.

1차원 배열

1차원 배열은 가장 기본적인 배열로 다음과 같은 문법에 따라 선언합니다.
*/

/* 
    문법
*/

//1. 타입[] 배열이름;

//2. 타입 배열이름[];

/*
타입은 배열 요소로 저장되는 변수의 타입을 명시합니다.
배열 이름은 배열이 선언된 후에 배열에 접근하기 위해 사용됩니다.
자바에서는 배열을 만들기 위해 위의 두 가지 방법을 모두 사용할 수 있지만, 될 수 있으면 첫 번째 방법만을 사용하는 것이 좋습니다.
위와 같이 선언된 배열은 new 키워드를 사용하여 실제 배열로 생성할 수 있습니다.
*/

/*
    문법
*/

//배열이름 = new 타입[배열길이];

 

배열의 길이는 해당 배열이 몇 개의 배열 요소를 가지게 되는지 명시합니다.

 

또한, 다음과 같이 배열의 선언과 생성을 동시에 할 수도 있습니다.

문법
타입[] 배열이름 = new 타입[배열길이];

 

자바에서는 이러한 배열도 모두 객체이므로, 각각의 배열은 모두 자신만의 필드와 메소드를 가지고 있습니다.

 

다음 예제는 int형 데이터를 3개 저장할 수 있는 배열을 선언과 동시에 생성하고 있습니다.

예제
int[] grade1 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성

int[] grade2 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성

 

grade1[0] = 85; // 인덱스를 이용한 배열의 초기화

grade1[1] = 65;

grade1[2] = 90;

 

grade2[0] = 85; // 배열의 길이보다 적은 수의 배열 요소만 초기화

 

for (int i = 0; i < grade1.length; i++) {

    System.out.print(grade1[i] + " "); // 인덱스를 이용한 배열로의 접근

}

 

for (int i = 0; i < grade2.length; i++) {

    System.out.print(grade2[i] + " "); // 인덱스를 이용한 배열로의 접근

}

코딩연습 ▶

실행 결과
85 65 90 

85 0 0 

 

위의 예제처럼 0부터 시작하는 인덱스(index)를 이용하면 각각의 배열 요소에 따로 접근할 수 있습니다.

또한, 배열 grade2처럼 배열의 길이보다 적은 수의 배열 요소만을 초기화할 경우, 나머지 배열 요소들은 배열의 타입에 맞게 자동으로 초기화될 것입니다.

 

배열의 타입	초깃값
char	'\u0000'
byte, short, int	0
long	0L
float	0.0F
double	0.0 또는 0.0D
boolean	false
배열, 인스턴스 등	null
 

 

하지만 다음 예제처럼 해당 배열의 길이를 초과하는 인덱스를 사용하면, ArrayIndexOutOfBounds 예외가 발생할 것입니다.

예제
int[] grade = new int[3];   // 길이가 3인 int형 배열의 선언 및 생성

grade[0] = 85;              // 인덱스를 이용한 배열의 초기화

grade[1] = 65;

grade[2] = 90;

 

System.out.print(grade[4]); // ArrayIndexOutOfBounds 예외 발생

 

위의 예제에서 사용한 length는 배열의 길이를 저장하고 있는 배열 객체의 필드입니다.

배열의 초기화
자바에서는 변수와 마찬가지로 배열도 선언과 동시에 초기화할 수 있습니다.

 

다음과 같이 괄호({})를 사용하여 초깃값을 나열한 것을 초기화 블록(initialization block)이라고 합니다.

자바에서는 이러한 초기화 블록을 이용하여 배열을 선언과 동시에 초기화할 수 있습니다.

 

초기화 블록을 이용한 배열의 초기화 방법은 다음과 같습니다.

문법
1. 타입[] 배열이름 = {배열요소1, 배열요소2, ...};

2. 타입[] 배열이름 = new 타입[]{배열요소1, 배열요소2, ...};

 

위의 두 가지 초기화 방법은 완전히 같은 결과를 반환하며, 초기화 블록에 맞춰 자동으로 배열의 길이가 설정됩니다.

하지만 다음과 같은 경우에는 첫 번째 방법이 아닌 두 번째 방법만을 사용하여 초기화해야 합니다.

 

1. 배열의 선언과 초기화를 따로 진행해야 할 경우

2. 메소드의 인수로 배열을 전달하면서 초기화해야 할 경우

 

예제
int[] grade1 = {70, 90, 80};          // 배열의 선언과 동시에 초기화할 수 있음.

int[] grade2 = new int[]{70, 90, 80}; // 배열의 선언과 동시에 초기화할 수 있음.

int[] grade3;

// grade3 = {70, 90, 80};             // 이미 선언된 배열을 이 방법으로 초기화하면 오류가 발생함.

int[] grade4;

grade4 = new int[]{70, 90, 80};       // 이미 선언된 배열은 이 방법으로만 초기화할 수 있음.

 

위의 예제처럼 초기화 블록의 타입과 배열의 타입은 반드시 일치해야 합니다.

 

다음 예제는 앞선 예제와 같은 배열을 선언과 동시에 초기화 블록으로 초기화하는 예제입니다.

예제
int[] grade = new int[]{85, 65, 90};  // 길이가 3인 int형 배열을 선언과 동시에 초기화

 

for (int i = 0; i < grade.length; i++) {

    System.out.print(grade[i] + " "); // 인덱스를 이용한 배열로의 접근

}

코딩연습 ▶

실행 결과
85 65 90

 

다음 예제는 배열 요소의 합과 평균을 구하는 예제입니다.

예제
int[] grade = new int[]{85, 65, 90}; // 길이가 3인 int형 배열을 선언과 동시에 초기화

int sum = 0;

 

for (int i = 0; i < grade.length; i++) {

    sum += grade[i];

}

System.out.println("모든 과목에서 받은 점수의 합은 " + sum + "입니다.");

System.out.println("이 학생의 평균은 " + (sum / grade.length) + "입니다.");

코딩연습 ▶

실행 결과
모든 과목에서 받은 점수의 합은 240입니다.

이 학생의 평균은 80입니다.