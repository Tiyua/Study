클래스의 구성
클래스의 구성 요소
자바에서 클래스는 멤버(member)로 속성을 표현하는 필드(field)와 기능을 표현하는 메소드(method)를 가집니다.

또한, 클래스는 생성된 객체의 필드를 초기화해주는 특별한 메소드인 생성자(constructor)를 가집니다.

 

예제
class Car {                    // 클래스 이름

    private String modelName;  // 필드

    private int modelYear;     // 필드

 

    Car(String modelName, int modelYear) { // 생성자

        this.modelName = modelName;

        this.modelYear = modelYear;

    }

 

    public String getModel() { // 메소드

        return this.modelYear + "년식 " + this.modelName + " " + this.color;

    }

}

필드(field)
클래스의 필드(field)란 클래스에 포함된 변수(variable)를 의미합니다.

클래스 내에서 필드는 선언된 위치에 따라 다음과 같이 구분됩니다.

 

1. 클래스 변수(static variable)

2. 인스턴스 변수(instance variable)

3. 지역 변수(local variable)

 

필드에 대한 더 자세한 사항은 자바 필드의 구분 수업에서 확인할 수 있습니다.

 

자바 필드의 구분 수업 확인 =>

메소드(method)
클래스에서 메소드(method)란 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라 할 수 있습니다.

 

즉, 메소드를 사용하면 중복되는 코드의 반복적인 프로그래밍을 피할 수 있게 됩니다.

또한, 모듈화로 인해 전체적인 코드의 가독성이 좋아집니다.

그리고 프로그램에 문제가 발생하거나 기능의 변경이 필요할 때도 손쉽게 유지보수를 할 수 있게 됩니다.

 

메소드에 대한 더 자세한 사항은 자바 메소드 수업과 메소드의 구분 수업에서 확인할 수 있습니다.

 

자바 메소드 수업 확인 =>

자바 메소드의 구분 수업 확인 =>

생성자(constructor)
클래스를 가지고 객체를 생성하면, 해당 객체는 메모리에 즉시 생성됩니다.

하지만 이렇게 생성된 객체는 모든 인스턴스 변수가 아직 초기화되지 않은 상태입니다.

 

따라서 자바에서는 객체의 생성과 동시에 인스턴스 변수를 원하는 값으로 초기화할 수 있는 생성자(constructor)라는 메소드를 제공합니다.

자바에서 생성자(constructor)의 이름은 해당 클래스의 이름과 같아야 합니다.

즉, Car 클래스의 생성자는 Car()가 됩니다.

 

생성자에 대한 더 자세한 사항은 자바 생성자 수업에서 확인할 수 있습니다.

 

자바 생성자 수업 확인 =>