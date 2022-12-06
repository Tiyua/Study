접근 제어자
제어자(modifier)
제어자(modifier)란 클래스와 클래스 멤버의 선언 시 사용하여 부가적인 의미를 부여하는 키워드를 의미합니다.

자바에서 제어자는 접근 제어자(access modifier)와 기타 제어자로 구분할 수 있습니다.

 

기타 제어자는 경우에 따라 여러 개를 함께 사용할 수도 있지만, 접근 제어자를 두 개 이상 같이 사용할 수는 없습니다.

이러한 접근 제어자와 기타 제어자는 조합에 따라 함께 사용할 수 있습니다.

접근 제어자(access modifier)
객체 지향에서 정보 은닉(data hiding)이란 사용자가 굳이 알 필요가 없는 정보는 사용자로부터 숨겨야 한다는 개념입니다.

그렇게 함으로써 사용자는 언제나 최소한의 정보만으로 프로그램을 손쉽게 사용할 수 있게 됩니다.

 

자바에서는 이러한 정보 은닉을 위해 접근 제어자(access modifier)라는 기능을 제공하고 있습니다.

접근 제어자를 사용하면 클래스 외부에서의 직접적인 접근을 허용하지 않는 멤버를 설정하여 정보 은닉을 구체화할 수 있습니다.

 

자바에서는 다음과 같은 네 가지의 접근 제어자를 제공합니다.

 

1. private

2. public

3. default

4. protected

private 접근 제어자
private 접근 제어자를 사용하여 선언된 클래스 멤버는 외부에 공개되지 않으며, 외부에서는 직접 접근할 수 없습니다.

즉, 자바 프로그램은 private 멤버에 직접 접근할 수 없으며, 해당 객체의 public 메소드를 통해서만 접근할 수 있습니다.

따라서 private 멤버는 public 인터페이스를 직접 구성하지 않고, 클래스 내부의 세부적인 동작을 구현하는 데 사용됩니다.

 

다음 그림은 클래스의 private 멤버에 접근할 수 있는 영역을 보여줍니다.

 

private

 

다음 예제처럼 private 멤버는 해당 멤버를 선언한 클래스에서만 접근할 수 있습니다.

같은 클래스만 접근 허용
public class SameClass {

    private String var = "같은 클래스만 허용"; // private 필드

    private String getVar() {                  // private 메소드

        return this.var;

    }

}

public 접근 제어자
public 접근 제어자를 사용하여 선언된 클래스 멤버는 외부로 공개되며, 해당 객체를 사용하는 프로그램 어디에서나 직접 접근할 수 있습니다.

자바 프로그램은 public 메소드를 통해서만 해당 객체의 private 멤버에 접근할 수 있습니다.

따라서 public 메소드는 private 멤버와 프로그램 사이의 인터페이스(interface) 역할을 수행한다고 할 수 있습니다.

 

다음 그림은 클래스의 public 멤버에 접근할 수 있는 영역을 보여줍니다.

 

public

 

자바에서 public 멤버는 프로그램 어디에서 누구나 접근할 수 있습니다.

누구나 접근 허용
public class Everywhere {

    public String var = "누구든지 허용"; // public 필드

    public String getVar() {             // public 메소드

        return this.var;

    }

}

default 접근 제어
자바에서는 클래스 및 클래스 멤버의 접근 제어의 기본값으로 default 접근 제어를 별도로 명시하고 있습니다.

이러한 default를 위한 접근 제어자는 따로 존재하지 않으며, 접근 제어자가 지정되지 않으면 자동적으로 default 접근 제어를 가지게 됩니다.

default 접근 제어를 가지는 멤버는 같은 클래스의 멤버와 같은 패키지에 속하는 멤버에서만 접근할 수 있습니다.

 

다음 그림은 클래스의 default 멤버에 접근할 수 있는 영역을 보여줍니다.

 

default

 

다음 예제처럼 default 멤버는 같은 패키지에 속하는 클래스에서만 접근할 수 있습니다.

같은 패키지만 접근 허용
package test;

 

public class SamePackage {

    String sameVar = "같은 패키지는 허용"; // default 필드

}

같은 클래스도 접근 허용
package test;

 

public class SameClass {

    String var = "다른 패키지는 접근 불가"; // default 필드

    public static void main(String[] args) {

        SamePackage sp = new SamePackage();

        System.out.println(sp.sameVar);     // 같은 패키지는 허용

    }

}

protected 접근 제어자
자바 클래스는 private 멤버로 정보를 은닉하고, public 멤버로 사용자나 프로그램과의 인터페이스를 구축합니다.

여기에 부모 클래스(parent class)와 관련된 접근 제어자가 하나 더 존재합니다.

protected 멤버는 부모 클래스에 대해서는 public 멤버처럼 취급되며, 외부에서는 private 멤버처럼 취급됩니다.

 

클래스의 protected 멤버에 접근할 수 있는 영역은 다음과 같습니다.

 

1. 이 멤버를 선언한 클래스의 멤버

2. 이 멤버를 선언한 클래스가 속한 패키지의 멤버

3. 이 멤버를 선언한 클래스를 상속받은 자식 클래스(child class)의 멤버

 

다음 그림은 클래스의 protected 멤버에 접근할 수 있는 영역을 보여줍니다.

 

protected

 

다음 예제처럼 protected 멤버는 같은 패키지에 속하는 클래스와 다른 패키지에 속하는 자식 클래스에서만 접근할 수 있습니다.

같은 패키지는 접근 허용
package test;

 

public class SameClass {

    protected String sameVar = "다른 패키지에 속하는 자식 클래스까지 허용"; // protected 필드

}

다른 패키지에 속하는 자식 클래스도 접근 허용
package test.other;

import test.SameClass; // test 패키지의 SameClass 클래스를 불러들여 포함시킴.

 

public class ChildClass extends SameClass {

    public static void main(String[] args) {

        SameClass = new SameClass();

        System.out.println(sp.sameVar); // 다른 패키지에 속하는 자식 클래스까지 허용

    }

}

 

부모 클래스에 대한 더 자세한 사항은 자바 상속 수업에서 확인할 수 있습니다.

 

자바 상속 수업 확인 =>

접근 제어자의 접근 범위
자바에서 접근 제어자의 접근 범위가 보다 많은 제어자부터 적은 제어자 순으로 나열하면 다음과 같습니다.

 

public > protected > default > private

 

이러한 접근 제어자의 접근 범위를 표로 표현하면 다음과 같습니다.

접근 제어자	같은 클래스의 멤버	같은 패키지의 멤버	자식 클래스의 멤버	그 외의 영역
public	○	○	○	○
protected	○	○	○	X
default	○	○	X	X
private	○	X	X	X
 

자바에서는 클래스나 멤버를 선언할 때, 접근을 허용할 범위에 맞는 접근 제어자를 선택하는 것이 매우 중요합니다.