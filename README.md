# JAVATALK [1조]
- 그린컴퓨터 아카데미 JAVA 풀스택 개발자 과정 이수 중 첫 번째로 진행한 팀 프로젝트. 
- 온라인 채팅 서비스를 최대한 비슷하게 구현할 목적으로 프로젝트를 진행하였음.

- 조원 :
  - 최대진
  - 정영우
  - 박수빈
  - 박선영
  - 강철민
<br/>
각 조원이 구현에 참여한 기능은 소스코드 파일 내에 표시되어 있음.

# 프로젝트 개요
- **프로젝트명** : JAVATALK
- **프로젝트 소개** : 한국에서 가장 많이 쓰이는 메신저인 `카카오톡`과 비슷하게 GUI를 구성하면서, 흔히 사용되는 온라인 채팅 서비스를 구현할 것을 목적으로 프로젝트를 진행하였음.
- **프로젝트 주제 선별 이유** : 프로젝트에 Java Swing GUI를 활용하여 진행해야 하는 조건이 붙어 사용자에게 친숙한 기능이 무엇이 있을까 고민하다가 채팅 서비스를 선택하였음.
- **개발 인원** : 5명.
- **개발 기간** : 2주.


- **주요 기능**
  - `Oracle ODBC`를 활용한 회원가입.
  - 회원가입 시 `아이디 중복체크`.
  - 계정 분실 시 입력한 `이메일로 패스워드 찾기` 기능.
  - 처음으로 방에 입장한 사용자는 `방장` 권한을 부여.
  - 로그인 시 자신이 원하는 `프로필 사진 선택` 가능.
  - 개인적인 이야기를 할 수 있는 `귓속말 기능` 지원.
  - `이모티콘` 사용.
  - `사진 업로드` 기능. (일부 확장자만 가능)
  - 방장에게만 주어지는 `추방` 기능.
  - 방장이 퇴장하였는데 다른 유저가 방에 남아있다면 방장 다음으로 들어온 유저에게 `방장 권한 위임`.
  - `채팅 기록`을 DB에 업로드.

- **개발 언어** 
  - `JAVA`
  
- **개발 환경**
  -  `Windows 10`
  -  `Eclipse` `Intelli J`

- **데이터베이스**
  - `Oracle DB`


# 프로젝트 상세

**주요 사항**
  ## 회원 기능
    - 사용자는 채팅에 참여하기 위해 계정을 생성해야 하며, 아이디는 중복될 수 없음.
    - 사용자는 계정 분실 시 가입정보에 기입한 이메일로 패스워드 찾기를 사용하여 자신의 패스워드를 찾을 수 있음.
    
  ## 로그인 기능
    - 사용자는 가입한 정보를 토대로 로그인하여, 채팅에 참여할 수 있음.
    - 로그인 시 사용자는 자신이 원하는 프로필 사진을 선택하여 채팅에 참여할 수 있음.
    
  ## 채팅 기능 
    - 사용자는 채팅에 입장 시 자신이 제일 첫 번째 이용자라면 방장의 권한을 획득함.
    - 방장의 권한을 가진 사용자는 다른 사용자를 임의로 추방시킬 수 있음.
    - 사용자는 정해진 이모티콘을 클릭하여 이모티콘을 전송할 수 있음.
    - 사용자는 원하는 상대에게 귓속말을 보낼 수 있음.
    - 사용자는 원하는 사진을 채팅으로 전송할 수 있음. (지정된 확장자 파일만 가능)
    
    
# 실제 구동 이미지
  ## 첫 화면 
  ![](https://i.imgur.com/0nEsuYp.png)
  
  ## 회원가입 화면
  ![](https://i.imgur.com/qVo7FgZ.png)
  
  ## 패스워드 찾기 화면 
  ![](https://i.imgur.com/MjP9GiA.png)
  
  ## 채팅창 화면
  ![](https://i.imgur.com/r794mNy.png)
  
  ## 귓속말 기능
  ![](https://i.imgur.com/bEa0mOQ.png)
  
  ## 이모티콘 기능
  ![](https://i.imgur.com/23zM8rm.png)
  
  ## 사진 전송 기능
  ![](https://i.imgur.com/fgWA2va.png)
  ![](https://i.imgur.com/CjatpAj.png)
  
  ## 강퇴 기능
  ![](https://i.imgur.com/PSqCtjx.png)
  
  
