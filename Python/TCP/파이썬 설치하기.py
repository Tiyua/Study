"""
파이썬 설치하기

파이썬 3.X 버전

파이썬은 공식적으로 2.X 버전과 3.X 버전의 두가지 버전으로 관리되고 있습니다.
3.X 버전에서는 모든 변수가 객체로 처리되는 등 많은 변화가 있었지만, 이 두 버전의 가장 큰 차이점은 바로 호환성입니다.
지금까지 많이 사용되었던 파이썬 2.X 버전을 기준으로 개발된 다양한 라이브러리를 3.X 버전에서는 사용하지 못하는 경우가 많아 많은 개발자들이 파이썬 2.X 버전을 고집하는 경우가 있었습니다.
하지만 현재는 유명한 라이브러리들이 3.X 버전도 지원하도록 많이 업데이트되었으며, 앞으로의 유지보수를 생각하여 우리는 3.6 버전을 기준으로 설명합니다.
파이썬은 www.python.org에 접속하여 다운로드 받을 수 있습니다.
Downloads 탭에서 가장 최신 버전인 Python 3.X를 선택하고 다운로드합니다.

PyCharm 설치하기

파이썬은 그 자체로 스크립트 언어이므로 앞서 설명한 파이썬 설치를 완료했다면 바로 실행이 가능합니다.
하지만 우리는 초보자니까 우리를 도와줄 무언가가 필요합니다.
IDE란 Integrated Development Environment의 약자로 통합 개발 환경이라는 의미입니다.
IDE는 작성된 코드가 해당 프로그래밍 언어의 문법에 맞는지, 또는 코드가 잘못되어 에러가 발생하는지 등을 미리 자동으로 검사하여 사용자에게 알려줍니다.
PyCharm은 파이썬을 지원하는 IDE로 파이썬 사용자들에게 많은 사랑을 받고 있는 통합 개발 환경입니다.
PyCharm Community 버전은 개인이 자유롭게 사용할 수 있는 오픈 소스입니다.
www.jetbrains.com/pycharm으로 접속하여 PyCharm Community 버전을 다운로드 합니다.

파이썬과 인사하기

PyCharm을 실행하고 난 뒤, 좌측 상단의 메뉴들 중 File > New Project 를 선택하여 새로운 프로젝트를 만들어봅시다.
프로젝트의 이름은 Ch1 입니다.
두 번째 칸의 인터프리터(Interpreter)는 앞서 파이썬을 설치한 경로를 선택하여 python.exe 파일을 선택해줍니다.
새로운 프로젝트가 생성되면 프로젝트 위에 마우스를 올려놓고 우클릭한 후 New > Python File 을 선택하여 새로운 파이썬 파일을 생성할 수 있습니다.
파일명을 hello로 하여 새로운 파이썬 파일을 생성해봅시다.
엔터키를 누르면 hello.py가 프로젝트 Ch1 안에 생성된 것을 확인할 수 있습니다.
여기까지 잘 따라오셨다면 우측에 빈 화면이 나올 것입니다.
우측 빈 화면에 아래와 같은 코드를 작성해봅시다.
"""

"""
예제
"""

print("Hello World")

""" 
코드를 작성한 뒤에 F8 키를 누르고 방금 작성한 파이썬 파일을 선택하면 실행 결과가 아래에 나타납니다.
"""

"""
결과
"""

#Hello World
