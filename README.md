# 스프링 입문
[인프런 강의 - 기록 및 정리] 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술

### 6월 4일(일)
#### 프로젝트 환경 설정
    스프링 프로젝트와 테스트 페이지 생성 후 빌드

    1. Spring Boot는 static과 template 경로에서 welcomePage로 index.html을 먼저 찾는다.
    
    2. 스프링 프로젝트 build 하고 실행하는 방법
        1) 스프링 프로젝트 경로로 이동하여 gradlew.bat 파일을 빌드한다.
            > window의 경우, gradlew.bat clean build
            > macOS의 경우, ./gradlew build
        2) 위의 명령어를 실행하면 /build/libs 경로에 jar 파일이 생성된다.
            > java -jar hello-spring-0.0.1-SNAPSHOT.jar
            > 서버가 실행된다.
            > 브라우저에서 localhost:8080으로 확인!
    
