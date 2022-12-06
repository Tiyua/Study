패키지
패키지(package)
자바에서 패키지(package)란 클래스와 인터페이스의 집합을 의미합니다.

이렇게 서로 관련이 있는 클래스나 인터페이스를 함께 묶음으로써 파일을 효율적으로 관리할 수 있게 됩니다.

또한, 협업 시 서로 작업한 클래스 사이에서 발생할 수 있는 이름 충돌 문제까지도 패키지를 이용하면 피할 수 있습니다.

 

자바에서 패키지는 물리적으로 하나의 디렉터리를 의미합니다.

따라서 하나의 패키지에 속한 클래스나 인터페이스 파일은 모두 해당 패키지 이름의 디렉터리에 포함되어 있습니다.

이러한 패키지는 다른 패키지를 포함할 수 있으며, 이때 디렉터리의 계층 구조는 점(.)으로 구분됩니다.

 

다음 예제는 자바에서 가장 많이 사용되는 패키지 중 하나인 String 클래스의 패키지 이름입니다.

예제
java.lang.String

 

위의 예제에서 자바의 String 클래스는 java.lang 패키지에 속한 클래스라는 것을 알 수 있습니다.

패키지의 선언
자바에서 패키지를 선언하는 방법은 다음과 같습니다.

문법
package 패키지이름;

 

위와 같은 명령문을 클래스나 인터페이스의 소스 파일에 추가하기만 하면 됩니다.

이때 패키지 이름에는 패키지의 경로까지 포함한 풀 네임을 명시해야 합니다.

이름 없는 패키지(unnamed package)
자바의 모든 클래스는 반드시 하나 이상의 패키지에 포함되어야 합니다.

하지만 자바 컴파일러는 소스 파일에 어떠한 패키지의 선언도 포함되지 않으면, 기본적으로 이름 없는 패키지(unnamed package)에 포함해 컴파일합니다.

따라서 패키지를 명시하지 않은 모든 클래스와 인터페이스는 모두 같은 패키지에 포함되게 됩니다.

import 문
위와 같이 선언한 패키지에 속한 클래스를 다른 파일에서 사용하기 위해서는 클래스 이름 앞에 패키지의 경로까지 포함한 풀 네임을 명시해 사용해야 합니다.

하지만 클래스를 사용할 때마다 매번 이렇게 긴 이름을 사용하는 것은 비효율적이므로, 자바에서는 import 키워드를 별도로 제공하고 있습니다.

 

import 문은 자바 컴파일러에 코드에서 사용할 클래스의 패키지에 대한 정보를 미리 제공하는 역할을 합니다.

따라서 import 문을 사용하면 다른 패키지에 속한 클래스를 패키지 이름을 제외한 클래스 이름만으로 사용할 수 있게 됩니다.

import 문의 선언
자바에서 import 문은 다음과 같이 선언할 수 있습니다.

문법
1. import 패키지이름.클래스이름;

2. import 패키지이름.*;

 

패키지 이름에는 패키지의 경로까지 포함한 풀 네임을 명시해야 합니다.

첫 번째 방법은 해당 패키지의 특정 클래스만을 사용하고자 할 때 사용합니다.

두 번째 방법은 해당 패키지의 모든 클래스를 클래스 이름만으로 사용하고 싶을 때 사용합니다.

import 문의 특징
import 문을 선언할 때 별표(*)를 사용하는 것이 해당 패키지에 포함된 다른 모든 하위 패키지의 클래스까지 포함해 주는 것은 아닙니다.

문법
import java.awt.*;

import java.util.*;

 

즉, 위와 같은 두 개의 import 문을 아래와 같이 하나의 import 문으로 표현할 수는 없습니다.

문법
import java.*;

 

또한, 자바에서는 가장 많이 사용하는 java.lang 패키지에 대해서는 import 문을 사용하지 않아도 클래스 이름만으로 사용할 수 있도록 해주고 있습니다.