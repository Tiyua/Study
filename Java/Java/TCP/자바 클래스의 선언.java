클래스의 선언
클래스의 선언
클래스(class)란 객체 지향 프로그래밍의 추상화(abstraction)라는 개념을 직접 구현한 것이라 할 수 있습니다.

자바에서는 개발자의 편의를 위해 유용하게 사용할 수 있는 많은 수의 클래스를 미리 정의하여 제공하고 있습니다.

또한, 개발자가 원하는 동작을 하는 새로운 클래스를 손쉽게 작성할 수도 있습니다.

 

자바에서 클래스를 선언하는 방법은 접근 제어자와 함께 class 키워드를 사용하면 됩니다.

 

자바에서 클래스는 다음과 같이 선언합니다.

정의
접근제어자 class 클래스이름 {

    접근제어자 필드1의타입 필드1의이름;

    접근제어자 필드2의타입 필드2의이름;

    ...

    접근제어자 메소드1의 원형

    접근제어자 메소드2의 원형

    ...

};

 

다음은 Car라는 이름의 클래스를 선언하는 그림입니다.

 

클래스

 

접근 제어자는 객체 지향 프로그래밍의 특징 중 하나인 정보 은닉(data hiding)을 위한 키워드입니다.

public 멤버는 모든 객체에서 접근할 수 있지만, private 멤버는 해당 객체 내의 멤버 변수나 메소드만이 접근할 수 있습니다.

 

접근 제어자에 대한 더 자세한 사항은 자바 접근 제어자 수업에서 확인할 수 있습니다.

 

자바 접근 제어자 수업 확인 =>

인스턴스의 생성
위와 같이 선언된 클래스의 정의를 가지고 다음과 같은 순서대로 Car 객체의 인스턴스를 생성할 수 있습니다.

 

우선 다음과 같이 객체를 참조하기 위한 참조 변수를 먼저 선언합니다.

선언
클래스이름 객체참조변수이름;

예제
Car myCar;

 

그 후에 new 키워드를 사용하여 인스턴스를 생성하고, 해당 인스턴스의 주소를 미리 선언한 참조 변수에 저장하여 사용합니다.

선언
객체참조변수이름 = new 클래스이름();

예제
myCar = new Car();

 

또한, 다음과 같이 참조 변수의 선언과 인스턴스의 생성을 동시에 할 수도 있습니다.

선언
클래스이름 객체참조변수이름 = new 클래스이름();

예제
Car myCar = new Car();