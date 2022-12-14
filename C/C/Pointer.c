/*
포인터 변수란 메모리의 주소 값을 저장하기 위한 변수이다.

포인터 변수 생성방법
자료형 * 변수명
자료형 *변수명
자료형* 변수명

포인터란 어떤 변수의 메모리상의 주소값을 말한다..
포인터는 메모리의 주소를 조작하므로 메모리 영역을 동적(dynamic)으로 관리할 수 있다.
포인터변수: 어떤 변수의 주소값을 저장할 수 있는 기억장소. 일반적으로 포인터라고 한다.
일반변수 : 일반적인 데이터(상수)를 저장할 수 있는 기억장소
일반변수는 형(type)의 값을 갖고, 포인터변수는 선언시 형(type)을 갖는 어떤변수의 주소값을 갖는다.

1) 일반변수
    int a; => 변수 a는 정수형으로 선언

2)포인터변수
    int a; => 변수 a는 정수형으로 선언
    int * p ; => 포인터 변수는 p를정수형으로 선언
    p=&a; => 변수 a의 주소값을 포인터 변수 p에 대입

일반 변수의 주소값은 엠프센트(&)를 변수앞에 붙여 사용한다.
    int a; => &a는 int 형 변수 a가 위치하는 메모리 상의 주소값(주소상수).
 
포인터선언시 변수앞에 아스트리크(*)를 붙여 선언한다.
    int *p ; => int 형 변수의 주소값을 가질수 있는 포인터변수 p를 선언한다.
int*p ;  int 형의 데이터를 참조하는 포인터변수 p를 정의한다.

<주의>
    1. 포인터변수의 명칭은 *p가 아니라 p이다.
    2. 포인터변수 p형이 int가 아니고 p에서 참조할 수 있는 데이터형이 int이다.
    3. 포인터값을 조작할 때는 *를 붙이지 않는다.
    4. 포인터를 사용하여 데이터를 참조할 때 *를 붙인다.

일반 변수와 포인터 변수의 차이점

구분
선언
변수에 값 대입
주소참조
주소연산

일반변수
문자형
chara; a를 char형으로 선언
a='A';  변수 a에 문자A를 저장
&a  변수 a의 주소상수
불가능

일반변수
정수형
short b; b를 int형으로 선언
b=15; 변수 b에 10진수 15를 저장
&b  변수 b의 주소상수
불가능

포인터
문자형
chat*a; a가 가르키는 주소의 내용을 chat형으로 선언
*a='A'; 포인터변수 a가 가르키는 주소가 문자A를 저장
a a가 포인터주소
++a; 포인터변수 a가 char형이므로 1증가

포인터
정수형
short*b; b가 가리키는 주소의 내용을 int형으로 선언
*b=15; 포인터변수b가 가르키는 주소에 10진수 15를 저장
b b가 포인터 주소
++b; 포인터 변수b가 int 형이므로 1씩 증가

포인터 변수는 남의 주소를 가질 수 있다.
    1) 절대 주소를 갖는다.
        char *pt;
        pt = (char *) 0xb8000000;
    2) 널(Null) 주소를 갖는다.
        char *pt;
        pt=0; or pt=null;
    3) 일반 변수의 주소를 갖는다.
        char c;
        char *pt;
        pt = &c;

일차원 배열과 포인터의 관계

배열의 이름 그 자체는 주소값이고, 포인터 상수이다.
a를 배열이라고 할 때 a 자체에 다른 값을 대입할 수 없다. 왜냐하면 a는 주소 상수이다.

포인터 연산

포인터에 1을 증가시키는 동작은 번지값이 1만큼 증가하는 것을 의미하는 것이 아니라 포인터가 가리키는 데이터 형(type)의 바이트(bytd) 수 맡큼 증가한다. 즉 sizeof(데이터 형)의 바이트 수 만큼 증가한다.
데이터 형과 포인터 연산의 관계

선언
처리
의미

char*p;
++p;
1번지 증가

short*p;
++p;
2번지 증가

int *p;
++p;
DOS 상에서는 2번지증가 UNIX 상에서는 4번지 증가

long*p;
++p;
4번지 증가

float *p;
++p;
4번지 증가

double *p;
++p;
8번지 증가

번지와 데이터 표현
long  a[4] ;
long  *p ;
a[0] = 10;  a[1] = 20;  a[2] = 30;  a[3] = 40;
p=a;
배열 a의 번지가 100번지부터 시작된다고 가정할 때

번지 표현
배열명
배  열
포인터
번지값

메모리배치
데이터값

데이터 표현
배  열
배열명
포인터

a
&a[0]
p
100
10
a[0]
*a
*p

a+1
&a[1]
p+1
104
20
a[1]
*(a+1)
*(p+1)

a+2
&a[2]
p+2
018
30
a[2]
*(a+2)
*(p+2)

a+3
&a[3]
p+3
112
40
a[3]
*(a+3)
*(p+3)

포인터간의 연산에는 정수형의 덧셈, 뺄셈만이 허용되고 곱셈과 나눗셈은 할 수 없고, 포인터 간의 덧셈, 뺄셈은 허용되지 않는다.

올바른 연산
p = p + 2
p = p - 3
++p
p++
--p
p--

올바르지 못한 연산
p = p1 + p2
p = p / 2
p = p * 2

포인터 배열
포인터 배열이란 동일한 형(type)을 갖는 포인터 변수들이 하나의 이름으로 모여있는 형태를 말한다.

일반 형식
데이터형 포인터 배열명[원소의 수] ;
예) char  *name[4] ; 즉, name[0],  name[1],  name[2],  name[3]의 네가지 char형 포인터 배열이 준비된다.

포인터 배열의 문자열 데이터 초기화 방법은 다음과 같다.
static  char  *name[4] = {"C",  "Fortran",  "Basic",  "Coblo"} ;

이차원 배열과 포인터 배열의 관계

data는 data[0] [0]의 주소를 나타내는 상수이다.
data[0]도 data[0] [0]의 주소를 나타내는 상수이다.

2차원 배열과 배열의 포인터는 비슷하지만, 실제 메모리 상의 주소는 다르다.

이중 포인터
char  **str ;
변수 str은 char형의 데이터 값을 가리키는 포인터의 포인터로서 선언됨을 의미 한다.
포인터의 포인터는 포인터 배열고 유사하게 사용되지만, 실제 메모리상의 구조는 다르다.
char  *a[10] ; => 포인터용으로 10개의 장소가 확보
char  **a ; => 포인터용으로 1개의 장소가 확보
*/